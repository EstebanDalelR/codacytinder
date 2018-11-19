package com.facebook.ads.internal.p038e;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.annotation.WorkerThread;
import com.tinder.api.ManagerWebServices;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.e.c */
public class C3279c extends C1400g {
    /* renamed from: a */
    public static final C1393b f10036a = new C1393b(0, "event_id", "TEXT PRIMARY KEY");
    /* renamed from: b */
    public static final C1393b f10037b = new C1393b(1, "token_id", "TEXT REFERENCES tokens ON UPDATE CASCADE ON DELETE RESTRICT");
    /* renamed from: c */
    public static final C1393b f10038c = new C1393b(2, "priority", "INTEGER");
    /* renamed from: d */
    public static final C1393b f10039d = new C1393b(3, "type", "TEXT");
    /* renamed from: e */
    public static final C1393b f10040e = new C1393b(4, "time", "REAL");
    /* renamed from: f */
    public static final C1393b f10041f = new C1393b(5, "session_time", "REAL");
    /* renamed from: g */
    public static final C1393b f10042g = new C1393b(6, "session_id", "TEXT");
    /* renamed from: h */
    public static final C1393b f10043h = new C1393b(7, ManagerWebServices.FB_DATA, "TEXT");
    /* renamed from: i */
    public static final C1393b[] f10044i = new C1393b[]{f10036a, f10037b, f10038c, f10039d, f10040e, f10041f, f10042g, f10043h};
    /* renamed from: k */
    private static final String f10045k = C1400g.m4862a("events", f10044i);

    public C3279c(C1396d c1396d) {
        super(c1396d);
    }

    /* renamed from: a */
    public String mo1732a() {
        return "events";
    }

    @WorkerThread
    /* renamed from: a */
    String m12644a(String str, int i, String str2, double d, double d2, String str3, Map<String, String> map) {
        String uuid = UUID.randomUUID().toString();
        ContentValues contentValues = new ContentValues(7);
        contentValues.put(f10036a.f3785b, uuid);
        contentValues.put(f10037b.f3785b, str);
        contentValues.put(f10038c.f3785b, Integer.valueOf(i));
        contentValues.put(f10039d.f3785b, str2);
        contentValues.put(f10040e.f3785b, Double.valueOf(d));
        contentValues.put(f10041f.f3785b, Double.valueOf(d2));
        contentValues.put(f10042g.f3785b, str3);
        contentValues.put(f10043h.f3785b, map != null ? new JSONObject(map).toString() : null);
        m4870f().insertOrThrow("events", null, contentValues);
        return uuid;
    }

    /* renamed from: a */
    boolean m12645a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f10036a.f3785b);
        stringBuilder.append(" = ?");
        return m4870f().delete("events", stringBuilder.toString(), new String[]{str}) > 0;
    }

    /* renamed from: b */
    public C1393b[] mo1733b() {
        return f10044i;
    }

    @WorkerThread
    /* renamed from: c */
    Cursor mo1734c() {
        return m4870f().rawQuery("SELECT count(*) FROM events", null);
    }

    @WorkerThread
    /* renamed from: d */
    Cursor m12648d() {
        return m4870f().rawQuery(f10045k, null);
    }
}
