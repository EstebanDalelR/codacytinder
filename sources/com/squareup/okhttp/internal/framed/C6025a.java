package com.squareup.okhttp.internal.framed;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.exoplayer2.Format;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.C6022e;
import com.squareup.okhttp.internal.C6058i;
import com.squareup.okhttp.internal.framed.FrameReader.Handler;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okio.BufferedSource;
import okio.ByteString;
import okio.C15976k;
import okio.C18549c;

/* renamed from: com.squareup.okhttp.internal.framed.a */
public final class C6025a implements Closeable {
    /* renamed from: k */
    static final /* synthetic */ boolean f22054k = true;
    /* renamed from: l */
    private static final ExecutorService f22055l = new ThreadPoolExecutor(0, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C6058i.m26244a("OkHttp FramedConnection", (boolean) f22054k));
    /* renamed from: a */
    final Protocol f22056a;
    /* renamed from: b */
    final boolean f22057b;
    /* renamed from: c */
    long f22058c;
    /* renamed from: d */
    long f22059d;
    /* renamed from: e */
    final C6038i f22060e;
    /* renamed from: f */
    final C6038i f22061f;
    /* renamed from: g */
    final Variant f22062g;
    /* renamed from: h */
    final Socket f22063h;
    /* renamed from: i */
    final FrameWriter f22064i;
    /* renamed from: j */
    final C7223b f22065j;
    /* renamed from: m */
    private final IncomingStreamHandler f22066m;
    /* renamed from: n */
    private final Map<Integer, C6027b> f22067n;
    /* renamed from: o */
    private final String f22068o;
    /* renamed from: p */
    private int f22069p;
    /* renamed from: q */
    private int f22070q;
    /* renamed from: r */
    private boolean f22071r;
    /* renamed from: s */
    private long f22072s;
    /* renamed from: t */
    private final ExecutorService f22073t;
    /* renamed from: u */
    private Map<Integer, C6037h> f22074u;
    /* renamed from: v */
    private final PushObserver f22075v;
    /* renamed from: w */
    private int f22076w;
    /* renamed from: x */
    private boolean f22077x;
    /* renamed from: y */
    private final Set<Integer> f22078y;

    /* renamed from: com.squareup.okhttp.internal.framed.a$a */
    public static class C6024a {
        /* renamed from: a */
        private String f22048a;
        /* renamed from: b */
        private Socket f22049b;
        /* renamed from: c */
        private IncomingStreamHandler f22050c = IncomingStreamHandler.f22046a;
        /* renamed from: d */
        private Protocol f22051d = Protocol.SPDY_3;
        /* renamed from: e */
        private PushObserver f22052e = PushObserver.f22047a;
        /* renamed from: f */
        private boolean f22053f;

        public C6024a(String str, boolean z, Socket socket) throws IOException {
            this.f22048a = str;
            this.f22053f = z;
            this.f22049b = socket;
        }

        /* renamed from: a */
        public C6024a m25975a(Protocol protocol) {
            this.f22051d = protocol;
            return this;
        }

        /* renamed from: a */
        public C6025a m25976a() throws IOException {
            return new C6025a();
        }
    }

    /* renamed from: com.squareup.okhttp.internal.framed.a$b */
    class C7223b extends C6022e implements Handler {
        /* renamed from: a */
        FrameReader f26047a;
        /* renamed from: c */
        final /* synthetic */ C6025a f26048c;

        public void ackSettings() {
        }

        public void alternateService(int i, String str, ByteString byteString, String str2, int i2, long j) {
        }

        public void priority(int i, int i2, int i3, boolean z) {
        }

        private C7223b(C6025a c6025a) {
            this.f26048c = c6025a;
            super("OkHttp %s", c6025a.f22068o);
        }

