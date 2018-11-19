package io.reactivex.internal.operators.observable;

import io.reactivex.C15675d;
import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.internal.util.C15736b;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.C17528b;
import io.reactivex.p079d.C2667a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.b */
public final class C15711b<T> implements Iterable<T> {
    /* renamed from: a */
    final ObservableSource<T> f48592a;

    /* renamed from: io.reactivex.internal.operators.observable.b$a */
    static final class C18396a<T> extends C17528b<C15675d<T>> implements Iterator<T> {
        /* renamed from: a */
        C15675d<T> f57257a;
        /* renamed from: b */
        final Semaphore f57258b = new Semaphore(0);
        /* renamed from: c */
        final AtomicReference<C15675d<T>> f57259c = new AtomicReference();

        public void onComplete() {
        }

        C18396a() {
        }

        public /* synthetic */ void onNext(Object obj) {
            m66513a((C15675d) obj);
        }

        /* renamed from: a */
        public void m66513a(C15675d<T> c15675d) {
            if ((this.f57259c.getAndSet(c15675d) == null ? true : null) != null) {
                this.f57258b.release();
            }
        }

        public void onError(Throwable th) {
            C2667a.a(th);
        }

        public boolean hasNext() {
            if (this.f57257a == null || !this.f57257a.m58835b()) {
                if (this.f57257a == null) {
                    try {
                        C15736b.m58971a();
                        this.f57258b.acquire();
                        C15675d c15675d = (C15675d) this.f57259c.getAndSet(null);
                        this.f57257a = c15675d;
                        if (c15675d.m58835b()) {
                            throw ExceptionHelper.m58962a(c15675d.m58838e());
                        }
                    } catch (Throwable e) {
                        dispose();
                        this.f57257a = C15675d.m58832a(e);
                        throw ExceptionHelper.m58962a(e);
                    }
                }
                return this.f57257a.m58836c();
            }
            throw ExceptionHelper.m58962a(this.f57257a.m58838e());
        }

        public T next() {
            if (hasNext()) {
                T d = this.f57257a.m58837d();
                this.f57257a = null;
                return d;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public C15711b(ObservableSource<T> observableSource) {
        this.f48592a = observableSource;
    }

    public Iterator<T> iterator() {
        Object c18396a = new C18396a();
        C3959e.wrap(this.f48592a).materialize().subscribe(c18396a);
        return c18396a;
    }
}
