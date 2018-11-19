package com.google.android.m4b.maps.ca;

import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.ca.c */
public final class C5051c {
    /* renamed from: a */
    private static int m22592a(int i, int i2, int i3) {
        return i < 0 ? 0 : i > 255 ? 255 : i;
    }

    /* renamed from: a */
    public static int m22590a(float f, float f2, float f3, float f4) {
        return (((C5051c.m22592a((int) ((f * 255.0f) + 0.5f), 0, 255) << 24) | (C5051c.m22592a((int) ((f2 * 255.0f) + 0.5f), 0, 255) << 16)) | (C5051c.m22592a((int) ((f3 * 255.0f) + 0.5f), 0, 255) << 8)) | C5051c.m22592a((int) ((f4 * 255.0f) + 0.5f), 0, 255);
    }

    /* renamed from: a */
    public static void m22593a(GL10 gl10, int i) {
        int i2 = i >> 16;
        int i3 = i >> 8;
        gl10.glColor4x((i2 & 255) | (i3 & 65280), (i3 & 255) | (i & 65280), (i & 255) | (65280 & (i << 8)), (i2 & 65280) | ((i >> 24) & 255));
    }

    /* renamed from: a */
    public static int m22591a(int i) {
        return (((((i >> 16) & 255) * 3) + (((i >> 8) & 255) * 10)) + (i & 255)) / 14;
    }
}
