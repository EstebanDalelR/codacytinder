package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.C15905b;
import okhttp3.internal.cache.C17656a;
import okhttp3.internal.connection.C15921f;
import okhttp3.internal.connection.C17657a;
import okhttp3.internal.http.C17660a;
import okhttp3.internal.http.C17661b;
import okhttp3.internal.http.C17662f;
import okhttp3.internal.http.C17664i;
import okhttp3.internal.p461b.C15904f;

/* renamed from: okhttp3.p */
final class C17694p implements Call {
    /* renamed from: a */
    final C17692o f55071a;
    /* renamed from: b */
    final C17664i f55072b;
    /* renamed from: c */
    final C15963q f55073c;
    /* renamed from: d */
    final boolean f55074d;
    /* renamed from: e */
    private EventListener f55075e;
    /* renamed from: f */
    private boolean f55076f;

    /* renamed from: okhttp3.p$a */
    final class C17693a extends C15905b {
        /* renamed from: a */
        final /* synthetic */ C17694p f55069a;
        /* renamed from: c */
        private final Callback f55070c;

        C17693a(C17694p c17694p, Callback callback) {
            this.f55069a = c17694p;
            super("OkHttp %s", c17694p.m64426d());
            this.f55070c = callback;
        }

        /* renamed from: a */
        String m64417a() {
            return this.f55069a.f55073c.m60526a().m60010g();
        }

        /* renamed from: b */
        C17694p m64418b() {
            return this.f55069a;
        }

        /* renamed from: c */
        protected void mo13367c() {
            IOException e;
            C15904f c;
            StringBuilder stringBuilder;
            Object obj = 1;
            try {
                C15966s e2 = this.f55069a.m64427e();
                if (this.f55069a.f55072b.m64328b()) {
                    try {
                        this.f55070c.onFailure(this.f55069a, new IOException("Canceled"));
                    } catch (IOException e3) {
                        e = e3;
                        if (obj == null) {
                            this.f55069a.f55075e.m59945a(this.f55069a, e);
                            this.f55070c.onFailure(this.f55069a, e);
                        } else {
                            try {
                                c = C15904f.m60134c();
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Callback failure for ");
                                stringBuilder.append(this.f55069a.m64425c());
                                c.mo13338a(4, stringBuilder.toString(), (Throwable) e);
                            } catch (Throwable th) {
                                this.f55069a.f55071a.m64410t().m60107b(this);
                            }
                        }
                        this.f55069a.f55071a.m64410t().m60107b(this);
                    }
                }
                this.f55070c.onResponse(this.f55069a, e2);
            } catch (Throwable e4) {
                e = e4;
                obj = null;
                if (obj == null) {
                    c = C15904f.m60134c();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Callback failure for ");
                    stringBuilder.append(this.f55069a.m64425c());
                    c.mo13338a(4, stringBuilder.toString(), (Throwable) e);
                } else {
                    this.f55069a.f55075e.m59945a(this.f55069a, e);
                    this.f55070c.onFailure(this.f55069a, e);
                }
                this.f55069a.f55071a.m64410t().m60107b(this);
            }
            this.f55069a.f55071a.m64410t().m60107b(this);
        }
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m64423a();
    }

    /* renamed from: clone */
    public /* synthetic */ Call m71772clone() {
        return m64423a();
    }

    private C17694p(C17692o c17692o, C15963q c15963q, boolean z) {
        this.f55071a = c17692o;
        this.f55073c = c15963q;
        this.f55074d = z;
        this.f55072b = new C17664i(c17692o, z);
    }

    /* renamed from: a */
    static C17694p m64421a(C17692o c17692o, C15963q c15963q, boolean z) {
        C17694p c17694p = new C17694p(c17692o, c15963q, z);
        c17694p.f55075e = c17692o.m64415y().create(c17694p);
        return c17694p;
    }

    public C15963q request() {
        return this.f55073c;
    }

    public C15966s execute() throws IOException {
        synchronized (this) {
            if (this.f55076f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f55076f = true;
        }
        m64422f();
        this.f55075e.m59943a((Call) this);
        try {
            this.f55071a.m64410t().m60105a(this);
            C15966s e = m64427e();
            if (e == null) {
                throw new IOException("Canceled");
            }
            this.f55071a.m64410t().m60108b(this);
            return e;
        } catch (IOException e2) {
            this.f55075e.m59945a((Call) this, e2);
            throw e2;
        } catch (Throwable th) {
            this.f55071a.m64410t().m60108b(this);
        }
    }

    /* renamed from: f */
    private void m64422f() {
        this.f55072b.m64327a(C15904f.m60134c().mo13335a("response.body().close()"));
    }

    public void enqueue(Callback callback) {
        synchronized (this) {
            if (this.f55076f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f55076f = true;
        }
        m64422f();
        this.f55075e.m59943a((Call) this);
        this.f55071a.m64410t().m60104a(new C17693a(this, callback));
    }

    public void cancel() {
        this.f55072b.m64326a();
    }

    public synchronized boolean isExecuted() {
        return this.f55076f;
    }

    public boolean isCanceled() {
        return this.f55072b.m64328b();
    }

    /* renamed from: a */
    public C17694p m64423a() {
        return C17694p.m64421a(this.f55071a, this.f55073c, this.f55074d);
    }

    /* renamed from: b */
    C15921f m64424b() {
        return this.f55072b.m64329c();
    }

    /* renamed from: c */
    String m64425c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(isCanceled() ? "canceled " : "");
        stringBuilder.append(this.f55074d ? "web socket" : "call");
        stringBuilder.append(" to ");
        stringBuilder.append(m64426d());
        return stringBuilder.toString();
    }

    /* renamed from: d */
    String m64426d() {
        return this.f55073c.m60526a().m60019p();
    }

    /* renamed from: e */
    C15966s m64427e() throws IOException {
        List arrayList = new ArrayList();
        arrayList.addAll(this.f55071a.m64413w());
        arrayList.add(this.f55072b);
        arrayList.add(new C17660a(this.f55071a.m64397g()));
        arrayList.add(new C17656a(this.f55071a.m64398h()));
        arrayList.add(new C17657a(this.f55071a));
        if (!this.f55074d) {
            arrayList.addAll(this.f55071a.m64414x());
        }
        arrayList.add(new C17661b(this.f55074d));
        return new C17662f(arrayList, null, null, null, 0, this.f55073c, this, this.f55075e, this.f55071a.m64391a(), this.f55071a.m64392b(), this.f55071a.m64393c()).proceed(this.f55073c);
    }
}
