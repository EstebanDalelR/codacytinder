package rx;

import rx.functions.Func1;
import rx.internal.schedulers.SchedulerWhen;

/* renamed from: rx.a */
public abstract class C2671a {
    public abstract a$a createWorker();

    public long now() {
        return System.currentTimeMillis();
    }

    public <S extends C2671a & Subscription> S when(Func1<Observable<Observable<Completable>>, Completable> func1) {
        return new SchedulerWhen(func1, this);
    }
}
