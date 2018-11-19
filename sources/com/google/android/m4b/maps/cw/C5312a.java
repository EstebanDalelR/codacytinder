package com.google.android.m4b.maps.cw;

import com.google.android.m4b.maps.an.C4646a.C8199a;
import com.google.android.m4b.maps.ct.C5257e;
import com.google.android.m4b.maps.ct.C5259f;
import com.google.android.m4b.maps.ct.C5262h;
import com.google.android.m4b.maps.ct.C5265i;
import com.google.android.m4b.maps.ct.C5273l;
import com.google.android.m4b.maps.ct.C5274m;
import com.google.android.m4b.maps.ct.C5277o;
import com.google.android.m4b.maps.ct.C5279t;
import com.google.android.m4b.maps.ct.C5292x;
import com.google.android.m4b.maps.ct.C5292x.C5291a;
import com.google.android.m4b.maps.ct.C7529s;
import com.google.android.m4b.maps.ct.C8085j;
import com.google.android.m4b.maps.ct.C8085j.C5268h;
import com.google.android.m4b.maps.ct.C8085j.C6649e;
import com.google.android.m4b.maps.ct.C8085j.C7528b;
import com.google.android.m4b.maps.ct.C8085j.C8207c;
import com.google.android.m4b.maps.ct.C8085j.C8208d;
import com.google.android.m4b.maps.ct.C8085j.C8208d.C5267a;

/* renamed from: com.google.android.m4b.maps.cw.a */
public final class C5312a {

    /* renamed from: com.google.android.m4b.maps.cw.a$b */
    public interface C7530b extends C6649e<C8228a, C8227a> {
    }

    /* renamed from: com.google.android.m4b.maps.cw.a$a */
    public static final class C8228a extends C8208d<C8228a, C8227a> implements C7530b {
        /* renamed from: g */
        private static volatile C7529s f29398g;
        /* renamed from: i */
        private static final C8228a f29399i = new C8228a(C5273l.f19593c, C5262h.m23371a());
        /* renamed from: j */
        private static volatile C5279t<C8228a> f29400j;
        private static final long serialVersionUID = 0;
        /* renamed from: d */
        private int f29401d;
        /* renamed from: e */
        private C5277o f29402e = new C5277o();
        /* renamed from: f */
        private String f29403f;
        /* renamed from: h */
        private byte f29404h = (byte) -1;

        /* renamed from: com.google.android.m4b.maps.cw.a$a$a */
        public static final class C8227a extends C8207c<C8228a, C8227a> implements C7530b {
            private C8227a() {
                super(C8228a.f29399i);
            }

            /* renamed from: a */
            public final C8227a m35052a(C8199a c8199a) {
                mo7640b();
                C8228a.m35054a((C8228a) this.a, c8199a);
                return this;
            }

            /* renamed from: a */
            public final C8227a m35053a(String str) {
                mo7640b();
                C8228a.m35055a((C8228a) this.a, str);
                return this;
            }
        }

        private C8228a(C5257e c5257e, C5262h c5262h) {
            this.f29402e.m23426c();
            this.f29403f = "";
            C5291a b = C5292x.m23468b();
            Object obj = null;
            while (obj == null) {
                try {
                    int a = c5257e.m23291a();
                    if (a != 0) {
                        if (a == 10) {
                            this.f29402e.m23422a(c5257e.m23307l(), c5262h);
                            this.f29401d |= 1;
                        } else if (a == 18) {
                            String j = c5257e.m23305j();
                            this.f29401d |= 2;
                            this.f29403f = j;
                        } else if (C8085j.m34398a(this.c, m34405h(), c5257e, b, c5262h, a)) {
                        }
                    }
                    obj = 1;
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

        /* renamed from: p */
        public final boolean m35061p() {
            return (this.f29401d & 1) == 1;
        }

        /* renamed from: q */
        public final C8199a m35062q() {
            return (C8199a) this.f29402e.m23421a(C8199a.m34969c());
        }

        /* renamed from: r */
        public final String m35063r() {
            return this.f29403f;
        }

        /* renamed from: a */
        public final void mo7636a(C5259f c5259f) {
            C5267a c = m35007c();
            if ((this.f29401d & 1) == 1) {
                c5259f.m23353a(1, this.f29402e.m23428e());
            }
            if ((this.f29401d & 2) == 2) {
                c5259f.m23354a(2, this.f29403f);
            }
            c.m23405a(536870912, c5259f);
            this.a.m23472a(c5259f);
        }

        /* renamed from: a */
        public final int mo7634a() {
            int i = this.b;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f29401d & 1) == 1) {
                i2 = 0 + C5259f.m23318a(1, this.f29402e);
            }
            if ((this.f29401d & 2) == 2) {
                i2 += C5259f.m23326b(2, this.f29403f);
            }
            i2 = (i2 + m35011n()) + this.a.m23473c();
            this.b = i2;
            return i2;
        }

        /* renamed from: s */
        public static C8227a m35056s() {
            return (C8227a) f29399i.m34408k();
        }

        /* renamed from: a */
        protected final Object mo7635a(C5268h c5268h, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (c5268h) {
                case PARSE_PARTIAL_FROM:
                    return new C8228a((C5257e) obj, (C5262h) obj2);
                case NEW_INSTANCE:
                    return new C8228a(C5273l.f19593c, C5262h.m23371a());
                case IS_INITIALIZED:
                    c5268h = this.f29404h;
                    if (c5268h == 1) {
                        return f29399i;
                    }
                    if (c5268h == null) {
                        return null;
                    }
                    c5268h = ((Boolean) obj).booleanValue();
                    if (m35061p() != null && m35062q().mo7578j() == null) {
                        if (c5268h != null) {
                            this.f29404h = (byte) 0;
                        }
                        return null;
                    } else if (m35006b() == null) {
                        if (c5268h != null) {
                            this.f29404h = (byte) 0;
                        }
                        return null;
                    } else {
                        if (c5268h != null) {
                            this.f29404h = (byte) 1;
                        }
                        return f29399i;
                    }
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new C8227a();
                case MERGE_FROM:
                    if (obj == f29399i) {
                        return this;
                    }
                    C8228a c8228a = (C8228a) obj;
                    if (c8228a.m35061p() != null) {
                        this.f29402e.m23423a(c8228a.f29402e);
                        this.f29401d |= 1;
                    }
                    if ((c8228a.f29401d & 2) == 2) {
                        b = (byte) 1;
                    }
                    if (b != (byte) 0) {
                        this.f29401d |= 2;
                        this.f29403f = c8228a.f29403f;
                    }
                    m35005a((C8208d) c8228a);
                    m34403a((C5292x) c8228a.a);
                    return this;
                case GET_DEFAULT_INSTANCE:
                    return f29399i;
                case GET_PARSER:
                    if (f29400j == null) {
                        synchronized (C8228a.class) {
                            if (f29400j == null) {
                                f29400j = new C7528b(f29399i);
                            }
                        }
                    }
                    return f29400j;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m35054a(C8228a c8228a, C8199a c8199a) {
            if (c8199a == null) {
                throw new NullPointerException();
            }
            c8228a.f29402e.m23425b(c8199a);
            c8228a.f29401d |= 1;
        }

        /* renamed from: a */
        static /* synthetic */ void m35055a(C8228a c8228a, String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            c8228a.f29401d |= 2;
            c8228a.f29403f = str;
        }
    }
}
