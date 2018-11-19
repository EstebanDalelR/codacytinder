package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.C2005C;
import com.google.android.exoplayer2.util.C2314v;
import java.lang.reflect.Method;

final class AudioTrackPositionTracker {
    /* renamed from: a */
    private final Listener f5518a;
    /* renamed from: b */
    private final long[] f5519b;
    /* renamed from: c */
    private AudioTrack f5520c;
    /* renamed from: d */
    private int f5521d;
    /* renamed from: e */
    private int f5522e;
    /* renamed from: f */
    private C2029c f5523f;
    /* renamed from: g */
    private int f5524g;
    /* renamed from: h */
    private boolean f5525h;
    /* renamed from: i */
    private long f5526i;
    /* renamed from: j */
    private long f5527j;
    /* renamed from: k */
    private long f5528k;
    /* renamed from: l */
    private Method f5529l;
    /* renamed from: m */
    private long f5530m;
    /* renamed from: n */
    private boolean f5531n;
    /* renamed from: o */
    private boolean f5532o;
    /* renamed from: p */
    private long f5533p;
    /* renamed from: q */
    private long f5534q;
    /* renamed from: r */
    private long f5535r;
    /* renamed from: s */
    private long f5536s;
    /* renamed from: t */
    private int f5537t;
    /* renamed from: u */
    private int f5538u;
    /* renamed from: v */
    private long f5539v;
    /* renamed from: w */
    private long f5540w;
    /* renamed from: x */
    private long f5541x;
    /* renamed from: y */
    private long f5542y;

    public interface Listener {
        void onInvalidLatency(long j);

        void onPositionFramesMismatch(long j, long j2, long j3, long j4);

        void onSystemTimeUsMismatch(long j, long j2, long j3, long j4);

        void onUnderrun(int i, long j);
    }

    public AudioTrackPositionTracker(com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener r3) {
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
        r2.<init>();
        r3 = com.google.android.exoplayer2.util.C2289a.m8309a(r3);
        r3 = (com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener) r3;
        r2.f5518a = r3;
        r3 = com.google.android.exoplayer2.util.C2314v.f6956a;
        r0 = 18;
        if (r3 < r0) goto L_0x001e;
    L_0x0011:
        r3 = android.media.AudioTrack.class;	 Catch:{ NoSuchMethodException -> 0x001e }
        r0 = "getLatency";	 Catch:{ NoSuchMethodException -> 0x001e }
        r1 = 0;	 Catch:{ NoSuchMethodException -> 0x001e }
        r1 = (java.lang.Class[]) r1;	 Catch:{ NoSuchMethodException -> 0x001e }
        r3 = r3.getMethod(r0, r1);	 Catch:{ NoSuchMethodException -> 0x001e }
        r2.f5529l = r3;	 Catch:{ NoSuchMethodException -> 0x001e }
    L_0x001e:
        r3 = 10;
        r3 = new long[r3];
        r2.f5519b = r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioTrackPositionTracker.<init>(com.google.android.exoplayer2.audio.AudioTrackPositionTracker$Listener):void");
    }

    /* renamed from: a */
    public void m7281a(AudioTrack audioTrack, int i, int i2, int i3) {
        this.f5520c = audioTrack;
        this.f5521d = i2;
        this.f5522e = i3;
        this.f5523f = new C2029c(audioTrack);
        this.f5524g = audioTrack.getSampleRate();
        this.f5525h = m7271a(i);
        this.f5532o = C2314v.m8490c(i);
        this.f5526i = this.f5532o != null ? m7275g((long) (i3 / i2)) : -9223372036854775807;
        this.f5534q = 0;
        this.f5535r = 0;
        this.f5536s = 0;
        this.f5531n = false;
        this.f5539v = -9223372036854775807L;
        this.f5540w = -9223372036854775807L;
        this.f5530m = 0;
    }

