package com.google.android.gms.internal;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@zzzv
public final class amk extends anl {
    /* renamed from: a */
    private static final int f26669a = Color.rgb(12, 174, 206);
    /* renamed from: b */
    private static final int f26670b;
    /* renamed from: c */
    private static int f26671c;
    /* renamed from: d */
    private static int f26672d = f26669a;
    /* renamed from: e */
    private final String f26673e;
    /* renamed from: f */
    private final List<amm> f26674f = new ArrayList();
    /* renamed from: g */
    private final List<zzpq> f26675g = new ArrayList();
    /* renamed from: h */
    private final int f26676h;
    /* renamed from: i */
    private final int f26677i;
    /* renamed from: j */
    private final int f26678j;
    /* renamed from: k */
    private final int f26679k;
    /* renamed from: l */
    private final int f26680l;
    /* renamed from: m */
    private final boolean f26681m;

    static {
        int rgb = Color.rgb(204, 204, 204);
        f26670b = rgb;
        f26671c = rgb;
    }

    public amk(String str, List<amm> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f26673e = str;
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                amm amm = (amm) list.get(i3);
                this.f26674f.add(amm);
                this.f26675g.add(amm);
            }
        }
        this.f26676h = num != null ? num.intValue() : f26671c;
        this.f26677i = num2 != null ? num2.intValue() : f26672d;
        this.f26678j = num3 != null ? num3.intValue() : 12;
        this.f26679k = i;
        this.f26680l = i2;
        this.f26681m = z;
    }

    /* renamed from: a */
    public final List<amm> m31439a() {
        return this.f26674f;
    }

    /* renamed from: b */
    public final int m31440b() {
        return this.f26676h;
    }

    /* renamed from: c */
    public final int m31441c() {
        return this.f26677i;
    }

    /* renamed from: d */
    public final int m31442d() {
        return this.f26678j;
    }

    /* renamed from: e */
    public final int m31443e() {
        return this.f26679k;
    }

    /* renamed from: f */
    public final int m31444f() {
        return this.f26680l;
    }

    /* renamed from: g */
    public final boolean m31445g() {
        return this.f26681m;
    }

    public final String getText() {
        return this.f26673e;
    }

    public final List<zzpq> zzjm() {
        return this.f26675g;
    }
}