        /* renamed from: b */
        protected void mo6491b() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r6 = this;
            r0 = com.squareup.okhttp.internal.framed.ErrorCode.INTERNAL_ERROR;
            r1 = com.squareup.okhttp.internal.framed.ErrorCode.INTERNAL_ERROR;
            r2 = r6.f26048c;	 Catch:{ IOException -> 0x003d }
            r2 = r2.f22062g;	 Catch:{ IOException -> 0x003d }
            r3 = r6.f26048c;	 Catch:{ IOException -> 0x003d }
            r3 = r3.f22063h;	 Catch:{ IOException -> 0x003d }
            r3 = okio.C15976k.b(r3);	 Catch:{ IOException -> 0x003d }
            r3 = okio.C15976k.a(r3);	 Catch:{ IOException -> 0x003d }
            r4 = r6.f26048c;	 Catch:{ IOException -> 0x003d }
            r4 = r4.f22057b;	 Catch:{ IOException -> 0x003d }
            r2 = r2.newReader(r3, r4);	 Catch:{ IOException -> 0x003d }
            r6.f26047a = r2;	 Catch:{ IOException -> 0x003d }
            r2 = r6.f26048c;	 Catch:{ IOException -> 0x003d }
            r2 = r2.f22057b;	 Catch:{ IOException -> 0x003d }
            if (r2 != 0) goto L_0x0029;	 Catch:{ IOException -> 0x003d }
        L_0x0024:
            r2 = r6.f26047a;	 Catch:{ IOException -> 0x003d }
            r2.readConnectionPreface();	 Catch:{ IOException -> 0x003d }
        L_0x0029:
            r2 = r6.f26047a;	 Catch:{ IOException -> 0x003d }
            r2 = r2.nextFrame(r6);	 Catch:{ IOException -> 0x003d }
            if (r2 == 0) goto L_0x0032;	 Catch:{ IOException -> 0x003d }
        L_0x0031:
            goto L_0x0029;	 Catch:{ IOException -> 0x003d }
        L_0x0032:
            r2 = com.squareup.okhttp.internal.framed.ErrorCode.NO_ERROR;	 Catch:{ IOException -> 0x003d }
            r0 = com.squareup.okhttp.internal.framed.ErrorCode.CANCEL;	 Catch:{ IOException -> 0x0039 }
            r1 = r6.f26048c;	 Catch:{ IOException -> 0x0046 }
            goto L_0x0043;
        L_0x0039:
            r0 = r2;
            goto L_0x003d;
        L_0x003b:
            r2 = move-exception;
            goto L_0x0050;
        L_0x003d:
            r2 = com.squareup.okhttp.internal.framed.ErrorCode.PROTOCOL_ERROR;	 Catch:{ all -> 0x003b }
            r0 = com.squareup.okhttp.internal.framed.ErrorCode.PROTOCOL_ERROR;	 Catch:{ all -> 0x004c }
            r1 = r6.f26048c;	 Catch:{ IOException -> 0x0046 }
        L_0x0043:
            r1.m25982a(r2, r0);	 Catch:{ IOException -> 0x0046 }
        L_0x0046:
            r0 = r6.f26047a;
            com.squareup.okhttp.internal.C6058i.m26247a(r0);
            return;
        L_0x004c:
            r0 = move-exception;
            r5 = r2;
            r2 = r0;
            r0 = r5;
        L_0x0050:
            r3 = r6.f26048c;	 Catch:{ IOException -> 0x0055 }
            r3.m25982a(r0, r1);	 Catch:{ IOException -> 0x0055 }
        L_0x0055:
            r0 = r6.f26047a;
            com.squareup.okhttp.internal.C6058i.m26247a(r0);
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.a.b.b():void");
        }

