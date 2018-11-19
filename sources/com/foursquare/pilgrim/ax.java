package com.foursquare.pilgrim;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.foursquare.api.types.GeoFence;
import com.foursquare.api.types.NextPing;
import com.foursquare.api.types.PilgrimConfig;
import com.foursquare.api.types.SignalScan;
import com.foursquare.api.types.StopDetect;
import com.foursquare.api.types.StopDetectionAlgorithm;
import com.foursquare.internal.api.C1913a;
import com.foursquare.internal.util.C1948m;
import com.foursquare.internal.util.FsLog;
import com.google.gson.annotations.SerializedName;
import java.util.LinkedHashSet;
import java.util.Set;

class ax {
    /* renamed from: a */
    private static final String f5325a = "ax";
    /* renamed from: b */
    private static ax f5326b;
    @SerializedName("mLastSubmissionTime")
    /* renamed from: c */
    private long f5327c;
    @SerializedName("mNextPing")
    /* renamed from: d */
    private NextPing f5328d;
    @SerializedName("mGeoFence")
    /* renamed from: e */
    private GeoFence f5329e;
    @SerializedName("mStopDetect")
    /* renamed from: f */
    private StopDetect f5330f;
    @SerializedName("stopDetectionAlgo")
    /* renamed from: g */
    private StopDetectionAlgorithm f5331g;
    @SerializedName("mVersion")
    /* renamed from: h */
    private int f5332h;
    @SerializedName("mSleepUntil")
    /* renamed from: i */
    private long f5333i;
    @SerializedName("mSignalScan")
    /* renamed from: j */
    private SignalScan f5334j;
    @SerializedName("mLocalPollingInterval")
    /* renamed from: k */
    private C1970a f5335k;
    @SerializedName("historyEnabled")
    /* renamed from: l */
    private boolean f5336l;
    @SerializedName("batteryEnabled")
    /* renamed from: m */
    private boolean f5337m;
    @SerializedName("motionHistoryEnabled")
    /* renamed from: n */
    private boolean f5338n;
    @SerializedName("signalHistoryEnabled")
    /* renamed from: o */
    private boolean f5339o;
    @SerializedName("minBatteryLevel")
    /* renamed from: p */
    private int f5340p;
    @SerializedName("defaultPlaceSize")
    /* renamed from: q */
    private int f5341q;
    @SerializedName("useElapsedNanos")
    /* renamed from: r */
    private boolean f5342r;
    @SerializedName("schedulePeriodicLocationJob")
    /* renamed from: s */
    private boolean f5343s;
    @SerializedName("doWorkInJobService")
    /* renamed from: t */
    private boolean f5344t;
    @SerializedName("enableMallMode")
    /* renamed from: u */
    private boolean f5345u;
    @SerializedName("useActivityRecognition")
    /* renamed from: v */
    private boolean f5346v;
    @SerializedName("experiments")
    /* renamed from: w */
    private Set<String> f5347w;

    /* renamed from: com.foursquare.pilgrim.ax$a */
    static class C1970a {
        @SerializedName("mPollingIntervalInSeconds")
        /* renamed from: a */
        long f5323a = 60;
        @SerializedName("mWhy")
        /* renamed from: b */
        String f5324b = "normal";

