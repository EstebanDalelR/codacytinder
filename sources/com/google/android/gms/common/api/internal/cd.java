package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C4501b;

public final class cd<TResult> extends C2475a {
    /* renamed from: a */
    private final bs<zzb, TResult> f11958a;
    /* renamed from: b */
    private final C4501b<TResult> f11959b;
    /* renamed from: c */
    private final zzcz f11960c;

    public cd(int i, bs<zzb, TResult> bsVar, C4501b<TResult> c4501b, zzcz zzcz) {
        super(i);
        this.f11959b = c4501b;
        this.f11958a = bsVar;
        this.f11960c = zzcz;
    }

    /* renamed from: a */
    public final void mo2526a(@NonNull Status status) {
        this.f11959b.b(this.f11960c.zzt(status));
    }

    /* renamed from: a */
    public final void mo2527a(an<?> anVar) throws DeadObjectException {
        try {
            this.f11958a.m8982a(anVar.m17194b(), this.f11959b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo2526a(C2475a.m8927b(e2));
        }
    }

    /* renamed from: a */
    public final void mo2528a(@NonNull C2477f c2477f, boolean z) {
        c2477f.m9008a(this.f11959b, z);
    }
}