        public void data(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException {
            if (this.f26048c.m26003d(i)) {
                this.f26048c.m25981a(i, bufferedSource, i2, z);
                return;
            }
            C6027b a = this.f26048c.m26011a(i);
            if (a == null) {
                this.f26048c.m26014a(i, ErrorCode.INVALID_STREAM);
                bufferedSource.skip((long) i2);
                return;
            }
            a.m26040a(bufferedSource, i2);
            if (z) {
                a.m26049h();
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void headers(boolean r9, boolean r10, int r11, int r12, java.util.List<com.squareup.okhttp.internal.framed.C6028c> r13, com.squareup.okhttp.internal.framed.HeadersMode r14) {
            /*
            r8 = this;
            r12 = r8.f26048c;
            r12 = r12.m26003d(r11);
            if (r12 == 0) goto L_0x000e;
        L_0x0008:
            r9 = r8.f26048c;
            r9.m25980a(r11, r13, r10);
            return;
        L_0x000e:
            r12 = r8.f26048c;
            monitor-enter(r12);
            r0 = r8.f26048c;	 Catch:{ all -> 0x00a5 }
            r0 = r0.f22071r;	 Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x001b;
        L_0x0019:
            monitor-exit(r12);	 Catch:{ all -> 0x00a5 }
            return;
        L_0x001b:
            r0 = r8.f26048c;	 Catch:{ all -> 0x00a5 }
            r0 = r0.m26011a(r11);	 Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x008a;
        L_0x0023:
            r14 = r14.failIfStreamAbsent();	 Catch:{ all -> 0x00a5 }
            if (r14 == 0) goto L_0x0032;
        L_0x0029:
            r9 = r8.f26048c;	 Catch:{ all -> 0x00a5 }
            r10 = com.squareup.okhttp.internal.framed.ErrorCode.INVALID_STREAM;	 Catch:{ all -> 0x00a5 }
            r9.m26014a(r11, r10);	 Catch:{ all -> 0x00a5 }
            monitor-exit(r12);	 Catch:{ all -> 0x00a5 }
            return;
        L_0x0032:
            r14 = r8.f26048c;	 Catch:{ all -> 0x00a5 }
            r14 = r14.f22069p;	 Catch:{ all -> 0x00a5 }
            if (r11 > r14) goto L_0x003c;
        L_0x003a:
            monitor-exit(r12);	 Catch:{ all -> 0x00a5 }
            return;
        L_0x003c:
            r14 = r11 % 2;
            r0 = r8.f26048c;	 Catch:{ all -> 0x00a5 }
            r0 = r0.f22070q;	 Catch:{ all -> 0x00a5 }
            r1 = 2;
            r0 = r0 % r1;
            if (r14 != r0) goto L_0x004a;
        L_0x0048:
            monitor-exit(r12);	 Catch:{ all -> 0x00a5 }
            return;
        L_0x004a:
            r14 = new com.squareup.okhttp.internal.framed.b;	 Catch:{ all -> 0x00a5 }
            r4 = r8.f26048c;	 Catch:{ all -> 0x00a5 }
            r2 = r14;
            r3 = r11;
            r5 = r9;
            r6 = r10;
            r7 = r13;
            r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x00a5 }
            r9 = r8.f26048c;	 Catch:{ all -> 0x00a5 }
            r9.f22069p = r11;	 Catch:{ all -> 0x00a5 }
            r9 = r8.f26048c;	 Catch:{ all -> 0x00a5 }
            r9 = r9.f22067n;	 Catch:{ all -> 0x00a5 }
            r10 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x00a5 }
            r9.put(r10, r14);	 Catch:{ all -> 0x00a5 }
            r9 = com.squareup.okhttp.internal.framed.C6025a.f22055l;	 Catch:{ all -> 0x00a5 }
            r10 = new com.squareup.okhttp.internal.framed.a$b$1;	 Catch:{ all -> 0x00a5 }
            r13 = "OkHttp %s stream %d";
            r0 = new java.lang.Object[r1];	 Catch:{ all -> 0x00a5 }
            r1 = 0;
            r2 = r8.f26048c;	 Catch:{ all -> 0x00a5 }
            r2 = r2.f22068o;	 Catch:{ all -> 0x00a5 }
            r0[r1] = r2;	 Catch:{ all -> 0x00a5 }
            r1 = 1;
            r11 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x00a5 }
            r0[r1] = r11;	 Catch:{ all -> 0x00a5 }
            r10.<init>(r8, r13, r0, r14);	 Catch:{ all -> 0x00a5 }
            r9.execute(r10);	 Catch:{ all -> 0x00a5 }
            monitor-exit(r12);	 Catch:{ all -> 0x00a5 }
            return;
        L_0x008a:
            monitor-exit(r12);	 Catch:{ all -> 0x00a5 }
            r9 = r14.failIfStreamPresent();
            if (r9 == 0) goto L_0x009c;
        L_0x0091:
            r9 = com.squareup.okhttp.internal.framed.ErrorCode.PROTOCOL_ERROR;
            r0.m26041b(r9);
            r9 = r8.f26048c;
            r9.m26018b(r11);
            return;
        L_0x009c:
            r0.m26039a(r13, r14);
            if (r10 == 0) goto L_0x00a4;
        L_0x00a1:
            r0.m26049h();
        L_0x00a4:
            return;
        L_0x00a5:
            r9 = move-exception;
            monitor-exit(r12);	 Catch:{ all -> 0x00a5 }
            throw r9;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.a.b.headers(boolean, boolean, int, int, java.util.List, com.squareup.okhttp.internal.framed.HeadersMode):void");
        }

        public void rstStream(int i, ErrorCode errorCode) {
            if (this.f26048c.m26003d(i)) {
                this.f26048c.m26001c(i, errorCode);
                return;
            }
            i = this.f26048c.m26018b(i);
            if (i != 0) {
                i.m26043c(errorCode);
            }
        }

        public void settings(boolean z, C6038i c6038i) {
            synchronized (this.f26048c) {
                long j;
                boolean e = this.f26048c.f22061f.m26103e(65536);
                if (z) {
                    this.f26048c.f22061f.m26095a();
                }
                this.f26048c.f22061f.m26096a(c6038i);
                if (this.f26048c.m26010a() == Protocol.HTTP_2) {
                    m30966a(c6038i);
                }
                z = this.f26048c.f22061f.m26103e(65536);
                C6027b[] c6027bArr = null;
                if (z || z == e) {
                    j = false;
                } else {
                    j = (long) (z - e);
                    if (!this.f26048c.f22077x) {
                        this.f26048c.m26016a(j);
                        this.f26048c.f22077x = C6025a.f22054k;
                    }
                    if (!this.f26048c.f22067n.isEmpty()) {
                        c6027bArr = (C6027b[]) this.f26048c.f22067n.values().toArray(new C6027b[this.f26048c.f22067n.size()]);
                    }
                }
            }
            if (c6027bArr != null && j != false) {
                for (C6027b c6027b : c6027bArr) {
                    synchronized (c6027b) {
                        c6027b.m26037a(j);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m30966a(final C6038i c6038i) {
            C6025a.f22055l.execute(new C6022e(this, "OkHttp %s ACK Settings", new Object[]{this.f26048c.f22068o}) {
                /* renamed from: c */
                final /* synthetic */ C7223b f26046c;

                /* renamed from: b */
                public void mo6491b() {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r2 = this;
                    r0 = r2.f26046c;	 Catch:{ IOException -> 0x000b }
                    r0 = r0.f26048c;	 Catch:{ IOException -> 0x000b }
                    r0 = r0.f22064i;	 Catch:{ IOException -> 0x000b }
                    r1 = r7;	 Catch:{ IOException -> 0x000b }
                    r0.ackSettings(r1);	 Catch:{ IOException -> 0x000b }
                L_0x000b:
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.a.b.2.b():void");
                }
            });
        }

        public void ping(boolean z, int i, int i2) {
            if (z) {
                z = this.f26048c.m25999c(i);
                if (z) {
                    z.m26092b();
                    return;
                }
                return;
            }
            this.f26048c.m25990a((boolean) C6025a.f22054k, i, i2, null);
        }

        public void goAway(int i, ErrorCode errorCode, ByteString byteString) {
            byteString.h();
            synchronized (this.f26048c) {
                C6027b[] c6027bArr = (C6027b[]) this.f26048c.f22067n.values().toArray(new C6027b[this.f26048c.f22067n.size()]);
                this.f26048c.f22071r = C6025a.f22054k;
            }
            for (C6027b c6027b : c6027bArr) {
                if (c6027b.m26036a() > i && c6027b.m26044c()) {
                    c6027b.m26043c(ErrorCode.REFUSED_STREAM);
                    this.f26048c.m26018b(c6027b.m26036a());
                }
            }
        }

        public void windowUpdate(int i, long j) {
            if (i == 0) {
                synchronized (this.f26048c) {
                    i = this.f26048c;
                    i.f22059d += j;
                    this.f26048c.notifyAll();
                }
                return;
            }
            i = this.f26048c.m26011a(i);
            if (i != 0) {
                synchronized (i) {
                    i.m26037a(j);
                }
            }
        }

        public void pushPromise(int i, int i2, List<C6028c> list) {
            this.f26048c.m25979a(i2, (List) list);
        }
    }

