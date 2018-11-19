package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Producer;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action0;
import rx.internal.util.C19613g;
import rx.internal.util.atomic.C19611d;
import rx.internal.util.unsafe.C19924r;
import rx.internal.util.unsafe.af;
import rx.p497b.C19565b;
import rx.p500e.C19407e;

public final class OperatorPublish<T> extends C19565b<T> {
    /* renamed from: b */
    final Observable<? extends T> f61521b;
    /* renamed from: c */
    final AtomicReference<C19677a<T>> f61522c;

    static final class InnerProducer<T> extends AtomicLong implements Producer, Subscription {
        private static final long serialVersionUID = -4453897557930727610L;
        /* renamed from: a */
        final C19677a<T> f61169a;
        /* renamed from: b */
        final C19571c<? super T> f61170b;

        public InnerProducer(C19677a<T> c19677a, C19571c<? super T> c19571c) {
            this.f61169a = c19677a;
            this.f61170b = c19571c;
            lazySet(0);
        }

        public void request(long j) {
            if (j >= 0) {
                long j2;
                long j3;
                do {
                    j2 = get();
                    if (j2 != Long.MIN_VALUE) {
                        if (j2 >= 0 && j == 0) {
                            return;
                        }
                        if (j2 == -4611686018427387904L) {
                            j3 = j;
                        } else {
                            j3 = j2 + j;
                            if (j3 < 0) {
                                j3 = Format.OFFSET_SAMPLE_RELATIVE;
                            }
                        }
                    } else {
                        return;
                    }
                } while (!compareAndSet(j2, j3));
                this.f61169a.m70929b();
            }
        }

