package io.reactivex.p079d;

import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.C3958c;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.p490b.C18339a;
import io.reactivex.p491c.C18340a;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

/* renamed from: io.reactivex.d.a */
public final class C2667a {
    @Nullable
    /* renamed from: a */
    static volatile Consumer<? super Throwable> f8429a;
    @Nullable
    /* renamed from: b */
    static volatile Function<? super Runnable, ? extends Runnable> f8430b;
    @Nullable
    /* renamed from: c */
    static volatile Function<? super Callable<C15679f>, ? extends C15679f> f8431c;
    @Nullable
    /* renamed from: d */
    static volatile Function<? super Callable<C15679f>, ? extends C15679f> f8432d;
    @Nullable
    /* renamed from: e */
    static volatile Function<? super Callable<C15679f>, ? extends C15679f> f8433e;
    @Nullable
    /* renamed from: f */
    static volatile Function<? super Callable<C15679f>, ? extends C15679f> f8434f;
    @Nullable
    /* renamed from: g */
    static volatile Function<? super C15679f, ? extends C15679f> f8435g;
    @Nullable
    /* renamed from: h */
    static volatile Function<? super C15679f, ? extends C15679f> f8436h;
    @Nullable
    /* renamed from: i */
    static volatile Function<? super C15679f, ? extends C15679f> f8437i;
    @Nullable
    /* renamed from: j */
    static volatile Function<? super C3957b, ? extends C3957b> f8438j;
    @Nullable
    /* renamed from: k */
    static volatile Function<? super C18339a, ? extends C18339a> f8439k;
    @Nullable
    /* renamed from: l */
    static volatile Function<? super C3959e, ? extends C3959e> f8440l;
    @Nullable
    /* renamed from: m */
    static volatile Function<? super C18340a, ? extends C18340a> f8441m;
    @Nullable
    /* renamed from: n */
    static volatile Function<? super C3958c, ? extends C3958c> f8442n;
    @Nullable
    /* renamed from: o */
    static volatile Function<? super C3960g, ? extends C3960g> f8443o;
    @Nullable
    /* renamed from: p */
    static volatile Function<? super C3956a, ? extends C3956a> f8444p;
    @Nullable
    /* renamed from: q */
    static volatile BiFunction<? super C3957b, ? super Subscriber, ? extends Subscriber> f8445q;
    @Nullable
    /* renamed from: r */
    static volatile BiFunction<? super C3958c, ? super MaybeObserver, ? extends MaybeObserver> f8446r;
    @Nullable
    /* renamed from: s */
    static volatile BiFunction<? super C3959e, ? super Observer, ? extends Observer> f8447s;
    @Nullable
    /* renamed from: t */
    static volatile BiFunction<? super C3960g, ? super SingleObserver, ? extends SingleObserver> f8448t;
    @Nullable
    /* renamed from: u */
    static volatile BiFunction<? super C3956a, ? super CompletableObserver, ? extends CompletableObserver> f8449u;
    @Nullable
    /* renamed from: v */
    static volatile BooleanSupplier f8450v;
    /* renamed from: w */
    static volatile boolean f8451w;
    /* renamed from: x */
    static volatile boolean f8452x;

    /* renamed from: a */
    public static boolean m10290a() {
        return f8452x;
    }

    @NonNull
    /* renamed from: a */
    public static C15679f m10282a(@NonNull Callable<C15679f> callable) {
        C15684a.a(callable, "Scheduler Callable can't be null");
        Function function = f8431c;
        if (function == null) {
            return C2667a.m10299e(callable);
        }
        return C2667a.m10281a(function, (Callable) callable);
    }

    @NonNull
    /* renamed from: b */
    public static C15679f m10292b(@NonNull Callable<C15679f> callable) {
        C15684a.a(callable, "Scheduler Callable can't be null");
        Function function = f8433e;
        if (function == null) {
            return C2667a.m10299e(callable);
        }
        return C2667a.m10281a(function, (Callable) callable);
    }

