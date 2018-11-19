package com.tinder.fireboarding.view.animation;

import io.reactivex.C3956a;
import io.reactivex.C3959e;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/tinder/fireboarding/view/animation/CompletableFactory;", "", "()V", "fromObservable", "Lio/reactivex/Completable;", "T", "observable", "Lio/reactivex/Observable;", "timer", "millis", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.animation.a */
public final class C9579a {
    @NotNull
    /* renamed from: a */
    public final <T> C3956a m39912a(@NotNull C3959e<T> c3959e) {
        C2668g.b(c3959e, "observable");
        c3959e = C3956a.a(c3959e);
        C2668g.a(c3959e, "Completable.fromObservable(observable)");
        return c3959e;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m39911a(long j, @NotNull TimeUnit timeUnit) {
        C2668g.b(timeUnit, "timeUnit");
        j = C3956a.a(j, timeUnit);
        C2668g.a(j, "Completable.timer(millis, timeUnit)");
        return j;
    }
}
