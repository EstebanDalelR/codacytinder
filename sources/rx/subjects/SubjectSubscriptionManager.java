package rx.subjects;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.Observer;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.internal.operators.NotificationLite;
import rx.p500e.C19407e;

final class SubjectSubscriptionManager<T> extends AtomicReference<C19455a<T>> implements OnSubscribe<T> {
    private static final long serialVersionUID = 6035251036011671568L;
    /* renamed from: a */
    volatile Object f62346a;
    /* renamed from: b */
    boolean f62347b = true;
    /* renamed from: c */
    Action1<C19622b<T>> f62348c = Actions.m69877a();
    /* renamed from: d */
    Action1<C19622b<T>> f62349d = Actions.m69877a();
    /* renamed from: e */
    Action1<C19622b<T>> f62350e = Actions.m69877a();

    /* renamed from: rx.subjects.SubjectSubscriptionManager$a */
    protected static final class C19455a<T> {
        /* renamed from: c */
        static final C19622b[] f60690c = new C19622b[0];
        /* renamed from: d */
        static final C19455a f60691d = new C19455a(true, f60690c);
        /* renamed from: e */
        static final C19455a f60692e = new C19455a(false, f60690c);
        /* renamed from: a */
        final boolean f60693a;
        /* renamed from: b */
        final C19622b[] f60694b;

        public C19455a(boolean z, C19622b[] c19622bArr) {
            this.f60693a = z;
            this.f60694b = c19622bArr;
        }

        /* renamed from: a */
        public C19455a m70002a(C19622b c19622b) {
            int length = this.f60694b.length;
            Object obj = new C19622b[(length + 1)];
            System.arraycopy(this.f60694b, 0, obj, 0, length);
            obj[length] = c19622b;
            return new C19455a(this.f60693a, obj);
        }

        /* renamed from: b */
        public C19455a m70003b(C19622b c19622b) {
            C19622b[] c19622bArr = this.f60694b;
            if (r1 == 1 && c19622bArr[0] == c19622b) {
                return f60692e;
            }
            if (r1 == 0) {
                return this;
            }
            int i = r1 - 1;
            C19622b c19622b2 = new C19622b[i];
            int i2 = 0;
            for (C19622b c19622b3 : c19622bArr) {
                if (c19622b3 != c19622b) {
                    if (i2 == i) {
                        return this;
                    }
                    int i3 = i2 + 1;
                    c19622b2[i2] = c19622b3;
                    i2 = i3;
                }
            }
            if (i2 == 0) {
                return f60692e;
            }
            if (i2 < i) {
                c19622b = new C19622b[i2];
                System.arraycopy(c19622b2, 0, c19622b, 0, i2);
            } else {
                c19622b = c19622b2;
            }
            return new C19455a(this.f60693a, c19622b);
        }
    }

    /* renamed from: rx.subjects.SubjectSubscriptionManager$b */
    protected static final class C19622b<T> implements Observer<T> {
        /* renamed from: a */
        final C19571c<? super T> f61330a;
        /* renamed from: b */
        boolean f61331b = true;
        /* renamed from: c */
        boolean f61332c;
        /* renamed from: d */
        List<Object> f61333d;
        /* renamed from: e */
        boolean f61334e;

        public C19622b(C19571c<? super T> c19571c) {
            this.f61330a = c19571c;
        }

        public void onNext(T t) {
            this.f61330a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f61330a.onError(th);
        }

