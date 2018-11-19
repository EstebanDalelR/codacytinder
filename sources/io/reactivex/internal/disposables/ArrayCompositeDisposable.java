package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class ArrayCompositeDisposable extends AtomicReferenceArray<Disposable> implements Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeDisposable(int i) {
        super(i);
    }

    /* renamed from: a */
    public boolean m63456a(int i, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = (Disposable) get(i);
            if (disposable2 == DisposableHelper.DISPOSED) {
                disposable.dispose();
                return false;
            }
        } while (!compareAndSet(i, disposable2, disposable));
        if (disposable2 != null) {
            disposable2.dispose();
        }
        return true;
    }

    public void dispose() {
        int i = 0;
        if (get(0) != DisposableHelper.DISPOSED) {
            int length = length();
            while (i < length) {
                if (((Disposable) get(i)) != DisposableHelper.DISPOSED) {
                    Disposable disposable = (Disposable) getAndSet(i, DisposableHelper.DISPOSED);
                    if (!(disposable == DisposableHelper.DISPOSED || disposable == null)) {
                        disposable.dispose();
                    }
                }
                i++;
            }
        }
    }

    public boolean isDisposed() {
        return get(0) == DisposableHelper.DISPOSED;
    }
}
