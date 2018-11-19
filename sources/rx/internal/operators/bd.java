package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.C19566b;
import rx.C2671a;
import rx.Single.OnSubscribe;
import rx.Subscription;
import rx.a$a;
import rx.functions.Action0;

public final class bd<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final OnSubscribe<T> f62229a;
    /* renamed from: b */
    final long f62230b;
    /* renamed from: c */
    final TimeUnit f62231c;
    /* renamed from: d */
    final C2671a f62232d;

    /* renamed from: rx.internal.operators.bd$a */
    static final class C19829a<T> extends C19566b<T> implements Action0 {
        /* renamed from: a */
        final C19566b<? super T> f62053a;
        /* renamed from: b */
        final a$a f62054b;
        /* renamed from: c */
        final long f62055c;
        /* renamed from: d */
        final TimeUnit f62056d;
        /* renamed from: e */
        T f62057e;
        /* renamed from: f */
        Throwable f62058f;

        public C19829a(C19566b<? super T> c19566b, a$a a_a, long j, TimeUnit timeUnit) {
            this.f62053a = c19566b;
            this.f62054b = a_a;
            this.f62055c = j;
            this.f62056d = timeUnit;
        }

        /* renamed from: a */
        public void mo14737a(T t) {
            this.f62057e = t;
            this.f62054b.mo14741a(this, this.f62055c, this.f62056d);
        }

        public void onError(Throwable th) {
            this.f62058f = th;
            this.f62054b.mo14741a(this, this.f62055c, this.f62056d);
        }

        public void call() {
            try {
                Throwable th = this.f62058f;
                if (th != null) {
                    this.f62058f = null;
                    this.f62053a.onError(th);
                } else {
                    Object obj = this.f62057e;
                    this.f62057e = null;
                    this.f62053a.mo14737a(obj);
                }
                this.f62054b.unsubscribe();
            } catch (Throwable th2) {
                this.f62054b.unsubscribe();
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71583a((C19566b) obj);
    }

    public bd(OnSubscribe<T> onSubscribe, long j, TimeUnit timeUnit, C2671a c2671a) {
        this.f62229a = onSubscribe;
        this.f62232d = c2671a;
        this.f62230b = j;
        this.f62231c = timeUnit;
    }

    /* renamed from: a */
    public void m71583a(C19566b<? super T> c19566b) {
        Subscription createWorker = this.f62232d.createWorker();
        Subscription c19829a = new C19829a(c19566b, createWorker, this.f62230b, this.f62231c);
        c19566b.m70541a(createWorker);
        c19566b.m70541a(c19829a);
        this.f62229a.call(c19829a);
    }
}
