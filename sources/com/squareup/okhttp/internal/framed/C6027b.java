package com.squareup.okhttp.internal.framed;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import okio.BufferedSource;
import okio.C15982q;
import okio.C17701a;
import okio.C18549c;
import okio.Sink;
import okio.Source;

/* renamed from: com.squareup.okhttp.internal.framed.b */
public final class C6027b {
    /* renamed from: d */
    static final /* synthetic */ boolean f22079d = true;
    /* renamed from: a */
    long f22080a = 0;
    /* renamed from: b */
    long f22081b;
    /* renamed from: c */
    final C7224a f22082c;
    /* renamed from: e */
    private final int f22083e;
    /* renamed from: f */
    private final C6025a f22084f;
    /* renamed from: g */
    private final List<C6028c> f22085g;
    /* renamed from: h */
    private List<C6028c> f22086h;
    /* renamed from: i */
    private final C7225b f22087i;
    /* renamed from: j */
    private final C7945c f22088j = new C7945c(this);
    /* renamed from: k */
    private final C7945c f22089k = new C7945c(this);
    /* renamed from: l */
    private ErrorCode f22090l = null;

    /* renamed from: com.squareup.okhttp.internal.framed.b$a */
    final class C7224a implements Sink {
        /* renamed from: a */
        static final /* synthetic */ boolean f26049a = true;
        /* renamed from: b */
        final /* synthetic */ C6027b f26050b;
        /* renamed from: c */
        private final C18549c f26051c = new C18549c();
        /* renamed from: d */
        private boolean f26052d;
        /* renamed from: e */
        private boolean f26053e;

        static {
            Class cls = C6027b.class;
        }

        C7224a(C6027b c6027b) {
            this.f26050b = c6027b;
        }

