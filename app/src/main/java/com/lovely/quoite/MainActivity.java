package com.lovely.quoite;

import static android.text.TextUtils.isEmpty;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    TextView tvQuote;
    ImageButton btnHeart, btnShare, btnFavorites;
    boolean isLiked = false;
    QuoteDatabase database;
    String currentQuote = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQuote = findViewById(R.id.tvQuote);
        btnHeart = findViewById(R.id.btnHeart);
        btnShare = findViewById(R.id.btnShare);
        btnFavorites = findViewById(R.id.btnFavorites);

        database = new QuoteDatabase(this);

        loadDailyQuote();

        btnHeart.setOnClickListener(v ->{
                String currentQuote = tvQuote.getText().toString();
                if(isLiked){
                    btnHeart.setImageResource(R.drawable.outline_favorite);
                    btnHeart.setColorFilter(
                            ContextCompat.getColor(this, android.R.color.white)
                    );
                    database.removeFromFavorites(currentQuote);
                    isLiked=false;
                }else{
                    btnHeart.setImageResource(R.drawable.filled_favorite);
                    btnHeart.setColorFilter(
                            ContextCompat.getColor(this, android.R.color.holo_red_light)
                    );
                    database.addToFavorites(currentQuote);
                    isLiked=true;
                }
    });


        btnShare.setOnClickListener(v -> {
            String text = tvQuote.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, currentQuote);
            startActivity(Intent.createChooser(intent, "Share via"));
        });

        btnFavorites.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FavoritesActivity.class);
            startActivity(intent);
        });
    }

    private void loadQuote() {
        tvQuote.setText("Feching quote specially for you .....");
        if (isNetworkAvailable()) {
            fetchOnlineQuote();
        } else {
            loadOfflineQuote();
        }
    }

    private void fetchOnlineQuote() {
        String url = "https://api.quotable.io/random";
        RequestQueue queue = Volley.newRequestQueue(this);

        JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.GET,
                url,
                null,
                response -> {
                    try {
                        currentQuote = response.getString("content");
                        tvQuote.setText(currentQuote);
                        database.addQuoteIfNotExist(currentQuote);
                        updateHeartState();

                    } catch (Exception e) {
                        loadOfflineQuote();
                    }
                },
                error -> loadOfflineQuote()
        );

        queue.add(request);
    }

    private void loadOfflineQuote() {
        currentQuote = database.getRandomQuote();
        tvQuote.setText(currentQuote);
        updateHeartState();
    }

    private void toggleFavorite() {
        if ( currentQuote.isEmpty()) return;

        if(database.isFavorite(currentQuote)){
            database.removeFromFavorites(currentQuote);
            isLiked = false;
        } else {
            database.addToFavorites(currentQuote);
            isLiked = true;
        }

        updateHeartIcon();
    }

    private void updateHeartState() {
        isLiked = database.isFavorite(currentQuote);
        updateHeartIcon();
    }

    private void updateHeartIcon() {
        if (isLiked) {
            btnHeart.setImageResource(R.drawable.filled_favorite);
            btnHeart.setColorFilter(
                    ContextCompat.getColor(this, android.R.color.holo_red_light)
            );
        } else {
            btnHeart.setImageResource(R.drawable.outline_favorite);
            btnHeart.setColorFilter(
                    ContextCompat.getColor(this, android.R.color.white)
            );
        }
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnected();
    }
    private void loadDailyQuote(){
        SharedPreferences preferences = getSharedPreferences("DailyQuote",MODE_PRIVATE);
        String savedDate = preferences.getString("date","");
        String savedQuote = preferences.getString("quote","");
        String todayDate = new SimpleDateFormat("yyyyMMdd", Locale.getDefault())
                .format(new Date());
        if(todayDate.equals(savedDate)&& !savedQuote.isEmpty()){
            tvQuote.setText(savedQuote);
        }else{
            String newQuote;
            if(isNetworkAvailable()){
                newQuote = database.getRandomQuote();
            }else{
                newQuote = database.getRandomQuote();
            }
            tvQuote.setText(newQuote);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("date",todayDate);
            editor.putString("quote",newQuote);
            editor.apply();
        }
    }
}