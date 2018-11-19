package com.foursquare.internal.data.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.foursquare.internal.util.C1946h;
import com.foursquare.internal.util.FsLog;
import java.util.ArrayList;
import java.util.List;

public final class DatabaseUtil {

    public interface RowMapper<T> {
        @NonNull
        T map(@NonNull Cursor cursor);
    }

    /* renamed from: a */
    public static void m6661a(@NonNull SQLiteStatement sQLiteStatement, int i, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            sQLiteStatement.bindNull(i);
        } else {
            sQLiteStatement.bindString(i, str);
        }
    }

    /* renamed from: a */
    public static void m6662a(SQLiteStatement sQLiteStatement, int i, boolean z) {
        sQLiteStatement.bindLong(i, z ? 1 : 0);
    }

    /* renamed from: a */
    public static String m6659a(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: b */
    public static boolean m6664b(Cursor cursor, String str) {
        return m6666d(cursor, str) == 1 ? true : null;
    }

    /* renamed from: c */
    public static long m6665c(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: d */
    public static int m6666d(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: e */
    public static double m6667e(Cursor cursor, String str) {
        return cursor.getDouble(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: f */
    public static float m6668f(Cursor cursor, String str) {
        return cursor.getFloat(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: a */
    public static boolean m6663a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Object rawQuery;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("pragma table_info (");
        stringBuilder.append(str);
        stringBuilder.append(")");
        str = stringBuilder.toString();
        Object obj = null;
        try {
            rawQuery = sQLiteDatabase.rawQuery(str, null);
            do {
                try {
                    if (rawQuery.moveToNext() != null) {
                        str = m6659a((Cursor) rawQuery, "name");
                        FsLog.m6800a("DATABASE UTILS", str);
                    } else {
                        C1946h.m6836a(rawQuery);
                        return null;
                    }
                } catch (Exception e) {
                    str = e;
                    obj = rawQuery;
                } catch (Throwable th) {
                    str = th;
                }
            } while (!TextUtils.equals(str, str2));
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(" = ");
            stringBuilder2.append(str2);
            FsLog.m6800a("DATABASE UTILS", stringBuilder2.toString());
            C1946h.m6836a(rawQuery);
            return true;
        } catch (Exception e2) {
            str = e2;
            try {
                FsLog.m6806c("DATABASEUTIL", "Error", str);
                C1946h.m6836a(obj);
                return null;
            } catch (Throwable th2) {
                str = th2;
                rawQuery = obj;
                C1946h.m6836a(rawQuery);
                throw str;
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public static <T> List<T> m6660a(@NonNull Cursor cursor, @NonNull RowMapper<T> rowMapper) {
        try {
            List<T> arrayList = new ArrayList(cursor.getCount());
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                arrayList.add(rowMapper.map(cursor));
            }
            return arrayList;
        } finally {
            cursor.close();
        }
    }
}
