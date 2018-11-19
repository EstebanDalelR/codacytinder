package com.google.android.gms.internal;

import java.io.IOException;

public final class mi extends adz<mi> {
    /* renamed from: a */
    public String f26931a;
    /* renamed from: b */
    public Long f26932b;
    /* renamed from: c */
    private String f26933c;
    /* renamed from: d */
    private String f26934d;
    /* renamed from: e */
    private String f26935e;
    /* renamed from: f */
    private Long f26936f;
    /* renamed from: g */
    private Long f26937g;
    /* renamed from: h */
    private String f26938h;
    /* renamed from: i */
    private Long f26939i;
    /* renamed from: j */
    private String f26940j;

    public mi() {
        this.f26931a = null;
        this.f26932b = null;
        this.f26933c = null;
        this.f26934d = null;
        this.f26935e = null;
        this.f26936f = null;
        this.f26937g = null;
        this.f26938h = null;
        this.f26939i = null;
        this.f26940j = null;
        this.Y = -1;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f26931a != null) {
            a += ady.m19010b(1, this.f26931a);
        }
        if (this.f26932b != null) {
            a += ady.m19017d(2, this.f26932b.longValue());
        }
        if (this.f26933c != null) {
            a += ady.m19010b(3, this.f26933c);
        }
        if (this.f26934d != null) {
            a += ady.m19010b(4, this.f26934d);
        }
        if (this.f26935e != null) {
            a += ady.m19010b(5, this.f26935e);
        }
        if (this.f26936f != null) {
            a += ady.m19017d(6, this.f26936f.longValue());
        }
        if (this.f26937g != null) {
            a += ady.m19017d(7, this.f26937g.longValue());
        }
        if (this.f26938h != null) {
            a += ady.m19010b(8, this.f26938h);
        }
        if (this.f26939i != null) {
            a += ady.m19017d(9, this.f26939i.longValue());
        }
        return this.f26940j != null ? a + ady.m19010b(10, this.f26940j) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            switch (a) {
                case 0:
                    return this;
                case 10:
                    this.f26931a = adx.m18989e();
                    break;
                case 16:
                    this.f26932b = Long.valueOf(adx.m18994i());
                    break;
                case 26:
                    this.f26933c = adx.m18989e();
                    break;
                case 34:
                    this.f26934d = adx.m18989e();
                    break;
                case 42:
                    this.f26935e = adx.m18989e();
                    break;
                case 48:
                    this.f26936f = Long.valueOf(adx.m18994i());
                    break;
                case 56:
                    this.f26937g = Long.valueOf(adx.m18994i());
                    break;
                case 66:
                    this.f26938h = adx.m18989e();
                    break;
                case 72:
                    this.f26939i = Long.valueOf(adx.m18994i());
                    break;
                case 82:
                    this.f26940j = adx.m18989e();
                    break;
                default:
                    if (super.m27063a(adx, a)) {
                        break;
                    }
                    return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26931a != null) {
            ady.m19024a(1, this.f26931a);
        }
        if (this.f26932b != null) {
            ady.m19028b(2, this.f26932b.longValue());
        }
        if (this.f26933c != null) {
            ady.m19024a(3, this.f26933c);
        }
        if (this.f26934d != null) {
            ady.m19024a(4, this.f26934d);
        }
        if (this.f26935e != null) {
            ady.m19024a(5, this.f26935e);
        }
        if (this.f26936f != null) {
            ady.m19028b(6, this.f26936f.longValue());
        }
        if (this.f26937g != null) {
            ady.m19028b(7, this.f26937g.longValue());
        }
        if (this.f26938h != null) {
            ady.m19024a(8, this.f26938h);
        }
        if (this.f26939i != null) {
            ady.m19028b(9, this.f26939i.longValue());
        }
        if (this.f26940j != null) {
            ady.m19024a(10, this.f26940j);
        }
        super.mo4218a(ady);
    }
}
