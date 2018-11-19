package com.facebook.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.Nullable;
import android.support.v4.content.C0436c;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.NativeAdView.Type;
import com.facebook.ads.internal.C1350a;
import com.facebook.ads.internal.C1373b;
import com.facebook.ads.internal.C1404f;
import com.facebook.ads.internal.C1418g;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.C1352b;
import com.facebook.ads.internal.adapters.C1369z;
import com.facebook.ads.internal.adapters.C3275x;
import com.facebook.ads.internal.adapters.C3276y;
import com.facebook.ads.internal.p036c.C1374a;
import com.facebook.ads.internal.p036c.C1380b;
import com.facebook.ads.internal.p040g.C1410e;
import com.facebook.ads.internal.p047k.C1481b;
import com.facebook.ads.internal.p047k.C1481b.C1480b;
import com.facebook.ads.internal.p047k.C1482c;
import com.facebook.ads.internal.p047k.C1505r;
import com.facebook.ads.internal.p047k.ai;
import com.facebook.ads.internal.p049l.C1517a;
import com.facebook.ads.internal.p049l.C1517a.C1516a;
import com.facebook.ads.internal.protocol.C1521b;
import com.facebook.ads.internal.protocol.C1522c;
import com.facebook.ads.internal.server.AdPlacementType;
import com.facebook.ads.internal.view.C1624z;
import com.facebook.ads.internal.view.aa;
import com.facebook.ads.internal.view.hscroll.C4443b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import org.json.JSONObject;

public class NativeAd implements Ad {
    /* renamed from: b */
    private static final C1521b f9868b = C1521b.ADS;
    /* renamed from: c */
    private static final String f9869c = "NativeAd";
    /* renamed from: d */
    private static WeakHashMap<View, WeakReference<NativeAd>> f9870d = new WeakHashMap();
    @Nullable
    /* renamed from: A */
    private C1404f f9871A;
    /* renamed from: B */
    private View f9872B;
    /* renamed from: C */
    private String f9873C;
    /* renamed from: D */
    private boolean f9874D;
    @Nullable
    /* renamed from: a */
    protected C3276y f9875a;
    /* renamed from: e */
    private final Context f9876e;
    /* renamed from: f */
    private final String f9877f;
    /* renamed from: g */
    private final String f9878g;
    /* renamed from: h */
    private final C1380b f9879h;
    /* renamed from: i */
    private AdListener f9880i;
    /* renamed from: j */
    private DisplayAdController f9881j;
    /* renamed from: k */
    private volatile boolean f9882k;
    /* renamed from: l */
    private C1410e f9883l;
    @Nullable
    /* renamed from: m */
    private View f9884m;
    /* renamed from: n */
    private final List<View> f9885n;
    /* renamed from: o */
    private OnTouchListener f9886o;
    /* renamed from: p */
    private C1517a f9887p;
    /* renamed from: q */
    private final ai f9888q;
    @Nullable
    /* renamed from: r */
    private C3275x f9889r;
    /* renamed from: s */
    private C1338a f9890s;
    /* renamed from: t */
    private C1339b f9891t;
    /* renamed from: u */
    private aa f9892u;
    /* renamed from: v */
    private Type f9893v;
    /* renamed from: w */
    private boolean f9894w;
    /* renamed from: x */
    private MediaView f9895x;
    @Deprecated
    /* renamed from: y */
    private boolean f9896y;
    /* renamed from: z */
    private long f9897z;

    public static class Image {
        /* renamed from: a */
        private final String f3557a;
        /* renamed from: b */
        private final int f3558b;
        /* renamed from: c */
        private final int f3559c;

        public Image(String str, int i, int i2) {
            this.f3557a = str;
            this.f3558b = i;
            this.f3559c = i2;
        }

        public static Image fromJSONObject(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("url");
            return optString == null ? null : new Image(optString, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
        }

        public int getHeight() {
            return this.f3559c;
        }

        public String getUrl() {
            return this.f3557a;
        }

        public int getWidth() {
            return this.f3558b;
        }
    }

