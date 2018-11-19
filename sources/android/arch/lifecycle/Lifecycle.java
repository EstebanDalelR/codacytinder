package android.arch.lifecycle;

import android.support.annotation.MainThread;
import android.support.annotation.NonNull;

public abstract class Lifecycle {

    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean isAtLeast(@NonNull State state) {
            return compareTo(state) >= null ? true : null;
        }
    }

    @MainThread
    @NonNull
    /* renamed from: a */
    public abstract State mo35a();

    @MainThread
    /* renamed from: a */
    public abstract void mo36a(@NonNull LifecycleObserver lifecycleObserver);

    @MainThread
    /* renamed from: b */
    public abstract void mo37b(@NonNull LifecycleObserver lifecycleObserver);
}