        public void write(C18549c c18549c, long j) throws IOException {
            if (f26049a || !Thread.holdsLock(this.f26050b)) {
                this.f26051c.write(c18549c, j);
                while (this.f26051c.a() >= PlaybackStateCompat.ACTION_PREPARE) {
                    m30968a((boolean) null);
                }
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        private void m30968a(boolean z) throws IOException {
            synchronized (this.f26050b) {
                this.f26050b.f22089k.c();
                while (this.f26050b.f22081b <= 0 && !this.f26053e && !this.f26052d && this.f26050b.f22090l == null) {
                    try {
                        this.f26050b.m26035k();
                    } finally {
                        this.f26050b.f22089k.m33805b();
                    }
                }
                this.f26050b.m26034j();
                long min = Math.min(this.f26050b.f22081b, this.f26051c.a());
                C6027b c6027b = this.f26050b;
                c6027b.f22081b -= min;
            }
            this.f26050b.f22089k.c();
            try {
                C6025a a = this.f26050b.f22084f;
                int b = this.f26050b.f22083e;
                boolean z2 = (z && min == this.f26051c.a()) ? f26049a : false;
                a.m26015a(b, z2, this.f26051c, min);
            } finally {
                this.f26050b.f22089k.m33805b();
            }
        }

        public void flush() throws IOException {
            if (f26049a || !Thread.holdsLock(this.f26050b)) {
                synchronized (this.f26050b) {
                    this.f26050b.m26034j();
                }
                while (this.f26051c.a() > 0) {
                    m30968a(false);
                    this.f26050b.f22084f.m26022d();
                }
                return;
            }
            throw new AssertionError();
        }

        public C15982q timeout() {
            return this.f26050b.f22089k;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
            r8 = this;
            r0 = f26049a;
            if (r0 != 0) goto L_0x0012;
        L_0x0004:
            r0 = r8.f26050b;
            r0 = java.lang.Thread.holdsLock(r0);
            if (r0 == 0) goto L_0x0012;
        L_0x000c:
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
        L_0x0012:
            r0 = r8.f26050b;
            monitor-enter(r0);
            r1 = r8.f26052d;	 Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x001b;
        L_0x0019:
            monitor-exit(r0);	 Catch:{ all -> 0x006a }
            return;
        L_0x001b:
            monitor-exit(r0);	 Catch:{ all -> 0x006a }
            r0 = r8.f26050b;
            r0 = r0.f22082c;
            r0 = r0.f26053e;
            r1 = 1;
            if (r0 != 0) goto L_0x0052;
        L_0x0025:
            r0 = r8.f26051c;
            r2 = r0.a();
            r4 = 0;
            r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r0 <= 0) goto L_0x003f;
        L_0x0031:
            r0 = r8.f26051c;
            r2 = r0.a();
            r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r0 <= 0) goto L_0x0052;
        L_0x003b:
            r8.m30968a(r1);
            goto L_0x0031;
        L_0x003f:
            r0 = r8.f26050b;
            r2 = r0.f22084f;
            r0 = r8.f26050b;
            r3 = r0.f22083e;
            r4 = 1;
            r5 = 0;
            r6 = 0;
            r2.m26015a(r3, r4, r5, r6);
        L_0x0052:
            r2 = r8.f26050b;
            monitor-enter(r2);
            r8.f26052d = r1;	 Catch:{ all -> 0x0067 }
            monitor-exit(r2);	 Catch:{ all -> 0x0067 }
            r0 = r8.f26050b;
            r0 = r0.f22084f;
            r0.m26022d();
            r0 = r8.f26050b;
            r0.m26033i();
            return;
        L_0x0067:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0067 }
            throw r0;
        L_0x006a:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x006a }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.b.a.close():void");
        }
    }

    /* renamed from: com.squareup.okhttp.internal.framed.b$b */
    private final class C7225b implements Source {
        /* renamed from: a */
        static final /* synthetic */ boolean f26054a = true;
        /* renamed from: b */
        final /* synthetic */ C6027b f26055b;
        /* renamed from: c */
        private final C18549c f26056c;
        /* renamed from: d */
        private final C18549c f26057d;
        /* renamed from: e */
        private final long f26058e;
        /* renamed from: f */
        private boolean f26059f;
        /* renamed from: g */
        private boolean f26060g;

        static {
            Class cls = C6027b.class;
        }

        private C7225b(C6027b c6027b, long j) {
            this.f26055b = c6027b;
            this.f26056c = new C18549c();
            this.f26057d = new C18549c();
            this.f26058e = j;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(okio.C18549c r9, long r10) throws java.io.IOException {
            /*
            r8 = this;
            r0 = 0;
            r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
            if (r2 >= 0) goto L_0x001d;
        L_0x0006:
            r9 = new java.lang.IllegalArgumentException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "byteCount < 0: ";
            r0.append(r1);
            r0.append(r10);
            r10 = r0.toString();
            r9.<init>(r10);
            throw r9;
        L_0x001d:
            r2 = r8.f26055b;
            monitor-enter(r2);
            r8.m30972a();	 Catch:{ all -> 0x00cc }
            r8.m30975b();	 Catch:{ all -> 0x00cc }
            r3 = r8.f26057d;	 Catch:{ all -> 0x00cc }
            r3 = r3.a();	 Catch:{ all -> 0x00cc }
            r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
            if (r5 != 0) goto L_0x0034;
        L_0x0030:
            r9 = -1;
            monitor-exit(r2);	 Catch:{ all -> 0x00cc }
            return r9;
        L_0x0034:
            r3 = r8.f26057d;	 Catch:{ all -> 0x00cc }
            r4 = r8.f26057d;	 Catch:{ all -> 0x00cc }
            r4 = r4.a();	 Catch:{ all -> 0x00cc }
            r10 = java.lang.Math.min(r10, r4);	 Catch:{ all -> 0x00cc }
            r9 = r3.read(r9, r10);	 Catch:{ all -> 0x00cc }
            r11 = r8.f26055b;	 Catch:{ all -> 0x00cc }
            r3 = r11.f22080a;	 Catch:{ all -> 0x00cc }
            r5 = 0;
            r5 = r3 + r9;
            r11.f22080a = r5;	 Catch:{ all -> 0x00cc }
            r11 = r8.f26055b;	 Catch:{ all -> 0x00cc }
            r3 = r11.f22080a;	 Catch:{ all -> 0x00cc }
            r11 = r8.f26055b;	 Catch:{ all -> 0x00cc }
            r11 = r11.f22084f;	 Catch:{ all -> 0x00cc }
            r11 = r11.f22060e;	 Catch:{ all -> 0x00cc }
            r5 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
            r11 = r11.m26103e(r5);	 Catch:{ all -> 0x00cc }
            r11 = r11 / 2;
            r6 = (long) r11;	 Catch:{ all -> 0x00cc }
            r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1));
            if (r11 < 0) goto L_0x007d;
        L_0x0066:
            r11 = r8.f26055b;	 Catch:{ all -> 0x00cc }
            r11 = r11.f22084f;	 Catch:{ all -> 0x00cc }
            r3 = r8.f26055b;	 Catch:{ all -> 0x00cc }
            r3 = r3.f22083e;	 Catch:{ all -> 0x00cc }
            r4 = r8.f26055b;	 Catch:{ all -> 0x00cc }
            r6 = r4.f22080a;	 Catch:{ all -> 0x00cc }
            r11.m26013a(r3, r6);	 Catch:{ all -> 0x00cc }
            r11 = r8.f26055b;	 Catch:{ all -> 0x00cc }
            r11.f22080a = r0;	 Catch:{ all -> 0x00cc }
        L_0x007d:
            monitor-exit(r2);	 Catch:{ all -> 0x00cc }
            r11 = r8.f26055b;
            r11 = r11.f22084f;
            monitor-enter(r11);
            r2 = r8.f26055b;	 Catch:{ all -> 0x00c9 }
            r2 = r2.f22084f;	 Catch:{ all -> 0x00c9 }
            r3 = r2.f22058c;	 Catch:{ all -> 0x00c9 }
            r6 = 0;
            r6 = r3 + r9;
            r2.f22058c = r6;	 Catch:{ all -> 0x00c9 }
            r2 = r8.f26055b;	 Catch:{ all -> 0x00c9 }
            r2 = r2.f22084f;	 Catch:{ all -> 0x00c9 }
            r2 = r2.f22058c;	 Catch:{ all -> 0x00c9 }
            r4 = r8.f26055b;	 Catch:{ all -> 0x00c9 }
            r4 = r4.f22084f;	 Catch:{ all -> 0x00c9 }
            r4 = r4.f22060e;	 Catch:{ all -> 0x00c9 }
            r4 = r4.m26103e(r5);	 Catch:{ all -> 0x00c9 }
            r4 = r4 / 2;
            r4 = (long) r4;	 Catch:{ all -> 0x00c9 }
            r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r6 < 0) goto L_0x00c7;
        L_0x00ad:
            r2 = r8.f26055b;	 Catch:{ all -> 0x00c9 }
            r2 = r2.f22084f;	 Catch:{ all -> 0x00c9 }
            r3 = 0;
            r4 = r8.f26055b;	 Catch:{ all -> 0x00c9 }
            r4 = r4.f22084f;	 Catch:{ all -> 0x00c9 }
            r4 = r4.f22058c;	 Catch:{ all -> 0x00c9 }
            r2.m26013a(r3, r4);	 Catch:{ all -> 0x00c9 }
            r2 = r8.f26055b;	 Catch:{ all -> 0x00c9 }
            r2 = r2.f22084f;	 Catch:{ all -> 0x00c9 }
            r2.f22058c = r0;	 Catch:{ all -> 0x00c9 }
        L_0x00c7:
            monitor-exit(r11);	 Catch:{ all -> 0x00c9 }
            return r9;
        L_0x00c9:
            r9 = move-exception;
            monitor-exit(r11);	 Catch:{ all -> 0x00c9 }
            throw r9;
        L_0x00cc:
            r9 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x00cc }
            throw r9;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.b.b.read(okio.c, long):long");
        }

        /* renamed from: a */
        private void m30972a() throws IOException {
            this.f26055b.f22088j.c();
            while (this.f26057d.a() == 0 && !this.f26060g && !this.f26059f && this.f26055b.f22090l == null) {
                try {
                    this.f26055b.m26035k();
                } catch (Throwable th) {
                    this.f26055b.f22088j.m33805b();
                }
            }
            this.f26055b.f22088j.m33805b();
        }

        /* renamed from: a */
        void m30977a(BufferedSource bufferedSource, long j) throws IOException {
            if (f26054a || !Thread.holdsLock(this.f26055b)) {
                while (j > 0) {
                    boolean z;
                    Object obj;
                    Object obj2;
                    synchronized (this.f26055b) {
                        z = this.f26060g;
                        obj = null;
                        obj2 = j + this.f26057d.a() > this.f26058e ? 1 : null;
                    }
                    if (obj2 != null) {
                        bufferedSource.skip(j);
                        this.f26055b.m26041b(ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        bufferedSource.skip(j);
                        return;
                    } else {
                        long read = bufferedSource.read(this.f26056c, j);
                        if (read == -1) {
                            throw new EOFException();
                        }
                        long j2 = j - read;
                        synchronized (this.f26055b) {
                            if (this.f26057d.a() == 0) {
                                obj = 1;
                            }
                            this.f26057d.writeAll(this.f26056c);
                            if (obj != null) {
                                this.f26055b.notifyAll();
                            }
                        }
                        j = j2;
                    }
                }
                return;
            }
            throw new AssertionError();
        }

        public C15982q timeout() {
            return this.f26055b.f22088j;
        }

        public void close() throws IOException {
            synchronized (this.f26055b) {
                this.f26059f = f26054a;
                this.f26057d.d();
                this.f26055b.notifyAll();
            }
            this.f26055b.m26033i();
        }

        /* renamed from: b */
        private void m30975b() throws IOException {
            if (this.f26059f) {
                throw new IOException("stream closed");
            } else if (this.f26055b.f22090l != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("stream was reset: ");
                stringBuilder.append(this.f26055b.f22090l);
                throw new IOException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: com.squareup.okhttp.internal.framed.b$c */
    class C7945c extends C17701a {
        /* renamed from: a */
        final /* synthetic */ C6027b f28547a;

        C7945c(C6027b c6027b) {
            this.f28547a = c6027b;
        }

        /* renamed from: a */
        protected void m33804a() {
            this.f28547a.m26041b(ErrorCode.CANCEL);
        }

        /* renamed from: a */
        protected IOException m33803a(IOException iOException) {
            IOException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* renamed from: b */
        public void m33805b() throws IOException {
            if (k_()) {
                throw m33803a(null);
            }
        }
    }

    C6027b(int i, C6025a c6025a, boolean z, boolean z2, List<C6028c> list) {
        if (c6025a == null) {
            throw new NullPointerException("connection == null");
        } else if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        } else {
            this.f22083e = i;
            this.f22084f = c6025a;
            this.f22081b = (long) c6025a.f22061f.m26103e(65536);
            this.f22087i = new C7225b((long) c6025a.f22060e.m26103e(65536));
            this.f22082c = new C7224a(this);
            this.f22087i.f26060g = z2;
            this.f22082c.f26053e = z;
            this.f22085g = list;
        }
    }

    /* renamed from: a */
    public int m26036a() {
        return this.f22083e;
    }

    /* renamed from: b */
    public synchronized boolean m26042b() {
        if (this.f22090l != null) {
            return false;
        }
        if ((this.f22087i.f26060g || this.f22087i.f26059f) && ((this.f22082c.f26053e || this.f22082c.f26052d) && this.f22086h != null)) {
            return false;
        }
        return f22079d;
    }

    /* renamed from: c */
    public boolean m26044c() {
        if (this.f22084f.f22057b == ((this.f22083e & 1) == 1 ? f22079d : false)) {
            return f22079d;
        }
        return false;
    }

    /* renamed from: d */
    public synchronized List<C6028c> m26045d() throws IOException {
        this.f22088j.c();
        while (this.f22086h == null && this.f22090l == null) {
            try {
                m26035k();
            } finally {
                this.f22088j.m33805b();
            }
        }
        if (this.f22086h != null) {
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("stream was reset: ");
            stringBuilder.append(this.f22090l);
            throw new IOException(stringBuilder.toString());
        }
        return this.f22086h;
    }

    /* renamed from: e */
    public C15982q m26046e() {
        return this.f22088j;
    }

    /* renamed from: f */
    public Source m26047f() {
        return this.f22087i;
    }

    /* renamed from: g */
    public Sink m26048g() {
        synchronized (this) {
            if (this.f22086h != null || m26044c()) {
            } else {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f22082c;
    }

    /* renamed from: a */
    public void m26038a(ErrorCode errorCode) throws IOException {
        if (m26028d(errorCode)) {
            this.f22084f.m26019b(this.f22083e, errorCode);
        }
    }

    /* renamed from: b */
    public void m26041b(ErrorCode errorCode) {
        if (m26028d(errorCode)) {
            this.f22084f.m26014a(this.f22083e, errorCode);
        }
    }

    /* renamed from: d */
    private boolean m26028d(ErrorCode errorCode) {
        if (f22079d || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f22090l != null) {
                    return false;
                } else if (this.f22087i.f26060g && this.f22082c.f26053e) {
                    return false;
                } else {
                    this.f22090l = errorCode;
                    notifyAll();
                    this.f22084f.m26018b(this.f22083e);
                    return f22079d;
                }
            }
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    void m26039a(List<C6028c> list, HeadersMode headersMode) {
        if (f22079d || !Thread.holdsLock(this)) {
            ErrorCode errorCode = null;
            boolean z = f22079d;
            synchronized (this) {
                if (this.f22086h == null) {
                    if (headersMode.failIfHeadersAbsent() != null) {
                        errorCode = ErrorCode.PROTOCOL_ERROR;
                    } else {
                        this.f22086h = list;
                        z = m26042b();
                        notifyAll();
                    }
                } else if (headersMode.failIfHeadersPresent() != null) {
                    errorCode = ErrorCode.STREAM_IN_USE;
                } else {
                    headersMode = new ArrayList();
                    headersMode.addAll(this.f22086h);
                    headersMode.addAll(list);
                    this.f22086h = headersMode;
                }
            }
            if (errorCode != null) {
                m26041b(errorCode);
                return;
            } else if (!z) {
                this.f22084f.m26018b(this.f22083e);
                return;
            } else {
                return;
            }
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    void m26040a(BufferedSource bufferedSource, int i) throws IOException {
        if (f22079d || !Thread.holdsLock(this)) {
            this.f22087i.m30977a(bufferedSource, (long) i);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: h */
    void m26049h() {
        if (f22079d || !Thread.holdsLock(this)) {
            boolean b;
            synchronized (this) {
                this.f22087i.f26060g = f22079d;
                b = m26042b();
                notifyAll();
            }
            if (!b) {
                this.f22084f.m26018b(this.f22083e);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    synchronized void m26043c(ErrorCode errorCode) {
        if (this.f22090l == null) {
            this.f22090l = errorCode;
            notifyAll();
        }
    }

    /* renamed from: i */
    private void m26033i() throws IOException {
        if (f22079d || !Thread.holdsLock(this)) {
            Object obj;
            boolean b;
            synchronized (this) {
                obj = (!this.f22087i.f26060g && this.f22087i.f26059f && (this.f22082c.f26053e || this.f22082c.f26052d)) ? 1 : null;
                b = m26042b();
            }
            if (obj != null) {
                m26038a(ErrorCode.CANCEL);
                return;
            } else if (!b) {
                this.f22084f.m26018b(this.f22083e);
                return;
            } else {
                return;
            }
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    void m26037a(long j) {
        this.f22081b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: j */
    private void m26034j() throws IOException {
        if (this.f22082c.f26052d) {
            throw new IOException("stream closed");
        } else if (this.f22082c.f26053e) {
            throw new IOException("stream finished");
        } else if (this.f22090l != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("stream was reset: ");
            stringBuilder.append(this.f22090l);
            throw new IOException(stringBuilder.toString());
        }
    }

    /* renamed from: k */
    private void m26035k() throws java.io.InterruptedIOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r1.wait();	 Catch:{ InterruptedException -> 0x0004 }
        return;
    L_0x0004:
        r0 = new java.io.InterruptedIOException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.b.k():void");
    }
}