        C1970a() {
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("LocalPollingInterval{mPollingIntervalInSeconds=");
            stringBuilder.append(this.f5323a);
            stringBuilder.append(", mWhy='");
            stringBuilder.append(this.f5324b);
            stringBuilder.append('\'');
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    private ax() {
        m7020z();
        m7002C();
    }

    /* renamed from: a */
    static void m7005a(Context context) {
        FsLog.m6800a("PilgrimProvider", "Initing pilgrim settings");
        if (f5326b == null) {
            f5326b = new ax();
            if (context != null) {
                f5326b.m7011c(context);
            }
        }
        FsLog.m6800a("PilgrimProvider", "Inited pilgrim settings");
    }

    /* renamed from: a */
    public static synchronized ax m7003a() {
        ax axVar;
        synchronized (ax.class) {
            if (f5326b == null) {
                throw new IllegalStateException("Must call PilgrimSdk.with before this");
            }
            axVar = f5326b;
        }
        return axVar;
    }

    /* renamed from: a */
    synchronized boolean m7027a(Context context, @NonNull PilgrimConfig pilgrimConfig) {
        return m7028a(context, pilgrimConfig, false);
    }

    /* renamed from: a */
    synchronized boolean m7028a(Context context, @NonNull PilgrimConfig pilgrimConfig, boolean z) {
        boolean z2;
        z2 = false;
        m7009b((int) (pilgrimConfig.getMinimumBatteryLevel() * 100.0d));
        m7013d(pilgrimConfig.shouldCollectBatteryLevels());
        m7012c(pilgrimConfig.shouldCollectHistory());
        m7008a(pilgrimConfig.shouldCollectMotionHistory());
        m7010b(pilgrimConfig.shouldCollectSignalHistory());
        NextPing nextPing = pilgrimConfig.getNextPing();
        m7000A().getMinTime();
        nextPing.getMinTime();
        m7024a(nextPing);
        if (m7034d() != pilgrimConfig.getStopDetect().getSampleRateInSeconds()) {
            m7022a(pilgrimConfig.getStopDetect().getSampleRateInSeconds(), "normal");
            z2 = true;
        }
        StopDetect stopDetect = pilgrimConfig.getStopDetect();
        if (m7037g().getFastestIntervalInSeconds() != stopDetect.getFastestIntervalInSeconds()) {
            m7037g().setFastestIntervalInSeconds(stopDetect.getFastestIntervalInSeconds());
            z2 = true;
        }
        m7025a(stopDetect);
        m7007a(pilgrimConfig.getStopDetectionAlgo());
        m7014e(pilgrimConfig.useElapsedNanos());
        boolean q = m7047q();
        boolean t = m7050t();
        boolean s = m7049s();
        m7015f(pilgrimConfig.shouldDoWorkInJobScheduler());
        m7016g(pilgrimConfig.shouldEnableMallMode());
        m7017h(pilgrimConfig.shouldSchedulerPeriodicLocationJob());
        m7018i(pilgrimConfig.shouldUseActivityRecognition());
        if (!(s == m7049s() && q == m7047q() && t == m7050t())) {
            z2 = true;
        }
        if (!(this.f5347w.containsAll(pilgrimConfig.getExperiments()) && pilgrimConfig.getExperiments().containsAll(this.f5347w))) {
            z2 = true;
        }
        m7026a(pilgrimConfig.getExperiments());
        SignalScan signalScan = new SignalScan();
        signalScan.setWifi(true);
        m7006a(signalScan);
        if (z) {
            GeoFence geoFence = pilgrimConfig.getNextPing().getGeoFence();
            if (geoFence != null) {
                if (m7036f() && m7036f().getRadius() != geoFence.getRadius()) {
                    z2 = true;
                }
                if (geoFence.getRadius() > 0.0d) {
                    m7004a((int) geoFence.getRadius());
                }
                m7023a(geoFence);
            } else {
                if (m7036f() != null) {
                    z2 = true;
                }
                m7023a((GeoFence) null);
            }
        }
        try {
            m7032b(context);
        } catch (Context context2) {
            FsLog.m6801a(f5325a, "Error saving", context2);
        }
        return z2;
    }

    /* renamed from: b */
    public void m7032b(@NonNull Context context) throws Exception {
        am.m6941b(context, C1913a.m6652a(this));
    }

    /* renamed from: c */
    private void m7011c(android.content.Context r5) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = com.foursquare.pilgrim.am.m6940b(r5);
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x00b2;
    L_0x000a:
        r1 = com.foursquare.pilgrim.ax.class;	 Catch:{ Exception -> 0x0097 }
        r0 = com.foursquare.internal.api.C1913a.m6650a(r0, r1);	 Catch:{ Exception -> 0x0097 }
        r0 = (com.foursquare.pilgrim.ax) r0;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.m7030b();	 Catch:{ Exception -> 0x0097 }
        if (r1 != 0) goto L_0x008f;	 Catch:{ Exception -> 0x0097 }
    L_0x0018:
        r1 = r0.m7030b();	 Catch:{ Exception -> 0x0097 }
        r4.f5332h = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.m7033c();	 Catch:{ Exception -> 0x0097 }
        r4.f5327c = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = new com.foursquare.pilgrim.ax$a;	 Catch:{ Exception -> 0x0097 }
        r1.<init>();	 Catch:{ Exception -> 0x0097 }
        r4.f5335k = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r4.f5335k;	 Catch:{ Exception -> 0x0097 }
        r2 = r0.m7034d();	 Catch:{ Exception -> 0x0097 }
        r1.f5323a = r2;	 Catch:{ Exception -> 0x0097 }
        r1 = r4.f5335k;	 Catch:{ Exception -> 0x0097 }
        r2 = r0.m7035e();	 Catch:{ Exception -> 0x0097 }
        r1.f5324b = r2;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.m7000A();	 Catch:{ Exception -> 0x0097 }
        r4.f5328d = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.m7036f();	 Catch:{ Exception -> 0x0097 }
        r4.f5329e = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.m7037g();	 Catch:{ Exception -> 0x0097 }
        r4.f5330f = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.m7039i();	 Catch:{ Exception -> 0x0097 }
        r4.f5333i = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.m7001B();	 Catch:{ Exception -> 0x0097 }
        r4.f5334j = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.f5336l;	 Catch:{ Exception -> 0x0097 }
        r4.f5336l = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.f5337m;	 Catch:{ Exception -> 0x0097 }
        r4.f5337m = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.f5338n;	 Catch:{ Exception -> 0x0097 }
        r4.f5338n = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.f5339o;	 Catch:{ Exception -> 0x0097 }
        r4.f5339o = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.f5331g;	 Catch:{ Exception -> 0x0097 }
        r4.f5331g = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.f5341q;	 Catch:{ Exception -> 0x0097 }
        r4.f5341q = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.f5340p;	 Catch:{ Exception -> 0x0097 }
        r4.f5340p = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.f5342r;	 Catch:{ Exception -> 0x0097 }
        r4.f5342r = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.f5343s;	 Catch:{ Exception -> 0x0097 }
        r4.f5343s = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.f5344t;	 Catch:{ Exception -> 0x0097 }
        r4.f5344t = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.f5345u;	 Catch:{ Exception -> 0x0097 }
        r4.f5345u = r1;	 Catch:{ Exception -> 0x0097 }
        r1 = r0.f5346v;	 Catch:{ Exception -> 0x0097 }
        r4.f5346v = r1;	 Catch:{ Exception -> 0x0097 }
        r0 = r0.f5347w;	 Catch:{ Exception -> 0x0097 }
        r4.f5347w = r0;	 Catch:{ Exception -> 0x0097 }
        r0 = 0;	 Catch:{ Exception -> 0x0097 }
        goto L_0x00b3;	 Catch:{ Exception -> 0x0097 }
    L_0x008f:
        r0 = new java.lang.Exception;	 Catch:{ Exception -> 0x0097 }
        r1 = "Radar settings file version out of date, will recreate.";	 Catch:{ Exception -> 0x0097 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0097 }
        throw r0;	 Catch:{ Exception -> 0x0097 }
    L_0x0097:
        r0 = move-exception;
        r1 = f5325a;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Load error: ";
        r2.append(r3);
        r0 = r0.getMessage();
        r2.append(r0);
        r0 = r2.toString();
        com.foursquare.internal.util.FsLog.m6807d(r1, r0);
    L_0x00b2:
        r0 = 1;
    L_0x00b3:
        if (r0 == 0) goto L_0x00c3;
    L_0x00b5:
        r4.m7020z();
        r4.m7032b(r5);	 Catch:{ Exception -> 0x00bc }
        goto L_0x00c3;
    L_0x00bc:
        r5 = f5325a;
        r0 = "Error saving fresh instance.";
        com.foursquare.internal.util.FsLog.m6807d(r5, r0);
    L_0x00c3:
        r4.m7002C();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.ax.c(android.content.Context):void");
    }

