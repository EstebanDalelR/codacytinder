package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import okhttp3.C15885a;
import okhttp3.C15894f;
import okhttp3.C15969u;
import okhttp3.C17692o;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Interceptor.Chain;
import okhttp3.internal.C15900a;
import okhttp3.internal.C15908c;
import okhttp3.internal.connection.C15919e.C15918a;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: okhttp3.internal.connection.f */
public final class C15921f {
    /* renamed from: d */
    static final /* synthetic */ boolean f49335d = true;
    /* renamed from: a */
    public final C15885a f49336a;
    /* renamed from: b */
    public final Call f49337b;
    /* renamed from: c */
    public final EventListener f49338c;
    /* renamed from: e */
    private C15918a f49339e;
    /* renamed from: f */
    private C15969u f49340f;
    /* renamed from: g */
    private final C15894f f49341g;
    /* renamed from: h */
    private final Object f49342h;
    /* renamed from: i */
    private final C15919e f49343i;
    /* renamed from: j */
    private int f49344j;
    /* renamed from: k */
    private C17659c f49345k;
    /* renamed from: l */
    private boolean f49346l;
    /* renamed from: m */
    private boolean f49347m;
    /* renamed from: n */
    private boolean f49348n;
    /* renamed from: o */
    private HttpCodec f49349o;

    /* renamed from: okhttp3.internal.connection.f$a */
    public static final class C15920a extends WeakReference<C15921f> {
        /* renamed from: a */
        public final Object f49334a;

        C15920a(C15921f c15921f, Object obj) {
            super(c15921f);
            this.f49334a = obj;
        }
    }

    public C15921f(C15894f c15894f, C15885a c15885a, Call call, EventListener eventListener, Object obj) {
        this.f49341g = c15894f;
        this.f49336a = c15885a;
        this.f49337b = call;
        this.f49338c = eventListener;
        this.f49343i = new C15919e(c15885a, m60243i(), call, eventListener);
        this.f49342h = obj;
    }

