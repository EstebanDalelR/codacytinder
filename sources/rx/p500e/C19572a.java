package rx.p500e;

import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;
import rx.functions.Action0;

/* renamed from: rx.e.a */
public final class C19572a implements Subscription {
    /* renamed from: b */
    static final Action0 f61117b = new C198131();
    /* renamed from: a */
    final AtomicReference<Action0> f61118a;

    /* renamed from: rx.e.a$1 */
    static class C198131 implements Action0 {
        public void call() {
        }

        C198131() {
        }
    }

    public C19572a() {
        this.f61118a = new AtomicReference();
    }

    private C19572a(Action0 action0) {
        this.f61118a = new AtomicReference(action0);
    }

    /* renamed from: a */
    public static C19572a m70544a() {
        return new C19572a();
    }

    /* renamed from: a */
    public static C19572a m70545a(Action0 action0) {
        return new C19572a(action0);
    }

    public boolean isUnsubscribed() {
        return this.f61118a.get() == f61117b;
    }

    public void unsubscribe() {
        if (((Action0) this.f61118a.get()) != f61117b) {
            Action0 action0 = (Action0) this.f61118a.getAndSet(f61117b);
            if (action0 != null && action0 != f61117b) {
                action0.call();
            }
        }
    }
}
