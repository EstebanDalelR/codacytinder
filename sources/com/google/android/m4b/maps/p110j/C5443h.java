package com.google.android.m4b.maps.p110j;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;

/* renamed from: com.google.android.m4b.maps.j.h */
public final class C5443h implements OnClickListener {
    /* renamed from: a */
    private final Activity f20413a;
    /* renamed from: b */
    private final Fragment f20414b;
    /* renamed from: c */
    private final Intent f20415c;
    /* renamed from: d */
    private final int f20416d;

    public C5443h(Activity activity, Intent intent, int i) {
        this.f20413a = activity;
        this.f20414b = null;
        this.f20415c = intent;
        this.f20416d = i;
    }

    public C5443h(Fragment fragment, Intent intent, int i) {
        this.f20413a = null;
        this.f20414b = fragment;
        this.f20415c = intent;
        this.f20416d = i;
    }

    public final void onClick(android.content.DialogInterface r3, int r4) {
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
        r4 = r2.f20415c;	 Catch:{ ActivityNotFoundException -> 0x0023 }
        if (r4 == 0) goto L_0x0012;	 Catch:{ ActivityNotFoundException -> 0x0023 }
    L_0x0004:
        r4 = r2.f20414b;	 Catch:{ ActivityNotFoundException -> 0x0023 }
        if (r4 == 0) goto L_0x0012;	 Catch:{ ActivityNotFoundException -> 0x0023 }
    L_0x0008:
        r4 = r2.f20414b;	 Catch:{ ActivityNotFoundException -> 0x0023 }
        r0 = r2.f20415c;	 Catch:{ ActivityNotFoundException -> 0x0023 }
        r1 = r2.f20416d;	 Catch:{ ActivityNotFoundException -> 0x0023 }
        r4.startActivityForResult(r0, r1);	 Catch:{ ActivityNotFoundException -> 0x0023 }
        goto L_0x001f;	 Catch:{ ActivityNotFoundException -> 0x0023 }
    L_0x0012:
        r4 = r2.f20415c;	 Catch:{ ActivityNotFoundException -> 0x0023 }
        if (r4 == 0) goto L_0x001f;	 Catch:{ ActivityNotFoundException -> 0x0023 }
    L_0x0016:
        r4 = r2.f20413a;	 Catch:{ ActivityNotFoundException -> 0x0023 }
        r0 = r2.f20415c;	 Catch:{ ActivityNotFoundException -> 0x0023 }
        r1 = r2.f20416d;	 Catch:{ ActivityNotFoundException -> 0x0023 }
        r4.startActivityForResult(r0, r1);	 Catch:{ ActivityNotFoundException -> 0x0023 }
    L_0x001f:
        r3.dismiss();	 Catch:{ ActivityNotFoundException -> 0x0023 }
        return;
    L_0x0023:
        r3 = "SettingsRedirect";
        r4 = "Can't redirect to app settings for Google Play services";
        android.util.Log.e(r3, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.j.h.onClick(android.content.DialogInterface, int):void");
    }
}
