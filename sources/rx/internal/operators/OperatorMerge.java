package rx.internal.operators;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import rx.C19571c;
import rx.Observable;
import rx.Observable.Operator;
import rx.Producer;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.exceptions.MissingBackpressureException;
import rx.exceptions.OnErrorThrowable;
import rx.internal.util.C19613g;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.atomic.C19442g;
import rx.internal.util.atomic.C19611d;
import rx.internal.util.atomic.SpscExactAtomicArrayQueue;
import rx.internal.util.unsafe.C19447i;
import rx.internal.util.unsafe.C19924r;
import rx.internal.util.unsafe.af;
import rx.p500e.C19573b;

public final class OperatorMerge<T> implements Operator<T, Observable<? extends T>> {
    /* renamed from: a */
    final boolean f61975a;
    /* renamed from: b */
    final int f61976b;

    /* renamed from: rx.internal.operators.OperatorMerge$a */
    static final class C19415a {
        /* renamed from: a */
        static final OperatorMerge<Object> f60597a = new OperatorMerge(true, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    /* renamed from: rx.internal.operators.OperatorMerge$b */
    static final class C19416b {
        /* renamed from: a */
        static final OperatorMerge<Object> f60598a = new OperatorMerge(false, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    static final class MergeProducer<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -1214379189873595503L;
        /* renamed from: a */
        final C19675d<T> f61160a;

        public MergeProducer(C19675d<T> c19675d) {
            this.f61160a = c19675d;
        }

        public void request(long j) {
            if (j > 0) {
                if (get() != Format.OFFSET_SAMPLE_RELATIVE) {
                    C19419a.m69900a((AtomicLong) this, j);
                    this.f61160a.m70922d();
                }
            } else if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
        }

        /* renamed from: a */
        public long m70574a(int i) {
            return addAndGet((long) (-i));
        }
    }

    /* renamed from: rx.internal.operators.OperatorMerge$c */
    static final class C19674c<T> extends C19571c<T> {
        /* renamed from: f */
        static final int f61487f = (C19613g.f61292b / 4);
        /* renamed from: a */
        final C19675d<T> f61488a;
        /* renamed from: b */
        final long f61489b;
        /* renamed from: c */
        volatile boolean f61490c;
        /* renamed from: d */
        volatile C19613g f61491d;
        /* renamed from: e */
        int f61492e;

        public C19674c(C19675d<T> c19675d, long j) {
            this.f61488a = c19675d;
            this.f61489b = j;
        }

        public void onStart() {
            this.f61492e = C19613g.f61292b;
            request((long) C19613g.f61292b);
        }

        public void onNext(T t) {
            this.f61488a.m70915a(this, (Object) t);
        }

        public void onError(Throwable th) {
            this.f61490c = true;
            this.f61488a.m70909a().offer(th);
            this.f61488a.m70922d();
        }

        public void onCompleted() {
            this.f61490c = true;
            this.f61488a.m70922d();
        }

        /* renamed from: a */
        public void m70907a(long j) {
            int i = this.f61492e - ((int) j);
            if (i > f61487f) {
                this.f61492e = i;
                return;
            }
            this.f61492e = C19613g.f61292b;
            j = C19613g.f61292b - i;
            if (j > null) {
                request((long) j);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorMerge$d */
    static final class C19675d<T> extends C19571c<Observable<? extends T>> {
        /* renamed from: p */
        static final C19674c<?>[] f61493p = new C19674c[0];
        /* renamed from: a */
        final C19571c<? super T> f61494a;
        /* renamed from: b */
        final boolean f61495b;
        /* renamed from: c */
        final int f61496c;
        /* renamed from: d */
        MergeProducer<T> f61497d;
        /* renamed from: e */
        volatile Queue<Object> f61498e;
        /* renamed from: f */
        volatile C19573b f61499f;
        /* renamed from: g */
        volatile ConcurrentLinkedQueue<Throwable> f61500g;
        /* renamed from: h */
        volatile boolean f61501h;
        /* renamed from: i */
        boolean f61502i;
        /* renamed from: j */
        boolean f61503j;
        /* renamed from: k */
        final Object f61504k = new Object();
        /* renamed from: l */
        volatile C19674c<?>[] f61505l = f61493p;
        /* renamed from: m */
        long f61506m;
        /* renamed from: n */
        long f61507n;
        /* renamed from: o */
        int f61508o;
        /* renamed from: q */
        final int f61509q;
        /* renamed from: r */
        int f61510r;

        public /* synthetic */ void onNext(Object obj) {
            m70913a((Observable) obj);
        }

        public C19675d(C19571c<? super T> c19571c, boolean z, int i) {
            this.f61494a = c19571c;
            this.f61495b = z;
            this.f61496c = i;
            if (i == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                this.f61509q = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                request(-1);
                return;
            }
            this.f61509q = Math.max(true, i >> 1);
            request((long) i);
        }

        /* renamed from: a */
        Queue<Throwable> m70909a() {
            Queue<Throwable> queue = this.f61500g;
            if (queue == null) {
                synchronized (this) {
                    queue = this.f61500g;
                    if (queue == null) {
                        queue = new ConcurrentLinkedQueue();
                        this.f61500g = queue;
                    }
                }
            }
            return queue;
        }

        /* renamed from: b */
        C19573b m70917b() {
            C19573b c19573b = this.f61499f;
            if (c19573b != null) {
                return c19573b;
            }
            Subscription subscription;
            Object obj = null;
            synchronized (this) {
                subscription = this.f61499f;
                if (subscription == null) {
                    c19573b = new C19573b();
                    this.f61499f = c19573b;
                    subscription = c19573b;
                    obj = 1;
                }
            }
            if (obj != null) {
                add(subscription);
            }
            return subscription;
        }

        /* renamed from: a */
        public void m70913a(Observable<? extends T> observable) {
            if (observable != null) {
                if (observable == Observable.m69640c()) {
                    m70921c();
                } else if (observable instanceof ScalarSynchronousObservable) {
                    m70911a(((ScalarSynchronousObservable) observable).m70628w());
                } else {
                    long j = this.f61506m;
                    this.f61506m = j + 1;
                    C19571c c19674c = new C19674c(this, j);
                    m70914a((C19674c) c19674c);
                    observable.m69661a(c19674c);
                    m70922d();
                }
            }
        }

        /* renamed from: c */
        void m70921c() {
            int i = this.f61510r + 1;
            if (i == this.f61509q) {
                this.f61510r = 0;
                m70910a((long) i);
                return;
            }
            this.f61510r = i;
        }

        /* renamed from: g */
        private void m70908g() {
            Collection arrayList = new ArrayList(this.f61500g);
            if (arrayList.size() == 1) {
                this.f61494a.onError((Throwable) arrayList.get(0));
            } else {
                this.f61494a.onError(new CompositeException(arrayList));
            }
        }

        public void onError(Throwable th) {
            m70909a().offer(th);
            this.f61501h = true;
            m70922d();
        }

        public void onCompleted() {
            this.f61501h = true;
            m70922d();
        }

        /* renamed from: a */
        void m70914a(C19674c<T> c19674c) {
            m70917b().m70548a((Subscription) c19674c);
            synchronized (this.f61504k) {
                Object obj = this.f61505l;
                int length = obj.length;
                Object obj2 = new C19674c[(length + 1)];
                System.arraycopy(obj, 0, obj2, 0, length);
                obj2[length] = c19674c;
                this.f61505l = obj2;
            }
        }

        /* renamed from: b */
        void m70919b(C19674c<T> c19674c) {
            C19613g c19613g = c19674c.f61491d;
            if (c19613g != null) {
                c19613g.m70638c();
            }
            this.f61499f.m70550b(c19674c);
            synchronized (this.f61504k) {
                Object obj = this.f61505l;
                int length = obj.length;
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (c19674c.equals(obj[i2])) {
                        i = i2;
                        break;
                    }
                }
                if (i < 0) {
                } else if (length == 1) {
                    this.f61505l = f61493p;
                } else {
                    Object obj2 = new C19674c[(length - 1)];
                    System.arraycopy(obj, 0, obj2, 0, i);
                    System.arraycopy(obj, i + 1, obj2, i, (length - i) - 1);
                    this.f61505l = obj2;
                }
            }
        }

        /* renamed from: a */
        void m70915a(C19674c<T> c19674c, T t) {
            long j = this.f61497d.get();
            Object obj = null;
            if (j != 0) {
                synchronized (this) {
                    j = this.f61497d.get();
                    if (!(this.f61502i || j == 0)) {
                        this.f61502i = true;
                        obj = 1;
                    }
                }
            }
            if (obj != null) {
                C19613g c19613g = c19674c.f61491d;
                if (c19613g != null) {
                    if (!c19613g.m70640e()) {
                        m70920b(c19674c, t);
                        m70923e();
                        return;
                    }
                }
                m70916a(c19674c, t, j);
                return;
            }
            m70920b(c19674c, t);
            m70922d();
        }

        /* renamed from: b */
        protected void m70920b(C19674c<T> c19674c, T t) {
            C19613g c19613g = c19674c.f61491d;
            if (c19613g == null) {
                c19613g = C19613g.m70633a();
                c19674c.add(c19613g);
                c19674c.f61491d = c19613g;
            }
            try {
                c19613g.m70635a(NotificationLite.m69885a((Object) t));
            } catch (T t2) {
                c19674c.unsubscribe();
                c19674c.onError(t2);
            } catch (T t22) {
                if (!c19674c.isUnsubscribed()) {
                    c19674c.unsubscribe();
                    c19674c.onError(t22);
                }
            }
        }

        /* renamed from: a */
        protected void m70916a(C19674c<T> c19674c, T t, long j) {
            int i = 1;
            try {
                this.f61494a.onNext(t);
            } catch (Throwable th) {
                c19674c = th;
            }
            if (j != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f61497d.m70574a(1);
            }
            c19674c.m70907a(1);
            synchronized (this) {
                if (this.f61503j == null) {
                    this.f61502i = false;
                    return;
                }
                this.f61503j = false;
                m70923e();
                return;
            }
            if (i == 0) {
                synchronized (this) {
                    this.f61502i = false;
                }
            }
            throw c19674c;
        }

        /* renamed from: a */
        public void m70910a(long j) {
            request(j);
        }

        /* renamed from: a */
        void m70911a(T t) {
            long j = this.f61497d.get();
            Object obj = null;
            if (j != 0) {
                synchronized (this) {
                    j = this.f61497d.get();
                    if (!(this.f61502i || j == 0)) {
                        this.f61502i = true;
                        obj = 1;
                    }
                }
            }
            if (obj != null) {
                Queue queue = this.f61498e;
                if (queue != null) {
                    if (!queue.isEmpty()) {
                        m70918b((Object) t);
                        m70923e();
                        return;
                    }
                }
                m70912a((Object) t, j);
                return;
            }
            m70918b((Object) t);
            m70922d();
        }

        /* renamed from: b */
        protected void m70918b(T t) {
            Queue queue = this.f61498e;
            if (queue == null) {
                int i = this.f61496c;
                if (i == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                    queue = new C19442g(C19613g.f61292b);
                } else {
                    C19924r spscExactAtomicArrayQueue;
                    if (!C19447i.m69986b(i)) {
                        spscExactAtomicArrayQueue = new SpscExactAtomicArrayQueue(i);
                    } else if (af.m69984a()) {
                        spscExactAtomicArrayQueue = new C19924r(i);
                    } else {
                        spscExactAtomicArrayQueue = new C19611d(i);
                    }
                    queue = spscExactAtomicArrayQueue;
                }
                this.f61498e = queue;
            }
            if (!queue.offer(NotificationLite.m69885a((Object) t))) {
                unsubscribe();
                onError(OnErrorThrowable.m69866a(new MissingBackpressureException(), t));
            }
        }

        /* renamed from: a */
        protected void m70912a(T t, long j) {
            int i = 1;
            try {
                this.f61494a.onNext(t);
            } catch (Throwable th) {
                t = th;
            }
            if (j != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f61497d.m70574a(1);
            }
            t = this.f61510r + 1;
            if (t == this.f61509q) {
                this.f61510r = 0;
                m70910a((long) t);
            } else {
                this.f61510r = t;
            }
            synchronized (this) {
                if (this.f61503j == null) {
                    this.f61502i = false;
                    return;
                }
                this.f61503j = false;
                m70923e();
                return;
            }
            if (i == 0) {
                synchronized (this) {
                    this.f61502i = false;
                }
            }
            throw t;
        }

        /* renamed from: d */
        void m70922d() {
            synchronized (this) {
                if (this.f61502i) {
                    this.f61503j = true;
                    return;
                }
                this.f61502i = true;
                m70923e();
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: e */
        void m70923e() {
            /*
            r25 = this;
            r1 = r25;
            r4 = r1.f61494a;	 Catch:{ all -> 0x01d6 }
        L_0x0004:
            r5 = r25.m70924f();	 Catch:{ all -> 0x01d6 }
            if (r5 == 0) goto L_0x000b;
        L_0x000a:
            return;
        L_0x000b:
            r5 = r1.f61498e;	 Catch:{ all -> 0x01d6 }
            r6 = r1.f61497d;	 Catch:{ all -> 0x01d6 }
            r6 = r6.get();	 Catch:{ all -> 0x01d6 }
            r8 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
            if (r10 != 0) goto L_0x001e;
        L_0x001c:
            r10 = 1;
            goto L_0x001f;
        L_0x001e:
            r10 = 0;
        L_0x001f:
            r11 = 1;
            r14 = 0;
            if (r5 == 0) goto L_0x0092;
        L_0x0025:
            r16 = 0;
        L_0x0027:
            r18 = r16;
            r2 = 0;
            r16 = 0;
        L_0x002c:
            r19 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1));
            if (r19 <= 0) goto L_0x0073;
        L_0x0030:
            r8 = r5.poll();	 Catch:{ all -> 0x01d6 }
            r9 = r25.m70924f();	 Catch:{ all -> 0x01d6 }
            if (r9 == 0) goto L_0x003b;
        L_0x003a:
            return;
        L_0x003b:
            if (r8 != 0) goto L_0x0040;
        L_0x003d:
            r16 = r8;
            goto L_0x0073;
        L_0x0040:
            r9 = rx.internal.operators.NotificationLite.m69891e(r8);	 Catch:{ all -> 0x01d6 }
            r4.onNext(r9);	 Catch:{ Throwable -> 0x0048 }
            goto L_0x0063;
        L_0x0048:
            r0 = move-exception;
            r9 = r1.f61495b;	 Catch:{ all -> 0x01d6 }
            if (r9 != 0) goto L_0x005c;
        L_0x004d:
            rx.exceptions.C19410a.m69874b(r0);	 Catch:{ all -> 0x01d6 }
            r25.unsubscribe();	 Catch:{ all -> 0x0057 }
            r4.onError(r0);	 Catch:{ all -> 0x0057 }
            return;
        L_0x0057:
            r0 = move-exception;
            r2 = r0;
            r3 = 1;
            goto L_0x01d9;
        L_0x005c:
            r9 = r25.m70909a();	 Catch:{ all -> 0x01d6 }
            r9.offer(r0);	 Catch:{ all -> 0x01d6 }
        L_0x0063:
            r18 = r18 + 1;
            r2 = r2 + 1;
            r20 = r6 - r11;
            r16 = r8;
            r6 = r20;
            r8 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            goto L_0x002c;
        L_0x0073:
            if (r2 <= 0) goto L_0x0083;
        L_0x0075:
            if (r10 == 0) goto L_0x007d;
        L_0x0077:
            r6 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            goto L_0x0083;
        L_0x007d:
            r6 = r1.f61497d;	 Catch:{ all -> 0x01d6 }
            r6 = r6.m70574a(r2);	 Catch:{ all -> 0x01d6 }
        L_0x0083:
            r2 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1));
            if (r2 == 0) goto L_0x0094;
        L_0x0087:
            if (r16 != 0) goto L_0x008a;
        L_0x0089:
            goto L_0x0094;
        L_0x008a:
            r16 = r18;
            r8 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            goto L_0x0027;
        L_0x0092:
            r18 = 0;
        L_0x0094:
            r2 = r1.f61501h;	 Catch:{ all -> 0x01d6 }
            r5 = r1.f61498e;	 Catch:{ all -> 0x01d6 }
            r8 = r1.f61505l;	 Catch:{ all -> 0x01d6 }
            r9 = r8.length;	 Catch:{ all -> 0x01d6 }
            if (r2 == 0) goto L_0x00ba;
        L_0x009d:
            if (r5 == 0) goto L_0x00a5;
        L_0x009f:
            r2 = r5.isEmpty();	 Catch:{ all -> 0x01d6 }
            if (r2 == 0) goto L_0x00ba;
        L_0x00a5:
            if (r9 != 0) goto L_0x00ba;
        L_0x00a7:
            r2 = r1.f61500g;	 Catch:{ all -> 0x01d6 }
            if (r2 == 0) goto L_0x00b6;
        L_0x00ab:
            r2 = r2.isEmpty();	 Catch:{ all -> 0x01d6 }
            if (r2 == 0) goto L_0x00b2;
        L_0x00b1:
            goto L_0x00b6;
        L_0x00b2:
            r25.m70908g();	 Catch:{ all -> 0x01d6 }
            goto L_0x00b9;
        L_0x00b6:
            r4.onCompleted();	 Catch:{ all -> 0x01d6 }
        L_0x00b9:
            return;
        L_0x00ba:
            if (r9 <= 0) goto L_0x01a5;
        L_0x00bc:
            r11 = r1.f61507n;	 Catch:{ all -> 0x01d6 }
            r2 = r1.f61508o;	 Catch:{ all -> 0x01d6 }
            if (r9 <= r2) goto L_0x00cd;
        L_0x00c2:
            r5 = r8[r2];	 Catch:{ all -> 0x01d6 }
            r22 = r4;
            r3 = r5.f61489b;	 Catch:{ all -> 0x01d6 }
            r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1));
            if (r5 == 0) goto L_0x00f0;
        L_0x00cc:
            goto L_0x00cf;
        L_0x00cd:
            r22 = r4;
        L_0x00cf:
            if (r9 > r2) goto L_0x00d2;
        L_0x00d1:
            r2 = 0;
        L_0x00d2:
            r3 = r2;
            r2 = 0;
        L_0x00d4:
            if (r2 >= r9) goto L_0x00e7;
        L_0x00d6:
            r4 = r8[r3];	 Catch:{ all -> 0x01d6 }
            r4 = r4.f61489b;	 Catch:{ all -> 0x01d6 }
            r16 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1));
            if (r16 != 0) goto L_0x00df;
        L_0x00de:
            goto L_0x00e7;
        L_0x00df:
            r3 = r3 + 1;
            if (r3 != r9) goto L_0x00e4;
        L_0x00e3:
            r3 = 0;
        L_0x00e4:
            r2 = r2 + 1;
            goto L_0x00d4;
        L_0x00e7:
            r1.f61508o = r3;	 Catch:{ all -> 0x01d6 }
            r2 = r8[r3];	 Catch:{ all -> 0x01d6 }
            r4 = r2.f61489b;	 Catch:{ all -> 0x01d6 }
            r1.f61507n = r4;	 Catch:{ all -> 0x01d6 }
            r2 = r3;
        L_0x00f0:
            r3 = r2;
            r2 = 0;
            r4 = 0;
        L_0x00f3:
            if (r2 >= r9) goto L_0x0198;
        L_0x00f5:
            r5 = r25.m70924f();	 Catch:{ all -> 0x01d6 }
            if (r5 == 0) goto L_0x00fc;
        L_0x00fb:
            return;
        L_0x00fc:
            r5 = r8[r3];	 Catch:{ all -> 0x01d6 }
            r11 = 0;
        L_0x00ff:
            r12 = r11;
            r11 = 0;
        L_0x0101:
            r16 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1));
            if (r16 <= 0) goto L_0x0117;
        L_0x0105:
            r16 = r25.m70924f();	 Catch:{ all -> 0x01d6 }
            if (r16 == 0) goto L_0x010c;
        L_0x010b:
            return;
        L_0x010c:
            r13 = r5.f61491d;	 Catch:{ all -> 0x01d6 }
            if (r13 != 0) goto L_0x0111;
        L_0x0110:
            goto L_0x0117;
        L_0x0111:
            r12 = r13.m70641f();	 Catch:{ all -> 0x01d6 }
            if (r12 != 0) goto L_0x011c;
        L_0x0117:
            r14 = r22;
            r15 = 1;
            goto L_0x0143;
        L_0x011c:
            r13 = rx.internal.operators.NotificationLite.m69891e(r12);	 Catch:{ all -> 0x01d6 }
            r14 = r22;
            r14.onNext(r13);	 Catch:{ Throwable -> 0x0133 }
            r13 = 0;
            r15 = 1;
            r20 = r6 - r15;
            r11 = r11 + 1;
            r22 = r14;
            r6 = r20;
            r14 = 0;
            goto L_0x0101;
        L_0x0133:
            r0 = move-exception;
            rx.exceptions.C19410a.m69874b(r0);	 Catch:{ all -> 0x0057 }
            r14.onError(r0);	 Catch:{ all -> 0x013e }
            r25.unsubscribe();	 Catch:{ all -> 0x0057 }
            return;
        L_0x013e:
            r0 = move-exception;
            r25.unsubscribe();	 Catch:{ all -> 0x0057 }
            throw r0;	 Catch:{ all -> 0x0057 }
        L_0x0143:
            if (r11 <= 0) goto L_0x015b;
        L_0x0145:
            if (r10 != 0) goto L_0x0150;
        L_0x0147:
            r6 = r1.f61497d;	 Catch:{ all -> 0x01d6 }
            r6 = r6.m70574a(r11);	 Catch:{ all -> 0x01d6 }
            r23 = r6;
            goto L_0x0155;
        L_0x0150:
            r23 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        L_0x0155:
            r6 = (long) r11;	 Catch:{ all -> 0x01d6 }
            r5.m70907a(r6);	 Catch:{ all -> 0x01d6 }
            r6 = r23;
        L_0x015b:
            r20 = 0;
            r11 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1));
            if (r11 == 0) goto L_0x016a;
        L_0x0161:
            if (r12 != 0) goto L_0x0164;
        L_0x0163:
            goto L_0x016a;
        L_0x0164:
            r11 = r12;
            r22 = r14;
            r14 = 0;
            goto L_0x00ff;
        L_0x016a:
            r11 = r5.f61490c;	 Catch:{ all -> 0x01d6 }
            r12 = r5.f61491d;	 Catch:{ all -> 0x01d6 }
            if (r11 == 0) goto L_0x0185;
        L_0x0170:
            if (r12 == 0) goto L_0x0178;
        L_0x0172:
            r11 = r12.m70640e();	 Catch:{ all -> 0x01d6 }
            if (r11 == 0) goto L_0x0185;
        L_0x0178:
            r1.m70919b(r5);	 Catch:{ all -> 0x01d6 }
            r4 = r25.m70924f();	 Catch:{ all -> 0x01d6 }
            if (r4 == 0) goto L_0x0182;
        L_0x0181:
            return;
        L_0x0182:
            r18 = r18 + 1;
            r4 = 1;
        L_0x0185:
            r11 = 0;
            r5 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1));
            if (r5 != 0) goto L_0x018c;
        L_0x018b:
            goto L_0x019a;
        L_0x018c:
            r3 = r3 + 1;
            if (r3 != r9) goto L_0x0191;
        L_0x0190:
            r3 = 0;
        L_0x0191:
            r2 = r2 + 1;
            r22 = r14;
            r14 = r11;
            goto L_0x00f3;
        L_0x0198:
            r14 = r22;
        L_0x019a:
            r1.f61508o = r3;	 Catch:{ all -> 0x01d6 }
            r2 = r8[r3];	 Catch:{ all -> 0x01d6 }
            r2 = r2.f61489b;	 Catch:{ all -> 0x01d6 }
            r1.f61507n = r2;	 Catch:{ all -> 0x01d6 }
            r2 = r18;
            goto L_0x01a9;
        L_0x01a5:
            r14 = r4;
            r2 = r18;
            r4 = 0;
        L_0x01a9:
            if (r2 <= 0) goto L_0x01af;
        L_0x01ab:
            r2 = (long) r2;	 Catch:{ all -> 0x01d6 }
            r1.request(r2);	 Catch:{ all -> 0x01d6 }
        L_0x01af:
            if (r4 == 0) goto L_0x01b4;
        L_0x01b1:
            r4 = r14;
            goto L_0x0004;
        L_0x01b4:
            monitor-enter(r25);	 Catch:{ all -> 0x01d6 }
            r2 = r1.f61503j;	 Catch:{ all -> 0x01c8 }
            if (r2 != 0) goto L_0x01c3;
        L_0x01b9:
            r2 = 0;
            r1.f61502i = r2;	 Catch:{ all -> 0x01be }
            monitor-exit(r25);	 Catch:{ all -> 0x01be }
            return;
        L_0x01be:
            r0 = move-exception;
            r2 = r0;
            r17 = 1;
            goto L_0x01cc;
        L_0x01c3:
            r2 = 0;
            r1.f61503j = r2;	 Catch:{ all -> 0x01c8 }
            monitor-exit(r25);	 Catch:{ all -> 0x01c8 }
            goto L_0x01b1;
        L_0x01c8:
            r0 = move-exception;
            r2 = r0;
            r17 = 0;
        L_0x01cc:
            monitor-exit(r25);	 Catch:{ all -> 0x01d3 }
            throw r2;	 Catch:{ all -> 0x01ce }
        L_0x01ce:
            r0 = move-exception;
            r2 = r0;
            r3 = r17;
            goto L_0x01d9;
        L_0x01d3:
            r0 = move-exception;
            r2 = r0;
            goto L_0x01cc;
        L_0x01d6:
            r0 = move-exception;
            r2 = r0;
            r3 = 0;
        L_0x01d9:
            if (r3 != 0) goto L_0x01e5;
        L_0x01db:
            monitor-enter(r25);
            r3 = 0;
            r1.f61502i = r3;	 Catch:{ all -> 0x01e1 }
            monitor-exit(r25);	 Catch:{ all -> 0x01e1 }
            goto L_0x01e5;
        L_0x01e1:
            r0 = move-exception;
            r2 = r0;
            monitor-exit(r25);	 Catch:{ all -> 0x01e1 }
            throw r2;
        L_0x01e5:
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorMerge.d.e():void");
        }

        /* renamed from: f */
        boolean m70924f() {
            if (this.f61494a.isUnsubscribed()) {
                return true;
            }
            Queue queue = this.f61500g;
            if (this.f61495b || queue == null || queue.isEmpty()) {
                return false;
            }
            try {
                m70908g();
                return true;
            } finally {
                unsubscribe();
            }
        }
    }

    public /* synthetic */ Object call(Object obj) {
        return m71424a((C19571c) obj);
    }

    /* renamed from: a */
    public static <T> OperatorMerge<T> m71423a(boolean z) {
        if (z) {
            return C19415a.f60597a;
        }
        return C19416b.f60598a;
    }

    OperatorMerge(boolean z, int i) {
        this.f61975a = z;
        this.f61976b = i;
    }

    /* renamed from: a */
    public C19571c<Observable<? extends T>> m71424a(C19571c<? super T> c19571c) {
        Object c19675d = new C19675d(c19571c, this.f61975a, this.f61976b);
        Producer mergeProducer = new MergeProducer(c19675d);
        c19675d.f61497d = mergeProducer;
        c19571c.add(c19675d);
        c19571c.setProducer(mergeProducer);
        return c19675d;
    }
}
