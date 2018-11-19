package android.arch.lifecycle;

import android.arch.lifecycle.C0015a.C0013a;
import android.arch.lifecycle.Lifecycle.Event;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {
    /* renamed from: a */
    private final Object f12630a;
    /* renamed from: b */
    private final C0013a f12631b = C0015a.f37a.m85b(this.f12630a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f12630a = obj;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Event event) {
        this.f12631b.m79a(lifecycleOwner, event, this.f12630a);
    }
}
