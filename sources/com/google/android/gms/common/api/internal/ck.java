package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C2462b;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.aj;

@VisibleForTesting
public abstract class ck<R extends Result, A extends zzb> extends BasePendingResult<R> implements zzn<R> {
    /* renamed from: a */
    private final C2462b<A> f13981a;
    /* renamed from: b */
    private final Api<?> f13982b;

    protected ck(@NonNull Api<?> api, @NonNull GoogleApiClient googleApiClient) {
        super((GoogleApiClient) ad.m9046a((Object) googleApiClient, (Object) "GoogleApiClient must not be null"));
        ad.m9046a((Object) api, (Object) "Api must not be null");
        this.f13981a = api.m8846c();
        this.f13982b = api;
    }

    /* renamed from: a */
    private final void m17237a(@NonNull RemoteException remoteException) {
        zzu(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    /* renamed from: a */
    protected abstract void mo4016a(@NonNull A a) throws RemoteException;

    /* renamed from: b */
    public final void m17239b(@NonNull A a) throws DeadObjectException {
        if (a instanceof aj) {
            zzb c = aj.m18160c();
        }
        try {
            mo4016a(c);
        } catch (RemoteException e) {
            m17237a(e);
            throw e;
        } catch (RemoteException e2) {
            m17237a(e2);
        }
    }

    /* renamed from: g */
    public final C2462b<A> mo3575g() {
        return this.f13981a;
    }

    /* renamed from: h */
    public final Api<?> m17241h() {
        return this.f13982b;
    }

    public /* synthetic */ void setResult(Object obj) {
        super.m14223a((Result) obj);
    }

    public final void zzu(@NonNull Status status) {
        ad.m9055b(status.isSuccess() ^ 1, "Failed result must not be success");
        m14223a(mo3568a(status));
    }
}
