package com.google.android.gms.internal;

import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.ad;

public final class sg {
    /* renamed from: a */
    public static Looper m20168a() {
        ad.a(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }

    /* renamed from: a */
    public static Looper m20169a(@Nullable Looper looper) {
        return looper != null ? looper : m20168a();
    }
}
