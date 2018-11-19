package bolts;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bolts.a */
final class C0752a {
    /* renamed from: a */
    static final int f2056a = (f2059e + 1);
    /* renamed from: b */
    static final int f2057b = ((f2059e * 2) + 1);
    /* renamed from: c */
    private static final C0752a f2058c = new C0752a();
    /* renamed from: e */
    private static final int f2059e = Runtime.getRuntime().availableProcessors();
    /* renamed from: d */
    private final Executor f2060d = new C0751a();

    /* renamed from: bolts.a$a */
    private static class C0751a implements Executor {
        private C0751a() {
        }

        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private C0752a() {
    }

    /* renamed from: a */
    public static ExecutorService m2664a() {
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(f2056a, f2057b, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        C0752a.m2665a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m2665a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        if (VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(z);
        }
    }

    /* renamed from: b */
    public static Executor m2666b() {
        return f2058c.f2060d;
    }
}
