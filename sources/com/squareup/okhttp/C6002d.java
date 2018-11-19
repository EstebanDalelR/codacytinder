package com.squareup.okhttp;

import com.squareup.okhttp.Interceptor.Chain;
import com.squareup.okhttp.internal.C6021d;
import com.squareup.okhttp.internal.C6022e;
import com.squareup.okhttp.internal.http.C6050g;
import com.squareup.okhttp.internal.http.RouteException;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.squareup.okhttp.d */
public class C6002d {
    /* renamed from: a */
    volatile boolean f21948a;
    /* renamed from: b */
    C6071q f21949b;
    /* renamed from: c */
    C6050g f21950c;
    /* renamed from: d */
    private final C6068p f21951d;
    /* renamed from: e */
    private boolean f21952e;

    /* renamed from: com.squareup.okhttp.d$a */
    class C7209a implements Chain {
        /* renamed from: a */
        final /* synthetic */ C6002d f26010a;
        /* renamed from: b */
        private final int f26011b;
        /* renamed from: c */
        private final C6071q f26012c;
        /* renamed from: d */
        private final boolean f26013d;

        public C6007g connection() {
            return null;
        }

        C7209a(C6002d c6002d, int i, C6071q c6071q, boolean z) {
            this.f26010a = c6002d;
            this.f26011b = i;
            this.f26012c = c6071q;
            this.f26013d = z;
        }

        public C6071q request() {
            return this.f26012c;
        }

