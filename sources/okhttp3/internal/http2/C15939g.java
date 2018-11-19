package okhttp3.internal.http2;

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

/* renamed from: okhttp3.internal.http2.g */
public final class C15939g {
    /* renamed from: i */
    static final /* synthetic */ boolean f49428i = true;
    /* renamed from: a */
    long f49429a = 0;
    /* renamed from: b */
    long f49430b;
    /* renamed from: c */
    final int f49431c;
    /* renamed from: d */
    final C15936e f49432d;
    /* renamed from: e */
    final C17680a f49433e;
    /* renamed from: f */
    final C18548c f49434f = new C18548c(this);
    /* renamed from: g */
    final C18548c f49435g = new C18548c(this);
    /* renamed from: h */
    ErrorCode f49436h = null;
    /* renamed from: j */
    private final List<C15929a> f49437j;
    /* renamed from: k */
    private List<C15929a> f49438k;
    /* renamed from: l */
    private boolean f49439l;
    /* renamed from: m */
    private final C17681b f49440m;

    /* renamed from: okhttp3.internal.http2.g$a */
    final class C17680a implements Sink {
        /* renamed from: c */
        static final /* synthetic */ boolean f54975c = true;
        /* renamed from: a */
        boolean f54976a;
        /* renamed from: b */
        boolean f54977b;
        /* renamed from: d */
        final /* synthetic */ C15939g f54978d;
        /* renamed from: e */
        private final C18549c f54979e = new C18549c();

        static {
            Class cls = C15939g.class;
        }

        C17680a(C15939g c15939g) {
            this.f54978d = c15939g;
        }

