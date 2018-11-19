package io.fabric.sdk.android;

import android.content.Context;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import io.fabric.sdk.android.services.concurrency.Task;
import java.io.File;
import java.util.Collection;

/* renamed from: io.fabric.sdk.android.g */
public abstract class C15611g<Result> implements Comparable<C15611g> {
    Context context;
    final DependsOn dependsOnAnnotation = ((DependsOn) getClass().getAnnotation(DependsOn.class));
    C15608c fabric;
    IdManager idManager;
    InitializationCallback<Result> initializationCallback;
    C18330f<Result> initializationTask = new C18330f(this);

    protected abstract Result doInBackground();

    public abstract String getIdentifier();

    public abstract String getVersion();

    protected void onCancelled(Result result) {
    }

    protected void onPostExecute(Result result) {
    }

    protected boolean onPreExecute() {
        return true;
    }

    void injectParameters(Context context, C15608c c15608c, InitializationCallback<Result> initializationCallback, IdManager idManager) {
        this.fabric = c15608c;
        this.context = new C15609d(context, getIdentifier(), getPath());
        this.initializationCallback = initializationCallback;
        this.idManager = idManager;
    }

    final void initialize() {
        this.initializationTask.m63396a(this.fabric.m58573f(), (Void) null);
    }

    protected IdManager getIdManager() {
        return this.idManager;
    }

    public Context getContext() {
        return this.context;
    }

    public C15608c getFabric() {
        return this.fabric;
    }

    public String getPath() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".Fabric");
        stringBuilder.append(File.separator);
        stringBuilder.append(getIdentifier());
        return stringBuilder.toString();
    }

    public int compareTo(C15611g c15611g) {
        if (containsAnnotatedDependency(c15611g)) {
            return 1;
        }
        if (c15611g.containsAnnotatedDependency(this)) {
            return -1;
        }
        if (hasAnnotatedDependency() && !c15611g.hasAnnotatedDependency()) {
            return 1;
        }
        if (hasAnnotatedDependency() || c15611g.hasAnnotatedDependency() == null) {
            return null;
        }
        return -1;
    }

    boolean containsAnnotatedDependency(C15611g c15611g) {
        if (hasAnnotatedDependency()) {
            for (Class isAssignableFrom : this.dependsOnAnnotation.value()) {
                if (isAssignableFrom.isAssignableFrom(c15611g.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean hasAnnotatedDependency() {
        return this.dependsOnAnnotation != null;
    }

    protected Collection<Task> getDependencies() {
        return this.initializationTask.getDependencies();
    }
}
