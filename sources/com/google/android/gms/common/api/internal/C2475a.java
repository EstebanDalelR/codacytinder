package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.C2526k;

/* renamed from: com.google.android.gms.common.api.internal.a */
public abstract class C2475a {
    /* renamed from: a */
    private int f7454a;

    public C2475a(int i) {
        this.f7454a = i;
    }

    /* renamed from: b */
    private static Status m8927b(RemoteException remoteException) {
        StringBuilder stringBuilder = new StringBuilder();
        if (C2526k.m9210a() && (remoteException instanceof TransactionTooLargeException)) {
            stringBuilder.append("TransactionTooLargeException: ");
        }
        stringBuilder.append(remoteException.getLocalizedMessage());
        return new Status(8, stringBuilder.toString());
    }

    /* renamed from: a */
    public abstract void mo2526a(@NonNull Status status);

    /* renamed from: a */
    public abstract void mo2527a(an<?> anVar) throws DeadObjectException;

    /* renamed from: a */
    public abstract void mo2528a(@NonNull C2477f c2477f, boolean z);
}
