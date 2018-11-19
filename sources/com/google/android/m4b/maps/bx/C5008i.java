package com.google.android.m4b.maps.bx;

/* renamed from: com.google.android.m4b.maps.bx.i */
public enum C5008i {
    NORMAL(1),
    HYBRID(2),
    NIGHT(3),
    TERRAIN(4),
    RASTER_ONLY(5),
    NONE(6),
    AMBIENT(7);
    
    /* renamed from: h */
    public static final int f18492h = 0;
    /* renamed from: i */
    private final int f18494i;

    static {
        f18492h = C5008i.values().length;
    }

    private C5008i(int i) {
        this.f18494i = i;
    }

    /* renamed from: a */
    public final int m22384a() {
        return this.f18494i;
    }
}
