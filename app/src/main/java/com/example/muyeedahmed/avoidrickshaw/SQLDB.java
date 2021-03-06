package com.example.muyeedahmed.avoidrickshaw;

/**
 * Created by Muyeed Ahmed on 10/15/2017.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLDB extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "TML.db";
    public static final String TABLE_NAME = "History";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "TIME";
    public static final String COL_3 = "DISTANCE";
    public static final String COL_4 = "CALORIE";
    public static final String COL_5 = "FARE";
    public static final String COL_6 = "STEP";
    public SQLDB(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT,TIME REAL,DISTANCE REAL, CALORIE REAL,FARE REAL, STEP REAL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String time, String distance, String calorie, String fare, String step) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,time);
        contentValues.put(COL_3,distance);
        contentValues.put(COL_3,calorie);
        contentValues.put(COL_4,fare);
        contentValues.put(COL_5,step);
        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }


}
