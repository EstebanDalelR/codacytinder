package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.C0436c;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.view.C4202p;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3333f;
import com.facebook.ads.internal.view.p052c.p080a.C3334g;
import com.facebook.ads.internal.view.p052c.p080a.C3335h;
import com.facebook.ads.internal.view.p052c.p080a.C3337j;
import com.facebook.ads.internal.view.p052c.p080a.C3343p;
import java.io.Serializable;

public class ad extends BroadcastReceiver {
    /* renamed from: a */
    private Context f3627a;
    /* renamed from: b */
    private C4202p f3628b;
    /* renamed from: c */
    private boolean f3629c = false;

    public ad(C4202p c4202p, Context context) {
        this.f3628b = c4202p;
        this.f3627a = context;
    }

    /* renamed from: a */
    public void m4727a() {
        IntentFilter intentFilter = new IntentFilter();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.facebook.ads.interstitial.displayed:");
        stringBuilder.append(this.f3628b.getUniqueId());
        intentFilter.addAction(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("videoInterstitalEvent:");
        stringBuilder.append(this.f3628b.getUniqueId());
        intentFilter.addAction(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("performCtaClick:");
        stringBuilder.append(this.f3628b.getUniqueId());
        intentFilter.addAction(stringBuilder.toString());
        C0436c.m1648a(this.f3627a).m1652a(this, intentFilter);
    }

    /* renamed from: b */
    public void m4728b() {
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
        r0 = r1.f3627a;	 Catch:{ Exception -> 0x0009 }
        r0 = android.support.v4.content.C0436c.m1648a(r0);	 Catch:{ Exception -> 0x0009 }
        r0.m1651a(r1);	 Catch:{ Exception -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.ad.b():void");
    }

    public void onReceive(Context context, Intent intent) {
        String[] split = intent.getAction().split(":");
        if (split.length == 2 && split[1].equals(this.f3628b.getUniqueId())) {
            if (split[0].equals("com.facebook.ads.interstitial.displayed")) {
                if (this.f3628b.getListener() != null) {
                    this.f3628b.getListener().mo1671g();
                    this.f3628b.getListener().mo1665a();
                }
            } else if (split[0].equals("videoInterstitalEvent")) {
                Serializable serializableExtra = intent.getSerializableExtra("event");
                if (serializableExtra instanceof C3343p) {
                    if (this.f3628b.getListener() != null) {
                        this.f3628b.getListener().mo1670f();
                        this.f3628b.getListener().mo1665a();
                    }
                    if (this.f3629c) {
                        this.f3628b.m13053a(1);
                    } else {
                        this.f3628b.m13053a(((C3343p) serializableExtra).m12876b());
                    }
                    this.f3628b.setVisibility(0);
                    this.f3628b.m13055a(VideoStartReason.USER_STARTED);
                } else if (serializableExtra instanceof C3333f) {
                    if (this.f3628b.getListener() != null) {
                        this.f3628b.getListener().mo1668d();
                    }
                } else if (serializableExtra instanceof C3334g) {
                    if (this.f3628b.getListener() != null) {
                        this.f3628b.getListener().mo1669e();
                    }
                } else if (serializableExtra instanceof C3329b) {
                    if (this.f3628b.getListener() != null) {
                        this.f3628b.getListener().mo1672h();
                    }
                    this.f3629c = true;
                } else if (serializableExtra instanceof C3337j) {
                    if (this.f3628b.getListener() != null) {
                        this.f3628b.getListener().mo1667c();
                    }
                    this.f3629c = false;
                } else if ((serializableExtra instanceof C3335h) && this.f3628b.getListener() != null) {
                    this.f3628b.getListener().mo1666b();
                }
            } else if (split[0].equals("performCtaClick")) {
                this.f3628b.m16649d();
            }
        }
    }
}
