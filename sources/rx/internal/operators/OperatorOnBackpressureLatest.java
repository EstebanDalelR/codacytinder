package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.Observable.Operator;
import rx.Observer;
import rx.Producer;
import rx.Subscription;

public final class OperatorOnBackpressureLatest<T> implements Operator<T, T> {

    /* renamed from: rx.internal.operators.OperatorOnBackpressureLatest$a */
    static final class C19417a {
        /* renamed from: a */
        static final OperatorOnBackpressureLatest<Object> f60599a = new OperatorOnBackpressureLatest();
    }

    static final class LatestEmitter<T> extends AtomicLong implements Observer<T>, Producer, Subscription {
        /* renamed from: h */
        static final Object f61161h = new Object();
        private static final long serialVersionUID = -1364393685005146274L;
        /* renamed from: a */
        final C19571c<? super T> f61162a;
        /* renamed from: b */
        C19676b<? super T> f61163b;
        /* renamed from: c */
        final AtomicReference<Object> f61164c = new AtomicReference(f61161h);
        /* renamed from: d */
        Throwable f61165d;
        /* renamed from: e */
        volatile boolean f61166e;
        /* renamed from: f */
        boolean f61167f;
        /* renamed from: g */
        boolean f61168g;

        public LatestEmitter(C19571c<? super T> c19571c) {
            this.f61162a = c19571c;
            lazySet(-4611686018427387904L);
        }

