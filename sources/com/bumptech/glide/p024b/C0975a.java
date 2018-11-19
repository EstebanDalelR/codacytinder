package com.bumptech.glide.p024b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.b.a */
public class C0975a {
    /* renamed from: a */
    private int f2611a;
    /* renamed from: b */
    private int f2612b;
    /* renamed from: c */
    private Integer f2613c = null;
    /* renamed from: d */
    private int f2614d;
    /* renamed from: e */
    private int f2615e = -1;
    /* renamed from: f */
    private int f2616f = 0;
    /* renamed from: g */
    private boolean f2617g = false;
    /* renamed from: h */
    private OutputStream f2618h;
    /* renamed from: i */
    private Bitmap f2619i;
    /* renamed from: j */
    private byte[] f2620j;
    /* renamed from: k */
    private byte[] f2621k;
    /* renamed from: l */
    private int f2622l;
    /* renamed from: m */
    private byte[] f2623m;
    /* renamed from: n */
    private boolean[] f2624n = new boolean[256];
    /* renamed from: o */
    private int f2625o = 7;
    /* renamed from: p */
    private int f2626p = -1;
    /* renamed from: q */
    private boolean f2627q = false;
    /* renamed from: r */
    private boolean f2628r = true;
    /* renamed from: s */
    private boolean f2629s = false;
    /* renamed from: t */
    private int f2630t = 10;
    /* renamed from: u */
    private boolean f2631u;

    /* renamed from: a */
    public void m3358a(int i) {
        this.f2616f = Math.round(((float) i) / 1092616192);
    }

    /* renamed from: a */
    public boolean m3361a(android.graphics.Bitmap r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = 0;
        if (r5 == 0) goto L_0x0045;
    L_0x0003:
        r1 = r4.f2617g;
        if (r1 != 0) goto L_0x0008;
    L_0x0007:
        goto L_0x0045;
    L_0x0008:
        r1 = 1;
        r2 = r4.f2629s;	 Catch:{ IOException -> 0x0044 }
        if (r2 != 0) goto L_0x0018;	 Catch:{ IOException -> 0x0044 }
    L_0x000d:
        r2 = r5.getWidth();	 Catch:{ IOException -> 0x0044 }
        r3 = r5.getHeight();	 Catch:{ IOException -> 0x0044 }
        r4.m3359a(r2, r3);	 Catch:{ IOException -> 0x0044 }
    L_0x0018:
        r4.f2619i = r5;	 Catch:{ IOException -> 0x0044 }
        r4.m3350c();	 Catch:{ IOException -> 0x0044 }
        r4.m3349b();	 Catch:{ IOException -> 0x0044 }
        r5 = r4.f2628r;	 Catch:{ IOException -> 0x0044 }
        if (r5 == 0) goto L_0x0031;	 Catch:{ IOException -> 0x0044 }
    L_0x0024:
        r4.m3354f();	 Catch:{ IOException -> 0x0044 }
        r4.m3356h();	 Catch:{ IOException -> 0x0044 }
        r5 = r4.f2615e;	 Catch:{ IOException -> 0x0044 }
        if (r5 < 0) goto L_0x0031;	 Catch:{ IOException -> 0x0044 }
    L_0x002e:
        r4.m3355g();	 Catch:{ IOException -> 0x0044 }
    L_0x0031:
        r4.m3352d();	 Catch:{ IOException -> 0x0044 }
        r4.m3353e();	 Catch:{ IOException -> 0x0044 }
        r5 = r4.f2628r;	 Catch:{ IOException -> 0x0044 }
        if (r5 != 0) goto L_0x003e;	 Catch:{ IOException -> 0x0044 }
    L_0x003b:
        r4.m3356h();	 Catch:{ IOException -> 0x0044 }
    L_0x003e:
        r4.m3357i();	 Catch:{ IOException -> 0x0044 }
        r4.f2628r = r0;	 Catch:{ IOException -> 0x0044 }
        r0 = 1;
    L_0x0044:
        return r0;
    L_0x0045:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.a.a(android.graphics.Bitmap):boolean");
    }

