package com.evernote.android.job;

import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import com.evernote.android.job.util.C3142c;
import com.evernote.android.job.util.Clock;
import com.evernote.android.job.util.JobLogger;
import java.util.EnumMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.evernote.android.job.b */
public final class C1133b {
    /* renamed from: a */
    private static final EnumMap<JobApi, Boolean> f2971a = new EnumMap(JobApi.class);
    /* renamed from: b */
    private static final C3142c f2972b = new C3142c("JobConfig");
    /* renamed from: c */
    private static final ExecutorService f2973c = Executors.newCachedThreadPool(new C11311());
    /* renamed from: d */
    private static volatile boolean f2974d = false;
    /* renamed from: e */
    private static volatile boolean f2975e = false;
    /* renamed from: f */
    private static volatile long f2976f = 3000;
    /* renamed from: g */
    private static volatile boolean f2977g = false;
    /* renamed from: h */
    private static volatile int f2978h = 0;
    /* renamed from: i */
    private static volatile boolean f2979i = false;
    /* renamed from: j */
    private static volatile Clock f2980j = Clock.f3015a;
    /* renamed from: k */
    private static volatile ExecutorService f2981k = f2973c;

    /* renamed from: com.evernote.android.job.b$1 */
    static class C11311 implements ThreadFactory {
        /* renamed from: a */
        private final AtomicInteger f2969a = new AtomicInteger();

        C11311() {
        }

        public Thread newThread(@NonNull Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AndroidJob-");
            stringBuilder.append(this.f2969a.incrementAndGet());
            Thread thread = new Thread(runnable, stringBuilder.toString());
            if (thread.isDaemon() != null) {
                thread.setDaemon(null);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    static {
        for (Enum put : JobApi.values()) {
            f2971a.put(put, Boolean.TRUE);
        }
    }

    /* renamed from: a */
    public static boolean m3794a(@NonNull JobApi jobApi) {
        return ((Boolean) f2971a.get(jobApi)).booleanValue();
    }

    /* renamed from: a */
    public static boolean m3793a() {
        return f2974d && VERSION.SDK_INT < 24;
    }

    /* renamed from: b */
    public static boolean m3796b() {
        return f2975e;
    }

    /* renamed from: a */
    public static synchronized boolean m3795a(@NonNull JobLogger jobLogger) {
        synchronized (C1133b.class) {
            jobLogger = C3142c.m12114a(jobLogger);
        }
        return jobLogger;
    }

    /* renamed from: c */
    public static long m3797c() {
        return f2976f;
    }

    /* renamed from: d */
    static boolean m3798d() {
        return f2977g;
    }

    /* renamed from: e */
    public static int m3799e() {
        return f2978h;
    }

    /* renamed from: f */
    public static boolean m3800f() {
        return f2979i;
    }

    /* renamed from: g */
    public static Clock m3801g() {
        return f2980j;
    }

    /* renamed from: h */
    public static ExecutorService m3802h() {
        return f2981k;
    }
}
