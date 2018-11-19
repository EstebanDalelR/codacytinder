package com.leanplum.p069a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.leanplum.a.ae */
public final class ae {
    /* renamed from: a */
    static boolean f7900a = false;
    /* renamed from: b */
    private static final String f7901b = "__leanplum.db";
    /* renamed from: c */
    private static final int f7902c = 1;
    /* renamed from: d */
    private static final String f7903d = "event";
    /* renamed from: e */
    private static final String f7904e = "data";
    /* renamed from: f */
    private static final String f7905f = "rowid";
    /* renamed from: g */
    private static SQLiteDatabase f7906g;
    /* renamed from: h */
    private static af f7907h;
    /* renamed from: i */
    private static ContentValues f7908i = new ContentValues();

    /* renamed from: a */
    public static void m9465a(Context context) {
        if (f7906g != null) {
            ao.m9516a("Database is already initialized.");
            return;
        }
        try {
            if (f7907h == null) {
                f7907h = new af(context);
            }
            f7906g = f7907h.getWritableDatabase();
        } catch (Context context2) {
            ae.m9467a("Cannot create database.", context2);
        }
    }

    /* renamed from: a */
    static void m9466a(String str) {
        if (f7906g != null) {
            f7908i.put("data", str);
            try {
                f7906g.insert(f7903d, null, f7908i);
                f7900a = null;
            } catch (String str2) {
                ae.m9467a("Unable to insert event to database.", str2);
            }
            f7908i.clear();
        }
    }

    /* renamed from: a */
    static List<Map<String, Object>> m9464a(int i) {
        Throwable th;
        List<Map<String, Object>> arrayList = new ArrayList();
        if (f7906g == null) {
            return arrayList;
        }
        Cursor cursor = null;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i);
            i = f7906g.query(f7903d, new String[]{"data"}, null, null, null, null, "rowid ASC", stringBuilder.toString());
            try {
                f7900a = false;
                while (i.moveToNext()) {
                    arrayList.add(ab.m9453a(new JSONObject(i.getString(i.getColumnIndex("data")))));
                }
                if (i != 0) {
                    i.close();
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = i;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            i = th3;
            ae.m9467a("Unable to get events from the table.", i);
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: b */
    static void m9469b(int i) {
        if (f7906g != null) {
            try {
                SQLiteDatabase sQLiteDatabase = f7906g;
                String str = f7903d;
                StringBuilder stringBuilder = new StringBuilder("rowid in (select rowid from event ORDER BY rowid ASC LIMIT ");
                stringBuilder.append(i);
                stringBuilder.append(")");
                sQLiteDatabase.delete(str, stringBuilder.toString(), null);
                f7900a = false;
            } catch (int i2) {
                ae.m9467a("Unable to delete events from the table.", i2);
            }
        }
    }

    /* renamed from: a */
    static long m9463a() {
        long queryNumEntries;
        Throwable th;
        if (f7906g == null) {
            return 0;
        }
        try {
            queryNumEntries = DatabaseUtils.queryNumEntries(f7906g, f7903d);
            try {
                f7900a = false;
            } catch (Throwable th2) {
                th = th2;
                ae.m9467a("Unable to get a number of rows in the table.", th);
                return queryNumEntries;
            }
        } catch (Throwable th3) {
            th = th3;
            queryNumEntries = 0;
            ae.m9467a("Unable to get a number of rows in the table.", th);
            return queryNumEntries;
        }
        return queryNumEntries;
    }

    /* renamed from: a */
    private static void m9467a(String str, Throwable th) {
        ao.m9516a(str, th);
        if (!f7900a) {
            f7900a = true;
            bo.m9608a(th);
        }
    }
}
