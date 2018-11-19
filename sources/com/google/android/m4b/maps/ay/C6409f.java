package com.google.android.m4b.maps.ay;

import android.util.Log;

/* renamed from: com.google.android.m4b.maps.ay.f */
public abstract class C6409f implements C4718l {
    /* renamed from: a */
    private static final String f23770a = "f";
    /* renamed from: c */
    private static C4712d f23771c = new C4712d();
    /* renamed from: b */
    private int f23772b = 0;
    /* renamed from: d */
    private long f23773d;

    /* renamed from: a */
    public boolean mo4878a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo4879b() {
        m27956a("onRetry");
        return this.f23772b < 3;
    }

    /* renamed from: c */
    public final void mo4880c() {
        this.f23772b++;
    }

    /* renamed from: d */
    public void mo4881d() {
        m27956a("onComplete");
    }

    /* renamed from: e */
    public void mo4882e() {
        m27956a("onPermanentFailure");
    }

    /* renamed from: f */
    public final void mo4883f() {
        if (C4728u.m21050a(f23770a, 3)) {
            String str = f23770a;
            String str2 = "REQUEST  type = ";
            String valueOf = String.valueOf(mo7075h());
            Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        this.f23773d = C4712d.m20956b();
    }

    /* renamed from: a */
    private long m27956a(String str) {
        long b = C4712d.m20956b() - this.f23773d;
        String str2;
        String h;
        StringBuilder stringBuilder;
        if (this.f23773d > 0) {
            if (C4728u.m21050a(f23770a, 3)) {
                str2 = f23770a;
                h = mo7075h();
                stringBuilder = new StringBuilder((String.valueOf(str).length() + 44) + String.valueOf(h).length());
                stringBuilder.append(str);
                stringBuilder.append(", ");
                stringBuilder.append(h);
                stringBuilder.append(", elapsed time (ms) = ");
                stringBuilder.append(b);
                Log.d(str2, stringBuilder.toString());
            }
        } else if (C4728u.m21050a(f23770a, 3)) {
            str2 = f23770a;
            h = mo7075h();
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 19) + String.valueOf(h).length());
            stringBuilder.append(str);
            stringBuilder.append(", ");
            stringBuilder.append(h);
            stringBuilder.append(", no request time");
            Log.d(str2, stringBuilder.toString());
        }
        return b;
    }

    /* renamed from: h */
    private String mo7075h() {
        int g = mo7034g();
        if (g == 7) {
            return "BILLING_POINT_REQUEST";
        }
        if (g == 39) {
            return "RESOURCE_REQUEST";
        }
        if (g == 62) {
            return "CLIENT_PROPERTIES_2_REQUEST";
        }
        if (g == 108) {
            return "MAP_TILE_4_REQUEST";
        }
        if (g == 118) {
            return "INDOOR_BUILDING_REQUEST";
        }
        if (g == 147) {
            return "API_QUOTA_EVENT_REQUEST";
        }
        StringBuilder stringBuilder = new StringBuilder(24);
        stringBuilder.append("UNKNOWN_TYPE ");
        stringBuilder.append(g);
        return stringBuilder.toString();
    }
}
