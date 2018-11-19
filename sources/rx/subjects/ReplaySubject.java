package rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.Observer;
import rx.Producer;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.internal.operators.C19419a;
import rx.p498c.C19401c;

public final class ReplaySubject<T> extends C19623c<T, T> {
    /* renamed from: c */
    private static final Object[] f61867c = new Object[0];
    /* renamed from: b */
    final ReplayState<T> f61868b;

    /* renamed from: rx.subjects.ReplaySubject$a */
    interface C19454a<T> {
        /* renamed from: a */
        void mo14704a();

        /* renamed from: a */
        void mo14705a(T t);

        /* renamed from: a */
        void mo14706a(Throwable th);

        /* renamed from: a */
        void mo14707a(ReplayProducer<T> replayProducer);

        /* renamed from: a */
        T[] mo14708a(T[] tArr);

        /* renamed from: b */
        boolean mo14709b();
    }

    static final class ReplayProducer<T> extends AtomicInteger implements Producer, Subscription {
        private static final long serialVersionUID = -5006209596735204567L;
        /* renamed from: a */
        final C19571c<? super T> f61317a;
        /* renamed from: b */
        final AtomicLong f61318b = new AtomicLong();
        /* renamed from: c */
        final ReplayState<T> f61319c;
        /* renamed from: d */
        int f61320d;
        /* renamed from: e */
        int f61321e;
        /* renamed from: f */
        Object f61322f;

        public ReplayProducer(C19571c<? super T> c19571c, ReplayState<T> replayState) {
            this.f61317a = c19571c;
            this.f61319c = replayState;
        }

        public void unsubscribe() {
            this.f61319c.m71653b(this);
        }

        public boolean isUnsubscribed() {
            return this.f61317a.isUnsubscribed();
        }

