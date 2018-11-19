package com.google.android.m4b.maps.an;

import com.google.android.m4b.maps.ct.C5257e;
import com.google.android.m4b.maps.ct.C5259f;
import com.google.android.m4b.maps.ct.C5262h;
import com.google.android.m4b.maps.ct.C5273l;
import com.google.android.m4b.maps.ct.C5274m;
import com.google.android.m4b.maps.ct.C5277o;
import com.google.android.m4b.maps.ct.C5278r;
import com.google.android.m4b.maps.ct.C5279t;
import com.google.android.m4b.maps.ct.C5292x;
import com.google.android.m4b.maps.ct.C5292x.C5291a;
import com.google.android.m4b.maps.ct.C7529s;
import com.google.android.m4b.maps.ct.C8085j;
import com.google.android.m4b.maps.ct.C8085j.C5268h;
import com.google.android.m4b.maps.ct.C8085j.C7528b;
import com.google.android.m4b.maps.ct.C8085j.C8084a;
import com.google.android.m4b.maps.cy.C8230a;

/* renamed from: com.google.android.m4b.maps.an.a */
public final class C4646a {

    /* renamed from: com.google.android.m4b.maps.an.a$b */
    public interface C6399b extends C5278r {
    }

    /* renamed from: com.google.android.m4b.maps.an.a$a */
    public static final class C8199a extends C8085j<C8199a, C8198a> implements C6399b {
        /* renamed from: g */
        private static volatile C7529s f29333g;
        /* renamed from: i */
        private static final C8199a f29334i = new C8199a(C5273l.f19593c, C5262h.m23371a());
        /* renamed from: j */
        private static volatile C5279t<C8199a> f29335j;
        private static final long serialVersionUID = 0;
        /* renamed from: c */
        private int f29336c;
        /* renamed from: d */
        private long f29337d = 0;
        /* renamed from: e */
        private long f29338e = 0;
        /* renamed from: f */
        private C5277o f29339f = new C5277o();
        /* renamed from: h */
        private byte f29340h = (byte) -1;

        /* renamed from: com.google.android.m4b.maps.an.a$a$a */
        public static final class C8198a extends C8084a<C8199a, C8198a> implements C6399b {
            private C8198a() {
                super(C8199a.f29334i);
            }

            /* renamed from: a */
            public final C8198a m34962a(long j) {
                mo7640b();
                ((C8199a) this.a).m34964a(j);
                return this;
            }

            /* renamed from: b */
            public final C8198a m34963b(long j) {
                mo7640b();
                ((C8199a) this.a).m34967b(j);
                return this;
            }
        }

        private C8199a(C5257e c5257e, C5262h c5262h) {
            this.f29339f.m23426c();
            C5291a b = C5292x.m23468b();
            Object obj = null;
            while (obj == null) {
                try {
                    int a = c5257e.m23291a();
                    if (a != 0) {
                        if (a == 9) {
                            this.f29336c |= 1;
                            this.f29337d = c5257e.m23302g();
                        } else if (a == 17) {
                            this.f29336c |= 2;
                            this.f29338e = c5257e.m23302g();
                        } else if (a == 26) {
                            this.f29339f.m23422a(c5257e.m23307l(), c5262h);
                            this.f29336c |= 4;
                        } else if (b.m23465a(a, c5257e)) {
                        }
                    }
                    obj = 1;
                } catch (C5257e c5257e2) {
                    throw new RuntimeException(c5257e2.m23418a(this));
                } catch (C5257e c5257e22) {
                    throw new RuntimeException(new C5274m(c5257e22.getMessage()).m23418a(this));
                } catch (Throwable th) {
                    this.a = b.m23464a();
                }
            }
            this.a = b.m23464a();
        }

        /* renamed from: n */
        private boolean m34971n() {
            return (this.f29336c & 1) == 1;
        }

        /* renamed from: a */
        private void m34964a(long j) {
            this.f29336c |= 1;
            this.f29337d = j;
        }

        /* renamed from: o */
        private boolean m34972o() {
            return (this.f29336c & 2) == 2;
        }

        /* renamed from: b */
        private void m34967b(long j) {
            this.f29336c |= 2;
            this.f29338e = j;
        }

        /* renamed from: p */
        private boolean m34973p() {
            return (this.f29336c & 4) == 4;
        }

        /* renamed from: a */
        public final void mo7636a(C5259f c5259f) {
            if ((this.f29336c & 1) == 1) {
                c5259f.m23352a(1, this.f29337d);
            }
            if ((this.f29336c & 2) == 2) {
                c5259f.m23352a(2, this.f29338e);
            }
            if ((this.f29336c & 4) == 4) {
                c5259f.m23353a(3, this.f29339f.m23428e());
            }
            this.a.m23472a(c5259f);
        }

        /* renamed from: a */
        public final int mo7634a() {
            int i = this.b;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f29336c & 1) == 1) {
                i2 = 0 + C5259f.m23333c(1, this.f29337d);
            }
            if ((this.f29336c & 2) == 2) {
                i2 += C5259f.m23333c(2, this.f29338e);
            }
            if ((this.f29336c & 4) == 4) {
                i2 += C5259f.m23318a(3, this.f29339f);
            }
            i2 += this.a.m23473c();
            this.b = i2;
            return i2;
        }

        /* renamed from: b */
        public static C8198a m34966b() {
            return (C8198a) f29334i.m34408k();
        }

        /* renamed from: a */
        protected final Object mo7635a(C5268h c5268h, Object obj, Object obj2) {
            switch (c5268h) {
                case PARSE_PARTIAL_FROM:
                    return new C8199a((C5257e) obj, (C5262h) obj2);
                case NEW_INSTANCE:
                    return new C8199a(C5273l.f19593c, C5262h.m23371a());
                case IS_INITIALIZED:
                    c5268h = this.f29340h;
                    if (c5268h == 1) {
                        return f29334i;
                    }
                    if (c5268h == null) {
                        return null;
                    }
                    c5268h = ((Boolean) obj).booleanValue();
                    if (m34971n() == null) {
                        if (c5268h != null) {
                            this.f29340h = (byte) 0;
                        }
                        return null;
                    } else if (m34972o() == null) {
                        if (c5268h != null) {
                            this.f29340h = (byte) 0;
                        }
                        return null;
                    } else if (m34973p() == null || ((C8230a) this.f29339f.m23421a(C8230a.m35064p())).mo7578j() != null) {
                        if (c5268h != null) {
                            this.f29340h = (byte) 1;
                        }
                        return f29334i;
                    } else {
                        if (c5268h != null) {
                            this.f29340h = (byte) 0;
                        }
                        return null;
                    }
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new C8198a();
                case MERGE_FROM:
                    if (obj == f29334i) {
                        return this;
                    }
                    C8199a c8199a = (C8199a) obj;
                    if (c8199a.m34971n() != null) {
                        m34964a(c8199a.f29337d);
                    }
                    if (c8199a.m34972o() != null) {
                        m34967b(c8199a.f29338e);
                    }
                    if (c8199a.m34973p() != null) {
                        this.f29339f.m23423a(c8199a.f29339f);
                        this.f29336c |= 4;
                    }
                    m34403a((C5292x) c8199a.a);
                    return this;
                case GET_DEFAULT_INSTANCE:
                    return f29334i;
                case GET_PARSER:
                    if (f29335j == null) {
                        synchronized (C8199a.class) {
                            if (f29335j == null) {
                                f29335j = new C7528b(f29334i);
                            }
                        }
                    }
                    return f29335j;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* renamed from: c */
        public static C8199a m34969c() {
            return f29334i;
        }
    }
}
