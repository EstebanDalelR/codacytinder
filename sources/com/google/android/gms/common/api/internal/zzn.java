package com.google.android.gms.common.api.internal;

import android.support.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;

@VisibleForTesting
public interface zzn<R> {
    void setResult(R r);

    void zzu(Status status);
}
