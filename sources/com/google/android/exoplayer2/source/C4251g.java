package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2122i;
import com.google.android.exoplayer2.C2162p;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.C2075h;
import com.google.android.exoplayer2.extractor.C3618b;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.C2054a;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2177a;
import com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.Callback;
import com.google.android.exoplayer2.upstream.Loader.Loadable;
import com.google.android.exoplayer2.upstream.Loader.ReleaseCallback;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2294e;
import com.google.android.exoplayer2.util.C2297h;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.source.g */
final class C4251g implements ExtractorOutput, MediaPeriod, UpstreamFormatChangedListener, Callback<C3688a>, ReleaseCallback {
    /* renamed from: A */
    private long f13702A;
    /* renamed from: B */
    private boolean[] f13703B;
    /* renamed from: C */
    private boolean[] f13704C;
    /* renamed from: D */
    private boolean[] f13705D;
    /* renamed from: E */
    private boolean f13706E;
    /* renamed from: F */
    private long f13707F;
    /* renamed from: G */
    private long f13708G;
    /* renamed from: H */
    private long f13709H;
    /* renamed from: I */
    private boolean f13710I;
    /* renamed from: J */
    private int f13711J;
    /* renamed from: K */
    private boolean f13712K;
    /* renamed from: L */
    private boolean f13713L;
    /* renamed from: a */
    private final Uri f13714a;
    /* renamed from: b */
    private final DataSource f13715b;
    /* renamed from: c */
    private final int f13716c;
    /* renamed from: d */
    private final C2177a f13717d;
    /* renamed from: e */
    private final C2205c f13718e;
    /* renamed from: f */
    private final Allocator f13719f;
    @Nullable
    /* renamed from: g */
    private final String f13720g;
    /* renamed from: h */
    private final long f13721h;
    /* renamed from: i */
    private final Loader f13722i = new Loader("Loader:ExtractorMediaPeriod");
    /* renamed from: j */
    private final C2204b f13723j;
    /* renamed from: k */
    private final C2294e f13724k;
    /* renamed from: l */
    private final Runnable f13725l;
    /* renamed from: m */
    private final Runnable f13726m;
    /* renamed from: n */
    private final Handler f13727n;
    /* renamed from: o */
    private MediaPeriod.Callback f13728o;
    /* renamed from: p */
    private SeekMap f13729p;
    /* renamed from: q */
    private SampleQueue[] f13730q;
    /* renamed from: r */
    private int[] f13731r;
    /* renamed from: s */
    private boolean f13732s;
    /* renamed from: t */
    private boolean f13733t;
    /* renamed from: u */
    private int f13734u;
    /* renamed from: v */
    private boolean f13735v;
    /* renamed from: w */
    private boolean f13736w;
    /* renamed from: x */
    private boolean f13737x;
    /* renamed from: y */
    private int f13738y;
    /* renamed from: z */
    private TrackGroupArray f13739z;

    /* renamed from: com.google.android.exoplayer2.source.g$1 */
    class C22021 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C4251g f6345a;

        C22021(C4251g c4251g) {
            this.f6345a = c4251g;
        }

