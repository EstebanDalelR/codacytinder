package com.google.android.gms.internal;

import android.os.RemoteException;

final class aqi implements aqk {
    /* renamed from: a */
    private /* synthetic */ int f23048a;

    aqi(aqa aqa, int i) {
        this.f23048a = i;
    }

    /* renamed from: a */
    public final void mo4450a(aql aql) throws RemoteException {
        if (aql.f15582e != null) {
            aql.f15582e.onRewardedVideoAdFailedToLoad(this.f23048a);
        }
    }
}
