package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.util.C15739f;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableCache<T> extends C18394a<T, T> {
    /* renamed from: b */
    final C17425a<T> f58907b;
    /* renamed from: c */
    final AtomicBoolean f58908c = new AtomicBoolean();

    static final class ReplayDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 7058506693698832024L;
        /* renamed from: a */
        final Observer<? super T> f53338a;
        /* renamed from: b */
        final C17425a<T> f53339b;
        /* renamed from: c */
        Object[] f53340c;
        /* renamed from: d */
        int f53341d;
        /* renamed from: e */
        int f53342e;
        /* renamed from: f */
        volatile boolean f53343f;

        ReplayDisposable(Observer<? super T> observer, C17425a<T> c17425a) {
            this.f53338a = observer;
            this.f53339b = c17425a;
        }

        public boolean isDisposed() {
            return this.f53343f;
        }

        public void dispose() {
            if (!this.f53343f) {
                this.f53343f = true;
                this.f53339b.m63521b(this);
            }
        }

        /* renamed from: a */
        public void m63518a() {
            if (getAndIncrement() == 0) {
                Observer observer = this.f53338a;
                int i = 1;
                while (!this.f53343f) {
                    int c = this.f53339b.m58986c();
                    if (c != 0) {
                        Object[] objArr = this.f53340c;
                        if (objArr == null) {
                            objArr = this.f53339b.m58985b();
                            this.f53340c = objArr;
                        }
                        int length = objArr.length - 1;
                        int i2 = this.f53342e;
                        int i3 = this.f53341d;
                        while (i2 < c) {
                            if (!this.f53343f) {
                                if (i3 == length) {
                                    objArr = (Object[]) objArr[length];
                                    i3 = 0;
                                }
                                if (!NotificationLite.accept(objArr[i3], observer)) {
                                    i3++;
                                    i2++;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (!this.f53343f) {
                            this.f53342e = i2;
                            this.f53341d = i3;
                            this.f53340c = objArr;
                        } else {
                            return;
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCache$a */
    static final class C17425a<T> extends C15739f implements Observer<T> {
        /* renamed from: d */
        static final ReplayDisposable[] f53344d = new ReplayDisposable[0];
        /* renamed from: e */
        static final ReplayDisposable[] f53345e = new ReplayDisposable[0];
        /* renamed from: a */
        final C3959e<? extends T> f53346a;
        /* renamed from: b */
        final SequentialDisposable f53347b = new SequentialDisposable();
        /* renamed from: c */
        final AtomicReference<ReplayDisposable<T>[]> f53348c = new AtomicReference(f53344d);
        /* renamed from: f */
        volatile boolean f53349f;
        /* renamed from: g */
        boolean f53350g;

        C17425a(C3959e<? extends T> c3959e, int i) {
            super(i);
            this.f53346a = c3959e;
        }

        /* renamed from: a */
        public boolean m63520a(ReplayDisposable<T> replayDisposable) {
            ReplayDisposable[] replayDisposableArr;
            Object obj;
            do {
                replayDisposableArr = (ReplayDisposable[]) this.f53348c.get();
                if (replayDisposableArr == f53345e) {
                    return false;
                }
                int length = replayDisposableArr.length;
                obj = new ReplayDisposable[(length + 1)];
                System.arraycopy(replayDisposableArr, 0, obj, 0, length);
                obj[length] = replayDisposable;
            } while (!this.f53348c.compareAndSet(replayDisposableArr, obj));
            return true;
        }

        /* renamed from: b */
        public void m63521b(ReplayDisposable<T> replayDisposable) {
            ReplayDisposable[] replayDisposableArr;
            Object obj;
            do {
                replayDisposableArr = (ReplayDisposable[]) this.f53348c.get();
                int length = replayDisposableArr.length;
                if (length != 0) {
                    int i = -1;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (replayDisposableArr[i2].equals(replayDisposable)) {
                            i = i2;
                            break;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = f53344d;
                        } else {
                            Object obj2 = new ReplayDisposable[(length - 1)];
                            System.arraycopy(replayDisposableArr, 0, obj2, 0, i);
                            System.arraycopy(replayDisposableArr, i + 1, obj2, i, (length - i) - 1);
                            obj = obj2;
                        }
                    } else {
                        return;
                    }
                }
                return;
            } while (!this.f53348c.compareAndSet(replayDisposableArr, obj));
        }

        public void onSubscribe(Disposable disposable) {
            this.f53347b.m63457a(disposable);
        }

        /* renamed from: a */
        public void m63519a() {
            this.f53346a.subscribe(this);
            this.f53349f = true;
        }

        public void onNext(T t) {
            if (!this.f53350g) {
                m58984a(NotificationLite.next(t));
                for (ReplayDisposable a : (ReplayDisposable[]) this.f53348c.get()) {
                    a.m63518a();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f53350g) {
                this.f53350g = true;
                m58984a(NotificationLite.error(th));
                this.f53347b.dispose();
                for (ReplayDisposable a : (ReplayDisposable[]) this.f53348c.getAndSet(f53345e)) {
                    a.m63518a();
                }
            }
        }

        public void onComplete() {
            if (!this.f53350g) {
                this.f53350g = true;
                m58984a(NotificationLite.complete());
                this.f53347b.dispose();
                for (ReplayDisposable a : (ReplayDisposable[]) this.f53348c.getAndSet(f53345e)) {
                    a.m63518a();
                }
            }
        }
    }

    /* renamed from: a */
    public static <T> C3959e<T> m67623a(C3959e<T> c3959e) {
        return m67624a(c3959e, 16);
    }

    /* renamed from: a */
    public static <T> C3959e<T> m67624a(C3959e<T> c3959e, int i) {
        C15684a.m58891a(i, "capacityHint");
        return C2667a.a(new ObservableCache(c3959e, new C17425a(c3959e, i)));
    }

    private ObservableCache(C3959e<T> c3959e, C17425a<T> c17425a) {
        super(c3959e);
        this.f58907b = c17425a;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        ReplayDisposable replayDisposable = new ReplayDisposable(observer, this.f58907b);
        observer.onSubscribe(replayDisposable);
        this.f58907b.m63520a(replayDisposable);
        if (this.f58908c.get() == null && this.f58908c.compareAndSet(false, true) != null) {
            this.f58907b.m63519a();
        }
        replayDisposable.m63518a();
    }
}
