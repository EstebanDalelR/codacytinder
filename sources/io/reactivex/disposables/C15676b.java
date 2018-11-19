package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.functions.Functions;

/* renamed from: io.reactivex.disposables.b */
public final class C15676b {
    @NonNull
    /* renamed from: a */
    public static Disposable m58841a(@NonNull Runnable runnable) {
        C15684a.m58895a((Object) runnable, "run is null");
        return new RunnableDisposable(runnable);
    }

    @NonNull
    /* renamed from: a */
    public static Disposable m58840a(@NonNull Action action) {
        C15684a.m58895a((Object) action, "run is null");
        return new ActionDisposable(action);
    }

    @NonNull
    /* renamed from: a */
    public static Disposable m58839a() {
        return C15676b.m58841a(Functions.f48540b);
    }

    @NonNull
    /* renamed from: b */
    public static Disposable m58842b() {
        return EmptyDisposable.INSTANCE;
    }
}