    /* renamed from: z */
    private void m7020z() {
        this.f5332h = 0;
        this.f5335k = new C1970a();
        this.f5327c = 0;
        this.f5328d = new NextPing();
        this.f5328d.setMinTime(300);
        this.f5330f = new StopDetect();
        this.f5333i = 0;
        this.f5334j = new SignalScan();
        this.f5336l = false;
        this.f5337m = false;
        this.f5338n = false;
        this.f5339o = false;
        this.f5331g = null;
        this.f5342r = false;
        this.f5347w = new LinkedHashSet();
        this.f5340p = 15;
        this.f5341q = 100;
    }

    /* renamed from: b */
    int m7030b() {
        return this.f5332h;
    }

    /* renamed from: c */
    long m7033c() {
        return this.f5327c;
    }

    /* renamed from: a */
    void m7021a(long j) {
        this.f5327c = j;
    }

    /* renamed from: A */
    private NextPing m7000A() {
        return this.f5328d;
    }

    /* renamed from: a */
    void m7024a(NextPing nextPing) {
        this.f5328d = nextPing;
    }

    /* renamed from: d */
    long m7034d() {
        return this.f5335k.f5323a;
    }

    /* renamed from: a */
    void m7022a(long j, String str) {
        this.f5335k.f5323a = j;
        this.f5335k.f5324b = str;
    }

