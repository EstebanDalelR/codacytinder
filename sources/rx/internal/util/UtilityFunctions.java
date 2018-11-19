package rx.internal.util;

import rx.functions.Func1;

public final class UtilityFunctions {

    enum AlwaysFalse implements Func1<Object, Boolean> {
        INSTANCE;

        public Boolean call(Object obj) {
            return Boolean.valueOf(null);
        }
    }

    enum AlwaysTrue implements Func1<Object, Boolean> {
        INSTANCE;

        public Boolean call(Object obj) {
            return Boolean.valueOf(true);
        }
    }

    enum Identity implements Func1<Object, Object> {
        INSTANCE;

        public Object call(Object obj) {
            return obj;
        }
    }

    /* renamed from: a */
    public static <T> Func1<? super T, Boolean> m69917a() {
        return AlwaysTrue.INSTANCE;
    }

    /* renamed from: b */
    public static <T> Func1<T, T> m69918b() {
        return Identity.INSTANCE;
    }
}
