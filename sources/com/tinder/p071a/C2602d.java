package com.tinder.p071a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;
import com.tinder.module.ForApplication;
import com.tinder.utils.ad;
import java.util.Arrays;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import p000a.p001a.C0001a;

@Singleton
@Deprecated
/* renamed from: com.tinder.a.d */
public class C2602d extends SQLiteOpenHelper {
    /* renamed from: a */
    private static final String f8134a = C2602d.m9758a(1);
    /* renamed from: b */
    private static final C3864g f8135b = new C3864g();
    /* renamed from: c */
    private static final C3868l f8136c = new C3868l();
    /* renamed from: d */
    private static final C3870m f8137d = new C3870m();
    /* renamed from: e */
    private static final C3863f f8138e = new C3863f();
    /* renamed from: f */
    private static final C3862c f8139f = new C3862c();
    /* renamed from: g */
    private static final C3865h f8140g = new C3865h();
    @ForApplication
    /* renamed from: h */
    private final Context f8141h;

    /* renamed from: d */
    private void m9761d() {
    }

    @Inject
    public C2602d(@ForApplication Context context) {
        super(context, f8134a, null, 2);
        ad.m10189a();
        this.f8141h = context;
    }

    /* renamed from: a */
    public C3868l m9762a() {
        return f8136c;
    }

    /* renamed from: b */
    public C3870m m9763b() {
        return f8137d;
    }

    /* renamed from: a */
    private static void m9759a(@NonNull SQLiteDatabase sQLiteDatabase) {
        ad.m10189a();
        sQLiteDatabase.execSQL(f8135b.mo2630d());
        sQLiteDatabase.execSQL(f8136c.mo2630d());
        sQLiteDatabase.execSQL(f8137d.mo2630d());
        sQLiteDatabase.execSQL(f8138e.mo2630d());
        sQLiteDatabase.execSQL(f8139f.mo2630d());
        sQLiteDatabase.execSQL(f8140g.mo2630d());
    }

    /* renamed from: c */
    public static void m9760c() {
        C0001a.m28c("Resetting database", new Object[0]);
        C2603i.m9766b().m9771a(f8135b.mo2629c(), f8136c.mo2629c(), f8137d.mo2629c(), f8138e.mo2629c(), f8139f.mo2629c(), f8140g.mo2629c());
    }

    public void onCreate(@NonNull SQLiteDatabase sQLiteDatabase) {
        C0001a.m28c("Creating database", new Object[0]);
        m9761d();
        C2602d.m9759a(sQLiteDatabase);
    }

    public void onUpgrade(@NonNull SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Database upgrade from old: ");
        stringBuilder.append(i);
        stringBuilder.append(" to: ");
        stringBuilder.append(i2);
        C0001a.m28c(stringBuilder.toString(), new Object[0]);
        if (i < 2) {
            for (String str : Arrays.asList(new String[]{f8135b.mo2629c(), f8136c.mo2629c(), f8137d.mo2629c(), f8138e.mo2629c(), f8139f.mo2629c(), f8140g.mo2629c()})) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("DROP TABLE IF EXISTS ");
                stringBuilder.append(str);
                sQLiteDatabase.execSQL(stringBuilder.toString());
            }
            C2602d.m9759a(sQLiteDatabase);
        }
    }

    /* renamed from: a */
    private static String m9758a(int i) {
        return String.format(Locale.US, "legacy_tinder-%d.db", new Object[]{Integer.valueOf(i)});
    }
}