    /* renamed from: a */
    public long m7279a(boolean z) {
        if (this.f5520c.getPlayState() == 3) {
            m7272e();
        }
        long nanoTime = System.nanoTime() / 1000;
        if (this.f5523f.m7305c()) {
            long g = m7275g(this.f5523f.m7309g());
            if (this.f5523f.m7306d()) {
                return g + (nanoTime - this.f5523f.m7308f());
            }
            return g;
        }
        if (this.f5538u == 0) {
            nanoTime = m7277h();
        } else {
            nanoTime += this.f5527j;
        }
        if (!z) {
            nanoTime -= this.f5530m;
        }
        return nanoTime;
    }

    /* renamed from: a */
    public void m7280a() {
        this.f5523f.m7307e();
    }

    /* renamed from: b */
    public boolean m7284b() {
        return this.f5520c.getPlayState() == 3;
    }

    /* renamed from: a */
    public boolean m7282a(long j) {
        int playState = this.f5520c.getPlayState();
        if (this.f5525h) {
            if (playState == 2) {
                this.f5531n = false;
                return false;
            } else if (playState == 1 && m7278i() == 0) {
                return false;
            }
        }
        boolean z = this.f5531n;
        this.f5531n = m7289e(j);
        if (z && this.f5531n == null && playState != 1 && this.f5518a != null) {
            this.f5518a.onUnderrun(this.f5522e, C2005C.m7215a(this.f5526i));
        }
        return true;
    }

    /* renamed from: b */
    public int m7283b(long j) {
        return this.f5522e - ((int) (j - (m7278i() * ((long) this.f5521d))));
    }

    /* renamed from: c */
    public boolean m7286c(long j) {
        return (this.f5540w == -9223372036854775807L || j <= 0 || SystemClock.elapsedRealtime() - this.f5540w < 200) ? 0 : 1;
    }

    /* renamed from: d */
    public void m7288d(long j) {
        this.f5541x = m7278i();
        this.f5539v = SystemClock.elapsedRealtime() * 1000;
        this.f5542y = j;
    }

