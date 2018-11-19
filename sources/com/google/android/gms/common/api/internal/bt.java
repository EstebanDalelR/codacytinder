package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C4500a;
import com.google.android.gms.tasks.C4501b;

public final class bt {
    @Deprecated
    /* renamed from: a */
    public static C4500a<Void> m8983a(C4500a<Boolean> c4500a) {
        return c4500a.a(new bu());
    }

    /* renamed from: a */
    public static <TResult> void m8984a(Status status, TResult tResult, C4501b<TResult> c4501b) {
        if (status.isSuccess()) {
            c4501b.a(tResult);
        } else {
            c4501b.a(new ApiException(status));
        }
    }
}
