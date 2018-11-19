package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: io.fabric.sdk.android.services.concurrency.c */
public class C17338c<V> extends FutureTask<V> implements DelegateProvider, Dependency<Task>, PriorityProvider, Task {
    /* renamed from: b */
    final Object f53056b;

    public /* synthetic */ void addDependency(Object obj) {
        m63398a((Task) obj);
    }

    public C17338c(Callable<V> callable) {
        super(callable);
        this.f53056b = m63397a((Object) callable);
    }

    public C17338c(Runnable runnable, V v) {
        super(runnable, v);
        this.f53056b = m63397a((Object) runnable);
    }

    public int compareTo(Object obj) {
        return ((PriorityProvider) getDelegate()).compareTo(obj);
    }

    /* renamed from: a */
    public void m63398a(Task task) {
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
        return (Dependency) this.f53056b;
    }

    /* renamed from: a */
    protected <T extends Dependency<Task> & PriorityProvider & Task> T m63397a(Object obj) {
        if (C17339d.isProperDelegate(obj)) {
            return (Dependency) obj;
        }
        return new C17339d();
    }
}
