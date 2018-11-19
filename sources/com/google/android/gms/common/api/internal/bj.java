package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.ph;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class bj {
    /* renamed from: a */
    private static final ExecutorService f7500a = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ph("GAC_Transform"));

    /* renamed from: a */
    public static ExecutorService m8981a() {
        return f7500a;
    }
}
