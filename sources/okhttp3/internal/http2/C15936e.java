package okhttp3.internal.http2;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.C15905b;
import okhttp3.internal.C15908c;
import okhttp3.internal.http2.C15938f.C15937b;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.C18549c;

/* renamed from: okhttp3.internal.http2.e */
public final class C15936e implements Closeable {
    /* renamed from: r */
    static final /* synthetic */ boolean f49401r = true;
    /* renamed from: s */
    private static final ExecutorService f49402s = new ThreadPoolExecutor(0, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C15908c.m60163a("OkHttp Http2Connection", (boolean) f49401r));
    /* renamed from: a */
    final boolean f49403a;
    /* renamed from: b */
    final C15935b f49404b;
    /* renamed from: c */
    final Map<Integer, C15939g> f49405c = new LinkedHashMap();
    /* renamed from: d */
    final String f49406d;
    /* renamed from: e */
    int f49407e;
    /* renamed from: f */
    int f49408f;
    /* renamed from: g */
    boolean f49409g;
    /* renamed from: h */
    final PushObserver f49410h;
    /* renamed from: i */
    long f49411i = 0;
    /* renamed from: j */
    long f49412j;
    /* renamed from: k */
    C15943j f49413k = new C15943j();
    /* renamed from: l */
    final C15943j f49414l = new C15943j();
    /* renamed from: m */
    boolean f49415m = false;
    /* renamed from: n */
    final Socket f49416n;
    /* renamed from: o */
    final C15940h f49417o;
    /* renamed from: p */
    final C17678d f49418p;
    /* renamed from: q */
    final Set<Integer> f49419q = new LinkedHashSet();
    /* renamed from: t */
    private final ScheduledExecutorService f49420t;
    /* renamed from: u */
    private final ExecutorService f49421u;
    /* renamed from: v */
    private boolean f49422v;

    /* renamed from: okhttp3.internal.http2.e$a */
    public static class C15934a {
        /* renamed from: a */
        Socket f49392a;
        /* renamed from: b */
        String f49393b;
        /* renamed from: c */
        BufferedSource f49394c;
        /* renamed from: d */
        BufferedSink f49395d;
        /* renamed from: e */
        C15935b f49396e = C15935b.f49400f;
        /* renamed from: f */
        PushObserver f49397f = PushObserver.f49357a;
        /* renamed from: g */
        boolean f49398g;
        /* renamed from: h */
        int f49399h;

        public C15934a(boolean z) {
            this.f49398g = z;
        }

        /* renamed from: a */
        public C15934a m60316a(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.f49392a = socket;
            this.f49393b = str;
            this.f49394c = bufferedSource;
            this.f49395d = bufferedSink;
            return this;
        }

        /* renamed from: a */
        public C15934a m60317a(C15935b c15935b) {
            this.f49396e = c15935b;
            return this;
        }

        /* renamed from: a */
        public C15934a m60315a(int i) {
            this.f49399h = i;
            return this;
        }

        /* renamed from: a */
        public C15936e m60318a() {
            return new C15936e(this);
        }
    }

    /* renamed from: okhttp3.internal.http2.e$b */
    public static abstract class C15935b {
        /* renamed from: f */
        public static final C15935b f49400f = new C176731();

        /* renamed from: okhttp3.internal.http2.e$b$1 */
        class C176731 extends C15935b {
            C176731() {
            }

            /* renamed from: a */
            public void mo13348a(C15939g c15939g) throws IOException {
                c15939g.m60377a(ErrorCode.REFUSED_STREAM);
            }
        }

        /* renamed from: a */
        public void mo13347a(C15936e c15936e) {
        }

        /* renamed from: a */
        public abstract void mo13348a(C15939g c15939g) throws IOException;
    }

    /* renamed from: okhttp3.internal.http2.e$c */
    final class C17674c extends C15905b {
        /* renamed from: a */
        final boolean f54958a;
        /* renamed from: c */
        final int f54959c;
        /* renamed from: d */
        final int f54960d;
        /* renamed from: e */
        final /* synthetic */ C15936e f54961e;

        C17674c(C15936e c15936e, boolean z, int i, int i2) {
            this.f54961e = c15936e;
            super("OkHttp %s ping %08x%08x", c15936e.f49406d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f54958a = z;
            this.f54959c = i;
            this.f54960d = i2;
        }

        /* renamed from: c */
        public void mo13367c() {
            this.f54961e.m60340a(this.f54958a, this.f54959c, this.f54960d);
        }
    }

