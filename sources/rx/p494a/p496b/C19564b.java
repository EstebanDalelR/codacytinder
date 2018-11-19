package rx.p494a.p496b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import rx.C2671a;
import rx.Subscription;
import rx.a$a;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.p494a.p495a.C19395a;
import rx.p494a.p495a.C19396b;
import rx.p498c.C19403f;
import rx.p500e.C19407e;

/* renamed from: rx.a.b.b */
class C19564b extends C2671a {
    /* renamed from: a */
    private final Handler f61112a;

    /* renamed from: rx.a.b.b$b */
    static final class C19563b implements Runnable, Subscription {
        /* renamed from: a */
        private final Action0 f61109a;
        /* renamed from: b */
        private final Handler f61110b;
        /* renamed from: c */
        private volatile boolean f61111c;

        C19563b(Action0 action0, Handler handler) {
            this.f61109a = action0;
            this.f61110b = handler;
        }

        public void run() {
            try {
                this.f61109a.call();
            } catch (Throwable th) {
                Throwable illegalStateException;
                if (th instanceof OnErrorNotImplementedException) {
                    illegalStateException = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th);
                } else {
                    illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th);
                }
                C19403f.m69828a().m69829b().m69798a(illegalStateException);
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
            }
        }

        public void unsubscribe() {
            this.f61111c = true;
            this.f61110b.removeCallbacks(this);
        }

        public boolean isUnsubscribed() {
            return this.f61111c;
        }
    }

    /* renamed from: rx.a.b.b$a */
    static class C19656a extends a$a {
        /* renamed from: a */
        private final Handler f61441a;
        /* renamed from: b */
        private final C19396b f61442b = C19395a.m69780a().m69781b();
        /* renamed from: c */
        private volatile boolean f61443c;

        C19656a(Handler handler) {
            this.f61441a = handler;
        }

        public void unsubscribe() {
            this.f61443c = true;
            this.f61441a.removeCallbacksAndMessages(this);
        }

        public boolean isUnsubscribed() {
            return this.f61443c;
        }

        /* renamed from: a */
        public Subscription mo14741a(Action0 action0, long j, TimeUnit timeUnit) {
            if (this.f61443c) {
                return C19407e.m69855b();
            }
            Object c19563b = new C19563b(this.f61442b.m69783a(action0), this.f61441a);
            action0 = Message.obtain(this.f61441a, c19563b);
            action0.obj = this;
            this.f61441a.sendMessageDelayed(action0, timeUnit.toMillis(j));
            if (this.f61443c == null) {
                return c19563b;
            }
            this.f61441a.removeCallbacks(c19563b);
            return C19407e.m69855b();
        }

        /* renamed from: a */
        public Subscription mo14740a(Action0 action0) {
            return mo14741a(action0, 0, TimeUnit.MILLISECONDS);
        }
    }

    C19564b(Looper looper) {
        this.f61112a = new Handler(looper);
    }

    public a$a createWorker() {
        return new C19656a(this.f61112a);
    }
}