    @NonNull
    /* renamed from: c */
    public static C15679f m10296c(@NonNull Callable<C15679f> callable) {
        C15684a.a(callable, "Scheduler Callable can't be null");
        Function function = f8434f;
        if (function == null) {
            return C2667a.m10299e(callable);
        }
        return C2667a.m10281a(function, (Callable) callable);
    }

    @NonNull
    /* renamed from: d */
    public static C15679f m10298d(@NonNull Callable<C15679f> callable) {
        C15684a.a(callable, "Scheduler Callable can't be null");
        Function function = f8432d;
        if (function == null) {
            return C2667a.m10299e(callable);
        }
        return C2667a.m10281a(function, (Callable) callable);
    }

    @NonNull
    /* renamed from: a */
    public static C15679f m10280a(@NonNull C15679f c15679f) {
        Function function = f8435g;
        if (function == null) {
            return c15679f;
        }
        return (C15679f) C2667a.m10285a(function, (Object) c15679f);
    }

    /* renamed from: a */
    public static void m10289a(@NonNull Throwable th) {
        Consumer consumer = f8429a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!C2667a.m10294b(th)) {
            th = new UndeliverableException(th);
        }
        if (consumer != null) {
            try {
                consumer.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                C2667a.m10297c(th2);
            }
        }
        th.printStackTrace();
        C2667a.m10297c(th);
    }

    /* renamed from: b */
    static boolean m10294b(Throwable th) {
        if ((th instanceof OnErrorNotImplementedException) || (th instanceof MissingBackpressureException) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof CompositeException) != null) {
            return true;
        }
        return null;
    }

    /* renamed from: c */
    static void m10297c(@NonNull Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    @NonNull
    /* renamed from: b */
    public static C15679f m10291b(@NonNull C15679f c15679f) {
        Function function = f8437i;
        if (function == null) {
            return c15679f;
        }
        return (C15679f) C2667a.m10285a(function, (Object) c15679f);
    }

    @NonNull
    /* renamed from: a */
    public static Runnable m10286a(@NonNull Runnable runnable) {
        C15684a.a(runnable, "run is null");
        Function function = f8430b;
        if (function == null) {
            return runnable;
        }
        return (Runnable) C2667a.m10285a(function, (Object) runnable);
    }

    @NonNull
    /* renamed from: c */
    public static C15679f m10295c(@NonNull C15679f c15679f) {
        Function function = f8436h;
        if (function == null) {
            return c15679f;
        }
        return (C15679f) C2667a.m10285a(function, (Object) c15679f);
    }

    /* renamed from: a */
    public static void m10288a(@Nullable Consumer<? super Throwable> consumer) {
        if (f8451w) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f8429a = consumer;
    }

    @NonNull
    /* renamed from: a */
    public static <T> Subscriber<? super T> m10287a(@NonNull C3957b<T> c3957b, @NonNull Subscriber<? super T> subscriber) {
        BiFunction biFunction = f8445q;
        return biFunction != null ? (Subscriber) C2667a.m10284a(biFunction, c3957b, subscriber) : subscriber;
    }

    @NonNull
    /* renamed from: a */
    public static <T> Observer<? super T> m10272a(@NonNull C3959e<T> c3959e, @NonNull Observer<? super T> observer) {
        BiFunction biFunction = f8447s;
        return biFunction != null ? (Observer) C2667a.m10284a(biFunction, c3959e, observer) : observer;
    }

    @NonNull
    /* renamed from: a */
    public static <T> SingleObserver<? super T> m10273a(@NonNull C3960g<T> c3960g, @NonNull SingleObserver<? super T> singleObserver) {
        BiFunction biFunction = f8448t;
        return biFunction != null ? (SingleObserver) C2667a.m10284a(biFunction, c3960g, singleObserver) : singleObserver;
    }

    @NonNull
    /* renamed from: a */
    public static CompletableObserver m10270a(@NonNull C3956a c3956a, @NonNull CompletableObserver completableObserver) {
        BiFunction biFunction = f8449u;
        return biFunction != null ? (CompletableObserver) C2667a.m10284a(biFunction, c3956a, completableObserver) : completableObserver;
    }

    @NonNull
    /* renamed from: a */
    public static <T> MaybeObserver<? super T> m10271a(@NonNull C3958c<T> c3958c, @NonNull MaybeObserver<? super T> maybeObserver) {
        BiFunction biFunction = f8446r;
        return biFunction != null ? (MaybeObserver) C2667a.m10284a(biFunction, c3958c, maybeObserver) : maybeObserver;
    }

    @NonNull
    /* renamed from: a */
    public static <T> C3958c<T> m10278a(@NonNull C3958c<T> c3958c) {
        Function function = f8442n;
        return function != null ? (C3958c) C2667a.m10285a(function, (Object) c3958c) : c3958c;
    }

    @NonNull
    /* renamed from: a */
    public static <T> C3957b<T> m10276a(@NonNull C3957b<T> c3957b) {
        Function function = f8438j;
        return function != null ? (C3957b) C2667a.m10285a(function, (Object) c3957b) : c3957b;
    }

    @NonNull
    /* renamed from: a */
    public static <T> C18339a<T> m10275a(@NonNull C18339a<T> c18339a) {
        Function function = f8439k;
        return function != null ? (C18339a) C2667a.m10285a(function, (Object) c18339a) : c18339a;
    }

    @NonNull
    /* renamed from: a */
    public static <T> C3959e<T> m10279a(@NonNull C3959e<T> c3959e) {
        Function function = f8440l;
        return function != null ? (C3959e) C2667a.m10285a(function, (Object) c3959e) : c3959e;
    }

    @NonNull
    /* renamed from: a */
    public static <T> C18340a<T> m10277a(@NonNull C18340a<T> c18340a) {
        Function function = f8441m;
        return function != null ? (C18340a) C2667a.m10285a(function, (Object) c18340a) : c18340a;
    }

    @NonNull
    /* renamed from: a */
    public static <T> C3960g<T> m10283a(@NonNull C3960g<T> c3960g) {
        Function function = f8443o;
        return function != null ? (C3960g) C2667a.m10285a(function, (Object) c3960g) : c3960g;
    }

    @NonNull
    /* renamed from: a */
    public static C3956a m10274a(@NonNull C3956a c3956a) {
        Function function = f8444p;
        return function != null ? (C3956a) C2667a.m10285a(function, (Object) c3956a) : c3956a;
    }

    /* renamed from: b */
    public static boolean m10293b() {
        BooleanSupplier booleanSupplier = f8450v;
        if (booleanSupplier == null) {
            return false;
        }
        try {
            return booleanSupplier.getAsBoolean();
        } catch (Throwable th) {
            RuntimeException a = ExceptionHelper.a(th);
        }
    }

    @NonNull
    /* renamed from: a */
    static <T, R> R m10285a(@NonNull Function<T, R> function, @NonNull T t) {
        try {
            return function.apply(t);
        } catch (Function<T, R> function2) {
            function2 = ExceptionHelper.a(function2);
        }
    }

    @NonNull
    /* renamed from: a */
    static <T, U, R> R m10284a(@NonNull BiFunction<T, U, R> biFunction, @NonNull T t, @NonNull U u) {
        try {
            return biFunction.apply(t, u);
        } catch (BiFunction<T, U, R> biFunction2) {
            biFunction2 = ExceptionHelper.a(biFunction2);
        }
    }

    @NonNull
    /* renamed from: e */
    static C15679f m10299e(@NonNull Callable<C15679f> callable) {
        try {
            return (C15679f) C15684a.a(callable.call(), "Scheduler Callable result can't be null");
        } catch (Callable<C15679f> callable2) {
            callable2 = ExceptionHelper.a(callable2);
        }
    }

    @NonNull
    /* renamed from: a */
    static C15679f m10281a(@NonNull Function<? super Callable<C15679f>, ? extends C15679f> function, Callable<C15679f> callable) {
        return (C15679f) C15684a.a(C2667a.m10285a((Function) function, (Object) callable), "Scheduler Callable result can't be null");
    }
}
