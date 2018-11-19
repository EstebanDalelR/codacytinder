package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import java.util.UUID;

/* renamed from: com.facebook.appevents.internal.g */
class C1655g {
    /* renamed from: a */
    private Long f4567a;
    /* renamed from: b */
    private Long f4568b;
    /* renamed from: c */
    private int f4569c;
    /* renamed from: d */
    private Long f4570d;
    /* renamed from: e */
    private C1659i f4571e;
    /* renamed from: f */
    private UUID f4572f;

    public C1655g(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    public C1655g(Long l, Long l2, UUID uuid) {
        this.f4567a = l;
        this.f4568b = l2;
        this.f4572f = uuid;
    }

    /* renamed from: a */
    public static C1655g m5610a() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.m3994e());
        long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
        long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
        String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
        if (!(j == 0 || j2 == 0)) {
            if (string != null) {
                C1655g c1655g = new C1655g(Long.valueOf(j), Long.valueOf(j2));
                c1655g.f4569c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                c1655g.f4571e = C1659i.m5627a();
                c1655g.f4570d = Long.valueOf(System.currentTimeMillis());
                c1655g.f4572f = UUID.fromString(string);
                return c1655g;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m5611b() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.m3994e()).edit();
        edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
        edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
        edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
        edit.remove("com.facebook.appevents.SessionInfo.sessionId");
        edit.apply();
        C1659i.m5628b();
    }

    /* renamed from: c */
    public Long m5614c() {
        return this.f4568b;
    }

    /* renamed from: a */
    public void m5613a(Long l) {
        this.f4568b = l;
    }

    /* renamed from: d */
    public int m5615d() {
        return this.f4569c;
    }

    /* renamed from: e */
    public void m5616e() {
        this.f4569c++;
    }

    /* renamed from: f */
    public long m5617f() {
        return this.f4570d == null ? 0 : this.f4570d.longValue();
    }

    /* renamed from: g */
    public UUID m5618g() {
        return this.f4572f;
    }

    /* renamed from: h */
    public long m5619h() {
        if (this.f4567a != null) {
            if (this.f4568b != null) {
                return this.f4568b.longValue() - this.f4567a.longValue();
            }
        }
        return 0;
    }

    /* renamed from: i */
    public C1659i m5620i() {
        return this.f4571e;
    }

    /* renamed from: a */
    public void m5612a(C1659i c1659i) {
        this.f4571e = c1659i;
    }

    /* renamed from: j */
    public void m5621j() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.m3994e()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.f4567a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.f4568b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f4569c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f4572f.toString());
        edit.apply();
        if (this.f4571e != null) {
            this.f4571e.m5629c();
        }
    }
}
