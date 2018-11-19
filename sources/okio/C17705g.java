package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: okio.g */
public class C17705g extends C15982q {
    /* renamed from: a */
    private C15982q f55104a;

    public C17705g(C15982q c15982q) {
        if (c15982q == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f55104a = c15982q;
    }

    /* renamed from: a */
    public final C15982q m64459a() {
        return this.f55104a;
    }

    /* renamed from: a */
    public final C17705g m64458a(C15982q c15982q) {
        if (c15982q == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f55104a = c15982q;
        return this;
    }

    /* renamed from: a */
    public C15982q mo13437a(long j, TimeUnit timeUnit) {
        return this.f55104a.mo13437a(j, timeUnit);
    }

    public long n_() {
        return this.f55104a.n_();
    }

    public boolean o_() {
        return this.f55104a.o_();
    }

    /* renamed from: d */
    public long mo13438d() {
        return this.f55104a.mo13438d();
    }

    /* renamed from: a */
    public C15982q mo13436a(long j) {
        return this.f55104a.mo13436a(j);
    }

    public C15982q p_() {
        return this.f55104a.p_();
    }

    /* renamed from: f */
    public C15982q mo13439f() {
        return this.f55104a.mo13439f();
    }

    /* renamed from: g */
    public void mo13440g() throws IOException {
        this.f55104a.mo13440g();
    }
}