        /* renamed from: a */
        public long m70577a(long j) {
            if (j <= 0) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            long j2;
            long j3;
            do {
                j3 = get();
                if (j3 == -4611686018427387904L) {
                    throw new IllegalStateException("Produced without request");
                } else if (j3 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                } else {
                    j2 = j3 - j;
                    if (j2 < 0) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("More produced (");
                        stringBuilder.append(j);
                        stringBuilder.append(") than requested (");
                        stringBuilder.append(j3);
                        stringBuilder.append(")");
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            } while (!compareAndSet(j3, j2));
            return j2;
        }

        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        public void unsubscribe() {
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f61169a.m70930b(this);
                this.f61169a.m70929b();
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorPublish$a */
    static final class C19677a<T> extends C19571c<T> implements Subscription {
        /* renamed from: d */
        static final InnerProducer[] f61512d = new InnerProducer[0];
        /* renamed from: e */
        static final InnerProducer[] f61513e = new InnerProducer[0];
        /* renamed from: a */
        final Queue<Object> f61514a;
        /* renamed from: b */
        final AtomicReference<C19677a<T>> f61515b;
        /* renamed from: c */
        volatile Object f61516c;
        /* renamed from: f */
        final AtomicReference<InnerProducer[]> f61517f;
        /* renamed from: g */
        final AtomicBoolean f61518g;
        /* renamed from: h */
        boolean f61519h;
        /* renamed from: i */
        boolean f61520i;

        /* renamed from: rx.internal.operators.OperatorPublish$a$1 */
        class C198171 implements Action0 {
            /* renamed from: a */
            final /* synthetic */ C19677a f61977a;

            C198171(C19677a c19677a) {
                this.f61977a = c19677a;
            }

            public void call() {
                this.f61977a.f61517f.getAndSet(C19677a.f61513e);
                this.f61977a.f61515b.compareAndSet(this.f61977a, null);
            }
        }

        public C19677a(AtomicReference<C19677a<T>> atomicReference) {
            this.f61514a = af.m69984a() ? new C19924r(C19613g.f61292b) : new C19611d(C19613g.f61292b);
            this.f61517f = new AtomicReference(f61512d);
            this.f61515b = atomicReference;
            this.f61518g = new AtomicBoolean();
        }

        /* renamed from: a */
        void m70926a() {
            add(C19407e.m69854a(new C198171(this)));
        }

        public void onStart() {
            request((long) C19613g.f61292b);
        }

        public void onNext(T t) {
            if (this.f61514a.offer(NotificationLite.m69885a((Object) t)) == null) {
                onError(new MissingBackpressureException());
            } else {
                m70929b();
            }
        }

        public void onError(Throwable th) {
            if (this.f61516c == null) {
                this.f61516c = NotificationLite.m69886a(th);
                m70929b();
            }
        }

        public void onCompleted() {
            if (this.f61516c == null) {
                this.f61516c = NotificationLite.m69884a();
                m70929b();
            }
        }

        /* renamed from: a */
        boolean m70928a(InnerProducer<T> innerProducer) {
            if (innerProducer == null) {
                throw new NullPointerException();
            }
            InnerProducer[] innerProducerArr;
            Object obj;
            do {
                innerProducerArr = (InnerProducer[]) this.f61517f.get();
                if (innerProducerArr == f61513e) {
                    return false;
                }
                int length = innerProducerArr.length;
                obj = new InnerProducer[(length + 1)];
                System.arraycopy(innerProducerArr, 0, obj, 0, length);
                obj[length] = innerProducer;
            } while (!this.f61517f.compareAndSet(innerProducerArr, obj));
            return true;
        }

        /* renamed from: b */
        void m70930b(InnerProducer<T> innerProducer) {
            InnerProducer[] innerProducerArr;
            Object obj;
            do {
                innerProducerArr = (InnerProducer[]) this.f61517f.get();
                if (innerProducerArr != f61512d) {
                    if (innerProducerArr != f61513e) {
                        int i = -1;
                        int length = innerProducerArr.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            if (innerProducerArr[i2].equals(innerProducer)) {
                                i = i2;
                                break;
                            }
                        }
                        if (i >= 0) {
                            if (length == 1) {
                                obj = f61512d;
                            } else {
                                Object obj2 = new InnerProducer[(length - 1)];
                                System.arraycopy(innerProducerArr, 0, obj2, 0, i);
                                System.arraycopy(innerProducerArr, i + 1, obj2, i, (length - i) - 1);
                                obj = obj2;
                            }
                        } else {
                            return;
                        }
                    }
                }
                return;
            } while (!this.f61517f.compareAndSet(innerProducerArr, obj));
        }

        /* renamed from: a */
        boolean m70927a(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!NotificationLite.m69888b(obj)) {
                    obj = NotificationLite.m69892f(obj);
                    this.f61515b.compareAndSet(this, null);
                    try {
                        InnerProducer[] innerProducerArr = (InnerProducer[]) this.f61517f.getAndSet(f61513e);
                        int length = innerProducerArr.length;
                        while (i < length) {
                            innerProducerArr[i].f61170b.onError(obj);
                            i++;
                        }
                        return true;
                    } finally {
                        unsubscribe();
                    }
                } else if (z) {
                    this.f61515b.compareAndSet(this, null);
                    try {
                        InnerProducer[] innerProducerArr2 = (InnerProducer[]) this.f61517f.getAndSet(f61513e);
                        z = innerProducerArr2.length;
                        boolean z2;
                        while (z2 < z) {
                            innerProducerArr2[z2].f61170b.onCompleted();
                            z2++;
                        }
                        return true;
                    } finally {
                        unsubscribe();
                    }
                }
            }
            return false;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: b */
        void m70929b() {
            /*
            r20 = this;
            r1 = r20;
            monitor-enter(r20);
            r2 = r1.f61519h;	 Catch:{ all -> 0x00f9 }
            r3 = 1;
            if (r2 == 0) goto L_0x000c;
        L_0x0008:
            r1.f61520i = r3;	 Catch:{ all -> 0x00f9 }
            monitor-exit(r20);	 Catch:{ all -> 0x00f9 }
            return;
        L_0x000c:
            r1.f61519h = r3;	 Catch:{ all -> 0x00f9 }
            r2 = 0;
            r1.f61520i = r2;	 Catch:{ all -> 0x00f9 }
            monitor-exit(r20);	 Catch:{ all -> 0x00f9 }
        L_0x0012:
            r4 = r1.f61516c;	 Catch:{ all -> 0x00e9 }
            r5 = r1.f61514a;	 Catch:{ all -> 0x00e9 }
            r5 = r5.isEmpty();	 Catch:{ all -> 0x00e9 }
            r4 = r1.m70927a(r4, r5);	 Catch:{ all -> 0x00e9 }
            if (r4 == 0) goto L_0x0021;
        L_0x0020:
            return;
        L_0x0021:
            if (r5 != 0) goto L_0x00c8;
        L_0x0023:
            r4 = r1.f61517f;	 Catch:{ all -> 0x00e9 }
            r4 = r4.get();	 Catch:{ all -> 0x00e9 }
            r4 = (rx.internal.operators.OperatorPublish.InnerProducer[]) r4;	 Catch:{ all -> 0x00e9 }
            r6 = r4.length;	 Catch:{ all -> 0x00e9 }
            r7 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r9 = r4.length;	 Catch:{ all -> 0x00e9 }
            r10 = r7;
            r7 = 0;
            r8 = 0;
        L_0x0035:
            r12 = 0;
            if (r7 >= r9) goto L_0x0053;
        L_0x0039:
            r14 = r4[r7];	 Catch:{ all -> 0x00e9 }
            r14 = r14.get();	 Catch:{ all -> 0x00e9 }
            r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
            if (r16 < 0) goto L_0x0048;
        L_0x0043:
            r10 = java.lang.Math.min(r10, r14);	 Catch:{ all -> 0x00e9 }
            goto L_0x0050;
        L_0x0048:
            r12 = -9223372036854775808;
            r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
            if (r16 != 0) goto L_0x0050;
        L_0x004e:
            r8 = r8 + 1;
        L_0x0050:
            r7 = r7 + 1;
            goto L_0x0035;
        L_0x0053:
            r14 = 1;
            if (r6 != r8) goto L_0x006f;
        L_0x0057:
            r4 = r1.f61516c;	 Catch:{ all -> 0x00e9 }
            r5 = r1.f61514a;	 Catch:{ all -> 0x00e9 }
            r5 = r5.poll();	 Catch:{ all -> 0x00e9 }
            if (r5 != 0) goto L_0x0063;
        L_0x0061:
            r5 = 1;
            goto L_0x0064;
        L_0x0063:
            r5 = 0;
        L_0x0064:
            r4 = r1.m70927a(r4, r5);	 Catch:{ all -> 0x00e9 }
            if (r4 == 0) goto L_0x006b;
        L_0x006a:
            return;
        L_0x006b:
            r1.request(r14);	 Catch:{ all -> 0x00e9 }
            goto L_0x0012;
        L_0x006f:
            r6 = r5;
            r5 = 0;
        L_0x0071:
            r7 = (long) r5;	 Catch:{ all -> 0x00e9 }
            r9 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1));
            if (r9 >= 0) goto L_0x00bb;
        L_0x0076:
            r6 = r1.f61516c;	 Catch:{ all -> 0x00e9 }
            r9 = r1.f61514a;	 Catch:{ all -> 0x00e9 }
            r9 = r9.poll();	 Catch:{ all -> 0x00e9 }
            if (r9 != 0) goto L_0x0081;
        L_0x0080:
            goto L_0x0082;
        L_0x0081:
            r3 = 0;
        L_0x0082:
            r6 = r1.m70927a(r6, r3);	 Catch:{ all -> 0x00e9 }
            if (r6 == 0) goto L_0x0089;
        L_0x0088:
            return;
        L_0x0089:
            if (r3 == 0) goto L_0x008c;
        L_0x008b:
            goto L_0x00bc;
        L_0x008c:
            r6 = rx.internal.operators.NotificationLite.m69891e(r9);	 Catch:{ all -> 0x00e9 }
            r7 = r4.length;	 Catch:{ all -> 0x00e9 }
            r8 = 0;
        L_0x0092:
            if (r8 >= r7) goto L_0x00b5;
        L_0x0094:
            r9 = r4[r8];	 Catch:{ all -> 0x00e9 }
            r17 = r9.get();	 Catch:{ all -> 0x00e9 }
            r16 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1));
            if (r16 <= 0) goto L_0x00b1;
        L_0x009e:
            r2 = r9.f61170b;	 Catch:{ Throwable -> 0x00a7 }
            r2.onNext(r6);	 Catch:{ Throwable -> 0x00a7 }
            r9.m70577a(r14);	 Catch:{ all -> 0x00e9 }
            goto L_0x00b1;
        L_0x00a7:
            r0 = move-exception;
            r2 = r0;
            r9.unsubscribe();	 Catch:{ all -> 0x00e9 }
            r9 = r9.f61170b;	 Catch:{ all -> 0x00e9 }
            rx.exceptions.C19410a.m69870a(r2, r9, r6);	 Catch:{ all -> 0x00e9 }
        L_0x00b1:
            r8 = r8 + 1;
            r2 = 0;
            goto L_0x0092;
        L_0x00b5:
            r5 = r5 + 1;
            r6 = r3;
            r2 = 0;
            r3 = 1;
            goto L_0x0071;
        L_0x00bb:
            r3 = r6;
        L_0x00bc:
            if (r5 <= 0) goto L_0x00c1;
        L_0x00be:
            r1.request(r7);	 Catch:{ all -> 0x00e9 }
        L_0x00c1:
            r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
            if (r2 == 0) goto L_0x00c8;
        L_0x00c5:
            if (r3 != 0) goto L_0x00c8;
        L_0x00c7:
            goto L_0x00da;
        L_0x00c8:
            monitor-enter(r20);	 Catch:{ all -> 0x00e9 }
            r2 = r1.f61520i;	 Catch:{ all -> 0x00de }
            if (r2 != 0) goto L_0x00d6;
        L_0x00cd:
            r2 = 0;
            r1.f61519h = r2;	 Catch:{ all -> 0x00de }
            monitor-exit(r20);	 Catch:{ all -> 0x00d2 }
            return;
        L_0x00d2:
            r0 = move-exception;
            r2 = r0;
            r3 = 1;
            goto L_0x00e1;
        L_0x00d6:
            r2 = 0;
            r1.f61520i = r2;	 Catch:{ all -> 0x00de }
            monitor-exit(r20);	 Catch:{ all -> 0x00de }
        L_0x00da:
            r2 = 0;
            r3 = 1;
            goto L_0x0012;
        L_0x00de:
            r0 = move-exception;
            r2 = r0;
            r3 = 0;
        L_0x00e1:
            monitor-exit(r20);	 Catch:{ all -> 0x00e6 }
            throw r2;	 Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception;
            r2 = r0;
            goto L_0x00ec;
        L_0x00e6:
            r0 = move-exception;
            r2 = r0;
            goto L_0x00e1;
        L_0x00e9:
            r0 = move-exception;
            r2 = r0;
            r3 = 0;
        L_0x00ec:
            if (r3 != 0) goto L_0x00f8;
        L_0x00ee:
            monitor-enter(r20);
            r3 = 0;
            r1.f61519h = r3;	 Catch:{ all -> 0x00f4 }
            monitor-exit(r20);	 Catch:{ all -> 0x00f4 }
            goto L_0x00f8;
        L_0x00f4:
            r0 = move-exception;
            r2 = r0;
            monitor-exit(r20);	 Catch:{ all -> 0x00f4 }
            throw r2;
        L_0x00f8:
            throw r2;
        L_0x00f9:
            r0 = move-exception;
            r2 = r0;
            monitor-exit(r20);	 Catch:{ all -> 0x00f9 }
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorPublish.a.b():void");
        }
    }

    /* renamed from: k */
    public static <T> C19565b<T> m70931k(Observable<? extends T> observable) {
        final AtomicReference atomicReference = new AtomicReference();
        return new OperatorPublish(new OnSubscribe<T>() {
            public /* synthetic */ void call(Object obj) {
                m71578a((C19571c) obj);
            }

            /* renamed from: a */
            public void m71578a(C19571c<? super T> c19571c) {
                while (true) {
                    C19677a c19677a = (C19677a) atomicReference.get();
                    if (c19677a == null || c19677a.isUnsubscribed()) {
                        C19677a c19677a2 = new C19677a(atomicReference);
                        c19677a2.m70926a();
                        if (atomicReference.compareAndSet(c19677a, c19677a2)) {
                            c19677a = c19677a2;
                        }
                    }
                    Object innerProducer = new InnerProducer(c19677a, c19571c);
                    if (c19677a.m70928a(innerProducer)) {
                        c19571c.add(innerProducer);
                        c19571c.setProducer(innerProducer);
                        return;
                    }
                }
            }
        }, observable, atomicReference);
    }

    private OperatorPublish(OnSubscribe<T> onSubscribe, Observable<? extends T> observable, AtomicReference<C19677a<T>> atomicReference) {
        super(onSubscribe);
        this.f61521b = observable;
        this.f61522c = atomicReference;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    public void mo14748e(rx.functions.Action1<? super rx.Subscription> r5) {
        /*
        r4 = this;
    L_0x0000:
        r0 = r4.f61522c;
        r0 = r0.get();
        r0 = (rx.internal.operators.OperatorPublish.C19677a) r0;
        if (r0 == 0) goto L_0x0010;
    L_0x000a:
        r1 = r0.isUnsubscribed();
        if (r1 == 0) goto L_0x0024;
    L_0x0010:
        r1 = new rx.internal.operators.OperatorPublish$a;
        r2 = r4.f61522c;
        r1.<init>(r2);
        r1.m70926a();
        r2 = r4.f61522c;
        r0 = r2.compareAndSet(r0, r1);
        if (r0 != 0) goto L_0x0023;
    L_0x0022:
        goto L_0x0000;
    L_0x0023:
        r0 = r1;
    L_0x0024:
        r1 = r0.f61518g;
        r1 = r1.get();
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x0037;
    L_0x002e:
        r1 = r0.f61518g;
        r1 = r1.compareAndSet(r3, r2);
        if (r1 == 0) goto L_0x0037;
    L_0x0036:
        goto L_0x0038;
    L_0x0037:
        r2 = 0;
    L_0x0038:
        r5.call(r0);
        if (r2 == 0) goto L_0x0042;
    L_0x003d:
        r5 = r4.f61521b;
        r5.m69661a(r0);
    L_0x0042:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorPublish.e(rx.functions.Action1):void");
    }
}
