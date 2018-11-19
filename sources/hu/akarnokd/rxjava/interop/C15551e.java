package hu.akarnokd.rxjava.interop;

import io.reactivex.BackpressureStrategy;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.CompletableSource;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.internal.functions.C15684a;
import org.reactivestreams.Publisher;
import rx.Completable;
import rx.Observable;
import rx.Single;

/* renamed from: hu.akarnokd.rxjava.interop.e */
public final class C15551e {
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3957b<T> m58074a(Observable<T> observable) {
        C15684a.m58895a((Object) observable, "source is null");
        return new C18323c(observable);
    }

    @SchedulerSupport("none")
    /* renamed from: b */
    public static <T> C3959e<T> m58080b(Observable<T> observable) {
        C15684a.m58895a((Object) observable, "source is null");
        return new C18325d(observable);
    }

    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3960g<T> m58075a(Single<T> single) {
        C15684a.m58895a((Object) single, "source is null");
        return new C18327f(single);
    }

    @SchedulerSupport("none")
    /* renamed from: a */
    public static C3956a m58073a(Completable completable) {
        C15684a.m58895a((Object) completable, "source is null");
        return new C18321a(completable);
    }

    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> Observable<T> m58078a(Publisher<T> publisher) {
        C15684a.m58895a((Object) publisher, "source is null");
        return Observable.b(new FlowableV2ToObservableV1(publisher));
    }

    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> Observable<T> m58077a(ObservableSource<T> observableSource, BackpressureStrategy backpressureStrategy) {
        C15684a.m58895a((Object) observableSource, "source is null");
        C15684a.m58895a((Object) backpressureStrategy, "strategy is null");
        return C15551e.m58078a(C3959e.wrap(observableSource).toFlowable(backpressureStrategy));
    }

    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> Single<T> m58079a(SingleSource<T> singleSource) {
        C15684a.m58895a((Object) singleSource, "source is null");
        return Single.a(new SingleV2ToSingleV1(singleSource));
    }

    @SchedulerSupport("none")
    /* renamed from: a */
    public static Completable m58076a(CompletableSource completableSource) {
        C15684a.m58895a((Object) completableSource, "source is null");
        return Completable.a(new C19174b(completableSource));
    }
}