    /* renamed from: okhttp3.internal.http2.e$d */
    class C17678d extends C15905b implements C15937b {
        /* renamed from: a */
        final C15938f f54967a;
        /* renamed from: c */
        final /* synthetic */ C15936e f54968c;

        /* renamed from: a */
        public void mo13368a() {
        }

        /* renamed from: a */
        public void mo13369a(int i, int i2, int i3, boolean z) {
        }

        C17678d(C15936e c15936e, C15938f c15938f) {
            this.f54968c = c15936e;
            super("OkHttp %s", c15936e.f49406d);
            this.f54967a = c15938f;
        }

        /* renamed from: c */
        protected void mo13367c() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r5 = this;
            r0 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR;
            r1 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR;
            r2 = r5.f54967a;	 Catch:{ IOException -> 0x001e }
            r2.m60371a(r5);	 Catch:{ IOException -> 0x001e }
        L_0x0009:
            r2 = r5.f54967a;	 Catch:{ IOException -> 0x001e }
            r3 = 0;	 Catch:{ IOException -> 0x001e }
            r2 = r2.m60372a(r3, r5);	 Catch:{ IOException -> 0x001e }
            if (r2 == 0) goto L_0x0013;	 Catch:{ IOException -> 0x001e }
        L_0x0012:
            goto L_0x0009;	 Catch:{ IOException -> 0x001e }
        L_0x0013:
            r2 = okhttp3.internal.http2.ErrorCode.NO_ERROR;	 Catch:{ IOException -> 0x001e }
            r0 = okhttp3.internal.http2.ErrorCode.CANCEL;	 Catch:{ IOException -> 0x001a }
            r1 = r5.f54968c;	 Catch:{ IOException -> 0x0027 }
            goto L_0x0024;
        L_0x001a:
            r0 = r2;
            goto L_0x001e;
        L_0x001c:
            r2 = move-exception;
            goto L_0x0031;
        L_0x001e:
            r2 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;	 Catch:{ all -> 0x001c }
            r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;	 Catch:{ all -> 0x002d }
            r1 = r5.f54968c;	 Catch:{ IOException -> 0x0027 }
        L_0x0024:
            r1.m60338a(r2, r0);	 Catch:{ IOException -> 0x0027 }
        L_0x0027:
            r0 = r5.f54967a;
            okhttp3.internal.C15908c.m60165a(r0);
            return;
        L_0x002d:
            r0 = move-exception;
            r4 = r2;
            r2 = r0;
            r0 = r4;
        L_0x0031:
            r3 = r5.f54968c;	 Catch:{ IOException -> 0x0036 }
            r3.m60338a(r0, r1);	 Catch:{ IOException -> 0x0036 }
        L_0x0036:
            r0 = r5.f54967a;
            okhttp3.internal.C15908c.m60165a(r0);
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.d.c():void");
        }