    /* renamed from: a */
    public boolean m3360a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = r4.f2617g;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r4.f2617g = r1;
        r0 = 1;
        r2 = r4.f2618h;	 Catch:{ IOException -> 0x0020 }
        r3 = 59;	 Catch:{ IOException -> 0x0020 }
        r2.write(r3);	 Catch:{ IOException -> 0x0020 }
        r2 = r4.f2618h;	 Catch:{ IOException -> 0x0020 }
        r2.flush();	 Catch:{ IOException -> 0x0020 }
        r2 = r4.f2627q;	 Catch:{ IOException -> 0x0020 }
        if (r2 == 0) goto L_0x001e;	 Catch:{ IOException -> 0x0020 }
    L_0x0019:
        r2 = r4.f2618h;	 Catch:{ IOException -> 0x0020 }
        r2.close();	 Catch:{ IOException -> 0x0020 }
    L_0x001e:
        r2 = 1;
        goto L_0x0021;
    L_0x0020:
        r2 = 0;
    L_0x0021:
        r4.f2614d = r1;
        r3 = 0;
        r4.f2618h = r3;
        r4.f2619i = r3;
        r4.f2620j = r3;
        r4.f2621k = r3;
        r4.f2623m = r3;
        r4.f2627q = r1;
        r4.f2628r = r0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.a.a():boolean");
    }

    /* renamed from: a */
    public void m3359a(int i, int i2) {
        if (!this.f2617g || this.f2628r) {
            this.f2611a = i;
            this.f2612b = i2;
            if (this.f2611a < 1) {
                this.f2611a = 320;
            }
            if (this.f2612b < 1) {
                this.f2612b = 240;
            }
            this.f2629s = true;
        }
    }

    /* renamed from: a */
    public boolean m3362a(java.io.OutputStream r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = 0;
        if (r3 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 1;
        r2.f2627q = r0;
        r2.f2618h = r3;
        r3 = "GIF89a";	 Catch:{ IOException -> 0x000f }
        r2.m3347a(r3);	 Catch:{ IOException -> 0x000f }
        r0 = 1;
    L_0x000f:
        r2.f2617g = r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.a.a(java.io.OutputStream):boolean");
    }

    /* renamed from: b */
    private void m3349b() {
        int i;
        int length = this.f2620j.length;
        int i2 = length / 3;
        this.f2621k = new byte[i2];
        C0977c c0977c = new C0977c(this.f2620j, length, this.f2630t);
        this.f2623m = c0977c.m3379d();
        for (i = 0; i < this.f2623m.length; i += 3) {
            byte b = this.f2623m[i];
            int i3 = i + 2;
            this.f2623m[i] = this.f2623m[i3];
            this.f2623m[i3] = b;
            this.f2624n[i / 3] = false;
        }
        i = 0;
        int i4 = 0;
        while (i < i2) {
            int i5 = i4 + 1;
            i3 = i5 + 1;
            int i6 = i3 + 1;
            i4 = c0977c.m3372a(this.f2620j[i4] & 255, this.f2620j[i5] & 255, this.f2620j[i3] & 255);
            this.f2624n[i4] = true;
            this.f2621k[i] = (byte) i4;
            i++;
            i4 = i6;
        }
        this.f2620j = null;
        this.f2622l = 8;
        this.f2625o = 7;
        if (this.f2613c != null) {
            this.f2614d = m3348b(this.f2613c.intValue());
        } else if (this.f2631u) {
            this.f2614d = m3348b(0);
        }
    }

    /* renamed from: b */
    private int m3348b(int i) {
        if (this.f2623m == null) {
            return -1;
        }
        int red = Color.red(i);
        int green = Color.green(i);
        i = Color.blue(i);
        int length = this.f2623m.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 16777216;
        while (i2 < length) {
            int i5 = i2 + 1;
            i2 = red - (this.f2623m[i2] & 255);
            int i6 = i5 + 1;
            int i7 = green - (this.f2623m[i5] & 255);
            i5 = i - (this.f2623m[i6] & 255);
            i2 = ((i2 * i2) + (i7 * i7)) + (i5 * i5);
            i7 = i6 / 3;
            if (this.f2624n[i7] && i2 < r5) {
                i4 = i2;
                i3 = i7;
            }
            i2 = i6 + 1;
        }
        return i3;
    }

    /* renamed from: c */
    private void m3350c() {
        int width = this.f2619i.getWidth();
        int height = this.f2619i.getHeight();
        if (!(width == this.f2611a && height == this.f2612b)) {
            Bitmap createBitmap = Bitmap.createBitmap(this.f2611a, this.f2612b, Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(createBitmap, 0.0f, 0.0f, null);
            this.f2619i = createBitmap;
        }
        int[] iArr = new int[(width * height)];
        this.f2619i.getPixels(iArr, 0, width, 0, 0, width, height);
        this.f2620j = new byte[(iArr.length * 3)];
        boolean z = false;
        this.f2631u = false;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            width = iArr[i];
            if (width == 0) {
                i2++;
            }
            int i4 = i3 + 1;
            this.f2620j[i3] = (byte) (width & 255);
            height = i4 + 1;
            this.f2620j[i4] = (byte) ((width >> 8) & 255);
            i4 = height + 1;
            this.f2620j[height] = (byte) ((width >> 16) & 255);
            i++;
            i3 = i4;
        }
        double length2 = ((double) (i2 * 100)) / ((double) iArr.length);
        if (length2 > 4.0d) {
            z = true;
        }
        this.f2631u = z;
        if (Log.isLoggable("AnimatedGifEncoder", 3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("got pixels for frame with ");
            stringBuilder.append(length2);
            stringBuilder.append("% transparent pixels");
            Log.d("AnimatedGifEncoder", stringBuilder.toString());
        }
    }

    /* renamed from: d */
    private void m3352d() throws IOException {
        int i;
        int i2;
        this.f2618h.write(33);
        this.f2618h.write(249);
        this.f2618h.write(4);
        if (this.f2613c != null || this.f2631u) {
            i = 2;
            i2 = 1;
        } else {
            i = 0;
            i2 = 0;
        }
        if (this.f2626p >= 0) {
            i = this.f2626p & 7;
        }
        this.f2618h.write((((i << 2) | 0) | 0) | i2);
        m3351c(this.f2616f);
        this.f2618h.write(this.f2614d);
        this.f2618h.write(0);
    }

    /* renamed from: e */
    private void m3353e() throws IOException {
        this.f2618h.write(44);
        m3351c(0);
        m3351c(0);
        m3351c(this.f2611a);
        m3351c(this.f2612b);
        if (this.f2628r) {
            this.f2618h.write(0);
        } else {
            this.f2618h.write(this.f2625o | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        }
    }

    /* renamed from: f */
    private void m3354f() throws IOException {
        m3351c(this.f2611a);
        m3351c(this.f2612b);
        this.f2618h.write(this.f2625o | 240);
        this.f2618h.write(0);
        this.f2618h.write(0);
    }

    /* renamed from: g */
    private void m3355g() throws IOException {
        this.f2618h.write(33);
        this.f2618h.write(255);
        this.f2618h.write(11);
        m3347a("NETSCAPE2.0");
        this.f2618h.write(3);
        this.f2618h.write(1);
        m3351c(this.f2615e);
        this.f2618h.write(0);
    }

    /* renamed from: h */
    private void m3356h() throws IOException {
        this.f2618h.write(this.f2623m, 0, this.f2623m.length);
        int length = 768 - this.f2623m.length;
        for (int i = 0; i < length; i++) {
            this.f2618h.write(0);
        }
    }

    /* renamed from: i */
    private void m3357i() throws IOException {
        new C0976b(this.f2611a, this.f2612b, this.f2621k, this.f2622l).m3370b(this.f2618h);
    }

    /* renamed from: c */
    private void m3351c(int i) throws IOException {
        this.f2618h.write(i & 255);
        this.f2618h.write((i >> 8) & 255);
    }

    /* renamed from: a */
    private void m3347a(String str) throws IOException {
        for (int i = 0; i < str.length(); i++) {
            this.f2618h.write((byte) str.charAt(i));
        }
    }
}
