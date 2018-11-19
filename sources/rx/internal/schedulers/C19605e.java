package rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import rx.C2671a;
import rx.Subscription;
import rx.a$a;
import rx.functions.Action0;
import rx.p500e.C19407e;
import rx.p500e.C19572a;

/* renamed from: rx.internal.schedulers.e */
public final class C19605e extends C2671a {
    /* renamed from: a */
    public static final C19605e f61272a = new C19605e();

    /* renamed from: rx.internal.schedulers.e$a */
    final class C19754a extends a$a implements Subscription {
        /* renamed from: a */
        final C19572a f61811a = new C19572a();
        /* renamed from: b */
        final /* synthetic */ C19605e f61812b;

        C19754a(C19605e c19605e) {
            this.f61812b = c19605e;
        }

        /* renamed from: a */
        public Subscription mo14741a(Action0 action0, long j, TimeUnit timeUnit) {
            return mo14740a(new C19851h(action0, this, this.f61812b.now() + timeUnit.toMillis(j)));
        }

        /* renamed from: a */
        public Subscription mo14740a(Action0 action0) {
            action0.call();
            return C19407e.m69855b();
        }

        public void unsubscribe() {
            this.f61811a.unsubscribe();
        }

        public boolean isUnsubscribed() {
            return this.f61811a.isUnsubscribed();
        }
    }

    private C19605e() {
    }

    public a$a createWorker() {
        return new C19754a(this);
    }
}
