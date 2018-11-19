package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@zzzv
public final class fe {
    /* renamed from: a */
    public static final ThreadPoolExecutor f16050a = new ThreadPoolExecutor(20, 20, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), m19678a("Default"));
    /* renamed from: b */
    private static final ThreadPoolExecutor f16051b = new ThreadPoolExecutor(5, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), m19678a("Loader"));

    static {
        f16050a.allowCoreThreadTimeOut(true);
        f16051b.allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public static zzakv<Void> m19675a(int i, Runnable runnable) {
        ExecutorService executorService;
        Callable ffVar;
        if (i == 1) {
            executorService = f16051b;
            ffVar = new ff(runnable);
        } else {
            executorService = f16050a;
            ffVar = new fg(runnable);
        }
        return m19677a(executorService, ffVar);
    }

    /* renamed from: a */
    public static zzakv<Void> m19676a(Runnable runnable) {
        return m19675a(0, runnable);
    }

    /* renamed from: a */
    public static <T> zzakv<T> m19677a(ExecutorService executorService, Callable<T> callable) {
        zzakv<T> iwVar = new iw();
        try {
            iwVar.zza(new fi(iwVar, executorService.submit(new fh(iwVar, callable))), ir.f16195a);
            return iwVar;
        } catch (Throwable e) {
            hx.m19914c("Thread execution is rejected.", e);
            iwVar.m27363a(e);
            return iwVar;
        }
    }

    /* renamed from: a */
    private static ThreadFactory m19678a(String str) {
        return new fj(str);
    }
}
