package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;
import rx.C19571c;
import rx.Observable;
import rx.Observable.Operator;
import rx.Producer;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.functions.Action0;
import rx.internal.util.C19613g;
import rx.internal.util.atomic.C19441e;
import rx.p498c.C19401c;
import rx.p500e.C19407e;
import rx.p500e.C19575d;

public final class aw<T> implements Operator<T, Observable<? extends T>> {
    /* renamed from: a */
    final boolean f62044a;

    /* renamed from: rx.internal.operators.aw$a */
    static final class C19429a {
        /* renamed from: a */
        static final aw<Object> f60622a = new aw(false);
    }

    /* renamed from: rx.internal.operators.aw$b */
    static final class C19430b {
        /* renamed from: a */
        static final aw<Object> f60623a = new aw(true);
    }

    /* renamed from: rx.internal.operators.aw$c */
    static final class C19706c<T> extends C19571c<T> {
        /* renamed from: a */
        private final long f61645a;
        /* renamed from: b */
        private final C19707d<T> f61646b;

        C19706c(long j, C19707d<T> c19707d) {
            this.f61645a = j;
            this.f61646b = c19707d;
        }

        public void setProducer(Producer producer) {
            this.f61646b.m70969a(producer, this.f61645a);
        }

        public void onNext(T t) {
            this.f61646b.m70966a((Object) t, this);
        }

        public void onError(Throwable th) {
            this.f61646b.m70967a(th, this.f61645a);
        }

        public void onCompleted() {
            this.f61646b.m70965a(this.f61645a);
        }
    }

    /* renamed from: rx.internal.operators.aw$d */
    static final class C19707d<T> extends C19571c<Observable<? extends T>> {
        /* renamed from: m */
        static final Throwable f61647m = new Throwable("Terminal error");
        /* renamed from: a */
        final C19571c<? super T> f61648a;
        /* renamed from: b */
        final C19575d f61649b = new C19575d();
        /* renamed from: c */
        final boolean f61650c;
        /* renamed from: d */
        final AtomicLong f61651d;
        /* renamed from: e */
        final C19441e<Object> f61652e;
        /* renamed from: f */
        boolean f61653f;
        /* renamed from: g */
        boolean f61654g;
        /* renamed from: h */
        long f61655h;
        /* renamed from: i */
        Producer f61656i;
        /* renamed from: j */
        volatile boolean f61657j;
        /* renamed from: k */
        Throwable f61658k;
        /* renamed from: l */
        boolean f61659l;

        /* renamed from: rx.internal.operators.aw$d$2 */
        class C195872 implements Producer {
            /* renamed from: a */
            final /* synthetic */ C19707d f61200a;

            C195872(C19707d c19707d) {
                this.f61200a = c19707d;
            }

