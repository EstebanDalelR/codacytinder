package rx.internal.operators;

import java.util.Arrays;
import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Observer;
import rx.exceptions.C19410a;
import rx.exceptions.CompositeException;
import rx.p498c.C19401c;

/* renamed from: rx.internal.operators.k */
public class C19882k<T> implements OnSubscribe<T> {
    /* renamed from: a */
    private final Observer<? super T> f62273a;
    /* renamed from: b */
    private final Observable<T> f62274b;

    /* renamed from: rx.internal.operators.k$a */
    private static final class C19735a<T> extends C19571c<T> {
        /* renamed from: a */
        private final C19571c<? super T> f61747a;
        /* renamed from: b */
        private final Observer<? super T> f61748b;
        /* renamed from: c */
        private boolean f61749c;

        C19735a(C19571c<? super T> c19571c, Observer<? super T> observer) {
            super(c19571c);
            this.f61747a = c19571c;
            this.f61748b = observer;
        }

        public void onCompleted() {
            if (!this.f61749c) {
                try {
                    this.f61748b.onCompleted();
                    this.f61749c = true;
                    this.f61747a.onCompleted();
                } catch (Throwable th) {
                    C19410a.m69869a(th, (Observer) this);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f61749c) {
                C19401c.m69811a(th);
                return;
            }
            this.f61749c = true;
            try {
                this.f61748b.onError(th);
                this.f61747a.onError(th);
            } catch (Throwable th2) {
                C19410a.m69874b(th2);
                this.f61747a.onError(new CompositeException(Arrays.asList(new Throwable[]{th, th2})));
            }
        }

        public void onNext(T t) {
            if (!this.f61749c) {
                try {
                    this.f61748b.onNext(t);
                    this.f61747a.onNext(t);
                } catch (Throwable th) {
                    C19410a.m69870a(th, (Observer) this, (Object) t);
                }
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71609a((C19571c) obj);
    }

    public C19882k(Observable<T> observable, Observer<? super T> observer) {
        this.f62274b = observable;
        this.f62273a = observer;
    }

    /* renamed from: a */
    public void m71609a(C19571c<? super T> c19571c) {
        this.f62274b.m69661a(new C19735a(c19571c, this.f62273a));
    }
}
