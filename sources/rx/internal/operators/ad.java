package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.concurrent.TimeUnit;
import rx.C19571c;
import rx.C2671a;
import rx.Observable.Operator;
import rx.functions.Action0;
import rx.observers.C19781e;
import rx.p500e.C19575d;

public final class ad<T> implements Operator<T, T> {
    /* renamed from: a */
    final long f61985a;
    /* renamed from: b */
    final TimeUnit f61986b;
    /* renamed from: c */
    final C2671a f61987c;

    /* renamed from: rx.internal.operators.ad$a */
    static final class C19421a<T> {
        /* renamed from: a */
        int f60610a;
        /* renamed from: b */
        T f60611b;
        /* renamed from: c */
        boolean f60612c;
        /* renamed from: d */
        boolean f60613d;
        /* renamed from: e */
        boolean f60614e;

        C19421a() {
        }

        /* renamed from: a */
        public synchronized int m69903a(T t) {
            int i;
            this.f60611b = t;
            this.f60612c = true;
            i = this.f60610a + 1;
            this.f60610a = i;
            return i;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public void m69905a(int r3, rx.C19571c<T> r4, rx.C19571c<?> r5) {
            /*
            r2 = this;
            monitor-enter(r2);
            r0 = r2.f60614e;	 Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0033;
        L_0x0005:
            r0 = r2.f60612c;	 Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0033;
        L_0x0009:
            r0 = r2.f60610a;	 Catch:{ all -> 0x0035 }
            if (r3 == r0) goto L_0x000e;
        L_0x000d:
            goto L_0x0033;
        L_0x000e:
            r3 = r2.f60611b;	 Catch:{ all -> 0x0035 }
            r0 = 0;
            r2.f60611b = r0;	 Catch:{ all -> 0x0035 }
            r0 = 0;
            r2.f60612c = r0;	 Catch:{ all -> 0x0035 }
            r1 = 1;
            r2.f60614e = r1;	 Catch:{ all -> 0x0035 }
            monitor-exit(r2);	 Catch:{ all -> 0x0035 }
            r4.onNext(r3);	 Catch:{ Throwable -> 0x002e }
            monitor-enter(r2);
            r3 = r2.f60613d;	 Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0026;
        L_0x0022:
            r2.f60614e = r0;	 Catch:{ all -> 0x002b }
            monitor-exit(r2);	 Catch:{ all -> 0x002b }
            return;
        L_0x0026:
            monitor-exit(r2);	 Catch:{ all -> 0x002b }
            r4.onCompleted();
            return;
        L_0x002b:
            r3 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x002b }
            throw r3;
        L_0x002e:
            r4 = move-exception;
            rx.exceptions.C19410a.m69870a(r4, r5, r3);
            return;
        L_0x0033:
            monitor-exit(r2);	 Catch:{ all -> 0x0035 }
            return;
        L_0x0035:
            r3 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0035 }
            throw r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.ad.a.a(int, rx.c, rx.c):void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public void m69906a(rx.C19571c<T> r5, rx.C19571c<?> r6) {
            /*
            r4 = this;
            monitor-enter(r4);
            r0 = r4.f60614e;	 Catch:{ all -> 0x0026 }
            r1 = 1;
            if (r0 == 0) goto L_0x000a;
        L_0x0006:
            r4.f60613d = r1;	 Catch:{ all -> 0x0026 }
            monitor-exit(r4);	 Catch:{ all -> 0x0026 }
            return;
        L_0x000a:
            r0 = r4.f60611b;	 Catch:{ all -> 0x0026 }
            r2 = r4.f60612c;	 Catch:{ all -> 0x0026 }
            r3 = 0;
            r4.f60611b = r3;	 Catch:{ all -> 0x0026 }
            r3 = 0;
            r4.f60612c = r3;	 Catch:{ all -> 0x0026 }
            r4.f60614e = r1;	 Catch:{ all -> 0x0026 }
            monitor-exit(r4);	 Catch:{ all -> 0x0026 }
            if (r2 == 0) goto L_0x0022;
        L_0x0019:
            r5.onNext(r0);	 Catch:{ Throwable -> 0x001d }
            goto L_0x0022;
        L_0x001d:
            r5 = move-exception;
            rx.exceptions.C19410a.m69870a(r5, r6, r0);
            return;
        L_0x0022:
            r5.onCompleted();
            return;
        L_0x0026:
            r5 = move-exception;
            monitor-exit(r4);	 Catch:{ all -> 0x0026 }
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.ad.a.a(rx.c, rx.c):void");
        }

        /* renamed from: a */
        public synchronized void m69904a() {
            this.f60610a++;
            this.f60611b = null;
            this.f60612c = false;
        }
    }

    public /* synthetic */ Object call(Object obj) {
        return m71432a((C19571c) obj);
    }

    public ad(long j, TimeUnit timeUnit, C2671a c2671a) {
        this.f61985a = j;
        this.f61986b = timeUnit;
        this.f61987c = c2671a;
    }

    /* renamed from: a */
    public C19571c<? super T> m71432a(C19571c<? super T> c19571c) {
        final Object createWorker = this.f61987c.createWorker();
        final C19781e c19781e = new C19781e(c19571c);
        final Object c19575d = new C19575d();
        c19781e.add(createWorker);
        c19781e.add(c19575d);
        return new C19571c<T>(this, c19571c) {
            /* renamed from: a */
            final C19421a<T> f61567a = new C19421a();
            /* renamed from: b */
            final C19571c<?> f61568b = this;
            /* renamed from: f */
            final /* synthetic */ ad f61572f;

            public void onStart() {
                request(Format.OFFSET_SAMPLE_RELATIVE);
            }

            public void onNext(T t) {
                t = this.f61567a.m69903a(t);
                c19575d.m70554a(createWorker.mo14741a(new Action0(this) {
                    /* renamed from: b */
                    final /* synthetic */ C196861 f61984b;

                    public void call() {
                        this.f61984b.f61567a.m69905a(t, c19781e, this.f61984b.f61568b);
                    }
                }, this.f61572f.f61985a, this.f61572f.f61986b));
            }

            public void onError(Throwable th) {
                c19781e.onError(th);
                unsubscribe();
                this.f61567a.m69904a();
            }

            public void onCompleted() {
                this.f61567a.m69906a(c19781e, this);
            }
        };
    }
}
