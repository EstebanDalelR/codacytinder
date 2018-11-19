package rx.internal.operators;

import rx.C19566b;
import rx.Completable;
import rx.Completable$OnSubscribe;
import rx.CompletableSubscriber;
import rx.Single;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.functions.Func1;

/* renamed from: rx.internal.operators.b */
public final class C19874b<T> implements Completable$OnSubscribe {
    /* renamed from: a */
    final Single<T> f62227a;
    /* renamed from: b */
    final Func1<? super T, ? extends Completable> f62228b;

    /* renamed from: rx.internal.operators.b$a */
    static final class C19712a<T> extends C19566b<T> implements CompletableSubscriber {
        /* renamed from: a */
        final CompletableSubscriber f61671a;
        /* renamed from: b */
        final Func1<? super T, ? extends Completable> f61672b;

        public C19712a(CompletableSubscriber completableSubscriber, Func1<? super T, ? extends Completable> func1) {
            this.f61671a = completableSubscriber;
            this.f61672b = func1;
        }

        /* renamed from: a */
        public void mo14737a(T t) {
            try {
                Completable completable = (Completable) this.f61672b.call(t);
                if (completable == null) {
                    onError(new NullPointerException("The mapper returned a null Completable"));
                } else {
                    completable.b(this);
                }
            } catch (T t2) {
                C19410a.m69874b(t2);
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            this.f61671a.onError(th);
        }

        public void onCompleted() {
            this.f61671a.onCompleted();
        }

        public void onSubscribe(Subscription subscription) {
            m70541a(subscription);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71582a((CompletableSubscriber) obj);
    }

    public C19874b(Single<T> single, Func1<? super T, ? extends Completable> func1) {
        this.f62227a = single;
        this.f62228b = func1;
    }

    /* renamed from: a */
    public void m71582a(CompletableSubscriber completableSubscriber) {
        C19566b c19712a = new C19712a(completableSubscriber, this.f62228b);
        completableSubscriber.onSubscribe(c19712a);
        this.f62227a.m69762a(c19712a);
    }
}
