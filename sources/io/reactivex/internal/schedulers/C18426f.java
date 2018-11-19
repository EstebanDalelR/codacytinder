package io.reactivex.internal.schedulers;

import io.reactivex.C15679f.C17362c;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.internal.schedulers.f */
public class C18426f extends C17362c implements Disposable {
    /* renamed from: a */
    volatile boolean f57376a;
    /* renamed from: b */
    private final ScheduledExecutorService f57377b;

    public C18426f(ThreadFactory threadFactory) {
        this.f57377b = C15731g.m58952a(threadFactory);
    }

    @NonNull
    /* renamed from: a */
    public Disposable mo13593a(@NonNull Runnable runnable) {
        return mo13559a(runnable, 0, null);
    }

    @NonNull
    /* renamed from: a */
    public Disposable mo13559a(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        if (this.f57376a) {
            return EmptyDisposable.INSTANCE;
        }
        return m66588a(runnable, j, timeUnit, null);
    }

    /* renamed from: b */
    public Disposable m66590b(Runnable runnable, long j, TimeUnit timeUnit) {
        Disposable scheduledDirectTask = new ScheduledDirectTask(C2667a.a(runnable));
        if (j <= 0) {
            try {
                runnable = this.f57377b.submit(scheduledDirectTask);
            } catch (Runnable runnable2) {
                C2667a.a(runnable2);
                return EmptyDisposable.INSTANCE;
            }
        }
        runnable2 = this.f57377b.schedule(scheduledDirectTask, j, timeUnit);
        scheduledDirectTask.m63719a(runnable2);
        return scheduledDirectTask;
    }

    /* renamed from: b */
    public Disposable m66589b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable = C2667a.a(runnable);
        if (j2 <= 0) {
            j2 = new C17515c(runnable, this.f57377b);
            if (j <= 0) {
                try {
                    runnable = this.f57377b.submit(j2);
                } catch (Runnable runnable2) {
                    C2667a.a(runnable2);
                    return EmptyDisposable.INSTANCE;
                }
            }
            runnable2 = this.f57377b.schedule(j2, j, timeUnit);
            j2.m63733a(runnable2);
            return j2;
        }
        Disposable scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable2);
        try {
            scheduledDirectPeriodicTask.m63719a(this.f57377b.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (Runnable runnable22) {
            C2667a.a(runnable22);
            return EmptyDisposable.INSTANCE;
        }
    }

    @NonNull
    /* renamed from: a */
    public ScheduledRunnable m66588a(Runnable runnable, long j, @NonNull TimeUnit timeUnit, @Nullable DisposableContainer disposableContainer) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(C2667a.a(runnable), disposableContainer);
        if (disposableContainer != null && disposableContainer.add(scheduledRunnable) == null) {
            return scheduledRunnable;
        }
        if (j <= 0) {
            try {
                runnable = this.f57377b.submit(scheduledRunnable);
            } catch (Runnable runnable2) {
                if (disposableContainer != null) {
                    disposableContainer.remove(scheduledRunnable);
                }
                C2667a.a(runnable2);
            }
        } else {
            runnable2 = this.f57377b.schedule(scheduledRunnable, j, timeUnit);
        }
        scheduledRunnable.m63724a(runnable2);
        return scheduledRunnable;
    }

    public void dispose() {
        if (!this.f57376a) {
            this.f57376a = true;
            this.f57377b.shutdownNow();
        }
    }

    /* renamed from: b */
    public void m66591b() {
        if (!this.f57376a) {
            this.f57376a = true;
            this.f57377b.shutdown();
        }
    }

    public boolean isDisposed() {
        return this.f57376a;
    }
}
