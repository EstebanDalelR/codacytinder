package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.internal.bb;
import com.google.android.gms.common.api.internal.bh;
import com.google.android.gms.internal.rw;
import com.google.android.gms.internal.zzcfo;
import com.google.android.gms.location.C6281c.C7364a;
import com.google.android.gms.tasks.C4501b;

/* renamed from: com.google.android.gms.location.t */
final class C6283t extends bh<rw, C4485e> {
    /* renamed from: a */
    private /* synthetic */ zzcfo f23550a;
    /* renamed from: b */
    private /* synthetic */ bb f23551b;

    C6283t(C6281c c6281c, bb bbVar, zzcfo zzcfo, bb bbVar2) {
        this.f23550a = zzcfo;
        this.f23551b = bbVar2;
        super(bbVar);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m27598a(zzb zzb, C4501b c4501b) throws RemoteException {
        ((rw) zzb).m34603a(this.f23550a, this.f23551b, new C7364a(c4501b));
    }
}
