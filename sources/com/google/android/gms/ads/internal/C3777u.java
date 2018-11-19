package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzvj;
import com.google.android.gms.internal.zzvm;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.u */
final class C3777u implements zzt<zzanh> {
    /* renamed from: a */
    private /* synthetic */ zzvj f11838a;
    /* renamed from: b */
    private /* synthetic */ C2370c f11839b;
    /* renamed from: c */
    private /* synthetic */ zzvm f11840c;

    C3777u(zzvj zzvj, C2370c c2370c, zzvm zzvm) {
        this.f11838a = zzvj;
        this.f11839b = c2370c;
        this.f11840c = zzvm;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzanh zzanh = (zzanh) obj;
        if (zzanh == null) {
            throw null;
        }
        Object obj2 = (View) zzanh;
        if (obj2 != null) {
            try {
                if (this.f11838a == null) {
                    if (this.f11840c != null) {
                        if (this.f11840c.getOverrideClickHandling()) {
                            C2406p.m8744b(zzanh);
                        } else {
                            this.f11840c.zzh(C4296b.m17261a(obj2));
                            this.f11839b.f7221a.onAdClicked();
                        }
                    }
                } else if (this.f11838a.getOverrideClickHandling()) {
                    C2406p.m8744b(zzanh);
                } else {
                    this.f11838a.zzh(C4296b.m17261a(obj2));
                    this.f11839b.f7221a.onAdClicked();
                }
            } catch (Throwable e) {
                ec.c("Unable to call handleClick on mapper", e);
            }
        }
    }
}