    private C6025a(C6024a c6024a) throws IOException {
        this.f22067n = new HashMap();
        this.f22072s = System.nanoTime();
        this.f22058c = 0;
        this.f22060e = new C6038i();
        this.f22061f = new C6038i();
        this.f22077x = false;
        this.f22078y = new LinkedHashSet();
        this.f22056a = c6024a.f22051d;
        this.f22075v = c6024a.f22052e;
        this.f22057b = c6024a.f22053f;
        this.f22066m = c6024a.f22050c;
        int i = 2;
        this.f22070q = c6024a.f22053f ? 1 : 2;
        if (c6024a.f22053f && this.f22056a == Protocol.HTTP_2) {
            this.f22070q += 2;
        }
        if (c6024a.f22053f) {
            i = 1;
        }
        this.f22076w = i;
        if (c6024a.f22053f) {
            this.f22060e.m26094a(7, 0, 16777216);
        }
        this.f22068o = c6024a.f22048a;
        if (this.f22056a == Protocol.HTTP_2) {
            this.f22062g = new C7229e();
            this.f22073t = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C6058i.m26244a(String.format("OkHttp %s Push Observer", new Object[]{this.f22068o}), (boolean) f22054k));
            this.f22061f.m26094a(7, 0, 65535);
            this.f22061f.m26094a(5, 0, 16384);
        } else if (this.f22056a == Protocol.SPDY_3) {
            this.f22062g = new C7232j();
            this.f22073t = null;
        } else {
            throw new AssertionError(this.f22056a);
        }
        this.f22059d = (long) this.f22061f.m26103e(65536);
        this.f22063h = c6024a.f22049b;
        this.f22064i = this.f22062g.newWriter(C15976k.a(C15976k.a(c6024a.f22049b)), this.f22057b);
        this.f22065j = new C7223b();
        new Thread(this.f22065j).start();
    }

    /* renamed from: a */
    public Protocol m26010a() {
        return this.f22056a;
    }

    /* renamed from: a */
    synchronized C6027b m26011a(int i) {
        return (C6027b) this.f22067n.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    synchronized C6027b m26018b(int i) {
        C6027b c6027b;
        c6027b = (C6027b) this.f22067n.remove(Integer.valueOf(i));
        if (c6027b != null && this.f22067n.isEmpty()) {
            m25989a((boolean) f22054k);
        }
        notifyAll();
        return c6027b;
    }

    /* renamed from: a */
    private synchronized void m25989a(boolean z) {
        this.f22072s = z ? System.nanoTime() : Format.OFFSET_SAMPLE_RELATIVE;
    }

    /* renamed from: b */
    public synchronized boolean m26020b() {
        return this.f22072s != Format.OFFSET_SAMPLE_RELATIVE ? f22054k : false;
    }

    /* renamed from: c */
    public synchronized long m26021c() {
        return this.f22072s;
    }

    /* renamed from: a */
    public C6027b m26012a(List<C6028c> list, boolean z, boolean z2) throws IOException {
        return m25977a(0, (List) list, z, z2);
    }

    /* renamed from: a */
    private C6027b m25977a(int i, List<C6028c> list, boolean z, boolean z2) throws IOException {
        C6027b c6027b;
        boolean z3 = z ^ 1;
        z2 ^= 1;
        synchronized (this.f22064i) {
            synchronized (this) {
                if (this.f22071r) {
                    throw new IOException("shutdown");
                }
                int i2 = this.f22070q;
                this.f22070q += 2;
                c6027b = new C6027b(i2, this, z3, z2, list);
                if (c6027b.m26042b()) {
                    this.f22067n.put(Integer.valueOf(i2), c6027b);
                    m25989a(false);
                }
            }
            if (i == 0) {
                this.f22064i.synStream(z3, z2, i2, i, list);
            } else if (this.f22057b) {
                throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
            } else {
                this.f22064i.pushPromise(i, i2, list);
            }
        }
        if (!z) {
            this.f22064i.flush();
        }
        return c6027b;
    }

    /* renamed from: a */
    public void m26015a(int r11, boolean r12, okio.C18549c r13, long r14) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        r0 = 0;
        r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        r3 = 0;
        if (r2 != 0) goto L_0x000d;
    L_0x0007:
        r14 = r10.f22064i;
        r14.data(r12, r11, r13, r3);
        return;
    L_0x000d:
        r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x0066;
    L_0x0011:
        monitor-enter(r10);
    L_0x0012:
        r4 = r10.f22059d;	 Catch:{ InterruptedException -> 0x005e }
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));	 Catch:{ InterruptedException -> 0x005e }
        if (r2 > 0) goto L_0x0030;	 Catch:{ InterruptedException -> 0x005e }
    L_0x0018:
        r2 = r10.f22067n;	 Catch:{ InterruptedException -> 0x005e }
        r4 = java.lang.Integer.valueOf(r11);	 Catch:{ InterruptedException -> 0x005e }
        r2 = r2.containsKey(r4);	 Catch:{ InterruptedException -> 0x005e }
        if (r2 != 0) goto L_0x002c;	 Catch:{ InterruptedException -> 0x005e }
    L_0x0024:
        r11 = new java.io.IOException;	 Catch:{ InterruptedException -> 0x005e }
        r12 = "stream closed";	 Catch:{ InterruptedException -> 0x005e }
        r11.<init>(r12);	 Catch:{ InterruptedException -> 0x005e }
        throw r11;	 Catch:{ InterruptedException -> 0x005e }
    L_0x002c:
        r10.wait();	 Catch:{ InterruptedException -> 0x005e }
        goto L_0x0012;
    L_0x0030:
        r4 = r10.f22059d;	 Catch:{ all -> 0x005c }
        r4 = java.lang.Math.min(r14, r4);	 Catch:{ all -> 0x005c }
        r2 = (int) r4;	 Catch:{ all -> 0x005c }
        r4 = r10.f22064i;	 Catch:{ all -> 0x005c }
        r4 = r4.maxDataLength();	 Catch:{ all -> 0x005c }
        r2 = java.lang.Math.min(r2, r4);	 Catch:{ all -> 0x005c }
        r4 = r10.f22059d;	 Catch:{ all -> 0x005c }
        r6 = (long) r2;	 Catch:{ all -> 0x005c }
        r8 = r4 - r6;	 Catch:{ all -> 0x005c }
        r10.f22059d = r8;	 Catch:{ all -> 0x005c }
        monitor-exit(r10);	 Catch:{ all -> 0x005c }
        r4 = 0;
        r4 = r14 - r6;
        r14 = r10.f22064i;
        if (r12 == 0) goto L_0x0056;
    L_0x0050:
        r15 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r15 != 0) goto L_0x0056;
    L_0x0054:
        r15 = 1;
        goto L_0x0057;
    L_0x0056:
        r15 = 0;
    L_0x0057:
        r14.data(r15, r11, r13, r2);
        r14 = r4;
        goto L_0x000d;
    L_0x005c:
        r11 = move-exception;
        goto L_0x0064;
    L_0x005e:
        r11 = new java.io.InterruptedIOException;	 Catch:{ all -> 0x005c }
        r11.<init>();	 Catch:{ all -> 0x005c }
        throw r11;	 Catch:{ all -> 0x005c }
    L_0x0064:
        monitor-exit(r10);	 Catch:{ all -> 0x005c }
        throw r11;
    L_0x0066:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.a.a(int, boolean, okio.c, long):void");
    }

    /* renamed from: a */
    void m26016a(long j) {
        this.f22059d += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: a */
    void m26014a(int i, ErrorCode errorCode) {
        final int i2 = i;
        final ErrorCode errorCode2 = errorCode;
        f22055l.submit(new C6022e(this, "OkHttp %s stream %d", new Object[]{this.f22068o, Integer.valueOf(i)}) {
            /* renamed from: d */
            final /* synthetic */ C6025a f26019d;

            /* renamed from: b */
            public void mo6491b() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r3 = this;
                r0 = r3.f26019d;	 Catch:{ IOException -> 0x0009 }
                r1 = r5;	 Catch:{ IOException -> 0x0009 }
                r2 = r6;	 Catch:{ IOException -> 0x0009 }
                r0.m26019b(r1, r2);	 Catch:{ IOException -> 0x0009 }
            L_0x0009:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.a.1.b():void");
            }
        });
    }

    /* renamed from: b */
    void m26019b(int i, ErrorCode errorCode) throws IOException {
        this.f22064i.rstStream(i, errorCode);
    }

    /* renamed from: a */
    void m26013a(int i, long j) {
        final int i2 = i;
        final long j2 = j;
        f22055l.execute(new C6022e(this, "OkHttp Window Update %s stream %d", new Object[]{this.f22068o, Integer.valueOf(i)}) {
            /* renamed from: d */
            final /* synthetic */ C6025a f26022d;

            /* renamed from: b */
            public void mo6491b() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r4 = this;
                r0 = r4.f26022d;	 Catch:{ IOException -> 0x000b }
                r0 = r0.f22064i;	 Catch:{ IOException -> 0x000b }
                r1 = r5;	 Catch:{ IOException -> 0x000b }
                r2 = r6;	 Catch:{ IOException -> 0x000b }
                r0.windowUpdate(r1, r2);	 Catch:{ IOException -> 0x000b }
            L_0x000b:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.a.2.b():void");
            }
        });
    }

    /* renamed from: a */
    private void m25990a(boolean z, int i, int i2, C6037h c6037h) {
        final boolean z2 = z;
        final int i3 = i;
        final int i4 = i2;
        final C6037h c6037h2 = c6037h;
        f22055l.execute(new C6022e(this, "OkHttp %s ping %08x%08x", new Object[]{this.f22068o, Integer.valueOf(i), Integer.valueOf(i2)}) {
            /* renamed from: f */
            final /* synthetic */ C6025a f26027f;

            /* renamed from: b */
            public void mo6491b() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r5 = this;
                r0 = r5.f26027f;	 Catch:{ IOException -> 0x000d }
                r1 = r5;	 Catch:{ IOException -> 0x000d }
                r2 = r6;	 Catch:{ IOException -> 0x000d }
                r3 = r7;	 Catch:{ IOException -> 0x000d }
                r4 = r8;	 Catch:{ IOException -> 0x000d }
                r0.m25995b(r1, r2, r3, r4);	 Catch:{ IOException -> 0x000d }
            L_0x000d:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.a.3.b():void");
            }
        });
    }

    /* renamed from: b */
    private void m25995b(boolean z, int i, int i2, C6037h c6037h) throws IOException {
        synchronized (this.f22064i) {
            if (c6037h != null) {
                c6037h.m26091a();
            }
            this.f22064i.ping(z, i, i2);
        }
    }

    /* renamed from: c */
    private synchronized C6037h m25999c(int i) {
        return this.f22074u != null ? (C6037h) this.f22074u.remove(Integer.valueOf(i)) : 0;
    }

    /* renamed from: d */
    public void m26022d() throws IOException {
        this.f22064i.flush();
    }

    /* renamed from: a */
    public void m26017a(ErrorCode errorCode) throws IOException {
        synchronized (this.f22064i) {
            synchronized (this) {
                if (this.f22071r) {
                    return;
                }
                this.f22071r = f22054k;
                int i = this.f22069p;
                this.f22064i.goAway(i, errorCode, C6058i.f22207a);
            }
        }
    }

    public void close() throws IOException {
        m25982a(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    /* renamed from: a */
    private void m25982a(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        if (f22054k || !Thread.holdsLock(this)) {
            int i;
            C6027b[] c6027bArr;
            Map map = null;
            try {
                m26017a(errorCode);
                errorCode = null;
            } catch (IOException e) {
                errorCode = e;
            }
            synchronized (this) {
                i = 0;
                if (this.f22067n.isEmpty()) {
                    c6027bArr = null;
                } else {
                    c6027bArr = (C6027b[]) this.f22067n.values().toArray(new C6027b[this.f22067n.size()]);
                    this.f22067n.clear();
                    m25989a(false);
                }
                if (this.f22074u != null) {
                    C6037h[] c6037hArr = (C6037h[]) this.f22074u.values().toArray(new C6037h[this.f22074u.size()]);
                    this.f22074u = null;
                    map = c6037hArr;
                }
            }
            if (c6027bArr != null) {
                ErrorCode errorCode3 = errorCode;
                for (C6027b a : c6027bArr) {
                    try {
                        a.m26038a(errorCode2);
                    } catch (IOException e2) {
                        if (errorCode3 != null) {
                            errorCode3 = e2;
                        }
                    }
                }
                errorCode = errorCode3;
            }
            if (map != null) {
                errorCode2 = map.length;
                while (i < errorCode2) {
                    map[i].m26093c();
                    i++;
                }
            }
            try {
                this.f22064i.close();
            } catch (ErrorCode errorCode22) {
                if (errorCode == null) {
                    errorCode = errorCode22;
                }
            }
            try {
                this.f22063h.close();
            } catch (IOException e3) {
                errorCode = e3;
            }
            if (errorCode != null) {
                throw errorCode;
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: e */
    public void m26023e() throws IOException {
        this.f22064i.connectionPreface();
        this.f22064i.settings(this.f22060e);
        int e = this.f22060e.m26103e(65536);
        if (e != 65536) {
            this.f22064i.windowUpdate(0, (long) (e - 65536));
        }
    }

    /* renamed from: d */
    private boolean m26003d(int i) {
        return (this.f22056a == Protocol.HTTP_2 && i != 0 && (i & 1) == 0) ? f22054k : false;
    }

    /* renamed from: a */
    private void m25979a(int i, List<C6028c> list) {
        synchronized (this) {
            if (this.f22078y.contains(Integer.valueOf(i))) {
                m26014a(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.f22078y.add(Integer.valueOf(i));
            final int i2 = i;
            final List<C6028c> list2 = list;
            this.f22073t.execute(new C6022e(this, "OkHttp %s Push Request[%s]", new Object[]{this.f22068o, Integer.valueOf(i)}) {
                /* renamed from: d */
                final /* synthetic */ C6025a f26030d;

                /* renamed from: b */
                public void mo6491b() {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r3 = this;
                    r0 = r3.f26030d;
                    r0 = r0.f22075v;
                    r1 = r5;
                    r2 = r6;
                    r0 = r0.onRequest(r1, r2);
                    if (r0 == 0) goto L_0x0032;
                L_0x0010:
                    r0 = r3.f26030d;	 Catch:{ IOException -> 0x0032 }
                    r0 = r0.f22064i;	 Catch:{ IOException -> 0x0032 }
                    r1 = r5;	 Catch:{ IOException -> 0x0032 }
                    r2 = com.squareup.okhttp.internal.framed.ErrorCode.CANCEL;	 Catch:{ IOException -> 0x0032 }
                    r0.rstStream(r1, r2);	 Catch:{ IOException -> 0x0032 }
                    r0 = r3.f26030d;	 Catch:{ IOException -> 0x0032 }
                    monitor-enter(r0);	 Catch:{ IOException -> 0x0032 }
                    r1 = r3.f26030d;	 Catch:{ all -> 0x002f }
                    r1 = r1.f22078y;	 Catch:{ all -> 0x002f }
                    r2 = r5;	 Catch:{ all -> 0x002f }
                    r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x002f }
                    r1.remove(r2);	 Catch:{ all -> 0x002f }
                    monitor-exit(r0);	 Catch:{ all -> 0x002f }
                    goto L_0x0032;	 Catch:{ all -> 0x002f }
                L_0x002f:
                    r1 = move-exception;	 Catch:{ all -> 0x002f }
                    monitor-exit(r0);	 Catch:{ all -> 0x002f }
                    throw r1;	 Catch:{ IOException -> 0x0032 }
                L_0x0032:
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.a.4.b():void");
                }
            });
        }
    }

    /* renamed from: a */
    private void m25980a(int i, List<C6028c> list, boolean z) {
        final int i2 = i;
        final List<C6028c> list2 = list;
        final boolean z2 = z;
        this.f22073t.execute(new C6022e(this, "OkHttp %s Push Headers[%s]", new Object[]{this.f22068o, Integer.valueOf(i)}) {
            /* renamed from: e */
            final /* synthetic */ C6025a f26034e;

            /* renamed from: b */
            public void mo6491b() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r4 = this;
                r0 = r4.f26034e;
                r0 = r0.f22075v;
                r1 = r5;
                r2 = r6;
                r3 = r7;
                r0 = r0.onHeaders(r1, r2, r3);
                if (r0 == 0) goto L_0x001d;
            L_0x0012:
                r1 = r4.f26034e;	 Catch:{ IOException -> 0x003a }
                r1 = r1.f22064i;	 Catch:{ IOException -> 0x003a }
                r2 = r5;	 Catch:{ IOException -> 0x003a }
                r3 = com.squareup.okhttp.internal.framed.ErrorCode.CANCEL;	 Catch:{ IOException -> 0x003a }
                r1.rstStream(r2, r3);	 Catch:{ IOException -> 0x003a }
            L_0x001d:
                if (r0 != 0) goto L_0x0023;	 Catch:{ IOException -> 0x003a }
            L_0x001f:
                r0 = r7;	 Catch:{ IOException -> 0x003a }
                if (r0 == 0) goto L_0x003a;	 Catch:{ IOException -> 0x003a }
            L_0x0023:
                r0 = r4.f26034e;	 Catch:{ IOException -> 0x003a }
                monitor-enter(r0);	 Catch:{ IOException -> 0x003a }
                r1 = r4.f26034e;	 Catch:{ all -> 0x0037 }
                r1 = r1.f22078y;	 Catch:{ all -> 0x0037 }
                r2 = r5;	 Catch:{ all -> 0x0037 }
                r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0037 }
                r1.remove(r2);	 Catch:{ all -> 0x0037 }
                monitor-exit(r0);	 Catch:{ all -> 0x0037 }
                goto L_0x003a;	 Catch:{ all -> 0x0037 }
            L_0x0037:
                r1 = move-exception;	 Catch:{ all -> 0x0037 }
                monitor-exit(r0);	 Catch:{ all -> 0x0037 }
                throw r1;	 Catch:{ IOException -> 0x003a }
            L_0x003a:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.a.5.b():void");
            }
        });
    }

    /* renamed from: a */
    private void m25981a(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
        final C18549c c18549c = new C18549c();
        long j = (long) i2;
        bufferedSource.require(j);
        bufferedSource.read(c18549c, j);
        if (c18549c.a() != j) {
            bufferedSource = new StringBuilder();
            bufferedSource.append(c18549c.a());
            bufferedSource.append(" != ");
            bufferedSource.append(i2);
            throw new IOException(bufferedSource.toString());
        }
        final int i3 = i;
        final int i4 = i2;
        final boolean z2 = z;
        this.f22073t.execute(new C6022e(this, "OkHttp %s Push Data[%s]", new Object[]{this.f22068o, Integer.valueOf(i)}) {
            /* renamed from: f */
            final /* synthetic */ C6025a f26039f;

            /* renamed from: b */
            public void mo6491b() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r5 = this;
                r0 = r5.f26039f;	 Catch:{ IOException -> 0x003c }
                r0 = r0.f22075v;	 Catch:{ IOException -> 0x003c }
                r1 = r4;	 Catch:{ IOException -> 0x003c }
                r2 = r5;	 Catch:{ IOException -> 0x003c }
                r3 = r6;	 Catch:{ IOException -> 0x003c }
                r4 = r7;	 Catch:{ IOException -> 0x003c }
                r0 = r0.onData(r1, r2, r3, r4);	 Catch:{ IOException -> 0x003c }
                if (r0 == 0) goto L_0x001f;	 Catch:{ IOException -> 0x003c }
            L_0x0014:
                r1 = r5.f26039f;	 Catch:{ IOException -> 0x003c }
                r1 = r1.f22064i;	 Catch:{ IOException -> 0x003c }
                r2 = r4;	 Catch:{ IOException -> 0x003c }
                r3 = com.squareup.okhttp.internal.framed.ErrorCode.CANCEL;	 Catch:{ IOException -> 0x003c }
                r1.rstStream(r2, r3);	 Catch:{ IOException -> 0x003c }
            L_0x001f:
                if (r0 != 0) goto L_0x0025;	 Catch:{ IOException -> 0x003c }
            L_0x0021:
                r0 = r7;	 Catch:{ IOException -> 0x003c }
                if (r0 == 0) goto L_0x003c;	 Catch:{ IOException -> 0x003c }
            L_0x0025:
                r0 = r5.f26039f;	 Catch:{ IOException -> 0x003c }
                monitor-enter(r0);	 Catch:{ IOException -> 0x003c }
                r1 = r5.f26039f;	 Catch:{ all -> 0x0039 }
                r1 = r1.f22078y;	 Catch:{ all -> 0x0039 }
                r2 = r4;	 Catch:{ all -> 0x0039 }
                r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0039 }
                r1.remove(r2);	 Catch:{ all -> 0x0039 }
                monitor-exit(r0);	 Catch:{ all -> 0x0039 }
                goto L_0x003c;	 Catch:{ all -> 0x0039 }
            L_0x0039:
                r1 = move-exception;	 Catch:{ all -> 0x0039 }
                monitor-exit(r0);	 Catch:{ all -> 0x0039 }
                throw r1;	 Catch:{ IOException -> 0x003c }
            L_0x003c:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.a.6.b():void");
            }
        });
    }

    /* renamed from: c */
    private void m26001c(int i, ErrorCode errorCode) {
        final int i2 = i;
        final ErrorCode errorCode2 = errorCode;
        this.f22073t.execute(new C6022e(this, "OkHttp %s Push Reset[%s]", new Object[]{this.f22068o, Integer.valueOf(i)}) {
            /* renamed from: d */
            final /* synthetic */ C6025a f26042d;

            /* renamed from: b */
            public void mo6491b() {
                this.f26042d.f22075v.onReset(i2, errorCode2);
                synchronized (this.f26042d) {
                    this.f26042d.f22078y.remove(Integer.valueOf(i2));
                }
            }
        });
    }
}
