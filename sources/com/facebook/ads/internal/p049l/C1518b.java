package com.facebook.ads.internal.p049l;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.l.b */
public class C1518b {
    /* renamed from: a */
    private C1519c f4218a;
    /* renamed from: b */
    private float f4219b;
    /* renamed from: c */
    private Map<String, String> f4220c;

    public C1518b(C1519c c1519c) {
        this(c1519c, 0.0f);
    }

    public C1518b(C1519c c1519c, float f) {
        this(c1519c, f, null);
    }

    public C1518b(C1519c c1519c, float f, Map<String, String> map) {
        this.f4218a = c1519c;
        this.f4219b = f;
        if (map != null) {
            this.f4220c = map;
        } else {
            this.f4220c = new HashMap();
        }
    }

    /* renamed from: a */
    public boolean m5354a() {
        return this.f4218a == C1519c.IS_VIEWABLE;
    }

    /* renamed from: b */
    public int m5355b() {
        return this.f4218a.m5358a();
    }

    /* renamed from: c */
    public float m5356c() {
        return this.f4219b;
    }

    /* renamed from: d */
    public Map<String, String> m5357d() {
        return this.f4220c;
    }
}
