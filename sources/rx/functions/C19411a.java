package rx.functions;

/* renamed from: rx.functions.a */
public final class C19411a {
    /* renamed from: a */
    public static <T0, T1, R> FuncN<R> m69879a(final Func2<? super T0, ? super T1, ? extends R> func2) {
        return new FuncN<R>() {
            public R call(Object... objArr) {
                if (objArr.length == 2) {
                    return func2.call(objArr[0], objArr[1]);
                }
                throw new IllegalArgumentException("Func2 expecting 2 arguments.");
            }
        };
    }

    /* renamed from: a */
    public static <T0, T1, T2, R> FuncN<R> m69880a(final Func3<? super T0, ? super T1, ? super T2, ? extends R> func3) {
        return new FuncN<R>() {
            public R call(Object... objArr) {
                if (objArr.length == 3) {
                    return func3.call(objArr[0], objArr[1], objArr[2]);
                }
                throw new IllegalArgumentException("Func3 expecting 3 arguments.");
            }
        };
    }

    /* renamed from: a */
    public static <T0, T1, T2, T3, R> FuncN<R> m69881a(final Func4<? super T0, ? super T1, ? super T2, ? super T3, ? extends R> func4) {
        return new FuncN<R>() {
            public R call(Object... objArr) {
                if (objArr.length == 4) {
                    return func4.call(objArr[0], objArr[1], objArr[2], objArr[3]);
                }
                throw new IllegalArgumentException("Func4 expecting 4 arguments.");
            }
        };
    }

    /* renamed from: a */
    public static <T0, T1, T2, T3, T4, R> FuncN<R> m69882a(final Func5<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? extends R> func5) {
        return new FuncN<R>() {
            public R call(Object... objArr) {
                if (objArr.length == 5) {
                    return func5.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
                }
                throw new IllegalArgumentException("Func5 expecting 5 arguments.");
            }
        };
    }
}
