package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.C4275c;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ajs;
import com.google.android.gms.internal.anf;
import com.google.android.gms.internal.ani;
import com.google.android.gms.internal.bo;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.zzadk;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzkn;
import com.google.android.gms.internal.zzks;
import com.google.android.gms.internal.zzlg;
import com.google.android.gms.internal.zzpu;
import com.google.android.gms.internal.zzpz;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzxe;
import com.google.android.gms.internal.zzxo;
import com.google.android.gms.internal.zzzv;
import java.util.HashMap;

@Keep
@KeepForSdkWithMembers
@DynamiteApi
@zzzv
public class ClientApi extends ajs {
    public zzkn createAdLoaderBuilder(IObjectWrapper iObjectWrapper, String str, zzux zzux, int i) {
        Context context = (Context) C4296b.m17262a(iObjectWrapper);
        ar.m8648e();
        return new C4271j(context, str, zzux, new zzakd(C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, fk.m(context)), bn.m8686a(context));
    }

    public zzxe createAdOverlay(IObjectWrapper iObjectWrapper) {
        return new C4275c((Activity) C4296b.m17262a(iObjectWrapper));
    }

    public zzks createBannerAdManager(IObjectWrapper iObjectWrapper, zzjn zzjn, String str, zzux zzux, int i) throws RemoteException {
        Context context = (Context) C4296b.m17262a(iObjectWrapper);
        ar.m8648e();
        return new bp(context, zzjn, str, zzux, new zzakd(C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, fk.m(context)), bn.m8686a(context));
    }

    public zzxo createInAppPurchaseManager(IObjectWrapper iObjectWrapper) {
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.zzks createInterstitialAdManager(com.google.android.gms.dynamic.IObjectWrapper r8, com.google.android.gms.internal.zzjn r9, java.lang.String r10, com.google.android.gms.internal.zzux r11, int r12) throws android.os.RemoteException {
        /*
        r7 = this;
        r8 = com.google.android.gms.dynamic.C4296b.m17262a(r8);
        r1 = r8;
        r1 = (android.content.Context) r1;
        com.google.android.gms.internal.alo.a(r1);
        r5 = new com.google.android.gms.internal.zzakd;
        com.google.android.gms.ads.internal.ar.m8648e();
        r8 = com.google.android.gms.internal.fk.m(r1);
        r0 = 1;
        r2 = 11910000; // 0xb5bb70 float:1.6689465E-38 double:5.884322E-317;
        r5.<init>(r2, r12, r0, r8);
        r8 = "reward_mb";
        r12 = r9.zzbek;
        r8 = r8.equals(r12);
        if (r8 != 0) goto L_0x0036;
    L_0x0024:
        r12 = com.google.android.gms.internal.alo.aF;
        r2 = com.google.android.gms.internal.aja.f();
        r12 = r2.a(r12);
        r12 = (java.lang.Boolean) r12;
        r12 = r12.booleanValue();
        if (r12 != 0) goto L_0x004c;
    L_0x0036:
        if (r8 == 0) goto L_0x004b;
    L_0x0038:
        r8 = com.google.android.gms.internal.alo.aG;
        r12 = com.google.android.gms.internal.aja.f();
        r8 = r12.a(r8);
        r8 = (java.lang.Boolean) r8;
        r8 = r8.booleanValue();
        if (r8 == 0) goto L_0x004b;
    L_0x004a:
        goto L_0x004c;
    L_0x004b:
        r0 = 0;
    L_0x004c:
        if (r0 == 0) goto L_0x005d;
    L_0x004e:
        r8 = new com.google.android.gms.internal.aqt;
        r9 = com.google.android.gms.ads.internal.bn.m8686a(r1);
        r0 = r8;
        r2 = r10;
        r3 = r11;
        r4 = r5;
        r5 = r9;
        r0.<init>(r1, r2, r3, r4, r5);
        return r8;
    L_0x005d:
        r8 = new com.google.android.gms.ads.internal.k;
        r6 = com.google.android.gms.ads.internal.bn.m8686a(r1);
        r0 = r8;
        r2 = r9;
        r3 = r10;
        r4 = r11;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.createInterstitialAdManager(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.zzjn, java.lang.String, com.google.android.gms.internal.zzux, int):com.google.android.gms.internal.zzks");
    }

    public zzpu createNativeAdViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new anf((FrameLayout) C4296b.m17262a(iObjectWrapper), (FrameLayout) C4296b.m17262a(iObjectWrapper2));
    }

    public zzpz createNativeAdViewHolderDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new ani((View) C4296b.m17262a(iObjectWrapper), (HashMap) C4296b.m17262a(iObjectWrapper2), (HashMap) C4296b.m17262a(iObjectWrapper3));
    }

    public zzadk createRewardedVideoAd(IObjectWrapper iObjectWrapper, zzux zzux, int i) {
        Context context = (Context) C4296b.m17262a(iObjectWrapper);
        ar.m8648e();
        return new bo(context, bn.m8686a(context), zzux, new zzakd(C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, fk.m(context)));
    }

    public zzks createSearchAdManager(IObjectWrapper iObjectWrapper, zzjn zzjn, String str, int i) throws RemoteException {
        Context context = (Context) C4296b.m17262a(iObjectWrapper);
        ar.m8648e();
        return new al(context, zzjn, str, new zzakd(C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, fk.m(context)));
    }

    @Nullable
    public zzlg getMobileAdsSettingsManager(IObjectWrapper iObjectWrapper) {
        return null;
    }

    public zzlg getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iObjectWrapper, int i) {
        Context context = (Context) C4296b.m17262a(iObjectWrapper);
        ar.m8648e();
        return C4277v.m17156a(context, new zzakd(C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, fk.m(context)));
    }
}
