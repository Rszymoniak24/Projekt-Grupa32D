package com.example.p0yerb4ny.project_views;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by P0YERB4NY on 09.05.2017.
 */

public class MySQLite extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    public MySQLite(Context context) {
        super(context, "cwiczenieDB", null, DATABASE_VERSION);

    }
    @Override
    public void onCreate(SQLiteDatabase
                                 database) {
        String DATABASE_CREATE = "create table cwiczenie " +
                        "(_id integer primary key autoincrement," +
                        "nazwaCwiczenia text not null," +
                        "iloscPowtorzen real not null," +
                        "iloscSerii real not null);";
        database.execSQL(DATABASE_CREATE);
        dataInit(database);
    }



    private void dataInit(SQLiteDatabase db) {
        dodaj_init(new Cwiczenie("Wyciskanie na ławce skośnej", 3 ,15),db);
        dodaj_init(new Cwiczenie("Uginanie przedramion ze sztangą siedząc na modlitewniku", 4 ,15),db);
        dodaj_init(new Cwiczenie("Naprzemienne uginanie przedramion stojąc", 4 ,12),db);
        dodaj_init(new Cwiczenie("Unoszenie hantli bokiem w opadzie lub przyciąganie sznurkami na wyciągu w opadzie", 3 ,15),db);
        dodaj_init(new Cwiczenie("Unoszenie barków ze sztangą lub hantlami", 3 ,15),db);
        dodaj_init(new Cwiczenie("Ściąganie zza głowy siedząc na maszynie lub drążka na wyciągu stojąc", 3 ,15),db);
        dodaj_init(new Cwiczenie("Podciąganie sztangielki jednorącz w opadzie", 3 ,15),db);
        dodaj_init(new Cwiczenie("Wiosłowanie siedząc na wyciągu", 3 ,15),db);
        dodaj_init(new Cwiczenie("Ściąganie drążka z wyciągu przed głową (szeroki nachwyt lub podciąganie się)", 3 ,15),db);
        dodaj_init(new Cwiczenie("Wyciskanie francuskie leżąc lub siedząc", 3 ,15),db);
        dodaj_init(new Cwiczenie("Wznosy ramion bokiem z hantlami", 3 ,15),db);
        dodaj_init(new Cwiczenie("Wyciskanie na suwnicy siedząc przed głową", 3 ,15),db);
        dodaj_init(new Cwiczenie("Wypychanie na maszynie (uchwyt dolny)", 3 ,15),db);
        dodaj_init(new Cwiczenie("Rozpiętki na maszynie", 3 ,15),db);
        dodaj_init(new Cwiczenie("Prostowanie nóg na maszynie", 3 ,15),db);
        dodaj_init(new Cwiczenie("Podciąganie nóg leżąc na maszynie", 3 ,15),db);

    }
        @Override
    public void onUpgrade(SQLiteDatabase db,
                          int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS cwiczenie");
        onCreate(db);
    }

    public void dodaj(Cwiczenie c){
        SQLiteDatabase db =
                this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("nazwaCwiczenia", c.getNazwaCwiczenia());
        values.put("iloscPowtorzen", c.getIloscPowtorzen());
        values.put("iloscSerii", c.getIloscSerii());
        db.insert("cwiczenie", null, values);
    }

    public void dodaj_init(Cwiczenie c, SQLiteDatabase db) {
        ContentValues values = new ContentValues();
        values.put("nazwaCwiczenia", c.getNazwaCwiczenia());
        values.put("iloscPowtorzen", c.getIloscPowtorzen());
        values.put("iloscSerii", c.getIloscSerii());
        db.insert("cwiczenie", null, values);

    }

    public void usun(String id) {
        SQLiteDatabase db =
                this.getWritableDatabase();
        db.delete("cwiczenie", "_id = ?",
                new String[] { id });
        db.close();
    }

    public int aktualizuj(Cwiczenie c) {
        SQLiteDatabase db =
                this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("nazwaCwiczenia", c.getNazwaCwiczenia());
        values.put("iloscPowtorzen", c.getIloscPowtorzen());
        values.put("iloscSerii", c.getIloscSerii());
        int i = db.update("cwiczenie", values, "_id = ?", new String[]{String.valueOf(c.getId())});

        db.close();
        return i;
    }

    public Cwiczenie pobierz(int id){
        SQLiteDatabase db =               this.getReadableDatabase();
        Cursor cursor = db.query("cwiczenie", //a. table name
                        new String[] { "_id",
                                "nazwaCwiczenia", "iloscPowtorzen", "iloscSerii"}, // b.column names
                        " _id = ?", // c. selections
                        new String[] {
                                String.valueOf(id) }, // d. selections args
                        null, // e. group by
                        null, // f. having
                        null, // g. order by
                        null); // h. limit
        if (cursor != null)
            cursor.moveToFirst();
        Cwiczenie c = new Cwiczenie(cursor.getString(1), cursor.getInt(2), cursor.getInt(3));
        c.setId(Integer.parseInt(cursor.getString(0)));
        return c;

    }

    public Cursor lista(){
        SQLiteDatabase db =
                this.getReadableDatabase();
        return db.rawQuery("Select * from cwiczenie",null);
    }



}
