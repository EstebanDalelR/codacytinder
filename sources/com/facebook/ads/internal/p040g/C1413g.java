package com.facebook.ads.internal.p040g;

import android.content.Context;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSettings.TestAdType;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.C1418g;
import com.facebook.ads.internal.adapters.C1356e;
import com.facebook.ads.internal.p039f.C1403a;
import com.facebook.ads.internal.p047k.C1482c;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1495k;
import com.facebook.ads.internal.p047k.ap;
import com.facebook.ads.internal.protocol.C1521b;
import com.facebook.ads.internal.protocol.C1522c;
import com.facebook.ads.internal.server.AdPlacementType;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.facebook.ads.internal.g.g */
public class C1413g {
    /* renamed from: a */
    protected String f3891a;
    /* renamed from: b */
    protected AdPlacementType f3892b;
    /* renamed from: c */
    protected C1408c f3893c;
    /* renamed from: d */
    public Context f3894d;
    /* renamed from: e */
    public C1522c f3895e;
    /* renamed from: f */
    public boolean f3896f;
    /* renamed from: g */
    private C1521b f3897g;
    /* renamed from: h */
    private int f3898h;
    /* renamed from: i */
    private AdSize f3899i;
    /* renamed from: j */
    private final Map<String, String> f3900j;
    /* renamed from: k */
    private final C1495k f3901k;
    /* renamed from: l */
    private String f3902l;

    /* renamed from: com.facebook.ads.internal.g.g$1 */
    static /* synthetic */ class C14121 {
        /* renamed from: a */
        static final /* synthetic */ int[] f3890a = new int[C1408c.values().length];

        static {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = com.facebook.ads.internal.p040g.C1408c.values();
            r0 = r0.length;
            r0 = new int[r0];
            f3890a = r0;
            r0 = f3890a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.facebook.ads.internal.p040g.C1408c.INTERSTITIAL;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f3890a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.facebook.ads.internal.p040g.C1408c.BANNER;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f3890a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.facebook.ads.internal.p040g.C1408c.NATIVE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f3890a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.facebook.ads.internal.p040g.C1408c.REWARDED_VIDEO;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.g.g.1.<clinit>():void");
        }
    }

    public C1413g(Context context, C1416i c1416i, String str, AdSize adSize, C1522c c1522c, C1521b c1521b, int i, boolean z, C1495k c1495k, String str2) {
        this.f3891a = str;
        this.f3899i = adSize;
        this.f3895e = c1522c;
        this.f3893c = C1408c.m4894a(c1522c);
        this.f3897g = c1521b;
        this.f3898h = i;
        this.f3896f = z;
        this.f3900j = c1416i.m4929b();
        this.f3901k = c1495k;
        this.f3894d = context;
        this.f3902l = str2;
        m4913g();
        C1403a.m4872a(context);
    }

    /* renamed from: a */
    private void m4912a(Map<String, String> map, String str, String str2) {
        map.put(str, str2);
    }

    /* renamed from: g */
    private void m4913g() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0026 in {2, 5, 7, 8, 9, 10, 11} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
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
        r0 = r2.f3893c;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = com.facebook.ads.internal.p040g.C1408c.UNKNOWN;
        r2.f3893c = r0;
    L_0x0008:
        r0 = com.facebook.ads.internal.p040g.C1413g.C14121.f3890a;
        r1 = r2.f3893c;
        r1 = r1.ordinal();
        r0 = r0[r1];
        switch(r0) {
            case 1: goto L_0x0023;
            case 2: goto L_0x0020;
            case 3: goto L_0x001d;
            case 4: goto L_0x001a;
            default: goto L_0x0015;
        };
    L_0x0015:
        r0 = com.facebook.ads.internal.server.AdPlacementType.UNKNOWN;
    L_0x0017:
        r2.f3892b = r0;
        return;
    L_0x001a:
        r0 = com.facebook.ads.internal.server.AdPlacementType.REWARDED_VIDEO;
        goto L_0x0017;
    L_0x001d:
        r0 = com.facebook.ads.internal.server.AdPlacementType.NATIVE;
        goto L_0x0017;
    L_0x0020:
        r0 = com.facebook.ads.internal.server.AdPlacementType.BANNER;
        goto L_0x0017;
    L_0x0023:
        r0 = com.facebook.ads.internal.server.AdPlacementType.INTERSTITIAL;
        goto L_0x0017;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.g.g.g():void");
    }

    /* renamed from: a */
    public String m4914a() {
        return this.f3891a;
    }

    /* renamed from: b */
    public C1408c m4915b() {
        return this.f3893c;
    }

    /* renamed from: c */
    public AdSize m4916c() {
        return this.f3899i;
    }

    /* renamed from: d */
    public int m4917d() {
        return this.f3898h;
    }

    /* renamed from: e */
    public C1495k m4918e() {
        return this.f3901k;
    }

    /* renamed from: f */
    public Map<String, String> m4919f() {
        Map<String, String> hashMap = new HashMap(this.f3900j);
        m4912a(hashMap, "IDFA", C1411f.f3887b);
        m4912a(hashMap, "IDFA_FLAG", C1411f.f3888c ? "0" : "1");
        m4912a(hashMap, "COPPA", String.valueOf(AdSettings.isChildDirected()));
        m4912a(hashMap, "PLACEMENT_ID", this.f3891a);
        if (this.f3892b != AdPlacementType.UNKNOWN) {
            m4912a(hashMap, "PLACEMENT_TYPE", this.f3892b.toString().toLowerCase());
        }
        if (this.f3899i != null) {
            m4912a(hashMap, "WIDTH", String.valueOf(this.f3899i.getWidth()));
            m4912a(hashMap, "HEIGHT", String.valueOf(this.f3899i.getHeight()));
        }
        m4912a(hashMap, "ADAPTERS", C1356e.m4748a(this.f3892b));
        if (this.f3895e != null) {
            m4912a(hashMap, "TEMPLATE_ID", String.valueOf(this.f3895e.m5362a()));
        }
        if (this.f3897g != null) {
            m4912a(hashMap, "REQUEST_TYPE", String.valueOf(this.f3897g.m5361a()));
        }
        if (this.f3896f) {
            m4912a(hashMap, "TEST_MODE", "1");
        }
        if (AdSettings.getTestAdType() != TestAdType.DEFAULT) {
            m4912a(hashMap, "DEMO_AD_ID", AdSettings.getTestAdType().getAdTypeString());
        }
        if (this.f3898h != 0) {
            m4912a(hashMap, "NUM_ADS_REQUESTED", String.valueOf(this.f3898h));
        }
        m4912a(hashMap, "CLIENT_EVENTS", C1482c.m5217a());
        m4912a(hashMap, "KG_RESTRICTED", String.valueOf(ap.m5210b(this.f3894d)));
        m4912a(hashMap, "REQUEST_TIME", C1490h.m5242a(System.currentTimeMillis()));
        if (this.f3901k.m5268c()) {
            m4912a(hashMap, "BID_ID", this.f3901k.m5269d());
        }
        if (this.f3902l != null) {
            m4912a(hashMap, "STACK_TRACE", this.f3902l);
        }
        if (C1418g.m4946q(this.f3894d)) {
            m4912a(hashMap, "CLIENT_REQUEST_ID", UUID.randomUUID().toString());
        }
        return hashMap;
    }
}