        public void onCompleted() {
            this.f61330a.onCompleted();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        void m70658a(java.lang.Object r2) {
            /*
            r1 = this;
            r0 = r1.f61334e;
            if (r0 != 0) goto L_0x0026;
        L_0x0004:
            monitor-enter(r1);
            r0 = 0;
            r1.f61331b = r0;	 Catch:{ all -> 0x0023 }
            r0 = r1.f61332c;	 Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x001e;
        L_0x000c:
            r0 = r1.f61333d;	 Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0017;
        L_0x0010:
            r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0023 }
            r0.<init>();	 Catch:{ all -> 0x0023 }
            r1.f61333d = r0;	 Catch:{ all -> 0x0023 }
        L_0x0017:
            r0 = r1.f61333d;	 Catch:{ all -> 0x0023 }
            r0.add(r2);	 Catch:{ all -> 0x0023 }
            monitor-exit(r1);	 Catch:{ all -> 0x0023 }
            return;
        L_0x001e:
            monitor-exit(r1);	 Catch:{ all -> 0x0023 }
            r0 = 1;
            r1.f61334e = r0;
            goto L_0x0026;
        L_0x0023:
            r2 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0023 }
            throw r2;
        L_0x0026:
            r0 = r1.f61330a;
            rx.internal.operators.NotificationLite.m69887a(r0, r2);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.subjects.SubjectSubscriptionManager.b.a(java.lang.Object):void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: b */
        void m70660b(java.lang.Object r2) {
            /*
            r1 = this;
            monitor-enter(r1);
            r0 = r1.f61331b;	 Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a;
        L_0x0005:
            r0 = r1.f61332c;	 Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x000a;
        L_0x0009:
            goto L_0x001a;
        L_0x000a:
            r0 = 0;
            r1.f61331b = r0;	 Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x0010;
        L_0x000f:
            r0 = 1;
        L_0x0010:
            r1.f61332c = r0;	 Catch:{ all -> 0x001c }
            monitor-exit(r1);	 Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x0019;
        L_0x0015:
            r0 = 0;
            r1.m70659a(r0, r2);
        L_0x0019:
            return;
        L_0x001a:
            monitor-exit(r1);	 Catch:{ all -> 0x001c }
            return;
        L_0x001c:
            r2 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x001c }
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.subjects.SubjectSubscriptionManager.b.b(java.lang.Object):void");
        }

        /* renamed from: a */
        void m70659a(List<Object> list, Object obj) {
            Object obj2 = 1;
            Object obj3 = 1;
            while (true) {
                if (list != null) {
                    try {
                        for (Object c : list) {
                            m70661c(c);
                        }
                    } catch (Throwable th) {
                        list = th;
                        obj2 = null;
                    }
                }
                if (obj3 != null) {
                    m70661c(obj);
                    obj3 = null;
                }
                synchronized (this) {
                    try {
                        list = this.f61333d;
                        this.f61333d = null;
                        if (list == null) {
                            this.f61332c = false;
                            try {
                                return;
                            } catch (Throwable th2) {
                                list = th2;
                                try {
                                    throw list;
                                } catch (Throwable th3) {
                                    list = th3;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        list = th4;
                        obj2 = null;
                    }
                }
            }
            if (obj2 == null) {
                synchronized (this) {
                    this.f61332c = false;
                }
            }
            throw list;
        }

        /* renamed from: c */
        void m70661c(Object obj) {
            if (obj != null) {
                NotificationLite.m69887a(this.f61330a, obj);
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71656a((C19571c) obj);
    }

    public SubjectSubscriptionManager() {
        super(C19455a.f60692e);
    }

    /* renamed from: a */
    public void m71656a(C19571c<? super T> c19571c) {
        C19622b c19622b = new C19622b(c19571c);
        m71657a(c19571c, c19622b);
        this.f62348c.call(c19622b);
        if (!c19571c.isUnsubscribed() && m71658a(c19622b) && c19571c.isUnsubscribed() != null) {
            m71659b(c19622b);
        }
    }

    /* renamed from: a */
    void m71657a(C19571c<? super T> c19571c, final C19622b<T> c19622b) {
        c19571c.add(C19407e.m69854a(new Action0(this) {
            /* renamed from: b */
            final /* synthetic */ SubjectSubscriptionManager f62144b;

            public void call() {
                this.f62144b.m71659b(c19622b);
            }
        }));
    }

    /* renamed from: a */
    void m71655a(Object obj) {
        this.f62346a = obj;
    }

    /* renamed from: a */
    Object m71654a() {
        return this.f62346a;
    }

    /* renamed from: a */
    boolean m71658a(C19622b<T> c19622b) {
        C19455a c19455a;
        do {
            c19455a = (C19455a) get();
            if (c19455a.f60693a) {
                this.f62350e.call(c19622b);
                return null;
            }
        } while (!compareAndSet(c19455a, c19455a.m70002a(c19622b)));
        this.f62349d.call(c19622b);
        return true;
    }

    /* renamed from: b */
    void m71659b(C19622b<T> c19622b) {
        C19455a c19455a;
        C19455a b;
        do {
            c19455a = (C19455a) get();
            if (!c19455a.f60693a) {
                b = c19455a.m70003b(c19622b);
                if (b == c19455a) {
                    break;
                }
            } else {
                return;
            }
        } while (!compareAndSet(c19455a, b));
    }

    /* renamed from: b */
    C19622b<T>[] m71660b(Object obj) {
        m71655a(obj);
        return ((C19455a) get()).f60694b;
    }

    /* renamed from: c */
    C19622b<T>[] m71661c(Object obj) {
        m71655a(obj);
        this.f62347b = null;
        if (((C19455a) get()).f60693a != null) {
            return C19455a.f60690c;
        }
        return ((C19455a) getAndSet(C19455a.f60691d)).f60694b;
    }
}