    public enum MediaCacheFlag {
        NONE(0),
        ICON(1),
        IMAGE(2),
        VIDEO(3);
        
        public static final EnumSet<MediaCacheFlag> ALL = null;
        /* renamed from: a */
        private final long f3561a;

        static {
            ALL = EnumSet.allOf(MediaCacheFlag.class);
        }

        private MediaCacheFlag(long j) {
            this.f3561a = j;
        }

        public long getCacheFlagValue() {
            return this.f3561a;
        }
    }

    public static class Rating {
        /* renamed from: a */
        private final double f3562a;
        /* renamed from: b */
        private final double f3563b;

        public Rating(double d, double d2) {
            this.f3562a = d;
            this.f3563b = d2;
        }

        public static Rating fromJSONObject(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            double optDouble = jSONObject.optDouble("value", 0.0d);
            double optDouble2 = jSONObject.optDouble("scale", 0.0d);
            return (optDouble == 0.0d || optDouble2 == 0.0d) ? null : new Rating(optDouble, optDouble2);
        }

        public double getScale() {
            return this.f3563b;
        }

        public double getValue() {
            return this.f3562a;
        }
    }

    /* renamed from: com.facebook.ads.NativeAd$a */
    private class C1338a implements OnClickListener, OnLongClickListener, OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ NativeAd f3564a;

        private C1338a(NativeAd nativeAd) {
            this.f3564a = nativeAd;
        }

        public void onClick(android.view.View r5) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0047 in {2, 9, 11, 12, 16, 19, 21} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
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
            r4 = this;
            r5 = r4.f3564a;
            r5 = r5.f9888q;
            r5 = r5.m5187d();
            if (r5 != 0) goto L_0x0013;
        L_0x000c:
            r5 = "FBAudienceNetworkLog";
            r0 = "No touch data recorded, please ensure touch events reach the ad View by returning false if you intercept the event.";
            android.util.Log.e(r5, r0);
        L_0x0013:
            r5 = r4.f3564a;
            r5 = r5.f9876e;
            r5 = com.facebook.ads.internal.C1418g.m4941l(r5);
            if (r5 < 0) goto L_0x0048;
        L_0x001f:
            r0 = r4.f3564a;
            r0 = r0.f9888q;
            r0 = r0.m5186c();
            r2 = (long) r5;
            r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
            if (r5 >= 0) goto L_0x0048;
        L_0x002e:
            r5 = r4.f3564a;
            r5 = r5.f9888q;
            r5 = r5.m5185b();
            if (r5 != 0) goto L_0x0042;
        L_0x003a:
            r5 = "FBAudienceNetworkLog";
            r0 = "Ad cannot be clicked before it is viewed.";
        L_0x003e:
            android.util.Log.e(r5, r0);
            return;
        L_0x0042:
            r5 = "FBAudienceNetworkLog";
            r0 = "Clicks happened too fast.";
            goto L_0x003e;
            return;
        L_0x0048:
            r5 = new java.util.HashMap;
            r5.<init>();
            r0 = "touch";
            r1 = r4.f3564a;
            r1 = r1.f9888q;
            r1 = r1.m5188e();
            r1 = com.facebook.ads.internal.p047k.C1490h.m5244a(r1);
            r5.put(r0, r1);
            r0 = r4.f3564a;
            r0 = r0.f9893v;
            if (r0 == 0) goto L_0x007b;
        L_0x0068:
            r0 = "nti";
            r1 = r4.f3564a;
            r1 = r1.f9893v;
            r1 = r1.getValue();
            r1 = java.lang.String.valueOf(r1);
            r5.put(r0, r1);
        L_0x007b:
            r0 = r4.f3564a;
            r0 = r0.f9894w;
            if (r0 == 0) goto L_0x0092;
        L_0x0083:
            r0 = "nhs";
            r1 = r4.f3564a;
            r1 = r1.f9894w;
            r1 = java.lang.String.valueOf(r1);
            r5.put(r0, r1);
        L_0x0092:
            r0 = r4.f3564a;
            r0 = r0.f9887p;
            r0.m5350a(r5);
            r0 = r4.f3564a;
            r0 = r0.f9875a;
            r0.mo3301b(r5);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.NativeAd.a.onClick(android.view.View):void");
        }

