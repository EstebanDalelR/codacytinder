package rx.internal.schedulers;

import rx.a$a;
import rx.exceptions.C19410a;
import rx.functions.Action0;

/* renamed from: rx.internal.schedulers.h */
class C19851h implements Action0 {
    /* renamed from: a */
    private final Action0 f62121a;
    /* renamed from: b */
    private final a$a f62122b;
    /* renamed from: c */
    private final long f62123c;

    public C19851h(Action0 action0, a$a a_a, long j) {
        this.f62121a = action0;
        this.f62122b = a_a;
        this.f62123c = j;
    }

    public void call() {
        if (!this.f62122b.isUnsubscribed()) {
            long a = this.f62123c - this.f62122b.mo14759a();
            if (a > 0) {
                try {
                    Thread.sleep(a);
                } catch (Throwable e) {
                    Thread.currentThread().interrupt();
                    C19410a.m69867a(e);
                }
            }
            if (!this.f62122b.isUnsubscribed()) {
                this.f62121a.call();
            }
        }
    }
}
