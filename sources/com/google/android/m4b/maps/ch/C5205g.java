package com.google.android.m4b.maps.ch;

import com.google.android.m4b.maps.ar.C4662a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.m4b.maps.ch.g */
public final class C5205g {
    /* renamed from: a */
    private final int f19372a;
    /* renamed from: b */
    private final boolean f19373b;
    /* renamed from: c */
    private final int f19374c;
    /* renamed from: d */
    private final int f19375d;
    /* renamed from: e */
    private final int f19376e;
    /* renamed from: f */
    private int f19377f;
    /* renamed from: g */
    private boolean f19378g;
    /* renamed from: h */
    private final boolean f19379h;
    /* renamed from: i */
    private final boolean f19380i;
    /* renamed from: j */
    private final String f19381j;

    public final String toString() {
        int i = this.f19372a;
        boolean z = this.f19373b;
        int i2 = this.f19374c;
        int i3 = this.f19375d;
        int i4 = this.f19376e;
        int i5 = this.f19377f;
        boolean z2 = this.f19378g;
        StringBuilder stringBuilder = new StringBuilder(246);
        stringBuilder.append("personalizedSmartMapsTileDuration: ");
        stringBuilder.append(i);
        stringBuilder.append(" onlyRequestPsmWhenPoiInBaseTile: ");
        stringBuilder.append(z);
        stringBuilder.append(" minPsmRequestZoom: ");
        stringBuilder.append(i2);
        stringBuilder.append(" pertileDuration: ");
        stringBuilder.append(i3);
        stringBuilder.append(" pertileClientCoverage: ");
        stringBuilder.append(i4);
        stringBuilder.append(" diskCacheServerSchemaVersion:");
        stringBuilder.append(i5);
        stringBuilder.append(" offlineBorderTiles:");
        stringBuilder.append(z2);
        return stringBuilder.toString();
    }

    public C5205g(C4662a c4662a) {
        this.f19372a = c4662a.m20835d(1);
        this.f19373b = c4662a.m20831b(2);
        this.f19374c = c4662a.m20835d(3);
        this.f19375d = c4662a.m20835d(4);
        this.f19376e = c4662a.m20835d(6);
        this.f19377f = c4662a.m20835d(7);
        this.f19378g = c4662a.m20831b(8);
        this.f19381j = c4662a.m20843h(17);
        this.f19379h = c4662a.m20844i(19);
        this.f19380i = c4662a.m20831b(19);
    }

    /* renamed from: a */
    public final long m23230a() {
        return TimeUnit.MINUTES.toMillis((long) this.f19375d);
    }

    /* renamed from: b */
    public final int m23231b() {
        return this.f19377f;
    }

    /* renamed from: c */
    public final boolean m23232c() {
        return this.f19378g;
    }

    /* renamed from: d */
    public final String m23233d() {
        return this.f19381j;
    }
}
