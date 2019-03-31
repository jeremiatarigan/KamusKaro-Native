package com.example.a10.kamuskaro.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.example.a10.kamuskaro.Model.Kamus;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteAssetHelper{

    private static final String DB_NAME="kamus.db";
    private static final int DB_VER=1;


    public Database(Context context) {

        super(context, DB_NAME, null, DB_VER);
    }

    public List<Kamus> getKamus ()
    {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"id","Bahasaindonesia","Bahasakaro"};
        String tableName = "Kamuskaro";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db,sqlSelect,null,null,null,null,null);
        List<Kamus> result = new ArrayList<>();
        if (cursor.moveToFirst())
        {
            do {
                Kamus kamus = new Kamus();
                kamus.setId(cursor.getInt(cursor.getColumnIndex("id")));
                kamus.setBahasaindonesia(cursor.getString(cursor.getColumnIndex("Bahasaindonesia")));
                kamus.setBahasakaro(cursor.getString(cursor.getColumnIndex("Bahasakaro")));


                result.add(kamus);
            }while (cursor.moveToNext());
        }return result;
    }

    public List<String> getBahasaindonesia()
    {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"Bahasaindonesia"};
        String tableName = "Kamuskaro";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<String> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                result.add(cursor.getString(cursor.getColumnIndex("Bahasaindonesia")));
            } while (cursor.moveToNext());

        }return result;
    }

    public List<Kamus> getKamusByBahasaindonesia (String BahasaIndonesia)
    {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlSelect = {"id","Bahasaindonesia","Bahasakaro"};
        String tableName = "Kamuskaro";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db,sqlSelect,"Bahasaindonesia LIKE ?",new String[]{"%"+BahasaIndonesia+"%"},null,null,null);
        List<Kamus> result = new ArrayList<>();
        if (cursor.moveToFirst())
        {
            do {
                Kamus kamus = new Kamus();
                kamus.setId(cursor.getInt(cursor.getColumnIndex("id")));
                kamus.setBahasaindonesia(cursor.getString(cursor.getColumnIndex("Bahasaindonesia")));
                kamus.setBahasakaro(cursor.getString(cursor.getColumnIndex("Bahasakaro")));

                result.add(kamus);
            }while (cursor.moveToNext());
        }return result;
    }

}
