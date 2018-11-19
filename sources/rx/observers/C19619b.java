package rx.observers;

import rx.CompletableSubscriber;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.p498c.C19401c;

/* renamed from: rx.observers.b */
public final class C19619b implements CompletableSubscriber, Subscription {
    /* renamed from: a */
    final CompletableSubscriber f61304a;
    /* renamed from: b */
    Subscription f61305b;
    /* renamed from: c */
    boolean f61306c;

    public C19619b(CompletableSubscriber completableSubscriber) {
        this.f61304a = completableSubscriber;
    }

    public void onCompleted() {
        if (!this.f61306c) {
            this.f61306c = true;
            try {
                this.f61304a.onCompleted();
            } catch (Throwable th) {
                C19410a.m69874b(th);
                OnCompletedFailedException onCompletedFailedException = new OnCompletedFailedException(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f61306c) {
            C19401c.m69811a(th);
            return;
        }
        this.f61306c = true;
        try {
            this.f61304a.onError(th);
        } catch (Throwable th2) {
            C19410a.m69874b(th2);
            OnErrorFailedException onErrorFailedException = new OnErrorFailedException(new CompositeException(th, th2));
        }
    }

    public void onSubscribe(Subscription subscription) {
        this.f61305b = subscription;
        try {
            this.f61304a.onSubscribe(this);
        } catch (Throwable th) {
            C19410a.m69874b(th);
            subscription.unsubscribe();
            onError(th);
        }
    }

    public void unsubscribe() {
        this.f61305b.unsubscribe();
    }

    public boolean isUnsubscribed() {
        if (!this.f61306c) {
            if (!this.f61305b.isUnsubscribed()) {
                return false;
            }
        }
        return true;
    }
}
