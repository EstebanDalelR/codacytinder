package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.internal.bd;
import com.google.android.gms.common.api.internal.cc;
import com.google.android.gms.internal.rw;
import com.google.android.gms.tasks.C4501b;

/* renamed from: com.google.android.gms.location.u */
final class C6284u extends cc<rw, C4485e> {
    /* renamed from: a */
    private /* synthetic */ C6281c f23552a;

    C6284u(C6281c c6281c, bd bdVar) {
        this.f23552a = c6281c;
        super(bdVar);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m27599a(zzb zzb, C4501b c4501b) throws RemoteException {
        try {
            ((rw) zzb).m34610b(a(), this.f23552a.m27591a(c4501b));
        } catch (Exception e) {
            c4501b.m20375b(e);
        }
    }
}