        /* renamed from: a */
        public void mo13376a(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException {
            if (this.f54968c.m60346c(i)) {
                this.f54968c.m60334a(i, bufferedSource, i2, z);
                return;
            }
            C15939g a = this.f54968c.m60328a(i);
            if (a == null) {
                this.f54968c.m60333a(i, ErrorCode.PROTOCOL_ERROR);
                bufferedSource.skip((long) i2);
                return;
            }
            a.m60378a(bufferedSource, i2);
            if (z) {
                a.m60388i();
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public void mo13375a(boolean r10, int r11, int r12, java.util.List<okhttp3.internal.http2.C15929a> r13) {
            /*
            r9 = this;
            r12 = r9.f54968c;
            r12 = r12.m60346c(r11);
            if (r12 == 0) goto L_0x000e;
        L_0x0008:
            r12 = r9.f54968c;
            r12.m60332a(r11, r13, r10);
            return;
        L_0x000e:
            r12 = r9.f54968c;
            monitor-enter(r12);
            r0 = r9.f54968c;	 Catch:{ all -> 0x007a }
            r0 = r0.m60328a(r11);	 Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0070;
        L_0x0019:
            r0 = r9.f54968c;	 Catch:{ all -> 0x007a }
            r0 = r0.f49409g;	 Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0021;
        L_0x001f:
            monitor-exit(r12);	 Catch:{ all -> 0x007a }
            return;
        L_0x0021:
            r0 = r9.f54968c;	 Catch:{ all -> 0x007a }
            r0 = r0.f49407e;	 Catch:{ all -> 0x007a }
            if (r11 > r0) goto L_0x0029;
        L_0x0027:
            monitor-exit(r12);	 Catch:{ all -> 0x007a }
            return;
        L_0x0029:
            r0 = r11 % 2;
            r1 = r9.f54968c;	 Catch:{ all -> 0x007a }
            r1 = r1.f49408f;	 Catch:{ all -> 0x007a }
            r2 = 2;
            r1 = r1 % r2;
            if (r0 != r1) goto L_0x0035;
        L_0x0033:
            monitor-exit(r12);	 Catch:{ all -> 0x007a }
            return;
        L_0x0035:
            r0 = new okhttp3.internal.http2.g;	 Catch:{ all -> 0x007a }
            r5 = r9.f54968c;	 Catch:{ all -> 0x007a }
            r6 = 0;
            r3 = r0;
            r4 = r11;
            r7 = r10;
            r8 = r13;
            r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ all -> 0x007a }
            r10 = r9.f54968c;	 Catch:{ all -> 0x007a }
            r10.f49407e = r11;	 Catch:{ all -> 0x007a }
            r10 = r9.f54968c;	 Catch:{ all -> 0x007a }
            r10 = r10.f49405c;	 Catch:{ all -> 0x007a }
            r13 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x007a }
            r10.put(r13, r0);	 Catch:{ all -> 0x007a }
            r10 = okhttp3.internal.http2.C15936e.f49402s;	 Catch:{ all -> 0x007a }
            r13 = new okhttp3.internal.http2.e$d$1;	 Catch:{ all -> 0x007a }
            r1 = "OkHttp %s stream %d";
            r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x007a }
            r3 = 0;
            r4 = r9.f54968c;	 Catch:{ all -> 0x007a }
            r4 = r4.f49406d;	 Catch:{ all -> 0x007a }
            r2[r3] = r4;	 Catch:{ all -> 0x007a }
            r3 = 1;
            r11 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x007a }
            r2[r3] = r11;	 Catch:{ all -> 0x007a }
            r13.<init>(r9, r1, r2, r0);	 Catch:{ all -> 0x007a }
            r10.execute(r13);	 Catch:{ all -> 0x007a }
            monitor-exit(r12);	 Catch:{ all -> 0x007a }
            return;
        L_0x0070:
            monitor-exit(r12);	 Catch:{ all -> 0x007a }
            r0.m60376a(r13);
            if (r10 == 0) goto L_0x0079;
        L_0x0076:
            r0.m60388i();
        L_0x0079:
            return;
        L_0x007a:
            r10 = move-exception;
            monitor-exit(r12);	 Catch:{ all -> 0x007a }
            throw r10;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.d.a(boolean, int, int, java.util.List):void");
        }

        /* renamed from: a */
        public void mo13372a(int i, ErrorCode errorCode) {
            if (this.f54968c.m60346c(i)) {
                this.f54968c.m60345c(i, errorCode);
                return;
            }
            i = this.f54968c.m60341b(i);
            if (i != 0) {
                i.m60381c(errorCode);
            }
        }

        /* renamed from: a */
        public void mo13377a(boolean z, C15943j c15943j) {
            synchronized (this.f54968c) {
                long j;
                boolean d = this.f54968c.f49414l.m60423d();
                if (z) {
                    this.f54968c.f49414l.m60416a();
                }
                this.f54968c.f49414l.m60417a(c15943j);
                m64343a(c15943j);
                z = this.f54968c.f49414l.m60423d();
                C15939g[] c15939gArr = null;
                if (z || z == d) {
                    j = false;
                } else {
                    j = (long) (z - d);
                    if (!this.f54968c.f49415m) {
                        this.f54968c.m60336a(j);
                        this.f54968c.f49415m = C15936e.f49401r;
                    }
                    if (!this.f54968c.f49405c.isEmpty()) {
                        c15939gArr = (C15939g[]) this.f54968c.f49405c.values().toArray(new C15939g[this.f54968c.f49405c.size()]);
                    }
                }
                ExecutorService e = C15936e.f49402s;
                Object[] objArr = new Object[1];
                int i = 0;
                objArr[0] = this.f54968c.f49406d;
                e.execute(new C15905b(this, "OkHttp %s settings", objArr) {
                    /* renamed from: a */
                    final /* synthetic */ C17678d f54964a;

                    /* renamed from: c */
                    public void mo13367c() {
                        this.f54964a.f54968c.f49404b.mo13347a(this.f54964a.f54968c);
                    }
                });
            }
            if (c15939gArr != null && j != false) {
                int length = c15939gArr.length;
                while (i < length) {
                    C15939g c15939g = c15939gArr[i];
                    synchronized (c15939g) {
                        c15939g.m60375a(j);
                    }
                    i++;
                }
            }
        }

        /* renamed from: a */
        private void m64343a(final okhttp3.internal.http2.C15943j r7) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r6 = this;
            r0 = r6.f54968c;	 Catch:{ RejectedExecutionException -> 0x001a }
            r0 = r0.f49420t;	 Catch:{ RejectedExecutionException -> 0x001a }
            r1 = new okhttp3.internal.http2.e$d$3;	 Catch:{ RejectedExecutionException -> 0x001a }
            r2 = "OkHttp %s ACK Settings";	 Catch:{ RejectedExecutionException -> 0x001a }
            r3 = 1;	 Catch:{ RejectedExecutionException -> 0x001a }
            r3 = new java.lang.Object[r3];	 Catch:{ RejectedExecutionException -> 0x001a }
            r4 = 0;	 Catch:{ RejectedExecutionException -> 0x001a }
            r5 = r6.f54968c;	 Catch:{ RejectedExecutionException -> 0x001a }
            r5 = r5.f49406d;	 Catch:{ RejectedExecutionException -> 0x001a }
            r3[r4] = r5;	 Catch:{ RejectedExecutionException -> 0x001a }
            r1.<init>(r6, r2, r3, r7);	 Catch:{ RejectedExecutionException -> 0x001a }
            r0.execute(r1);	 Catch:{ RejectedExecutionException -> 0x001a }
        L_0x001a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.d.a(okhttp3.internal.http2.j):void");
        }

        /* renamed from: a */
        public void mo13374a(boolean r4, int r5, int r6) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r3 = this;
            if (r4 == 0) goto L_0x0015;
        L_0x0002:
            r4 = r3.f54968c;
            monitor-enter(r4);
            r5 = r3.f54968c;	 Catch:{ all -> 0x0012 }
            r6 = 0;	 Catch:{ all -> 0x0012 }
            r5.f49422v = r6;	 Catch:{ all -> 0x0012 }
            r5 = r3.f54968c;	 Catch:{ all -> 0x0012 }
            r5.notifyAll();	 Catch:{ all -> 0x0012 }
            monitor-exit(r4);	 Catch:{ all -> 0x0012 }
            goto L_0x0026;	 Catch:{ all -> 0x0012 }
        L_0x0012:
            r5 = move-exception;	 Catch:{ all -> 0x0012 }
            monitor-exit(r4);	 Catch:{ all -> 0x0012 }
            throw r5;
        L_0x0015:
            r4 = r3.f54968c;	 Catch:{ RejectedExecutionException -> 0x0026 }
            r4 = r4.f49420t;	 Catch:{ RejectedExecutionException -> 0x0026 }
            r0 = new okhttp3.internal.http2.e$c;	 Catch:{ RejectedExecutionException -> 0x0026 }
            r1 = r3.f54968c;	 Catch:{ RejectedExecutionException -> 0x0026 }
            r2 = 1;	 Catch:{ RejectedExecutionException -> 0x0026 }
            r0.<init>(r1, r2, r5, r6);	 Catch:{ RejectedExecutionException -> 0x0026 }
            r4.execute(r0);	 Catch:{ RejectedExecutionException -> 0x0026 }
        L_0x0026:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.d.a(boolean, int, int):void");
        }

        /* renamed from: a */
        public void mo13373a(int i, ErrorCode errorCode, ByteString byteString) {
            byteString.mo13431h();
            synchronized (this.f54968c) {
                C15939g[] c15939gArr = (C15939g[]) this.f54968c.f49405c.values().toArray(new C15939g[this.f54968c.f49405c.size()]);
                this.f54968c.f49409g = C15936e.f49401r;
            }
            for (C15939g c15939g : c15939gArr) {
                if (c15939g.m60374a() > i && c15939g.m60382c()) {
                    c15939g.m60381c(ErrorCode.REFUSED_STREAM);
                    this.f54968c.m60341b(c15939g.m60374a());
                }
            }
        }

        /* renamed from: a */
        public void mo13371a(int i, long j) {
            if (i == 0) {
                synchronized (this.f54968c) {
                    i = this.f54968c;
                    i.f49412j += j;
                    this.f54968c.notifyAll();
                }
                return;
            }
            i = this.f54968c.m60328a(i);
            if (i != 0) {
                synchronized (i) {
                    i.m60375a(j);
                }
            }
        }

        /* renamed from: a */
        public void mo13370a(int i, int i2, List<C15929a> list) {
            this.f54968c.m60331a(i2, (List) list);
        }
    }

    /* renamed from: c */
    boolean m60346c(int i) {
        return (i == 0 || (i & 1) != 0) ? false : f49401r;
    }

    C15936e(C15934a c15934a) {
        C15934a c15934a2 = c15934a;
        this.f49410h = c15934a2.f49397f;
        this.f49403a = c15934a2.f49398g;
        this.f49404b = c15934a2.f49396e;
        r0.f49408f = c15934a2.f49398g ? 1 : 2;
        if (c15934a2.f49398g) {
            r0.f49408f += 2;
        }
        if (c15934a2.f49398g) {
            r0.f49413k.m60415a(7, 16777216);
        }
        r0.f49406d = c15934a2.f49393b;
        r0.f49420t = new ScheduledThreadPoolExecutor(1, C15908c.m60163a(C15908c.m60157a("OkHttp %s Writer", r0.f49406d), false));
        if (c15934a2.f49399h != 0) {
            r0.f49420t.scheduleAtFixedRate(new C17674c(r0, false, 0, 0), (long) c15934a2.f49399h, (long) c15934a2.f49399h, TimeUnit.MILLISECONDS);
        }
        r0.f49421u = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C15908c.m60163a(C15908c.m60157a("OkHttp %s Push Observer", r0.f49406d), (boolean) f49401r));
        r0.f49414l.m60415a(7, 65535);
        r0.f49414l.m60415a(5, 16384);
        r0.f49412j = (long) r0.f49414l.m60423d();
        r0.f49416n = c15934a2.f49392a;
        r0.f49417o = new C15940h(c15934a2.f49395d, r0.f49403a);
        r0.f49418p = new C17678d(r0, new C15938f(c15934a2.f49394c, r0.f49403a));
    }

