package io.fabric.sdk.android.services.concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.fabric.sdk.android.services.concurrency.d */
public class C17339d implements Dependency<Task>, PriorityProvider, Task {
    private final List<Task> dependencies = new ArrayList();
    private final AtomicBoolean hasRun = new AtomicBoolean(false);
    private final AtomicReference<Throwable> throwable = new AtomicReference(null);

    public synchronized Collection<Task> getDependencies() {
        return Collections.unmodifiableCollection(this.dependencies);
    }

    public synchronized void addDependency(Task task) {
        this.dependencies.add(task);
    }

    public boolean areDependenciesMet() {
        for (Task isFinished : getDependencies()) {
            if (!isFinished.isFinished()) {
                return false;
            }
        }
        return true;
    }

    public synchronized void setFinished(boolean z) {
        this.hasRun.set(z);
    }

    public boolean isFinished() {
        return this.hasRun.get();
    }

    public Priority getPriority() {
        return Priority.NORMAL;
    }

    public void setError(Throwable th) {
        this.throwable.set(th);
    }

    public Throwable getError() {
        return (Throwable) this.throwable.get();
    }

    public int compareTo(Object obj) {
        return Priority.compareTo(this, obj);
    }

    public static boolean isProperDelegate(java.lang.Object r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = r3;	 Catch:{ ClassCastException -> 0x0011 }
        r1 = (io.fabric.sdk.android.services.concurrency.Dependency) r1;	 Catch:{ ClassCastException -> 0x0011 }
        r2 = r3;	 Catch:{ ClassCastException -> 0x0011 }
        r2 = (io.fabric.sdk.android.services.concurrency.Task) r2;	 Catch:{ ClassCastException -> 0x0011 }
        r3 = (io.fabric.sdk.android.services.concurrency.PriorityProvider) r3;	 Catch:{ ClassCastException -> 0x0011 }
        if (r1 == 0) goto L_0x0010;
    L_0x000b:
        if (r2 == 0) goto L_0x0010;
    L_0x000d:
        if (r3 == 0) goto L_0x0010;
    L_0x000f:
        r0 = 1;
    L_0x0010:
        return r0;
    L_0x0011:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.concurrency.d.isProperDelegate(java.lang.Object):boolean");
    }
}