        public void request(long j) {
            if (j >= 0) {
                long j2;
                long j3;
                do {
                    j2 = get();
                    if (j2 != Long.MIN_VALUE) {
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
                if (j2 == -4611686018427387904L) {
                    this.f61163b.m70925a(Format.OFFSET_SAMPLE_RELATIVE);
                }
                m70576a();
            }
        }

        /* renamed from: a */
        long m70575a(long j) {
            long j2;
            long j3;
            do {
                j3 = get();
                if (j3 < 0) {
                    return j3;
                }
                j2 = j3 - j;
            } while (!compareAndSet(j3, j2));
            return j2;
        }

        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        public void unsubscribe() {
            if (get() >= 0) {
                getAndSet(Long.MIN_VALUE);
            }
        }

        public void onNext(T t) {
            this.f61164c.lazySet(t);
            m70576a();
        }

        public void onError(Throwable th) {
            this.f61165d = th;
            this.f61166e = true;
            m70576a();
        }

        public void onCompleted() {
            this.f61166e = true;
            m70576a();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        void m70576a() {
            /*
            r9 = this;
            monitor-enter(r9);
            r0 = r9.f61167f;	 Catch:{ all -> 0x007a }
            r1 = 1;
            if (r0 == 0) goto L_0x000a;
        L_0x0006:
            r9.f61168g = r1;	 Catch:{ all -> 0x007a }
            monitor-exit(r9);	 Catch:{ all -> 0x007a }
            return;
        L_0x000a:
            r9.f61167f = r1;	 Catch:{ all -> 0x007a }
            r0 = 0;
            r9.f61168g = r0;	 Catch:{ all -> 0x007a }
            monitor-exit(r9);	 Catch:{ all -> 0x007a }
        L_0x0010:
            r2 = r9.get();	 Catch:{ all -> 0x006d }
            r4 = -9223372036854775808;
            r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r6 != 0) goto L_0x001b;
        L_0x001a:
            goto L_0x005d;
        L_0x001b:
            r4 = r9.f61164c;	 Catch:{ all -> 0x006d }
            r4 = r4.get();	 Catch:{ all -> 0x006d }
            r5 = 0;
            r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
            if (r7 <= 0) goto L_0x003e;
        L_0x0027:
            r2 = f61161h;	 Catch:{ all -> 0x006d }
            if (r4 == r2) goto L_0x003e;
        L_0x002b:
            r2 = r9.f61162a;	 Catch:{ all -> 0x006d }
            r2.onNext(r4);	 Catch:{ all -> 0x006d }
            r2 = r9.f61164c;	 Catch:{ all -> 0x006d }
            r3 = f61161h;	 Catch:{ all -> 0x006d }
            r2.compareAndSet(r4, r3);	 Catch:{ all -> 0x006d }
            r2 = 1;
            r9.m70575a(r2);	 Catch:{ all -> 0x006d }
            r4 = f61161h;	 Catch:{ all -> 0x006d }
        L_0x003e:
            r2 = f61161h;	 Catch:{ all -> 0x006d }
            if (r4 != r2) goto L_0x0055;
        L_0x0042:
            r2 = r9.f61166e;	 Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x0055;
        L_0x0046:
            r2 = r9.f61165d;	 Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x0050;
        L_0x004a:
            r3 = r9.f61162a;	 Catch:{ all -> 0x006d }
            r3.onError(r2);	 Catch:{ all -> 0x006d }
            goto L_0x0055;
        L_0x0050:
            r2 = r9.f61162a;	 Catch:{ all -> 0x006d }
            r2.onCompleted();	 Catch:{ all -> 0x006d }
        L_0x0055:
            monitor-enter(r9);	 Catch:{ all -> 0x006d }
            r2 = r9.f61168g;	 Catch:{ all -> 0x0062 }
            if (r2 != 0) goto L_0x005e;
        L_0x005a:
            r9.f61167f = r0;	 Catch:{ all -> 0x0062 }
            monitor-exit(r9);	 Catch:{ all -> 0x006b }
        L_0x005d:
            return;
        L_0x005e:
            r9.f61168g = r0;	 Catch:{ all -> 0x0062 }
            monitor-exit(r9);	 Catch:{ all -> 0x0062 }
            goto L_0x0010;
        L_0x0062:
            r2 = move-exception;
            r1 = 0;
        L_0x0064:
            monitor-exit(r9);	 Catch:{ all -> 0x006b }
            throw r2;	 Catch:{ all -> 0x0066 }
        L_0x0066:
            r2 = move-exception;
            r8 = r2;
            r2 = r1;
            r1 = r8;
            goto L_0x006f;
        L_0x006b:
            r2 = move-exception;
            goto L_0x0064;
        L_0x006d:
            r1 = move-exception;
            r2 = 0;
        L_0x006f:
            if (r2 != 0) goto L_0x0079;
        L_0x0071:
            monitor-enter(r9);
            r9.f61167f = r0;	 Catch:{ all -> 0x0076 }
            monitor-exit(r9);	 Catch:{ all -> 0x0076 }
            goto L_0x0079;
        L_0x0076:
            r0 = move-exception;
            monitor-exit(r9);	 Catch:{ all -> 0x0076 }
            throw r0;
        L_0x0079:
            throw r1;
        L_0x007a:
            r0 = move-exception;
            monitor-exit(r9);	 Catch:{ all -> 0x007a }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorOnBackpressureLatest.LatestEmitter.a():void");
        }
    }

    /* renamed from: rx.internal.operators.OperatorOnBackpressureLatest$b */
    static final class C19676b<T> extends C19571c<T> {
        /* renamed from: a */
        private final LatestEmitter<T> f61511a;

        C19676b(LatestEmitter<T> latestEmitter) {
            this.f61511a = latestEmitter;
        }

        public void onStart() {
            request(0);
        }

        public void onNext(T t) {
            this.f61511a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f61511a.onError(th);
        }

        public void onCompleted() {
            this.f61511a.onCompleted();
        }

        /* renamed from: a */
        void m70925a(long j) {
            request(j);
        }
    }

    public /* synthetic */ Object call(Object obj) {
        return m71426a((C19571c) obj);
    }

    /* renamed from: a */
    public static <T> OperatorOnBackpressureLatest<T> m71425a() {
        return C19417a.f60599a;
    }

    /* renamed from: a */
    public C19571c<? super T> m71426a(C19571c<? super T> c19571c) {
        Object latestEmitter = new LatestEmitter(c19571c);
        Object c19676b = new C19676b(latestEmitter);
        latestEmitter.f61163b = c19676b;
        c19571c.add(c19676b);
        c19571c.add(latestEmitter);
        c19571c.setProducer(latestEmitter);
        return c19676b;
    }
}
