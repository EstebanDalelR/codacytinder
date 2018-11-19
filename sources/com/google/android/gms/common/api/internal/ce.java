package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C4501b;

public final class ce extends C3812z<Boolean> {
    /* renamed from: b */
    private bd<?> f13979b;

    public ce(bd<?> bdVar, C4501b<Boolean> c4501b) {
        super(4, c4501b);
        this.f13979b = bdVar;
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
        bi biVar = (bi) anVar.m17195c().remove(this.f13979b);
        if (biVar != null) {
            biVar.f7499b.m8990a(anVar.m17194b(), this.a);
            biVar.f7498a.m8980b();
            return;
        }
        this.a.b(Boolean.valueOf(false));
    }
}