            public void request(long j) {
                if (j > 0) {
                    this.f61200a.m70973b(j);
                } else if (j < 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("n >= 0 expected but it was ");
                    stringBuilder.append(j);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }

        /* renamed from: rx.internal.operators.aw$d$1 */
        class C198281 implements Action0 {
            /* renamed from: a */
            final /* synthetic */ C19707d f62043a;

            C198281(C19707d c19707d) {
                this.f62043a = c19707d;
            }

            public void call() {
                this.f62043a.m70972b();
            }
        }

        public /* synthetic */ void onNext(Object obj) {
            m70968a((Observable) obj);
        }

        C19707d(C19571c<? super T> c19571c, boolean z) {
            this.f61648a = c19571c;
            this.f61650c = z;
            this.f61651d = new AtomicLong();
            this.f61652e = new C19441e(C19613g.f61292b);
        }

        /* renamed from: a */
        void m70964a() {
            this.f61648a.add(this.f61649b);
            this.f61648a.add(C19407e.m69854a(new C198281(this)));
            this.f61648a.setProducer(new C195872(this));
        }

        /* renamed from: b */
        void m70972b() {
            synchronized (this) {
                this.f61656i = null;
            }
        }

        /* renamed from: a */
        public void m70968a(Observable<? extends T> observable) {
            C19571c c19706c;
            long incrementAndGet = this.f61651d.incrementAndGet();
            Subscription a = this.f61649b.m70553a();
            if (a != null) {
                a.unsubscribe();
            }
            synchronized (this) {
                c19706c = new C19706c(incrementAndGet, this);
                this.f61659l = true;
                this.f61656i = null;
            }
            this.f61649b.m70554a(c19706c);
            observable.m69661a(c19706c);
        }

        public void onError(Throwable th) {
            synchronized (this) {
                boolean a = m70970a(th);
            }
            if (a) {
                this.f61657j = true;
                m70975c();
                return;
            }
            m70974b(th);
        }

        /* renamed from: a */
        boolean m70970a(Throwable th) {
            Throwable th2 = this.f61658k;
            if (th2 == f61647m) {
                return false;
            }
            if (th2 == null) {
                this.f61658k = th;
            } else if (th2 instanceof CompositeException) {
                Collection arrayList = new ArrayList(((CompositeException) th2).m69862a());
                arrayList.add(th);
                this.f61658k = new CompositeException(arrayList);
            } else {
                this.f61658k = new CompositeException(th2, th);
            }
            return true;
        }

        public void onCompleted() {
            this.f61657j = true;
            m70975c();
        }

        /* renamed from: a */
        void m70966a(T t, C19706c<T> c19706c) {
            synchronized (this) {
                if (this.f61651d.get() != c19706c.f61645a) {
                    return;
                }
                this.f61652e.m69953a((Object) c19706c, NotificationLite.m69885a((Object) t));
                m70975c();
            }
        }

        /* renamed from: a */
        void m70967a(Throwable th, long j) {
            synchronized (this) {
                if (this.f61651d.get() == j) {
                    j = m70970a(th);
                    this.f61659l = false;
                    this.f61656i = null;
                } else {
                    j = 1;
                }
            }
            if (j != null) {
                m70975c();
            } else {
                m70974b(th);
            }
        }

        /* renamed from: a */
        void m70965a(long j) {
            synchronized (this) {
                if (this.f61651d.get() != j) {
                    return;
                }
                this.f61659l = 0;
                this.f61656i = 0;
                m70975c();
            }
        }

        /* renamed from: b */
        void m70974b(Throwable th) {
            C19401c.m69811a(th);
        }

        /* renamed from: a */
        void m70969a(Producer producer, long j) {
            synchronized (this) {
                if (this.f61651d.get() != j) {
                    return;
                }
                j = this.f61655h;
                this.f61656i = producer;
                producer.request(j);
            }
        }

        /* renamed from: b */
        void m70973b(long j) {
            synchronized (this) {
                Producer producer = this.f61656i;
                this.f61655h = C19419a.m69899a(this.f61655h, j);
            }
            if (producer != null) {
                producer.request(j);
            }
            m70975c();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: c */
        void m70975c() {
            /*
            r20 = this;
            r8 = r20;
            monitor-enter(r20);
            r1 = r8.f61653f;	 Catch:{ all -> 0x00d2 }
            r2 = 1;
            if (r1 == 0) goto L_0x000c;
        L_0x0008:
            r8.f61654g = r2;	 Catch:{ all -> 0x00d2 }
            monitor-exit(r20);	 Catch:{ all -> 0x00d2 }
            return;
        L_0x000c:
            r8.f61653f = r2;	 Catch:{ all -> 0x00d2 }
            r1 = r8.f61659l;	 Catch:{ all -> 0x00d2 }
            r2 = r8.f61655h;	 Catch:{ all -> 0x00d2 }
            r4 = r8.f61658k;	 Catch:{ all -> 0x00d2 }
            if (r4 == 0) goto L_0x0022;
        L_0x0016:
            r5 = f61647m;	 Catch:{ all -> 0x00d2 }
            if (r4 == r5) goto L_0x0022;
        L_0x001a:
            r5 = r8.f61650c;	 Catch:{ all -> 0x00d2 }
            if (r5 != 0) goto L_0x0022;
        L_0x001e:
            r5 = f61647m;	 Catch:{ all -> 0x00d2 }
            r8.f61658k = r5;	 Catch:{ all -> 0x00d2 }
        L_0x0022:
            monitor-exit(r20);	 Catch:{ all -> 0x00d2 }
            r9 = r8.f61652e;
            r10 = r8.f61651d;
            r11 = r8.f61648a;
            r5 = r8.f61657j;
            r14 = r1;
            r12 = r2;
            r15 = r4;
            r16 = r5;
        L_0x0030:
            r1 = 0;
            r17 = r1;
        L_0x0034:
            r1 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1));
            if (r1 == 0) goto L_0x007a;
        L_0x0038:
            r1 = r11.isUnsubscribed();
            if (r1 == 0) goto L_0x003f;
        L_0x003e:
            return;
        L_0x003f:
            r19 = r9.isEmpty();
            r1 = r8;
            r2 = r16;
            r3 = r14;
            r4 = r15;
            r5 = r9;
            r6 = r11;
            r7 = r19;
            r1 = r1.m70971a(r2, r3, r4, r5, r6, r7);
            if (r1 == 0) goto L_0x0053;
        L_0x0052:
            return;
        L_0x0053:
            if (r19 == 0) goto L_0x0056;
        L_0x0055:
            goto L_0x007a;
        L_0x0056:
            r1 = r9.poll();
            r1 = (rx.internal.operators.aw.C19706c) r1;
            r2 = r9.poll();
            r2 = rx.internal.operators.NotificationLite.m69891e(r2);
            r3 = r10.get();
            r5 = r1.f61645a;
            r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
            if (r1 != 0) goto L_0x0034;
        L_0x0070:
            r11.onNext(r2);
            r1 = 1;
            r3 = r17 + r1;
            r17 = r3;
            goto L_0x0034;
        L_0x007a:
            r1 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1));
            if (r1 != 0) goto L_0x0097;
        L_0x007e:
            r1 = r11.isUnsubscribed();
            if (r1 == 0) goto L_0x0085;
        L_0x0084:
            return;
        L_0x0085:
            r2 = r8.f61657j;
            r7 = r9.isEmpty();
            r1 = r8;
            r3 = r14;
            r4 = r15;
            r5 = r9;
            r6 = r11;
            r1 = r1.m70971a(r2, r3, r4, r5, r6, r7);
            if (r1 == 0) goto L_0x0097;
        L_0x0096:
            return;
        L_0x0097:
            monitor-enter(r20);
            r1 = r8.f61655h;	 Catch:{ all -> 0x00ce }
            r3 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
            if (r5 == 0) goto L_0x00a9;
        L_0x00a3:
            r3 = r1 - r17;
            r8.f61655h = r3;	 Catch:{ all -> 0x00ce }
            r12 = r3;
            goto L_0x00aa;
        L_0x00a9:
            r12 = r1;
        L_0x00aa:
            r1 = r8.f61654g;	 Catch:{ all -> 0x00ce }
            r2 = 0;
            if (r1 != 0) goto L_0x00b3;
        L_0x00af:
            r8.f61653f = r2;	 Catch:{ all -> 0x00ce }
            monitor-exit(r20);	 Catch:{ all -> 0x00ce }
            return;
        L_0x00b3:
            r8.f61654g = r2;	 Catch:{ all -> 0x00ce }
            r1 = r8.f61657j;	 Catch:{ all -> 0x00ce }
            r14 = r8.f61659l;	 Catch:{ all -> 0x00ce }
            r15 = r8.f61658k;	 Catch:{ all -> 0x00ce }
            if (r15 == 0) goto L_0x00c9;
        L_0x00bd:
            r2 = f61647m;	 Catch:{ all -> 0x00ce }
            if (r15 == r2) goto L_0x00c9;
        L_0x00c1:
            r2 = r8.f61650c;	 Catch:{ all -> 0x00ce }
            if (r2 != 0) goto L_0x00c9;
        L_0x00c5:
            r2 = f61647m;	 Catch:{ all -> 0x00ce }
            r8.f61658k = r2;	 Catch:{ all -> 0x00ce }
        L_0x00c9:
            monitor-exit(r20);	 Catch:{ all -> 0x00ce }
            r16 = r1;
            goto L_0x0030;
        L_0x00ce:
            r0 = move-exception;
            r1 = r0;
            monitor-exit(r20);	 Catch:{ all -> 0x00ce }
            throw r1;
        L_0x00d2:
            r0 = move-exception;
            r1 = r0;
            monitor-exit(r20);	 Catch:{ all -> 0x00d2 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.aw.d.c():void");
        }

        /* renamed from: a */
        protected boolean m70971a(boolean z, boolean z2, Throwable th, C19441e<Object> c19441e, C19571c<? super T> c19571c, boolean z3) {
            if (this.f61650c) {
                if (z && !z2 && z3) {
                    if (th != null) {
                        c19571c.onError(th);
                    } else {
                        c19571c.onCompleted();
                    }
                    return true;
                }
            } else if (th != null) {
                c19441e.clear();
                c19571c.onError(th);
                return true;
            } else if (z && !z2 && z3) {
                c19571c.onCompleted();
                return true;
            }
            return false;
        }
    }

    public /* synthetic */ Object call(Object obj) {
        return m71464a((C19571c) obj);
    }

    /* renamed from: a */
    public static <T> aw<T> m71463a(boolean z) {
        if (z) {
            return C19430b.f60623a;
        }
        return C19429a.f60622a;
    }

    aw(boolean z) {
        this.f62044a = z;
    }

    /* renamed from: a */
    public C19571c<? super Observable<? extends T>> m71464a(C19571c<? super T> c19571c) {
        C19571c<? super Observable<? extends T>> c19707d = new C19707d(c19571c, this.f62044a);
        c19571c.add(c19707d);
        c19707d.m70964a();
        return c19707d;
    }
}
