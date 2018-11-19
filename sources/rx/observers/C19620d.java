package rx.observers;

import rx.Observer;
import rx.exceptions.C19410a;
import rx.internal.operators.NotificationLite;

/* renamed from: rx.observers.d */
public class C19620d<T> implements Observer<T> {
    /* renamed from: a */
    private final Observer<? super T> f61307a;
    /* renamed from: b */
    private boolean f61308b;
    /* renamed from: c */
    private volatile boolean f61309c;
    /* renamed from: d */
    private C19449a f61310d;

    /* renamed from: rx.observers.d$a */
    static final class C19449a {
        /* renamed from: a */
        Object[] f60682a;
        /* renamed from: b */
        int f60683b;

        C19449a() {
        }

        /* renamed from: a */
        public void m69988a(Object obj) {
            int i = this.f60683b;
            Object[] objArr = this.f60682a;
            if (objArr == null) {
                objArr = new Object[16];
                this.f60682a = objArr;
            } else if (i == objArr.length) {
                Object obj2 = new Object[((i >> 2) + i)];
                System.arraycopy(objArr, 0, obj2, 0, i);
                this.f60682a = obj2;
                objArr = obj2;
            }
            objArr[i] = obj;
            this.f60683b = i + 1;
        }
    }

    public C19620d(Observer<? super T> observer) {
        this.f61307a = observer;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNext(T r7) {
        /*
        r6 = this;
        r0 = r6.f61309c;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        monitor-enter(r6);
        r0 = r6.f61309c;	 Catch:{ all -> 0x006f }
        if (r0 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r6);	 Catch:{ all -> 0x006f }
        return;
    L_0x000c:
        r0 = r6.f61308b;	 Catch:{ all -> 0x006f }
        if (r0 == 0) goto L_0x0024;
    L_0x0010:
        r0 = r6.f61310d;	 Catch:{ all -> 0x006f }
        if (r0 != 0) goto L_0x001b;
    L_0x0014:
        r0 = new rx.observers.d$a;	 Catch:{ all -> 0x006f }
        r0.<init>();	 Catch:{ all -> 0x006f }
        r6.f61310d = r0;	 Catch:{ all -> 0x006f }
    L_0x001b:
        r7 = rx.internal.operators.NotificationLite.m69885a(r7);	 Catch:{ all -> 0x006f }
        r0.m69988a(r7);	 Catch:{ all -> 0x006f }
        monitor-exit(r6);	 Catch:{ all -> 0x006f }
        return;
    L_0x0024:
        r0 = 1;
        r6.f61308b = r0;	 Catch:{ all -> 0x006f }
        monitor-exit(r6);	 Catch:{ all -> 0x006f }
        r1 = r6.f61307a;	 Catch:{ Throwable -> 0x0066 }
        r1.onNext(r7);	 Catch:{ Throwable -> 0x0066 }
    L_0x002d:
        monitor-enter(r6);
        r1 = r6.f61310d;	 Catch:{ all -> 0x0063 }
        r2 = 0;
        if (r1 != 0) goto L_0x0037;
    L_0x0033:
        r6.f61308b = r2;	 Catch:{ all -> 0x0063 }
        monitor-exit(r6);	 Catch:{ all -> 0x0063 }
        return;
    L_0x0037:
        r3 = 0;
        r6.f61310d = r3;	 Catch:{ all -> 0x0063 }
        monitor-exit(r6);	 Catch:{ all -> 0x0063 }
        r1 = r1.f60682a;
        r3 = r1.length;
    L_0x003e:
        if (r2 >= r3) goto L_0x002d;
    L_0x0040:
        r4 = r1[r2];
        if (r4 != 0) goto L_0x0045;
    L_0x0044:
        goto L_0x002d;
    L_0x0045:
        r5 = r6.f61307a;	 Catch:{ Throwable -> 0x0053 }
        r4 = rx.internal.operators.NotificationLite.m69887a(r5, r4);	 Catch:{ Throwable -> 0x0053 }
        if (r4 == 0) goto L_0x0050;
    L_0x004d:
        r6.f61309c = r0;	 Catch:{ Throwable -> 0x0053 }
        return;
    L_0x0050:
        r2 = r2 + 1;
        goto L_0x003e;
    L_0x0053:
        r1 = move-exception;
        r6.f61309c = r0;
        rx.exceptions.C19410a.m69874b(r1);
        r0 = r6.f61307a;
        r7 = rx.exceptions.OnErrorThrowable.m69866a(r1, r7);
        r0.onError(r7);
        return;
    L_0x0063:
        r7 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0063 }
        throw r7;
    L_0x0066:
        r1 = move-exception;
        r6.f61309c = r0;
        r0 = r6.f61307a;
        rx.exceptions.C19410a.m69870a(r1, r0, r7);
        return;
    L_0x006f:
        r7 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x006f }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.observers.d.onNext(java.lang.Object):void");
    }

    public void onError(Throwable th) {
        C19410a.m69874b(th);
        if (!this.f61309c) {
            synchronized (this) {
                if (this.f61309c) {
                    return;
                }
                this.f61309c = true;
                if (this.f61308b) {
                    C19449a c19449a = this.f61310d;
                    if (c19449a == null) {
                        c19449a = new C19449a();
                        this.f61310d = c19449a;
                    }
                    c19449a.m69988a(NotificationLite.m69886a(th));
                    return;
                }
                this.f61308b = true;
                this.f61307a.onError(th);
            }
        }
    }

    public void onCompleted() {
        if (!this.f61309c) {
            synchronized (this) {
                if (this.f61309c) {
                    return;
                }
                this.f61309c = true;
                if (this.f61308b) {
                    C19449a c19449a = this.f61310d;
                    if (c19449a == null) {
                        c19449a = new C19449a();
                        this.f61310d = c19449a;
                    }
                    c19449a.m69988a(NotificationLite.m69884a());
                    return;
                }
                this.f61308b = true;
                this.f61307a.onCompleted();
            }
        }
    }
}
