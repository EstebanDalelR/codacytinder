package rx.internal.operators;

import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;

public enum NeverObservableHolder implements OnSubscribe<Object> {
    INSTANCE;
    
    static final Observable<Object> NEVER = null;

    public void call(C19571c<? super Object> c19571c) {
    }

    static {
        NEVER = Observable.m69634b(INSTANCE);
    }

    public static <T> Observable<T> instance() {
        return NEVER;
    }
}
