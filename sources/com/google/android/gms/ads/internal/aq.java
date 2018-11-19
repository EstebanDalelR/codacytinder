package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzjj;
import java.util.Map;
import java.util.TreeMap;

final class aq {
    /* renamed from: a */
    private final String f7109a;
    /* renamed from: b */
    private final Map<String, String> f7110b = new TreeMap();
    /* renamed from: c */
    private String f7111c;
    /* renamed from: d */
    private String f7112d;

    public aq(String str) {
        this.f7109a = str;
    }

    /* renamed from: a */
    public final String m8635a() {
        return this.f7112d;
    }

    /* renamed from: a */
    public final void m8636a(zzjj zzjj, zzakd zzakd) {
        this.f7111c = zzjj.zzbdm.zzbgw;
        Bundle bundle = zzjj.zzbdp != null ? zzjj.zzbdp.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle != null) {
            String str = (String) aja.f().a(alo.ci);
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    this.f7112d = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.f7110b.put(str2.substring(4), bundle.getString(str2));
                }
            }
            this.f7110b.put("SDKVersion", zzakd.zzcv);
        }
    }

    /* renamed from: b */
    public final String m8637b() {
        return this.f7111c;
    }

    /* renamed from: c */
    public final String m8638c() {
        return this.f7109a;
    }

    /* renamed from: d */
    public final Map<String, String> m8639d() {
        return this.f7110b;
    }
}
