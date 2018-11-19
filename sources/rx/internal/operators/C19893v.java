package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import rx.C19571c;
import rx.C2671a;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Producer;
import rx.Subscription;
import rx.a$a;
import rx.functions.Action0;
import rx.internal.producers.C19598a;
import rx.internal.subscriptions.SequentialSubscription;
import rx.p498c.C19401c;

/* renamed from: rx.internal.operators.v */
public final class C19893v<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Observable<T> f62299a;
    /* renamed from: b */
    final long f62300b;
    /* renamed from: c */
    final TimeUnit f62301c;
    /* renamed from: d */
    final C2671a f62302d;
    /* renamed from: e */
    final Observable<? extends T> f62303e;

    /* renamed from: rx.internal.operators.v$a */
    static final class C19747a<T> extends C19571c<T> {
        /* renamed from: a */
        final C19571c<? super T> f61779a;
        /* renamed from: b */
        final C19598a f61780b;

        C19747a(C19571c<? super T> c19571c, C19598a c19598a) {
            this.f61779a = c19571c;
            this.f61780b = c19598a;
        }

        public void onNext(T t) {
            this.f61779a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f61779a.onError(th);
        }

        public void onCompleted() {
            this.f61779a.onCompleted();
        }

        public void setProducer(Producer producer) {
            this.f61780b.m70607a(producer);
        }
    }

    /* renamed from: rx.internal.operators.v$b */
    static final class C19748b<T> extends C19571c<T> {
        /* renamed from: a */
        final C19571c<? super T> f61781a;
        /* renamed from: b */
        final long f61782b;
        /* renamed from: c */
        final TimeUnit f61783c;
        /* renamed from: d */
        final a$a f61784d;
        /* renamed from: e */
        final Observable<? extends T> f61785e;
        /* renamed from: f */
        final C19598a f61786f = new C19598a();
        /* renamed from: g */
        final AtomicLong f61787g = new AtomicLong();
        /* renamed from: h */
        final SequentialSubscription f61788h = new SequentialSubscription();
        /* renamed from: i */
        final SequentialSubscription f61789i = new SequentialSubscription(this);
        /* renamed from: j */
        long f61790j;

        /* renamed from: rx.internal.operators.v$b$a */
        final class C19838a implements Action0 {
            /* renamed from: a */
            final long f62084a;
            /* renamed from: b */
            final /* synthetic */ C19748b f62085b;

            C19838a(C19748b c19748b, long j) {
                this.f62085b = c19748b;
                this.f62084a = j;
            }

            public void call() {
                this.f62085b.m71013b(this.f62084a);
            }
        }

        C19748b(C19571c<? super T> c19571c, long j, TimeUnit timeUnit, a$a a_a, Observable<? extends T> observable) {
            this.f61781a = c19571c;
            this.f61782b = j;
            this.f61783c = timeUnit;
            this.f61784d = a_a;
            this.f61785e = observable;
            add(a_a);
            add(this.f61788h);
        }

        public void onNext(T t) {
            long j = this.f61787g.get();
            if (j != Format.OFFSET_SAMPLE_RELATIVE) {
                long j2 = j + 1;
                if (this.f61787g.compareAndSet(j, j2)) {
                    Subscription subscription = (Subscription) this.f61788h.get();
                    if (subscription != null) {
                        subscription.unsubscribe();
                    }
                    this.f61790j++;
                    this.f61781a.onNext(t);
                    m71012a(j2);
                }
            }
        }

        /* renamed from: a */
        void m71012a(long j) {
            this.f61788h.m70620b(this.f61784d.mo14741a(new C19838a(this, j), this.f61782b, this.f61783c));
        }

        public void onError(Throwable th) {
            if (this.f61787g.getAndSet(Format.OFFSET_SAMPLE_RELATIVE) != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f61788h.unsubscribe();
                this.f61781a.onError(th);
                this.f61784d.unsubscribe();
                return;
            }
            C19401c.m69811a(th);
        }

        public void onCompleted() {
            if (this.f61787g.getAndSet(Format.OFFSET_SAMPLE_RELATIVE) != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f61788h.unsubscribe();
                this.f61781a.onCompleted();
                this.f61784d.unsubscribe();
            }
        }

        public void setProducer(Producer producer) {
            this.f61786f.m70607a(producer);
        }

        /* renamed from: b */
        void m71013b(long j) {
            if (this.f61787g.compareAndSet(j, Format.OFFSET_SAMPLE_RELATIVE) != null) {
                unsubscribe();
                if (this.f61785e == null) {
                    this.f61781a.onError(new TimeoutException());
                } else {
                    j = this.f61790j;
                    if (j != 0) {
                        this.f61786f.m70606a(j);
                    }
                    C19571c c19747a = new C19747a(this.f61781a, this.f61786f);
                    if (this.f61789i.m70620b(c19747a)) {
                        this.f61785e.m69677b(c19747a);
                    }
                }
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71631a((C19571c) obj);
    }

    public C19893v(Observable<T> observable, long j, TimeUnit timeUnit, C2671a c2671a, Observable<? extends T> observable2) {
        this.f62299a = observable;
        this.f62300b = j;
        this.f62301c = timeUnit;
        this.f62302d = c2671a;
        this.f62303e = observable2;
    }

    /* renamed from: a */
    public void m71631a(C19571c<? super T> c19571c) {
        C19571c c19748b = new C19748b(c19571c, this.f62300b, this.f62301c, this.f62302d.createWorker(), this.f62303e);
        c19571c.add(c19748b.f61789i);
        c19571c.setProducer(c19748b.f61786f);
        c19748b.m71012a(0);
        this.f62299a.m69677b(c19748b);
    }
}
