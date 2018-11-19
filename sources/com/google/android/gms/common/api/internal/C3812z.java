package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C4501b;

/* renamed from: com.google.android.gms.common.api.internal.z */
abstract class C3812z<T> extends C2475a {
    /* renamed from: a */
    protected final C4501b<T> f12041a;

    public C3812z(int i, C4501b<T> c4501b) {
        super(i);
        this.f12041a = c4501b;
    }

    /* renamed from: a */
    public void mo2526a(@NonNull Status status) {
        this.f12041a.b(new ApiException(status));
    }

    /* renamed from: a */
    public final void mo2527a(an<?> anVar) throws DeadObjectException {
        try {
            mo3570b(anVar);
        } catch (RemoteException e) {
            mo2526a(C2475a.m8927b(e));
            throw e;
        } catch (RemoteException e2) {
            mo2526a(C2475a.m8927b(e2));
        }
    }

    /* renamed from: a */
    public void mo2528a(@NonNull C2477f c2477f, boolean z) {
    }

    /* renamed from: b */
    protected abstract void mo3570b(an<?> anVar) throws RemoteException;
}
