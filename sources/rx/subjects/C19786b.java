package rx.subjects;

import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.observers.C19620d;

/* renamed from: rx.subjects.b */
public class C19786b<T, R> extends C19623c<T, R> {
    /* renamed from: b */
    private final C19620d<T> f61871b;
    /* renamed from: c */
    private final C19623c<T, R> f61872c;

    /* renamed from: rx.subjects.b$1 */
    class C199111 implements OnSubscribe<R> {
        /* renamed from: a */
        final /* synthetic */ C19623c f62351a;

        C199111(C19623c c19623c) {
            this.f62351a = c19623c;
        }

        public /* synthetic */ void call(Object obj) {
            m71662a((C19571c) obj);
        }

        /* renamed from: a */
        public void m71662a(C19571c<? super R> c19571c) {
            this.f62351a.m69661a((C19571c) c19571c);
        }
    }

    public C19786b(C19623c<T, R> c19623c) {
        super(new C199111(c19623c));
        this.f61872c = c19623c;
        this.f61871b = new C19620d(c19623c);
    }

    public void onCompleted() {
        this.f61871b.onCompleted();
    }

    public void onError(Throwable th) {
        this.f61871b.onError(th);
    }

    public void onNext(T t) {
        this.f61871b.onNext(t);
    }
}
