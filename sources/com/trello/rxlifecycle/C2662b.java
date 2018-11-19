package com.trello.rxlifecycle;

import com.trello.rxlifecycle.p452a.C15487a;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import rx.Observable;
import rx.functions.Func1;

/* renamed from: com.trello.rxlifecycle.b */
public class C2662b {
    @CheckReturnValue
    @Nonnull
    /* renamed from: a */
    public static <T, R> LifecycleTransformer<T> m10237a(@Nonnull Observable<R> observable, @Nonnull R r) {
        C15487a.a(observable, "lifecycle == null");
        C15487a.a(r, "event == null");
        return new C4452h(observable, r);
    }

    @CheckReturnValue
    @Nonnull
    /* renamed from: a */
    public static <T, R> LifecycleTransformer<T> m10238a(@Nonnull Observable<R> observable, @Nonnull Func1<R, R> func1) {
        C15487a.a(observable, "lifecycle == null");
        C15487a.a(func1, "correspondingEvents == null");
        return new C4451e(observable.r(), func1);
    }
}
