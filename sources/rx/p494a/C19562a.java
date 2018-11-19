package rx.p494a;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Subscription;
import rx.functions.Action0;
import rx.p494a.p496b.C19397a;

/* renamed from: rx.a.a */
public abstract class C19562a implements Subscription {
    /* renamed from: a */
    private final AtomicBoolean f61108a = new AtomicBoolean();

    /* renamed from: rx.a.a$1 */
    class C198111 implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C19562a f61964a;

        C198111(C19562a c19562a) {
            this.f61964a = c19562a;
        }

        public void call() {
            this.f61964a.m70537a();
        }
    }

    /* renamed from: a */
    protected abstract void m70537a();

    /* renamed from: b */
    public static void m70536b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected to be called on the main thread but was ");
            stringBuilder.append(Thread.currentThread().getName());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final boolean isUnsubscribed() {
        return this.f61108a.get();
    }

    public final void unsubscribe() {
        if (!this.f61108a.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m70537a();
        } else {
            C19397a.m69785a().createWorker().mo14740a(new C198111(this));
        }
    }
}
