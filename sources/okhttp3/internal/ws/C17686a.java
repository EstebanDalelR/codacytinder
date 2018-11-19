package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.C15970v;
import okhttp3.C17692o;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.Protocol;
import okhttp3.WebSocket;
import okhttp3.internal.C15900a;
import okhttp3.internal.C15908c;
import okhttp3.internal.connection.C15921f;
import okhttp3.internal.ws.WebSocketReader.FrameCallback;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

/* renamed from: okhttp3.internal.ws.a */
public final class C17686a implements WebSocket, FrameCallback {
    /* renamed from: b */
    static final /* synthetic */ boolean f54991b = true;
    /* renamed from: c */
    private static final List<Protocol> f54992c = Collections.singletonList(Protocol.HTTP_1_1);
    /* renamed from: a */
    final C15970v f54993a;
    /* renamed from: d */
    private final C15963q f54994d;
    /* renamed from: e */
    private final Random f54995e;
    /* renamed from: f */
    private final long f54996f;
    /* renamed from: g */
    private final String f54997g;
    /* renamed from: h */
    private Call f54998h;
    /* renamed from: i */
    private final Runnable f54999i;
    /* renamed from: j */
    private WebSocketReader f55000j;
    /* renamed from: k */
    private C15953c f55001k;
    /* renamed from: l */
    private ScheduledExecutorService f55002l;
    /* renamed from: m */
    private C15951e f55003m;
    /* renamed from: n */
    private final ArrayDeque<ByteString> f55004n = new ArrayDeque();
    /* renamed from: o */
    private final ArrayDeque<Object> f55005o = new ArrayDeque();
    /* renamed from: p */
    private long f55006p;
    /* renamed from: q */
    private boolean f55007q;
    /* renamed from: r */
    private ScheduledFuture<?> f55008r;
    /* renamed from: s */
    private int f55009s = -1;
    /* renamed from: t */
    private String f55010t;
    /* renamed from: u */
    private boolean f55011u;
    /* renamed from: v */
    private int f55012v;
    /* renamed from: w */
    private int f55013w;
    /* renamed from: x */
    private int f55014x;
    /* renamed from: y */
    private boolean f55015y;

    /* renamed from: okhttp3.internal.ws.a$1 */
    class C159461 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C17686a f49479a;

        C159461(C17686a c17686a) {
            this.f49479a = c17686a;
        }

