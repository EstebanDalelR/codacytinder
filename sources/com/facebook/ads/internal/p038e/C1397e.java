package com.facebook.ads.internal.p038e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.facebook.ads.internal.e.e */
public class C1397e extends SQLiteOpenHelper {
    /* renamed from: a */
    private final C1396d f3805a;

    public C1397e(Context context, C1396d c1396d) {
        super(context, "ads.db", null, 3);
        if (c1396d == null) {
            throw new IllegalArgumentException("AdDatabaseHelper can not be null");
        }
        this.f3805a = c1396d;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (C1400g a : this.f3805a.m4852c()) {
            a.m4866a(sQLiteDatabase);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        for (C1400g c1400g : this.f3805a.m4852c()) {
            c1400g.m4867b(sQLiteDatabase);
            c1400g.m4866a(sQLiteDatabase);
        }
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON;");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 2 && i2 == 3) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS crashes");
        }
    }
}