        public void request(long j) {
            if (j > 0) {
                C19419a.m69900a(this.f61318b, j);
                this.f61319c.f62345a.mo14707a(this);
            } else if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("n >= required but it was ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: rx.subjects.ReplaySubject$b */
    static final class C19621b<T> implements C19454a<T> {
        /* renamed from: a */
        final int f61323a;
        /* renamed from: b */
        volatile int f61324b;
        /* renamed from: c */
        final Object[] f61325c;
        /* renamed from: d */
        Object[] f61326d;
        /* renamed from: e */
        int f61327e;
        /* renamed from: f */
        volatile boolean f61328f;
        /* renamed from: g */
        Throwable f61329g;

        public C19621b(int i) {
            this.f61323a = i;
            i = new Object[(i + 1)];
            this.f61325c = i;
            this.f61326d = i;
        }

        /* renamed from: a */
        public void mo14705a(T t) {
            if (!this.f61328f) {
                int i = this.f61327e;
                Object[] objArr = this.f61326d;
                if (i == objArr.length - 1) {
                    Object[] objArr2 = new Object[objArr.length];
                    objArr2[0] = t;
                    this.f61327e = 1;
                    objArr[i] = objArr2;
                    this.f61326d = objArr2;
                } else {
                    objArr[i] = t;
                    this.f61327e = i + 1;
                }
                this.f61324b += 1;
            }
        }

        /* renamed from: a */
        public void mo14706a(Throwable th) {
            if (this.f61328f) {
                C19401c.m69811a(th);
                return;
            }
            this.f61329g = th;
            this.f61328f = true;
        }

        /* renamed from: a */
        public void mo14704a() {
            this.f61328f = true;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public void mo14707a(rx.subjects.ReplaySubject.ReplayProducer<T> r19) {
            /*
            r18 = this;
            r0 = r18;
            r1 = r19;
            r2 = r19.getAndIncrement();
            if (r2 == 0) goto L_0x000b;
        L_0x000a:
            return;
        L_0x000b:
            r2 = r1.f61317a;
            r3 = r0.f61323a;
            r4 = 1;
            r5 = 1;
        L_0x0011:
            r6 = r1.f61318b;
            r6 = r6.get();
            r8 = r1.f61322f;
            r8 = (java.lang.Object[]) r8;
            if (r8 != 0) goto L_0x001f;
        L_0x001d:
            r8 = r0.f61325c;
        L_0x001f:
            r9 = r1.f61321e;
            r10 = r1.f61320d;
            r14 = r8;
            r13 = r9;
            r8 = 0;
        L_0x0027:
            r15 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
            r16 = 0;
            r11 = 0;
            if (r15 == 0) goto L_0x006b;
        L_0x002e:
            r12 = r2.isUnsubscribed();
            if (r12 == 0) goto L_0x0037;
        L_0x0034:
            r1.f61322f = r11;
            return;
        L_0x0037:
            r12 = r0.f61328f;
            r15 = r0.f61324b;
            if (r10 != r15) goto L_0x003f;
        L_0x003d:
            r15 = 1;
            goto L_0x0040;
        L_0x003f:
            r15 = 0;
        L_0x0040:
            if (r12 == 0) goto L_0x0052;
        L_0x0042:
            if (r15 == 0) goto L_0x0052;
        L_0x0044:
            r1.f61322f = r11;
            r1 = r0.f61329g;
            if (r1 == 0) goto L_0x004e;
        L_0x004a:
            r2.onError(r1);
            goto L_0x0051;
        L_0x004e:
            r2.onCompleted();
        L_0x0051:
            return;
        L_0x0052:
            if (r15 == 0) goto L_0x0055;
        L_0x0054:
            goto L_0x006b;
        L_0x0055:
            if (r13 != r3) goto L_0x005d;
        L_0x0057:
            r11 = r14[r13];
            r11 = (java.lang.Object[]) r11;
            r14 = r11;
            r13 = 0;
        L_0x005d:
            r11 = r14[r13];
            r2.onNext(r11);
            r11 = 1;
            r15 = r8 + r11;
            r13 = r13 + r4;
            r10 = r10 + 1;
            r8 = r15;
            goto L_0x0027;
        L_0x006b:
            r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
            if (r12 != 0) goto L_0x0092;
        L_0x006f:
            r12 = r2.isUnsubscribed();
            if (r12 == 0) goto L_0x0078;
        L_0x0075:
            r1.f61322f = r11;
            return;
        L_0x0078:
            r12 = r0.f61328f;
            r15 = r0.f61324b;
            if (r10 != r15) goto L_0x0080;
        L_0x007e:
            r16 = 1;
        L_0x0080:
            if (r12 == 0) goto L_0x0092;
        L_0x0082:
            if (r16 == 0) goto L_0x0092;
        L_0x0084:
            r1.f61322f = r11;
            r1 = r0.f61329g;
            if (r1 == 0) goto L_0x008e;
        L_0x008a:
            r2.onError(r1);
            goto L_0x0091;
        L_0x008e:
            r2.onCompleted();
        L_0x0091:
            return;
        L_0x0092:
            r11 = 0;
            r15 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1));
            if (r15 == 0) goto L_0x00a6;
        L_0x0098:
            r11 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r15 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1));
            if (r15 == 0) goto L_0x00a6;
        L_0x00a1:
            r6 = r1.f61318b;
            rx.internal.operators.C19419a.m69902b(r6, r8);
        L_0x00a6:
            r1.f61320d = r10;
            r1.f61321e = r13;
            r1.f61322f = r14;
            r5 = -r5;
            r5 = r1.addAndGet(r5);
            if (r5 != 0) goto L_0x0011;
        L_0x00b3:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.subjects.ReplaySubject.b.a(rx.subjects.ReplaySubject$ReplayProducer):void");
        }

        /* renamed from: b */
        public boolean mo14709b() {
            return this.f61324b == 0;
        }

        /* renamed from: a */
        public T[] mo14708a(T[] tArr) {
            int i = this.f61324b;
            if (tArr.length < i) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
            }
            Object obj = this.f61325c;
            int i2 = this.f61323a;
            Object obj2 = obj;
            int i3 = 0;
            while (true) {
                int i4 = i3 + i2;
                if (i4 >= i) {
                    break;
                }
                System.arraycopy(obj2, 0, tArr, i3, i2);
                Object[] objArr = (Object[]) obj2[i2];
                i3 = i4;
            }
            System.arraycopy(obj2, 0, tArr, i3, i - i3);
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }
    }

    static final class ReplayState<T> extends AtomicReference<ReplayProducer<T>[]> implements OnSubscribe<T>, Observer<T> {
        /* renamed from: b */
        static final ReplayProducer[] f62343b = new ReplayProducer[0];
        /* renamed from: c */
        static final ReplayProducer[] f62344c = new ReplayProducer[0];
        private static final long serialVersionUID = 5952362471246910544L;
        /* renamed from: a */
        final C19454a<T> f62345a;

        public /* synthetic */ void call(Object obj) {
            m71651a((C19571c) obj);
        }

        public ReplayState(C19454a<T> c19454a) {
            this.f62345a = c19454a;
            lazySet(f62343b);
        }

        /* renamed from: a */
        public void m71651a(C19571c<? super T> c19571c) {
            ReplayProducer replayProducer = new ReplayProducer(c19571c, this);
            c19571c.add(replayProducer);
            c19571c.setProducer(replayProducer);
            if (m71652a(replayProducer) == null || replayProducer.isUnsubscribed() == null) {
                this.f62345a.mo14707a(replayProducer);
            } else {
                m71653b(replayProducer);
            }
        }

        /* renamed from: a */
        boolean m71652a(ReplayProducer<T> replayProducer) {
            ReplayProducer[] replayProducerArr;
            Object obj;
            do {
                replayProducerArr = (ReplayProducer[]) get();
                if (replayProducerArr == f62344c) {
                    return false;
                }
                int length = replayProducerArr.length;
                obj = new ReplayProducer[(length + 1)];
                System.arraycopy(replayProducerArr, 0, obj, 0, length);
                obj[length] = replayProducer;
            } while (!compareAndSet(replayProducerArr, obj));
            return true;
        }

        /* renamed from: b */
        void m71653b(ReplayProducer<T> replayProducer) {
            ReplayProducer[] replayProducerArr;
            Object obj;
            do {
                replayProducerArr = (ReplayProducer[]) get();
                if (replayProducerArr != f62344c) {
                    if (replayProducerArr != f62343b) {
                        int length = replayProducerArr.length;
                        int i = -1;
                        for (int i2 = 0; i2 < length; i2++) {
                            if (replayProducerArr[i2] == replayProducer) {
                                i = i2;
                                break;
                            }
                        }
                        if (i >= 0) {
                            if (length == 1) {
                                obj = f62343b;
                            } else {
                                Object obj2 = new ReplayProducer[(length - 1)];
                                System.arraycopy(replayProducerArr, 0, obj2, 0, i);
                                System.arraycopy(replayProducerArr, i + 1, obj2, i, (length - i) - 1);
                                obj = obj2;
                            }
                        } else {
                            return;
                        }
                    }
                }
                return;
            } while (!compareAndSet(replayProducerArr, obj));
        }

        public void onNext(T t) {
            C19454a c19454a = this.f62345a;
            c19454a.mo14705a((Object) t);
            for (ReplayProducer a : (ReplayProducer[]) get()) {
                c19454a.mo14707a(a);
            }
        }

        public void onError(Throwable th) {
            C19454a c19454a = this.f62345a;
            c19454a.mo14706a(th);
            List list = null;
            for (ReplayProducer a : (ReplayProducer[]) getAndSet(f62344c)) {
                try {
                    c19454a.mo14707a(a);
                } catch (Throwable th2) {
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(th2);
                }
            }
            C19410a.m69873a(list);
        }

        public void onCompleted() {
            C19454a c19454a = this.f62345a;
            c19454a.mo14704a();
            for (ReplayProducer a : (ReplayProducer[]) getAndSet(f62344c)) {
                c19454a.mo14707a(a);
            }
        }
    }

    /* renamed from: w */
    public static <T> ReplaySubject<T> m71073w() {
        return m71072d(16);
    }

    /* renamed from: d */
    public static <T> ReplaySubject<T> m71072d(int i) {
        if (i > 0) {
            return new ReplaySubject(new ReplayState(new C19621b(i)));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("capacity > 0 required but it was ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    ReplaySubject(ReplayState<T> replayState) {
        super(replayState);
        this.f61868b = replayState;
    }

    public void onNext(T t) {
        this.f61868b.onNext(t);
    }

    public void onError(Throwable th) {
        this.f61868b.onError(th);
    }

    public void onCompleted() {
        this.f61868b.onCompleted();
    }

    /* renamed from: x */
    public boolean m71075x() {
        return this.f61868b.f62345a.mo14709b() ^ 1;
    }

    /* renamed from: y */
    public boolean m71076y() {
        return m71075x();
    }

    /* renamed from: b */
    public T[] m71074b(T[] tArr) {
        return this.f61868b.f62345a.mo14708a((Object[]) tArr);
    }

    /* renamed from: z */
    public Object[] m71077z() {
        Object[] b = m71074b(f61867c);
        return b == f61867c ? new Object[0] : b;
    }
}
