package com.google.android.m4b.maps.cy;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.m4b.maps.ct.C5257e;
import com.google.android.m4b.maps.ct.C5259f;
import com.google.android.m4b.maps.ct.C5262h;
import com.google.android.m4b.maps.ct.C5265i;
import com.google.android.m4b.maps.ct.C5273l;
import com.google.android.m4b.maps.ct.C5274m;
import com.google.android.m4b.maps.ct.C5279t;
import com.google.android.m4b.maps.ct.C5292x;
import com.google.android.m4b.maps.ct.C5292x.C5291a;
import com.google.android.m4b.maps.ct.C7529s;
import com.google.android.m4b.maps.ct.C8085j;
import com.google.android.m4b.maps.ct.C8085j.C5268h;
import com.google.android.m4b.maps.ct.C8085j.C7528b;
import com.google.android.m4b.maps.ct.C8085j.C8207c;
import com.google.android.m4b.maps.ct.C8085j.C8208d;

/* renamed from: com.google.android.m4b.maps.cy.a */
public final class C8230a extends C8208d<C8230a, C8229a> implements C7531b {
    /* renamed from: d */
    private static volatile C7529s f29405d;
    /* renamed from: f */
    private static final C8230a f29406f = new C8230a(C5273l.f19593c, C5262h.m23371a());
    /* renamed from: g */
    private static volatile C5279t<C8230a> f29407g;
    private static final long serialVersionUID = 0;
    /* renamed from: e */
    private byte f29408e = (byte) -1;

    /* renamed from: com.google.android.m4b.maps.cy.a$a */
    public static final class C8229a extends C8207c<C8230a, C8229a> implements C7531b {
        private C8229a() {
            super(C8230a.f29406f);
        }
    }

    private C8230a(C5257e c5257e, C5262h c5262h) {
        C5291a b = C5292x.m23468b();
        Object obj = null;
        while (obj == null) {
            try {
                int a = c5257e.m23291a();
                if (a == 0 || !C8085j.m34398a(this.c, m34405h(), c5257e, b, c5262h, a)) {
                    obj = 1;
                }
            } catch (C5257e c5257e2) {
                throw new RuntimeException(c5257e2.m23418a(this));
            } catch (C5257e c5257e22) {
                throw new RuntimeException(new C5274m(c5257e22.getMessage()).m23418a(this));
            } catch (Throwable th) {
                this.a = b.m23464a();
                C8208d.m35004a((C5265i) this.c);
            }
        }
        this.a = b.m23464a();
        C8208d.m35004a((C5265i) this.c);
    }

    /* renamed from: a */
    public final void mo7636a(C5259f c5259f) {
        m35008d().m23405a(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, c5259f);
        this.a.m23472a(c5259f);
    }

    /* renamed from: a */
    public final int mo7634a() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        i = (m35012o() + 0) + this.a.m23473c();
        this.b = i;
        return i;
    }

    /* renamed from: a */
    protected final Object mo7635a(C5268h c5268h, Object obj, Object obj2) {
        switch (c5268h) {
            case PARSE_PARTIAL_FROM:
                return new C8230a((C5257e) obj, (C5262h) obj2);
            case NEW_INSTANCE:
                return new C8230a(C5273l.f19593c, C5262h.m23371a());
            case IS_INITIALIZED:
                c5268h = this.f29408e;
                if (c5268h == 1) {
                    return f29406f;
                }
                if (c5268h == null) {
                    return null;
                }
                c5268h = ((Boolean) obj).booleanValue();
                if (m35006b() == null) {
                    if (c5268h != null) {
                        this.f29408e = (byte) 0;
                    }
                    return null;
                }
                if (c5268h != null) {
                    this.f29408e = (byte) 1;
                }
                return f29406f;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new C8229a();
            case MERGE_FROM:
                if (obj == f29406f) {
                    return this;
                }
                C8230a c8230a = (C8230a) obj;
                m35005a((C8208d) c8230a);
                m34403a((C5292x) c8230a.a);
                return this;
            case GET_DEFAULT_INSTANCE:
                return f29406f;
            case GET_PARSER:
                if (f29407g == null) {
                    synchronized (C8230a.class) {
                        if (f29407g == null) {
                            f29407g = new C7528b(f29406f);
                        }
                    }
                }
                return f29407g;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: p */
    public static C8230a m35064p() {
        return f29406f;
    }
}