    /* renamed from: a */
    public HttpCodec m60246a(C17692o c17692o, Chain chain, boolean z) {
        try {
            c17692o = m60240a(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), c17692o.m64394d(), c17692o.m64409s(), z).m64305a(c17692o, chain, this);
            synchronized (this.f49341g) {
                this.f49349o = c17692o;
            }
            return c17692o;
        } catch (C17692o c17692o2) {
            throw new RouteException(c17692o2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private okhttp3.internal.connection.C17659c m60240a(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
        r3 = this;
    L_0x0000:
        r0 = r3.m60239a(r4, r5, r6, r7, r8);
        r1 = r3.f49341g;
        monitor-enter(r1);
        r2 = r0.f54887b;	 Catch:{ all -> 0x0019 }
        if (r2 != 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        return r0;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        r1 = r0.m64313a(r9);
        if (r1 != 0) goto L_0x0018;
    L_0x0014:
        r3.m60253e();
        goto L_0x0000;
    L_0x0018:
        return r0;
    L_0x0019:
        r4 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.f.a(int, int, int, int, boolean, boolean):okhttp3.internal.connection.c");
    }

    /* renamed from: a */
    private C17659c m60239a(int i, int i2, int i3, int i4, boolean z) throws IOException {
        Socket h;
        C17659c c17659c;
        C15969u c15969u;
        Object obj;
        synchronized (this.f49341g) {
            Connection connection;
            Socket socket;
            C17659c c17659c2;
            try {
                if (r1.f49347m) {
                    throw new IllegalStateException("released");
                } else if (r1.f49349o != null) {
                    throw new IllegalStateException("codec != null");
                } else if (r1.f49348n) {
                    throw new IOException("Canceled");
                } else {
                    c17659c2 = r1.f49345k;
                    h = m60242h();
                    connection = r1.f49345k;
                    socket = null;
                    if (connection != null) {
                        c17659c2 = r1.f49345k;
                    } else {
                        connection = c17659c2;
                        c17659c2 = null;
                    }
                    if (!r1.f49346l) {
                        connection = socket;
                    }
                    if (c17659c2 == null) {
                        C15900a.f49230a.mo13400a(r1.f49341g, r1.f49336a, r1, socket);
                        if (r1.f49345k != null) {
                            c17659c = r1.f49345k;
                            c15969u = socket;
                            obj = 1;
                        } else {
                            c15969u = r1.f49340f;
                            c17659c = c17659c2;
                        }
                    } else {
                        c17659c = c17659c2;
                        c15969u = socket;
                    }
                    obj = null;
                }
            } finally {
                C17659c c17659c3 = 
/*
Method generation error in method: okhttp3.internal.connection.f.a(int, int, int, int, boolean):okhttp3.internal.connection.c, dex: classes4.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: MERGE  (r0_7 'c17659c3' okhttp3.internal.connection.c) = (r0_6 'c17659c3' okhttp3.internal.connection.c), (r6_5 okhttp3.internal.connection.c) in method: okhttp3.internal.connection.f.a(int, int, int, int, boolean):okhttp3.internal.connection.c, dex: classes4.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:203)
	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:100)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:50)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:299)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:229)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
Caused by: jadx.core.utils.exceptions.CodegenException: MERGE can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 29 more

*/

                /* renamed from: h */
                private Socket m60242h() {
                    if (f49335d || Thread.holdsLock(this.f49341g)) {
                        C17659c c17659c = this.f49345k;
                        return (c17659c == null || !c17659c.f54886a) ? null : m60238a(false, false, (boolean) f49335d);
                    } else {
                        throw new AssertionError();
                    }
                }

                /* renamed from: a */
                public void m60249a(boolean z, HttpCodec httpCodec, long j, IOException iOException) {
                    Socket a;
                    this.f49338c.m59956b(this.f49337b, j);
                    synchronized (this.f49341g) {
                        if (httpCodec != null) {
                            if (httpCodec == this.f49349o) {
                                if (!z) {
                                    C17659c c17659c = this.f49345k;
                                    c17659c.f54887b++;
                                }
                                Connection connection = this.f49345k;
                                a = m60238a(z, false, (boolean) f49335d);
                                if (this.f49345k != null) {
                                    connection = null;
                                }
                                httpCodec = this.f49347m;
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("expected ");
                        stringBuilder.append(this.f49349o);
                        stringBuilder.append(" but was ");
                        stringBuilder.append(httpCodec);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    C15908c.m60166a(a);
                    if (connection != null) {
                        this.f49338c.m59957b(this.f49337b, connection);
                    }
                    if (iOException != null) {
                        this.f49338c.m59945a(this.f49337b, iOException);
                    } else if (httpCodec != null) {
                        this.f49338c.m59962g(this.f49337b);
                    }
                }

                /* renamed from: a */
                public HttpCodec m60245a() {
                    HttpCodec httpCodec;
                    synchronized (this.f49341g) {
                        httpCodec = this.f49349o;
                    }
                    return httpCodec;
                }

                /* renamed from: i */
                private C15917d m60243i() {
                    return C15900a.f49230a.mo13401a(this.f49341g);
                }

                /* renamed from: b */
                public C15969u m60250b() {
                    return this.f49340f;
                }

                /* renamed from: c */
                public synchronized C17659c m60251c() {
                    return this.f49345k;
                }

                /* renamed from: d */
                public void m60252d() {
                    Socket a;
                    synchronized (this.f49341g) {
                        Connection connection = this.f49345k;
                        a = m60238a(false, (boolean) f49335d, false);
                        if (this.f49345k != null) {
                            connection = null;
                        }
                    }
                    C15908c.m60166a(a);
                    if (connection != null) {
                        this.f49338c.m59957b(this.f49337b, connection);
                    }
                }

                /* renamed from: e */
                public void m60253e() {
                    Socket a;
                    synchronized (this.f49341g) {
                        Connection connection = this.f49345k;
                        a = m60238a((boolean) f49335d, false, false);
                        if (this.f49345k != null) {
                            connection = null;
                        }
                    }
                    C15908c.m60166a(a);
                    if (connection != null) {
                        this.f49338c.m59957b(this.f49337b, connection);
                    }
                }

                /* renamed from: a */
                private Socket m60238a(boolean z, boolean z2, boolean z3) {
                    if (f49335d || Thread.holdsLock(this.f49341g)) {
                        if (z3) {
                            this.f49349o = null;
                        }
                        if (z2) {
                            this.f49347m = f49335d;
                        }
                        if (this.f49345k) {
                            if (z) {
                                this.f49345k.f54886a = f49335d;
                            }
                            if (!this.f49349o && (this.f49347m || this.f49345k.f54886a)) {
                                m60241b(this.f49345k);
                                if (this.f49345k.f54889d.isEmpty()) {
                                    this.f49345k.f54890e = System.nanoTime();
                                    if (C15900a.f49230a.mo13407a(this.f49341g, this.f49345k)) {
                                        z = this.f49345k.socket();
                                        this.f49345k = null;
                                        return z;
                                    }
                                }
                                z = false;
                                this.f49345k = null;
                                return z;
                            }
                        }
                        return false;
                    }
                    throw new AssertionError();
                }

                /* renamed from: f */
                public void m60254f() {
                    synchronized (this.f49341g) {
                        this.f49348n = f49335d;
                        HttpCodec httpCodec = this.f49349o;
                        C17659c c17659c = this.f49345k;
                    }
                    if (httpCodec != null) {
                        httpCodec.cancel();
                    } else if (c17659c != null) {
                        c17659c.m64307a();
                    }
                }

                /* renamed from: a */
                public void m60247a(IOException iOException) {
                    Connection connection;
                    Socket a;
                    synchronized (this.f49341g) {
                        boolean z;
                        if (iOException instanceof StreamResetException) {
                            StreamResetException streamResetException = (StreamResetException) iOException;
                            if (streamResetException.f49358a == ErrorCode.REFUSED_STREAM) {
                                this.f49344j++;
                            }
                            if (streamResetException.f49358a != ErrorCode.REFUSED_STREAM || this.f49344j > 1) {
                                this.f49340f = null;
                            }
                            z = null;
                            connection = this.f49345k;
                            a = m60238a(z, false, (boolean) f49335d);
                            if (!(this.f49345k == null && this.f49346l)) {
                                connection = null;
                            }
                        } else {
                            if (this.f49345k != null && (!this.f49345k.m64314b() || (iOException instanceof ConnectionShutdownException))) {
                                if (this.f49345k.f54887b == 0) {
                                    if (!(this.f49340f == null || iOException == null)) {
                                        this.f49343i.m60235a(this.f49340f, iOException);
                                    }
                                    this.f49340f = null;
                                }
                            }
                            z = null;
                            connection = this.f49345k;
                            a = m60238a(z, false, (boolean) f49335d);
                            connection = null;
                        }
                        z = f49335d;
                        connection = this.f49345k;
                        a = m60238a(z, false, (boolean) f49335d);
                        connection = null;
                    }
                    C15908c.m60166a(a);
                    if (connection != null) {
                        this.f49338c.m59957b(this.f49337b, connection);
                    }
                }

                /* renamed from: a */
                public void m60248a(C17659c c17659c, boolean z) {
                    if (!f49335d && !Thread.holdsLock(this.f49341g)) {
                        throw new AssertionError();
                    } else if (this.f49345k != null) {
                        throw new IllegalStateException();
                    } else {
                        this.f49345k = c17659c;
                        this.f49346l = z;
                        c17659c.f54889d.add(new C15920a(this, this.f49342h));
                    }
                }

                /* renamed from: b */
                private void m60241b(C17659c c17659c) {
                    int size = c17659c.f54889d.size();
                    for (int i = 0; i < size; i++) {
                        if (((Reference) c17659c.f54889d.get(i)).get() == this) {
                            c17659c.f54889d.remove(i);
                            return;
                        }
                    }
                    throw new IllegalStateException();
                }

                /* renamed from: a */
                public Socket m60244a(C17659c c17659c) {
                    if (f49335d || Thread.holdsLock(this.f49341g)) {
                        if (this.f49349o == null) {
                            if (this.f49345k.f54889d.size() == 1) {
                                Reference reference = (Reference) this.f49345k.f54889d.get(0);
                                Socket a = m60238a((boolean) f49335d, false, false);
                                this.f49345k = c17659c;
                                c17659c.f54889d.add(reference);
                                return a;
                            }
                        }
                        throw new IllegalStateException();
                    }
                    throw new AssertionError();
                }

                /* renamed from: g */
                public boolean m60255g() {
                    if (this.f49340f == null && (this.f49339e == null || !this.f49339e.m60227a())) {
                        if (!this.f49343i.m60236a()) {
                            return false;
                        }
                    }
                    return f49335d;
                }

                public String toString() {
                    C17659c c = m60251c();
                    return c != null ? c.toString() : this.f49336a.toString();
                }
            }
