package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2505t;
import com.google.android.gms.internal.rj;
import com.google.android.gms.internal.zzceo;
import com.google.android.gms.tasks.C4501b;

/* renamed from: com.google.android.gms.location.v */
final class C7366v extends rj {
    /* renamed from: a */
    private /* synthetic */ C4501b f27082a;

    C7366v(C6281c c6281c, C4501b c4501b) {
        this.f27082a = c4501b;
    }

    public final void zza(zzceo zzceo) throws RemoteException {
        Status status = zzceo.getStatus();
        if (status == null) {
            this.f27082a.m20375b(new ApiException(new Status(8, "Got null status from location service")));
        } else if (status.getStatusCode() == 0) {
            this.f27082a.m20374a(Boolean.valueOf(true));
        } else {
            this.f27082a.m20375b(C2505t.a(status));
        }
    }
}