        public C6075s proceed(C6071q c6071q) throws IOException {
            if (this.f26011b >= this.f26010a.f21951d.m26319w().size()) {
                return this.f26010a.m25811a(c6071q, this.f26013d);
            }
            Chain c7209a = new C7209a(this.f26010a, this.f26011b + 1, c6071q, this.f26013d);
            Interceptor interceptor = (Interceptor) this.f26010a.f21951d.m26319w().get(this.f26011b);
            C6075s intercept = interceptor.intercept(c7209a);
            if (intercept != null) {
                return intercept;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("application interceptor ");
            stringBuilder.append(interceptor);
            stringBuilder.append(" returned null");
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    /* renamed from: com.squareup.okhttp.d$b */
    final class C7210b extends C6022e {
        /* renamed from: a */
        final /* synthetic */ C6002d f26014a;
        /* renamed from: c */
        private final Callback f26015c;
        /* renamed from: d */
        private final boolean f26016d;

        private C7210b(C6002d c6002d, Callback callback, boolean z) {
            this.f26014a = c6002d;
            super("OkHttp %s", c6002d.f21949b.m26347c());
            this.f26015c = callback;
            this.f26016d = z;
        }

        /* renamed from: a */
        String m30955a() {
            return this.f26014a.f21949b.m26343a().m25744g();
        }

        /* renamed from: b */
        protected void mo6491b() {
            Throwable e;
            Logger logger;
            Level level;
            StringBuilder stringBuilder;
            Object obj = 1;
            try {
                C6075s a = this.f26014a.m25806a(this.f26016d);
                if (this.f26014a.f21948a) {
                    try {
                        this.f26015c.onFailure(this.f26014a.f21949b, new IOException("Canceled"));
                    } catch (IOException e2) {
                        e = e2;
                        if (obj == null) {
                            this.f26015c.onFailure(this.f26014a.f21950c != null ? this.f26014a.f21950c.m26192c() : this.f26014a.f21949b, e);
                        } else {
                            try {
                                logger = C6021d.f22040a;
                                level = Level.INFO;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Callback failure for ");
                                stringBuilder.append(this.f26014a.m25809b());
                                logger.log(level, stringBuilder.toString(), e);
                            } catch (Throwable th) {
                                this.f26014a.f21951d.m26316t().m26264b(this);
                            }
                        }
                        this.f26014a.f21951d.m26316t().m26264b(this);
                    }
                }
                this.f26015c.onResponse(a);
            } catch (Throwable e3) {
                e = e3;
                obj = null;
                if (obj == null) {
                    logger = C6021d.f22040a;
                    level = Level.INFO;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Callback failure for ");
                    stringBuilder.append(this.f26014a.m25809b());
                    logger.log(level, stringBuilder.toString(), e);
                } else {
                    if (this.f26014a.f21950c != null) {
                    }
                    this.f26015c.onFailure(this.f26014a.f21950c != null ? this.f26014a.f21950c.m26192c() : this.f26014a.f21949b, e);
                }
                this.f26014a.f21951d.m26316t().m26264b(this);
            }
            this.f26014a.f21951d.m26316t().m26264b(this);
        }
    }

    protected C6002d(C6068p c6068p, C6071q c6071q) {
        this.f21951d = c6068p.m26321y();
        this.f21949b = c6071q;
    }

    /* renamed from: a */
    public C6075s m25810a() throws IOException {
        synchronized (this) {
            if (this.f21952e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f21952e = true;
        }
        try {
            this.f21951d.m26316t().m26263a(this);
            C6075s a = m25806a(false);
            if (a != null) {
                return a;
            }
            throw new IOException("Canceled");
        } finally {
            this.f21951d.m26316t().m26265b(this);
        }
    }

    /* renamed from: a */
    public void m25812a(Callback callback) {
        m25813a(callback, false);
    }

    /* renamed from: a */
    void m25813a(Callback callback, boolean z) {
        synchronized (this) {
            if (this.f21952e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f21952e = true;
        }
        this.f21951d.m26316t().m26262a(new C7210b(callback, z));
    }

    /* renamed from: b */
    private String m25809b() {
        String str = this.f21948a ? "canceled call" : "call";
        HttpUrl c = this.f21949b.m26343a().m25739c("/...");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" to ");
        stringBuilder.append(c);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private C6075s m25806a(boolean z) throws IOException {
        return new C7209a(this, 0, this.f21949b, z).proceed(this.f21949b);
    }

    /* renamed from: a */
    C6075s m25811a(C6071q c6071q, boolean z) throws IOException {
        C6050g a;
        C6072r f = c6071q.m26350f();
        if (f != null) {
            c6071q = c6071q.m26351g();
            C6067o a2 = f.mo6564a();
            if (a2 != null) {
                c6071q.m26334a(ManagerWebServices.PARAM_CONTENT_TYPE, a2.toString());
            }
            long b = f.mo6566b();
            if (b != -1) {
                c6071q.m26334a("Content-Length", Long.toString(b));
                c6071q.m26336b("Transfer-Encoding");
            } else {
                c6071q.m26334a("Transfer-Encoding", "chunked");
                c6071q.m26336b("Content-Length");
            }
            c6071q = c6071q.m26335a();
        }
        this.f21950c = new C6050g(this.f21951d, c6071q, false, false, z, null, null, null, null);
        c6071q = null;
        while (!this.f21948a) {
            try {
                this.f21950c.m26187a();
                this.f21950c.m26198i();
                C6075s d = this.f21950c.m26193d();
                C6071q j = this.f21950c.m26199j();
                if (j == null) {
                    if (!z) {
                        this.f21950c.m26196g();
                    }
                    return d;
                }
                c6071q++;
                if (c6071q > 20) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Too many follow-up requests: ");
                    stringBuilder.append(c6071q);
                    throw new ProtocolException(stringBuilder.toString());
                }
                if (!this.f21950c.m26189a(j.m26343a())) {
                    this.f21950c.m26196g();
                }
                this.f21950c = new C6050g(this.f21951d, j, false, false, z, this.f21950c.m26197h(), null, null, d);
            } catch (C6071q c6071q2) {
                throw c6071q2.m26122a();
            } catch (RouteException e) {
                a = this.f21950c.m26185a(e);
                if (a != null) {
                    this.f21950c = a;
                } else {
                    throw e.m26124a();
                }
            } catch (IOException e2) {
                a = this.f21950c.m26186a(e2, null);
                if (a != null) {
                    this.f21950c = a;
                } else {
                    throw e2;
                }
            }
        }
        this.f21950c.m26196g();
        throw new IOException("Canceled");
    }
}