        public void write(C18549c c18549c, long j) throws IOException {
            if (f54975c || !Thread.holdsLock(this.f54978d)) {
                this.f54979e.write(c18549c, j);
                while (this.f54979e.m66945a() >= PlaybackStateCompat.ACTION_PREPARE) {
                    m64356a(null);
                }
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        private void m64356a(boolean z) throws IOException {
            synchronized (this.f54978d) {
                this.f54978d.f49435g.m64455c();
                while (this.f54978d.f49430b <= 0 && !this.f54977b && !this.f54976a && this.f54978d.f49436h == null) {
                    try {
                        this.f54978d.m60391l();
                    } finally {
                        this.f54978d.f49435g.m66941b();
                    }
                }
                this.f54978d.m60390k();
                long min = Math.min(this.f54978d.f49430b, this.f54979e.m66945a());
                C15939g c15939g = this.f54978d;
                c15939g.f49430b -= min;
            }
            this.f54978d.f49435g.m64455c();
            try {
                C15936e c15936e = this.f54978d.f49432d;
                int i = this.f54978d.f49431c;
                boolean z2 = (z && min == this.f54979e.m66945a()) ? f54975c : false;
                c15936e.m60335a(i, z2, this.f54979e, min);
            } finally {
                this.f54978d.f49435g.m66941b();
            }
        }

        public void flush() throws IOException {
            if (f54975c || !Thread.holdsLock(this.f54978d)) {
                synchronized (this.f54978d) {
                    this.f54978d.m60390k();
                }
                while (this.f54979e.m66945a() > 0) {
                    m64356a(false);
                    this.f54978d.f49432d.m60342b();
                }
                return;
            }
            throw new AssertionError();
        }

        public C15982q timeout() {
            return this.f54978d.f49435g;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
            r8 = this;
            r0 = f54975c;
            if (r0 != 0) goto L_0x0012;
        L_0x0004:
            r0 = r8.f54978d;
            r0 = java.lang.Thread.holdsLock(r0);
            if (r0 == 0) goto L_0x0012;
        L_0x000c:
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
        L_0x0012:
            r0 = r8.f54978d;
            monitor-enter(r0);
            r1 = r8.f54976a;	 Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x001b;
        L_0x0019:
            monitor-exit(r0);	 Catch:{ all -> 0x0064 }
            return;
        L_0x001b:
            monitor-exit(r0);	 Catch:{ all -> 0x0064 }
            r0 = r8.f54978d;
            r0 = r0.f49433e;
            r0 = r0.f54977b;
            r1 = 1;
            if (r0 != 0) goto L_0x004e;
        L_0x0025:
            r0 = r8.f54979e;
            r2 = r0.m66945a();
            r4 = 0;
            r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r0 <= 0) goto L_0x003f;
        L_0x0031:
            r0 = r8.f54979e;
            r2 = r0.m66945a();
            r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r0 <= 0) goto L_0x004e;
        L_0x003b:
            r8.m64356a(r1);
            goto L_0x0031;
        L_0x003f:
            r0 = r8.f54978d;
            r2 = r0.f49432d;
            r0 = r8.f54978d;
            r3 = r0.f49431c;
            r4 = 1;
            r5 = 0;
            r6 = 0;
            r2.m60335a(r3, r4, r5, r6);
        L_0x004e:
            r2 = r8.f54978d;
            monitor-enter(r2);
            r8.f54976a = r1;	 Catch:{ all -> 0x0061 }
            monitor-exit(r2);	 Catch:{ all -> 0x0061 }
            r0 = r8.f54978d;
            r0 = r0.f49432d;
            r0.m60342b();
            r0 = r8.f54978d;
            r0.m60389j();
            return;
        L_0x0061:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0061 }
            throw r0;
        L_0x0064:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0064 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.g.a.close():void");
        }
    }

    /* renamed from: okhttp3.internal.http2.g$b */
    private final class C17681b implements Source {
        /* renamed from: c */
        static final /* synthetic */ boolean f54980c = true;
        /* renamed from: a */
        boolean f54981a;
        /* renamed from: b */
        boolean f54982b;
        /* renamed from: d */
        final /* synthetic */ C15939g f54983d;
        /* renamed from: e */
        private final C18549c f54984e = new C18549c();
        /* renamed from: f */
        private final C18549c f54985f = new C18549c();
        /* renamed from: g */
        private final long f54986g;

        static {
            Class cls = C15939g.class;
        }

        C17681b(C15939g c15939g, long j) {
            this.f54983d = c15939g;
            this.f54986g = j;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(okio.C18549c r8, long r9) throws java.io.IOException {
            /*
            r7 = this;
            r0 = 0;
            r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
            if (r2 >= 0) goto L_0x001d;
        L_0x0006:
            r8 = new java.lang.IllegalArgumentException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "byteCount < 0: ";
            r0.append(r1);
            r0.append(r9);
            r9 = r0.toString();
            r8.<init>(r9);
            throw r8;
        L_0x001d:
            r2 = r7.f54983d;
            monitor-enter(r2);
            r7.m64357a();	 Catch:{ all -> 0x00b6 }
            r7.m64358b();	 Catch:{ all -> 0x00b6 }
            r3 = r7.f54985f;	 Catch:{ all -> 0x00b6 }
            r3 = r3.m66945a();	 Catch:{ all -> 0x00b6 }
            r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
            if (r5 != 0) goto L_0x0034;
        L_0x0030:
            r8 = -1;
            monitor-exit(r2);	 Catch:{ all -> 0x00b6 }
            return r8;
        L_0x0034:
            r3 = r7.f54985f;	 Catch:{ all -> 0x00b6 }
            r4 = r7.f54985f;	 Catch:{ all -> 0x00b6 }
            r4 = r4.m66945a();	 Catch:{ all -> 0x00b6 }
            r9 = java.lang.Math.min(r9, r4);	 Catch:{ all -> 0x00b6 }
            r8 = r3.read(r8, r9);	 Catch:{ all -> 0x00b6 }
            r10 = r7.f54983d;	 Catch:{ all -> 0x00b6 }
            r3 = r10.f49429a;	 Catch:{ all -> 0x00b6 }
            r5 = 0;
            r5 = r3 + r8;
            r10.f49429a = r5;	 Catch:{ all -> 0x00b6 }
            r10 = r7.f54983d;	 Catch:{ all -> 0x00b6 }
            r3 = r10.f49429a;	 Catch:{ all -> 0x00b6 }
            r10 = r7.f54983d;	 Catch:{ all -> 0x00b6 }
            r10 = r10.f49432d;	 Catch:{ all -> 0x00b6 }
            r10 = r10.f49413k;	 Catch:{ all -> 0x00b6 }
            r10 = r10.m60423d();	 Catch:{ all -> 0x00b6 }
            r10 = r10 / 2;
            r5 = (long) r10;	 Catch:{ all -> 0x00b6 }
            r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
            if (r10 < 0) goto L_0x0075;
        L_0x0062:
            r10 = r7.f54983d;	 Catch:{ all -> 0x00b6 }
            r10 = r10.f49432d;	 Catch:{ all -> 0x00b6 }
            r3 = r7.f54983d;	 Catch:{ all -> 0x00b6 }
            r3 = r3.f49431c;	 Catch:{ all -> 0x00b6 }
            r4 = r7.f54983d;	 Catch:{ all -> 0x00b6 }
            r4 = r4.f49429a;	 Catch:{ all -> 0x00b6 }
            r10.m60330a(r3, r4);	 Catch:{ all -> 0x00b6 }
            r10 = r7.f54983d;	 Catch:{ all -> 0x00b6 }
            r10.f49429a = r0;	 Catch:{ all -> 0x00b6 }
        L_0x0075:
            monitor-exit(r2);	 Catch:{ all -> 0x00b6 }
            r10 = r7.f54983d;
            r10 = r10.f49432d;
            monitor-enter(r10);
            r2 = r7.f54983d;	 Catch:{ all -> 0x00b3 }
            r2 = r2.f49432d;	 Catch:{ all -> 0x00b3 }
            r3 = r2.f49411i;	 Catch:{ all -> 0x00b3 }
            r5 = 0;
            r5 = r3 + r8;
            r2.f49411i = r5;	 Catch:{ all -> 0x00b3 }
            r2 = r7.f54983d;	 Catch:{ all -> 0x00b3 }
            r2 = r2.f49432d;	 Catch:{ all -> 0x00b3 }
            r2 = r2.f49411i;	 Catch:{ all -> 0x00b3 }
            r4 = r7.f54983d;	 Catch:{ all -> 0x00b3 }
            r4 = r4.f49432d;	 Catch:{ all -> 0x00b3 }
            r4 = r4.f49413k;	 Catch:{ all -> 0x00b3 }
            r4 = r4.m60423d();	 Catch:{ all -> 0x00b3 }
            r4 = r4 / 2;
            r4 = (long) r4;	 Catch:{ all -> 0x00b3 }
            r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r6 < 0) goto L_0x00b1;
        L_0x009d:
            r2 = r7.f54983d;	 Catch:{ all -> 0x00b3 }
            r2 = r2.f49432d;	 Catch:{ all -> 0x00b3 }
            r3 = 0;
            r4 = r7.f54983d;	 Catch:{ all -> 0x00b3 }
            r4 = r4.f49432d;	 Catch:{ all -> 0x00b3 }
            r4 = r4.f49411i;	 Catch:{ all -> 0x00b3 }
            r2.m60330a(r3, r4);	 Catch:{ all -> 0x00b3 }
            r2 = r7.f54983d;	 Catch:{ all -> 0x00b3 }
            r2 = r2.f49432d;	 Catch:{ all -> 0x00b3 }
            r2.f49411i = r0;	 Catch:{ all -> 0x00b3 }
        L_0x00b1:
            monitor-exit(r10);	 Catch:{ all -> 0x00b3 }
            return r8;
        L_0x00b3:
            r8 = move-exception;
            monitor-exit(r10);	 Catch:{ all -> 0x00b3 }
            throw r8;
        L_0x00b6:
            r8 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x00b6 }
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.g.b.read(okio.c, long):long");
        }

        /* renamed from: a */
        private void m64357a() throws IOException {
            this.f54983d.f49434f.m64455c();
            while (this.f54985f.m66945a() == 0 && !this.f54982b && !this.f54981a && this.f54983d.f49436h == null) {
                try {
                    this.f54983d.m60391l();
                } catch (Throwable th) {
                    this.f54983d.f49434f.m66941b();
                }
            }
            this.f54983d.f49434f.m66941b();
        }

        /* renamed from: a */
        void m64359a(BufferedSource bufferedSource, long j) throws IOException {
            if (f54980c || !Thread.holdsLock(this.f54983d)) {
                while (j > 0) {
                    boolean z;
                    Object obj;
                    Object obj2;
                    synchronized (this.f54983d) {
                        z = this.f54982b;
                        obj = null;
                        obj2 = j + this.f54985f.m66945a() > this.f54986g ? 1 : null;
                    }
                    if (obj2 != null) {
                        bufferedSource.skip(j);
                        this.f54983d.m60379b(ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        bufferedSource.skip(j);
                        return;
                    } else {
                        long read = bufferedSource.read(this.f54984e, j);
                        if (read == -1) {
                            throw new EOFException();
                        }
                        long j2 = j - read;
                        synchronized (this.f54983d) {
                            if (this.f54985f.m66945a() == 0) {
                                obj = 1;
                            }
                            this.f54985f.writeAll(this.f54984e);
                            if (obj != null) {
                                this.f54983d.notifyAll();
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
            return this.f54983d.f49434f;
        }

        public void close() throws IOException {
            synchronized (this.f54983d) {
                this.f54981a = f54980c;
                this.f54985f.m66964d();
                this.f54983d.notifyAll();
            }
            this.f54983d.m60389j();
        }

        /* renamed from: b */
        private void m64358b() throws IOException {
            if (this.f54981a) {
                throw new IOException("stream closed");
            } else if (this.f54983d.f49436h != null) {
                throw new StreamResetException(this.f54983d.f49436h);
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.g$c */
    class C18548c extends C17701a {
        /* renamed from: a */
        final /* synthetic */ C15939g f57794a;

        C18548c(C15939g c15939g) {
            this.f57794a = c15939g;
        }

        /* renamed from: a */
        protected void mo13893a() {
            this.f57794a.m60379b(ErrorCode.CANCEL);
        }

        /* renamed from: a */
        protected IOException mo13892a(IOException iOException) {
            IOException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* renamed from: b */
        public void m66941b() throws IOException {
            if (k_()) {
                throw mo13892a(null);
            }
        }
    }

    C15939g(int i, C15936e c15936e, boolean z, boolean z2, List<C15929a> list) {
        if (c15936e == null) {
            throw new NullPointerException("connection == null");
        } else if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        } else {
            this.f49431c = i;
            this.f49432d = c15936e;
            this.f49430b = (long) c15936e.f49414l.m60423d();
            this.f49440m = new C17681b(this, (long) c15936e.f49413k.m60423d());
            this.f49433e = new C17680a(this);
            this.f49440m.f54982b = z2;
            this.f49433e.f54977b = z;
            this.f49437j = list;
        }
    }

    /* renamed from: a */
    public int m60374a() {
        return this.f49431c;
    }

    /* renamed from: b */
    public synchronized boolean m60380b() {
        if (this.f49436h != null) {
            return false;
        }
        if ((this.f49440m.f54982b || this.f49440m.f54981a) && ((this.f49433e.f54977b || this.f49433e.f54976a) && this.f49439l)) {
            return false;
        }
        return f49428i;
    }

    /* renamed from: c */
    public boolean m60382c() {
        if (this.f49432d.f49403a == ((this.f49431c & 1) == 1 ? f49428i : false)) {
            return f49428i;
        }
        return false;
    }

    /* renamed from: d */
    public synchronized List<C15929a> m60383d() throws IOException {
        List<C15929a> list;
        if (m60382c()) {
            this.f49434f.m64455c();
            while (this.f49438k == null && this.f49436h == null) {
                try {
                    m60391l();
                } finally {
                    this.f49434f.m66941b();
                }
            }
            list = this.f49438k;
            if (list != null) {
                this.f49438k = null;
            } else {
                throw new StreamResetException(this.f49436h);
            }
        }
        throw new IllegalStateException("servers cannot read response headers");
        return list;
    }

    /* renamed from: e */
    public C15982q m60384e() {
        return this.f49434f;
    }

    /* renamed from: f */
    public C15982q m60385f() {
        return this.f49435g;
    }

    /* renamed from: g */
    public Source m60386g() {
        return this.f49440m;
    }

    /* renamed from: h */
    public Sink m60387h() {
        synchronized (this) {
            if (this.f49439l || m60382c()) {
            } else {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f49433e;
    }

    /* renamed from: a */
    public void m60377a(ErrorCode errorCode) throws IOException {
        if (m60373d(errorCode)) {
            this.f49432d.m60343b(this.f49431c, errorCode);
        }
    }

    /* renamed from: b */
    public void m60379b(ErrorCode errorCode) {
        if (m60373d(errorCode)) {
            this.f49432d.m60333a(this.f49431c, errorCode);
        }
    }

    /* renamed from: d */
    private boolean m60373d(ErrorCode errorCode) {
        if (f49428i || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f49436h != null) {
                    return false;
                } else if (this.f49440m.f54982b && this.f49433e.f54977b) {
                    return false;
                } else {
                    this.f49436h = errorCode;
                    notifyAll();
                    this.f49432d.m60341b(this.f49431c);
                    return f49428i;
                }
            }
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    void m60376a(List<C15929a> list) {
        if (f49428i || !Thread.holdsLock(this)) {
            boolean z;
            synchronized (this) {
                z = f49428i;
                this.f49439l = f49428i;
                if (this.f49438k == null) {
                    this.f49438k = list;
                    z = m60380b();
                    notifyAll();
                } else {
                    List arrayList = new ArrayList();
                    arrayList.addAll(this.f49438k);
                    arrayList.add(null);
                    arrayList.addAll(list);
                    this.f49438k = arrayList;
                }
            }
            if (!z) {
                this.f49432d.m60341b(this.f49431c);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    void m60378a(BufferedSource bufferedSource, int i) throws IOException {
        if (f49428i || !Thread.holdsLock(this)) {
            this.f49440m.m64359a(bufferedSource, (long) i);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: i */
    void m60388i() {
        if (f49428i || !Thread.holdsLock(this)) {
            boolean b;
            synchronized (this) {
                this.f49440m.f54982b = f49428i;
                b = m60380b();
                notifyAll();
            }
            if (!b) {
                this.f49432d.m60341b(this.f49431c);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    synchronized void m60381c(ErrorCode errorCode) {
        if (this.f49436h == null) {
            this.f49436h = errorCode;
            notifyAll();
        }
    }

    /* renamed from: j */
    void m60389j() throws IOException {
        if (f49428i || !Thread.holdsLock(this)) {
            Object obj;
            boolean b;
            synchronized (this) {
                obj = (!this.f49440m.f54982b && this.f49440m.f54981a && (this.f49433e.f54977b || this.f49433e.f54976a)) ? 1 : null;
                b = m60380b();
            }
            if (obj != null) {
                m60377a(ErrorCode.CANCEL);
                return;
            } else if (!b) {
                this.f49432d.m60341b(this.f49431c);
                return;
            } else {
                return;
            }
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    void m60375a(long j) {
        this.f49430b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: k */
    void m60390k() throws IOException {
        if (this.f49433e.f54976a) {
            throw new IOException("stream closed");
        } else if (this.f49433e.f54977b) {
            throw new IOException("stream finished");
        } else if (this.f49436h != null) {
            throw new StreamResetException(this.f49436h);
        }
    }

    /* renamed from: l */
    void m60391l() throws java.io.InterruptedIOException {
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
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.g.l():void");
    }
}
