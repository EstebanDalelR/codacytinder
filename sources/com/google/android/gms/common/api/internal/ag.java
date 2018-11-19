package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

final class ag extends aw {
    /* renamed from: a */
    private WeakReference<aa> f11912a;

    ag(aa aaVar) {
        this.f11912a = new WeakReference(aaVar);
    }

    /* renamed from: a */
    public final void mo2520a() {
        aa aaVar = (aa) this.f11912a.get();
        if (aaVar != null) {
            aaVar.m14241q();
        }
    }
}