    /* renamed from: a */
    synchronized C15939g m60328a(int i) {
        return (C15939g) this.f49405c.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    synchronized C15939g m60341b(int i) {
        C15939g c15939g;
        c15939g = (C15939g) this.f49405c.remove(Integer.valueOf(i));
        notifyAll();
        return c15939g;
    }

    /* renamed from: a */
    public synchronized int m60327a() {
        return this.f49414l.m60422c(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    /* renamed from: a */
    public C15939g m60329a(List<C15929a> list, boolean z) throws IOException {
        return m60324b(0, list, z);
    }

    /* renamed from: b */
    private C15939g m60324b(int i, List<C15929a> list, boolean z) throws IOException {
        C15939g c15939g;
        boolean z2 = z ^ 1;
        synchronized (this.f49417o) {
            synchronized (this) {
                if (this.f49408f > 1073741823) {
                    m60337a(ErrorCode.REFUSED_STREAM);
                }
                if (this.f49409g) {
                    throw new ConnectionShutdownException();
                }
                int i2 = this.f49408f;
                this.f49408f += 2;
                c15939g = new C15939g(i2, this, z2, false, list);
                if (z && this.f49412j != 0) {
                    if (c15939g.f49430b != 0) {
                        z = false;
                        if (c15939g.m60380b()) {
                            this.f49405c.put(Integer.valueOf(i2), c15939g);
                        }
                    }
                }
                z = f49401r;
                if (c15939g.m60380b()) {
                    this.f49405c.put(Integer.valueOf(i2), c15939g);
                }
            }
            if (i == 0) {
                this.f49417o.m60403a(z2, i2, i, (List) list);
            } else if (this.f49403a) {
                throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
            } else {
                this.f49417o.m60397a(i, i2, (List) list);
            }
        }
        if (z) {
            this.f49417o.m60406b();
        }
        return c15939g;
    }

    /* renamed from: a */
    public void m60335a(int r11, boolean r12, okio.C18549c r13, long r14) throws java.io.IOException {
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
        r14 = r10.f49417o;
        r14.m60405a(r12, r11, r13, r3);
        return;
    L_0x000d:
        r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x0066;
    L_0x0011:
        monitor-enter(r10);
    L_0x0012:
        r4 = r10.f49412j;	 Catch:{ InterruptedException -> 0x005e }
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));	 Catch:{ InterruptedException -> 0x005e }
        if (r2 > 0) goto L_0x0030;	 Catch:{ InterruptedException -> 0x005e }
    L_0x0018:
        r2 = r10.f49405c;	 Catch:{ InterruptedException -> 0x005e }
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
        r4 = r10.f49412j;	 Catch:{ all -> 0x005c }
        r4 = java.lang.Math.min(r14, r4);	 Catch:{ all -> 0x005c }
        r2 = (int) r4;	 Catch:{ all -> 0x005c }
        r4 = r10.f49417o;	 Catch:{ all -> 0x005c }
        r4 = r4.m60408c();	 Catch:{ all -> 0x005c }
        r2 = java.lang.Math.min(r2, r4);	 Catch:{ all -> 0x005c }
        r4 = r10.f49412j;	 Catch:{ all -> 0x005c }
        r6 = (long) r2;	 Catch:{ all -> 0x005c }
        r8 = r4 - r6;	 Catch:{ all -> 0x005c }
        r10.f49412j = r8;	 Catch:{ all -> 0x005c }
        monitor-exit(r10);	 Catch:{ all -> 0x005c }
        r4 = 0;
        r4 = r14 - r6;
        r14 = r10.f49417o;
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
        r14.m60405a(r15, r11, r13, r2);
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
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.a(int, boolean, okio.c, long):void");
    }

    /* renamed from: a */
    void m60336a(long j) {
        this.f49412j += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: a */
    void m60333a(int r9, okhttp3.internal.http2.ErrorCode r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r0 = r8.f49420t;	 Catch:{ RejectedExecutionException -> 0x001f }
        r7 = new okhttp3.internal.http2.e$1;	 Catch:{ RejectedExecutionException -> 0x001f }
        r3 = "OkHttp %s stream %d";	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4 = new java.lang.Object[r1];	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 0;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r8.f49406d;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 1;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = java.lang.Integer.valueOf(r9);	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = r7;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r8;	 Catch:{ RejectedExecutionException -> 0x001f }
        r5 = r9;	 Catch:{ RejectedExecutionException -> 0x001f }
        r6 = r10;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1.<init>(r2, r3, r4, r5, r6);	 Catch:{ RejectedExecutionException -> 0x001f }
        r0.execute(r7);	 Catch:{ RejectedExecutionException -> 0x001f }
    L_0x001f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.a(int, okhttp3.internal.http2.ErrorCode):void");
    }

    /* renamed from: b */
    void m60343b(int i, ErrorCode errorCode) throws IOException {
        this.f49417o.m60399a(i, errorCode);
    }

    /* renamed from: a */
    void m60330a(int r10, long r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r9 = this;
        r0 = r9.f49420t;	 Catch:{ RejectedExecutionException -> 0x001f }
        r8 = new okhttp3.internal.http2.e$2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r3 = "OkHttp Window Update %s stream %d";	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4 = new java.lang.Object[r1];	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 0;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r9.f49406d;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 1;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = java.lang.Integer.valueOf(r10);	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = r8;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r9;	 Catch:{ RejectedExecutionException -> 0x001f }
        r5 = r10;	 Catch:{ RejectedExecutionException -> 0x001f }
        r6 = r11;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1.<init>(r2, r3, r4, r5, r6);	 Catch:{ RejectedExecutionException -> 0x001f }
        r0.execute(r8);	 Catch:{ RejectedExecutionException -> 0x001f }
    L_0x001f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.a(int, long):void");
    }

    /* renamed from: a */
    void m60340a(boolean r3, int r4, int r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        if (r3 != 0) goto L_0x0012;
    L_0x0002:
        monitor-enter(r2);
        r0 = r2.f49422v;	 Catch:{ all -> 0x000f }
        r1 = 1;	 Catch:{ all -> 0x000f }
        r2.f49422v = r1;	 Catch:{ all -> 0x000f }
        monitor-exit(r2);	 Catch:{ all -> 0x000f }
        if (r0 == 0) goto L_0x0012;
    L_0x000b:
        r2.m60326f();
        return;
    L_0x000f:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x000f }
        throw r3;
    L_0x0012:
        r0 = r2.f49417o;	 Catch:{ IOException -> 0x0018 }
        r0.m60402a(r3, r4, r5);	 Catch:{ IOException -> 0x0018 }
        goto L_0x001b;
    L_0x0018:
        r2.m60326f();
    L_0x001b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.a(boolean, int, int):void");
    }

    /* renamed from: b */
    public void m60342b() throws IOException {
        this.f49417o.m60406b();
    }

    /* renamed from: a */
    public void m60337a(ErrorCode errorCode) throws IOException {
        synchronized (this.f49417o) {
            synchronized (this) {
                if (this.f49409g) {
                    return;
                }
                this.f49409g = f49401r;
                int i = this.f49407e;
                this.f49417o.m60400a(i, errorCode, C15908c.f49245a);
            }
        }
    }

    public void close() throws IOException {
        m60338a(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    /* renamed from: a */
    void m60338a(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        if (f49401r || !Thread.holdsLock(this)) {
            C15939g[] c15939gArr = null;
            try {
                m60337a(errorCode);
                errorCode = null;
            } catch (IOException e) {
                errorCode = e;
            }
            synchronized (this) {
                if (!this.f49405c.isEmpty()) {
                    c15939gArr = (C15939g[]) this.f49405c.values().toArray(new C15939g[this.f49405c.size()]);
                    this.f49405c.clear();
                }
            }
            if (c15939gArr != null) {
                for (C15939g a : c15939gArr) {
                    try {
                        a.m60377a(errorCode2);
                    } catch (IOException e2) {
                        if (errorCode != null) {
                            errorCode = e2;
                        }
                    }
                }
            }
            try {
                this.f49417o.close();
            } catch (ErrorCode errorCode22) {
                if (errorCode == null) {
                    errorCode = errorCode22;
                }
            }
            try {
                this.f49416n.close();
            } catch (IOException e3) {
                errorCode = e3;
            }
            this.f49420t.shutdown();
            this.f49421u.shutdown();
            if (errorCode != null) {
                throw errorCode;
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: f */
    private void m60326f() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;	 Catch:{ IOException -> 0x0007 }
        r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;	 Catch:{ IOException -> 0x0007 }
        r2.m60338a(r0, r1);	 Catch:{ IOException -> 0x0007 }
    L_0x0007:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.f():void");
    }

    /* renamed from: c */
    public void m60344c() throws IOException {
        m60339a((boolean) f49401r);
    }

    /* renamed from: a */
    void m60339a(boolean z) throws IOException {
        if (z) {
            this.f49417o.m60394a();
            this.f49417o.m60407b(this.f49413k);
            z = this.f49413k.m60423d();
            if (!z) {
                this.f49417o.m60398a(0, (long) (z - true));
            }
        }
        new Thread(this.f49418p).start();
    }

    /* renamed from: d */
    public synchronized boolean m60347d() {
        return this.f49409g;
    }

    /* renamed from: a */
    void m60331a(int r9, java.util.List<okhttp3.internal.http2.C15929a> r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.f49419q;	 Catch:{ all -> 0x003e }
        r1 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x003e }
        r0 = r0.contains(r1);	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x0014;	 Catch:{ all -> 0x003e }
    L_0x000d:
        r10 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;	 Catch:{ all -> 0x003e }
        r8.m60333a(r9, r10);	 Catch:{ all -> 0x003e }
        monitor-exit(r8);	 Catch:{ all -> 0x003e }
        return;	 Catch:{ all -> 0x003e }
    L_0x0014:
        r0 = r8.f49419q;	 Catch:{ all -> 0x003e }
        r1 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x003e }
        r0.add(r1);	 Catch:{ all -> 0x003e }
        monitor-exit(r8);	 Catch:{ all -> 0x003e }
        r0 = r8.f49421u;	 Catch:{ RejectedExecutionException -> 0x003d }
        r7 = new okhttp3.internal.http2.e$3;	 Catch:{ RejectedExecutionException -> 0x003d }
        r3 = "OkHttp %s Push Request[%s]";	 Catch:{ RejectedExecutionException -> 0x003d }
        r1 = 2;	 Catch:{ RejectedExecutionException -> 0x003d }
        r4 = new java.lang.Object[r1];	 Catch:{ RejectedExecutionException -> 0x003d }
        r1 = 0;	 Catch:{ RejectedExecutionException -> 0x003d }
        r2 = r8.f49406d;	 Catch:{ RejectedExecutionException -> 0x003d }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x003d }
        r1 = 1;	 Catch:{ RejectedExecutionException -> 0x003d }
        r2 = java.lang.Integer.valueOf(r9);	 Catch:{ RejectedExecutionException -> 0x003d }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x003d }
        r1 = r7;	 Catch:{ RejectedExecutionException -> 0x003d }
        r2 = r8;	 Catch:{ RejectedExecutionException -> 0x003d }
        r5 = r9;	 Catch:{ RejectedExecutionException -> 0x003d }
        r6 = r10;	 Catch:{ RejectedExecutionException -> 0x003d }
        r1.<init>(r2, r3, r4, r5, r6);	 Catch:{ RejectedExecutionException -> 0x003d }
        r0.execute(r7);	 Catch:{ RejectedExecutionException -> 0x003d }
    L_0x003d:
        return;
    L_0x003e:
        r9 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x003e }
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.a(int, java.util.List):void");
    }

