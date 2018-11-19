package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public final class aq implements ServiceConnection {
    /* renamed from: a */
    private final int f7609a;
    /* renamed from: b */
    private /* synthetic */ al f7610b;

    public aq(al alVar, int i) {
        this.f7610b = alVar;
        this.f7609a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f7610b.m9072c(16);
            return;
        }
        synchronized (this.f7610b.f7593o) {
            zzay zzay;
            al alVar = this.f7610b;
            if (iBinder == null) {
                zzay = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                zzay = (queryLocalInterface == null || !(queryLocalInterface instanceof zzay)) ? new C3825s(iBinder) : (zzay) queryLocalInterface;
            }
            alVar.f7594p = zzay;
        }
        this.f7610b.m9083a(0, null, this.f7609a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f7610b.f7593o) {
            this.f7610b.f7594p = null;
        }
        this.f7610b.f7579a.sendMessage(this.f7610b.f7579a.obtainMessage(6, this.f7609a, 1));
    }
}
