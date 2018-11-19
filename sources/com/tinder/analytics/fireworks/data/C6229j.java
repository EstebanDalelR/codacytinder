package com.tinder.analytics.fireworks.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.tinder.analytics.fireworks.data.j */
public class C6229j extends SQLiteOpenHelper {
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C6229j(Context context) {
        super(context, "fireworks.db", null, 1);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE fireworks (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    event BLOB NOT NULL\n)");
    }
}
