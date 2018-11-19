package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.concurrent.atomic.AtomicLong;
import rx.C19571c;
import rx.Notification;
import rx.Observable.Operator;
import rx.Producer;
import rx.p498c.C19401c;

public final class ak<T> implements Operator<Notification<T>, T> {

    /* renamed from: rx.internal.operators.ak$a */
    static final class C19425a {
        /* renamed from: a */
        static final ak<Object> f60618a = new ak();
    }

    /* renamed from: rx.internal.operators.ak$b */
    static class C19691b<T> extends C19571c<T> {
        /* renamed from: a */
        private final C19571c<? super Notification<T>> f61586a;
        /* renamed from: b */
        private volatile Notification<T> f61587b;
        /* renamed from: c */
        private boolean f61588c;
        /* renamed from: d */
        private boolean f61589d;
        /* renamed from: e */
        private final AtomicLong f61590e = new AtomicLong();

        C19691b(C19571c<? super Notification<T>> c19571c) {
            this.f61586a = c19571c;
        }

        public void onStart() {
            request(0);
        }

        /* renamed from: a */
        void m70958a(long j) {
            C19419a.m69900a(this.f61590e, j);
            request(j);
            m70957b();
        }

        public void onCompleted() {
            this.f61587b = Notification.m69597a();
            m70957b();
        }

        public void onError(Throwable th) {
            this.f61587b = Notification.m69599a(th);
            C19401c.m69811a(th);
            m70957b();
        }

        public void onNext(T t) {
            this.f61586a.onNext(Notification.m69598a((Object) t));
            m70956a();
        }

        /* renamed from: a */
        private void m70956a() {
            AtomicLong atomicLong = this.f61590e;
            long j;
            do {
                j = atomicLong.get();
                if (j == Format.OFFSET_SAMPLE_RELATIVE) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, j - 1));
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: b */
        private void m70957b() {
            /*
            r7 = this;
            monitor-enter(r7);
            r0 = r7.f61588c;	 Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x000a;
        L_0x0005:
            r0 = 1;
            r7.f61589d = r0;	 Catch:{ all -> 0x0049 }
            monitor-exit(r7);	 Catch:{ all -> 0x0049 }
            return;
        L_0x000a:
            monitor-exit(r7);	 Catch:{ all -> 0x0049 }
            r0 = r7.f61590e;
        L_0x000d:
            r1 = r7.f61586a;
            r1 = r1.isUnsubscribed();
            if (r1 != 0) goto L_0x0048;
        L_0x0015:
            r1 = r7.f61587b;
            if (r1 == 0) goto L_0x0039;
        L_0x0019:
            r2 = r0.get();
            r4 = 0;
            r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r6 <= 0) goto L_0x0039;
        L_0x0023:
            r0 = 0;
            r7.f61587b = r0;
            r0 = r7.f61586a;
            r0.onNext(r1);
            r0 = r7.f61586a;
            r0 = r0.isUnsubscribed();
            if (r0 != 0) goto L_0x0038;
        L_0x0033:
            r0 = r7.f61586a;
            r0.onCompleted();
        L_0x0038:
            return;
        L_0x0039:
            monitor-enter(r7);
            r1 = r7.f61589d;	 Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x0043;
        L_0x003e:
            r0 = 0;
            r7.f61588c = r0;	 Catch:{ all -> 0x0045 }
            monitor-exit(r7);	 Catch:{ all -> 0x0045 }
            return;
        L_0x0043:
            monitor-exit(r7);	 Catch:{ all -> 0x0045 }
            goto L_0x000d;
        L_0x0045:
            r0 = move-exception;
            monitor-exit(r7);	 Catch:{ all -> 0x0045 }
            throw r0;
        L_0x0048:
            return;
        L_0x0049:
            r0 = move-exception;
            monitor-exit(r7);	 Catch:{ all -> 0x0049 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.ak.b.b():void");
        }
    }

    public /* synthetic */ Object call(Object obj) {
        return m71444a((C19571c) obj);
    }

    /* renamed from: a */
    public static <T> ak<T> m71443a() {
        return C19425a.f60618a;
    }

    ak() {
    }

    /* renamed from: a */
    public C19571c<? super T> m71444a(C19571c<? super Notification<T>> c19571c) {
        final C19571c<? super T> c19691b = new C19691b(c19571c);
        c19571c.add(c19691b);
        c19571c.setProducer(new Producer(this) {
            /* renamed from: b */
            final /* synthetic */ ak f61185b;

            public void request(long j) {
                if (j > 0) {
                    c19691b.m70958a(j);
                }
            }
        });
        return c19691b;
    }
}