        public void run() {
            while (this.f49479a.m64370b()) {
                try {
                } catch (Exception e) {
                    this.f49479a.m64365a(e, null);
                    return;
                }
            }
        }
    }

    /* renamed from: okhttp3.internal.ws.a$a */
    final class C15947a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C17686a f49480a;

        C15947a(C17686a c17686a) {
            this.f49480a = c17686a;
        }

        public void run() {
            this.f49480a.cancel();
        }
    }

    /* renamed from: okhttp3.internal.ws.a$b */
    static final class C15948b {
        /* renamed from: a */
        final int f49481a;
        /* renamed from: b */
        final ByteString f49482b;
        /* renamed from: c */
        final long f49483c;

        C15948b(int i, ByteString byteString, long j) {
            this.f49481a = i;
            this.f49482b = byteString;
            this.f49483c = j;
        }
    }

    /* renamed from: okhttp3.internal.ws.a$c */
    static final class C15949c {
        /* renamed from: a */
        final int f49484a;
        /* renamed from: b */
        final ByteString f49485b;

        C15949c(int i, ByteString byteString) {
            this.f49484a = i;
            this.f49485b = byteString;
        }
    }

    /* renamed from: okhttp3.internal.ws.a$d */
    private final class C15950d implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C17686a f49486a;

        C15950d(C17686a c17686a) {
            this.f49486a = c17686a;
        }

        public void run() {
            this.f49486a.m64371c();
        }
    }

    /* renamed from: okhttp3.internal.ws.a$e */
    public static abstract class C15951e implements Closeable {
        /* renamed from: c */
        public final boolean f49487c;
        /* renamed from: d */
        public final BufferedSource f49488d;
        /* renamed from: e */
        public final BufferedSink f49489e;

        public C15951e(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.f49487c = z;
            this.f49488d = bufferedSource;
            this.f49489e = bufferedSink;
        }
    }

    public C17686a(C15963q c15963q, C15970v c15970v, Random random, long j) {
        if ("GET".equals(c15963q.m60527b())) {
            this.f54994d = c15963q;
            this.f54993a = c15970v;
            this.f54995e = random;
            this.f54996f = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.f54997g = ByteString.m60581a(bArr).mo13424b();
            this.f54999i = new C159461(this);
            return;
        }
        random = new StringBuilder();
        random.append("Request must be GET: ");
        random.append(c15963q.m60527b());
        throw new IllegalArgumentException(random.toString());
    }

    public C15963q request() {
        return this.f54994d;
    }

    public synchronized long queueSize() {
        return this.f55006p;
    }

    public void cancel() {
        this.f54998h.cancel();
    }

    /* renamed from: a */
    public void m64367a(C17692o c17692o) {
        c17692o = c17692o.m64416z().m60496a(EventListener.f49064a).m60492a(f54992c).m60505b();
        final C15963q d = this.f54994d.m60531e().m60511a("Upgrade", "websocket").m60511a("Connection", "Upgrade").m60511a("Sec-WebSocket-Key", this.f54997g).m60511a("Sec-WebSocket-Version", "13").m60524d();
        this.f54998h = C15900a.f49230a.mo13399a(c17692o, d);
        this.f54998h.enqueue(new Callback(this) {
            /* renamed from: b */
            final /* synthetic */ C17686a f54990b;

            public void onResponse(Call call, C15966s c15966s) {
                try {
                    this.f54990b.m64368a(c15966s);
                    C15921f a = C15900a.f49230a.mo13402a(call);
                    a.m60253e();
                    C15951e a2 = a.m60251c().m64306a(a);
                    try {
                        this.f54990b.f54993a.mo12270a(this.f54990b, c15966s);
                        c15966s = new StringBuilder();
                        c15966s.append("OkHttp WebSocket ");
                        c15966s.append(d.m60526a().m60019p());
                        this.f54990b.m64366a(c15966s.toString(), a2);
                        a.m60251c().socket().setSoTimeout(null);
                        this.f54990b.m64364a();
                    } catch (Exception e) {
                        this.f54990b.m64365a(e, null);
                    }
                } catch (Exception e2) {
                    this.f54990b.m64365a(e2, c15966s);
                    C15908c.m60165a((Closeable) c15966s);
                }
            }

            public void onFailure(Call call, IOException iOException) {
                this.f54990b.m64365a((Exception) iOException, null);
            }
        });
    }

    /* renamed from: a */
    void m64368a(C15966s c15966s) throws ProtocolException {
        if (c15966s.m60555c() != 101) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected HTTP 101 response but was '");
            stringBuilder.append(c15966s.m60555c());
            stringBuilder.append(" ");
            stringBuilder.append(c15966s.m60557e());
            stringBuilder.append("'");
            throw new ProtocolException(stringBuilder.toString());
        }
        String a = c15966s.m60551a("Connection");
        if ("Upgrade".equalsIgnoreCase(a)) {
            a = c15966s.m60551a("Upgrade");
            if ("websocket".equalsIgnoreCase(a)) {
                c15966s = c15966s.m60551a("Sec-WebSocket-Accept");
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(this.f54997g);
                stringBuilder2.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                a = ByteString.m60580a(stringBuilder2.toString()).mo13426d().mo13424b();
                if (!a.equals(c15966s)) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Expected 'Sec-WebSocket-Accept' header value '");
                    stringBuilder3.append(a);
                    stringBuilder3.append("' but was '");
                    stringBuilder3.append(c15966s);
                    stringBuilder3.append("'");
                    throw new ProtocolException(stringBuilder3.toString());
                }
                return;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Expected 'Upgrade' header value 'websocket' but was '");
            stringBuilder.append(a);
            stringBuilder.append("'");
            throw new ProtocolException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Expected 'Connection' header value 'Upgrade' but was '");
        stringBuilder.append(a);
        stringBuilder.append("'");
        throw new ProtocolException(stringBuilder.toString());
    }

    /* renamed from: a */
    public void m64366a(String str, C15951e c15951e) throws IOException {
        synchronized (this) {
            this.f55003m = c15951e;
            this.f55001k = new C15953c(c15951e.f49487c, c15951e.f49489e, this.f54995e);
            this.f55002l = new ScheduledThreadPoolExecutor(1, C15908c.m60163a(str, false));
            if (this.f54996f != 0) {
                this.f55002l.scheduleAtFixedRate(new C15950d(this), this.f54996f, this.f54996f, TimeUnit.MILLISECONDS);
            }
            if (this.f55005o.isEmpty() == null) {
                m64363d();
            }
        }
        this.f55000j = new WebSocketReader(c15951e.f49487c, c15951e.f49488d, this);
    }

    /* renamed from: a */
    public void m64364a() throws IOException {
        while (this.f55009s == -1) {
            this.f55000j.m60444a();
        }
    }

    public void onReadMessage(String str) throws IOException {
        this.f54993a.mo12268a((WebSocket) this, str);
    }

    public void onReadMessage(ByteString byteString) throws IOException {
        this.f54993a.mo12271a((WebSocket) this, byteString);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onReadPing(okio.ByteString r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f55011u;	 Catch:{ all -> 0x0024 }
        if (r0 != 0) goto L_0x0022;
    L_0x0005:
        r0 = r1.f55007q;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x0012;
    L_0x0009:
        r0 = r1.f55005o;	 Catch:{ all -> 0x0024 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0022;
    L_0x0012:
        r0 = r1.f55004n;	 Catch:{ all -> 0x0024 }
        r0.add(r2);	 Catch:{ all -> 0x0024 }
        r1.m64363d();	 Catch:{ all -> 0x0024 }
        r2 = r1.f55013w;	 Catch:{ all -> 0x0024 }
        r2 = r2 + 1;
        r1.f55013w = r2;	 Catch:{ all -> 0x0024 }
        monitor-exit(r1);
        return;
    L_0x0022:
        monitor-exit(r1);
        return;
    L_0x0024:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.a.onReadPing(okio.ByteString):void");
    }

    public synchronized void onReadPong(ByteString byteString) {
        this.f55014x++;
        this.f55015y = null;
    }

    public void onReadClose(int i, String str) {
        Closeable closeable;
        if (i == -1) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            if (this.f55009s != -1) {
                throw new IllegalStateException("already closed");
            }
            this.f55009s = i;
            this.f55010t = str;
            if (this.f55007q && this.f55005o.isEmpty()) {
                closeable = this.f55003m;
                this.f55003m = null;
                if (this.f55008r != null) {
                    this.f55008r.cancel(false);
                }
                this.f55002l.shutdown();
            } else {
                closeable = null;
            }
        }
        try {
            this.f54993a.mo12267a((WebSocket) this, i, str);
            if (closeable != null) {
                this.f54993a.mo12272b(this, i, str);
            }
            C15908c.m60165a(closeable);
        } catch (Throwable th) {
            C15908c.m60165a(closeable);
        }
    }

    public boolean send(String str) {
        if (str != null) {
            return m64362a(ByteString.m60580a(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    public boolean send(ByteString byteString) {
        if (byteString != null) {
            return m64362a(byteString, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private synchronized boolean m64362a(okio.ByteString r9, int r10) {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.f55011u;	 Catch:{ all -> 0x0040 }
        r1 = 0;
        if (r0 != 0) goto L_0x003e;
    L_0x0006:
        r0 = r8.f55007q;	 Catch:{ all -> 0x0040 }
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        goto L_0x003e;
    L_0x000b:
        r2 = r8.f55006p;	 Catch:{ all -> 0x0040 }
        r0 = r9.mo13431h();	 Catch:{ all -> 0x0040 }
        r4 = (long) r0;	 Catch:{ all -> 0x0040 }
        r6 = r2 + r4;
        r2 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0023;
    L_0x001b:
        r9 = 1001; // 0x3e9 float:1.403E-42 double:4.946E-321;
        r10 = 0;
        r8.close(r9, r10);	 Catch:{ all -> 0x0040 }
        monitor-exit(r8);
        return r1;
    L_0x0023:
        r0 = r8.f55006p;	 Catch:{ all -> 0x0040 }
        r2 = r9.mo13431h();	 Catch:{ all -> 0x0040 }
        r2 = (long) r2;	 Catch:{ all -> 0x0040 }
        r4 = r0 + r2;
        r8.f55006p = r4;	 Catch:{ all -> 0x0040 }
        r0 = r8.f55005o;	 Catch:{ all -> 0x0040 }
        r1 = new okhttp3.internal.ws.a$c;	 Catch:{ all -> 0x0040 }
        r1.<init>(r10, r9);	 Catch:{ all -> 0x0040 }
        r0.add(r1);	 Catch:{ all -> 0x0040 }
        r8.m64363d();	 Catch:{ all -> 0x0040 }
        r9 = 1;
        monitor-exit(r8);
        return r9;
    L_0x003e:
        monitor-exit(r8);
        return r1;
    L_0x0040:
        r9 = move-exception;
        monitor-exit(r8);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.a.a(okio.ByteString, int):boolean");
    }

    public boolean close(int i, String str) {
        return m64369a(i, str, 60000);
    }

    /* renamed from: a */
    synchronized boolean m64369a(int i, String str, long j) {
        C15952b.m60447b(i);
        ByteString byteString = null;
        if (str != null) {
            byteString = ByteString.m60580a(str);
            if (((long) byteString.mo13431h()) > 123) {
                j = new StringBuilder();
                j.append("reason.size() > 123: ");
                j.append(str);
                throw new IllegalArgumentException(j.toString());
            }
        }
        if (this.f55011u == null) {
            if (this.f55007q == null) {
                this.f55007q = f54991b;
                this.f55005o.add(new C15948b(i, byteString, j));
                m64363d();
                return f54991b;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m64363d() {
        if (!f54991b && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (this.f55002l != null) {
            this.f55002l.execute(this.f54999i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    boolean m64370b() throws java.io.IOException {
        /*
        r11 = this;
        monitor-enter(r11);
        r0 = r11.f55011u;	 Catch:{ all -> 0x00ac }
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0006:
        monitor-exit(r11);	 Catch:{ all -> 0x00ac }
        return r1;
    L_0x0008:
        r0 = r11.f55001k;	 Catch:{ all -> 0x00ac }
        r2 = r11.f55004n;	 Catch:{ all -> 0x00ac }
        r2 = r2.poll();	 Catch:{ all -> 0x00ac }
        r2 = (okio.ByteString) r2;	 Catch:{ all -> 0x00ac }
        r3 = -1;
        r4 = 0;
        if (r2 != 0) goto L_0x004c;
    L_0x0016:
        r5 = r11.f55005o;	 Catch:{ all -> 0x00ac }
        r5 = r5.poll();	 Catch:{ all -> 0x00ac }
        r6 = r5 instanceof okhttp3.internal.ws.C17686a.C15948b;	 Catch:{ all -> 0x00ac }
        if (r6 == 0) goto L_0x0046;
    L_0x0020:
        r1 = r11.f55009s;	 Catch:{ all -> 0x00ac }
        r6 = r11.f55010t;	 Catch:{ all -> 0x00ac }
        if (r1 == r3) goto L_0x0031;
    L_0x0026:
        r3 = r11.f55003m;	 Catch:{ all -> 0x00ac }
        r11.f55003m = r4;	 Catch:{ all -> 0x00ac }
        r4 = r11.f55002l;	 Catch:{ all -> 0x00ac }
        r4.shutdown();	 Catch:{ all -> 0x00ac }
        r4 = r3;
        goto L_0x004f;
    L_0x0031:
        r3 = r11.f55002l;	 Catch:{ all -> 0x00ac }
        r7 = new okhttp3.internal.ws.a$a;	 Catch:{ all -> 0x00ac }
        r7.<init>(r11);	 Catch:{ all -> 0x00ac }
        r8 = r5;
        r8 = (okhttp3.internal.ws.C17686a.C15948b) r8;	 Catch:{ all -> 0x00ac }
        r8 = r8.f49483c;	 Catch:{ all -> 0x00ac }
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x00ac }
        r3 = r3.schedule(r7, r8, r10);	 Catch:{ all -> 0x00ac }
        r11.f55008r = r3;	 Catch:{ all -> 0x00ac }
        goto L_0x004f;
    L_0x0046:
        if (r5 != 0) goto L_0x004a;
    L_0x0048:
        monitor-exit(r11);	 Catch:{ all -> 0x00ac }
        return r1;
    L_0x004a:
        r6 = r4;
        goto L_0x004e;
    L_0x004c:
        r5 = r4;
        r6 = r5;
    L_0x004e:
        r1 = -1;
    L_0x004f:
        monitor-exit(r11);	 Catch:{ all -> 0x00ac }
        if (r2 == 0) goto L_0x0058;
    L_0x0052:
        r0.m60453b(r2);	 Catch:{ all -> 0x0056 }
        goto L_0x009d;
    L_0x0056:
        r0 = move-exception;
        goto L_0x00a8;
    L_0x0058:
        r2 = r5 instanceof okhttp3.internal.ws.C17686a.C15949c;	 Catch:{ all -> 0x0056 }
        if (r2 == 0) goto L_0x0089;
    L_0x005c:
        r1 = r5;
        r1 = (okhttp3.internal.ws.C17686a.C15949c) r1;	 Catch:{ all -> 0x0056 }
        r1 = r1.f49485b;	 Catch:{ all -> 0x0056 }
        r5 = (okhttp3.internal.ws.C17686a.C15949c) r5;	 Catch:{ all -> 0x0056 }
        r2 = r5.f49484a;	 Catch:{ all -> 0x0056 }
        r3 = r1.mo13431h();	 Catch:{ all -> 0x0056 }
        r5 = (long) r3;	 Catch:{ all -> 0x0056 }
        r0 = r0.m60449a(r2, r5);	 Catch:{ all -> 0x0056 }
        r0 = okio.C15976k.m60608a(r0);	 Catch:{ all -> 0x0056 }
        r0.write(r1);	 Catch:{ all -> 0x0056 }
        r0.close();	 Catch:{ all -> 0x0056 }
        monitor-enter(r11);	 Catch:{ all -> 0x0056 }
        r2 = r11.f55006p;	 Catch:{ all -> 0x0086 }
        r0 = r1.mo13431h();	 Catch:{ all -> 0x0086 }
        r0 = (long) r0;	 Catch:{ all -> 0x0086 }
        r5 = r2 - r0;
        r11.f55006p = r5;	 Catch:{ all -> 0x0086 }
        monitor-exit(r11);	 Catch:{ all -> 0x0086 }
        goto L_0x009d;
    L_0x0086:
        r0 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x0086 }
        throw r0;	 Catch:{ all -> 0x0056 }
    L_0x0089:
        r2 = r5 instanceof okhttp3.internal.ws.C17686a.C15948b;	 Catch:{ all -> 0x0056 }
        if (r2 == 0) goto L_0x00a2;
    L_0x008d:
        r5 = (okhttp3.internal.ws.C17686a.C15948b) r5;	 Catch:{ all -> 0x0056 }
        r2 = r5.f49481a;	 Catch:{ all -> 0x0056 }
        r3 = r5.f49482b;	 Catch:{ all -> 0x0056 }
        r0.m60451a(r2, r3);	 Catch:{ all -> 0x0056 }
        if (r4 == 0) goto L_0x009d;
    L_0x0098:
        r0 = r11.f54993a;	 Catch:{ all -> 0x0056 }
        r0.mo12272b(r11, r1, r6);	 Catch:{ all -> 0x0056 }
    L_0x009d:
        r0 = 1;
        okhttp3.internal.C15908c.m60165a(r4);
        return r0;
    L_0x00a2:
        r0 = new java.lang.AssertionError;	 Catch:{ all -> 0x0056 }
        r0.<init>();	 Catch:{ all -> 0x0056 }
        throw r0;	 Catch:{ all -> 0x0056 }
    L_0x00a8:
        okhttp3.internal.C15908c.m60165a(r4);
        throw r0;
    L_0x00ac:
        r0 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x00ac }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.a.b():boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    void m64371c() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.f55011u;	 Catch:{ all -> 0x0053 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r7);	 Catch:{ all -> 0x0053 }
        return;
    L_0x0007:
        r0 = r7.f55001k;	 Catch:{ all -> 0x0053 }
        r1 = r7.f55015y;	 Catch:{ all -> 0x0053 }
        r2 = -1;
        if (r1 == 0) goto L_0x0011;
    L_0x000e:
        r1 = r7.f55012v;	 Catch:{ all -> 0x0053 }
        goto L_0x0012;
    L_0x0011:
        r1 = -1;
    L_0x0012:
        r3 = r7.f55012v;	 Catch:{ all -> 0x0053 }
        r4 = 1;
        r3 = r3 + r4;
        r7.f55012v = r3;	 Catch:{ all -> 0x0053 }
        r7.f55015y = r4;	 Catch:{ all -> 0x0053 }
        monitor-exit(r7);	 Catch:{ all -> 0x0053 }
        r3 = 0;
        if (r1 == r2) goto L_0x0048;
    L_0x001e:
        r0 = new java.net.SocketTimeoutException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r5 = "sent ping but didn't receive pong within ";
        r2.append(r5);
        r5 = r7.f54996f;
        r2.append(r5);
        r5 = "ms (after ";
        r2.append(r5);
        r1 = r1 - r4;
        r2.append(r1);
        r1 = " successful ping/pongs)";
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        r7.m64365a(r0, r3);
        return;
    L_0x0048:
        r1 = okio.ByteString.f49592b;	 Catch:{ IOException -> 0x004e }
        r0.m60452a(r1);	 Catch:{ IOException -> 0x004e }
        goto L_0x0052;
    L_0x004e:
        r0 = move-exception;
        r7.m64365a(r0, r3);
    L_0x0052:
        return;
    L_0x0053:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x0053 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.a.c():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m64365a(java.lang.Exception r4, @javax.annotation.Nullable okhttp3.C15966s r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.f55011u;	 Catch:{ all -> 0x0031 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r3);	 Catch:{ all -> 0x0031 }
        return;
    L_0x0007:
        r0 = 1;
        r3.f55011u = r0;	 Catch:{ all -> 0x0031 }
        r0 = r3.f55003m;	 Catch:{ all -> 0x0031 }
        r1 = 0;
        r3.f55003m = r1;	 Catch:{ all -> 0x0031 }
        r1 = r3.f55008r;	 Catch:{ all -> 0x0031 }
        if (r1 == 0) goto L_0x0019;
    L_0x0013:
        r1 = r3.f55008r;	 Catch:{ all -> 0x0031 }
        r2 = 0;
        r1.cancel(r2);	 Catch:{ all -> 0x0031 }
    L_0x0019:
        r1 = r3.f55002l;	 Catch:{ all -> 0x0031 }
        if (r1 == 0) goto L_0x0022;
    L_0x001d:
        r1 = r3.f55002l;	 Catch:{ all -> 0x0031 }
        r1.shutdown();	 Catch:{ all -> 0x0031 }
    L_0x0022:
        monitor-exit(r3);	 Catch:{ all -> 0x0031 }
        r1 = r3.f54993a;	 Catch:{ all -> 0x002c }
        r1.mo12269a(r3, r4, r5);	 Catch:{ all -> 0x002c }
        okhttp3.internal.C15908c.m60165a(r0);
        return;
    L_0x002c:
        r4 = move-exception;
        okhttp3.internal.C15908c.m60165a(r0);
        throw r4;
    L_0x0031:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0031 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.a.a(java.lang.Exception, okhttp3.s):void");
    }
}
