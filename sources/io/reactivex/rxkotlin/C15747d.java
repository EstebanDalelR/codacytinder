package io.reactivex.rxkotlin;

import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 1}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aV\u0010\b\u001a\u00020\u0002\"\b\b\u0000\u0010\t*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\t0\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00020\u0004\u001aV\u0010\b\u001a\u00020\u0002\"\b\b\u0000\u0010\t*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\t0\u000e2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00020\u0004\u001a0\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001aV\u0010\u000f\u001a\u00020\u0010\"\b\b\u0000\u0010\t*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\t0\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00020\u0004\u001aV\u0010\u000f\u001a\u00020\u0010\"\b\b\u0000\u0010\t*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\t0\u00122\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00020\u0004\u001aV\u0010\u000f\u001a\u00020\u0010\"\b\b\u0000\u0010\t*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\t0\u000e2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00020\u0004\u001aF\u0010\u000f\u001a\u00020\u0010\"\b\b\u0000\u0010\t*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\t0\u00142\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00020\u0004\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004X\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"onCompleteStub", "Lkotlin/Function0;", "", "onErrorStub", "Lkotlin/Function1;", "", "onNextStub", "", "blockingSubscribeBy", "T", "Lio/reactivex/Flowable;", "onError", "onComplete", "onNext", "Lio/reactivex/Observable;", "subscribeBy", "Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Completable;", "Lio/reactivex/Maybe;", "onSuccess", "Lio/reactivex/Single;", "rxkotlin_main"}, k = 2, mv = {1, 1, 6})
/* renamed from: io.reactivex.rxkotlin.d */
public final class C15747d {
    /* renamed from: a */
    private static final Function1<Object, C15813i> f48670a = SubscribersKt$onNextStub$1.f59135a;
    /* renamed from: b */
    private static final Function1<Throwable, C15813i> f48671b = SubscribersKt$onErrorStub$1.f59134a;
    /* renamed from: c */
    private static final Function0<C15813i> f48672c = SubscribersKt$onCompleteStub$1.f59133a;

    @NotNull
    /* renamed from: a */
    public static final <T> Disposable m59003a(@NotNull C3957b<T> c3957b, @NotNull Function1<? super Throwable, C15813i> function1, @NotNull Function0<C15813i> function0, @NotNull Function1<? super T, C15813i> function12) {
        C2668g.b(c3957b, "$receiver");
        C2668g.b(function1, "onError");
        C2668g.b(function0, "onComplete");
        C2668g.b(function12, "onNext");
        c3957b = c3957b.a(new C17533f(function12), (Consumer) new C17533f(function1), (Action) new C17532e(function0));
        C2668g.a(c3957b, "subscribe(onNext, onError, onComplete)");
        return c3957b;
    }

    @NotNull
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Disposable m59002a(C3956a c3956a, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 1) != null) {
            function1 = f48671b;
        }
        if ((i & 2) != 0) {
            function0 = f48672c;
        }
        return C15747d.m59001a(c3956a, function1, function0);
    }

    @NotNull
    /* renamed from: a */
    public static final Disposable m59001a(@NotNull C3956a c3956a, @NotNull Function1<? super Throwable, C15813i> function1, @NotNull Function0<C15813i> function0) {
        C2668g.b(c3956a, "$receiver");
        C2668g.b(function1, "onError");
        C2668g.b(function0, "onComplete");
        c3956a = c3956a.a(new C17532e(function0), (Consumer) new C17533f(function1));
        C2668g.a(c3956a, "subscribe(onComplete, onError)");
        return c3956a;
    }
}
