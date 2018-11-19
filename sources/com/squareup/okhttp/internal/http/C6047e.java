package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C6007g;
import com.squareup.okhttp.C6009h;
import com.squareup.okhttp.C6066n;
import com.squareup.okhttp.C6066n.C6065a;
import com.squareup.okhttp.C6075s.C6074a;
import com.squareup.okhttp.internal.C6021d;
import com.squareup.okhttp.internal.C6058i;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C15976k;
import okio.C15982q;
import okio.C17705g;
import okio.C18549c;
import okio.Sink;
import okio.Source;

/* renamed from: com.squareup.okhttp.internal.http.e */
public final class C6047e {
    /* renamed from: a */
    private final C6009h f22154a;
    /* renamed from: b */
    private final C6007g f22155b;
    /* renamed from: c */
    private final Socket f22156c;
    /* renamed from: d */
    private final BufferedSource f22157d;
    /* renamed from: e */
    private final BufferedSink f22158e;
    /* renamed from: f */
    private int f22159f = 0;
    /* renamed from: g */
    private int f22160g = 0;

    /* renamed from: com.squareup.okhttp.internal.http.e$a */
    private abstract class C7237a implements Source {
        /* renamed from: a */
        protected final C17705g f26115a;
        /* renamed from: b */
        protected boolean f26116b;
        /* renamed from: c */
        final /* synthetic */ C6047e f26117c;

        private C7237a(C6047e c6047e) {
            this.f26117c = c6047e;
            this.f26115a = new C17705g(this.f26117c.f22157d.timeout());
        }

        public C15982q timeout() {
            return this.f26115a;
        }

        /* renamed from: a */
        protected final void m31032a(boolean z) throws IOException {
            if (this.f26117c.f22159f != 5) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("state: ");
                stringBuilder.append(this.f26117c.f22159f);
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.f26117c.m26139a(this.f26115a);
            this.f26117c.f22159f = 0;
            if (z && this.f26117c.f22160g) {
                this.f26117c.f22160g = 0;
                C6021d.f22041b.mo6555a(this.f26117c.f22154a, this.f26117c.f22155b);
            } else if (this.f26117c.f22160g) {
                this.f26117c.f22159f = 6;
                this.f26117c.f22155b.m25835d().close();
            }
        }

        /* renamed from: a */
        protected final void m31031a() {
            C6058i.m26249a(this.f26117c.f22155b.m25835d());
            this.f26117c.f22159f = 6;
        }
    }

    /* renamed from: com.squareup.okhttp.internal.http.e$b */
    private final class C7238b implements Sink {
        /* renamed from: a */
        final /* synthetic */ C6047e f26118a;
        /* renamed from: b */
        private final C17705g f26119b;
        /* renamed from: c */
        private boolean f26120c;

        private C7238b(C6047e c6047e) {
            this.f26118a = c6047e;
            this.f26119b = new C17705g(this.f26118a.f22158e.timeout());
        }

        public C15982q timeout() {
            return this.f26119b;
        }

        public void write(C18549c c18549c, long j) throws IOException {
            if (this.f26120c) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                this.f26118a.f22158e.writeHexadecimalUnsignedLong(j);
                this.f26118a.f22158e.writeUtf8("\r\n");
                this.f26118a.f22158e.write(c18549c, j);
                this.f26118a.f22158e.writeUtf8("\r\n");
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.f26120c) {
                this.f26118a.f22158e.flush();
            }
        }

