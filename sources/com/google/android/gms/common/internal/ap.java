package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.BinderThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

public final class ap extends C3824r {
    /* renamed from: a */
    private al f13986a;
    /* renamed from: b */
    private final int f13987b;

    public ap(@NonNull al alVar, int i) {
        this.f13986a = alVar;
        this.f13987b = i;
    }

    @BinderThread
    public final void zza(int i, @Nullable Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @BinderThread
    public final void zza(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
        ad.m9046a(this.f13986a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
        this.f13986a.m9084a(i, iBinder, bundle, this.f13987b);
        this.f13986a = null;
    }
}
