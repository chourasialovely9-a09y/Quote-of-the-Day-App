package com.lovely.quoite;


import android.database.Cursor;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    QuoteDatabase database;
    ArrayList<String> list;
    FavoritesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        recyclerView = findViewById(R.id.recyclerFavorites);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        database = new QuoteDatabase(this);
        list = new ArrayList<>();

        adapter  = new FavoritesAdapter(this, list);
        recyclerView.setAdapter(adapter);
        enableSwipeToDelete();
        loadFavorites();
    }
    @Override
    protected void onResume() {
        super.onResume();
        loadFavorites();
    }


   private void loadFavorites() {
       list.clear();
       Cursor cursor = database.getAllFavorites();

        if (cursor!=null && cursor.moveToFirst()) {
            do {
                String quote = cursor.getString(1);
                list.add(quote);
            } while (cursor.moveToNext());
    }
        if(cursor!=null)
            cursor.close();
        android.util.Log.d("FAV_DEBUG","Total Favorites:"+list.size());
        adapter.notifyDataSetChanged();
}
    private void enableSwipeToDelete(){
        ItemTouchHelper.SimpleCallback simpleCallback =
                new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT){
                @Override
                public boolean onMove(RecyclerView recyclerView,
                                      RecyclerView.ViewHolder viewHolder,
                                      RecyclerView.ViewHolder target) {
                            return false;
                    }
                    @Override
                    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder,
                                         int direction){
                            int position = viewHolder.getAdapterPosition();
                            String quote = list.get(position);
                            database.removeFromFavorites(quote);
                            list.remove(position);
                            adapter.notifyItemRemoved(position);

                }
                };
                new ItemTouchHelper(simpleCallback).attachToRecyclerView(recyclerView);

    }
}


