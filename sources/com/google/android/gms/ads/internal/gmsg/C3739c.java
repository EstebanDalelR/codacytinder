package com.google.android.gms.ads.internal.gmsg;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.foursquare.internal.util.C1948m;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.bo;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.internal.atl;
import com.google.android.gms.internal.dh;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.tb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzaog;
import com.google.android.gms.internal.zzaoh;
import com.google.android.gms.internal.zzaou;
import com.google.android.gms.internal.zzaow;
import com.google.android.gms.internal.zzaoy;
import com.google.android.gms.internal.zzje;
import com.google.android.gms.internal.zzzv;
import com.leanplum.BuildConfig;
import java.util.Map;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.gmsg.c */
public final class C3739c<T extends zzaog & zzaoh & zzaou & zzaow & zzaoy> implements zzt<T> {
    /* renamed from: a */
    private final Context f11789a;
    /* renamed from: b */
    private final tb f11790b;
    /* renamed from: c */
    private zzakd f11791c;
    /* renamed from: d */
    private zzq f11792d;
    /* renamed from: e */
    private zzje f11793e;
    /* renamed from: f */
    private zzn f11794f;
    /* renamed from: g */
    private zzb f11795g;
    /* renamed from: h */
    private bo f11796h;
    /* renamed from: i */
    private atl f11797i;
    /* renamed from: j */
    private zzanh f11798j = null;

    public C3739c(Context context, zzakd zzakd, tb tbVar, zzq zzq, zzje zzje, zzb zzb, zzn zzn, bo boVar, atl atl) {
        this.f11789a = context;
        this.f11791c = zzakd;
        this.f11790b = tbVar;
        this.f11792d = zzq;
        this.f11793e = zzje;
        this.f11795g = zzb;
        this.f11796h = boVar;
        this.f11797i = atl;
        this.f11794f = zzn;
    }

    /* renamed from: a */
    private final void m14178a(boolean z) {
        if (this.f11797i != null) {
            this.f11797i.a(z);
        }
    }

    /* renamed from: a */
    private static boolean m14179a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* renamed from: b */
    private static int m14180b(Map<String, String> map) {
        String str = (String) map.get("o");
        if (str != null) {
            if (BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER.equalsIgnoreCase(str)) {
                return ar.m8650g().b();
            }
            if ("l".equalsIgnoreCase(str)) {
                return ar.m8650g().a();
            }
            if ("c".equalsIgnoreCase(str)) {
                return ar.m8650g().c();
            }
        }
        return -1;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        String str;
        zzaog zzaog = (zzaog) obj;
        String a = dh.a((String) map.get("u"), zzaog.getContext());
        String str2 = (String) map.get("a");
        if (str2 == null) {
            ec.e("Action missing from an open GMSG.");
        } else if (this.f11796h != null && !this.f11796h.m8690b()) {
            this.f11796h.m8689a(a);
        } else if ("expand".equalsIgnoreCase(str2)) {
            if (((zzaoh) zzaog).zztc()) {
                ec.e("Cannot expand WebView that is already expanded.");
                return;
            }
            m14178a(false);
            ((zzaou) zzaog).zza(C3739c.m14179a(map), C3739c.m14180b(map));
        } else if ("webapp".equalsIgnoreCase(str2)) {
            m14178a(false);
            if (a != null) {
                ((zzaou) zzaog).zza(C3739c.m14179a(map), C3739c.m14180b(map), a);
            } else {
                ((zzaou) zzaog).zza(C3739c.m14179a(map), C3739c.m14180b(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            m14178a(true);
            zzaog.getContext();
            if (TextUtils.isEmpty(a)) {
                ec.e("Destination url cannot be empty.");
                return;
            }
            r1 = zzaog.getContext();
            r2 = ((zzaow) zzaog).zztb();
            r3 = (zzaoy) zzaog;
            if (r3 == null) {
                throw null;
            }
            try {
                ((zzaou) zzaog).zza(new zzc(new C2376d(r1, r2, (View) r3).m8711a(map)));
            } catch (ActivityNotFoundException e) {
                ec.e(e.getMessage());
            }
        } else {
            Intent parseUri;
            Uri data;
            Context context;
            tb zztb;
            zzaoy zzaoy;
            m14178a(true);
            str2 = (String) map.get("intent_url");
            if (!TextUtils.isEmpty(str2)) {
                try {
                    parseUri = Intent.parseUri(str2, 0);
                } catch (Throwable e2) {
                    str = "Error parsing the url: ";
                    str2 = String.valueOf(str2);
                    ec.b(str2.length() != 0 ? str.concat(str2) : new String(str), e2);
                }
                if (!(parseUri == null || parseUri.getData() == null)) {
                    data = parseUri.getData();
                    str = data.toString();
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            ar.m8648e();
                            context = zzaog.getContext();
                            zztb = ((zzaow) zzaog).zztb();
                            zzaoy = (zzaoy) zzaog;
                            if (zzaoy != null) {
                                throw null;
                            }
                            str = fk.a(context, zztb, str, (View) zzaoy, zzaog.zzsi());
                            try {
                                data = Uri.parse(str);
                            } catch (Throwable e3) {
                                String str3 = "Error parsing the uri: ";
                                str = String.valueOf(str);
                                ec.b(str.length() != 0 ? str3.concat(str) : new String(str3), e3);
                                ar.m8652i().a(e3, "OpenGmsgHandler.onGmsg");
                            }
                        } catch (Throwable e32) {
                            ec.b("Error occurred while adding signals.", e32);
                            ar.m8652i().a(e32, "OpenGmsgHandler.onGmsg");
                        }
                    }
                    parseUri.setData(data);
                }
                if (parseUri == null) {
                    ((zzaou) zzaog).zza(new zzc(parseUri));
                }
                if (!TextUtils.isEmpty(a)) {
                    ar.m8648e();
                    r1 = zzaog.getContext();
                    r2 = ((zzaow) zzaog).zztb();
                    r3 = (zzaoy) zzaog;
                    if (r3 != null) {
                        throw null;
                    }
                    a = fk.a(r1, r2, a, (View) r3, zzaog.zzsi());
                }
                ((zzaou) zzaog).zza(new zzc((String) map.get("i"), a, (String) map.get(C1948m.f5228a), (String) map.get(BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
                return;
            }
            parseUri = null;
            data = parseUri.getData();
            str = data.toString();
            if (TextUtils.isEmpty(str)) {
                ar.m8648e();
                context = zzaog.getContext();
                zztb = ((zzaow) zzaog).zztb();
                zzaoy = (zzaoy) zzaog;
                if (zzaoy != null) {
                    str = fk.a(context, zztb, str, (View) zzaoy, zzaog.zzsi());
                    data = Uri.parse(str);
                } else {
                    throw null;
                }
            }
            parseUri.setData(data);
            if (parseUri == null) {
                if (TextUtils.isEmpty(a)) {
                    ar.m8648e();
                    r1 = zzaog.getContext();
                    r2 = ((zzaow) zzaog).zztb();
                    r3 = (zzaoy) zzaog;
                    if (r3 != null) {
                        a = fk.a(r1, r2, a, (View) r3, zzaog.zzsi());
                    } else {
                        throw null;
                    }
                }
                ((zzaou) zzaog).zza(new zzc((String) map.get("i"), a, (String) map.get(C1948m.f5228a), (String) map.get(BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
                return;
            }
            ((zzaou) zzaog).zza(new zzc(parseUri));
        }
    }
}
