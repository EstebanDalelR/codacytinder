package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.C17527a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: io.reactivex.internal.operators.observable.c */
public final class C15717c<T> implements Iterable<T> {
    /* renamed from: a */
    final ObservableSource<T> f48603a;
    /* renamed from: b */
    final T f48604b;

    /* renamed from: io.reactivex.internal.operators.observable.c$a */
    static final class C18401a<T> extends C17527a<T> {
        /* renamed from: a */
        volatile Object f57284a;

        /* renamed from: io.reactivex.internal.operators.observable.c$a$a */
        final class C15716a implements Iterator<T> {
            /* renamed from: a */
            final /* synthetic */ C18401a f48601a;
            /* renamed from: b */
            private Object f48602b;

            C15716a(C18401a c18401a) {
                this.f48601a = c18401a;
            }

            public boolean hasNext() {
                this.f48602b = this.f48601a.f57284a;
                return NotificationLite.isComplete(this.f48602b) ^ 1;
            }

            public T next() {
                try {
                    if (this.f48602b == null) {
                        Object obj = this.f48601a.f57284a;
                    }
                    if (NotificationLite.isComplete(this.f48602b)) {
                        throw new NoSuchElementException();
                    } else if (NotificationLite.isError(this.f48602b)) {
                        throw ExceptionHelper.m58962a(NotificationLite.getError(this.f48602b));
                    } else {
                        T value = NotificationLite.getValue(this.f48602b);
                        this.f48602b = null;
                        return value;
                    }
                } finally {
                    this.f48602b = null;
                }
            }

            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        C18401a(T t) {
            this.f57284a = NotificationLite.next(t);
        }

        public void onComplete() {
            this.f57284a = NotificationLite.complete();
        }

        public void onError(Throwable th) {
            this.f57284a = NotificationLite.error(th);
        }

        public void onNext(T t) {
            this.f57284a = NotificationLite.next(t);
        }

        /* renamed from: a */
        public C15716a m66520a() {
            return new C15716a(this);
        }
    }

    public C15717c(ObservableSource<T> observableSource, T t) {
        this.f48603a = observableSource;
        this.f48604b = t;
    }

    public Iterator<T> iterator() {
        Object c18401a = new C18401a(this.f48604b);
        this.f48603a.subscribe(c18401a);
        return c18401a.m66520a();
    }
}
