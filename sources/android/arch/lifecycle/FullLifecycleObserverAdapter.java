package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {
    /* renamed from: a */
    private final FullLifecycleObserver f12627a;

    FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f12627a = fullLifecycleObserver;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Event event) {
        switch (event) {
            case ON_CREATE:
                this.f12627a.m10442a(lifecycleOwner);
                return;
            case ON_START:
                this.f12627a.m10443b(lifecycleOwner);
                return;
            case ON_RESUME:
                this.f12627a.m10444c(lifecycleOwner);
                return;
            case ON_PAUSE:
                this.f12627a.m10445d(lifecycleOwner);
                return;
            case ON_STOP:
                this.f12627a.m10446e(lifecycleOwner);
                return;
            case ON_DESTROY:
                this.f12627a.m10447f(lifecycleOwner);
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