        public synchronized void close() throws IOException {
            if (!this.f26120c) {
                this.f26120c = true;
                this.f26118a.f22158e.writeUtf8("0\r\n\r\n");
                this.f26118a.m26139a(this.f26119b);
                this.f26118a.f22159f = 3;
            }
        }
    }

    /* renamed from: com.squareup.okhttp.internal.http.e$d */
    private final class C7239d implements Sink {
        /* renamed from: a */
        final /* synthetic */ C6047e f26121a;
        /* renamed from: b */
        private final C17705g f26122b;
        /* renamed from: c */
        private boolean f26123c;
        /* renamed from: d */
        private long f26124d;

        private C7239d(C6047e c6047e, long j) {
            this.f26121a = c6047e;
            this.f26122b = new C17705g(this.f26121a.f22158e.timeout());
            this.f26124d = j;
        }

        public C15982q timeout() {
            return this.f26122b;
        }

        public void write(C18549c c18549c, long j) throws IOException {
            if (this.f26123c) {
                throw new IllegalStateException("closed");
            }
            C6058i.m26246a(c18549c.a(), 0, j);
            if (j > this.f26124d) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("expected ");
                stringBuilder.append(this.f26124d);
                stringBuilder.append(" bytes but received ");
                stringBuilder.append(j);
                throw new ProtocolException(stringBuilder.toString());
            }
            this.f26121a.f22158e.write(c18549c, j);
            this.f26124d -= j;
        }

        public void flush() throws IOException {
            if (!this.f26123c) {
                this.f26121a.f22158e.flush();
            }
        }

        public void close() throws IOException {
            if (!this.f26123c) {
                this.f26123c = true;
                if (this.f26124d > 0) {
                    throw new ProtocolException("unexpected end of stream");
                }
                this.f26121a.m26139a(this.f26122b);
                this.f26121a.f22159f = 3;
            }
        }
    }

    /* renamed from: com.squareup.okhttp.internal.http.e$c */
    private class C7947c extends C7237a {
        /* renamed from: d */
        final /* synthetic */ C6047e f28549d;
        /* renamed from: e */
        private long f28550e = -1;
        /* renamed from: f */
        private boolean f28551f = true;
        /* renamed from: g */
        private final C6050g f28552g;

        C7947c(C6047e c6047e, C6050g c6050g) throws IOException {
            this.f28549d = c6047e;
            super();
            this.f28552g = c6050g;
        }

        public long read(C18549c c18549c, long j) throws IOException {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("byteCount < 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (!this.f28551f) {
                return -1;
            } else {
                if (this.f28550e == 0 || this.f28550e == -1) {
                    m33806b();
                    if (!this.f28551f) {
                        return -1;
                    }
                }
                c18549c = this.f28549d.f22157d.read(c18549c, Math.min(j, this.f28550e));
                if (c18549c == -1) {
                    m31031a();
                    throw new ProtocolException("unexpected end of stream");
                }
                this.f28550e -= c18549c;
                return c18549c;
            }
        }

        /* renamed from: b */
        private void m33806b() throws IOException {
            if (this.f28550e != -1) {
                this.f28549d.f22157d.readUtf8LineStrict();
            }
            try {
                this.f28550e = this.f28549d.f22157d.readHexadecimalUnsignedLong();
                String trim = this.f28549d.f22157d.readUtf8LineStrict().trim();
                if (this.f28550e >= 0) {
                    if (trim.isEmpty() || trim.startsWith(";")) {
                        if (this.f28550e == 0) {
                            this.f28551f = false;
                            C6065a c6065a = new C6065a();
                            this.f28549d.m26151a(c6065a);
                            this.f28552g.m26188a(c6065a.m26277a());
                            m31032a(true);
                            return;
                        }
                        return;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("expected chunk size and optional extensions but was \"");
                stringBuilder.append(this.f28550e);
                stringBuilder.append(trim);
                stringBuilder.append("\"");
                throw new ProtocolException(stringBuilder.toString());
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() throws IOException {
            if (!this.b) {
                if (this.f28551f && !C6058i.m26252a((Source) this, 100, TimeUnit.MILLISECONDS)) {
                    m31031a();
                }
                this.b = true;
            }
        }
    }

    /* renamed from: com.squareup.okhttp.internal.http.e$e */
    private class C7948e extends C7237a {
        /* renamed from: d */
        final /* synthetic */ C6047e f28553d;
        /* renamed from: e */
        private long f28554e;

        public C7948e(C6047e c6047e, long j) throws IOException {
            this.f28553d = c6047e;
            super();
            this.f28554e = j;
            if (this.f28554e == 0) {
                m31032a(true);
            }
        }

        public long read(C18549c c18549c, long j) throws IOException {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("byteCount < 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (this.f28554e == 0) {
                return -1;
            } else {
                c18549c = this.f28553d.f22157d.read(c18549c, Math.min(this.f28554e, j));
                if (c18549c == -1) {
                    m31031a();
                    throw new ProtocolException("unexpected end of stream");
                }
                this.f28554e -= c18549c;
                if (this.f28554e == 0) {
                    m31032a(true);
                }
                return c18549c;
            }
        }

        public void close() throws IOException {
            if (!this.b) {
                if (!(this.f28554e == 0 || C6058i.m26252a((Source) this, 100, TimeUnit.MILLISECONDS))) {
                    m31031a();
                }
                this.b = true;
            }
        }
    }

    /* renamed from: com.squareup.okhttp.internal.http.e$f */
    private class C7949f extends C7237a {
        /* renamed from: d */
        final /* synthetic */ C6047e f28555d;
        /* renamed from: e */
        private boolean f28556e;

        private C7949f(C6047e c6047e) {
            this.f28555d = c6047e;
            super();
        }

        public long read(C18549c c18549c, long j) throws IOException {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("byteCount < 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (this.f28556e) {
                return -1;
            } else {
                c18549c = this.f28555d.f22157d.read(c18549c, j);
                if (c18549c != -1) {
                    return c18549c;
                }
                this.f28556e = true;
                m31032a(null);
                return -1;
            }
        }

        public void close() throws IOException {
            if (!this.b) {
                if (!this.f28556e) {
                    m31031a();
                }
                this.b = true;
            }
        }
    }

    public C6047e(C6009h c6009h, C6007g c6007g, Socket socket) throws IOException {
        this.f22154a = c6009h;
        this.f22155b = c6007g;
        this.f22156c = socket;
        this.f22157d = C15976k.a(C15976k.b(socket));
        this.f22158e = C15976k.a(C15976k.a(socket));
    }

    /* renamed from: a */
    public void m26149a(int i, int i2) {
        if (i != 0) {
            this.f22157d.timeout().a((long) i, TimeUnit.MILLISECONDS);
        }
        if (i2 != 0) {
            this.f22158e.timeout().a((long) i2, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public void m26148a() {
        this.f22160g = 1;
        if (this.f22159f == 0) {
            this.f22160g = 0;
            C6021d.f22041b.mo6555a(this.f22154a, this.f22155b);
        }
    }

    /* renamed from: b */
    public void m26155b() throws IOException {
        this.f22160g = 2;
        if (this.f22159f == 0) {
            this.f22159f = 6;
            this.f22155b.m25835d().close();
        }
    }

    /* renamed from: c */
    public boolean m26156c() {
        return this.f22159f == 6;
    }

    /* renamed from: a */
    public void m26153a(Object obj) throws IOException {
        C6021d.f22041b.mo6554a(this.f22155b, obj);
    }

    /* renamed from: d */
    public void m26157d() throws IOException {
        this.f22158e.flush();
    }

    /* renamed from: e */
    public long m26158e() {
        return this.f22157d.buffer().a();
    }

    /* renamed from: f */
    public boolean m26159f() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = 0;
        r1 = 1;
        r2 = r5.f22156c;	 Catch:{ SocketTimeoutException -> 0x0029, IOException -> 0x0028 }
        r2 = r2.getSoTimeout();	 Catch:{ SocketTimeoutException -> 0x0029, IOException -> 0x0028 }
        r3 = r5.f22156c;	 Catch:{ all -> 0x0021 }
        r3.setSoTimeout(r1);	 Catch:{ all -> 0x0021 }
        r3 = r5.f22157d;	 Catch:{ all -> 0x0021 }
        r3 = r3.exhausted();	 Catch:{ all -> 0x0021 }
        if (r3 == 0) goto L_0x001b;
    L_0x0015:
        r3 = r5.f22156c;	 Catch:{ SocketTimeoutException -> 0x0029, IOException -> 0x0028 }
        r3.setSoTimeout(r2);	 Catch:{ SocketTimeoutException -> 0x0029, IOException -> 0x0028 }
        return r0;	 Catch:{ SocketTimeoutException -> 0x0029, IOException -> 0x0028 }
    L_0x001b:
        r3 = r5.f22156c;	 Catch:{ SocketTimeoutException -> 0x0029, IOException -> 0x0028 }
        r3.setSoTimeout(r2);	 Catch:{ SocketTimeoutException -> 0x0029, IOException -> 0x0028 }
        return r1;	 Catch:{ SocketTimeoutException -> 0x0029, IOException -> 0x0028 }
    L_0x0021:
        r3 = move-exception;	 Catch:{ SocketTimeoutException -> 0x0029, IOException -> 0x0028 }
        r4 = r5.f22156c;	 Catch:{ SocketTimeoutException -> 0x0029, IOException -> 0x0028 }
        r4.setSoTimeout(r2);	 Catch:{ SocketTimeoutException -> 0x0029, IOException -> 0x0028 }
        throw r3;	 Catch:{ SocketTimeoutException -> 0x0029, IOException -> 0x0028 }
    L_0x0028:
        return r0;
    L_0x0029:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.e.f():boolean");
    }

    /* renamed from: a */
    public void m26152a(C6066n c6066n, String str) throws IOException {
        if (this.f22159f != 0) {
            str = new StringBuilder();
            str.append("state: ");
            str.append(this.f22159f);
            throw new IllegalStateException(str.toString());
        }
        this.f22158e.writeUtf8(str).writeUtf8("\r\n");
        int a = c6066n.m26282a();
        for (int i = null; i < a; i++) {
            this.f22158e.writeUtf8(c6066n.m26283a(i)).writeUtf8(": ").writeUtf8(c6066n.m26286b(i)).writeUtf8("\r\n");
        }
        this.f22158e.writeUtf8("\r\n");
        this.f22159f = 1;
    }

    /* renamed from: g */
    public C6074a m26160g() throws IOException {
        if (this.f22159f == 1 || this.f22159f == 3) {
            C6074a a;
            C6056o a2;
            do {
                try {
                    a2 = C6056o.m26237a(this.f22157d.readUtf8LineStrict());
                    a = new C6074a().m26371a(a2.f22202a).m26370a(a2.f22203b).m26377a(a2.f22204c);
                    C6065a c6065a = new C6065a();
                    m26151a(c6065a);
                    c6065a.m26276a(C6053j.f22189d, a2.f22202a.toString());
                    a.m26373a(c6065a.m26277a());
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("unexpected end of stream on ");
                    stringBuilder.append(this.f22155b);
                    stringBuilder.append(" (recycle count=");
                    stringBuilder.append(C6021d.f22041b.mo6560b(this.f22155b));
                    stringBuilder.append(")");
                    IOException iOException = new IOException(stringBuilder.toString());
                    iOException.initCause(e);
                    throw iOException;
                }
            } while (a2.f22203b == 100);
            this.f22159f = 4;
            return a;
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("state: ");
        stringBuilder2.append(this.f22159f);
        throw new IllegalStateException(stringBuilder2.toString());
    }

    /* renamed from: a */
    public void m26151a(C6065a c6065a) throws IOException {
        while (true) {
            String readUtf8LineStrict = this.f22157d.readUtf8LineStrict();
            if (readUtf8LineStrict.length() != 0) {
                C6021d.f22041b.mo6557a(c6065a, readUtf8LineStrict);
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public Sink m26161h() {
        if (this.f22159f != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(this.f22159f);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f22159f = 2;
        return new C7238b();
    }

    /* renamed from: a */
    public Sink m26146a(long j) {
        if (this.f22159f != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(this.f22159f);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f22159f = 2;
        return new C7239d(j);
    }

    /* renamed from: a */
    public void m26150a(C7245m c7245m) throws IOException {
        if (this.f22159f != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(this.f22159f);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f22159f = 3;
        c7245m.m31041a(this.f22158e);
    }

    /* renamed from: b */
    public Source m26154b(long j) throws IOException {
        if (this.f22159f != 4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(this.f22159f);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f22159f = 5;
        return new C7948e(this, j);
    }

    /* renamed from: a */
    public Source m26147a(C6050g c6050g) throws IOException {
        if (this.f22159f != 4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(this.f22159f);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f22159f = 5;
        return new C7947c(this, c6050g);
    }

    /* renamed from: i */
    public Source m26162i() throws IOException {
        if (this.f22159f != 4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(this.f22159f);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f22159f = 5;
        return new C7949f();
    }

    /* renamed from: a */
    private void m26139a(C17705g c17705g) {
        C15982q a = c17705g.a();
        c17705g.a(C15982q.f49620c);
        a.f();
        a.p_();
    }
}
