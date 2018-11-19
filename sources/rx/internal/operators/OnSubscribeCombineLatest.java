package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Producer;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.functions.FuncN;
import rx.internal.util.C19613g;
import rx.internal.util.atomic.C19441e;
import rx.p498c.C19401c;

public final class OnSubscribeCombineLatest<T, R> implements OnSubscribe<R> {
    /* renamed from: a */
    final Observable<? extends T>[] f62199a;
    /* renamed from: b */
    final Iterable<? extends Observable<? extends T>> f62200b;
    /* renamed from: c */
    final FuncN<? extends R> f62201c;
    /* renamed from: d */
    final int f62202d;
    /* renamed from: e */
    final boolean f62203e;

    static final class LatestCoordinator<T, R> extends AtomicInteger implements Producer, Subscription {
        /* renamed from: n */
        static final Object f61135n = new Object();
        private static final long serialVersionUID = 8567835998786448817L;
        /* renamed from: a */
        final C19571c<? super R> f61136a;
        /* renamed from: b */
        final FuncN<? extends R> f61137b;
        /* renamed from: c */
        final C19671a<T, R>[] f61138c;
        /* renamed from: d */
        final int f61139d;
        /* renamed from: e */
        final Object[] f61140e;
        /* renamed from: f */
        final C19441e<Object> f61141f;
        /* renamed from: g */
        final boolean f61142g;
        /* renamed from: h */
        volatile boolean f61143h;
        /* renamed from: i */
        volatile boolean f61144i;
        /* renamed from: j */
        final AtomicLong f61145j = new AtomicLong();
        /* renamed from: k */
        final AtomicReference<Throwable> f61146k = new AtomicReference();
        /* renamed from: l */
        int f61147l;
        /* renamed from: m */
        int f61148m;

        public LatestCoordinator(C19571c<? super R> c19571c, FuncN<? extends R> funcN, int i, int i2, boolean z) {
            this.f61136a = c19571c;
            this.f61137b = funcN;
            this.f61139d = i2;
            this.f61142g = z;
            this.f61140e = new Object[i];
            Arrays.fill(this.f61140e, f61135n);
            this.f61138c = new C19671a[i];
            this.f61141f = new C19441e(i2);
        }

        /* renamed from: a */
        public void m70565a(Observable<? extends T>[] observableArr) {
            C19671a[] c19671aArr = this.f61138c;
            int length = c19671aArr.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                c19671aArr[i2] = new C19671a(this, i2);
            }
            lazySet(0);
            this.f61136a.add(this);
            this.f61136a.setProducer(this);
            while (i < length && !this.f61143h) {
                observableArr[i].m69677b(c19671aArr[i]);
                i++;
            }
        }

        public void request(long j) {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("n >= required but it was ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (j != 0) {
                C19419a.m69900a(this.f61145j, j);
                m70561a();
            }
        }

        public void unsubscribe() {
            if (!this.f61143h) {
                this.f61143h = true;
                if (getAndIncrement() == 0) {
                    m70564a(this.f61141f);
                }
            }
        }

        public boolean isUnsubscribed() {
            return this.f61143h;
        }

        /* renamed from: a */
        void m70564a(Queue<?> queue) {
            queue.clear();
            for (C19671a unsubscribe : this.f61138c) {
                unsubscribe.unsubscribe();
            }
        }

        /* renamed from: a */
        void m70562a(Object obj, int i) {
            Object obj2 = this.f61138c[i];
            synchronized (this) {
                int length = this.f61140e.length;
                Object obj3 = this.f61140e[i];
                int i2 = this.f61147l;
                if (obj3 == f61135n) {
                    i2++;
                    this.f61147l = i2;
                }
                int i3 = this.f61148m;
                if (obj == null) {
                    i3++;
                    this.f61148m = i3;
                } else {
                    this.f61140e[i] = NotificationLite.m69891e(obj);
                }
                i = 0;
                Object obj4 = i2 == length ? 1 : null;
                if (i3 == length || (obj == null && obj3 == f61135n)) {
                    i = 1;
                }
                if (i != 0) {
                    this.f61144i = true;
                } else if (obj != null && obj4 != null) {
                    this.f61141f.m69953a(obj2, this.f61140e.clone());
                } else if (obj == null && this.f61146k.get() != 0 && (obj3 == f61135n || this.f61142g == 0)) {
                    this.f61144i = true;
                }
            }
            if (obj4 != null || obj == null) {
                m70561a();
            } else {
                obj2.m70895a(1);
            }
        }

