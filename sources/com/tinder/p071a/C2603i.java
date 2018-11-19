package com.tinder.p071a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.SqlBrite;
import com.tinder.managers.ManagerApp;
import com.tinder.utils.ad;
import javax.inject.Inject;
import rx.schedulers.Schedulers;

/* renamed from: com.tinder.a.i */
public class C2603i {
    /* renamed from: b */
    private static final C2603i f8142b = new C2603i();
    @Inject
    /* renamed from: a */
    C2602d f8143a;
    /* renamed from: c */
    private final SQLiteDatabase f8144c = this.f8145d.b();
    /* renamed from: d */
    private final BriteDatabase f8145d = SqlBrite.a(C3866j.f12121a).a(this.f8143a, Schedulers.io());

    private C2603i() {
        ad.m10189a();
        ManagerApp.m14858e().inject(this);
    }

    /* renamed from: a */
    public BriteDatabase m9770a() {
        return this.f8145d;
    }

    @NonNull
    /* renamed from: b */
    public static C2603i m9766b() {
        return f8142b;
    }

    /* renamed from: c */
    SQLiteDatabase m9777c() {
        return this.f8144c;
    }

    /* renamed from: a */
    boolean m9772a(@NonNull String str) {
        Throwable th;
        boolean z = false;
        Cursor cursor = null;
        try {
            str = this.f8144c.query(str, new String[]{"*"}, null, null, null, null, null);
            if (str != null) {
                try {
                    if (str.getCount() != 0) {
                        z = true;
                    }
                } catch (Exception e) {
                    Exception exception = e;
                    cursor = str;
                    str = exception;
                    try {
                        ad.m10197c(str.getMessage());
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = str;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (str != null) {
                str.close();
            }
            return z;
        } catch (Exception e2) {
            str = e2;
            ad.m10197c(str.getMessage());
            if (cursor != null) {
                cursor.close();
            }
            return false;
        }
    }

    @Nullable
    /* renamed from: b */
    synchronized Cursor m9776b(@NonNull String str) {
        return m9765b(str, null);
    }

    @Nullable
    /* renamed from: a */
    synchronized Cursor m9769a(@NonNull String str, String str2) {
        return m9764a(str, null, null, str2, null);
    }

    @Nullable
    /* renamed from: b */
    private synchronized Cursor m9765b(@NonNull String str, String str2) {
        return m9764a(str, str2, null, null, null);
    }

    @Nullable
    /* renamed from: a */
    private synchronized Cursor m9764a(@NonNull String str, String str2, String[] strArr, String str3, String str4) {
        if (!this.f8144c.isOpen()) {
            return null;
        }
        return this.f8144c.query(str, new String[]{"*"}, str2, strArr, null, null, str3, str4);
    }

    /* renamed from: a */
    void m9771a(@NonNull String str, @NonNull String... strArr) {
        this.f8144c.beginTransaction();
        try {
            this.f8144c.delete(str, null, null);
            for (String delete : strArr) {
                this.f8144c.delete(delete, null, null);
            }
            this.f8144c.setTransactionSuccessful();
        } finally {
            this.f8144c.endTransaction();
        }
    }

    /* renamed from: a */
    synchronized boolean m9773a(String str, ContentValues contentValues) {
        long j;
        j = 0;
        if (this.f8144c.isOpen()) {
            j = this.f8145d.a(str, contentValues, 5);
        }
        return j != -1 ? true : null;
    }

    /* renamed from: a */
    final boolean m9775a(String str, ContentValues contentValues, String str2, String str3) {
        BriteDatabase briteDatabase = this.f8145d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(" = ?");
        str2 = briteDatabase.a(str, contentValues, stringBuilder.toString(), new String[]{str3});
        if ((str2 <= null ? this.f8145d.a(str, contentValues, 5) : -1) > 0) {
            return true;
        }
        if (str2 > null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    synchronized boolean m9774a(String str, ContentValues contentValues, String str2) {
        boolean z;
        z = false;
        if (this.f8145d.a(str, contentValues, str2, new String[0]) > null) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    synchronized int m9768a(String str, String str2, String str3) {
        int i;
        i = 0;
        if (this.f8144c.isOpen()) {
            SQLiteDatabase sQLiteDatabase = this.f8144c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append('=');
            stringBuilder.append('\'');
            stringBuilder.append(str3);
            stringBuilder.append('\'');
            i = sQLiteDatabase.delete(str, stringBuilder.toString(), null);
            str2 = new StringBuilder();
            str2.append("deleted ");
            str2.append(i);
            str2.append(" from table ");
            str2.append(str);
            ad.m10190a(str2.toString());
        } else {
            ad.m10195b("DB closed, nothing deleted");
        }
        return i;
    }
}
