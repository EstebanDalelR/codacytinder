package io.reactivex.internal.operators.observable;

import io.reactivex.C15675d;
import io.reactivex.ObservableSource;
import io.reactivex.internal.util.C15736b;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.C17528b;
import io.reactivex.p079d.C2667a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.reactivex.internal.operators.observable.d */
public final class C15719d<T> implements Iterable<T> {
    /* renamed from: a */
    final ObservableSource<T> f48612a;

    /* renamed from: io.reactivex.internal.operators.observable.d$a */
    static final class C15718a<T> implements Iterator<T> {
        /* renamed from: a */
        private final C18402b<T> f48605a;
        /* renamed from: b */
        private final ObservableSource<T> f48606b;
        /* renamed from: c */
        private T f48607c;
        /* renamed from: d */
        private boolean f48608d = true;
        /* renamed from: e */
        private boolean f48609e = true;
        /* renamed from: f */
        private Throwable f48610f;
        /* renamed from: g */
        private boolean f48611g;

        C15718a(ObservableSource<T> observableSource, C18402b<T> c18402b) {
            this.f48606b = observableSource;
            this.f48605a = c18402b;
        }

        public boolean hasNext() {
            if (this.f48610f != null) {
                throw ExceptionHelper.m58962a(this.f48610f);
            }
            boolean z = false;
            if (!this.f48608d) {
                return false;
            }
            if (!this.f48609e || m58937a()) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        private boolean m58937a() {
            if (!this.f48611g) {
                this.f48611g = true;
                this.f48605a.m66523b();
                new ay(this.f48606b).subscribe(this.f48605a);
            }
            try {
                C15675d a = this.f48605a.m66521a();
                if (a.m58836c()) {
                    this.f48609e = false;
                    this.f48607c = a.m58837d();
                    return true;
                }
                this.f48608d = false;
                if (a.m58834a()) {
                    return false;
                }
                this.f48610f = a.m58838e();
                throw ExceptionHelper.m58962a(this.f48610f);
            } catch (Throwable e) {
                this.f48605a.dispose();
                this.f48610f = e;
                throw ExceptionHelper.m58962a(e);
            }
        }

        public T next() {
            if (this.f48610f != null) {
                throw ExceptionHelper.m58962a(this.f48610f);
            } else if (hasNext()) {
                this.f48609e = true;
                return this.f48607c;
            } else {
                throw new NoSuchElementException("No more elements");
            }
        }

        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.d$b */
    static final class C18402b<T> extends C17528b<C15675d<T>> {
        /* renamed from: a */
        final AtomicInteger f57285a = new AtomicInteger();
        /* renamed from: b */
        private final BlockingQueue<C15675d<T>> f57286b = new ArrayBlockingQueue(1);

        public void onComplete() {
        }

        C18402b() {
        }

        public /* synthetic */ void onNext(Object obj) {
            m66522a((C15675d) obj);
        }

        public void onError(Throwable th) {
            C2667a.a(th);
        }

        /* renamed from: a */
        public void m66522a(C15675d<T> c15675d) {
            if (this.f57285a.getAndSet(0) == 1 || !c15675d.m58836c()) {
                while (!this.f57286b.offer(c15675d)) {
                    C15675d<T> c15675d2 = (C15675d) this.f57286b.poll();
                    if (!(c15675d2 == null || c15675d2.m58836c())) {
                        c15675d = c15675d2;
                    }
                }
            }
        }

        /* renamed from: a */
        public C15675d<T> m66521a() throws InterruptedException {
            m66523b();
            C15736b.m58971a();
            return (C15675d) this.f57286b.take();
        }

        /* renamed from: b */
        void m66523b() {
            this.f57285a.set(1);
        }
    }

    public C15719d(ObservableSource<T> observableSource) {
        this.f48612a = observableSource;
    }

    public Iterator<T> iterator() {
        return new C15718a(this.f48612a, new C18402b());
    }
}
