package com.google.android.gms.common.api.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C4500a;
import com.google.android.gms.tasks.Continuation;

final class bu implements Continuation<Boolean, Void> {
    bu() {
    }

    public final /* synthetic */ Object then(@NonNull C4500a c4500a) throws Exception {
        if (((Boolean) c4500a.c()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
