package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C2165q.C2163a;
import com.google.android.exoplayer2.C2165q.C2164b;
import com.google.android.exoplayer2.DefaultMediaClock.PlaybackParameterListener;
import com.google.android.exoplayer2.PlayerMessage.Sender;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.source.MediaSource.SourceInfoRefreshListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C2256f;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.exoplayer2.g */
final class C4242g implements Callback, PlaybackParameterListener, Sender, MediaPeriod.Callback, SourceInfoRefreshListener, InvalidationListener {
    /* renamed from: A */
    private boolean f13607A;
    /* renamed from: B */
    private int f13608B;
    /* renamed from: C */
    private C2120d f13609C;
    /* renamed from: D */
    private long f13610D;
    /* renamed from: E */
    private int f13611E;
    /* renamed from: a */
    private final Renderer[] f13612a;
    /* renamed from: b */
    private final RendererCapabilities[] f13613b;
    /* renamed from: c */
    private final TrackSelector f13614c;
    /* renamed from: d */
    private final C2256f f13615d;
    /* renamed from: e */
    private final LoadControl f13616e;
    /* renamed from: f */
    private final HandlerWrapper f13617f;
    /* renamed from: g */
    private final HandlerThread f13618g;
    /* renamed from: h */
    private final Handler f13619h;
    /* renamed from: i */
    private final ExoPlayer f13620i;
    /* renamed from: j */
    private final C2164b f13621j;
    /* renamed from: k */
    private final C2163a f13622k;
    /* renamed from: l */
    private final long f13623l;
    /* renamed from: m */
    private final boolean f13624m;
    /* renamed from: n */
    private final DefaultMediaClock f13625n;
    /* renamed from: o */
    private final C2119c f13626o;
    /* renamed from: p */
    private final ArrayList<C2118b> f13627p;
    /* renamed from: q */
    private final Clock f13628q;
    /* renamed from: r */
    private final C2125l f13629r = new C2125l();
    /* renamed from: s */
    private C2162p f13630s;
    /* renamed from: t */
    private C2126m f13631t;
    /* renamed from: u */
    private MediaSource f13632u;
    /* renamed from: v */
    private Renderer[] f13633v;
    /* renamed from: w */
    private boolean f13634w;
    /* renamed from: x */
    private boolean f13635x;
    /* renamed from: y */
    private boolean f13636y;
    /* renamed from: z */
    private int f13637z;

    /* renamed from: com.google.android.exoplayer2.g$a */
    private static final class C2117a {
        /* renamed from: a */
        public final MediaSource f6046a;
        /* renamed from: b */
        public final C2165q f6047b;
        /* renamed from: c */
        public final Object f6048c;

        public C2117a(MediaSource mediaSource, C2165q c2165q, Object obj) {
            this.f6046a = mediaSource;
            this.f6047b = c2165q;
            this.f6048c = obj;
        }
    }

    /* renamed from: com.google.android.exoplayer2.g$b */
    private static final class C2118b implements Comparable<C2118b> {
        /* renamed from: a */
        public final PlayerMessage f6049a;
        /* renamed from: b */
        public int f6050b;
        /* renamed from: c */
        public long f6051c;
        @Nullable
        /* renamed from: d */
        public Object f6052d;

        public /* synthetic */ int compareTo(@NonNull Object obj) {
            return m7570a((C2118b) obj);
        }

        public C2118b(PlayerMessage playerMessage) {
            this.f6049a = playerMessage;
        }

        /* renamed from: a */
        public void m7571a(int i, long j, Object obj) {
            this.f6050b = i;
            this.f6051c = j;
            this.f6052d = obj;
        }

