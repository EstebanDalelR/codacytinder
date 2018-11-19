package com.google.android.m4b.maps.ca;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.google.android.m4b.maps.aa.ax;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.m4b.maps.ca.a */
public final class C5049a {
    /* renamed from: a */
    private C7490k f18663a = null;
    /* renamed from: b */
    private boolean f18664b = true;
    /* renamed from: c */
    private final Bitmap f18665c = Bitmap.createBitmap(256, 1, Config.ARGB_8888);
    /* renamed from: d */
    private final Map<Integer, Integer> f18666d = ax.m20627c();

    /* renamed from: com.google.android.m4b.maps.ca.a$a */
    static class C5048a {
        /* renamed from: a */
        public int f18661a;
        /* renamed from: b */
        public int f18662b;

        C5048a() {
        }
    }

    /* renamed from: a */
    public final synchronized C7490k m22579a(C5052d c5052d) {
        m22582b(c5052d);
        return this.f18663a;
    }

    /* renamed from: b */
    public final synchronized void m22582b(C5052d c5052d) {
        if (this.f18664b || this.f18663a == null) {
            m22576b();
            if (!(this.f18663a == null || c5052d.f18683a == this.f18663a.m32540a())) {
                m22580a();
            }
            if (this.f18663a == null) {
                this.f18663a = new C7490k(c5052d);
                this.f18663a.m32552c(false);
            }
            this.f18663a.m32548b(this.f18665c);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final synchronized void m22581a(int r6, com.google.android.m4b.maps.ca.C5049a.C5048a r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.f18666d;	 Catch:{ all -> 0x005c }
        r1 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x005c }
        r0 = r0.get(r1);	 Catch:{ all -> 0x005c }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x005c }
        r1 = 1;
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r0 != 0) goto L_0x003f;
    L_0x0012:
        r0 = r5.f18666d;	 Catch:{ all -> 0x005c }
        r0 = r0.size();	 Catch:{ all -> 0x005c }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x005c }
        r3 = r0.intValue();	 Catch:{ all -> 0x005c }
        if (r3 < r2) goto L_0x0034;
    L_0x0022:
        r6 = "ColorPalette";
        r7 = 6;
        r6 = com.google.android.m4b.maps.ay.C4728u.m21050a(r6, r7);	 Catch:{ all -> 0x005c }
        if (r6 == 0) goto L_0x0032;
    L_0x002b:
        r6 = "ColorPalette";
        r7 = "Color texture is full";
        android.util.Log.e(r6, r7);	 Catch:{ all -> 0x005c }
    L_0x0032:
        monitor-exit(r5);
        return;
    L_0x0034:
        r3 = r5.f18666d;	 Catch:{ all -> 0x005c }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x005c }
        r3.put(r6, r0);	 Catch:{ all -> 0x005c }
        r5.f18664b = r1;	 Catch:{ all -> 0x005c }
    L_0x003f:
        r6 = r0.intValue();	 Catch:{ all -> 0x005c }
        r6 = r6 % r2;
        r3 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r6 = r6 * r3;
        r4 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r6 = r6 + r4;
        r6 = r6 / r2;
        r7.f18661a = r6;	 Catch:{ all -> 0x005c }
        r6 = r0.intValue();	 Catch:{ all -> 0x005c }
        r6 = r6 / r2;
        r6 = r6 * r3;
        r6 = r6 + r4;
        r6 = r6 / r1;
        r7.f18662b = r6;	 Catch:{ all -> 0x005c }
        monitor-exit(r5);
        return;
    L_0x005c:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ca.a.a(int, com.google.android.m4b.maps.ca.a$a):void");
    }

    /* renamed from: a */
    public final synchronized void m22580a() {
        if (this.f18663a != null) {
            this.f18663a.m32557f();
            this.f18663a = null;
        }
    }

    /* renamed from: b */
    private synchronized void m22576b() {
        this.f18664b = false;
        for (Entry entry : this.f18666d.entrySet()) {
            this.f18665c.setPixel(((Integer) entry.getValue()).intValue() % 256, ((Integer) entry.getValue()).intValue() / 256, ((Integer) entry.getKey()).intValue());
        }
    }

    /* renamed from: c */
    public static void m22577c(C5052d c5052d) {
        c5052d.f18683a.glMatrixMode(5890);
        c5052d.f18683a.glLoadIdentity();
        c5052d.f18683a.glScalex(1, 1, 0);
        c5052d.f18683a.glMatrixMode(5888);
    }

    /* renamed from: d */
    public static void m22578d(C5052d c5052d) {
        c5052d.f18683a.glMatrixMode(5890);
        c5052d.f18683a.glLoadIdentity();
        c5052d.f18683a.glMatrixMode(5888);
    }
}
