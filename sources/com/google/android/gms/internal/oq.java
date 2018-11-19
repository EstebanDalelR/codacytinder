package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zzn;

final class oq extends ol {
    /* renamed from: a */
    private final zzn<Status> f28806a;

    public oq(zzn<Status> zzn) {
        this.f28806a = zzn;
    }

    public final void zzci(int i) throws RemoteException {
        this.f28806a.setResult(new Status(i));
    }
}
