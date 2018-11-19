package android.arch.core.p002a;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.arch.core.a.b */
public class C2674b extends C0004c {
    /* renamed from: a */
    private final Object f8478a = new Object();
    /* renamed from: b */
    private ExecutorService f8479b = Executors.newFixedThreadPool(2);
    @Nullable
    /* renamed from: c */
    private volatile Handler f8480c;

    /* renamed from: a */
    public void mo15a(Runnable runnable) {
        this.f8479b.execute(runnable);
    }

    /* renamed from: b */
    public void mo16b(Runnable runnable) {
        if (this.f8480c == null) {
            synchronized (this.f8478a) {
                if (this.f8480c == null) {
                    this.f8480c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f8480c.post(runnable);
    }

    /* renamed from: d */
    public boolean mo17d() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