        /* renamed from: a */
        public int m7570a(@NonNull C2118b c2118b) {
            int i = 1;
            if ((this.f6052d == null ? 1 : null) != (c2118b.f6052d == null ? 1 : null)) {
                if (this.f6052d != null) {
                    i = -1;
                }
                return i;
            } else if (this.f6052d == null) {
                return 0;
            } else {
                int i2 = this.f6050b - c2118b.f6050b;
                if (i2 != 0) {
                    return i2;
                }
                return C2314v.m8457a(this.f6051c, c2118b.f6051c);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.g$c */
    private static final class C2119c {
        /* renamed from: a */
        private C2126m f6053a;
        /* renamed from: b */
        private int f6054b;
        /* renamed from: c */
        private boolean f6055c;
        /* renamed from: d */
        private int f6056d;

        private C2119c() {
        }

        /* renamed from: a */
        public boolean m7576a(C2126m c2126m) {
            if (c2126m == this.f6053a && this.f6054b <= null) {
                if (this.f6055c == null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void m7578b(C2126m c2126m) {
            this.f6053a = c2126m;
            this.f6054b = 0;
            this.f6055c = false;
        }

        /* renamed from: a */
        public void m7575a(int i) {
            this.f6054b += i;
        }

        /* renamed from: b */
        public void m7577b(int i) {
            boolean z = true;
            if (!this.f6055c || this.f6056d == 4) {
                this.f6055c = true;
                this.f6056d = i;
                return;
            }
            if (i != 4) {
                z = false;
            }
            C2289a.m8311a(z);
        }
    }

    /* renamed from: com.google.android.exoplayer2.g$d */
    private static final class C2120d {
        /* renamed from: a */
        public final C2165q f6057a;
        /* renamed from: b */
        public final int f6058b;
        /* renamed from: c */
        public final long f6059c;

        public C2120d(C2165q c2165q, int i, long j) {
            this.f6057a = c2165q;
            this.f6058b = i;
            this.f6059c = j;
        }
    }

    public /* synthetic */ void onContinueLoadingRequested(SequenceableLoader sequenceableLoader) {
        m16922a((MediaPeriod) sequenceableLoader);
    }

    public C4242g(Renderer[] rendererArr, TrackSelector trackSelector, C2256f c2256f, LoadControl loadControl, boolean z, int i, boolean z2, Handler handler, ExoPlayer exoPlayer, Clock clock) {
        Renderer[] rendererArr2 = rendererArr;
        TrackSelector trackSelector2 = trackSelector;
        Clock clock2 = clock;
        this.f13612a = rendererArr2;
        this.f13614c = trackSelector2;
        C2256f c2256f2 = c2256f;
        this.f13615d = c2256f2;
        LoadControl loadControl2 = loadControl;
        this.f13616e = loadControl2;
        this.f13635x = z;
        this.f13637z = i;
        this.f13607A = z2;
        this.f13619h = handler;
        this.f13620i = exoPlayer;
        this.f13628q = clock2;
        this.f13623l = loadControl2.getBackBufferDurationUs();
        this.f13624m = loadControl2.retainBackBufferFromKeyframe();
        this.f13630s = C2162p.f6200e;
        this.f13631t = new C2126m(C2165q.f6219a, -9223372036854775807L, TrackGroupArray.EMPTY, c2256f2);
        this.f13626o = new C2119c();
        this.f13613b = new RendererCapabilities[rendererArr2.length];
        for (int i2 = 0; i2 < rendererArr2.length; i2++) {
            rendererArr2[i2].setIndex(i2);
            r0.f13613b[i2] = rendererArr2[i2].getCapabilities();
        }
        r0.f13625n = new DefaultMediaClock(r0, clock2);
        r0.f13627p = new ArrayList();
        r0.f13633v = new Renderer[0];
        r0.f13621j = new C2164b();
        r0.f13622k = new C2163a();
        trackSelector2.m8113a(r0);
        r0.f13618g = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        r0.f13618g.start();
        r0.f13617f = clock2.createHandler(r0.f13618g.getLooper(), r0);
    }

    /* renamed from: a */
    public void m16923a(MediaSource mediaSource, boolean z, boolean z2) {
        this.f13617f.obtainMessage(0, z, z2, mediaSource).sendToTarget();
    }

    /* renamed from: a */
    public void m16924a(boolean z) {
        this.f13617f.obtainMessage(1, z, 0).sendToTarget();
    }

    /* renamed from: a */
    public void m16918a(int i) {
        this.f13617f.obtainMessage(12, i, 0).sendToTarget();
    }

    /* renamed from: b */
    public void m16926b(boolean z) {
        this.f13617f.obtainMessage(13, z, 0).sendToTarget();
    }

    /* renamed from: a */
    public void m16921a(C2165q c2165q, int i, long j) {
        this.f13617f.obtainMessage(3, new C2120d(c2165q, i, j)).sendToTarget();
    }

    /* renamed from: a */
    public void m16919a(C2153n c2153n) {
        this.f13617f.obtainMessage(4, c2153n).sendToTarget();
    }

    /* renamed from: a */
    public void m16920a(C2162p c2162p) {
        this.f13617f.obtainMessage(5, c2162p).sendToTarget();
    }

    /* renamed from: c */
    public void m16927c(boolean z) {
        this.f13617f.obtainMessage(6, z, 0).sendToTarget();
    }

    public synchronized void sendMessage(PlayerMessage playerMessage) {
        if (this.f13634w) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            playerMessage.m7225a(false);
            return;
        }
        this.f13617f.obtainMessage(14, playerMessage).sendToTarget();
    }

    /* renamed from: a */
    public synchronized void m16917a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f13634w;	 Catch:{ all -> 0x0023 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r2);
        return;
    L_0x0007:
        r0 = r2.f13617f;	 Catch:{ all -> 0x0023 }
        r1 = 7;	 Catch:{ all -> 0x0023 }
        r0.sendEmptyMessage(r1);	 Catch:{ all -> 0x0023 }
        r0 = 0;	 Catch:{ all -> 0x0023 }
    L_0x000e:
        r1 = r2.f13634w;	 Catch:{ all -> 0x0023 }
        if (r1 != 0) goto L_0x0018;
    L_0x0012:
        r2.wait();	 Catch:{ InterruptedException -> 0x0016 }
        goto L_0x000e;
    L_0x0016:
        r0 = 1;
        goto L_0x000e;
    L_0x0018:
        if (r0 == 0) goto L_0x0021;
    L_0x001a:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0023 }
        r0.interrupt();	 Catch:{ all -> 0x0023 }
    L_0x0021:
        monitor-exit(r2);
        return;
    L_0x0023:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.g.a():void");
    }

    /* renamed from: b */
    public Looper m16925b() {
        return this.f13618g.getLooper();
    }

    public void onSourceInfoRefreshed(MediaSource mediaSource, C2165q c2165q, Object obj) {
        this.f13617f.obtainMessage(8, new C2117a(mediaSource, c2165q, obj)).sendToTarget();
    }

    public void onPrepared(MediaPeriod mediaPeriod) {
        this.f13617f.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    /* renamed from: a */
    public void m16922a(MediaPeriod mediaPeriod) {
        this.f13617f.obtainMessage(10, mediaPeriod).sendToTarget();
    }

    public void onTrackSelectionsInvalidated() {
        this.f13617f.sendEmptyMessage(11);
    }

    public void onPlaybackParametersChanged(C2153n c2153n) {
        this.f13619h.obtainMessage(1, c2153n).sendToTarget();
        m16866a(c2153n.f6152b);
    }

    public boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    m16891b((MediaSource) message.obj, message.arg1 != 0, message.arg2 != null ? true : null);
                    break;
                case 1:
                    m16901e(message.arg1 != null ? true : null);
                    break;
                case 2:
                    m16904g();
                    break;
                case 3:
                    m16873a((C2120d) message.obj);
                    break;
                case 4:
                    m16888b((C2153n) message.obj);
                    break;
                case 5:
                    m16889b((C2162p) message.obj);
                    break;
                case 6:
                    m16877a(message.arg1 != null ? true : null, true);
                    break;
                case 7:
                    m16906h();
                    return true;
                case 8:
                    m16872a((C2117a) message.obj);
                    break;
                case 9:
                    m16890b((MediaPeriod) message.obj);
                    break;
                case 10:
                    m16895c((MediaPeriod) message.obj);
                    break;
                case 11:
                    m16910k();
                    break;
                case 12:
                    m16893c(message.arg1);
                    break;
                case 13:
                    m16903f(message.arg1 != null ? true : null);
                    break;
                case 14:
                    m16870a((PlayerMessage) message.obj);
                    break;
                case 15:
                    m16894c((PlayerMessage) message.obj);
                    break;
                default:
                    return false;
            }
            m16892c();
        } catch (Message message2) {
            Log.e("ExoPlayerImplInternal", "Playback error.", message2);
            m16877a(false, false);
            this.f13619h.obtainMessage(2, message2).sendToTarget();
            m16892c();
        } catch (IOException e) {
            Log.e("ExoPlayerImplInternal", "Source error.", e);
            m16877a(false, false);
            this.f13619h.obtainMessage(2, ExoPlaybackException.m7217a(e)).sendToTarget();
            m16892c();
        } catch (RuntimeException e2) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e2);
            m16877a(false, false);
            this.f13619h.obtainMessage(2, ExoPlaybackException.m7219a(e2)).sendToTarget();
            m16892c();
        }
        return true;
    }

    /* renamed from: b */
    private void m16884b(int i) {
        if (this.f13631t.f6102f != i) {
            this.f13631t = this.f13631t.m7639b(i);
        }
    }

    /* renamed from: d */
    private void m16899d(boolean z) {
        if (this.f13631t.f6103g != z) {
            this.f13631t = this.f13631t.m7638a(z);
        }
    }

    /* renamed from: c */
    private void m16892c() {
        if (this.f13626o.m7576a(this.f13631t)) {
            this.f13619h.obtainMessage(0, this.f13626o.f6054b, this.f13626o.f6055c ? this.f13626o.f6056d : -1, this.f13631t).sendToTarget();
            this.f13626o.m7578b(this.f13631t);
        }
    }

    /* renamed from: b */
    private void m16891b(MediaSource mediaSource, boolean z, boolean z2) {
        this.f13608B++;
        m16878a(true, z, z2);
        this.f13616e.onPrepared();
        this.f13632u = mediaSource;
        m16884b(2);
        mediaSource.prepareSource(this.f13620i, true, this);
        this.f13617f.sendEmptyMessage(2);
    }

    /* renamed from: e */
    private void m16901e(boolean z) throws ExoPlaybackException {
        this.f13636y = false;
        this.f13635x = z;
        if (!z) {
            m16900e();
            m16902f();
        } else if (this.f13631t.f6102f) {
            m16897d();
            this.f13617f.sendEmptyMessage(2);
        } else if (this.f13631t.f6102f) {
            this.f13617f.sendEmptyMessage(2);
        }
    }

    /* renamed from: c */
    private void m16893c(int i) throws ExoPlaybackException {
        this.f13637z = i;
        if (this.f13629r.m7620a(i) == 0) {
            m16905g(1);
        }
    }

    /* renamed from: f */
    private void m16903f(boolean z) throws ExoPlaybackException {
        this.f13607A = z;
        if (!this.f13629r.m7624a(z)) {
            m16905g(true);
        }
    }

    /* renamed from: g */
    private void m16905g(boolean z) throws ExoPlaybackException {
        C2166a c2166a = this.f13629r.m7627c().f6070h.f6078a;
        long a = m16864a(c2166a, this.f13631t.f6106j, true);
        if (a != this.f13631t.f6106j) {
            this.f13631t = this.f13631t.m7636a(c2166a, a, this.f13631t.f6101e);
            if (z) {
                this.f13626o.m7577b(4);
            }
        }
    }

    /* renamed from: d */
    private void m16897d() throws ExoPlaybackException {
        int i = 0;
        this.f13636y = false;
        this.f13625n.m13441a();
        Renderer[] rendererArr = this.f13633v;
        int length = rendererArr.length;
        while (i < length) {
            rendererArr[i].start();
            i++;
        }
    }

    /* renamed from: e */
    private void m16900e() throws ExoPlaybackException {
        this.f13625n.m13444b();
        for (Renderer a : this.f13633v) {
            m16871a(a);
        }
    }

    /* renamed from: f */
    private void m16902f() throws ExoPlaybackException {
        if (this.f13629r.m7630f()) {
            long j;
            C2123j c = this.f13629r.m7627c();
            long readDiscontinuity = c.f6063a.readDiscontinuity();
            if (readDiscontinuity != -9223372036854775807L) {
                m16868a(readDiscontinuity);
                if (readDiscontinuity != this.f13631t.f6106j) {
                    this.f13631t = this.f13631t.m7636a(this.f13631t.f6099c, readDiscontinuity, this.f13631t.f6101e);
                    this.f13626o.m7577b(4);
                }
            } else {
                this.f13610D = this.f13625n.m13446c();
                long b = c.m7592b(this.f13610D);
                m16885b(this.f13631t.f6106j, b);
                this.f13631t.f6106j = b;
            }
            C2126m c2126m = this.f13631t;
            if (this.f13633v.length == 0) {
                j = c.f6070h.f6082e;
            } else {
                j = c.m7590a(true);
            }
            c2126m.f6107k = j;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: g */
    private void m16904g() throws com.google.android.exoplayer2.ExoPlaybackException, java.io.IOException {
        /*
        r16 = this;
        r0 = r16;
        r1 = r0.f13628q;
        r1 = r1.uptimeMillis();
        r16.m16914o();
        r3 = r0.f13629r;
        r3 = r3.m7630f();
        r4 = 10;
        if (r3 != 0) goto L_0x001c;
    L_0x0015:
        r16.m16912m();
        r0.m16869a(r1, r4);
        return;
    L_0x001c:
        r3 = r0.f13629r;
        r3 = r3.m7627c();
        r6 = "doSomeWork";
        com.google.android.exoplayer2.util.C2311t.m8447a(r6);
        r16.m16902f();
        r6 = android.os.SystemClock.elapsedRealtime();
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 * r8;
        r10 = r3.f6063a;
        r11 = r0.f13631t;
        r11 = r11.f6106j;
        r13 = r0.f13623l;
        r8 = r11 - r13;
        r11 = r0.f13624m;
        r10.discardBuffer(r8, r11);
        r8 = r0.f13633v;
        r9 = r8.length;
        r11 = 1;
        r12 = 0;
        r13 = 1;
        r14 = 1;
    L_0x0048:
        if (r12 >= r9) goto L_0x0083;
    L_0x004a:
        r10 = r8[r12];
        r4 = r0.f13610D;
        r10.render(r4, r6);
        if (r13 == 0) goto L_0x005b;
    L_0x0053:
        r4 = r10.isEnded();
        if (r4 == 0) goto L_0x005b;
    L_0x0059:
        r13 = 1;
        goto L_0x005c;
    L_0x005b:
        r13 = 0;
    L_0x005c:
        r4 = r10.isReady();
        if (r4 != 0) goto L_0x0071;
    L_0x0062:
        r4 = r10.isEnded();
        if (r4 != 0) goto L_0x0071;
    L_0x0068:
        r4 = r0.m16896c(r10);
        if (r4 == 0) goto L_0x006f;
    L_0x006e:
        goto L_0x0071;
    L_0x006f:
        r4 = 0;
        goto L_0x0072;
    L_0x0071:
        r4 = 1;
    L_0x0072:
        if (r4 != 0) goto L_0x0077;
    L_0x0074:
        r10.maybeThrowStreamError();
    L_0x0077:
        if (r14 == 0) goto L_0x007d;
    L_0x0079:
        if (r4 == 0) goto L_0x007d;
    L_0x007b:
        r14 = 1;
        goto L_0x007e;
    L_0x007d:
        r14 = 0;
    L_0x007e:
        r12 = r12 + 1;
        r4 = 10;
        goto L_0x0048;
    L_0x0083:
        if (r14 != 0) goto L_0x0088;
    L_0x0085:
        r16.m16912m();
    L_0x0088:
        r4 = r3.f6070h;
        r4 = r4.f6082e;
        r6 = 4;
        r7 = 3;
        r8 = 2;
        if (r13 == 0) goto L_0x00af;
    L_0x0091:
        r9 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1));
        if (r11 == 0) goto L_0x00a2;
    L_0x009a:
        r9 = r0.f13631t;
        r9 = r9.f6106j;
        r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1));
        if (r11 > 0) goto L_0x00af;
    L_0x00a2:
        r3 = r3.f6070h;
        r3 = r3.f6084g;
        if (r3 == 0) goto L_0x00af;
    L_0x00a8:
        r0.m16884b(r6);
        r16.m16900e();
        goto L_0x00e4;
    L_0x00af:
        r3 = r0.f13631t;
        r3 = r3.f6102f;
        if (r3 != r8) goto L_0x00c6;
    L_0x00b5:
        r3 = r0.m16907h(r14);
        if (r3 == 0) goto L_0x00c6;
    L_0x00bb:
        r0.m16884b(r7);
        r3 = r0.f13635x;
        if (r3 == 0) goto L_0x00e4;
    L_0x00c2:
        r16.m16897d();
        goto L_0x00e4;
    L_0x00c6:
        r3 = r0.f13631t;
        r3 = r3.f6102f;
        if (r3 != r7) goto L_0x00e4;
    L_0x00cc:
        r3 = r0.f13633v;
        r3 = r3.length;
        if (r3 != 0) goto L_0x00d8;
    L_0x00d1:
        r3 = r16.m16911l();
        if (r3 == 0) goto L_0x00da;
    L_0x00d7:
        goto L_0x00e4;
    L_0x00d8:
        if (r14 != 0) goto L_0x00e4;
    L_0x00da:
        r3 = r0.f13635x;
        r0.f13636y = r3;
        r0.m16884b(r8);
        r16.m16900e();
    L_0x00e4:
        r3 = r0.f13631t;
        r3 = r3.f6102f;
        if (r3 != r8) goto L_0x00f8;
    L_0x00ea:
        r3 = r0.f13633v;
        r4 = r3.length;
        r5 = 0;
    L_0x00ee:
        if (r5 >= r4) goto L_0x00f8;
    L_0x00f0:
        r9 = r3[r5];
        r9.maybeThrowStreamError();
        r5 = r5 + 1;
        goto L_0x00ee;
    L_0x00f8:
        r3 = r0.f13635x;
        if (r3 == 0) goto L_0x0106;
    L_0x00fc:
        r3 = r0.f13631t;
        r3 = r3.f6102f;
        if (r3 == r7) goto L_0x0103;
    L_0x0102:
        goto L_0x0106;
    L_0x0103:
        r3 = 10;
        goto L_0x010d;
    L_0x0106:
        r3 = r0.f13631t;
        r3 = r3.f6102f;
        if (r3 != r8) goto L_0x0111;
    L_0x010c:
        goto L_0x0103;
    L_0x010d:
        r0.m16869a(r1, r3);
        goto L_0x0127;
    L_0x0111:
        r3 = r0.f13633v;
        r3 = r3.length;
        if (r3 == 0) goto L_0x0122;
    L_0x0116:
        r3 = r0.f13631t;
        r3 = r3.f6102f;
        if (r3 == r6) goto L_0x0122;
    L_0x011c:
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.m16869a(r1, r3);
        goto L_0x0127;
    L_0x0122:
        r1 = r0.f13617f;
        r1.removeMessages(r8);
    L_0x0127:
        com.google.android.exoplayer2.util.C2311t.m8446a();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.g.g():void");
    }

    /* renamed from: a */
    private void m16869a(long j, long j2) {
        this.f13617f.removeMessages(2);
        this.f13617f.sendEmptyMessageAtTime(2, j + j2);
    }

    /* renamed from: a */
    private void m16873a(C2120d c2120d) throws ExoPlaybackException {
        C2166a c2166a;
        long j;
        long j2;
        int i;
        C2120d c2120d2 = c2120d;
        int i2 = 1;
        this.f13626o.m7575a(1);
        Pair a = m16865a(c2120d2, true);
        if (a == null) {
            c2166a = new C2166a(m16908i());
            j = -9223372036854775807L;
            j2 = j;
            i = 1;
        } else {
            int intValue = ((Integer) a.first).intValue();
            long longValue = ((Long) a.second).longValue();
            c2166a = r1.f13629r.m7616a(intValue, longValue);
            if (c2166a.m7821a()) {
                j2 = longValue;
                i = 1;
                j = 0;
            } else {
                j = ((Long) a.second).longValue();
                i = c2120d2.f6059c == -9223372036854775807L ? 1 : 0;
                j2 = longValue;
            }
        }
        try {
            long j3;
            if (r1.f13632u != null) {
                if (r1.f13608B <= 0) {
                    if (j == -9223372036854775807L) {
                        m16884b(4);
                        m16878a(false, true, false);
                        j3 = j;
                        r1.f13631t = r1.f13631t.m7636a(c2166a, j3, j2);
                        if (i != 0) {
                            r1.f13626o.m7577b(2);
                        }
                    }
                    long j4;
                    if (c2166a.equals(r1.f13631t.f6099c)) {
                        C2123j c = r1.f13629r.m7627c();
                        long adjustedSeekPositionUs = (c == null || j == 0) ? j : c.f6063a.getAdjustedSeekPositionUs(j, r1.f13630s);
                        long j5 = adjustedSeekPositionUs;
                        if (C2005C.m7215a(adjustedSeekPositionUs) == C2005C.m7215a(r1.f13631t.f6106j)) {
                            r1.f13631t = r1.f13631t.m7636a(c2166a, r1.f13631t.f6106j, j2);
                            if (i != 0) {
                                r1.f13626o.m7577b(2);
                            }
                            return;
                        }
                        j4 = j5;
                    } else {
                        j4 = j;
                    }
                    j4 = m16863a(c2166a, j4);
                    if (j == j4) {
                        i2 = 0;
                    }
                    i |= i2;
                    j3 = j4;
                    r1.f13631t = r1.f13631t.m7636a(c2166a, j3, j2);
                    if (i != 0) {
                        r1.f13626o.m7577b(2);
                    }
                }
            }
            r1.f13609C = c2120d2;
            j3 = j;
            r1.f13631t = r1.f13631t.m7636a(c2166a, j3, j2);
            if (i != 0) {
                r1.f13626o.m7577b(2);
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            r1.f13631t = r1.f13631t.m7636a(c2166a, j, j2);
            if (i != 0) {
                r1.f13626o.m7577b(2);
            }
        }
    }

    /* renamed from: a */
    private long m16863a(C2166a c2166a, long j) throws ExoPlaybackException {
        return m16864a(c2166a, j, this.f13629r.m7627c() != this.f13629r.m7628d());
    }

    /* renamed from: a */
    private long m16864a(C2166a c2166a, long j, boolean z) throws ExoPlaybackException {
        m16900e();
        this.f13636y = false;
        m16884b(2);
        C2123j c = this.f13629r.m7627c();
        C2123j c2123j = c;
        while (c2123j != null) {
            if (m16881a(c2166a, j, c2123j)) {
                this.f13629r.m7621a(c2123j);
                break;
            }
            c2123j = this.f13629r.m7632h();
        }
        if (c != c2123j || z) {
            for (Renderer b : this.f13633v) {
                m16887b(b);
            }
            this.f13633v = new Renderer[0];
            c = null;
        }
        if (c2123j != null) {
            m16875a(c);
            if (c2123j.f6069g != null) {
                j = c2123j.f6063a.seekToUs(j);
                c2123j.f6063a.discardBuffer(j - this.f13623l, this.f13624m);
            }
            m16868a(j);
            m16916q();
        } else {
            this.f13629r.m7626b(true);
            m16868a(j);
        }
        this.f13617f.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: a */
    private boolean m16881a(C2166a c2166a, long j, C2123j c2123j) {
        if (!(c2166a.equals(c2123j.f6070h.f6078a) == null || c2123j.f6068f == null)) {
            this.f13631t.f6097a.m7797a(c2123j.f6070h.f6078a.f6223a, this.f13622k);
            int b = this.f13622k.m7777b(j);
            if (b == -1 || this.f13622k.m7773a(b) == c2123j.f6070h.f6080c) {
                return true;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m16868a(long j) throws ExoPlaybackException {
        if (this.f13629r.m7630f()) {
            j = this.f13629r.m7627c().m7587a(j);
        }
        this.f13610D = j;
        this.f13625n.m13442a(this.f13610D);
        for (Renderer resetPosition : this.f13633v) {
            resetPosition.resetPosition(this.f13610D);
        }
    }

    /* renamed from: b */
    private void m16888b(C2153n c2153n) {
        this.f13625n.setPlaybackParameters(c2153n);
    }

    /* renamed from: b */
    private void m16889b(C2162p c2162p) {
        this.f13630s = c2162p;
    }

    /* renamed from: a */
    private void m16877a(boolean z, boolean z2) {
        m16878a(true, z, z);
        this.f13626o.m7575a(this.f13608B + z2);
        this.f13608B = false;
        this.f13616e.onStopped();
        m16884b(1);
    }

    /* renamed from: h */
    private void m16906h() {
        m16878a(true, true, true);
        this.f13616e.onReleased();
        m16884b(1);
        this.f13618g.quit();
        synchronized (this) {
            this.f13634w = true;
            notifyAll();
        }
    }

    /* renamed from: i */
    private int m16908i() {
        C2165q c2165q = this.f13631t.f6097a;
        if (c2165q.m7802a()) {
            return 0;
        }
        return c2165q.m7799a(c2165q.mo2337b(this.f13607A), this.f13621j).f6214f;
    }

    /* renamed from: a */
    private void m16878a(boolean z, boolean z2, boolean z3) {
        this.f13617f.removeMessages(2);
        this.f13636y = false;
        this.f13625n.m13444b();
        this.f13610D = 0;
        for (Renderer b : this.f13633v) {
            try {
                m16887b(b);
            } catch (Throwable e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        r1.f13633v = new Renderer[0];
        r1.f13629r.m7626b(z2 ^ 1);
        m16899d(false);
        if (z2) {
            r1.f13609C = null;
        }
        if (z3) {
            r1.f13629r.m7618a(C2165q.f6219a);
            Iterator it = r1.f13627p.iterator();
            while (it.hasNext()) {
                ((C2118b) it.next()).f6049a.m7225a(false);
            }
            r1.f13627p.clear();
            r1.f13611E = 0;
        }
        C2165q c2165q = z3 ? C2165q.f6219a : r1.f13631t.f6097a;
        Object obj = z3 ? null : r1.f13631t.f6098b;
        C2166a c2166a = z2 ? new C2166a(m16908i()) : r1.f13631t.f6099c;
        long j = -9223372036854775807L;
        long j2 = z2 ? -9223372036854775807L : r1.f13631t.f6106j;
        if (!z2) {
            j = r1.f13631t.f6101e;
        }
        r1.f13631t = new C2126m(c2165q, obj, c2166a, j2, j, r1.f13631t.f6102f, false, z3 ? TrackGroupArray.EMPTY : r1.f13631t.f6104h, z3 ? r1.f13615d : r1.f13631t.f6105i);
        if (z && r1.f13632u != null) {
            r1.f13632u.releaseSource(r1);
            r1.f13632u = null;
        }
    }

    /* renamed from: a */
    private void m16870a(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.m7230f() == -9223372036854775807L) {
            m16886b(playerMessage);
            return;
        }
        if (this.f13632u != null) {
            if (this.f13608B <= 0) {
                C2118b c2118b = new C2118b(playerMessage);
                if (m16880a(c2118b)) {
                    this.f13627p.add(c2118b);
                    Collections.sort(this.f13627p);
                    return;
                }
                playerMessage.m7225a(false);
                return;
            }
        }
        this.f13627p.add(new C2118b(playerMessage));
    }

    /* renamed from: b */
    private void m16886b(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.m7229e().getLooper() == this.f13617f.getLooper()) {
            m16898d(playerMessage);
            if (this.f13631t.f6102f == 3 || this.f13631t.f6102f == 2) {
                this.f13617f.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.f13617f.obtainMessage(15, playerMessage).sendToTarget();
    }

    /* renamed from: c */
    private void m16894c(final PlayerMessage playerMessage) {
        playerMessage.m7229e().post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C4242g f6045b;

            public void run() {
                try {
                    this.f6045b.m16898d(playerMessage);
                } catch (Throwable e) {
                    Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            }
        });
    }

    /* renamed from: d */
    private void m16898d(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (!playerMessage.m7234j()) {
            try {
                playerMessage.m7226b().handleMessage(playerMessage.m7227c(), playerMessage.m7228d());
            } finally {
                playerMessage.m7225a(true);
            }
        }
    }

    /* renamed from: j */
    private void m16909j() {
        for (int size = this.f13627p.size() - 1; size >= 0; size--) {
            if (!m16880a((C2118b) this.f13627p.get(size))) {
                ((C2118b) this.f13627p.get(size)).f6049a.m7225a(false);
                this.f13627p.remove(size);
            }
        }
        Collections.sort(this.f13627p);
    }

    /* renamed from: a */
    private boolean m16880a(C2118b c2118b) {
        if (c2118b.f6052d == null) {
            Pair a = m16865a(new C2120d(c2118b.f6049a.m7224a(), c2118b.f6049a.m7231g(), C2005C.m7216b(c2118b.f6049a.m7230f())), false);
            if (a == null) {
                return false;
            }
            c2118b.m7571a(((Integer) a.first).intValue(), ((Long) a.second).longValue(), this.f13631t.f6097a.mo2316a(((Integer) a.first).intValue(), this.f13622k, true).f6204b);
        } else {
            int a2 = this.f13631t.f6097a.mo2315a(c2118b.f6052d);
            if (a2 == -1) {
                return false;
            }
            c2118b.f6050b = a2;
        }
        return true;
    }

    /* renamed from: b */
    private void m16885b(long r7, long r9) throws com.google.android.exoplayer2.ExoPlaybackException {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r6 = this;
        r0 = r6.f13627p;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00f8;
    L_0x0008:
        r0 = r6.f13631t;
        r0 = r0.f6099c;
        r0 = r0.m7821a();
        if (r0 == 0) goto L_0x0014;
    L_0x0012:
        goto L_0x00f8;
    L_0x0014:
        r0 = r6.f13631t;
        r0 = r0.f6100d;
        r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r2 != 0) goto L_0x0021;
    L_0x001c:
        r0 = 1;
        r2 = r7 - r0;
        r7 = r2;
    L_0x0021:
        r0 = r6.f13631t;
        r0 = r0.f6099c;
        r0 = r0.f6223a;
        r1 = r6.f13611E;
        r2 = 0;
        if (r1 <= 0) goto L_0x0039;
    L_0x002c:
        r1 = r6.f13627p;
        r3 = r6.f13611E;
        r3 = r3 + -1;
        r1 = r1.get(r3);
        r1 = (com.google.android.exoplayer2.C4242g.C2118b) r1;
        goto L_0x003a;
    L_0x0039:
        r1 = r2;
    L_0x003a:
        if (r1 == 0) goto L_0x0061;
    L_0x003c:
        r3 = r1.f6050b;
        if (r3 > r0) goto L_0x004a;
    L_0x0040:
        r3 = r1.f6050b;
        if (r3 != r0) goto L_0x0061;
    L_0x0044:
        r3 = r1.f6051c;
        r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r1 <= 0) goto L_0x0061;
    L_0x004a:
        r1 = r6.f13611E;
        r1 = r1 + -1;
        r6.f13611E = r1;
        r1 = r6.f13611E;
        if (r1 <= 0) goto L_0x0039;
    L_0x0054:
        r1 = r6.f13627p;
        r3 = r6.f13611E;
        r3 = r3 + -1;
        r1 = r1.get(r3);
        r1 = (com.google.android.exoplayer2.C4242g.C2118b) r1;
        goto L_0x003a;
    L_0x0061:
        r1 = r6.f13611E;
        r3 = r6.f13627p;
        r3 = r3.size();
        if (r1 >= r3) goto L_0x0076;
    L_0x006b:
        r1 = r6.f13627p;
        r3 = r6.f13611E;
        r1 = r1.get(r3);
        r1 = (com.google.android.exoplayer2.C4242g.C2118b) r1;
        goto L_0x0077;
    L_0x0076:
        r1 = r2;
    L_0x0077:
        if (r1 == 0) goto L_0x00a6;
    L_0x0079:
        r3 = r1.f6052d;
        if (r3 == 0) goto L_0x00a6;
    L_0x007d:
        r3 = r1.f6050b;
        if (r3 < r0) goto L_0x008b;
    L_0x0081:
        r3 = r1.f6050b;
        if (r3 != r0) goto L_0x00a6;
    L_0x0085:
        r3 = r1.f6051c;
        r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r5 > 0) goto L_0x00a6;
    L_0x008b:
        r1 = r6.f13611E;
        r1 = r1 + 1;
        r6.f13611E = r1;
        r1 = r6.f13611E;
        r3 = r6.f13627p;
        r3 = r3.size();
        if (r1 >= r3) goto L_0x0076;
    L_0x009b:
        r1 = r6.f13627p;
        r3 = r6.f13611E;
        r1 = r1.get(r3);
        r1 = (com.google.android.exoplayer2.C4242g.C2118b) r1;
        goto L_0x0077;
    L_0x00a6:
        if (r1 == 0) goto L_0x00f7;
    L_0x00a8:
        r3 = r1.f6052d;
        if (r3 == 0) goto L_0x00f7;
    L_0x00ac:
        r3 = r1.f6050b;
        if (r3 != r0) goto L_0x00f7;
    L_0x00b0:
        r3 = r1.f6051c;
        r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r5 <= 0) goto L_0x00f7;
    L_0x00b6:
        r3 = r1.f6051c;
        r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1));
        if (r5 > 0) goto L_0x00f7;
    L_0x00bc:
        r3 = r1.f6049a;
        r6.m16886b(r3);
        r3 = r1.f6049a;
        r3 = r3.m7232h();
        if (r3 != 0) goto L_0x00d9;
    L_0x00c9:
        r1 = r1.f6049a;
        r1 = r1.m7234j();
        if (r1 == 0) goto L_0x00d2;
    L_0x00d1:
        goto L_0x00d9;
    L_0x00d2:
        r1 = r6.f13611E;
        r1 = r1 + 1;
        r6.f13611E = r1;
        goto L_0x00e0;
    L_0x00d9:
        r1 = r6.f13627p;
        r3 = r6.f13611E;
        r1.remove(r3);
    L_0x00e0:
        r1 = r6.f13611E;
        r3 = r6.f13627p;
        r3 = r3.size();
        if (r1 >= r3) goto L_0x00f5;
    L_0x00ea:
        r1 = r6.f13627p;
        r3 = r6.f13611E;
        r1 = r1.get(r3);
        r1 = (com.google.android.exoplayer2.C4242g.C2118b) r1;
        goto L_0x00a6;
    L_0x00f5:
        r1 = r2;
        goto L_0x00a6;
    L_0x00f7:
        return;
    L_0x00f8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.g.b(long, long):void");
    }

    /* renamed from: a */
    private void m16871a(Renderer renderer) throws ExoPlaybackException {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    /* renamed from: b */
    private void m16887b(Renderer renderer) throws ExoPlaybackException {
        this.f13625n.m13445b(renderer);
        m16871a(renderer);
        renderer.disable();
    }

    /* renamed from: k */
    private void m16910k() throws ExoPlaybackException {
        if (this.f13629r.m7630f()) {
            float f = this.f13625n.getPlaybackParameters().f6152b;
            C2123j c = this.f13629r.m7627c();
            C2123j d = this.f13629r.m7628d();
            Object obj = 1;
            while (c != null) {
                if (!c.f6068f) {
                    break;
                } else if (c.m7594b(f)) {
                    if (obj != null) {
                        c = this.f13629r.m7627c();
                        boolean[] zArr = new boolean[this.f13612a.length];
                        long a = c.m7589a(this.f13631t.f6106j, this.f13629r.m7621a(c), zArr);
                        m16876a(c.f6072j, c.f6073k);
                        if (!(this.f13631t.f6102f == 4 || a == this.f13631t.f6106j)) {
                            this.f13631t = this.f13631t.m7636a(this.f13631t.f6099c, a, this.f13631t.f6101e);
                            this.f13626o.m7577b(4);
                            m16868a(a);
                        }
                        boolean[] zArr2 = new boolean[this.f13612a.length];
                        int i = 0;
                        for (int i2 = 0; i2 < this.f13612a.length; i2++) {
                            Renderer renderer = this.f13612a[i2];
                            zArr2[i2] = renderer.getState() != 0;
                            SampleStream sampleStream = c.f6065c[i2];
                            if (sampleStream != null) {
                                i++;
                            }
                            if (zArr2[i2]) {
                                if (sampleStream != renderer.getStream()) {
                                    m16887b(renderer);
                                } else if (zArr[i2]) {
                                    renderer.resetPosition(this.f13610D);
                                }
                            }
                        }
                        this.f13631t = this.f13631t.m7637a(c.f6072j, c.f6073k);
                        m16879a(zArr2, i);
                    } else {
                        this.f13629r.m7621a(c);
                        if (c.f6068f) {
                            c.m7588a(Math.max(c.f6070h.f6079b, c.m7592b(this.f13610D)), false);
                            m16876a(c.f6072j, c.f6073k);
                        }
                    }
                    if (this.f13631t.f6102f != 4) {
                        m16916q();
                        m16902f();
                        this.f13617f.sendEmptyMessage(2);
                    }
                    return;
                } else {
                    if (c == d) {
                        obj = null;
                    }
                    c = c.f6071i;
                }
            }
        }
    }

    /* renamed from: a */
    private void m16876a(TrackGroupArray trackGroupArray, C2256f c2256f) {
        this.f13616e.onTracksSelected(this.f13612a, trackGroupArray, c2256f.f6690c);
    }

    /* renamed from: a */
    private void m16866a(float f) {
        for (C2123j e = this.f13629r.m7629e(); e != null; e = e.f6071i) {
            if (e.f6073k != null) {
                for (TrackSelection trackSelection : e.f6073k.f6690c.m8124a()) {
                    if (trackSelection != null) {
                        trackSelection.onPlaybackSpeed(f);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private boolean m16907h(boolean z) {
        if (this.f13633v.length == 0) {
            return m16911l();
        }
        boolean z2 = false;
        if (!z) {
            return false;
        }
        if (!this.f13631t.f6103g) {
            return true;
        }
        z = this.f13629r.m7625b();
        long a = z.m7590a(z.f6070h.f6084g ^ true);
        if (a == Long.MIN_VALUE || this.f13616e.shouldStartPlayback(a - z.m7592b(this.f13610D), this.f13625n.getPlaybackParameters().f6152b, this.f13636y)) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: l */
    private boolean m16911l() {
        C2123j c = this.f13629r.m7627c();
        long j = c.f6070h.f6082e;
        if (j != -9223372036854775807L && this.f13631t.f6106j >= j) {
            if (c.f6071i != null) {
                if (!c.f6071i.f6068f) {
                    if (c.f6071i.f6070h.f6078a.m7821a()) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private void m16912m() throws IOException {
        C2123j b = this.f13629r.m7625b();
        C2123j d = this.f13629r.m7628d();
        if (!(b == null || b.f6068f || (d != null && d.f6071i != b))) {
            Renderer[] rendererArr = this.f13633v;
            int length = rendererArr.length;
            int i = 0;
            while (i < length) {
                if (rendererArr[i].hasReadStreamToEnd()) {
                    i++;
                } else {
                    return;
                }
            }
            b.f6063a.maybeThrowPrepareError();
        }
    }

    /* renamed from: a */
    private void m16872a(C2117a c2117a) throws ExoPlaybackException {
        C2117a c2117a2 = c2117a;
        if (c2117a2.f6046a == this.f13632u) {
            C2165q c2165q = r0.f13631t.f6097a;
            C2165q c2165q2 = c2117a2.f6047b;
            Object obj = c2117a2.f6048c;
            r0.f13629r.m7618a(c2165q2);
            r0.f13631t = r0.f13631t.m7635a(c2165q2, obj);
            m16909j();
            long j = 0;
            Pair a;
            int intValue;
            if (r0.f13608B > 0) {
                r0.f13626o.m7575a(r0.f13608B);
                r0.f13608B = 0;
                long longValue;
                C2166a a2;
                if (r0.f13609C != null) {
                    a = m16865a(r0.f13609C, true);
                    r0.f13609C = null;
                    if (a == null) {
                        m16913n();
                    } else {
                        intValue = ((Integer) a.first).intValue();
                        longValue = ((Long) a.second).longValue();
                        a2 = r0.f13629r.m7616a(intValue, longValue);
                        r0.f13631t = r0.f13631t.m7636a(a2, a2.m7821a() ? 0 : longValue, longValue);
                    }
                } else if (r0.f13631t.f6100d == -9223372036854775807L) {
                    if (c2165q2.m7802a()) {
                        m16913n();
                    } else {
                        a = m16883b(c2165q2, c2165q2.mo2337b(r0.f13607A), -9223372036854775807L);
                        intValue = ((Integer) a.first).intValue();
                        longValue = ((Long) a.second).longValue();
                        a2 = r0.f13629r.m7616a(intValue, longValue);
                        r0.f13631t = r0.f13631t.m7636a(a2, a2.m7821a() ? 0 : longValue, longValue);
                    }
                }
                return;
            }
            int i = r0.f13631t.f6099c.f6223a;
            long j2 = r0.f13631t.f6101e;
            C2166a a3;
            if (c2165q.m7802a()) {
                if (!c2165q2.m7802a()) {
                    a3 = r0.f13629r.m7616a(i, j2);
                    C2126m c2126m = r0.f13631t;
                    if (!a3.m7821a()) {
                        j = j2;
                    }
                    r0.f13631t = c2126m.m7636a(a3, j, j2);
                }
                return;
            }
            C2123j e = r0.f13629r.m7629e();
            int a4 = c2165q2.mo2315a(e == null ? c2165q.mo2316a(i, r0.f13622k, true).f6204b : e.f6064b);
            if (a4 == -1) {
                i = m16862a(i, c2165q, c2165q2);
                if (i == -1) {
                    m16913n();
                    return;
                }
                a = m16883b(c2165q2, c2165q2.m7797a(i, r0.f13622k).f6205c, -9223372036854775807L);
                intValue = ((Integer) a.first).intValue();
                long longValue2 = ((Long) a.second).longValue();
                C2166a a5 = r0.f13629r.m7616a(intValue, longValue2);
                c2165q2.mo2316a(intValue, r0.f13622k, true);
                if (e != null) {
                    obj = r0.f13622k.f6204b;
                    e.f6070h = e.f6070h.m7599a(-1);
                    while (e.f6071i != null) {
                        e = e.f6071i;
                        if (e.f6064b.equals(obj)) {
                            e.f6070h = r0.f13629r.m7614a(e.f6070h, intValue);
                        } else {
                            e.f6070h = e.f6070h.m7599a(-1);
                        }
                    }
                }
                if (!a5.m7821a()) {
                    j = longValue2;
                }
                r0.f13631t = r0.f13631t.m7636a(a5, m16863a(a5, j), longValue2);
                return;
            }
            if (a4 != i) {
                r0.f13631t = r0.f13631t.m7634a(a4);
            }
            C2166a c2166a = r0.f13631t.f6099c;
            if (c2166a.m7821a()) {
                a3 = r0.f13629r.m7616a(a4, j2);
                if (!a3.equals(c2166a)) {
                    if (!a3.m7821a()) {
                        j = j2;
                    }
                    r0.f13631t = r0.f13631t.m7636a(a3, m16863a(a3, j), j2);
                    return;
                }
            }
            if (!r0.f13629r.m7623a(c2166a, r0.f13610D)) {
                m16905g(false);
            }
        }
    }

    /* renamed from: n */
    private void m16913n() {
        m16884b(4);
        m16878a(false, true, false);
    }

    /* renamed from: a */
    private int m16862a(int i, C2165q c2165q, C2165q c2165q2) {
        int c = c2165q.mo2319c();
        int i2 = i;
        i = -1;
        for (int i3 = 0; i3 < c && i == -1; i3++) {
            i2 = c2165q.m7792a(i2, this.f13622k, this.f13621j, this.f13637z, this.f13607A);
            if (i2 == -1) {
                break;
            }
            i = c2165q2.mo2315a(c2165q.mo2316a(i2, this.f13622k, true).f6204b);
        }
        return i;
    }

    /* renamed from: a */
    private android.util.Pair<java.lang.Integer, java.lang.Long> m16865a(com.google.android.exoplayer2.C4242g.C2120d r11, boolean r12) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r10 = this;
        r0 = r10.f13631t;
        r0 = r0.f6097a;
        r1 = r11.f6057a;
        r2 = r0.m7802a();
        r3 = 0;
        if (r2 == 0) goto L_0x000e;
    L_0x000d:
        return r3;
    L_0x000e:
        r2 = r1.m7802a();
        if (r2 == 0) goto L_0x0015;
    L_0x0014:
        r1 = r0;
    L_0x0015:
        r5 = r10.f13621j;	 Catch:{ IndexOutOfBoundsException -> 0x006b }
        r6 = r10.f13622k;	 Catch:{ IndexOutOfBoundsException -> 0x006b }
        r7 = r11.f6058b;	 Catch:{ IndexOutOfBoundsException -> 0x006b }
        r8 = r11.f6059c;	 Catch:{ IndexOutOfBoundsException -> 0x006b }
        r4 = r1;	 Catch:{ IndexOutOfBoundsException -> 0x006b }
        r2 = r4.m7795a(r5, r6, r7, r8);	 Catch:{ IndexOutOfBoundsException -> 0x006b }
        if (r0 != r1) goto L_0x0025;
    L_0x0024:
        return r2;
    L_0x0025:
        r11 = r2.first;
        r11 = (java.lang.Integer) r11;
        r11 = r11.intValue();
        r4 = r10.f13622k;
        r5 = 1;
        r11 = r1.mo2316a(r11, r4, r5);
        r11 = r11.f6204b;
        r11 = r0.mo2315a(r11);
        r4 = -1;
        if (r11 == r4) goto L_0x0048;
    L_0x003d:
        r11 = java.lang.Integer.valueOf(r11);
        r12 = r2.second;
        r11 = android.util.Pair.create(r11, r12);
        return r11;
    L_0x0048:
        if (r12 == 0) goto L_0x006a;
    L_0x004a:
        r11 = r2.first;
        r11 = (java.lang.Integer) r11;
        r11 = r11.intValue();
        r11 = r10.m16862a(r11, r1, r0);
        if (r11 == r4) goto L_0x006a;
    L_0x0058:
        r12 = r10.f13622k;
        r11 = r0.m7797a(r11, r12);
        r11 = r11.f6205c;
        r1 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r11 = r10.m16883b(r0, r11, r1);
        return r11;
    L_0x006a:
        return r3;
    L_0x006b:
        r12 = new com.google.android.exoplayer2.IllegalSeekPositionException;
        r1 = r11.f6058b;
        r2 = r11.f6059c;
        r12.<init>(r0, r1, r2);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.g.a(com.google.android.exoplayer2.g$d, boolean):android.util.Pair<java.lang.Integer, java.lang.Long>");
    }

    /* renamed from: b */
    private Pair<Integer, Long> m16883b(C2165q c2165q, int i, long j) {
        return c2165q.m7795a(this.f13621j, this.f13622k, i, j);
    }

    /* renamed from: o */
    private void m16914o() throws ExoPlaybackException, IOException {
        if (this.f13632u != null) {
            if (this.f13608B > 0) {
                this.f13632u.maybeThrowSourceInfoRefreshError();
                return;
            }
            C2123j d;
            Object obj;
            int i;
            C2123j h;
            int i2;
            Renderer renderer;
            SampleStream sampleStream;
            C2256f c2256f;
            C2256f c2256f2;
            Object obj2;
            int i3;
            Renderer renderer2;
            TrackSelection a;
            boolean a2;
            Object obj3;
            Object obj4;
            C2154o c2154o;
            Renderer renderer3;
            SampleStream sampleStream2;
            m16915p();
            C2123j b = this.f13629r.m7625b();
            int i4 = 0;
            if (b != null) {
                if (!b.m7593b()) {
                    if (!this.f13631t.f6103g) {
                        m16916q();
                    }
                    if (!this.f13629r.m7630f()) {
                        b = this.f13629r.m7627c();
                        d = this.f13629r.m7628d();
                        obj = null;
                        while (this.f13635x && b != d && this.f13610D >= b.f6071i.f6067e) {
                            if (obj != null) {
                                m16892c();
                            }
                            i = b.f6070h.f6083f ? 0 : 3;
                            h = this.f13629r.m7632h();
                            m16875a(b);
                            this.f13631t = this.f13631t.m7636a(h.f6070h.f6078a, h.f6070h.f6079b, h.f6070h.f6081d);
                            this.f13626o.m7577b(i);
                            m16902f();
                            b = h;
                            obj = 1;
                        }
                        if (d.f6070h.f6084g) {
                            if (d.f6071i != null) {
                                if (!d.f6071i.f6068f) {
                                    i2 = 0;
                                    while (i2 < this.f13612a.length) {
                                        renderer = this.f13612a[i2];
                                        sampleStream = d.f6065c[i2];
                                        if (renderer.getStream() != sampleStream) {
                                            if (sampleStream != null || renderer.hasReadStreamToEnd()) {
                                                i2++;
                                            }
                                        }
                                        return;
                                    }
                                    c2256f = d.f6073k;
                                    d = this.f13629r.m7631g();
                                    c2256f2 = d.f6073k;
                                    obj2 = d.f6063a.readDiscontinuity() == -9223372036854775807L ? 1 : null;
                                    for (i3 = 0; i3 < this.f13612a.length; i3++) {
                                        renderer2 = this.f13612a[i3];
                                        if (!c2256f.m8125a(i3)) {
                                            if (obj2 != null) {
                                                renderer2.setCurrentStreamFinal();
                                            } else if (!renderer2.isCurrentStreamFinal()) {
                                                a = c2256f2.f6690c.m8123a(i3);
                                                a2 = c2256f2.m8125a(i3);
                                                obj3 = this.f13613b[i3].getTrackType() != 5 ? 1 : null;
                                                obj4 = c2256f.f6689b[i3];
                                                c2154o = c2256f2.f6689b[i3];
                                                if (!a2 && c2154o.equals(obj4) && obj3 == null) {
                                                    renderer2.replaceStream(C4242g.m16882a(a), d.f6065c[i3], d.m7586a());
                                                } else {
                                                    renderer2.setCurrentStreamFinal();
                                                }
                                            }
                                        }
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        while (i4 < this.f13612a.length) {
                            renderer3 = this.f13612a[i4];
                            sampleStream2 = d.f6065c[i4];
                            if (sampleStream2 != null && renderer3.getStream() == sampleStream2 && renderer3.hasReadStreamToEnd()) {
                                renderer3.setCurrentStreamFinal();
                            }
                            i4++;
                        }
                    }
                }
            }
            m16899d(false);
            if (!this.f13629r.m7630f()) {
                b = this.f13629r.m7627c();
                d = this.f13629r.m7628d();
                obj = null;
                while (this.f13635x) {
                    if (obj != null) {
                        m16892c();
                    }
                    if (b.f6070h.f6083f) {
                    }
                    h = this.f13629r.m7632h();
                    m16875a(b);
                    this.f13631t = this.f13631t.m7636a(h.f6070h.f6078a, h.f6070h.f6079b, h.f6070h.f6081d);
                    this.f13626o.m7577b(i);
                    m16902f();
                    b = h;
                    obj = 1;
                }
                if (d.f6070h.f6084g) {
                    if (d.f6071i != null) {
                        if (!d.f6071i.f6068f) {
                            i2 = 0;
                            while (i2 < this.f13612a.length) {
                                renderer = this.f13612a[i2];
                                sampleStream = d.f6065c[i2];
                                if (renderer.getStream() != sampleStream) {
                                    if (sampleStream != null) {
                                    }
                                    i2++;
                                }
                                return;
                            }
                            c2256f = d.f6073k;
                            d = this.f13629r.m7631g();
                            c2256f2 = d.f6073k;
                            if (d.f6063a.readDiscontinuity() == -9223372036854775807L) {
                            }
                            while (i3 < this.f13612a.length) {
                                renderer2 = this.f13612a[i3];
                                if (!c2256f.m8125a(i3)) {
                                    if (obj2 != null) {
                                        renderer2.setCurrentStreamFinal();
                                    } else if (!renderer2.isCurrentStreamFinal()) {
                                        a = c2256f2.f6690c.m8123a(i3);
                                        a2 = c2256f2.m8125a(i3);
                                        if (this.f13613b[i3].getTrackType() != 5) {
                                        }
                                        obj4 = c2256f.f6689b[i3];
                                        c2154o = c2256f2.f6689b[i3];
                                        if (!a2) {
                                        }
                                        renderer2.setCurrentStreamFinal();
                                    }
                                }
                            }
                            return;
                        }
                    }
                    return;
                }
                while (i4 < this.f13612a.length) {
                    renderer3 = this.f13612a[i4];
                    sampleStream2 = d.f6065c[i4];
                    renderer3.setCurrentStreamFinal();
                    i4++;
                }
            }
        }
    }

    /* renamed from: p */
    private void m16915p() throws IOException {
        this.f13629r.m7617a(this.f13610D);
        if (this.f13629r.m7619a()) {
            C2124k a = this.f13629r.m7613a(this.f13610D, this.f13631t);
            if (a == null) {
                this.f13632u.maybeThrowSourceInfoRefreshError();
                return;
            }
            this.f13629r.m7615a(this.f13613b, this.f13614c, this.f13616e.getAllocator(), this.f13632u, this.f13631t.f6097a.mo2316a(a.f6078a.f6223a, this.f13622k, true).f6204b, a).prepare(this, a.f6079b);
            m16899d(true);
        }
    }

    /* renamed from: b */
    private void m16890b(MediaPeriod mediaPeriod) throws ExoPlaybackException {
        if (this.f13629r.m7622a(mediaPeriod) != null) {
            mediaPeriod = this.f13629r.m7625b();
            mediaPeriod.m7591a(this.f13625n.getPlaybackParameters().f6152b);
            m16876a(mediaPeriod.f6072j, mediaPeriod.f6073k);
            if (this.f13629r.m7630f() == null) {
                m16868a(this.f13629r.m7632h().f6070h.f6079b);
                m16875a((C2123j) null);
            }
            m16916q();
        }
    }

    /* renamed from: c */
    private void m16895c(MediaPeriod mediaPeriod) {
        if (this.f13629r.m7622a(mediaPeriod) != null) {
            this.f13629r.m7617a(this.f13610D);
            m16916q();
        }
    }

    /* renamed from: q */
    private void m16916q() {
        C2123j b = this.f13629r.m7625b();
        long c = b.m7595c();
        if (c == Long.MIN_VALUE) {
            m16899d(false);
            return;
        }
        boolean shouldContinueLoading = this.f13616e.shouldContinueLoading(c - b.m7592b(this.f13610D), this.f13625n.getPlaybackParameters().f6152b);
        m16899d(shouldContinueLoading);
        if (shouldContinueLoading) {
            b.m7598d(this.f13610D);
        }
    }

    /* renamed from: a */
    private void m16875a(@Nullable C2123j c2123j) throws ExoPlaybackException {
        C2123j c = this.f13629r.m7627c();
        if (c != null) {
            if (c2123j != c) {
                boolean[] zArr = new boolean[this.f13612a.length];
                int i = 0;
                int i2 = 0;
                while (i < this.f13612a.length) {
                    Renderer renderer = this.f13612a[i];
                    zArr[i] = renderer.getState() != 0;
                    if (c.f6073k.m8125a(i)) {
                        i2++;
                    }
                    if (zArr[i] && (!c.f6073k.m8125a(i) || (renderer.isCurrentStreamFinal() && renderer.getStream() == c2123j.f6065c[i]))) {
                        m16887b(renderer);
                    }
                    i++;
                }
                this.f13631t = this.f13631t.m7637a(c.f6072j, c.f6073k);
                m16879a(zArr, i2);
            }
        }
    }

    /* renamed from: a */
    private void m16879a(boolean[] zArr, int i) throws ExoPlaybackException {
        this.f13633v = new Renderer[i];
        i = this.f13629r.m7627c();
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13612a.length; i3++) {
            if (i.f6073k.m8125a(i3)) {
                int i4 = i2 + 1;
                m16867a(i3, zArr[i3], i2);
                i2 = i4;
            }
        }
    }

    /* renamed from: a */
    private void m16867a(int i, boolean z, int i2) throws ExoPlaybackException {
        C2123j c = this.f13629r.m7627c();
        Renderer renderer = this.f13612a[i];
        this.f13633v[i2] = renderer;
        if (renderer.getState() == 0) {
            C2154o c2154o = c.f6073k.f6689b[i];
            Format[] a = C4242g.m16882a(c.f6073k.f6690c.m8123a(i));
            i2 = (this.f13635x == 0 || this.f13631t.f6102f != 3) ? 0 : 1;
            boolean z2 = (z || i2 == 0) ? false : true;
            renderer.enable(c2154o, a, c.f6065c[i], this.f13610D, z2, c.m7586a());
            this.f13625n.m13443a(renderer);
            if (i2 != 0) {
                renderer.start();
            }
        }
    }

    /* renamed from: c */
    private boolean m16896c(Renderer renderer) {
        C2123j d = this.f13629r.m7628d();
        return (d.f6071i == null || !d.f6071i.f6068f || renderer.hasReadStreamToEnd() == null) ? null : true;
    }

    @NonNull
    /* renamed from: a */
    private static Format[] m16882a(TrackSelection trackSelection) {
        int length = trackSelection != null ? trackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = trackSelection.getFormat(i);
        }
        return formatArr;
    }
}
