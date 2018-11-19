package rx.internal.operators;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.functions.Func1;
import rx.internal.util.ExceptionsUtils;
import rx.p498c.C19401c;
import rx.p500e.C19573b;

public final class OnSubscribeFlatMapCompletable<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Observable<T> f62208a;
    /* renamed from: b */
    final Func1<? super T, ? extends Completable> f62209b;
    /* renamed from: c */
    final boolean f62210c;
    /* renamed from: d */
    final int f62211d;

    static final class FlatMapCompletableSubscriber<T> extends C19571c<T> {
        /* renamed from: a */
        final C19571c<? super T> f61467a;
        /* renamed from: b */
        final Func1<? super T, ? extends Completable> f61468b;
        /* renamed from: c */
        final boolean f61469c;
        /* renamed from: d */
        final int f61470d;
        /* renamed from: e */
        final AtomicInteger f61471e = new AtomicInteger(1);
        /* renamed from: f */
        final C19573b f61472f = new C19573b();
        /* renamed from: g */
        final AtomicReference<Throwable> f61473g = new AtomicReference();

        final class InnerSubscriber extends AtomicReference<Subscription> implements CompletableSubscriber, Subscription {
            private static final long serialVersionUID = -8588259593722659900L;
            /* renamed from: a */
            final /* synthetic */ FlatMapCompletableSubscriber f61150a;

            InnerSubscriber(FlatMapCompletableSubscriber flatMapCompletableSubscriber) {
                this.f61150a = flatMapCompletableSubscriber;
            }

            public void unsubscribe() {
                Object obj = (Subscription) getAndSet(this);
                if (obj != null && obj != this) {
                    obj.unsubscribe();
                }
            }

            public boolean isUnsubscribed() {
                return get() == this;
            }

            public void onCompleted() {
                this.f61150a.m70900a(this);
            }

            public void onError(Throwable th) {
                this.f61150a.m70901a(this, th);
            }

            public void onSubscribe(Subscription subscription) {
                if (!compareAndSet(null, subscription)) {
                    subscription.unsubscribe();
                    if (get() != this) {
                        C19401c.m69811a(new IllegalStateException("Subscription already set!"));
                    }
                }
            }
        }

        FlatMapCompletableSubscriber(C19571c<? super T> c19571c, Func1<? super T, ? extends Completable> func1, boolean z, int i) {
            this.f61467a = c19571c;
            this.f61468b = func1;
            this.f61469c = z;
            this.f61470d = i;
            request(i != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED ? (long) i : -1);
        }

        public void onNext(T t) {
            try {
                Completable completable = (Completable) this.f61468b.call(t);
                if (completable == null) {
                    throw new NullPointerException("The mapper returned a null Completable");
                }
                Subscription innerSubscriber = new InnerSubscriber(this);
                this.f61472f.m70548a(innerSubscriber);
                this.f61471e.getAndIncrement();
                completable.a(innerSubscriber);
            } catch (T t2) {
                C19410a.m69874b(t2);
                unsubscribe();
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            if (this.f61469c) {
                ExceptionsUtils.addThrowable(this.f61473g, th);
                onCompleted();
                return;
            }
            this.f61472f.unsubscribe();
            if (this.f61473g.compareAndSet(null, th)) {
                this.f61467a.onError(ExceptionsUtils.terminate(this.f61473g));
            } else {
                C19401c.m69811a(th);
            }
        }

        public void onCompleted() {
            m70902a();
        }

        /* renamed from: a */
        boolean m70902a() {
            if (this.f61471e.decrementAndGet() != 0) {
                return false;
            }
            Throwable terminate = ExceptionsUtils.terminate(this.f61473g);
            if (terminate != null) {
                this.f61467a.onError(terminate);
            } else {
                this.f61467a.onCompleted();
            }
            return true;
        }

        /* renamed from: a */
        public void m70901a(InnerSubscriber innerSubscriber, Throwable th) {
            this.f61472f.m70550b(innerSubscriber);
            if (this.f61469c != null) {
                ExceptionsUtils.addThrowable(this.f61473g, th);
                if (m70902a() == null && this.f61470d != Integer.MAX_VALUE) {
                    request(1);
                    return;
                }
                return;
            }
            this.f61472f.unsubscribe();
            unsubscribe();
            if (this.f61473g.compareAndSet(null, th) != null) {
                this.f61467a.onError(ExceptionsUtils.terminate(this.f61473g));
            } else {
                C19401c.m69811a(th);
            }
        }

        /* renamed from: a */
        public void m70900a(InnerSubscriber innerSubscriber) {
            this.f61472f.m70550b(innerSubscriber);
            if (m70902a() == null && this.f61470d != Integer.MAX_VALUE) {
                request(1);
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71573a((C19571c) obj);
    }

    public OnSubscribeFlatMapCompletable(Observable<T> observable, Func1<? super T, ? extends Completable> func1, boolean z, int i) {
        if (func1 == null) {
            throw new NullPointerException("mapper is null");
        } else if (i <= 0) {
            func1 = new StringBuilder();
            func1.append("maxConcurrency > 0 required but it was ");
            func1.append(i);
            throw new IllegalArgumentException(func1.toString());
        } else {
            this.f62208a = observable;
            this.f62209b = func1;
            this.f62210c = z;
            this.f62211d = i;
        }
    }

    /* renamed from: a */
    public void m71573a(C19571c<? super T> c19571c) {
        C19571c flatMapCompletableSubscriber = new FlatMapCompletableSubscriber(c19571c, this.f62209b, this.f62210c, this.f62211d);
        c19571c.add(flatMapCompletableSubscriber);
        c19571c.add(flatMapCompletableSubscriber.f61472f);
        this.f62208a.m69661a(flatMapCompletableSubscriber);
    }
}
