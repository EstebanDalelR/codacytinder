package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.internal.dy;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.zzzv;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.overlay.h */
final class C4276h extends dy {
    /* renamed from: a */
    final /* synthetic */ C4275c f13921a;

    private C4276h(C4275c c4275c) {
        this.f13921a = c4275c;
    }

    /* renamed from: a */
    public final void m17153a() {
        Bitmap a = ar.m8666w().a(Integer.valueOf(this.f13921a.f13901a.zzcjg.zzaqt));
        if (a != null) {
            fk.f16060a.post(new C2399i(this, ar.m8650g().a(this.f13921a.f13902c, a, this.f13921a.f13901a.zzcjg.zzaqr, this.f13921a.f13901a.zzcjg.zzaqs)));
        }
    }

    /* renamed from: b */
    public final void m17154b() {
    }
}
