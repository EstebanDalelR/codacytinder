package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.ar;
import java.util.Map;

@zzzv
public final class atn {
    /* renamed from: a */
    private final zzanh f15712a;
    /* renamed from: b */
    private final boolean f15713b;
    /* renamed from: c */
    private final String f15714c;

    public atn(zzanh zzanh, Map<String, String> map) {
        this.f15712a = zzanh;
        this.f15714c = (String) map.get("forceOrientation");
        this.f15713b = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
    }

    /* renamed from: a */
    public final void m19474a() {
        if (this.f15712a == null) {
            hx.m19916e("AdWebView is null");
            return;
        }
        int b = "portrait".equalsIgnoreCase(this.f15714c) ? ar.g().mo4621b() : "landscape".equalsIgnoreCase(this.f15714c) ? ar.g().mo4619a() : this.f15713b ? -1 : ar.g().mo8355c();
        this.f15712a.setRequestedOrientation(b);
    }
}
