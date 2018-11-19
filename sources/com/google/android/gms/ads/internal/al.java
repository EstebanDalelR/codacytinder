package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.ajm;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fe;
import com.google.android.gms.internal.tb;
import com.google.android.gms.internal.zzadp;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzke;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzlr;
import com.google.android.gms.internal.zzmr;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzxl;
import com.google.android.gms.internal.zzxr;
import com.google.android.gms.internal.zzzv;
import java.util.Map;
import java.util.concurrent.Future;

@zzzv
public final class al extends ajm {
    /* renamed from: a */
    private final zzakd f13847a;
    /* renamed from: b */
    private final zzjn f13848b;
    /* renamed from: c */
    private final Future<tb> f13849c = fe.a(fe.f16050a, new ao(this));
    /* renamed from: d */
    private final Context f13850d;
    /* renamed from: e */
    private final aq f13851e;
    @Nullable
    /* renamed from: f */
    private WebView f13852f = new WebView(this.f13850d);
    @Nullable
    /* renamed from: g */
    private zzkh f13853g;
    @Nullable
    /* renamed from: h */
    private tb f13854h;
    /* renamed from: i */
    private AsyncTask<Void, Void, String> f13855i;

    public al(Context context, zzjn zzjn, String str, zzakd zzakd) {
        this.f13850d = context;
        this.f13847a = zzakd;
        this.f13848b = zzjn;
        this.f13851e = new aq(str);
        m17117a(0);
        this.f13852f.setVerticalScrollBarEnabled(false);
        this.f13852f.getSettings().setJavaScriptEnabled(true);
        this.f13852f.setWebViewClient(new am(this));
        this.f13852f.setOnTouchListener(new an(this));
    }

    /* renamed from: b */
    private final String m17108b(String str) {
        if (this.f13854h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.f13854h.a(parse, this.f13850d, null, null);
        } catch (Throwable e) {
            ec.c("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* renamed from: c */
    private final void m17111c(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f13850d.startActivity(intent);
    }

    /* renamed from: a */
    final int m17115a(java.lang.String r3) {
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
        r2 = this;
        r3 = android.net.Uri.parse(r3);
        r0 = "height";
        r3 = r3.getQueryParameter(r0);
        r0 = android.text.TextUtils.isEmpty(r3);
        r1 = 0;
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        return r1;
    L_0x0012:
        com.google.android.gms.internal.aja.a();	 Catch:{ NumberFormatException -> 0x0020 }
        r0 = r2.f13850d;	 Catch:{ NumberFormatException -> 0x0020 }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x0020 }
        r3 = com.google.android.gms.internal.hn.a(r0, r3);	 Catch:{ NumberFormatException -> 0x0020 }
        return r3;
    L_0x0020:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.al.a(java.lang.String):int");
    }

    /* renamed from: a */
    final String m17116a() {
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) aja.f().a(alo.ch));
        builder.appendQueryParameter("query", this.f13851e.m8637b());
        builder.appendQueryParameter("pubId", this.f13851e.m8638c());
        Map d = this.f13851e.m8639d();
        for (String str : d.keySet()) {
            builder.appendQueryParameter(str, (String) d.get(str));
        }
        Uri build = builder.build();
        if (this.f13854h != null) {
            try {
                build = this.f13854h.a(build, this.f13850d);
            } catch (Throwable e) {
                ec.c("Unable to process ad data", e);
            }
        }
        String b = m17118b();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(b).length() + 1) + String.valueOf(encodedQuery).length());
        stringBuilder.append(b);
        stringBuilder.append("#");
        stringBuilder.append(encodedQuery);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    final void m17117a(int i) {
        if (this.f13852f != null) {
            this.f13852f.setLayoutParams(new LayoutParams(-1, i));
        }
    }

    /* renamed from: b */
    final String m17118b() {
        String a = this.f13851e.m8635a();
        if (TextUtils.isEmpty(a)) {
            a = "www.google.com";
        }
        String str = "https://";
        String str2 = (String) aja.f().a(alo.ch);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + String.valueOf(a).length()) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(a);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public final void destroy() throws RemoteException {
        ad.m9053b("destroy must be called on the main UI thread.");
        this.f13855i.cancel(true);
        this.f13849c.cancel(true);
        this.f13852f.destroy();
        this.f13852f = null;
    }

    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Nullable
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Nullable
    public final zzll getVideoController() {
        return null;
    }

    public final boolean isLoading() throws RemoteException {
        return false;
    }

    public final boolean isReady() throws RemoteException {
        return false;
    }

    public final void pause() throws RemoteException {
        ad.m9053b("pause must be called on the main UI thread.");
    }

    public final void resume() throws RemoteException {
        ad.m9053b("resume must be called on the main UI thread.");
    }

    public final void setImmersiveMode(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
    }

    public final void setUserId(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void showInterstitial() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void stopLoading() throws RemoteException {
    }

    public final void zza(zzadp zzadp) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzjn zzjn) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void zza(zzke zzke) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzkh zzkh) throws RemoteException {
        this.f13853g = zzkh;
    }

    public final void zza(zzkx zzkx) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzld zzld) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzlr zzlr) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzmr zzmr) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzoa zzoa) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzxl zzxl) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzxr zzxr, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final boolean zzb(zzjj zzjj) throws RemoteException {
        ad.m9046a(this.f13852f, (Object) "This Search Ad has already been torn down");
        this.f13851e.m8636a(zzjj, this.f13847a);
        this.f13855i = new ap().execute(new Void[0]);
        return true;
    }

    public final IObjectWrapper zzbr() throws RemoteException {
        ad.m9053b("getAdFrame must be called on the main UI thread.");
        return C4296b.m17261a(this.f13852f);
    }

    public final zzjn zzbs() throws RemoteException {
        return this.f13848b;
    }

    public final void zzbu() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final zzkx zzcd() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final zzkh zzce() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Nullable
    public final String zzcp() throws RemoteException {
        return null;
    }
}
