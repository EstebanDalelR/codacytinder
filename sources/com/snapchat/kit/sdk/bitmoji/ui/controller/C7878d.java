package com.snapchat.kit.sdk.bitmoji.ui.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.ViewStub.OnInflateListener;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5882c;
import com.snapchat.kit.sdk.bitmoji.dagger.scope.FragmentScope;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5885a;
import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerView;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import javax.inject.Inject;
import javax.inject.Named;

@FragmentScope
/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.d */
public class C7878d implements OnInflateListener, FullScreenViewController {
    /* renamed from: a */
    private final Context f28425a;
    /* renamed from: b */
    private final C5927a f28426b;
    /* renamed from: c */
    private final C5885a f28427c;
    /* renamed from: d */
    private final MetricQueue<ServerEvent> f28428d;
    /* renamed from: e */
    private final String f28429e;

    /* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.d$1 */
    class C59191 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C7878d f21668a;

        C59191(C7878d c7878d) {
            this.f21668a = c7878d;
        }

        public void onClick(View view) {
            this.f21668a.f28428d.push(this.f21668a.f28427c.m25400a());
            this.f21668a.m33702a(this.f21668a.f28425a);
        }
    }

    @Inject
    C7878d(Context context, @Named("create_avatar") C5927a c5927a, C5885a c5885a, MetricQueue<ServerEvent> metricQueue, @Named("client_id") String str) {
        this.f28425a = context;
        this.f28426b = c5927a;
        this.f28427c = c5885a;
        this.f28428d = metricQueue;
        this.f28429e = str;
        this.f28426b.m25524a((OnInflateListener) this);
    }

    public void onInflate(ViewStub viewStub, View view) {
        view.findViewById(C5882c.snap_connect_bitmoji_create_avatar_button).setOnClickListener(new C59191(this));
    }

    /* renamed from: a */
    public void m33708a() {
        this.f28426b.m25523a(0);
    }

    public void hide() {
        this.f28426b.m25523a(8);
    }

    @NonNull
    public BitmojiKitStickerPickerView getViewType() {
        return BitmojiKitStickerPickerView.CREATE_AVATAR;
    }

    /* renamed from: a */
    private void m33702a(android.content.Context r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = com.snapchat.kit.sdk.bitmoji.ui.controller.C7878d.m33707c(r5);
        if (r0 != 0) goto L_0x000a;
    L_0x0006:
        com.snapchat.kit.sdk.bitmoji.ui.controller.C7878d.m33705b(r5);
        return;
    L_0x000a:
        r0 = "bitmoji-sdk://login?client_id=%s";	 Catch:{ ActivityNotFoundException -> 0x002c }
        r1 = 1;	 Catch:{ ActivityNotFoundException -> 0x002c }
        r1 = new java.lang.Object[r1];	 Catch:{ ActivityNotFoundException -> 0x002c }
        r2 = 0;	 Catch:{ ActivityNotFoundException -> 0x002c }
        r3 = r4.f28429e;	 Catch:{ ActivityNotFoundException -> 0x002c }
        r1[r2] = r3;	 Catch:{ ActivityNotFoundException -> 0x002c }
        r0 = java.lang.String.format(r0, r1);	 Catch:{ ActivityNotFoundException -> 0x002c }
        r1 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x002c }
        r2 = "android.intent.action.VIEW";	 Catch:{ ActivityNotFoundException -> 0x002c }
        r0 = android.net.Uri.parse(r0);	 Catch:{ ActivityNotFoundException -> 0x002c }
        r1.<init>(r2, r0);	 Catch:{ ActivityNotFoundException -> 0x002c }
        r0 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;	 Catch:{ ActivityNotFoundException -> 0x002c }
        r1.setFlags(r0);	 Catch:{ ActivityNotFoundException -> 0x002c }
        r5.startActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x002c }
        goto L_0x002f;
    L_0x002c:
        com.snapchat.kit.sdk.bitmoji.ui.controller.C7878d.m33705b(r5);
    L_0x002f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.bitmoji.ui.controller.d.a(android.content.Context):void");
    }

    /* renamed from: b */
    private static void m33705b(android.content.Context r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r6.getPackageName();
        if (r0 != 0) goto L_0x0009;
    L_0x0006:
        r0 = "sdk";
        goto L_0x001a;
    L_0x0009:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "sdk+";
        r1.append(r2);
        r1.append(r0);
        r0 = r1.toString();
    L_0x001a:
        r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r2 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x003f }
        r3 = "android.intent.action.VIEW";	 Catch:{ ActivityNotFoundException -> 0x003f }
        r4 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x003f }
        r4.<init>();	 Catch:{ ActivityNotFoundException -> 0x003f }
        r5 = "market://details?id=com.bitstrips.imoji&referrer=utm_source%3D";	 Catch:{ ActivityNotFoundException -> 0x003f }
        r4.append(r5);	 Catch:{ ActivityNotFoundException -> 0x003f }
        r4.append(r0);	 Catch:{ ActivityNotFoundException -> 0x003f }
        r4 = r4.toString();	 Catch:{ ActivityNotFoundException -> 0x003f }
        r4 = android.net.Uri.parse(r4);	 Catch:{ ActivityNotFoundException -> 0x003f }
        r2.<init>(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x003f }
        r2.setFlags(r1);	 Catch:{ ActivityNotFoundException -> 0x003f }
        r6.startActivity(r2);	 Catch:{ ActivityNotFoundException -> 0x003f }
        goto L_0x0061;
    L_0x003f:
        r2 = new android.content.Intent;
        r3 = "android.intent.action.VIEW";
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "https://play.google.com/store/apps/details?id=com.bitstrips.imoji&referrer=utm_source%3D";
        r4.append(r5);
        r4.append(r0);
        r0 = r4.toString();
        r0 = android.net.Uri.parse(r0);
        r2.<init>(r3, r0);
        r2.setFlags(r1);
        r6.startActivity(r2);
    L_0x0061:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.bitmoji.ui.controller.d.b(android.content.Context):void");
    }

    /* renamed from: c */
    private static boolean m33707c(android.content.Context r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = r2.getPackageManager();
        r0 = 0;
        if (r2 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r1 = "com.bitstrips.imoji";	 Catch:{ NameNotFoundException -> 0x0017 }
        r2 = r2.getPackageInfo(r1, r0);	 Catch:{ NameNotFoundException -> 0x0017 }
        r2 = r2.versionCode;
        r1 = 10260000; // 0x9c8e20 float:1.4377322E-38 double:5.0691135E-317;
        if (r2 < r1) goto L_0x0016;
    L_0x0015:
        r0 = 1;
    L_0x0016:
        return r0;
    L_0x0017:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.bitmoji.ui.controller.d.c(android.content.Context):boolean");
    }
}