        public boolean onLongClick(View view) {
            if (this.f3564a.f9884m == null || this.f3564a.f9871A == null) {
                return false;
            }
            this.f3564a.f9871A.setBounds(0, 0, this.f3564a.f9884m.getWidth(), this.f3564a.f9884m.getHeight());
            this.f3564a.f9871A.m4884a(this.f3564a.f9871A.m4885a() ^ true);
            return true;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.f3564a.f9888q.m5184a(motionEvent, this.f3564a.f9884m, view);
            return this.f3564a.f9886o != null && this.f3564a.f9886o.onTouch(view, motionEvent);
        }
    }

    /* renamed from: com.facebook.ads.NativeAd$b */
    private class C1339b extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ NativeAd f3565a;
        /* renamed from: b */
        private boolean f3566b;

        private C1339b(NativeAd nativeAd) {
            this.f3565a = nativeAd;
        }

        /* renamed from: a */
        public void m4679a() {
            IntentFilter intentFilter = new IntentFilter();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com.facebook.ads.native.impression:");
            stringBuilder.append(this.f3565a.f9878g);
            intentFilter.addAction(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("com.facebook.ads.native.click:");
            stringBuilder.append(this.f3565a.f9878g);
            intentFilter.addAction(stringBuilder.toString());
            C0436c.m1648a(this.f3565a.f9876e).m1652a(this, intentFilter);
            this.f3566b = true;
        }

        /* renamed from: b */
        public void m4680b() {
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
            r1 = this;
            r0 = r1.f3566b;
            if (r0 != 0) goto L_0x0005;
        L_0x0004:
            return;
        L_0x0005:
            r0 = r1.f3565a;	 Catch:{ Exception -> 0x0012 }
            r0 = r0.f9876e;	 Catch:{ Exception -> 0x0012 }
            r0 = android.support.v4.content.C0436c.m1648a(r0);	 Catch:{ Exception -> 0x0012 }
            r0.m1651a(r1);	 Catch:{ Exception -> 0x0012 }
        L_0x0012:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.NativeAd.b.b():void");
        }

        public void onReceive(Context context, Intent intent) {
            Object obj = intent.getAction().split(":")[0];
            if (!"com.facebook.ads.native.impression".equals(obj) || this.f3565a.f9889r == null) {
                if ("com.facebook.ads.native.click".equals(obj) && this.f3565a.f9875a != null) {
                    Map hashMap = new HashMap();
                    hashMap.put("mil", String.valueOf(true));
                    this.f3565a.f9875a.mo3301b(hashMap);
                }
                return;
            }
            this.f3565a.f9889r.m4716a();
        }
    }

    /* renamed from: com.facebook.ads.NativeAd$2 */
    class C32342 implements C1624z {
        /* renamed from: a */
        final /* synthetic */ NativeAd f9864a;

        C32342(NativeAd nativeAd) {
            this.f9864a = nativeAd;
        }

        /* renamed from: a */
        public void mo1680a(int i) {
            if (this.f9864a.f9875a != null) {
                this.f9864a.f9875a.mo3296a(i);
            }
        }
    }

    /* renamed from: com.facebook.ads.NativeAd$3 */
    class C32353 extends C1516a {
        /* renamed from: a */
        final /* synthetic */ NativeAd f9865a;

        C32353(NativeAd nativeAd) {
            this.f9865a = nativeAd;
        }

        /* renamed from: a */
        public void mo1681a() {
            this.f9865a.f9888q.m5183a();
            this.f9865a.f9887p.m5351b();
            if (this.f9865a.f9889r == null) {
                if (this.f9865a.f9887p != null) {
                    this.f9865a.f9887p.m5351b();
                    this.f9865a.f9887p = null;
                }
                return;
            }
            this.f9865a.f9889r.m12591a(this.f9865a.f9884m);
            this.f9865a.f9889r.m12592a(this.f9865a.f9893v);
            this.f9865a.f9889r.m12595a(this.f9865a.f9894w);
            this.f9865a.f9889r.m12596b(this.f9865a.f9895x != null);
            this.f9865a.f9889r.m12597c(this.f9865a.m12386k());
            this.f9865a.f9889r.m4716a();
        }
    }

    /* renamed from: com.facebook.ads.NativeAd$4 */
    class C32364 extends C1352b {
        /* renamed from: a */
        final /* synthetic */ NativeAd f9866a;

        C32364(NativeAd nativeAd) {
            this.f9866a = nativeAd;
        }

        /* renamed from: a */
        public boolean mo1682a() {
            return true;
        }
    }

    /* renamed from: com.facebook.ads.NativeAd$c */
    private class C3237c extends C1352b {
        /* renamed from: b */
        final /* synthetic */ NativeAd f9867b;

        private C3237c(NativeAd nativeAd) {
            this.f9867b = nativeAd;
        }

        /* renamed from: a */
        public boolean mo1682a() {
            return false;
        }

        /* renamed from: d */
        public void mo1683d() {
            if (this.f9867b.f9880i != null) {
                this.f9867b.f9880i.onLoggingImpression(this.f9867b);
            }
        }

        /* renamed from: e */
        public void mo1684e() {
        }
    }

    /* renamed from: com.facebook.ads.NativeAd$5 */
    class C41405 extends C3237c {
        /* renamed from: a */
        final /* synthetic */ NativeAd f13132a;

        C41405(NativeAd nativeAd) {
            this.f13132a = nativeAd;
            super();
        }

        /* renamed from: b */
        public boolean mo3287b() {
            return true;
        }

        /* renamed from: c */
        public String mo3288c() {
            return this.f13132a.f9873C;
        }
    }

    public NativeAd(Context context, C3276y c3276y, C1410e c1410e) {
        this(context, null);
        this.f9883l = c1410e;
        this.f9882k = true;
        this.f9875a = c3276y;
        this.f9872B = new View(context);
    }

    public NativeAd(Context context, String str) {
        this.f9878g = UUID.randomUUID().toString();
        this.f9885n = new ArrayList();
        this.f9888q = new ai();
        this.f9874D = false;
        this.f9876e = context;
        this.f9877f = str;
        this.f9879h = new C1380b(context);
        this.f9872B = new View(context);
    }

    NativeAd(NativeAd nativeAd) {
        this(nativeAd.f9876e, null);
        this.f9883l = nativeAd.f9883l;
        this.f9882k = true;
        this.f9875a = nativeAd.f9875a;
        this.f9872B = new View(this.f9876e);
    }

    /* renamed from: a */
    private void m12370a(View view) {
        this.f9885n.add(view);
        view.setOnClickListener(this.f9890s);
        view.setOnTouchListener(this.f9890s);
        if (C1418g.m4931b(view.getContext())) {
            view.setOnLongClickListener(this.f9890s);
        }
    }

    /* renamed from: a */
    private void m12371a(final EnumSet<MediaCacheFlag> enumSet, String str) {
        if (this.f9882k) {
            throw new IllegalStateException("loadAd cannot be called more than once");
        }
        this.f9897z = System.currentTimeMillis();
        this.f9882k = true;
        this.f9881j = new DisplayAdController(this.f9876e, this.f9877f, C1522c.NATIVE_UNKNOWN, AdPlacementType.NATIVE, null, f9868b, 1, true);
        this.f9881j.m12491a(new C1350a(this) {
            /* renamed from: b */
            final /* synthetic */ NativeAd f9863b;

            /* renamed from: com.facebook.ads.NativeAd$1$2 */
            class C32322 implements C1369z {
                /* renamed from: a */
                final /* synthetic */ C32331 f9861a;

                C32322(C32331 c32331) {
                    this.f9861a = c32331;
                }

                /* renamed from: a */
                public void mo1675a(C3276y c3276y) {
                }

                /* renamed from: a */
                public void mo1676a(C3276y c3276y, AdError adError) {
                }

                /* renamed from: b */
                public void mo1677b(C3276y c3276y) {
                }

                /* renamed from: c */
                public void mo1678c(C3276y c3276y) {
                    if (this.f9861a.f9863b.f9880i != null) {
                        this.f9861a.f9863b.f9880i.onAdClicked(this.f9861a.f9863b);
                    }
                }
            }

            /* renamed from: a */
            public void mo1636a() {
                if (this.f9863b.f9880i != null) {
                    this.f9863b.f9880i.onAdClicked(this.f9863b);
                }
            }

            /* renamed from: a */
            public void mo1638a(AdAdapter adAdapter) {
                if (this.f9863b.f9881j != null) {
                    this.f9863b.f9881j.m12496b();
                }
            }

            /* renamed from: a */
            public void mo1679a(final C3276y c3276y) {
                C1482c.m5218a(C1481b.m5214a(C1480b.LOADING_AD, AdPlacementType.NATIVE, System.currentTimeMillis() - this.f9863b.f9897z, null));
                if (c3276y != null) {
                    if (enumSet.contains(MediaCacheFlag.ICON) && c3276y.mo3311k() != null) {
                        this.f9863b.f9879h.m4807a(c3276y.mo3311k().getUrl());
                    }
                    if (enumSet.contains(MediaCacheFlag.IMAGE)) {
                        if (c3276y.mo3312l() != null) {
                            this.f9863b.f9879h.m4807a(c3276y.mo3312l().getUrl());
                        }
                        if (c3276y.mo3289A() != null) {
                            for (NativeAd nativeAd : c3276y.mo3289A()) {
                                if (nativeAd.getAdCoverImage() != null) {
                                    this.f9863b.f9879h.m4807a(nativeAd.getAdCoverImage().getUrl());
                                }
                            }
                        }
                    }
                    if (enumSet.contains(MediaCacheFlag.VIDEO) && !TextUtils.isEmpty(c3276y.mo3324w())) {
                        this.f9863b.f9879h.m4808b(c3276y.mo3324w());
                    }
                    this.f9863b.f9879h.m4806a(new C1374a(this) {
                        /* renamed from: b */
                        final /* synthetic */ C32331 f9860b;

                        /* renamed from: c */
                        private void m12350c() {
                            this.f9860b.f9863b.f9875a = c3276y;
                            this.f9860b.f9863b.m12390m();
                            this.f9860b.f9863b.m12391n();
                            if (this.f9860b.f9863b.f9880i != null) {
                                this.f9860b.f9863b.f9880i.onAdLoaded(this.f9860b.f9863b);
                            }
                        }

                        /* renamed from: a */
                        public void mo1673a() {
                            m12350c();
                        }

                        /* renamed from: b */
                        public void mo1674b() {
                            m12350c();
                        }
                    });
                    if (!(this.f9863b.f9880i == null || c3276y.mo3289A() == null)) {
                        C1369z c32322 = new C32322(this);
                        for (NativeAd nativeAd2 : c3276y.mo3289A()) {
                            nativeAd2.m12401a(c32322);
                        }
                    }
                }
            }

            /* renamed from: a */
            public void mo1639a(C1373b c1373b) {
                if (this.f9863b.f9880i != null) {
                    this.f9863b.f9880i.onError(this.f9863b, c1373b.m4796b());
                }
            }

            /* renamed from: b */
            public void mo1640b() {
                throw new IllegalStateException("Native ads manager their own impressions.");
            }
        });
        this.f9881j.m12494a(str);
    }

    /* renamed from: a */
    private void m12372a(List<View> list, View view) {
        if (!(view instanceof MediaViewVideoRenderer) && !(view instanceof AdChoicesView) && !(view instanceof C4443b)) {
            list.add(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m12372a((List) list, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public static void downloadAndDisplayImage(Image image, ImageView imageView) {
        if (image != null && imageView != null) {
            new C1505r(imageView).m5301a(image.getUrl());
        }
    }

    private int getMinViewabilityPercentage() {
        C1410e c1410e;
        if (this.f9883l != null) {
            c1410e = this.f9883l;
        } else if (this.f9881j == null || this.f9881j.m12489a() == null) {
            return 1;
        } else {
            c1410e = this.f9881j.m12489a();
        }
        return c1410e.m4906f();
    }

    /* renamed from: h */
    private int m12379h() {
        C1410e c1410e;
        if (this.f9883l != null) {
            c1410e = this.f9883l;
        } else if (this.f9881j == null || this.f9881j.m12489a() == null) {
            return 0;
        } else {
            c1410e = this.f9881j.m12489a();
        }
        return c1410e.m4907g();
    }

    /* renamed from: i */
    private int m12381i() {
        return this.f9883l != null ? this.f9883l.m4908h() : this.f9875a != null ? this.f9875a.mo3309i() : (this.f9881j == null || this.f9881j.m12489a() == null) ? 0 : this.f9881j.m12489a().m4908h();
    }

    /* renamed from: j */
    private int m12383j() {
        return this.f9883l != null ? this.f9883l.m4909i() : this.f9875a != null ? this.f9875a.mo3310j() : (this.f9881j == null || this.f9881j.m12489a() == null) ? AdError.NETWORK_ERROR_CODE : this.f9881j.m12489a().m4909i();
    }

    /* renamed from: k */
    private boolean m12386k() {
        return m12406e() == VideoAutoplayBehavior.DEFAULT ? this.f9896y : m12406e() == VideoAutoplayBehavior.ON;
    }

    /* renamed from: l */
    private void m12387l() {
        for (View view : this.f9885n) {
            view.setOnClickListener(null);
            view.setOnTouchListener(null);
            view.setOnLongClickListener(null);
        }
        this.f9885n.clear();
    }

    private void logExternalClick(String str) {
        if (this.f9875a != null) {
            Map hashMap = new HashMap();
            hashMap.put("eil", String.valueOf(true));
            hashMap.put("eil_source", str);
            this.f9875a.mo3301b(hashMap);
        }
    }

    private void logExternalImpression() {
        if (this.f9889r != null) {
            this.f9889r.m4716a();
        }
    }

    /* renamed from: m */
    private void m12390m() {
        if (this.f9875a != null && this.f9875a.mo3303c()) {
            this.f9891t = new C1339b();
            this.f9891t.m4679a();
            this.f9889r = new C3275x(this.f9876e, new C32364(this), this.f9887p, this.f9875a);
        }
    }

    /* renamed from: n */
    private void m12391n() {
        if (this.f9874D) {
            this.f9889r = new C3275x(this.f9876e, new C41405(this), this.f9887p, this.f9875a);
        }
    }

    private void registerExternalLogReceiver(String str) {
        this.f9874D = true;
        this.f9873C = str;
    }

    /* renamed from: a */
    C3276y m12398a() {
        return this.f9875a;
    }

    /* renamed from: a */
    void m12399a(MediaView mediaView) {
        this.f9895x = mediaView;
    }

    /* renamed from: a */
    void m12400a(Type type) {
        this.f9893v = type;
    }

    /* renamed from: a */
    protected void m12401a(C1369z c1369z) {
        this.f9875a.mo3299a(c1369z);
    }

    /* renamed from: a */
    void m12402a(boolean z) {
        this.f9894w = z;
    }

    /* renamed from: b */
    String m12403b() {
        if (isAdLoaded()) {
            if (!TextUtils.isEmpty(this.f9875a.mo3324w())) {
                return this.f9879h.m4809c(this.f9875a.mo3324w());
            }
        }
        return null;
    }

    /* renamed from: c */
    String m12404c() {
        return !isAdLoaded() ? null : this.f9875a.mo3325x();
    }

    /* renamed from: d */
    String m12405d() {
        return !isAdLoaded() ? null : this.f9875a.mo3327z();
    }

    public void destroy() {
        if (this.f9891t != null) {
            this.f9891t.m4680b();
            this.f9891t = null;
        }
        if (this.f9881j != null) {
            this.f9881j.m12498b(true);
            this.f9881j = null;
        }
        if (this.f9895x != null) {
            this.f9895x.destroy();
            this.f9895x = null;
        }
    }

    /* renamed from: e */
    VideoAutoplayBehavior m12406e() {
        return !isAdLoaded() ? VideoAutoplayBehavior.DEFAULT : this.f9875a.mo3326y();
    }

    /* renamed from: f */
    List<NativeAd> m12407f() {
        return !isAdLoaded() ? null : this.f9875a.mo3289A();
    }

    @Nullable
    /* renamed from: g */
    String m12408g() {
        return !isAdLoaded() ? null : this.f9875a.mo3292D();
    }

    public String getAdBody() {
        return !isAdLoaded() ? null : this.f9875a.mo3317p();
    }

    public String getAdCallToAction() {
        return !isAdLoaded() ? null : this.f9875a.mo3318q();
    }

    public Image getAdChoicesIcon() {
        return !isAdLoaded() ? null : this.f9875a.mo3321t();
    }

    public String getAdChoicesLinkUrl() {
        return !isAdLoaded() ? null : this.f9875a.mo3322u();
    }

    public String getAdChoicesText() {
        return !isAdLoaded() ? null : this.f9875a.mo3323v();
    }

    public Image getAdCoverImage() {
        return !isAdLoaded() ? null : this.f9875a.mo3312l();
    }

    public Image getAdIcon() {
        return !isAdLoaded() ? null : this.f9875a.mo3311k();
    }

    @Nullable
    public AdNetwork getAdNetwork() {
        return (!isAdLoaded() || this.f9875a == null) ? null : this.f9875a.mo3293E();
    }

    public String getAdRawBody() {
        return !isAdLoaded() ? null : this.f9875a.mo3333H();
    }

    public String getAdSocialContext() {
        return !isAdLoaded() ? null : this.f9875a.mo3319r();
    }

    @Deprecated
    public Rating getAdStarRating() {
        return !isAdLoaded() ? null : this.f9875a.mo3320s();
    }

    public String getAdSubtitle() {
        return !isAdLoaded() ? null : this.f9875a.mo3315o();
    }

    public String getAdTitle() {
        return !isAdLoaded() ? null : this.f9875a.mo3314n();
    }

    public NativeAdViewAttributes getAdViewAttributes() {
        return !isAdLoaded() ? null : this.f9875a.mo3313m();
    }

    public String getId() {
        return !isAdLoaded() ? null : this.f9878g;
    }

    public String getPlacementId() {
        return this.f9877f;
    }

    public boolean isAdLoaded() {
        return this.f9875a != null && this.f9875a.mo3302b();
    }

    public boolean isNativeConfigEnabled() {
        return isAdLoaded() && this.f9875a.mo3306f();
    }

    public void loadAd() {
        loadAd(EnumSet.of(MediaCacheFlag.NONE));
    }

    public void loadAd(EnumSet<MediaCacheFlag> enumSet) {
        m12371a((EnumSet) enumSet, null);
    }

    public void loadAdFromBid(String str) {
        loadAdFromBid(str, EnumSet.of(MediaCacheFlag.NONE));
    }

    public void loadAdFromBid(String str, EnumSet<MediaCacheFlag> enumSet) {
        m12371a((EnumSet) enumSet, str);
    }

    public void onCtaBroadcast() {
        this.f9872B.performClick();
    }

    public void registerViewForInteraction(View view) {
        List arrayList = new ArrayList();
        m12372a(arrayList, view);
        registerViewForInteraction(view, arrayList);
    }

    public void registerViewForInteraction(View view, List<View> list) {
        if (view == null) {
            throw new IllegalArgumentException("Must provide a View");
        }
        if (list != null) {
            if (list.size() != 0) {
                if (isAdLoaded()) {
                    if (this.f9884m != null) {
                        Log.w(f9869c, "Native Ad was already registered with a View. Auto unregistering and proceeding.");
                        unregisterView();
                    }
                    if (f9870d.containsKey(view)) {
                        Log.w(f9869c, "View already registered with a NativeAd. Auto unregistering and proceeding.");
                        ((NativeAd) ((WeakReference) f9870d.get(view)).get()).unregisterView();
                    }
                    this.f9890s = new C1338a();
                    this.f9884m = view;
                    if (view instanceof ViewGroup) {
                        this.f9892u = new aa(view.getContext(), new C32342(this));
                        ((ViewGroup) view).addView(this.f9892u);
                    }
                    List<View> arrayList = new ArrayList(list);
                    if (this.f9872B != null) {
                        arrayList.add(this.f9872B);
                    }
                    for (View a : arrayList) {
                        m12370a(a);
                    }
                    this.f9875a.mo3298a(view, arrayList);
                    this.f9887p = new C1517a(this.f9884m, getMinViewabilityPercentage(), m12379h(), true, new C32353(this));
                    this.f9887p.m5349a(m12381i());
                    this.f9887p.m5352b(m12383j());
                    this.f9887p.m5348a();
                    this.f9889r = new C3275x(this.f9876e, new C3237c(), this.f9887p, this.f9875a);
                    this.f9889r.m12593a((List) arrayList);
                    f9870d.put(view, new WeakReference(this));
                    if (C1418g.m4931b(this.f9876e)) {
                        C1404f c1404f;
                        C1410e c1410e;
                        this.f9871A = new C1404f();
                        this.f9871A.m4883a(this.f9877f);
                        this.f9871A.m4887b(this.f9876e.getPackageName());
                        this.f9871A.m4882a(this.f9887p);
                        if (this.f9875a.mo3291C() > 0) {
                            this.f9871A.m4880a(this.f9875a.mo3291C(), this.f9875a.mo3290B());
                        }
                        if (this.f9883l != null) {
                            c1404f = this.f9871A;
                            c1410e = this.f9883l;
                        } else {
                            if (!(this.f9881j == null || this.f9881j.m12489a() == null)) {
                                c1404f = this.f9871A;
                                c1410e = this.f9881j.m12489a();
                            }
                            this.f9884m.getOverlay().add(this.f9871A);
                        }
                        c1404f.m4881a(c1410e.m4901a());
                        this.f9884m.getOverlay().add(this.f9871A);
                    }
                    return;
                }
                Log.e(f9869c, "Ad not loaded");
                return;
            }
        }
        throw new IllegalArgumentException("Invalid set of clickable views");
    }

    public void setAdListener(AdListener adListener) {
        this.f9880i = adListener;
    }

    @Deprecated
    public void setMediaViewAutoplay(boolean z) {
        this.f9896y = z;
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f9886o = onTouchListener;
    }

    public void unregisterView() {
        if (this.f9884m != null) {
            if (f9870d.containsKey(this.f9884m)) {
                if (((WeakReference) f9870d.get(this.f9884m)).get() == this) {
                    if ((this.f9884m instanceof ViewGroup) && this.f9892u != null) {
                        ((ViewGroup) this.f9884m).removeView(this.f9892u);
                        this.f9892u = null;
                    }
                    if (this.f9875a != null) {
                        this.f9875a.mo3295a();
                    }
                    if (this.f9871A != null && C1418g.m4931b(this.f9876e)) {
                        this.f9871A.m4886b();
                        this.f9884m.getOverlay().remove(this.f9871A);
                    }
                    f9870d.remove(this.f9884m);
                    m12387l();
                    this.f9884m = null;
                    if (this.f9887p != null) {
                        this.f9887p.m5351b();
                        this.f9887p = null;
                    }
                    this.f9889r = null;
                    return;
                }
            }
            throw new IllegalStateException("View not registered with this NativeAd");
        }
    }
}
