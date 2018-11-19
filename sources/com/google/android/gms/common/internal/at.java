package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.support.annotation.BinderThread;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

public final class at extends am {
    /* renamed from: a */
    private /* synthetic */ al f13990a;

    @BinderThread
    public at(al alVar, int i, @Nullable Bundle bundle) {
        this.f13990a = alVar;
        super(alVar, i, null);
    }

    /* renamed from: a */
    protected final void mo3581a(ConnectionResult connectionResult) {
        this.f13990a.f7580b.zzf(connectionResult);
        this.f13990a.m9086a(connectionResult);
    }

    /* renamed from: a */
    protected final boolean mo3582a() {
        this.f13990a.f7580b.zzf(ConnectionResult.zzfkr);
        return true;
    }
}
