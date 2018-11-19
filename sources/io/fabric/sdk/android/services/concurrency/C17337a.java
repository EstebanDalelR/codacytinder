package io.fabric.sdk.android.services.concurrency;

import io.fabric.sdk.android.services.concurrency.AsyncTask.Status;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: io.fabric.sdk.android.services.concurrency.a */
public abstract class C17337a<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> implements DelegateProvider, Dependency<Task>, PriorityProvider, Task {
    /* renamed from: a */
    private final C17339d f53055a = new C17339d();

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$a */
    private static class C15639a<Result> implements Executor {
        /* renamed from: a */
        private final Executor f48407a;
        /* renamed from: b */
        private final C17337a f48408b;

        public C15639a(Executor executor, C17337a c17337a) {
            this.f48407a = executor;
            this.f48408b = c17337a;
        }

        public void execute(Runnable runnable) {
            this.f48407a.execute(new C17338c<Result>(this, runnable, null) {
                /* renamed from: a */
                final /* synthetic */ C15639a f56799a;

                public <T extends Dependency<Task> & PriorityProvider & Task> T getDelegate() {
                    return this.f56799a.f48408b;
                }
            });
        }
    }

    public /* synthetic */ void addDependency(Object obj) {
        m63395a((Task) obj);
    }

    /* renamed from: a */
    public final void m63396a(ExecutorService executorService, Params... paramsArr) {
        super.m58717a(new C15639a(executorService, this), (Object[]) paramsArr);
    }

    public int compareTo(Object obj) {
        return Priority.compareTo(this, obj);
    }

    /* renamed from: a */
    public void m63395a(Task task) {
        if (m58722b() != Status.PENDING) {
            throw new IllegalStateException("Must not add Dependency after task is running");
        }
        ((Dependency) ((PriorityProvider) getDelegate())).addDependency(task);
    }

    public Collection<Task> getDependencies() {
        return ((Dependency) ((PriorityProvider) getDelegate())).getDependencies();
    }

    public boolean areDependenciesMet() {
        return ((Dependency) ((PriorityProvider) getDelegate())).areDependenciesMet();
    }

    public Priority getPriority() {
        return ((PriorityProvider) getDelegate()).getPriority();
    }

    public void setFinished(boolean z) {
        ((Task) ((PriorityProvider) getDelegate())).setFinished(z);
    }

    public boolean isFinished() {
        return ((Task) ((PriorityProvider) getDelegate())).isFinished();
    }

    public void setError(Throwable th) {
        ((Task) ((PriorityProvider) getDelegate())).setError(th);
    }

    public Throwable getError() {
        return ((Task) ((PriorityProvider) getDelegate())).getError();
    }

    public <T extends Dependency<Task> & PriorityProvider & Task> T getDelegate() {
        return this.f53055a;
    }
}
