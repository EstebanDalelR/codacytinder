package rx.internal.operators;

import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;

public enum EmptyObservableHolder implements OnSubscribe<Object> {
    INSTANCE;
    
    static final Observable<Object> EMPTY = null;

    static {
        EMPTY = Observable.m69634b(INSTANCE);
    }

    public static <T> Observable<T> instance() {
        return EMPTY;
    }

    public void call(C19571c<? super Object> c19571c) {
        c19571c.onCompleted();
    }
}
