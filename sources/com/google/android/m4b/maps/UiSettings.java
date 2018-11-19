package com.google.android.m4b.maps;

import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p124x.ak;

public final class UiSettings {
    /* renamed from: a */
    private final ak f16769a;

    UiSettings(ak akVar) {
        this.f16769a = akVar;
    }

    /* renamed from: a */
    public final void m20409a(boolean z) {
        try {
            this.f16769a.mo5721e(z);
        } catch (boolean z2) {
            throw new RuntimeRemoteException(z2);
        }
    }

    /* renamed from: b */
    public final void m20410b(boolean z) {
        try {
            this.f16769a.mo5722f(z);
        } catch (boolean z2) {
            throw new RuntimeRemoteException(z2);
        }
    }

    /* renamed from: c */
    public final void m20411c(boolean z) {
        try {
            this.f16769a.mo5728l(z);
        } catch (boolean z2) {
            throw new RuntimeRemoteException(z2);
        }
    }
}
