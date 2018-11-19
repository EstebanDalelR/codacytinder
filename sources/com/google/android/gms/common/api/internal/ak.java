package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.ph;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ak {
    /* renamed from: a */
    private static final ExecutorService f7458a = Executors.newFixedThreadPool(2, new ph("GAC_Executor"));

    /* renamed from: a */
    public static ExecutorService m8933a() {
        return f7458a;
    }
}
