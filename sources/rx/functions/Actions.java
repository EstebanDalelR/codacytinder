package rx.functions;

import rx.exceptions.OnErrorNotImplementedException;

public final class Actions {
    /* renamed from: a */
    private static final C19815b f60589a = new C19815b();

    enum NotImplemented implements Action1<Throwable> {
        INSTANCE;

        public void call(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    }

    /* renamed from: rx.functions.Actions$a */
    static final class C19814a<T> implements Action1<T> {
        /* renamed from: a */
        final Action0 f61965a;

        public C19814a(Action0 action0) {
            this.f61965a = action0;
        }

        public void call(T t) {
            this.f61965a.call();
        }
    }

    /* renamed from: rx.functions.Actions$b */
    static final class C19815b<T0, T1, T2, T3, T4, T5, T6, T7, T8> implements Action0, Action1<T0>, Action2<T0, T1>, Action3<T0, T1, T2>, Action4<T0, T1, T2, T3>, Action5<T0, T1, T2, T3, T4>, Action6<T0, T1, T2, T3, T4, T5>, Action7<T0, T1, T2, T3, T4, T5, T6>, Action8<T0, T1, T2, T3, T4, T5, T6, T7>, Action9<T0, T1, T2, T3, T4, T5, T6, T7, T8>, ActionN {
        public void call() {
        }

        public void call(T0 t0) {
        }

        public void call(T0 t0, T1 t1) {
        }

        public void call(T0 t0, T1 t1, T2 t2) {
        }

        public void call(T0 t0, T1 t1, T2 t2, T3 t3) {
        }

        public void call(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4) {
        }

        public void call(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        }

        public void call(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        }

        public void call(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        }

        public void call(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        }

        public void call(Object... objArr) {
        }

        C19815b() {
        }
    }

    /* renamed from: a */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> C19815b<T0, T1, T2, T3, T4, T5, T6, T7, T8> m69877a() {
        return f60589a;
    }

    /* renamed from: a */
    public static <T> Action1<T> m69876a(Action0 action0) {
        return new C19814a(action0);
    }

    /* renamed from: b */
    public static Action1<Throwable> m69878b() {
        return NotImplemented.INSTANCE;
    }
}
