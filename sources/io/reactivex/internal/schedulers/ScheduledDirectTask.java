package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;

public final class ScheduledDirectTask extends AbstractDirectTask implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public /* synthetic */ Object call() throws Exception {
        return m66582a();
    }

    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public ScheduledDirectTask(Runnable runnable) {
        super(runnable);
    }

    /* renamed from: a */
    public Void m66582a() throws Exception {
        this.b = Thread.currentThread();
        try {
            this.a.run();
            return null;
        } finally {
            lazySet(c);
            this.b = null;
        }
    }
}
