package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C6071q;
import com.squareup.okhttp.C6075s;
import com.squareup.okhttp.C6075s.C6074a;
import com.squareup.okhttp.C6076t;
import java.io.IOException;
import okio.C15976k;
import okio.Sink;
import okio.Source;

/* renamed from: com.squareup.okhttp.internal.http.i */
public final class C7243i implements Transport {
    /* renamed from: a */
    private final C6050g f26134a;
    /* renamed from: b */
    private final C6047e f26135b;

    public C7243i(C6050g c6050g, C6047e c6047e) {
        this.f26134a = c6050g;
        this.f26135b = c6047e;
    }

    public Sink createRequestBody(C6071q c6071q, long j) throws IOException {
        if ("chunked".equalsIgnoreCase(c6071q.m26344a("Transfer-Encoding")) != null) {
            return this.f26135b.m26161h();
        }
        if (j != -1) {
            return this.f26135b.m26146a(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public void finishRequest() throws IOException {
        this.f26135b.m26157d();
    }

    public void writeRequestBody(C7245m c7245m) throws IOException {
        this.f26135b.m26150a(c7245m);
    }

    public void writeRequestHeaders(C6071q c6071q) throws IOException {
        this.f26134a.m26191b();
        this.f26135b.m26152a(c6071q.m26349e(), C6054l.m26222a(c6071q, this.f26134a.m26194e().m25834c().m26415b().type()));
    }

    public C6074a readResponseHeaders() throws IOException {
        return this.f26135b.m26160g();
    }

    public void releaseConnectionOnIdle() throws IOException {
        if (canReuseConnection()) {
            this.f26135b.m26148a();
        } else {
            this.f26135b.m26155b();
        }
    }

    public boolean canReuseConnection() {
        if ("close".equalsIgnoreCase(this.f26134a.m26192c().m26344a("Connection")) || "close".equalsIgnoreCase(this.f26134a.m26193d().m26394a("Connection")) || this.f26135b.m26156c()) {
            return false;
        }
        return true;
    }

    public C6076t openResponseBody(C6075s c6075s) throws IOException {
        return new C7244k(c6075s.m26401g(), C15976k.a(m31036a(c6075s)));
    }

    /* renamed from: a */
    private Source m31036a(C6075s c6075s) throws IOException {
        if (!C6050g.m26172a(c6075s)) {
            return this.f26135b.m26154b(0);
        }
        if ("chunked".equalsIgnoreCase(c6075s.m26394a("Transfer-Encoding"))) {
            return this.f26135b.m26147a(this.f26134a);
        }
        long a = C6053j.m26206a(c6075s);
        if (a != -1) {
            return this.f26135b.m26154b(a);
        }
        return this.f26135b.m26162i();
    }

    public void disconnect(C6050g c6050g) throws IOException {
        this.f26135b.m26153a((Object) c6050g);
    }
}
