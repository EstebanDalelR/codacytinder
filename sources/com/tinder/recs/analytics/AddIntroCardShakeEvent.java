package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/tinder/recs/analytics/AddIntroCardShakeEvent;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "getFireworks", "()Lcom/tinder/analytics/fireworks/Fireworks;", "execute", "Lrx/Completable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddIntroCardShakeEvent implements SimpleCompletableUseCase {
    @NotNull
    private final C2630h fireworks;

    @Inject
    public AddIntroCardShakeEvent(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.fireworks = c2630h;
    }

    @NotNull
    public final C2630h getFireworks() {
        return this.fireworks;
    }

    @NotNull
    public Completable execute() {
        Completable a = Completable.a(new AddIntroCardShakeEvent$execute$1(this));
        C2668g.a(a, "Completable.fromAction {…lder().build())\n        }");
        return a;
    }
}
