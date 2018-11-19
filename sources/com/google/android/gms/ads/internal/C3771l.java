package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.aga;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzano;

/* renamed from: com.google.android.gms.ads.internal.l */
final class C3771l implements zzano {
    /* renamed from: a */
    private /* synthetic */ dl f11828a;
    /* renamed from: b */
    private /* synthetic */ C4458k f11829b;

    C3771l(C4458k c4458k, dl dlVar) {
        this.f11829b = c4458k;
        this.f11828a = dlVar;
    }

    public final void zzdc() {
        Context context = this.f11829b.e.f7163c;
        zzanh zzanh = this.f11828a.f15970b;
        if (zzanh == null) {
            throw null;
        }
        new aga(context, (View) zzanh).a(this.f11828a.f15970b);
    }
}
