package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.bo;
import com.google.android.gms.ads.internal.gmsg.C2377h;
import com.google.android.gms.ads.internal.gmsg.C3737a;
import com.google.android.gms.ads.internal.gmsg.C3738b;
import com.google.android.gms.ads.internal.gmsg.C3739c;
import com.google.android.gms.ads.internal.gmsg.C3758z;
import com.google.android.gms.ads.internal.gmsg.ab;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.gmsg.zzx;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C2400j;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.common.util.zzr;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@zzzv
public class ku extends WebViewClient {
    /* renamed from: c */
    private static final String[] f16292c = new String[]{"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    /* renamed from: d */
    private static final String[] f16293d = new String[]{"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    /* renamed from: A */
    private boolean f16294A;
    /* renamed from: B */
    private boolean f16295B;
    /* renamed from: C */
    private int f16296C;
    /* renamed from: D */
    private OnAttachStateChangeListener f16297D;
    /* renamed from: a */
    protected zzanh f16298a;
    @Nullable
    /* renamed from: b */
    protected zzafb f16299b;
    /* renamed from: e */
    private final HashMap<String, List<zzt<? super zzanh>>> f16300e;
    /* renamed from: f */
    private final Object f16301f;
    /* renamed from: g */
    private zzje f16302g;
    /* renamed from: h */
    private zzn f16303h;
    /* renamed from: i */
    private zzanm f16304i;
    /* renamed from: j */
    private zzann f16305j;
    /* renamed from: k */
    private zzb f16306k;
    /* renamed from: l */
    private zzano f16307l;
    /* renamed from: m */
    private boolean f16308m;
    /* renamed from: n */
    private zzx f16309n;
    /* renamed from: o */
    private boolean f16310o;
    /* renamed from: p */
    private boolean f16311p;
    /* renamed from: q */
    private OnGlobalLayoutListener f16312q;
    /* renamed from: r */
    private OnScrollChangedListener f16313r;
    /* renamed from: s */
    private boolean f16314s;
    /* renamed from: t */
    private zzq f16315t;
    /* renamed from: u */
    private final atu f16316u;
    /* renamed from: v */
    private bo f16317v;
    /* renamed from: w */
    private atl f16318w;
    /* renamed from: x */
    private zzxc f16319x;
    /* renamed from: y */
    private zzanq f16320y;
    /* renamed from: z */
    private boolean f16321z;

    public ku(zzanh zzanh, boolean z) {
        this(zzanh, z, new atu(zzanh, zzanh.zzsu(), new ala(zzanh.getContext())), null);
    }

    private ku(zzanh zzanh, boolean z, atu atu, atl atl) {
        this.f16300e = new HashMap();
        this.f16301f = new Object();
        this.f16308m = false;
        this.f16298a = zzanh;
        this.f16310o = z;
        this.f16316u = atu;
        this.f16318w = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final android.webkit.WebResourceResponse m19985a(java.lang.String r9) throws java.io.IOException {
        /*
        r8 = this;
        r0 = new java.net.URL;
        r0.<init>(r9);
        r9 = 0;
        r1 = r0;
        r0 = 0;
    L_0x0008:
        r0 = r0 + 1;
        r2 = 20;
        if (r0 > r2) goto L_0x00e1;
    L_0x000e:
        r2 = r1.openConnection();
        r3 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r2.setConnectTimeout(r3);
        r2.setReadTimeout(r3);
        r3 = r2 instanceof java.net.HttpURLConnection;
        if (r3 != 0) goto L_0x0026;
    L_0x001e:
        r9 = new java.io.IOException;
        r0 = "Invalid protocol.";
        r9.<init>(r0);
        throw r9;
    L_0x0026:
        r2 = (java.net.HttpURLConnection) r2;
        r3 = com.google.android.gms.ads.internal.ar.e();
        r4 = r8.f16298a;
        r4 = r4.getContext();
        r5 = r8.f16298a;
        r5 = r5.zzsk();
        r5 = r5.zzcv;
        r3.m19750a(r4, r5, r9, r2);
        r3 = new com.google.android.gms.internal.hq;
        r3.<init>();
        r4 = 0;
        r3.m19905a(r2, r4);
        r5 = r2.getResponseCode();
        com.google.android.gms.ads.internal.ar.e();
        r6 = r2.getContentType();
        r6 = com.google.android.gms.internal.fk.m19732f(r6);
        com.google.android.gms.ads.internal.ar.e();
        r7 = r2.getContentType();
        r7 = com.google.android.gms.internal.fk.m19733g(r7);
        r3.m19904a(r2, r5);
        r3 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r5 < r3) goto L_0x00d7;
    L_0x0067:
        r3 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r5 >= r3) goto L_0x00d7;
    L_0x006b:
        r3 = "Location";
        r3 = r2.getHeaderField(r3);
        if (r3 != 0) goto L_0x007b;
    L_0x0073:
        r9 = new java.io.IOException;
        r0 = "Missing Location header in redirect";
        r9.<init>(r0);
        throw r9;
    L_0x007b:
        r5 = new java.net.URL;
        r5.<init>(r1, r3);
        r1 = r5.getProtocol();
        if (r1 != 0) goto L_0x008c;
    L_0x0086:
        r9 = "Protocol is null";
        com.google.android.gms.internal.hx.m19916e(r9);
        return r4;
    L_0x008c:
        r6 = "http";
        r6 = r1.equals(r6);
        if (r6 != 0) goto L_0x00b7;
    L_0x0094:
        r6 = "https";
        r6 = r1.equals(r6);
        if (r6 != 0) goto L_0x00b7;
    L_0x009c:
        r9 = "Unsupported scheme: ";
        r0 = java.lang.String.valueOf(r1);
        r1 = r0.length();
        if (r1 == 0) goto L_0x00ad;
    L_0x00a8:
        r9 = r9.concat(r0);
        goto L_0x00b3;
    L_0x00ad:
        r0 = new java.lang.String;
        r0.<init>(r9);
        r9 = r0;
    L_0x00b3:
        com.google.android.gms.internal.hx.m19916e(r9);
        return r4;
    L_0x00b7:
        r1 = "Redirecting to ";
        r3 = java.lang.String.valueOf(r3);
        r4 = r3.length();
        if (r4 == 0) goto L_0x00c8;
    L_0x00c3:
        r1 = r1.concat(r3);
        goto L_0x00ce;
    L_0x00c8:
        r3 = new java.lang.String;
        r3.<init>(r1);
        r1 = r3;
    L_0x00ce:
        com.google.android.gms.internal.hx.m19911b(r1);
        r2.disconnect();
        r1 = r5;
        goto L_0x0008;
    L_0x00d7:
        r9 = new android.webkit.WebResourceResponse;
        r0 = r2.getInputStream();
        r9.<init>(r6, r7, r0);
        return r9;
    L_0x00e1:
        r9 = new java.io.IOException;
        r0 = 32;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "Too many redirects (20)";
        r1.append(r0);
        r0 = r1.toString();
        r9.<init>(r0);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ku.a(java.lang.String):android.webkit.WebResourceResponse");
    }

    /* renamed from: a */
    private final void m19988a(Context context, String str, String str2, String str3) {
        if (((Boolean) aja.m19221f().m19334a(alo.be)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            str = "host";
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str2 = parse.getHost();
                    bundle.putString(str, str2);
                    ar.e().m19749a(context, this.f16298a.zzsk().zzcv, "gmob-apps", bundle, true);
                }
            }
            str2 = "";
            bundle.putString(str, str2);
            ar.e().m19749a(context, this.f16298a.zzsk().zzcv, "gmob-apps", bundle, true);
        }
    }

    /* renamed from: a */
    private final void m19989a(Uri uri) {
        String path = uri.getPath();
        List<zzt> list = (List) this.f16300e.get(path);
        if (list != null) {
            ar.e();
            Map a = fk.m19691a(uri);
            if (hx.m19910a(2)) {
                String str = "Received GMSG: ";
                path = String.valueOf(path);
                ec.m27332a(path.length() != 0 ? str.concat(path) : new String(str));
                for (String str2 : a.keySet()) {
                    String str3 = (String) a.get(str2);
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 4) + String.valueOf(str3).length());
                    stringBuilder.append("  ");
                    stringBuilder.append(str2);
                    stringBuilder.append(": ");
                    stringBuilder.append(str3);
                    ec.m27332a(stringBuilder.toString());
                }
            }
            for (zzt zza : list) {
                zza.zza(this.f16298a, a);
            }
            return;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 32);
        stringBuilder2.append("No GMSG handler found for GMSG: ");
        stringBuilder2.append(valueOf);
        ec.m27332a(stringBuilder2.toString());
    }

    /* renamed from: a */
    private final void m19990a(View view, zzafb zzafb, int i) {
        if (zzafb.zzol() && i > 0) {
            zzafb.zzq(view);
            if (zzafb.zzol()) {
                fk.f16060a.postDelayed(new kv(this, view, zzafb, i), 100);
            }
        }
    }

    /* renamed from: a */
    private final void m19991a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean a = this.f16318w != null ? this.f16318w.m27248a() : false;
        ar.c();
        Context context = this.f16298a.getContext();
        if (!a) {
            z = true;
        }
        C2400j.a(context, adOverlayInfoParcel, z);
        if (this.f16299b != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzciv != null) {
                str = adOverlayInfoParcel.zzciv.url;
            }
            this.f16299b.zzbv(str);
        }
    }

    /* renamed from: o */
    private final void m19993o() {
        if (this.f16297D != null) {
            zzanh zzanh = this.f16298a;
            if (zzanh == null) {
                throw null;
            }
            ((View) zzanh).removeOnAttachStateChangeListener(this.f16297D);
        }
    }

    /* renamed from: p */
    private final void m19994p() {
        if (this.f16304i != null && ((this.f16294A && this.f16296C <= 0) || this.f16295B)) {
            this.f16304i.zza(this.f16298a, this.f16295B ^ 1);
            this.f16304i = null;
        }
        this.f16298a.zzti();
    }

    /* renamed from: a */
    public final bo m19995a() {
        return this.f16317v;
    }

    /* renamed from: a */
    public final void m19996a(int i, int i2) {
        if (this.f16318w != null) {
            this.f16318w.m27244a(i, i2);
        }
    }

    /* renamed from: a */
    public final void m19997a(int i, int i2, boolean z) {
        this.f16316u.m27251a(i, i2);
        if (this.f16318w != null) {
            this.f16318w.m27245a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final void m19998a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f16301f) {
            this.f16311p = true;
            this.f16298a.zzth();
            this.f16312q = onGlobalLayoutListener;
            this.f16313r = onScrollChangedListener;
        }
    }

    /* renamed from: a */
    public final void m19999a(zzc zzc) {
        boolean zztc = this.f16298a.zztc();
        zzje zzje = (!zztc || this.f16298a.zzsx().m20048d()) ? this.f16302g : null;
        m19991a(new AdOverlayInfoParcel(zzc, zzje, zztc ? null : this.f16303h, this.f16315t, this.f16298a.zzsk()));
    }

    /* renamed from: a */
    public final void m20000a(zzanm zzanm) {
        this.f16304i = zzanm;
    }

    /* renamed from: a */
    public final void m20001a(zzann zzann) {
        this.f16305j = zzann;
    }

    /* renamed from: a */
    public final void m20002a(zzano zzano) {
        this.f16307l = zzano;
    }

    /* renamed from: a */
    public final void m20003a(zzanq zzanq) {
        this.f16320y = zzanq;
    }

    /* renamed from: a */
    public final void m20004a(zzje zzje, zzn zzn, zzb zzb, zzq zzq, boolean z, @Nullable zzx zzx, bo boVar, zzxc zzxc, @Nullable zzafb zzafb) {
        zzb zzb2 = zzb;
        zzx zzx2 = zzx;
        zzxc zzxc2 = zzxc;
        zzafb zzafb2 = zzafb;
        bo boVar2 = boVar == null ? new bo(this.f16298a.getContext(), zzafb2, null) : boVar;
        r0.f16318w = new atl(r0.f16298a, zzxc2);
        r0.f16299b = zzafb2;
        m20005a("/appEvent", new C3737a(zzb2));
        m20005a("/backButton", C2377h.f7250j);
        m20005a("/refresh", C2377h.f7251k);
        m20005a("/canOpenURLs", C2377h.f7241a);
        m20005a("/canOpenIntents", C2377h.f7242b);
        m20005a("/click", C2377h.f7243c);
        m20005a("/close", C2377h.f7244d);
        m20005a("/customClose", C2377h.f7245e);
        m20005a("/instrument", C2377h.f7254n);
        m20005a("/delayPageLoaded", C2377h.f7256p);
        m20005a("/delayPageClosed", C2377h.f7257q);
        m20005a("/getLocationInfo", C2377h.f7258r);
        m20005a("/httpTrack", C2377h.f7246f);
        m20005a("/log", C2377h.f7247g);
        m20005a("/mraid", new C3738b(boVar2, r0.f16318w));
        m20005a("/mraidLoaded", r0.f16316u);
        zzt zzt = r1;
        C3739c c3739c = new C3739c(r0.f16298a.getContext(), r0.f16298a.zzsk(), r0.f16298a.zztb(), zzq, zzje, zzb2, zzn, boVar2, r0.f16318w);
        m20005a("/open", zzt);
        m20005a("/precache", new ks());
        m20005a("/touch", C2377h.f7249i);
        m20005a("/video", C2377h.f7252l);
        m20005a("/videoMeta", C2377h.f7253m);
        if (ar.z().m19598a(r0.f16298a.getContext())) {
            m20005a("/logScionEvent", new ab(r0.f16298a.getContext()));
        }
        if (zzx2 != null) {
            m20005a("/setInterstitialProperties", new C3758z(zzx2));
        }
        r0.f16302g = zzje;
        r0.f16303h = zzn;
        r0.f16306k = zzb2;
        r0.f16315t = zzq;
        r0.f16317v = boVar2;
        r0.f16319x = zzxc;
        r0.f16309n = zzx2;
        r0.f16308m = z;
    }

    /* renamed from: a */
    public final void m20005a(String str, zzt<? super zzanh> zzt) {
        synchronized (this.f16301f) {
            List list = (List) this.f16300e.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f16300e.put(str, list);
            }
            list.add(zzt);
        }
    }

    /* renamed from: a */
    public final void m20006a(String str, zzr<zzt<? super zzanh>> zzr) {
        synchronized (this.f16301f) {
            List<zzt> list = (List) this.f16300e.get(str);
            if (list == null) {
                return;
            }
            Collection arrayList = new ArrayList();
            for (zzt zzt : list) {
                if (zzr.apply(zzt)) {
                    arrayList.add(zzt);
                }
            }
            list.removeAll(arrayList);
        }
    }

    /* renamed from: a */
    public final void m20007a(boolean z) {
        this.f16308m = z;
    }

    /* renamed from: a */
    public final void m20008a(boolean z, int i) {
        zzje zzje = (!this.f16298a.zztc() || this.f16298a.zzsx().m20048d()) ? this.f16302g : null;
        m19991a(new AdOverlayInfoParcel(zzje, this.f16303h, this.f16315t, this.f16298a, z, i, this.f16298a.zzsk()));
    }

    /* renamed from: a */
    public final void m20009a(boolean z, int i, String str) {
        boolean zztc = this.f16298a.zztc();
        zzje zzje = (!zztc || this.f16298a.zzsx().m20048d()) ? this.f16302g : null;
        m19991a(new AdOverlayInfoParcel(zzje, zztc ? null : new ky(this.f16298a, this.f16303h), this.f16306k, this.f16315t, this.f16298a, z, i, str, this.f16298a.zzsk()));
    }

    /* renamed from: a */
    public final void m20010a(boolean z, int i, String str, String str2) {
        boolean zztc = this.f16298a.zztc();
        zzje zzje = (!zztc || r0.f16298a.zzsx().m20048d()) ? r0.f16302g : null;
        m19991a(new AdOverlayInfoParcel(zzje, zztc ? null : new ky(r0.f16298a, r0.f16303h), r0.f16306k, r0.f16315t, r0.f16298a, z, i, str, str2, r0.f16298a.zzsk()));
    }

    /* renamed from: b */
    public final void m20011b(String str, zzt<? super zzanh> zzt) {
        synchronized (this.f16301f) {
            List list = (List) this.f16300e.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzt);
        }
    }

    /* renamed from: b */
    public final boolean m20012b() {
        boolean z;
        synchronized (this.f16301f) {
            z = this.f16310o;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean m20013c() {
        boolean z;
        synchronized (this.f16301f) {
            z = this.f16311p;
        }
        return z;
    }

    /* renamed from: d */
    public final OnGlobalLayoutListener m20014d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f16301f) {
            onGlobalLayoutListener = this.f16312q;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: e */
    public final OnScrollChangedListener m20015e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f16301f) {
            onScrollChangedListener = this.f16313r;
        }
        return onScrollChangedListener;
    }

    /* renamed from: f */
    public final boolean m20016f() {
        boolean z;
        synchronized (this.f16301f) {
            z = this.f16314s;
        }
        return z;
    }

    /* renamed from: g */
    public final void m20017g() {
        synchronized (this.f16301f) {
            ec.m27332a("Loading blank page in WebView, 2...");
            this.f16321z = true;
            this.f16298a.zzcz("about:blank");
        }
    }

    /* renamed from: h */
    public final void m20018h() {
        zzafb zzafb = this.f16299b;
        if (zzafb != null) {
            View webView = this.f16298a.getWebView();
            if (ViewCompat.C(webView)) {
                m19990a(webView, zzafb, 10);
                return;
            }
            m19993o();
            this.f16297D = new kw(this, zzafb);
            zzanh zzanh = this.f16298a;
            if (zzanh == null) {
                throw null;
            }
            ((View) zzanh).addOnAttachStateChangeListener(this.f16297D);
        }
    }

    /* renamed from: i */
    public final void m20019i() {
        synchronized (this.f16301f) {
            this.f16314s = true;
        }
        this.f16296C++;
        m19994p();
    }

    /* renamed from: j */
    public final void m20020j() {
        this.f16296C--;
        m19994p();
    }

    /* renamed from: k */
    public final void m20021k() {
        this.f16295B = true;
        m19994p();
    }

    /* renamed from: l */
    public final void m20022l() {
        if (this.f16299b != null) {
            this.f16299b.zzon();
            this.f16299b = null;
        }
        m19993o();
        synchronized (this.f16301f) {
            this.f16300e.clear();
            this.f16302g = null;
            this.f16303h = null;
            this.f16304i = null;
            this.f16305j = null;
            this.f16306k = null;
            this.f16308m = false;
            this.f16310o = false;
            this.f16311p = false;
            this.f16314s = false;
            this.f16315t = null;
            this.f16307l = null;
            if (this.f16318w != null) {
                this.f16318w.m27247a(true);
                this.f16318w = null;
            }
        }
    }

    /* renamed from: m */
    public final zzanq m20023m() {
        return this.f16320y;
    }

    /* renamed from: n */
    public final void m20024n() {
        synchronized (this.f16301f) {
            this.f16308m = false;
            this.f16310o = true;
            ar.e();
            fk.m19700a(new kx(this));
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String str2 = "Loading resource: ";
        String valueOf = String.valueOf(str);
        ec.m27332a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m19989a(parse);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
        r0 = this;
        r1 = r0.f16301f;
        monitor-enter(r1);
        r2 = r0.f16321z;	 Catch:{ all -> 0x0029 }
        if (r2 == 0) goto L_0x0013;
    L_0x0007:
        r2 = "Blank page loaded, 1...";
        com.google.android.gms.internal.ec.m27332a(r2);	 Catch:{ all -> 0x0029 }
        r2 = r0.f16298a;	 Catch:{ all -> 0x0029 }
        r2.zztd();	 Catch:{ all -> 0x0029 }
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        return;
    L_0x0013:
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        r1 = 1;
        r0.f16294A = r1;
        r1 = r0.f16305j;
        if (r1 == 0) goto L_0x0025;
    L_0x001b:
        r1 = r0.f16305j;
        r2 = r0.f16298a;
        r1.zzg(r2);
        r1 = 0;
        r0.f16305j = r1;
    L_0x0025:
        r0.m19994p();
        return;
    L_0x0029:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ku.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3;
        if (i < 0) {
            int i2 = (-i) - 1;
            if (i2 < f16292c.length) {
                str3 = f16292c[i2];
                m19988a(this.f16298a.getContext(), "http_err", str3, str2);
                super.onReceivedError(webView, i, str, str2);
            }
        }
        str3 = String.valueOf(i);
        m19988a(this.f16298a.getContext(), "http_err", str3, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            String valueOf = (primaryError < 0 || primaryError >= f16293d.length) ? String.valueOf(primaryError) : f16293d[primaryError];
            m19988a(this.f16298a.getContext(), "ssl_err", valueOf, ar.g().mo7434a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            String a = dh.m19613a(str, this.f16298a.getContext());
            if (!a.equals(str)) {
                return m19985a(a);
            }
            zzil zzab = zzil.zzab(str);
            if (zzab != null) {
                zzii a2 = ar.j().m19182a(zzab);
                if (a2 != null && a2.zzhf()) {
                    return new WebResourceResponse("", "", a2.zzhg());
                }
            }
            if (hq.m19901c()) {
                if (((Boolean) aja.m19221f().m19334a(alo.aU)).booleanValue()) {
                    return m19985a(str);
                }
            }
            return null;
        } catch (Throwable e) {
            ar.i().m27296a(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (!(keyCode == 79 || keyCode == 222)) {
            switch (keyCode) {
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                    break;
                default:
                    switch (keyCode) {
                        case 126:
                        case 127:
                        case ProfileEditingConfig.DEFAULT_MAX_LENGTH /*128*/:
                        case 129:
                        case 130:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r12, java.lang.String r13) {
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
        r11 = this;
        r0 = "AdWebView shouldOverrideUrlLoading: ";
        r1 = java.lang.String.valueOf(r13);
        r2 = r1.length();
        if (r2 == 0) goto L_0x0011;
    L_0x000c:
        r0 = r0.concat(r1);
        goto L_0x0017;
    L_0x0011:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x0017:
        com.google.android.gms.internal.ec.m27332a(r0);
        r0 = android.net.Uri.parse(r13);
        r1 = "gmsg";
        r2 = r0.getScheme();
        r1 = r1.equalsIgnoreCase(r2);
        r2 = 1;
        if (r1 == 0) goto L_0x003b;
    L_0x002b:
        r1 = "mobileads.google.com";
        r3 = r0.getHost();
        r1 = r1.equalsIgnoreCase(r3);
        if (r1 == 0) goto L_0x003b;
    L_0x0037:
        r11.m19989a(r0);
        return r2;
    L_0x003b:
        r1 = r11.f16308m;
        r3 = 0;
        if (r1 == 0) goto L_0x008d;
    L_0x0040:
        r1 = r11.f16298a;
        r1 = r1.getWebView();
        if (r12 != r1) goto L_0x008d;
    L_0x0048:
        r1 = r0.getScheme();
        r4 = "http";
        r4 = r4.equalsIgnoreCase(r1);
        if (r4 != 0) goto L_0x005f;
    L_0x0054:
        r4 = "https";
        r1 = r4.equalsIgnoreCase(r1);
        if (r1 == 0) goto L_0x005d;
    L_0x005c:
        goto L_0x005f;
    L_0x005d:
        r1 = 0;
        goto L_0x0060;
    L_0x005f:
        r1 = 1;
    L_0x0060:
        if (r1 == 0) goto L_0x008d;
    L_0x0062:
        r0 = r11.f16302g;
        if (r0 == 0) goto L_0x0088;
    L_0x0066:
        r0 = com.google.android.gms.internal.alo.ad;
        r1 = com.google.android.gms.internal.aja.m19221f();
        r0 = r1.m19334a(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0088;
    L_0x0078:
        r0 = r11.f16302g;
        r0.onAdClicked();
        r0 = r11.f16299b;
        if (r0 == 0) goto L_0x0086;
    L_0x0081:
        r0 = r11.f16299b;
        r0.zzbv(r13);
    L_0x0086:
        r11.f16302g = r3;
    L_0x0088:
        r12 = super.shouldOverrideUrlLoading(r12, r13);
        return r12;
    L_0x008d:
        r12 = r11.f16298a;
        r12 = r12.getWebView();
        r12 = r12.willNotDraw();
        if (r12 != 0) goto L_0x0102;
    L_0x0099:
        r12 = r11.f16298a;	 Catch:{ zzcw -> 0x00c0 }
        r12 = r12.zztb();	 Catch:{ zzcw -> 0x00c0 }
        if (r12 == 0) goto L_0x00da;	 Catch:{ zzcw -> 0x00c0 }
    L_0x00a1:
        r1 = r12.m20182a(r0);	 Catch:{ zzcw -> 0x00c0 }
        if (r1 == 0) goto L_0x00da;	 Catch:{ zzcw -> 0x00c0 }
    L_0x00a7:
        r1 = r11.f16298a;	 Catch:{ zzcw -> 0x00c0 }
        r1 = r1.getContext();	 Catch:{ zzcw -> 0x00c0 }
        r4 = r11.f16298a;	 Catch:{ zzcw -> 0x00c0 }
        if (r4 != 0) goto L_0x00b2;	 Catch:{ zzcw -> 0x00c0 }
    L_0x00b1:
        throw r3;	 Catch:{ zzcw -> 0x00c0 }
    L_0x00b2:
        r4 = (android.view.View) r4;	 Catch:{ zzcw -> 0x00c0 }
        r3 = r11.f16298a;	 Catch:{ zzcw -> 0x00c0 }
        r3 = r3.zzsi();	 Catch:{ zzcw -> 0x00c0 }
        r12 = r12.m20179a(r0, r1, r4, r3);	 Catch:{ zzcw -> 0x00c0 }
        r0 = r12;
        goto L_0x00da;
    L_0x00c0:
        r12 = "Unable to append parameter to URL: ";
        r1 = java.lang.String.valueOf(r13);
        r3 = r1.length();
        if (r3 == 0) goto L_0x00d1;
    L_0x00cc:
        r12 = r12.concat(r1);
        goto L_0x00d7;
    L_0x00d1:
        r1 = new java.lang.String;
        r1.<init>(r12);
        r12 = r1;
    L_0x00d7:
        com.google.android.gms.internal.hx.m19916e(r12);
    L_0x00da:
        r12 = r11.f16317v;
        if (r12 == 0) goto L_0x00ed;
    L_0x00de:
        r12 = r11.f16317v;
        r12 = r12.b();
        if (r12 == 0) goto L_0x00e7;
    L_0x00e6:
        goto L_0x00ed;
    L_0x00e7:
        r12 = r11.f16317v;
        r12.a(r13);
        return r2;
    L_0x00ed:
        r12 = new com.google.android.gms.ads.internal.overlay.zzc;
        r4 = "android.intent.action.VIEW";
        r5 = r0.toString();
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r3 = r12;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10);
        r11.m19999a(r12);
        return r2;
    L_0x0102:
        r12 = "AdWebView unable to handle URL: ";
        r13 = java.lang.String.valueOf(r13);
        r0 = r13.length();
        if (r0 == 0) goto L_0x0113;
    L_0x010e:
        r12 = r12.concat(r13);
        goto L_0x0119;
    L_0x0113:
        r13 = new java.lang.String;
        r13.<init>(r12);
        r12 = r13;
    L_0x0119:
        com.google.android.gms.internal.hx.m19916e(r12);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ku.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