    /* renamed from: e */
    String m7035e() {
        return this.f5335k.f5324b;
    }

    /* renamed from: f */
    GeoFence m7036f() {
        return this.f5329e;
    }

    /* renamed from: a */
    void m7023a(GeoFence geoFence) {
        this.f5329e = geoFence;
    }

    /* renamed from: g */
    StopDetect m7037g() {
        return this.f5330f;
    }

    @VisibleForTesting
    /* renamed from: a */
    void m7025a(StopDetect stopDetect) {
        this.f5330f = stopDetect;
    }

    /* renamed from: h */
    StopDetectionAlgorithm m7038h() {
        return this.f5331g;
    }

    /* renamed from: a */
    private void m7007a(StopDetectionAlgorithm stopDetectionAlgorithm) {
        this.f5331g = stopDetectionAlgorithm;
    }

    /* renamed from: i */
    long m7039i() {
        return this.f5333i;
    }

    /* renamed from: b */
    void m7031b(long j) {
        this.f5333i = j;
    }

    /* renamed from: B */
    private SignalScan m7001B() {
        return this.f5334j;
    }

    /* renamed from: a */
    private void m7006a(SignalScan signalScan) {
        this.f5334j = signalScan;
    }

    /* renamed from: a */
    private void m7008a(boolean z) {
        this.f5338n = z;
    }

    /* renamed from: j */
    boolean m7040j() {
        return this.f5338n;
    }

    /* renamed from: b */
    private void m7010b(boolean z) {
        this.f5339o = z;
    }

    /* renamed from: k */
    boolean m7041k() {
        return this.f5339o;
    }

    /* renamed from: c */
    private void m7012c(boolean z) {
        this.f5336l = z;
    }

    /* renamed from: l */
    boolean m7042l() {
        return this.f5336l;
    }

    /* renamed from: d */
    private void m7013d(boolean z) {
        this.f5337m = z;
    }

    /* renamed from: m */
    boolean m7043m() {
        return this.f5337m;
    }

    /* renamed from: n */
    int m7044n() {
        return this.f5341q;
    }

    /* renamed from: a */
    private void m7004a(int i) {
        if (i > 0) {
            this.f5341q = i;
        }
    }

    /* renamed from: o */
    int m7045o() {
        return this.f5340p;
    }

    /* renamed from: b */
    private void m7009b(int i) {
        if (i > 0) {
            this.f5340p = i;
        }
    }

    /* renamed from: p */
    boolean m7046p() {
        return this.f5342r;
    }

    /* renamed from: e */
    private void m7014e(boolean z) {
        this.f5342r = z;
    }

    /* renamed from: f */
    private void m7015f(boolean z) {
        this.f5344t = z;
    }

    /* renamed from: q */
    boolean m7047q() {
        return this.f5344t;
    }

    /* renamed from: g */
    private void m7016g(boolean z) {
        this.f5345u = z;
    }

    /* renamed from: r */
    boolean m7048r() {
        return this.f5345u;
    }

    /* renamed from: h */
    private void m7017h(boolean z) {
        this.f5343s = z;
    }

    /* renamed from: s */
    boolean m7049s() {
        return this.f5346v;
    }

    /* renamed from: i */
    private void m7018i(boolean z) {
        this.f5346v = z;
    }

    /* renamed from: t */
    boolean m7050t() {
        return this.f5343s;
    }

    @VisibleForTesting
    /* renamed from: a */
    protected void m7026a(@NonNull Set<String> set) {
        this.f5347w = set;
    }

    /* renamed from: u */
    boolean m7051u() {
        return m7029a("unknownToStopped");
    }

    /* renamed from: v */
    boolean m7052v() {
        return m7029a("logTrails");
    }

    /* renamed from: w */
    boolean m7053w() {
        return m7029a("logPilgrimEvents");
    }

    /* renamed from: x */
    boolean m7054x() {
        return m7029a("updatedExitDetection");
    }

    /* renamed from: a */
    boolean m7029a(@NonNull String str) {
        Set set = this.f5347w;
        return (set == null || set.contains(str) == null) ? null : true;
    }

