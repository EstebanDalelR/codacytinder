package com.google.android.m4b.maps.bx;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Typeface;
import com.google.android.m4b.maps.bo.ay;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C7490k;
import com.google.android.m4b.maps.ca.C7490k.C6574a;

public final class ak {
    /* renamed from: a */
    public static final C4991a f18430a = new C4991a();
    /* renamed from: b */
    public static final C4991a f18431b = new C4991a();
    /* renamed from: c */
    public static final C4991a f18432c = new C4991a();
    /* renamed from: d */
    private static ay f18433d;
    /* renamed from: e */
    private final Paint f18434e = new Paint();
    /* renamed from: f */
    private final Paint f18435f;
    /* renamed from: g */
    private final Path f18436g;
    /* renamed from: h */
    private C6574a<C4992b> f18437h;
    /* renamed from: i */
    private final float f18438i;

    /* renamed from: com.google.android.m4b.maps.bx.ak$a */
    public static class C4991a {
        private C4991a() {
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.ak$b */
    static class C4992b {
        /* renamed from: a */
        private final String f18423a;
        /* renamed from: b */
        private final C4991a f18424b;
        /* renamed from: c */
        private final ay f18425c;
        /* renamed from: d */
        private final float f18426d;
        /* renamed from: e */
        private final int f18427e;
        /* renamed from: f */
        private final int f18428f;
        /* renamed from: g */
        private final int f18429g;

        public C4992b(String str, C4991a c4991a, ay ayVar, float f, int i, int i2, int i3) {
            this.f18423a = str;
            this.f18424b = c4991a;
            this.f18425c = ayVar;
            this.f18426d = f;
            this.f18427e = i;
            this.f18428f = i2;
            this.f18429g = i3;
        }

        public final int hashCode() {
            int hashCode = ((this.f18423a.hashCode() + 31) * 31) + this.f18424b.hashCode();
            if (this.f18425c != null) {
                hashCode = (hashCode * 31) + this.f18425c.hashCode();
            }
            return (((((((hashCode * 31) + Float.floatToIntBits(this.f18426d)) * 31) + this.f18427e) * 31) + this.f18428f) * 31) + this.f18429g;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C4992b)) {
                return false;
            }
            C4992b c4992b = (C4992b) obj;
            return c4992b.f18426d == this.f18426d && c4992b.f18427e == this.f18427e && c4992b.f18428f == this.f18428f && c4992b.f18429g == this.f18429g && c4992b.f18424b == this.f18424b && ((c4992b.f18425c == this.f18425c || (c4992b.f18425c != null && c4992b.f18425c.equals(this.f18425c))) && c4992b.f18423a.equals(this.f18423a) != null);
        }
    }

    public ak(float f) {
        this.f18434e.setAntiAlias(true);
        this.f18434e.setStyle(Style.FILL);
        this.f18435f = new Paint();
        this.f18435f.setAntiAlias(true);
        this.f18435f.setStyle(Style.STROKE);
        this.f18436g = new Path();
        this.f18437h = new C6574a(64);
        this.f18438i = f * 2.1f;
    }

    /* renamed from: a */
    public final void m22318a(int i) {
        if (i != this.f18437h.m22250b()) {
            this.f18437h.m22247a();
            this.f18437h = new C6574a(i);
        }
    }

    /* renamed from: a */
    public final float m22314a(String str, C4991a c4991a, ay ayVar, float f) {
        m22313a(c4991a, ayVar);
        this.f18434e.setTextSize(f);
        return this.f18434e.measureText(str);
    }

    /* renamed from: a */
    public final float[] m22320a(String str, C4991a c4991a, ay ayVar, float f, boolean z, float f2) {
        m22313a(c4991a, ayVar);
        this.f18434e.setTextSize(f);
        str = this.f18434e.measureText(str);
        c4991a = this.f18434e.getFontMetrics();
        ayVar = (float) Math.ceil((double) (c4991a.descent - c4991a.ascent));
        f = c4991a.ascent - c4991a.top;
        float f3 = c4991a.bottom - c4991a.descent;
        f2 = (f2 - 1.0f) * ayVar;
        if (z && str > false) {
            str += this.f18438i * true;
            f += this.f18438i;
            f3 += this.f18438i;
        }
        ayVar += f + f3;
        f2 /= 2.0f;
        f -= f2;
        f3 -= f2;
        return new float[]{str, ayVar, f, f3};
    }

    /* renamed from: a */
    public final float[] m22319a(String str, C4991a c4991a, ay ayVar, float f, boolean z) {
        z = new float[(str.length() + 1)];
        if (z.length == 0) {
            return z;
        }
        m22313a(c4991a, ayVar);
        this.f18434e.setTextSize(f);
        this.f18434e.getTextWidths(str, z);
        ayVar = this.f18438i;
        str = null;
        while (str < z.length) {
            f = z[str] + ayVar;
            z[str] = ayVar;
            str++;
            ayVar = f;
        }
        z[0] = z[0] - this.f18438i;
        str = z.length - 1;
        z[str] = z[str] + this.f18438i;
        return z;
    }