        public void run() {
            this.f6345a.m16978d();
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.g$2 */
    class C22032 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C4251g f6346a;

        C22032(C4251g c4251g) {
            this.f6346a = c4251g;
        }

        public void run() {
            if (!this.f6346a.f13713L) {
                this.f6346a.f13728o.onContinueLoadingRequested(this.f6346a);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.g$b */
    private static final class C2204b {
        /* renamed from: a */
        private final Extractor[] f6347a;
        /* renamed from: b */
        private final ExtractorOutput f6348b;
        /* renamed from: c */
        private Extractor f6349c;

        public C2204b(Extractor[] extractorArr, ExtractorOutput extractorOutput) {
            this.f6347a = extractorArr;
            this.f6348b = extractorOutput;
        }

        /* renamed from: a */
        public com.google.android.exoplayer2.extractor.Extractor m7878a(com.google.android.exoplayer2.extractor.ExtractorInput r6, android.net.Uri r7) throws java.io.IOException, java.lang.InterruptedException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r5 = this;
            r0 = r5.f6349c;
            if (r0 == 0) goto L_0x0007;
        L_0x0004:
            r6 = r5.f6349c;
            return r6;
        L_0x0007:
            r0 = r5.f6347a;
            r1 = r0.length;
            r2 = 0;
        L_0x000b:
            if (r2 >= r1) goto L_0x0026;
        L_0x000d:
            r3 = r0[r2];
            r4 = r3.sniff(r6);	 Catch:{ EOFException -> 0x0020, all -> 0x001b }
            if (r4 == 0) goto L_0x0020;	 Catch:{ EOFException -> 0x0020, all -> 0x001b }
        L_0x0015:
            r5.f6349c = r3;	 Catch:{ EOFException -> 0x0020, all -> 0x001b }
            r6.resetPeekPosition();
            goto L_0x0026;
        L_0x001b:
            r7 = move-exception;
            r6.resetPeekPosition();
            throw r7;
        L_0x0020:
            r6.resetPeekPosition();
            r2 = r2 + 1;
            goto L_0x000b;
        L_0x0026:
            r6 = r5.f6349c;
            if (r6 != 0) goto L_0x004c;
        L_0x002a:
            r6 = new com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "None of the available extractors (";
            r0.append(r1);
            r1 = r5.f6347a;
            r1 = com.google.android.exoplayer2.util.C2314v.m8469a(r1);
            r0.append(r1);
            r1 = ") could read the stream.";
            r0.append(r1);
            r0 = r0.toString();
            r6.<init>(r0, r7);
            throw r6;
        L_0x004c:
            r6 = r5.f6349c;
            r7 = r5.f6348b;
            r6.init(r7);
            r6 = r5.f6349c;
            return r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.g.b.a(com.google.android.exoplayer2.extractor.ExtractorInput, android.net.Uri):com.google.android.exoplayer2.extractor.Extractor");
        }

        /* renamed from: a */
        public void m7879a() {
            if (this.f6349c != null) {
                this.f6349c.release();
                this.f6349c = null;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.g$c */
    interface C2205c {
        /* renamed from: a */
        void mo3494a(long j, boolean z);
    }

    /* renamed from: com.google.android.exoplayer2.source.g$a */
    final class C3688a implements Loadable {
        /* renamed from: a */
        final /* synthetic */ C4251g f11451a;
        /* renamed from: b */
        private final Uri f11452b;
        /* renamed from: c */
        private final DataSource f11453c;
        /* renamed from: d */
        private final C2204b f11454d;
        /* renamed from: e */
        private final C2294e f11455e;
        /* renamed from: f */
        private final C2075h f11456f = new C2075h();
        /* renamed from: g */
        private volatile boolean f11457g;
        /* renamed from: h */
        private boolean f11458h = true;
        /* renamed from: i */
        private long f11459i;
        /* renamed from: j */
        private DataSpec f11460j;
        /* renamed from: k */
        private long f11461k = -1;
        /* renamed from: l */
        private long f11462l;

        public C3688a(C4251g c4251g, Uri uri, DataSource dataSource, C2204b c2204b, C2294e c2294e) {
            this.f11451a = c4251g;
            this.f11452b = (Uri) C2289a.m8309a((Object) uri);
            this.f11453c = (DataSource) C2289a.m8309a((Object) dataSource);
            this.f11454d = (C2204b) C2289a.m8309a((Object) c2204b);
            this.f11455e = c2294e;
        }

        /* renamed from: a */
        public void m13965a(long j, long j2) {
            this.f11456f.f5726a = j;
            this.f11459i = j2;
            this.f11458h = 1;
        }

        public void cancelLoad() {
            this.f11457g = true;
        }

        public boolean isLoadCanceled() {
            return this.f11457g;
        }

        public void load() throws IOException, InterruptedException {
            Throwable th;
            int i = 0;
            while (i == 0 && !this.f11457g) {
                try {
                    long j = this.f11456f.f5726a;
                    this.f11460j = new DataSpec(this.f11452b, j, -1, this.f11451a.f13720g);
                    this.f11461k = this.f11453c.open(this.f11460j);
                    if (this.f11461k != -1) {
                        this.f11461k += j;
                    }
                    ExtractorInput c3618b = new C3618b(this.f11453c, j, this.f11461k);
                    try {
                        Extractor a = this.f11454d.m7878a(c3618b, this.f11453c.getUri());
                        if (this.f11458h) {
                            a.seek(j, this.f11459i);
                            this.f11458h = false;
                        }
                        while (i == 0 && !this.f11457g) {
                            this.f11455e.m8334c();
                            int read = a.read(c3618b, this.f11456f);
                            try {
                                if (c3618b.getPosition() > j + this.f11451a.f13721h) {
                                    j = c3618b.getPosition();
                                    this.f11455e.m8333b();
                                    this.f11451a.f13727n.post(this.f11451a.f13726m);
                                }
                                i = read;
                            } catch (Throwable th2) {
                                th = th2;
                                i = read;
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else if (c3618b != null) {
                            this.f11456f.f5726a = c3618b.getPosition();
                            this.f11462l = this.f11456f.f5726a - this.f11460j.f6824c;
                        }
                        C2314v.m8472a(this.f11453c);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    ExtractorInput extractorInput = null;
                }
            }
            return;
            if (i != 1) {
                if (extractorInput != null) {
                    this.f11456f.f5726a = extractorInput.getPosition();
                    this.f11462l = this.f11456f.f5726a - this.f11460j.f6824c;
                }
            }
            C2314v.m8472a(this.f11453c);
            throw th;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.g$d */
    private final class C3689d implements SampleStream {
        /* renamed from: a */
        final /* synthetic */ C4251g f11463a;
        /* renamed from: b */
        private final int f11464b;

        public C3689d(C4251g c4251g, int i) {
            this.f11463a = c4251g;
            this.f11464b = i;
        }

        public boolean isReady() {
            return this.f11463a.m16992a(this.f11464b);
        }

        public void maybeThrowError() throws IOException {
            this.f11463a.m16993b();
        }

        public int readData(C2122i c2122i, DecoderInputBuffer decoderInputBuffer, boolean z) {
            return this.f11463a.m16987a(this.f11464b, c2122i, decoderInputBuffer, z);
        }

        public int skipData(long j) {
            return this.f11463a.m16986a(this.f11464b, j);
        }
    }

    public void reevaluateBuffer(long j) {
    }

    public /* synthetic */ void onLoadCanceled(Loadable loadable, long j, long j2, boolean z) {
        m16991a((C3688a) loadable, j, j2, z);
    }

    public /* synthetic */ void onLoadCompleted(Loadable loadable, long j, long j2) {
        m16990a((C3688a) loadable, j, j2);
    }

    public /* synthetic */ int onLoadError(Loadable loadable, long j, long j2, IOException iOException) {
        return m16988a((C3688a) loadable, j, j2, iOException);
    }

    public C4251g(Uri uri, DataSource dataSource, Extractor[] extractorArr, int i, C2177a c2177a, C2205c c2205c, Allocator allocator, @Nullable String str, int i2) {
        this.f13714a = uri;
        this.f13715b = dataSource;
        this.f13716c = i;
        this.f13717d = c2177a;
        this.f13718e = c2205c;
        this.f13719f = allocator;
        this.f13720g = str;
        this.f13721h = (long) i2;
        this.f13723j = new C2204b(extractorArr, this);
        this.f13724k = new C2294e();
        this.f13725l = new C22021(this);
        this.f13726m = new C22032(this);
        this.f13727n = new Handler();
        this.f13731r = new int[0];
        this.f13730q = new SampleQueue[0];
        this.f13709H = -9223372036854775807L;
        this.f13707F = -1;
        this.f13702A = -9223372036854775807L;
        if (i == -1) {
            i = 3;
        }
        this.f13734u = i;
        c2177a.m7825a();
    }

    /* renamed from: a */
    public void m16989a() {
        if (this.f13733t) {
            for (SampleQueue l : this.f13730q) {
                l.m13890l();
            }
        }
        this.f13722i.m14086a((ReleaseCallback) this);
        this.f13727n.removeCallbacksAndMessages(null);
        this.f13713L = true;
        this.f13717d.m7838b();
    }

    public void onLoaderReleased() {
        for (SampleQueue a : this.f13730q) {
            a.m13871a();
        }
        this.f13723j.m7879a();
    }

    public void prepare(MediaPeriod.Callback callback, long j) {
        this.f13728o = callback;
        this.f13724k.m8332a();
        m16980e();
    }

    public void maybeThrowPrepareError() throws IOException {
        m16993b();
    }

    public TrackGroupArray getTrackGroups() {
        return this.f13739z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long selectTracks(com.google.android.exoplayer2.trackselection.TrackSelection[] r7, boolean[] r8, com.google.android.exoplayer2.source.SampleStream[] r9, boolean[] r10, long r11) {
        /*
        r6 = this;
        r0 = r6.f13733t;
        com.google.android.exoplayer2.util.C2289a.m8313b(r0);
        r0 = r6.f13738y;
        r1 = 0;
        r2 = 0;
    L_0x0009:
        r3 = r7.length;
        r4 = 1;
        if (r2 >= r3) goto L_0x0037;
    L_0x000d:
        r3 = r9[r2];
        if (r3 == 0) goto L_0x0034;
    L_0x0011:
        r3 = r7[r2];
        if (r3 == 0) goto L_0x0019;
    L_0x0015:
        r3 = r8[r2];
        if (r3 != 0) goto L_0x0034;
    L_0x0019:
        r3 = r9[r2];
        r3 = (com.google.android.exoplayer2.source.C4251g.C3689d) r3;
        r3 = r3.f11464b;
        r5 = r6.f13703B;
        r5 = r5[r3];
        com.google.android.exoplayer2.util.C2289a.m8313b(r5);
        r5 = r6.f13738y;
        r5 = r5 - r4;
        r6.f13738y = r5;
        r4 = r6.f13703B;
        r4[r3] = r1;
        r3 = 0;
        r9[r2] = r3;
    L_0x0034:
        r2 = r2 + 1;
        goto L_0x0009;
    L_0x0037:
        r8 = r6.f13735v;
        if (r8 == 0) goto L_0x0041;
    L_0x003b:
        if (r0 != 0) goto L_0x003f;
    L_0x003d:
        r8 = 1;
        goto L_0x0048;
    L_0x003f:
        r8 = 0;
        goto L_0x0048;
    L_0x0041:
        r2 = 0;
        r8 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1));
        if (r8 == 0) goto L_0x003f;
    L_0x0047:
        goto L_0x003d;
    L_0x0048:
        r0 = r8;
        r8 = 0;
    L_0x004a:
        r2 = r7.length;
        if (r8 >= r2) goto L_0x00af;
    L_0x004d:
        r2 = r9[r8];
        if (r2 != 0) goto L_0x00ac;
    L_0x0051:
        r2 = r7[r8];
        if (r2 == 0) goto L_0x00ac;
    L_0x0055:
        r2 = r7[r8];
        r3 = r2.length();
        if (r3 != r4) goto L_0x005f;
    L_0x005d:
        r3 = 1;
        goto L_0x0060;
    L_0x005f:
        r3 = 0;
    L_0x0060:
        com.google.android.exoplayer2.util.C2289a.m8313b(r3);
        r3 = r2.getIndexInTrackGroup(r1);
        if (r3 != 0) goto L_0x006b;
    L_0x0069:
        r3 = 1;
        goto L_0x006c;
    L_0x006b:
        r3 = 0;
    L_0x006c:
        com.google.android.exoplayer2.util.C2289a.m8313b(r3);
        r3 = r6.f13739z;
        r2 = r2.getTrackGroup();
        r2 = r3.indexOf(r2);
        r3 = r6.f13703B;
        r3 = r3[r2];
        r3 = r3 ^ r4;
        com.google.android.exoplayer2.util.C2289a.m8313b(r3);
        r3 = r6.f13738y;
        r3 = r3 + r4;
        r6.f13738y = r3;
        r3 = r6.f13703B;
        r3[r2] = r4;
        r3 = new com.google.android.exoplayer2.source.g$d;
        r3.<init>(r6, r2);
        r9[r8] = r3;
        r10[r8] = r4;
        if (r0 != 0) goto L_0x00ac;
    L_0x0095:
        r0 = r6.f13730q;
        r0 = r0[r2];
        r0.m13888j();
        r2 = r0.m13877b(r11, r4, r4);
        r3 = -1;
        if (r2 != r3) goto L_0x00ab;
    L_0x00a3:
        r0 = r0.m13884f();
        if (r0 == 0) goto L_0x00ab;
    L_0x00a9:
        r0 = 1;
        goto L_0x00ac;
    L_0x00ab:
        r0 = 0;
    L_0x00ac:
        r8 = r8 + 1;
        goto L_0x004a;
    L_0x00af:
        r7 = r6.f13738y;
        if (r7 != 0) goto L_0x00df;
    L_0x00b3:
        r6.f13710I = r1;
        r6.f13736w = r1;
        r7 = r6.f13722i;
        r7 = r7.m14087a();
        if (r7 == 0) goto L_0x00d2;
    L_0x00bf:
        r7 = r6.f13730q;
        r8 = r7.length;
    L_0x00c2:
        if (r1 >= r8) goto L_0x00cc;
    L_0x00c4:
        r9 = r7[r1];
        r9.m13890l();
        r1 = r1 + 1;
        goto L_0x00c2;
    L_0x00cc:
        r7 = r6.f13722i;
        r7.m14088b();
        goto L_0x00f1;
    L_0x00d2:
        r7 = r6.f13730q;
        r8 = r7.length;
    L_0x00d5:
        if (r1 >= r8) goto L_0x00f1;
    L_0x00d7:
        r9 = r7[r1];
        r9.m13871a();
        r1 = r1 + 1;
        goto L_0x00d5;
    L_0x00df:
        if (r0 == 0) goto L_0x00f1;
    L_0x00e1:
        r11 = r6.seekToUs(r11);
    L_0x00e5:
        r7 = r9.length;
        if (r1 >= r7) goto L_0x00f1;
    L_0x00e8:
        r7 = r9[r1];
        if (r7 == 0) goto L_0x00ee;
    L_0x00ec:
        r10[r1] = r4;
    L_0x00ee:
        r1 = r1 + 1;
        goto L_0x00e5;
    L_0x00f1:
        r6.f13735v = r4;
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.g.selectTracks(com.google.android.exoplayer2.trackselection.TrackSelection[], boolean[], com.google.android.exoplayer2.source.SampleStream[], boolean[], long):long");
    }

    public void discardBuffer(long j, boolean z) {
        int length = this.f13730q.length;
        for (int i = 0; i < length; i++) {
            this.f13730q[i].m13874a(j, z, this.f13703B[i]);
        }
    }

    public boolean continueLoading(long j) {
        if (this.f13712K == null && this.f13710I == null) {
            if (this.f13733t == null || this.f13738y != null) {
                j = this.f13724k.m8332a();
                if (!this.f13722i.m14087a()) {
                    m16980e();
                    j = 1;
                }
                return j;
            }
        }
        return 0;
    }

    public long getNextLoadPositionUs() {
        return this.f13738y == 0 ? Long.MIN_VALUE : getBufferedPositionUs();
    }

    public long readDiscontinuity() {
        if (!this.f13737x) {
            this.f13717d.m7843c();
            this.f13737x = true;
        }
        if (!this.f13736w || (!this.f13712K && m16981f() <= this.f13711J)) {
            return -9223372036854775807L;
        }
        this.f13736w = false;
        return this.f13708G;
    }

    public long getBufferedPositionUs() {
        if (this.f13712K) {
            return Long.MIN_VALUE;
        }
        if (m16985h()) {
            return this.f13709H;
        }
        long j;
        if (this.f13706E) {
            j = Format.OFFSET_SAMPLE_RELATIVE;
            int length = this.f13730q.length;
            for (int i = 0; i < length; i++) {
                if (this.f13704C[i]) {
                    j = Math.min(j, this.f13730q[i].m13886h());
                }
            }
        } else {
            j = m16983g();
        }
        if (j == Long.MIN_VALUE) {
            j = this.f13708G;
        }
        return j;
    }

    public long seekToUs(long j) {
        if (!this.f13729p.isSeekable()) {
            j = 0;
        }
        this.f13708G = j;
        int i = 0;
        this.f13736w = false;
        if (!m16985h() && m16969a(j)) {
            return j;
        }
        this.f13710I = false;
        this.f13709H = j;
        this.f13712K = false;
        if (this.f13722i.m14087a()) {
            this.f13722i.m14088b();
        } else {
            SampleQueue[] sampleQueueArr = this.f13730q;
            int length = sampleQueueArr.length;
            while (i < length) {
                sampleQueueArr[i].m13871a();
                i++;
            }
        }
        return j;
    }

    public long getAdjustedSeekPositionUs(long j, C2162p c2162p) {
        if (!this.f13729p.isSeekable()) {
            return 0;
        }
        C2054a seekPoints = this.f13729p.getSeekPoints(j);
        return C2314v.m8463a(j, c2162p, seekPoints.f5635a.f5728b, seekPoints.f5636b.f5728b);
    }

    /* renamed from: a */
    boolean m16992a(int i) {
        return !m16976c() && (this.f13712K || this.f13730q[i].m13882d() != 0);
    }

    /* renamed from: b */
    void m16993b() throws IOException {
        this.f13722i.maybeThrowError(this.f13734u);
    }

    /* renamed from: a */
    int m16987a(int i, C2122i c2122i, DecoderInputBuffer decoderInputBuffer, boolean z) {
        if (m16976c()) {
            return -3;
        }
        c2122i = this.f13730q[i].m13870a(c2122i, decoderInputBuffer, z, this.f13712K, this.f13708G);
        if (c2122i == -4) {
            m16972b(i);
        } else if (c2122i == -3) {
            m16975c(i);
        }
        return c2122i;
    }

    /* renamed from: a */
    int m16986a(int i, long j) {
        int i2 = 0;
        if (m16976c()) {
            return 0;
        }
        SampleQueue sampleQueue = this.f13730q[i];
        if (!this.f13712K || j <= sampleQueue.m13886h()) {
            j = sampleQueue.m13877b(j, true, true);
            if (j != -1) {
                i2 = j;
            }
        } else {
            i2 = sampleQueue.m13891m();
        }
        if (i2 > 0) {
            m16972b(i);
        } else {
            m16975c(i);
        }
        return i2;
    }

    /* renamed from: b */
    private void m16972b(int i) {
        if (!this.f13705D[i]) {
            Format format = this.f13739z.get(i).getFormat(0);
            this.f13717d.m7827a(C2297h.m8348g(format.sampleMimeType), format, 0, null, this.f13708G);
            this.f13705D[i] = true;
        }
    }

    /* renamed from: c */
    private void m16975c(int i) {
        if (this.f13710I && this.f13704C[i]) {
            if (this.f13730q[i].m13882d() == 0) {
                this.f13709H = 0;
                i = 0;
                this.f13710I = false;
                this.f13736w = true;
                this.f13708G = 0;
                this.f13711J = 0;
                SampleQueue[] sampleQueueArr = this.f13730q;
                int length = sampleQueueArr.length;
                while (i < length) {
                    sampleQueueArr[i].m13871a();
                    i++;
                }
                this.f13728o.onContinueLoadingRequested(this);
            }
        }
    }

    /* renamed from: c */
    private boolean m16976c() {
        if (!this.f13736w) {
            if (!m16985h()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void m16990a(C3688a c3688a, long j, long j2) {
        if (this.f13702A == -9223372036854775807L) {
            long g = m16983g();
            r0.f13702A = g == Long.MIN_VALUE ? 0 : g + 10000;
            r0.f13718e.mo3494a(r0.f13702A, r0.f13729p.isSeekable());
        }
        r0.f13717d.m7834a(c3688a.f11460j, 1, -1, null, 0, null, c3688a.f11459i, r0.f13702A, j, j2, c3688a.f11462l);
        m16967a(c3688a);
        r0.f13712K = true;
        r0.f13728o.onContinueLoadingRequested(r0);
    }

    /* renamed from: a */
    public void m16991a(C3688a c3688a, long j, long j2, boolean z) {
        this.f13717d.m7841b(c3688a.f11460j, 1, -1, null, 0, null, c3688a.f11459i, this.f13702A, j, j2, c3688a.f11462l);
        if (!z) {
            m16967a(c3688a);
            for (SampleQueue a : r0.f13730q) {
                a.m13871a();
            }
            if (r0.f13738y > 0) {
                r0.f13728o.onContinueLoadingRequested(r0);
            }
        }
    }

    /* renamed from: a */
    public int m16988a(C3688a c3688a, long j, long j2, IOException iOException) {
        boolean a = C4251g.m16971a(iOException);
        this.f13717d.m7835a(c3688a.f11460j, 1, -1, null, 0, null, c3688a.f11459i, this.f13702A, j, j2, c3688a.f11462l, iOException, a);
        m16967a(c3688a);
        if (a) {
            return 3;
        }
        C3688a c3688a2;
        Object obj;
        int f = m16981f();
        int i = 0;
        if (f > r0.f13711J) {
            c3688a2 = c3688a;
            obj = 1;
        } else {
            c3688a2 = c3688a;
            obj = null;
        }
        if (!m16970a(c3688a2, f)) {
            i = 2;
        } else if (obj != null) {
            i = 1;
        }
        return i;
    }

    public TrackOutput track(int i, int i2) {
        i2 = this.f13730q.length;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f13731r[i3] == i) {
                return this.f13730q[i3];
            }
        }
        TrackOutput sampleQueue = new SampleQueue(this.f13719f);
        sampleQueue.m13875a((UpstreamFormatChangedListener) this);
        int i4 = i2 + 1;
        this.f13731r = Arrays.copyOf(this.f13731r, i4);
        this.f13731r[i2] = i;
        this.f13730q = (SampleQueue[]) Arrays.copyOf(this.f13730q, i4);
        this.f13730q[i2] = sampleQueue;
        return sampleQueue;
    }

    public void endTracks() {
        this.f13732s = true;
        this.f13727n.post(this.f13725l);
    }

    public void seekMap(SeekMap seekMap) {
        this.f13729p = seekMap;
        this.f13727n.post(this.f13725l);
    }

    public void onUpstreamFormatChanged(Format format) {
        this.f13727n.post(this.f13725l);
    }

    /* renamed from: d */
    private void m16978d() {
        if (!(this.f13713L || this.f13733t || this.f13729p == null)) {
            if (this.f13732s) {
                SampleQueue[] sampleQueueArr = this.f13730q;
                int length = sampleQueueArr.length;
                int i = 0;
                while (i < length) {
                    if (sampleQueueArr[i].m13885g() != null) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f13724k.m8333b();
                int length2 = this.f13730q.length;
                TrackGroup[] trackGroupArr = new TrackGroup[length2];
                this.f13704C = new boolean[length2];
                this.f13703B = new boolean[length2];
                this.f13705D = new boolean[length2];
                this.f13702A = this.f13729p.getDurationUs();
                i = 0;
                while (true) {
                    boolean z = true;
                    if (i >= length2) {
                        break;
                    }
                    trackGroupArr[i] = new TrackGroup(this.f13730q[i].m13885g());
                    String str = r5.sampleMimeType;
                    if (!C2297h.m8343b(str)) {
                        if (!C2297h.m8342a(str)) {
                            z = false;
                        }
                    }
                    this.f13704C[i] = z;
                    this.f13706E = z | this.f13706E;
                    i++;
                }
                this.f13739z = new TrackGroupArray(trackGroupArr);
                if (this.f13716c == -1 && this.f13707F == -1 && this.f13729p.getDurationUs() == -9223372036854775807L) {
                    this.f13734u = 6;
                }
                this.f13733t = true;
                this.f13718e.mo3494a(this.f13702A, this.f13729p.isSeekable());
                this.f13728o.onPrepared(this);
            }
        }
    }

    /* renamed from: a */
    private void m16967a(C3688a c3688a) {
        if (this.f13707F == -1) {
            this.f13707F = c3688a.f11461k;
        }
    }

    /* renamed from: e */
    private void m16980e() {
        C3688a c3688a = new C3688a(this, this.f13714a, this.f13715b, this.f13723j, this.f13724k);
        if (this.f13733t) {
            C2289a.m8313b(m16985h());
            if (r6.f13702A == -9223372036854775807L || r6.f13709H < r6.f13702A) {
                c3688a.m13965a(r6.f13729p.getSeekPoints(r6.f13709H).f5635a.f5729c, r6.f13709H);
                r6.f13709H = -9223372036854775807L;
            } else {
                r6.f13712K = true;
                r6.f13709H = -9223372036854775807L;
                return;
            }
        }
        r6.f13711J = m16981f();
        r6.f13717d.m7833a(c3688a.f11460j, 1, -1, null, 0, null, c3688a.f11459i, r6.f13702A, r6.f13722i.m14085a(c3688a, r6, r6.f13734u));
    }

    /* renamed from: a */
    private boolean m16970a(C3688a c3688a, int i) {
        if (this.f13707F == -1) {
            if (this.f13729p == null || this.f13729p.getDurationUs() == -9223372036854775807L) {
                int i2 = 0;
                if (this.f13733t == 0 || m16976c() != 0) {
                    this.f13736w = this.f13733t;
                    this.f13708G = 0;
                    this.f13711J = 0;
                    i = this.f13730q;
                    int length = i.length;
                    while (i2 < length) {
                        i[i2].m13871a();
                        i2++;
                    }
                    c3688a.m13965a(0, 0);
                    return true;
                }
                this.f13710I = true;
                return false;
            }
        }
        this.f13711J = i;
        return true;
    }

    /* renamed from: a */
    private boolean m16969a(long j) {
        int length = this.f13730q.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            SampleQueue sampleQueue = this.f13730q[i];
            sampleQueue.m13888j();
            if (sampleQueue.m13877b(j, true, false) == -1) {
                z = false;
            }
            if (z || (!this.f13704C[i] && this.f13706E)) {
                i++;
            }
        }
        return false;
    }

    /* renamed from: f */
    private int m16981f() {
        int i = 0;
        for (SampleQueue c : this.f13730q) {
            i += c.m13880c();
        }
        return i;
    }

    /* renamed from: g */
    private long m16983g() {
        long j = Long.MIN_VALUE;
        for (SampleQueue h : this.f13730q) {
            j = Math.max(j, h.m13886h());
        }
        return j;
    }

    /* renamed from: h */
    private boolean m16985h() {
        return this.f13709H != -9223372036854775807L;
    }

    /* renamed from: a */
    private static boolean m16971a(IOException iOException) {
        return iOException instanceof UnrecognizedInputFormatException;
    }
}
