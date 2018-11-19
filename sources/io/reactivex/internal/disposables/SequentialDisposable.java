package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

public final class SequentialDisposable extends AtomicReference<Disposable> implements Disposable {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable(Disposable disposable) {
        lazySet(disposable);
    }

    /* renamed from: a */
    public boolean m63457a(Disposable disposable) {
        return DisposableHelper.set(this, disposable);
    }

    /* renamed from: b */
    public boolean m63458b(Disposable disposable) {
        return DisposableHelper.replace(this, disposable);
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }
}
