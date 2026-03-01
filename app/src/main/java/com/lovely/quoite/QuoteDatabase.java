package com.lovely.quoite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Random;
public class QuoteDatabase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "quotes.db";
    private static final int DATABASE_VERSION = 2;
    public QuoteDatabase(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
}
@Override
public void onCreate(SQLiteDatabase db) {
    db.execSQL("CREATE TABLE quotes ("+
            "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
            " text TEXT)");
    db.execSQL("CREATE TABLE favorites ("
            +"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
            " text TEXT)");
    insertQuotes(db);
}
public void insertQuotes(SQLiteDatabase db) {
    db.execSQL("INSERT INTO quotes (text) VALUES ('Push yourself beyond your limits.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Dream big and work hard.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success starts with self belief.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay focused on your goals.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Discipline creates freedom.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Consistency builds success.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Small progress is still progress.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Work hard in silence.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Make yourself proud.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Action creates results.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Focus on improvement daily.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Your effort shapes your future.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay hungry for growth.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Push harder than yesterday.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Never give up easily.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Turn obstacles into opportunities.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Believe in your potential.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay positive under pressure.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Dream it and achieve it.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success requires sacrifice.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Hard work beats excuses.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Your mindset matters most.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay disciplined every day.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Great things take time.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Learn from every failure.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay committed to excellence.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Build habits that build you.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Progress over perfection.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Your only limit is you.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Be fearless in action.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Create your own opportunities.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay consistent and confident.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Rise above negativity.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Make every day count.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success begins with action.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay strong and focused.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Keep moving forward.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Your dreams deserve effort.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay motivated always.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Be better than yesterday.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success is built daily.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay hungry for success.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Focus fuels achievement.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Dreams demand dedication.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Your grind will pay off.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay patient and persistent.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Effort creates excellence.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Turn pain into power.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success loves preparation.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay focused stay fearless.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Every expert was once a beginner.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Push through the struggle.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Your future depends on today.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Small steps lead to big wins.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay committed to your dreams.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Hard work compounds over time.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Make progress daily.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay resilient and rise.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Action beats intention.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Believe and achieve.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success requires discipline.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay loyal to your goals.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Work smart and hard.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Build your future now.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay unstoppable.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Growth begins outside comfort zones.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Chase greatness daily.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay bold and brave.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Your potential is endless.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Never doubt your strength.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Create the life you want.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Keep striving for more.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success is self made.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay driven by purpose.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Make today productive.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay confident in your path.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Push beyond your fears.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay hungry stay humble.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Commitment creates results.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay focused on solutions.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success begins with self discipline.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay consistent in your efforts.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Hard times build strong people.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Focus on what truly matters.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Dream big act bigger.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Your effort defines your success.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Keep learning keep growing.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Rise and grind daily.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay positive stay powerful.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Push until you succeed.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Discipline beats motivation.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay dedicated to improvement.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Your journey is unique.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Turn dreams into plans.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay patient trust the process.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Never stop believing.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay fearless in challenges.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success demands consistency.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Make every effort count.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Keep your vision clear.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay resilient under pressure.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Your mindset creates reality.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Focus on progress not perfection.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay ambitious always.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Work for your dreams.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay calm stay confident.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Build strength through struggle.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Keep moving no matter what.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success rewards persistence.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay focused stay disciplined.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Your dreams are valid.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Keep pushing your limits.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay inspired every day.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Take action now.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay strong stay steady.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Create momentum daily.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success is earned not given.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay hungry for knowledge.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Make yourself unstoppable.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Keep striving for greatness.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Believe in your inner strength.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay focused on your mission.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Hard work creates opportunity.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Push through every obstacle.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success is a daily decision.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay determined to win.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Make your goals a priority.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay disciplined stay driven.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Growth requires effort.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Never quit too soon.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay consistent with your habits.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success comes to those who work.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Build your legacy today.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay positive through setbacks.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Keep your standards high.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Dream bigger every day.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay committed to your growth.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Effort turns dreams into reality.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Focus on becoming better.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay resilient stay ready.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success follows preparation.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Push beyond comfort.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay hungry for improvement.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Keep building your future.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay confident in challenges.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success grows with persistence.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Take control of your life.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay focused on results.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Work hard dream bigger.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay patient stay powerful.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success is built with courage.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Keep your momentum strong.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay fearless stay focused.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Every day is a new chance.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay motivated from within.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Push until you are proud.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Success loves hard workers.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Stay driven stay dedicated.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Keep chasing your vision.');");
    db.execSQL("INSERT INTO quotes (text) VALUES ('Your dedication will pay off.');");
}
public void addToFavorites(String quote) {
    SQLiteDatabase db = this.getWritableDatabase();
    Cursor cursor = db.rawQuery("SELECT * FROM favorites WHERE text=?",
            new String[]{quote});
    if (cursor.getCount() == 0) {
        db.execSQL("INSERT INTO favorites (text) VALUES (?)",
                new Object[]{quote});
    }
    cursor.close();
    android.util.Log.d("DB_DEBUG","Inserted:"+ quote);
}
public void removeFromFavorites(String quote) {
        SQLiteDatabase db = this.getWritableDatabase();
    db.delete("favorites", "text=?", new String[]{quote});
}
@Override
public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS quotes");
    db.execSQL("DROP TABLE IF EXISTS favorites");
    onCreate(db);
}
public String getRandomQuote() {
    SQLiteDatabase db = this.getReadableDatabase();
    Cursor cursor = db.rawQuery(
            "SELECT text FROM quotes ORDER BY RANDOM() LIMIT 1",
            null);
    if (cursor.moveToFirst()){
        String quote = cursor.getString(0);
        cursor.close();
        return quote;
    }
    cursor.close();
    return "No Quote Found";
}


    public boolean isFavorite(String quote) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM favorites WHERE text=?",
                new String[]{quote});
        boolean exists = cursor.getCount() > 0;
        cursor.close();
        return exists;
    }
    public Cursor getAllFavorites() {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("SELECT * FROM favorites", null);
    }
    public void addQuoteIfNotExist(String quote) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM quotes WHERE text=?",
                new String[]{quote});
        if(cursor.getCount() == 0) {
            db.execSQL("INSERT INTO quotes (text) VALUES (?)",
                    new Object[]{quote});
        }
        cursor.close();
}
}



