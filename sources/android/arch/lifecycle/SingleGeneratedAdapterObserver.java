package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SingleGeneratedAdapterObserver implements GenericLifecycleObserver {
    /* renamed from: a */
    private final GeneratedAdapter f12632a;

    SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        this.f12632a = generatedAdapter;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Event event) {
        this.f12632a.callMethods(lifecycleOwner, event, false, null);
        this.f12632a.callMethods(lifecycleOwner, event, true, null);
    }
}