        /* renamed from: a */
        void m70561a() {
            LatestCoordinator latestCoordinator = this;
            if (getAndIncrement() == 0) {
                Queue queue = latestCoordinator.f61141f;
                C19571c c19571c = latestCoordinator.f61136a;
                boolean z = latestCoordinator.f61142g;
                AtomicLong atomicLong = latestCoordinator.f61145j;
                int i = 1;
                while (!m70566a(latestCoordinator.f61144i, queue.isEmpty(), c19571c, queue, z)) {
                    long j;
                    long j2 = atomicLong.get();
                    long j3 = 0;
                    while (j3 != j2) {
                        boolean z2 = latestCoordinator.f61144i;
                        C19671a c19671a = (C19671a) queue.peek();
                        boolean z3 = c19671a == null;
                        C19671a c19671a2 = c19671a;
                        long j4 = j3;
                        if (!m70566a(z2, z3, c19571c, queue, z)) {
                            if (z3) {
                                j = j4;
                                break;
                            }
                            queue.poll();
                            Object[] objArr = (Object[]) queue.poll();
                            if (objArr == null) {
                                latestCoordinator.f61143h = true;
                                m70564a(queue);
                                c19571c.onError(new IllegalStateException("Broken queue?! Sender received but not the array."));
                                return;
                            }
                            try {
                                c19571c.onNext(latestCoordinator.f61137b.call(objArr));
                                c19671a2.m70895a(1);
                                j3 = j4 + 1;
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                latestCoordinator.f61143h = true;
                                m70564a(queue);
                                c19571c.onError(th2);
                                return;
                            }
                        }
                        return;
                    }
                    j = j3;
                    if (!(j == 0 || j2 == Format.OFFSET_SAMPLE_RELATIVE)) {
                        C19419a.m69902b(atomicLong, j);
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        boolean m70566a(boolean z, boolean z2, C19571c<?> c19571c, Queue<?> queue, boolean z3) {
            if (this.f61143h) {
                m70564a((Queue) queue);
                return true;
            }
            if (z) {
                Throwable th;
                if (!z3) {
                    th = (Throwable) this.f61146k.get();
                    if (th != null) {
                        m70564a((Queue) queue);
                        c19571c.onError(th);
                        return true;
                    } else if (z2) {
                        c19571c.onCompleted();
                        return true;
                    }
                } else if (z2) {
                    th = (Throwable) this.f61146k.get();
                    if (th != null) {
                        c19571c.onError(th);
                    } else {
                        c19571c.onCompleted();
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        void m70563a(Throwable th) {
            AtomicReference atomicReference = this.f61146k;
            Throwable th2;
            Object obj;
            do {
                th2 = (Throwable) atomicReference.get();
                if (th2 == null) {
                    obj = th;
                } else if (th2 instanceof CompositeException) {
                    Collection arrayList = new ArrayList(((CompositeException) th2).m69862a());
                    arrayList.add(th);
                    obj = new CompositeException(arrayList);
                } else {
                    obj = new CompositeException(Arrays.asList(new Throwable[]{th2, th}));
                }
            } while (!atomicReference.compareAndSet(th2, obj));
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCombineLatest$a */
    static final class C19671a<T, R> extends C19571c<T> {
        /* renamed from: a */
        final LatestCoordinator<T, R> f61459a;
        /* renamed from: b */
        final int f61460b;
        /* renamed from: c */
        boolean f61461c;

        public C19671a(LatestCoordinator<T, R> latestCoordinator, int i) {
            this.f61459a = latestCoordinator;
            this.f61460b = i;
            request((long) latestCoordinator.f61139d);
        }

        public void onNext(T t) {
            if (!this.f61461c) {
                this.f61459a.m70562a(NotificationLite.m69885a((Object) t), this.f61460b);
            }
        }

        public void onError(Throwable th) {
            if (this.f61461c) {
                C19401c.m69811a(th);
                return;
            }
            this.f61459a.m70563a(th);
            this.f61461c = true;
            this.f61459a.m70562a(null, this.f61460b);
        }

        public void onCompleted() {
            if (!this.f61461c) {
                this.f61461c = true;
                this.f61459a.m70562a(null, this.f61460b);
            }
        }

        /* renamed from: a */
        public void m70895a(long j) {
            request(j);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71568a((C19571c) obj);
    }

    public OnSubscribeCombineLatest(Iterable<? extends Observable<? extends T>> iterable, FuncN<? extends R> funcN) {
        this(null, iterable, funcN, C19613g.f61292b, false);
    }

    public OnSubscribeCombineLatest(Observable<? extends T>[] observableArr, Iterable<? extends Observable<? extends T>> iterable, FuncN<? extends R> funcN, int i, boolean z) {
        this.f62199a = observableArr;
        this.f62200b = iterable;
        this.f62201c = funcN;
        this.f62202d = i;
        this.f62203e = z;
    }

    /* renamed from: a */
    public void m71568a(C19571c<? super R> c19571c) {
        int length;
        int i;
        Observable[] observableArr = this.f62199a;
        if (observableArr != null) {
            length = observableArr.length;
        } else if (this.f62200b instanceof List) {
            List list = (List) this.f62200b;
            observableArr = (Observable[]) list.toArray(new Observable[list.size()]);
            length = observableArr.length;
        } else {
            Object obj = new Observable[8];
            Object obj2 = obj;
            int i2 = 0;
            for (Observable observable : this.f62200b) {
                if (i2 == obj2.length) {
                    Object obj3 = new Observable[((i2 >> 2) + i2)];
                    System.arraycopy(obj2, 0, obj3, 0, i2);
                    obj2 = obj3;
                }
                i = i2 + 1;
                obj2[i2] = observable;
                i2 = i;
            }
            i = i2;
            observableArr = obj2;
            if (i != 0) {
                c19571c.onCompleted();
            }
            new LatestCoordinator(c19571c, this.f62201c, i, this.f62202d, this.f62203e).m70565a(observableArr);
            return;
        }
        i = length;
        if (i != 0) {
            new LatestCoordinator(c19571c, this.f62201c, i, this.f62202d, this.f62203e).m70565a(observableArr);
            return;
        }
        c19571c.onCompleted();
    }
}
