package com.google.android.gms.internal;

import android.location.Location;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.C2414k;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.C2350a;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@zzzv
public final class asp implements NativeMediationAdRequest {
    /* renamed from: a */
    private final Date f26799a;
    /* renamed from: b */
    private final int f26800b;
    /* renamed from: c */
    private final Set<String> f26801c;
    /* renamed from: d */
    private final boolean f26802d;
    /* renamed from: e */
    private final Location f26803e;
    /* renamed from: f */
    private final int f26804f;
    /* renamed from: g */
    private final zzpe f26805g;
    /* renamed from: h */
    private final List<String> f26806h = new ArrayList();
    /* renamed from: i */
    private final boolean f26807i;
    /* renamed from: j */
    private final Map<String, Boolean> f26808j = new HashMap();

    public asp(@Nullable Date date, int i, @Nullable Set<String> set, @Nullable Location location, boolean z, int i2, zzpe zzpe, List<String> list, boolean z2) {
        this.f26799a = date;
        this.f26800b = i;
        this.f26801c = set;
        this.f26803e = location;
        this.f26802d = z;
        this.f26804f = i2;
        this.f26805g = zzpe;
        this.f26807i = z2;
        String str = "custom:";
        if (list != null) {
            for (String str2 : list) {
                if (str2.startsWith(str)) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        Map map;
                        Object obj;
                        Object valueOf;
                        if ("true".equals(split[2])) {
                            map = this.f26808j;
                            obj = split[1];
                            valueOf = Boolean.valueOf(true);
                        } else if ("false".equals(split[2])) {
                            map = this.f26808j;
                            obj = split[1];
                            valueOf = Boolean.valueOf(false);
                        }
                        map.put(obj, valueOf);
                    }
                } else {
                    this.f26806h.add(str2);
                }
            }
        }
    }

    public final float getAdVolume() {
        return akj.m19303a().m19306b();
    }

    public final Date getBirthday() {
        return this.f26799a;
    }

    public final int getGender() {
        return this.f26800b;
    }

    public final Set<String> getKeywords() {
        return this.f26801c;
    }

    public final Location getLocation() {
        return this.f26803e;
    }

    public final NativeAdOptions getNativeAdOptions() {
        if (this.f26805g == null) {
            return null;
        }
        C2350a b = new C2350a().a(this.f26805g.zzbve).a(this.f26805g.zzbvf).b(this.f26805g.zzbvg);
        if (this.f26805g.versionCode >= 2) {
            b.b(this.f26805g.zzbvh);
        }
        if (this.f26805g.versionCode >= 3 && this.f26805g.zzbvi != null) {
            b.a(new C2414k(this.f26805g.zzbvi));
        }
        return b.a();
    }

    public final boolean isAdMuted() {
        return akj.m19303a().m19307c();
    }

    public final boolean isAppInstallAdRequested() {
        return this.f26806h != null && this.f26806h.contains("2");
    }

    public final boolean isContentAdRequested() {
        return this.f26806h != null && this.f26806h.contains("1");
    }

    public final boolean isDesignedForFamilies() {
        return this.f26807i;
    }

    public final boolean isTesting() {
        return this.f26802d;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f26804f;
    }

    public final boolean zzmo() {
        return this.f26806h != null && this.f26806h.contains("3");
    }

    public final Map<String, Boolean> zzmp() {
        return this.f26808j;
    }
}
