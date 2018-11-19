package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.bo;
import com.google.android.gms.common.util.C2520d;
import com.google.android.gms.internal.ati;
import com.google.android.gms.internal.atl;
import com.google.android.gms.internal.atn;
import com.google.android.gms.internal.ato;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzzv;
import java.util.Map;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.gmsg.b */
public final class C3738b implements zzt<zzanh> {
    /* renamed from: c */
    private static Map<String, Integer> f11786c = C2520d.m9194a("resize", Integer.valueOf(1), "playVideo", Integer.valueOf(2), "storePicture", Integer.valueOf(3), "createCalendarEvent", Integer.valueOf(4), "setOrientationProperties", Integer.valueOf(5), "closeResizedAd", Integer.valueOf(6));
    /* renamed from: a */
    private final bo f11787a;
    /* renamed from: b */
    private final atl f11788b;

    public C3738b(bo boVar, atl atl) {
        this.f11787a = boVar;
        this.f11788b = atl;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzanh zzanh = (zzanh) obj;
        int intValue = ((Integer) f11786c.get((String) map.get("a"))).intValue();
        if (intValue != 5 && this.f11787a != null && !this.f11787a.m8690b()) {
            this.f11787a.m8689a(null);
        } else if (intValue != 1) {
            switch (intValue) {
                case 3:
                    new ato(zzanh, map).a();
                    return;
                case 4:
                    new ati(zzanh, map).a();
                    return;
                case 5:
                    new atn(zzanh, map).a();
                    return;
                case 6:
                    this.f11788b.a(true);
                    return;
                default:
                    ec.d("Unknown MRAID command called.");
                    return;
            }
        } else {
            this.f11788b.a(map);
        }
    }
}
