package com.ParkSeryu.munanmunan;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHelper extends SQLiteOpenHelper {
    public MyDBHelper(Context context) {
        super(context, "WitnessDB", null, 1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS meetDay");
        db.execSQL("DROP TABLE IF EXISTS anniversary");
        db.execSQL("DROP TABLE IF EXISTS bucketListDay");
        db.execSQL("DROP TABLE IF EXISTS anniversary_user");
        onCreate(db);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE meetDay (StartDay VARCHAR(8), First VARCHAR(7), Second VARCHAR(7));");
        db.execSQL("CREATE TABLE anniversary (WhatDay VARCHAR(8), WhenDay VARCHAR(10), Dday VARCHAR(10));");
        db.execSQL("CREATE TABLE anniversary_user (WhatDay VARCHAR(8), WhenDay VARCHAR(10), Dday VARCHAR(10), InputDay Date, yearRepeat int);");
        db.execSQL("CREATE TABLE bucketListDay (list VARCHAR(30), clear int, InputDay Date);");
    }
}