    /* renamed from: a */
    void m60332a(int r10, java.util.List<okhttp3.internal.http2.C15929a> r11, boolean r12) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r9 = this;
        r0 = r9.f49421u;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r8 = new okhttp3.internal.http2.e$4;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r3 = "OkHttp %s Push Headers[%s]";	 Catch:{ RejectedExecutionException -> 0x0020 }
        r1 = 2;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r4 = new java.lang.Object[r1];	 Catch:{ RejectedExecutionException -> 0x0020 }
        r1 = 0;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r2 = r9.f49406d;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r1 = 1;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r2 = java.lang.Integer.valueOf(r10);	 Catch:{ RejectedExecutionException -> 0x0020 }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r1 = r8;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r2 = r9;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r5 = r10;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r6 = r11;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r7 = r12;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ RejectedExecutionException -> 0x0020 }
        r0.execute(r8);	 Catch:{ RejectedExecutionException -> 0x0020 }
    L_0x0020:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.a(int, java.util.List, boolean):void");
    }

    /* renamed from: a */
    void m60334a(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
        final C18549c c18549c = new C18549c();
        long j = (long) i2;
        bufferedSource.require(j);
        bufferedSource.read(c18549c, j);
        if (c18549c.m66945a() != j) {
            bufferedSource = new StringBuilder();
            bufferedSource.append(c18549c.m66945a());
            bufferedSource.append(" != ");
            bufferedSource.append(i2);
            throw new IOException(bufferedSource.toString());
        }
        final int i3 = i;
        final int i4 = i2;
        final boolean z2 = z;
        this.f49421u.execute(new C15905b(this, "OkHttp %s Push Data[%s]", new Object[]{this.f49406d, Integer.valueOf(i)}) {
            /* renamed from: f */
            final /* synthetic */ C15936e f54954f;

            /* renamed from: c */
            public void mo13367c() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r5 = this;
                r0 = r5.f54954f;	 Catch:{ IOException -> 0x0038 }
                r0 = r0.f49410h;	 Catch:{ IOException -> 0x0038 }
                r1 = r4;	 Catch:{ IOException -> 0x0038 }
                r2 = r5;	 Catch:{ IOException -> 0x0038 }
                r3 = r6;	 Catch:{ IOException -> 0x0038 }
                r4 = r7;	 Catch:{ IOException -> 0x0038 }
                r0 = r0.onData(r1, r2, r3, r4);	 Catch:{ IOException -> 0x0038 }
                if (r0 == 0) goto L_0x001d;	 Catch:{ IOException -> 0x0038 }
            L_0x0012:
                r1 = r5.f54954f;	 Catch:{ IOException -> 0x0038 }
                r1 = r1.f49417o;	 Catch:{ IOException -> 0x0038 }
                r2 = r4;	 Catch:{ IOException -> 0x0038 }
                r3 = okhttp3.internal.http2.ErrorCode.CANCEL;	 Catch:{ IOException -> 0x0038 }
                r1.m60399a(r2, r3);	 Catch:{ IOException -> 0x0038 }
            L_0x001d:
                if (r0 != 0) goto L_0x0023;	 Catch:{ IOException -> 0x0038 }
            L_0x001f:
                r0 = r7;	 Catch:{ IOException -> 0x0038 }
                if (r0 == 0) goto L_0x0038;	 Catch:{ IOException -> 0x0038 }
            L_0x0023:
                r0 = r5.f54954f;	 Catch:{ IOException -> 0x0038 }
                monitor-enter(r0);	 Catch:{ IOException -> 0x0038 }
                r1 = r5.f54954f;	 Catch:{ all -> 0x0035 }
                r1 = r1.f49419q;	 Catch:{ all -> 0x0035 }
                r2 = r4;	 Catch:{ all -> 0x0035 }
                r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0035 }
                r1.remove(r2);	 Catch:{ all -> 0x0035 }
                monitor-exit(r0);	 Catch:{ all -> 0x0035 }
                goto L_0x0038;	 Catch:{ all -> 0x0035 }
            L_0x0035:
                r1 = move-exception;	 Catch:{ all -> 0x0035 }
                monitor-exit(r0);	 Catch:{ all -> 0x0035 }
                throw r1;	 Catch:{ IOException -> 0x0038 }
            L_0x0038:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.5.c():void");
            }
        });
    }

    /* renamed from: c */
    void m60345c(int i, ErrorCode errorCode) {
        final int i2 = i;
        final ErrorCode errorCode2 = errorCode;
        this.f49421u.execute(new C15905b(this, "OkHttp %s Push Reset[%s]", new Object[]{this.f49406d, Integer.valueOf(i)}) {
            /* renamed from: d */
            final /* synthetic */ C15936e f54957d;

            /* renamed from: c */
            public void mo13367c() {
                this.f54957d.f49410h.onReset(i2, errorCode2);
                synchronized (this.f54957d) {
                    this.f54957d.f49419q.remove(Integer.valueOf(i2));
                }
            }
        });
    }
}
