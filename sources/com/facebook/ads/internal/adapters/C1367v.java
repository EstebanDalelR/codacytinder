package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.C0436c;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.internal.adapters.v */
public class C1367v extends BroadcastReceiver {
    /* renamed from: a */
    private String f3701a;
    /* renamed from: b */
    private Context f3702b;
    /* renamed from: c */
    private InterstitialAdapterListener f3703c;
    /* renamed from: d */
    private InterstitialAdapter f3704d;

    public C1367v(Context context, String str, InterstitialAdapter interstitialAdapter, InterstitialAdapterListener interstitialAdapterListener) {
        this.f3702b = context;
        this.f3701a = str;
        this.f3703c = interstitialAdapterListener;
        this.f3704d = interstitialAdapter;
    }

    /* renamed from: a */
    public void m4772a() {
        IntentFilter intentFilter = new IntentFilter();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.facebook.ads.interstitial.impression.logged:");
        stringBuilder.append(this.f3701a);
        intentFilter.addAction(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("com.facebook.ads.interstitial.displayed:");
        stringBuilder.append(this.f3701a);
        intentFilter.addAction(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("com.facebook.ads.interstitial.dismissed:");
        stringBuilder.append(this.f3701a);
        intentFilter.addAction(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("com.facebook.ads.interstitial.clicked:");
        stringBuilder.append(this.f3701a);
        intentFilter.addAction(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("com.facebook.ads.interstitial.error:");
        stringBuilder.append(this.f3701a);
        intentFilter.addAction(stringBuilder.toString());
        C0436c.m1648a(this.f3702b).m1652a(this, intentFilter);
    }

    /* renamed from: b */
    public void m4773b() {
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
        r1 = this;
        r0 = r1.f3702b;	 Catch:{ Exception -> 0x0009 }
        r0 = android.support.v4.content.C0436c.m1648a(r0);	 Catch:{ Exception -> 0x0009 }
        r0.m1651a(r1);	 Catch:{ Exception -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.v.b():void");
    }

    public void onReceive(Context context, Intent intent) {
        Object obj = intent.getAction().split(":")[0];
        if (this.f3703c != null && obj != null) {
            if ("com.facebook.ads.interstitial.clicked".equals(obj)) {
                this.f3703c.onInterstitialAdClicked(this.f3704d, null, true);
            } else if ("com.facebook.ads.interstitial.dismissed".equals(obj)) {
                this.f3703c.onInterstitialAdDismissed(this.f3704d);
            } else if ("com.facebook.ads.interstitial.displayed".equals(obj)) {
                this.f3703c.onInterstitialAdDisplayed(this.f3704d);
            } else if ("com.facebook.ads.interstitial.impression.logged".equals(obj)) {
                this.f3703c.onInterstitialLoggingImpression(this.f3704d);
            } else {
                if ("com.facebook.ads.interstitial.error".equals(obj)) {
                    this.f3703c.onInterstitialError(this.f3704d, AdError.INTERNAL_ERROR);
                }
            }
        }
    }
}
