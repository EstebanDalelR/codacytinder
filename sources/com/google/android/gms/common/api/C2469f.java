package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;

/* renamed from: com.google.android.gms.common.api.f */
public abstract class C2469f<R extends Result, S extends Result> {
    @Nullable
    @WorkerThread
    /* renamed from: a */
    public abstract PendingResult<S> m8911a(@NonNull R r);

    @NonNull
    /* renamed from: a */
    public Status m8912a(@NonNull Status status) {
        return status;
    }
}
