package com.google.android.gms.internal;

import android.os.RemoteException;

final class apv implements aqk {
    /* renamed from: a */
    private /* synthetic */ String f23044a;
    /* renamed from: b */
    private /* synthetic */ String f23045b;

    apv(apu apu, String str, String str2) {
        this.f23044a = str;
        this.f23045b = str2;
    }

    /* renamed from: a */
    public final void mo4450a(aql aql) throws RemoteException {
        if (aql.f15579b != null) {
            aql.f15579b.onAppEvent(this.f23044a, this.f23045b);
        }
    }
}
