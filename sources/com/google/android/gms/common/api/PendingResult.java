package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.concurrent.TimeUnit;

public abstract class PendingResult<R extends Result> {

    public interface zza {
        void zzr(Status status);
    }

    @NonNull
    /* renamed from: a */
    public abstract R mo2484a(long j, @NonNull TimeUnit timeUnit);

    /* renamed from: a */
    public abstract void mo2485a();

    /* renamed from: a */
    public void mo2486a(@NonNull zza zza) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo2487a(@NonNull ResultCallback<? super R> resultCallback);

    /* renamed from: b */
    public abstract boolean mo2488b();

    @Nullable
    /* renamed from: c */
    public Integer mo2489c() {
        throw new UnsupportedOperationException();
    }
}
