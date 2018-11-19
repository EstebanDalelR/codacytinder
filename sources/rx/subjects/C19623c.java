package rx.subjects;

import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Observer;

/* renamed from: rx.subjects.c */
public abstract class C19623c<T, R> extends Observable<R> implements Observer<T> {
    protected C19623c(OnSubscribe<R> onSubscribe) {
        super(onSubscribe);
    }

    /* renamed from: B */
    public final C19786b<T, R> m70662B() {
        if (getClass() == C19786b.class) {
            return (C19786b) this;
        }
        return new C19786b(this);
    }
}
