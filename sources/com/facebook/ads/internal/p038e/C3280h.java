package com.facebook.ads.internal.p038e;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.tinder.api.ManagerWebServices;
import java.util.UUID;

/* renamed from: com.facebook.ads.internal.e.h */
public class C3280h extends C1400g {
    /* renamed from: a */
    public static final C1393b f10046a = new C1393b(0, "token_id", "TEXT PRIMARY KEY");
    /* renamed from: b */
    public static final C1393b f10047b = new C1393b(1, ManagerWebServices.PARAM_TOKEN, "TEXT");
    /* renamed from: c */
    public static final C1393b[] f10048c = new C1393b[]{f10046a, f10047b};
    /* renamed from: d */
    private static final String f10049d = "h";
    /* renamed from: e */
    private static final String f10050e = C1400g.m4862a("tokens", f10048c);
    /* renamed from: f */
    private static final String f10051f = C1400g.m4863a("tokens", f10048c, f10047b);
    /* renamed from: g */
    private static final String f10052g;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DELETE FROM tokens WHERE NOT EXISTS (SELECT 1 FROM events WHERE tokens.");
        stringBuilder.append(f10046a.f3785b);
        stringBuilder.append(" = ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3279c.f10037b.f3785b);
        stringBuilder.append(")");
        f10052g = stringBuilder.toString();
    }

    public C3280h(C1396d c1396d) {
        super(c1396d);
    }

    /* renamed from: a */
    public String mo1732a() {
        return "tokens";
    }

    @WorkerThread
    /* renamed from: a */
    String m12650a(String str) {
        Throwable th;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Invalid token.");
        }
        Cursor rawQuery;
        try {
            rawQuery = m4870f().rawQuery(f10051f, new String[]{str});
            try {
                Object string = rawQuery.moveToNext() ? rawQuery.getString(f10046a.f3784a) : null;
                if (TextUtils.isEmpty(string)) {
                    String uuid = UUID.randomUUID().toString();
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put(f10046a.f3785b, uuid);
                    contentValues.put(f10047b.f3785b, str);
                    m4870f().insertOrThrow("tokens", null, contentValues);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return uuid;
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return string;
            } catch (Throwable th2) {
                th = th2;
                if (rawQuery != null) {
                    rawQuery.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            rawQuery = null;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public C1393b[] mo1733b() {
        return f10048c;
    }

    @WorkerThread
    /* renamed from: c */
    Cursor mo1734c() {
        return m4870f().rawQuery(f10050e, null);
    }

    @android.support.annotation.WorkerThread
    /* renamed from: d */
    public void m12653d() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.m4870f();	 Catch:{ SQLException -> 0x0009 }
        r1 = f10052g;	 Catch:{ SQLException -> 0x0009 }
        r0.execSQL(r1);	 Catch:{ SQLException -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.e.h.d():void");
    }
}