    /* renamed from: e */
    public boolean m7289e(long j) {
        if (j <= m7278i()) {
            if (m7276g() == null) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: c */
    public boolean m7285c() {
        m7273f();
        if (this.f5539v != -9223372036854775807L) {
            return false;
        }
        this.f5523f.m7307e();
        return true;
    }

    /* renamed from: d */
    public void m7287d() {
        m7273f();
        this.f5520c = null;
        this.f5523f = null;
    }

    /* renamed from: e */
    private void m7272e() {
        long h = m7277h();
        if (h != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f5528k >= 30000) {
                this.f5519b[this.f5537t] = h - nanoTime;
                this.f5537t = (this.f5537t + 1) % 10;
                if (this.f5538u < 10) {
                    this.f5538u++;
                }
                this.f5528k = nanoTime;
                this.f5527j = 0;
                for (int i = 0; i < this.f5538u; i++) {
                    this.f5527j += this.f5519b[i] / ((long) this.f5538u);
                }
            }
            if (!this.f5525h) {
                m7270a(nanoTime, h);
                m7274f(nanoTime);
            }
        }
    }

    /* renamed from: a */
    private void m7270a(long j, long j2) {
        if (this.f5523f.m7303a(j)) {
            long f = this.f5523f.m7308f();
            long g = this.f5523f.m7309g();
            if (Math.abs(f - j) > 5000000) {
                this.f5518a.onSystemTimeUsMismatch(g, f, j, j2);
                this.f5523f.m7302a();
            } else if (Math.abs(m7275g(g) - j2) > 5000000) {
                this.f5518a.onPositionFramesMismatch(g, f, j, j2);
                this.f5523f.m7302a();
            } else {
                this.f5523f.m7304b();
            }
        }
    }

    /* renamed from: f */
    private void m7274f(long r9) {
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
        r8 = this;
        r0 = r8.f5532o;
        if (r0 == 0) goto L_0x0052;
    L_0x0004:
        r0 = r8.f5529l;
        if (r0 == 0) goto L_0x0052;
    L_0x0008:
        r0 = r8.f5533p;
        r2 = r9 - r0;
        r0 = 500000; // 0x7a120 float:7.00649E-40 double:2.47033E-318;
        r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r4 < 0) goto L_0x0052;
    L_0x0013:
        r0 = 0;
        r1 = r8.f5529l;	 Catch:{ Exception -> 0x004e }
        r2 = r8.f5520c;	 Catch:{ Exception -> 0x004e }
        r3 = r0;	 Catch:{ Exception -> 0x004e }
        r3 = (java.lang.Object[]) r3;	 Catch:{ Exception -> 0x004e }
        r1 = r1.invoke(r2, r3);	 Catch:{ Exception -> 0x004e }
        r1 = (java.lang.Integer) r1;	 Catch:{ Exception -> 0x004e }
        r1 = r1.intValue();	 Catch:{ Exception -> 0x004e }
        r1 = (long) r1;	 Catch:{ Exception -> 0x004e }
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x004e }
        r1 = r1 * r3;	 Catch:{ Exception -> 0x004e }
        r3 = r8.f5526i;	 Catch:{ Exception -> 0x004e }
        r5 = 0;	 Catch:{ Exception -> 0x004e }
        r5 = r1 - r3;	 Catch:{ Exception -> 0x004e }
        r8.f5530m = r5;	 Catch:{ Exception -> 0x004e }
        r1 = r8.f5530m;	 Catch:{ Exception -> 0x004e }
        r3 = 0;	 Catch:{ Exception -> 0x004e }
        r1 = java.lang.Math.max(r1, r3);	 Catch:{ Exception -> 0x004e }
        r8.f5530m = r1;	 Catch:{ Exception -> 0x004e }
        r1 = r8.f5530m;	 Catch:{ Exception -> 0x004e }
        r5 = 5000000; // 0x4c4b40 float:7.006492E-39 double:2.470328E-317;	 Catch:{ Exception -> 0x004e }
        r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));	 Catch:{ Exception -> 0x004e }
        if (r7 <= 0) goto L_0x0050;	 Catch:{ Exception -> 0x004e }
    L_0x0044:
        r1 = r8.f5518a;	 Catch:{ Exception -> 0x004e }
        r5 = r8.f5530m;	 Catch:{ Exception -> 0x004e }
        r1.onInvalidLatency(r5);	 Catch:{ Exception -> 0x004e }
        r8.f5530m = r3;	 Catch:{ Exception -> 0x004e }
        goto L_0x0050;
    L_0x004e:
        r8.f5529l = r0;
    L_0x0050:
        r8.f5533p = r9;
    L_0x0052:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioTrackPositionTracker.f(long):void");
    }

    /* renamed from: g */
    private long m7275g(long j) {
        return (j * 1000000) / ((long) this.f5524g);
    }

    /* renamed from: f */
    private void m7273f() {
        this.f5527j = 0;
        this.f5538u = 0;
        this.f5537t = 0;
        this.f5528k = 0;
    }

    /* renamed from: g */
    private boolean m7276g() {
        return this.f5525h && this.f5520c.getPlayState() == 2 && m7278i() == 0;
    }

    /* renamed from: a */
    private static boolean m7271a(int i) {
        return C2314v.f6956a < 23 && (i == 5 || i == 6);
    }

    /* renamed from: h */
    private long m7277h() {
        return m7275g(m7278i());
    }

    /* renamed from: i */
    private long m7278i() {
        if (this.f5539v != -9223372036854775807L) {
            return Math.min(this.f5542y, this.f5541x + ((((SystemClock.elapsedRealtime() * 1000) - this.f5539v) * ((long) this.f5524g)) / 1000000));
        }
        int playState = this.f5520c.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long j;
        long playbackHeadPosition = ((long) this.f5520c.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f5525h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f5536s = this.f5534q;
            }
            j = playbackHeadPosition + this.f5536s;
        } else {
            j = playbackHeadPosition;
        }
        if (C2314v.f6956a <= 28) {
            if (j == 0 && this.f5534q > 0 && playState == 3) {
                if (this.f5540w == -9223372036854775807L) {
                    this.f5540w = SystemClock.elapsedRealtime();
                }
                return this.f5534q;
            }
            this.f5540w = -9223372036854775807L;
        }
        if (this.f5534q > j) {
            this.f5535r++;
        }
        this.f5534q = j;
        return j + (this.f5535r << 32);
    }
}