    /* renamed from: a */
    public final C7490k m22315a(C5052d c5052d, String str, C4991a c4991a, ay ayVar, float f, int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        C4992b c4992b = new C4992b(str, c4991a, ayVar, f, i4, i5, i6);
        C7490k c7490k = (C7490k) this.f18437h.m22251b((Object) c4992b);
        if (c7490k == null) {
            C4991a c4991a2;
            ay ayVar2;
            boolean z;
            float f2;
            float f3;
            C4992b c4992b2;
            ay ayVar3;
            int i7;
            float f4;
            int i8;
            boolean z2;
            int i9;
            float[] a;
            int ceil;
            int ceil2;
            int a2;
            int a3;
            Config config;
            Bitmap a4;
            Canvas canvas;
            Object obj;
            Object obj2;
            C7490k c7490k2;
            if (i5 == 0) {
                if (i6 == 0) {
                    c4991a2 = c4991a;
                    ayVar2 = ayVar;
                    z = false;
                    m22313a(c4991a2, ayVar2);
                    f2 = (float) ((int) (1.5f * f));
                    r7.f18434e.setTextSize(f2);
                    if (z) {
                        f3 = 0.0f;
                    } else {
                        f3 = r7.f18438i;
                    }
                    c4992b2 = c4992b;
                    ayVar3 = ayVar2;
                    i7 = i6;
                    f4 = f2;
                    i8 = i5;
                    z2 = z;
                    i9 = i4;
                    a = m22320a(str, c4991a2, ayVar3, f4, z2, 1.0f);
                    ceil = ((int) Math.ceil((double) (a[0] * 1.016f))) + 1;
                    ceil2 = (int) Math.ceil((double) a[1]);
                    a2 = C7490k.m32534a(ceil, 8);
                    a3 = C7490k.m32534a(ceil2, 8);
                    if (a2 > c5052d.m22605I() || a3 > c5052d.m22605I()) {
                        a2 = c5052d.m22605I();
                        a3 = c5052d.m22605I();
                    }
                    if (i9 != -16777216) {
                        if (i9 == -1) {
                            config = Config.ARGB_8888;
                            a4 = c5052d.m22623l().m22649a(a2, a3, config);
                            a4.eraseColor(i7);
                            canvas = new Canvas();
                            canvas.setBitmap(a4);
                            i6 = (int) Math.ceil((double) ((-r7.f18434e.getFontMetrics().top) + f3));
                            r7.f18435f.setColor(i8);
                            r7.f18435f.setStrokeWidth(2.0f * f3);
                            r7.f18434e.setColor(i9);
                            obj = (i8 != 0 || f3 <= 0.0f) ? null : 1;
                            obj2 = i9 == 0 ? 1 : null;
                            r7.f18434e.getTextPath(str, 0, str.length(), (float) ((int) ((float) Math.ceil((double) f3))), (float) i6, r7.f18436g);
                            if (obj != null) {
                                canvas.drawPath(r7.f18436g, r7.f18435f);
                            }
                            if (obj2 != null) {
                                canvas.drawPath(r7.f18436g, r7.f18434e);
                            }
                            c7490k2 = new C7490k(c5052d, false);
                            c7490k2.m32552c(true);
                            c7490k2.m32543a(a4, ceil, ceil2);
                            a4.recycle();
                            r7.f18437h.m22255c(c4992b2, c7490k2);
                            c7490k = c7490k2;
                        }
                    }
                    config = Config.ARGB_4444;
                    a4 = c5052d.m22623l().m22649a(a2, a3, config);
                    a4.eraseColor(i7);
                    canvas = new Canvas();
                    canvas.setBitmap(a4);
                    i6 = (int) Math.ceil((double) ((-r7.f18434e.getFontMetrics().top) + f3));
                    r7.f18435f.setColor(i8);
                    r7.f18435f.setStrokeWidth(2.0f * f3);
                    r7.f18434e.setColor(i9);
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    r7.f18434e.getTextPath(str, 0, str.length(), (float) ((int) ((float) Math.ceil((double) f3))), (float) i6, r7.f18436g);
                    if (obj != null) {
                        canvas.drawPath(r7.f18436g, r7.f18435f);
                    }
                    if (obj2 != null) {
                        canvas.drawPath(r7.f18436g, r7.f18434e);
                    }
                    c7490k2 = new C7490k(c5052d, false);
                    c7490k2.m32552c(true);
                    c7490k2.m32543a(a4, ceil, ceil2);
                    a4.recycle();
                    r7.f18437h.m22255c(c4992b2, c7490k2);
                    c7490k = c7490k2;
                }
            }
            c4991a2 = c4991a;
            ayVar2 = ayVar;
            z = true;
            m22313a(c4991a2, ayVar2);
            f2 = (float) ((int) (1.5f * f));
            r7.f18434e.setTextSize(f2);
            if (z) {
                f3 = 0.0f;
            } else {
                f3 = r7.f18438i;
            }
            c4992b2 = c4992b;
            ayVar3 = ayVar2;
            i7 = i6;
            f4 = f2;
            i8 = i5;
            z2 = z;
            i9 = i4;
            a = m22320a(str, c4991a2, ayVar3, f4, z2, 1.0f);
            ceil = ((int) Math.ceil((double) (a[0] * 1.016f))) + 1;
            ceil2 = (int) Math.ceil((double) a[1]);
            a2 = C7490k.m32534a(ceil, 8);
            a3 = C7490k.m32534a(ceil2, 8);
            a2 = c5052d.m22605I();
            a3 = c5052d.m22605I();
            if (i9 != -16777216) {
                if (i9 == -1) {
                    config = Config.ARGB_8888;
                    a4 = c5052d.m22623l().m22649a(a2, a3, config);
                    a4.eraseColor(i7);
                    canvas = new Canvas();
                    canvas.setBitmap(a4);
                    i6 = (int) Math.ceil((double) ((-r7.f18434e.getFontMetrics().top) + f3));
                    r7.f18435f.setColor(i8);
                    r7.f18435f.setStrokeWidth(2.0f * f3);
                    r7.f18434e.setColor(i9);
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    r7.f18434e.getTextPath(str, 0, str.length(), (float) ((int) ((float) Math.ceil((double) f3))), (float) i6, r7.f18436g);
                    if (obj != null) {
                        canvas.drawPath(r7.f18436g, r7.f18435f);
                    }
                    if (obj2 != null) {
                        canvas.drawPath(r7.f18436g, r7.f18434e);
                    }
                    c7490k2 = new C7490k(c5052d, false);
                    c7490k2.m32552c(true);
                    c7490k2.m32543a(a4, ceil, ceil2);
                    a4.recycle();
                    r7.f18437h.m22255c(c4992b2, c7490k2);
                    c7490k = c7490k2;
                }
            }
            config = Config.ARGB_4444;
            a4 = c5052d.m22623l().m22649a(a2, a3, config);
            a4.eraseColor(i7);
            canvas = new Canvas();
            canvas.setBitmap(a4);
            i6 = (int) Math.ceil((double) ((-r7.f18434e.getFontMetrics().top) + f3));
            r7.f18435f.setColor(i8);
            r7.f18435f.setStrokeWidth(2.0f * f3);
            r7.f18434e.setColor(i9);
            if (i8 != 0) {
            }
            if (i9 == 0) {
            }
            r7.f18434e.getTextPath(str, 0, str.length(), (float) ((int) ((float) Math.ceil((double) f3))), (float) i6, r7.f18436g);
            if (obj != null) {
                canvas.drawPath(r7.f18436g, r7.f18435f);
            }
            if (obj2 != null) {
                canvas.drawPath(r7.f18436g, r7.f18434e);
            }
            c7490k2 = new C7490k(c5052d, false);
            c7490k2.m32552c(true);
            c7490k2.m32543a(a4, ceil, ceil2);
            a4.recycle();
            r7.f18437h.m22255c(c4992b2, c7490k2);
            c7490k = c7490k2;
        }
        c7490k.m32556e();
        return c7490k;
    }

    /* renamed from: a */
    public final C7490k m22316a(String str, C4991a c4991a, ay ayVar, float f, int i, int i2, int i3) {
        C7490k c7490k = (C7490k) this.f18437h.m22251b((Object) new C4992b(str, c4991a, ayVar, f, i, i2, i3));
        if (c7490k != null) {
            c7490k.m32556e();
        }
        return c7490k;
    }

    /* renamed from: a */
    public final void m22317a() {
        this.f18437h.m22247a();
    }

    /* renamed from: b */
    public final void m22321b() {
        this.f18437h.m22248a(Math.max(this.f18437h.m22250b() / 2, 8));
    }

    /* renamed from: a */
    private void m22313a(C4991a c4991a, ay ayVar) {
        c4991a = c4991a == f18432c ? true : null;
        if (ayVar != null) {
            if (ayVar.m21585b()) {
                c4991a = true;
            }
            if (ayVar.m21586c() != null) {
                c4991a |= 2;
            }
        }
        this.f18434e.setTypeface(Typeface.defaultFromStyle(c4991a));
    }
}
