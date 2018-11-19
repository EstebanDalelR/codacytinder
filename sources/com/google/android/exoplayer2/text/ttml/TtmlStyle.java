package com.google.android.exoplayer2.text.ttml;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.util.C2289a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

final class TtmlStyle {
    /* renamed from: a */
    private String f6569a;
    /* renamed from: b */
    private int f6570b;
    /* renamed from: c */
    private boolean f6571c;
    /* renamed from: d */
    private int f6572d;
    /* renamed from: e */
    private boolean f6573e;
    /* renamed from: f */
    private int f6574f = -1;
    /* renamed from: g */
    private int f6575g = -1;
    /* renamed from: h */
    private int f6576h = -1;
    /* renamed from: i */
    private int f6577i = -1;
    /* renamed from: j */
    private int f6578j = -1;
    /* renamed from: k */
    private float f6579k;
    /* renamed from: l */
    private String f6580l;
    /* renamed from: m */
    private TtmlStyle f6581m;
    /* renamed from: n */
    private Alignment f6582n;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    /* renamed from: a */
    public int m7988a() {
        if (this.f6576h == -1 && this.f6577i == -1) {
            return -1;
        }
        int i = 0;
        int i2 = this.f6576h == 1 ? 1 : 0;
        if (this.f6577i == 1) {
            i = 2;
        }
        return i2 | i;
    }

    /* renamed from: b */
    public boolean m7998b() {
        return this.f6574f == 1;
    }

    /* renamed from: a */
    public TtmlStyle m7994a(boolean z) {
        C2289a.m8313b(this.f6581m == null);
        this.f6574f = z;
        return this;
    }

    /* renamed from: c */
    public boolean m8001c() {
        return this.f6575g == 1;
    }

    /* renamed from: b */
    public TtmlStyle m7997b(boolean z) {
        C2289a.m8313b(this.f6581m == null);
        this.f6575g = z;
        return this;
    }

    /* renamed from: c */
    public TtmlStyle m8000c(boolean z) {
        C2289a.m8313b(this.f6581m == null);
        this.f6576h = z;
        return this;
    }

    /* renamed from: d */
    public TtmlStyle m8002d(boolean z) {
        C2289a.m8313b(this.f6581m == null);
        this.f6577i = z;
        return this;
    }

    /* renamed from: d */
    public String m8003d() {
        return this.f6569a;
    }

    /* renamed from: a */
    public TtmlStyle m7993a(String str) {
        C2289a.m8313b(this.f6581m == null);
        this.f6569a = str;
        return this;
    }

    /* renamed from: e */
    public int m8004e() {
        if (this.f6571c) {
            return this.f6570b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: a */
    public TtmlStyle m7990a(int i) {
        C2289a.m8313b(this.f6581m == null);
        this.f6570b = i;
        this.f6571c = true;
        return this;
    }

    /* renamed from: f */
    public boolean m8005f() {
        return this.f6571c;
    }

    /* renamed from: g */
    public int m8006g() {
        if (this.f6573e) {
            return this.f6572d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: b */
    public TtmlStyle m7995b(int i) {
        this.f6572d = i;
        this.f6573e = true;
        return this;
    }

    /* renamed from: h */
    public boolean m8007h() {
        return this.f6573e;
    }

    /* renamed from: a */
    public TtmlStyle m7992a(TtmlStyle ttmlStyle) {
        return m7987a(ttmlStyle, true);
    }

    /* renamed from: a */
    private TtmlStyle m7987a(TtmlStyle ttmlStyle, boolean z) {
        if (ttmlStyle != null) {
            if (!this.f6571c && ttmlStyle.f6571c) {
                m7990a(ttmlStyle.f6570b);
            }
            if (this.f6576h == -1) {
                this.f6576h = ttmlStyle.f6576h;
            }
            if (this.f6577i == -1) {
                this.f6577i = ttmlStyle.f6577i;
            }
            if (this.f6569a == null) {
                this.f6569a = ttmlStyle.f6569a;
            }
            if (this.f6574f == -1) {
                this.f6574f = ttmlStyle.f6574f;
            }
            if (this.f6575g == -1) {
                this.f6575g = ttmlStyle.f6575g;
            }
            if (this.f6582n == null) {
                this.f6582n = ttmlStyle.f6582n;
            }
            if (this.f6578j == -1) {
                this.f6578j = ttmlStyle.f6578j;
                this.f6579k = ttmlStyle.f6579k;
            }
            if (z && !this.f6573e && ttmlStyle.f6573e) {
                m7995b(ttmlStyle.f6572d);
            }
        }
        return this;
    }

    /* renamed from: b */
    public TtmlStyle m7996b(String str) {
        this.f6580l = str;
        return this;
    }

    /* renamed from: i */
    public String m8008i() {
        return this.f6580l;
    }

    /* renamed from: j */
    public Alignment m8009j() {
        return this.f6582n;
    }

    /* renamed from: a */
    public TtmlStyle m7991a(Alignment alignment) {
        this.f6582n = alignment;
        return this;
    }

    /* renamed from: a */
    public TtmlStyle m7989a(float f) {
        this.f6579k = f;
        return this;
    }

    /* renamed from: c */
    public TtmlStyle m7999c(int i) {
        this.f6578j = i;
        return this;
    }

    /* renamed from: k */
    public int m8010k() {
        return this.f6578j;
    }

    /* renamed from: l */
    public float m8011l() {
        return this.f6579k;
    }
}
