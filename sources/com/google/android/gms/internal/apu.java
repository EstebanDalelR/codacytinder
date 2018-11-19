package com.google.android.gms.internal;

import android.os.RemoteException;

final class apu extends ajp {
    /* renamed from: a */
    private /* synthetic */ apl f26769a;

    apu(apl apl) {
        this.f26769a = apl;
    }

    public final void onAppEvent(String str, String str2) throws RemoteException {
        this.f26769a.f15575a.add(new apv(this, str, str2));
    }
}
