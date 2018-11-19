package io.reactivex.p453a.p454a;

import io.reactivex.C15679f;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.a.a.a */
public final class C15671a {
    /* renamed from: a */
    private static volatile Function<Callable<C15679f>, C15679f> f48527a;
    /* renamed from: b */
    private static volatile Function<C15679f, C15679f> f48528b;

    /* renamed from: a */
    public static C15679f m58826a(Callable<C15679f> callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        Function function = f48527a;
        if (function == null) {
            return C15671a.m58828b(callable);
        }
        return C15671a.m58825a(function, (Callable) callable);
    }

    /* renamed from: a */
    public static C15679f m58824a(C15679f c15679f) {
        if (c15679f == null) {
            throw new NullPointerException("scheduler == null");
        }
        Function function = f48528b;
        if (function == null) {
            return c15679f;
        }
        return (C15679f) C15671a.m58827a(function, (Object) c15679f);
    }

    /* renamed from: b */
    static C15679f m58828b(Callable<C15679f> callable) {
        try {
            C15679f c15679f = (C15679f) callable.call();
            if (c15679f != null) {
                return c15679f;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Callable<C15679f> callable2) {
            callable2 = C15678a.m58849a(callable2);
        }
    }

    /* renamed from: a */
    static C15679f m58825a(Function<Callable<C15679f>, C15679f> function, Callable<C15679f> callable) {
        C15679f c15679f = (C15679f) C15671a.m58827a((Function) function, (Object) callable);
        if (c15679f != null) {
            return c15679f;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* renamed from: a */
    static <T, R> R m58827a(Function<T, R> function, T t) {
        try {
            return function.apply(t);
        } catch (Function<T, R> function2) {
            function2 = C15678a.m58849a(function2);
        }
    }
}
