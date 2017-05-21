package com.example.p0yerb4ny.project_views;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * Created by Łukasz on 2017-05-11.
 */

public class MySQLite extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;

    // private static final String DATABASE_NAME ="TreningDB";
    public MySQLite(Context context) {
        super(context, "TreningDB", null, DATABASE_VERSION);
    }

}
    @Override
    public void onCreate(SQLiteDatabase
                                     database) {

        String CREATE_TRENING_TABLE = "CREATE TABLE Trening ( "
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "rodzajTreningu TEXT, "
                + "opisTreningu TEXT )";
// create books table
        database.execSQL(CREATE_TRENING_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,
                          int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS Trening");

        this.onCreate(db);
    }

public void addTrening(Trening trening){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_RODZAJTRENINGU, trening.getrodzajTreningu());
        values.put(KEY_OPISTRENINGU, book.getopisTreningu());

        db.insert(TABLE_TRENING,null,values);

        db.close();
        }

//aktualizacja
public int updateTrening(Trening trening) {

    SQLiteDatabase db = this.getWritableDatabase();




    this.nazwaTreningu = nazwaTreningu;
    this.rodzajTreningu = rodzajTreningu;
    this.opisTreningu = opisTreningu;

    ContentValues values = new ContentValues();
    values.put("nazwaTreningu", trening.getnazwaTreningu());
    values.put("rodzajTreningu", trening.getrodzajTreningu());
    values.put("opisTreningu", trening.getopisTreningu());

    int i = db.update(TABLE_BOOKS,
            values,
            KEY_ID+" = ?",
            new String[] {
                    String.valueOf(trening.getId()) }); //selection args

    db.close();
    return i;
}
//usuwanie trenigu
public void deleteTrening(Trening trening) {

    SQLiteDatabase db =
            this.getWritableDatabase();

    db.delete(TABLE_TRENING, //table name
            KEY_ID+" = ?", // selections
            new String[] {
                    String.valueOf(trening.getId()) }); //selections args

    db.close();
}

