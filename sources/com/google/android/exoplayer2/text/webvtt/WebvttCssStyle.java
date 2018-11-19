package com.google.android.exoplayer2.text.webvtt;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.util.C2314v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class WebvttCssStyle {
    /* renamed from: a */
    private String f6607a;
    /* renamed from: b */
    private String f6608b;
    /* renamed from: c */
    private List<String> f6609c;
    /* renamed from: d */
    private String f6610d;
    /* renamed from: e */
    private String f6611e;
    /* renamed from: f */
    private int f6612f;
    /* renamed from: g */
    private boolean f6613g;
    /* renamed from: h */
    private int f6614h;
    /* renamed from: i */
    private boolean f6615i;
    /* renamed from: j */
    private int f6616j;
    /* renamed from: k */
    private int f6617k;
    /* renamed from: l */
    private int f6618l;
    /* renamed from: m */
    private int f6619m;
    /* renamed from: n */
    private int f6620n;
    /* renamed from: o */
    private float f6621o;
    /* renamed from: p */
    private Alignment f6622p;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    public WebvttCssStyle() {
        m8034a();
    }

    /* renamed from: a */
    public void m8034a() {
        this.f6607a = "";
        this.f6608b = "";
        this.f6609c = Collections.emptyList();
        this.f6610d = "";
        this.f6611e = null;
        this.f6613g = false;
        this.f6615i = false;
        this.f6616j = -1;
        this.f6617k = -1;
        this.f6618l = -1;
        this.f6619m = -1;
        this.f6620n = -1;
        this.f6622p = null;
    }

    /* renamed from: a */
    public void m8035a(String str) {
        this.f6607a = str;
    }

    /* renamed from: b */
    public void m8040b(String str) {
        this.f6608b = str;
    }

    /* renamed from: a */
    public void m8036a(String[] strArr) {
        this.f6609c = Arrays.asList(strArr);
    }

    /* renamed from: c */
    public void m8042c(String str) {
        this.f6610d = str;
    }

    /* renamed from: a */
    public int m8031a(String str, String str2, String[] strArr, String str3) {
        if (this.f6607a.isEmpty() && this.f6608b.isEmpty() && this.f6609c.isEmpty() && this.f6610d.isEmpty()) {
            return str2.isEmpty();
        }
        str = m8030a(m8030a(m8030a(0, this.f6607a, str, 1073741824), this.f6608b, str2, 2), this.f6610d, str3, 4);
        if (str != -1) {
            if (Arrays.asList(strArr).containsAll(this.f6609c) != null) {
                return str + (this.f6609c.size() * 4);
            }
        }
        return 0;
    }

    /* renamed from: b */
    public int m8037b() {
        if (this.f6618l == -1 && this.f6619m == -1) {
            return -1;
        }
        int i = 0;
        int i2 = this.f6618l == 1 ? 1 : 0;
        if (this.f6619m == 1) {
            i = 2;
        }
        return i2 | i;
    }

    /* renamed from: c */
    public boolean m8043c() {
        return this.f6616j == 1;
    }

    /* renamed from: d */
    public boolean m8045d() {
        return this.f6617k == 1;
    }

    /* renamed from: a */
    public WebvttCssStyle m8033a(boolean z) {
        this.f6617k = z;
        return this;
    }

    /* renamed from: b */
    public WebvttCssStyle m8039b(boolean z) {
        this.f6618l = z;
        return this;
    }

    /* renamed from: c */
    public WebvttCssStyle m8041c(boolean z) {
        this.f6619m = z;
        return this;
    }

    /* renamed from: e */
    public String m8046e() {
        return this.f6611e;
    }

    /* renamed from: d */
    public WebvttCssStyle m8044d(String str) {
        this.f6611e = C2314v.m8493d(str);
        return this;
    }

    /* renamed from: f */
    public int m8047f() {
        if (this.f6613g) {
            return this.f6612f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: a */
    public WebvttCssStyle m8032a(int i) {
        this.f6612f = i;
        this.f6613g = true;
        return this;
    }

    /* renamed from: g */
    public boolean m8048g() {
        return this.f6613g;
    }

    /* renamed from: h */
    public int m8049h() {
        if (this.f6615i) {
            return this.f6614h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public WebvttCssStyle m8038b(int i) {
        this.f6614h = i;
        this.f6615i = true;
        return this;
    }

    /* renamed from: i */
    public boolean m8050i() {
        return this.f6615i;
    }

    /* renamed from: j */
    public Alignment m8051j() {
        return this.f6622p;
    }

    /* renamed from: k */
    public int m8052k() {
        return this.f6620n;
    }

    /* renamed from: l */
    public float m8053l() {
        return this.f6621o;
    }

    /* renamed from: a */
    private static int m8030a(int i, String str, String str2, int i2) {
        if (!str.isEmpty()) {
            int i3 = -1;
            if (i != -1) {
                if (str.equals(str2) != null) {
                    i3 = i + i2;
                }
                return i3;
            }
        }
        return i;
    }
}
