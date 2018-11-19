package rx.observers;

import java.util.Arrays;
import rx.C19571c;
import rx.Observer;
import rx.exceptions.C19410a;
import rx.exceptions.CompositeException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;
import rx.exceptions.UnsubscribeFailedException;
import rx.p498c.C19401c;
import rx.p498c.C19403f;

/* renamed from: rx.observers.c */
public class C19780c<T> extends C19571c<T> {
    /* renamed from: a */
    boolean f61859a;
    /* renamed from: b */
    private final C19571c<? super T> f61860b;

    public C19780c(C19571c<? super T> c19571c) {
        super(c19571c);
        this.f61860b = c19571c;
    }

    public void onCompleted() {
        UnsubscribeFailedException unsubscribeFailedException;
        if (!this.f61859a) {
            this.f61859a = true;
            try {
                this.f61860b.onCompleted();
                try {
                    unsubscribe();
                } catch (Throwable th) {
                    C19401c.m69811a(th);
                    unsubscribeFailedException = new UnsubscribeFailedException(th.getMessage(), th);
                }
            } catch (Throwable th2) {
                C19401c.m69811a(th2);
                unsubscribeFailedException = new UnsubscribeFailedException(th2.getMessage(), th2);
            }
        }
    }

    public void onError(Throwable th) {
        C19410a.m69874b(th);
        if (!this.f61859a) {
            this.f61859a = true;
            m71065a(th);
        }
    }

    public void onNext(T t) {
        try {
            if (!this.f61859a) {
                this.f61860b.onNext(t);
            }
        } catch (Throwable th) {
            C19410a.m69869a(th, (Observer) this);
        }
    }

    /* renamed from: a */
    protected void m71065a(Throwable th) {
        C19403f.m69828a().m69829b().m69798a(th);
        try {
            this.f61860b.onError(th);
            try {
                unsubscribe();
            } catch (Throwable th2) {
                C19401c.m69811a(th2);
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException(th2);
            }
        } catch (OnErrorNotImplementedException e) {
            unsubscribe();
            throw e;
        } catch (Throwable th3) {
            C19401c.m69811a(th3);
            OnErrorNotImplementedException onErrorNotImplementedException = new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(new Throwable[]{th2, th3})));
        }
    }
}
