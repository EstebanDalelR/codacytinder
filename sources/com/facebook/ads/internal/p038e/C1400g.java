package com.facebook.ads.internal.p038e;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.facebook.ads.internal.e.g */
public abstract class C1400g {
    /* renamed from: j */
    protected final C1396d f3815j;

    protected C1400g(C1396d c1396d) {
        this.f3815j = c1396d;
    }

    /* renamed from: a */
    public static String m4862a(String str, C1393b[] c1393bArr) {
        StringBuilder stringBuilder = new StringBuilder("SELECT ");
        for (int i = 0; i < c1393bArr.length - 1; i++) {
            stringBuilder.append(c1393bArr[i].f3785b);
            stringBuilder.append(", ");
        }
        stringBuilder.append(c1393bArr[c1393bArr.length - 1].f3785b);
        stringBuilder.append(" FROM ");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m4863a(String str, C1393b[] c1393bArr, C1393b c1393b) {
        StringBuilder stringBuilder = new StringBuilder(C1400g.m4862a(str, c1393bArr));
        stringBuilder.append(" WHERE ");
        stringBuilder.append(c1393b.f3785b);
        stringBuilder.append(" = ?");
        return stringBuilder.toString();
    }

    /* renamed from: c */
    private String mo1734c() {
        C1393b[] b = mo1733b();
        if (b.length < 1) {
            return null;
        }
        String str = "";
        for (int i = 0; i < b.length - 1; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(b[i].m4839a());
            stringBuilder.append(", ");
            str = stringBuilder.toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(b[b.length - 1].m4839a());
        return stringBuilder2.toString();
    }

    /* renamed from: a */
    public abstract String mo1732a();

    /* renamed from: a */
    public void m4866a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CREATE TABLE ");
        stringBuilder.append(mo1732a());
        stringBuilder.append(" (");
        stringBuilder.append(mo1734c());
        stringBuilder.append(")");
        sQLiteDatabase.execSQL(stringBuilder.toString());
    }

    /* renamed from: b */
    public void m4867b(SQLiteDatabase sQLiteDatabase) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DROP TABLE IF EXISTS ");
        stringBuilder.append(mo1732a());
        sQLiteDatabase.execSQL(stringBuilder.toString());
    }

    /* renamed from: b */
    public abstract C1393b[] mo1733b();

    /* renamed from: e */
    public void m4869e() {
    }

    /* renamed from: f */
    protected SQLiteDatabase m4870f() {
        return this.f3815j.m4847a();
    }
}