    /* renamed from: C */
    private void m7002C() {
        if (this.f5330f == null) {
            this.f5330f = m7019y();
        }
        if (this.f5330f.getLocLag() == 0) {
            this.f5330f.setLocLag(30);
        }
        if (this.f5330f.getSpeedLag() == 0) {
            this.f5330f.setSpeedLag(60);
        }
        if (this.f5330f.getLowThres() < 1.0E-4d) {
            this.f5330f.setLowThres(0.2d);
        }
        if (this.f5330f.getHighThres() < 1.0E-4d) {
            this.f5330f.setHighThres(0.35d);
        }
        if (this.f5330f.getAccelSigma() < 1.0E-4d) {
            this.f5330f.setAccelSigma(0.005d);
        }
        if (this.f5330f.getPosSigma() < 1.0E-4d) {
            this.f5330f.setPosSigma(50.0d);
        }
        if (this.f5330f.getVelSigma() < 1.0E-4d) {
            this.f5330f.setVelSigma(3.0d);
        }
        if (this.f5330f.getSampleRateInSeconds() < 10) {
            this.f5330f.setSampleRateInSeconds(60);
        }
        if (((long) this.f5330f.getFastestIntervalInSeconds()) < 10) {
            this.f5330f.setFastestIntervalInSeconds(60);
        }
        this.f5330f.setBackgroundTimerInSeconds(900);
    }

    /* renamed from: y */
    static StopDetect m7019y() {
        StopDetect stopDetect = new StopDetect();
        if (stopDetect.getLocLag() == 0) {
            stopDetect.setLocLag(30);
        }
        if (stopDetect.getSpeedLag() == 0) {
            stopDetect.setSpeedLag(60);
        }
        if (stopDetect.getLowThres() < 1.0E-4d) {
            stopDetect.setLowThres(0.2d);
        }
        if (stopDetect.getHighThres() < 1.0E-4d) {
            stopDetect.setHighThres(0.35d);
        }
        if (stopDetect.getAccelSigma() < 1.0E-4d) {
            stopDetect.setAccelSigma(0.005d);
        }
        if (stopDetect.getPosSigma() < 1.0E-4d) {
            stopDetect.setPosSigma(50.0d);
        }
        if (stopDetect.getVelSigma() < 1.0E-4d) {
            stopDetect.setVelSigma(3.0d);
        }
        if (stopDetect.getSampleRateInSeconds() < 10) {
            stopDetect.setSampleRateInSeconds(60);
        }
        if (((long) stopDetect.getFastestIntervalInSeconds()) < 10) {
            stopDetect.setFastestIntervalInSeconds(60);
        }
        return stopDetect;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PilgrimSettings {");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("\nmLastSubmissionTime: ");
        stringBuilder2.append(this.f5327c);
        stringBuilder2.append("\nmNextPing: ");
        stringBuilder2.append(this.f5328d);
        stringBuilder2.append("\nmGeoFence: ");
        stringBuilder2.append(this.f5329e);
        stringBuilder2.append("\nmStopDetect: ");
        stringBuilder2.append(this.f5330f);
        stringBuilder2.append("\nstopDetectionAlgo: ");
        stringBuilder2.append(this.f5331g);
        stringBuilder2.append("\nmVersion: ");
        stringBuilder2.append(this.f5332h);
        stringBuilder2.append("\nmSleepUntil: ");
        stringBuilder2.append(this.f5333i);
        stringBuilder2.append("\nmSignalScan: ");
        stringBuilder2.append(this.f5334j);
        stringBuilder2.append("\nmLocalPollingInterval: ");
        stringBuilder2.append(this.f5335k);
        stringBuilder2.append("\nhistoryEnabled: ");
        stringBuilder2.append(this.f5336l);
        stringBuilder2.append("\nbatteryEnabled: ");
        stringBuilder2.append(this.f5337m);
        stringBuilder2.append("\nmotionHistoryEnabled: ");
        stringBuilder2.append(this.f5338n);
        stringBuilder2.append("\nsignalHistoryEnabled: ");
        stringBuilder2.append(this.f5339o);
        stringBuilder2.append("\nminBatteryLevel: ");
        stringBuilder2.append(this.f5340p);
        stringBuilder2.append("\ndefaultPlaceSize: ");
        stringBuilder2.append(this.f5341q);
        stringBuilder2.append("\nuseElapsedNanos: ");
        stringBuilder2.append(this.f5342r);
        stringBuilder2.append("\ndoWorkInJobService: ");
        stringBuilder2.append(this.f5344t);
        stringBuilder2.append("\nmallModeEnabled: ");
        stringBuilder2.append(this.f5345u);
        stringBuilder2.append("\nschedulePeriodicLocationJob: ");
        stringBuilder2.append(this.f5343s);
        stringBuilder.append(C1948m.m6844b(stringBuilder2.toString()));
        stringBuilder.append("\n}");
        return stringBuilder.toString();
    }
}
