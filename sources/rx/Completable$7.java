package rx;

import java.util.Arrays;
import rx.exceptions.CompositeException;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.p498c.C19401c;
import rx.p500e.C19407e;

class Completable$7 implements Completable$OnSubscribe {
    /* renamed from: a */
    final /* synthetic */ Action0 f62184a;
    /* renamed from: b */
    final /* synthetic */ Action0 f62185b;
    /* renamed from: c */
    final /* synthetic */ Action1 f62186c;
    /* renamed from: d */
    final /* synthetic */ Action1 f62187d;
    /* renamed from: e */
    final /* synthetic */ Action0 f62188e;
    /* renamed from: f */
    final /* synthetic */ Completable f62189f;

    Completable$7(Completable completable, Action0 action0, Action0 action02, Action1 action1, Action1 action12, Action0 action03) {
        this.f62189f = completable;
        this.f62184a = action0;
        this.f62185b = action02;
        this.f62186c = action1;
        this.f62187d = action12;
        this.f62188e = action03;
    }

    public /* synthetic */ void call(Object obj) {
        m71558a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71558a(final CompletableSubscriber completableSubscriber) {
        this.f62189f.a(new CompletableSubscriber(this) {
            /* renamed from: b */
            final /* synthetic */ Completable$7 f61107b;

            public void onCompleted() {
                try {
                    this.f61107b.f62184a.call();
                    completableSubscriber.onCompleted();
                    try {
                        this.f61107b.f62185b.call();
                    } catch (Throwable th) {
                        C19401c.m69811a(th);
                    }
                } catch (Throwable th2) {
                    completableSubscriber.onError(th2);
                }
            }

            public void onError(Throwable th) {
                try {
                    this.f61107b.f62186c.call(th);
                } catch (Throwable th2) {
                    th = new CompositeException(Arrays.asList(new Throwable[]{th, th2}));
                }
                completableSubscriber.onError(th);
                try {
                    this.f61107b.f62185b.call();
                } catch (Throwable th3) {
                    C19401c.m69811a(th3);
                }
            }

            public void onSubscribe(final Subscription subscription) {
                try {
                    this.f61107b.f62187d.call(subscription);
                    completableSubscriber.onSubscribe(C19407e.m69854a(new Action0(this) {
                        /* renamed from: b */
                        final /* synthetic */ C195611 f61956b;

                        public void call() {
                            try {
                                this.f61956b.f61107b.f62188e.call();
                            } catch (Throwable th) {
                                C19401c.m69811a(th);
                            }
                            subscription.unsubscribe();
                        }
                    }));
                } catch (Throwable th) {
                    subscription.unsubscribe();
                    completableSubscriber.onSubscribe(C19407e.m69855b());
                    completableSubscriber.onError(th);
                }
            }
        });
    }
}
