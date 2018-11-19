package com.facebook.accountkit.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import java.util.Calendar;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.accountkit.internal.j */
public final class C1232j {
    /* renamed from: a */
    private static final String f3300a = "j";
    /* renamed from: b */
    private static final String f3301b = f3300a;
    /* renamed from: c */
    private static final String f3302c;
    /* renamed from: d */
    private static final String f3303d;
    /* renamed from: e */
    private static final String f3304e;
    /* renamed from: f */
    private static final String f3305f;
    /* renamed from: g */
    private static final long f3306g = TimeUnit.DAYS.toMillis(3);
    /* renamed from: h */
    private final SharedPreferences f3307h;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f3301b);
        stringBuilder.append(".AK_PREFERENCES");
        f3302c = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f3301b);
        stringBuilder.append(".PREF_CREATE_TIME");
        f3303d = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f3301b);
        stringBuilder.append(".PREF_TTL");
        f3304e = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f3301b);
        stringBuilder.append(".PREF_UNIT_ID");
        f3305f = stringBuilder.toString();
    }

    /* renamed from: a */
    static void m4352a(Context context, String str, Long l, @Nullable Long l2, Map<Integer, Integer> map) {
        if (str != null) {
            if (l != null) {
                C1232j.m4351a(context, str, l.longValue(), l2, (Map) map);
            }
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    private static void m4351a(Context context, String str, long j, @Nullable Long l, Map<Integer, Integer> map) {
        context = C1232j.m4350a(context).edit();
        context.clear();
        context.putLong(f3303d, j);
        if (l != null) {
            context.putLong(f3304e, l.longValue());
        }
        context.putString(f3305f, str);
        for (Integer num : map.keySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(f3301b);
            stringBuilder.append(num);
            context.putInt(stringBuilder.toString(), ((Integer) map.get(num)).intValue());
        }
        context.commit();
    }

    C1232j(Context context) {
        this.f3307h = C1232j.m4350a(context);
    }

    /* renamed from: a */
    private static SharedPreferences m4350a(Context context) {
        return context.getApplicationContext().getSharedPreferences(f3302c, 0);
    }

    /* renamed from: a */
    public boolean m4354a() {
        return this.f3307h.getLong(f3303d, -1) > 0;
    }

    /* renamed from: b */
    boolean m4355b() {
        long time = Calendar.getInstance().getTime().getTime();
        return Math.abs(time - this.f3307h.getLong(f3303d, time)) > this.f3307h.getLong(f3304e, f3306g);
    }

    @Nullable
    /* renamed from: c */
    String m4357c() {
        return this.f3307h.getString(f3305f, null);
    }

    /* renamed from: a */
    public int m4353a(Feature feature) {
        SharedPreferences sharedPreferences = this.f3307h;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f3301b);
        stringBuilder.append(feature.getPrefKey());
        return sharedPreferences.getInt(stringBuilder.toString(), feature.getDefaultValue());
    }

    /* renamed from: b */
    public boolean m4356b(Feature feature) {
        return m4353a(feature) > null ? true : null;
    }
}
