package com.snapchat.kit.sdk.core.security;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import javax.inject.Inject;

public class Fingerprint {
    /* renamed from: a */
    private final String f21772a;

    @Nullable
    private native String sign(@NonNull String str);

    @Inject
    public Fingerprint(@NonNull Context context) {
        System.loadLibrary("c++_shared");
        System.loadLibrary("pruneau");
        this.f21772a = context.getPackageName();
    }

    @Nullable
    /* renamed from: a */
    public synchronized String m25548a() {
        return sign(m25547b());
    }

    /* renamed from: b */
    private String m25547b() {
        long currentTimeMillis = System.currentTimeMillis();
        return String.format("%s:%d", new Object[]{this.f21772a, Long.valueOf(currentTimeMillis)});
    }
}
