package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.util.C15736b;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class BlockingObservableIterable<T> implements Iterable<T> {
    /* renamed from: a */
    final ObservableSource<? extends T> f48568a;
    /* renamed from: b */
    final int f48569b;

    static final class BlockingObservableIterator<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, Iterator<T> {
        private static final long serialVersionUID = 6695226475494099826L;
        /* renamed from: a */
        final C18423a<T> f53298a;
        /* renamed from: b */
        final Lock f53299b = new ReentrantLock();
        /* renamed from: c */
        final Condition f53300c = this.f53299b.newCondition();
        /* renamed from: d */
        volatile boolean f53301d;
        /* renamed from: e */
        Throwable f53302e;

        BlockingObservableIterator(int i) {
            this.f53298a = new C18423a(i);
        }

        public boolean hasNext() {
            while (true) {
                Throwable th;
                boolean z = this.f53301d;
                boolean isEmpty = this.f53298a.isEmpty();
                if (z) {
                    th = this.f53302e;
                    if (th != null) {
                        throw ExceptionHelper.m58962a(th);
                    } else if (isEmpty) {
                        return false;
                    }
                }
                if (!isEmpty) {
                    return true;
                }
                C15736b.m58971a();
                this.f53299b.lock();
                while (!this.f53301d && this.f53298a.isEmpty()) {
                    try {
                        this.f53300c.await();
                    } catch (Throwable th2) {
                        DisposableHelper.dispose(this);
                        m63508a();
                        throw ExceptionHelper.m58962a(th2);
                    } catch (Throwable th3) {
                        this.f53299b.unlock();
                    }
                }
                this.f53299b.unlock();
            }
        }

        public T next() {
            if (hasNext()) {
                return this.f53298a.poll();
            }
            throw new NoSuchElementException();
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onNext(T t) {
            this.f53298a.offer(t);
            m63508a();
        }

        public void onError(Throwable th) {
            this.f53302e = th;
            this.f53301d = true;
            m63508a();
        }

        public void onComplete() {
            this.f53301d = true;
            m63508a();
        }

        /* renamed from: a */
        void m63508a() {
            this.f53299b.lock();
            try {
                this.f53300c.signalAll();
            } finally {
                this.f53299b.unlock();
            }
        }

        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }
    }

    public BlockingObservableIterable(ObservableSource<? extends T> observableSource, int i) {
        this.f48568a = observableSource;
        this.f48569b = i;
    }

    public Iterator<T> iterator() {
        Object blockingObservableIterator = new BlockingObservableIterator(this.f48569b);
        this.f48568a.subscribe(blockingObservableIterator);
        return blockingObservableIterator;
    }
}
