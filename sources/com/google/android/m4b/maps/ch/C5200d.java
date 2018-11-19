package com.google.android.m4b.maps.ch;

import com.google.android.m4b.maps.ar.C4662a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.m4b.maps.ch.d */
public final class C5200d {
    /* renamed from: a */
    private final int f19339a;
    /* renamed from: b */
    private final int f19340b;
    /* renamed from: c */
    private final int f19341c;
    /* renamed from: d */
    private final int f19342d;
    /* renamed from: e */
    private final int f19343e;
    /* renamed from: f */
    private final int f19344f;
    /* renamed from: g */
    private final int f19345g;
    /* renamed from: h */
    private final long f19346h;
    /* renamed from: i */
    private final boolean f19347i;

    public final String toString() {
        int i = this.f19339a;
        int i2 = this.f19340b;
        int i3 = this.f19342d;
        int i4 = this.f19343e;
        int i5 = this.f19344f;
        int i6 = this.f19345g;
        StringBuilder stringBuilder = new StringBuilder(174);
        stringBuilder.append("maxTiles: ");
        stringBuilder.append(i);
        stringBuilder.append(" maxServerTiles: ");
        stringBuilder.append(i2);
        stringBuilder.append(" prefetchPeriod: ");
        stringBuilder.append(i3);
        stringBuilder.append(" prefetchInitiatorDelay: ");
        stringBuilder.append(i4);
        stringBuilder.append(" prefetchInitiatorPeriod: ");
        stringBuilder.append(i5);
        stringBuilder.append(" timeToWipe: ");
        stringBuilder.append(i6);
        return stringBuilder.toString();
    }

    public C5200d(C4662a c4662a) {
        this.f19339a = c4662a.m20835d(1);
        this.f19340b = c4662a.m20835d(2);
        this.f19342d = c4662a.m20835d(3);
        this.f19343e = c4662a.m20835d(4);
        this.f19344f = c4662a.m20835d(5);
        this.f19345g = c4662a.m20835d(6);
        this.f19341c = c4662a.m20835d(7);
        this.f19346h = c4662a.m20838e(8);
        this.f19347i = c4662a.m20831b(9);
    }

    /* renamed from: a */
    public final long m23202a() {
        return TimeUnit.DAYS.toMillis((long) this.f19345g);
    }
}
