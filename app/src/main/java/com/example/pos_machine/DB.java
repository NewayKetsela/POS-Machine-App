package com.example.pos_machine;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB extends SQLiteOpenHelper {
    public static final String CODE="code";
    public static final String ITEM="item";
    public static final String UNIT="unit";
    public static final String UNIT_PRICE="unit_price";
    public static final String sale_code="sale_code";
    public DB( Context context) {
        super(context, "PosDB.db", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create Table ItemInformation(CODE TEXT primary key, ITEM TEXT , UNIT INT , UNIT_PRICE TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       db.execSQL("drop Table if exists ItemInformation");
    }





}

