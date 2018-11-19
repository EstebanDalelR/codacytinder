package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C4501b;

public final class bo extends C3812z<Void> {
    /* renamed from: b */
    private bh<zzb, ?> f13973b;
    /* renamed from: c */
    private cc<zzb, ?> f13974c;

    public bo(bi biVar, C4501b<Void> c4501b) {
        super(3, c4501b);
        this.f13973b = biVar.f7498a;
        this.f13974c = biVar.f7499b;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2526a(@NonNull Status status) {
        super.mo2526a(status);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2528a(@NonNull C2477f c2477f, boolean z) {
    }

    /* renamed from: b */
    public final void mo3570b(an<?> anVar) throws RemoteException {
        this.f13973b.m8979a(anVar.m17194b(), this.a);
        if (this.f13973b.m8978a() != null) {
            anVar.m17195c().put(this.f13973b.m8978a(), new bi(this.f13973b, this.f13974c));
        }
    }
}
