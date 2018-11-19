package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public final class ax<A extends ck<? extends Result, zzb>> extends C2475a {
    /* renamed from: a */
    private A f11921a;

    public ax(int i, A a) {
        super(i);
        this.f11921a = a;
    }

    /* renamed from: a */
    public final void mo2526a(@NonNull Status status) {
        this.f11921a.zzu(status);
    }

    /* renamed from: a */
    public final void mo2527a(an<?> anVar) throws DeadObjectException {
        this.f11921a.m17239b(anVar.m17194b());
    }

    /* renamed from: a */
    public final void mo2528a(@NonNull C2477f c2477f, boolean z) {
        c2477f.m9007a(this.f11921a, z);
    }
}
