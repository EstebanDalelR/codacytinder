package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.toppicks.model.TopPicksSession;
import com.tinder.domain.toppicks.repo.TopPicksSessionRepository;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/domain/toppicks/model/TopPicksSession;", "apply"}, k = 3, mv = {1, 1, 10})
final class UpdateTopPicksSessionFromRecsUpdate$execute$2<T, R> implements Function<TopPicksSession, CompletableSource> {
    final /* synthetic */ UpdateTopPicksSessionFromRecsUpdate this$0;

    UpdateTopPicksSessionFromRecsUpdate$execute$2(UpdateTopPicksSessionFromRecsUpdate updateTopPicksSessionFromRecsUpdate) {
        this.this$0 = updateTopPicksSessionFromRecsUpdate;
    }

    public final C3956a apply(@NotNull final TopPicksSession topPicksSession) {
        C2668g.b(topPicksSession, "it");
        return C3956a.a(new Callable<Object>() {
            public final void call() {
                TopPicksSessionRepository access$getTopPicksSessionRepository$p = this.this$0.topPicksSessionRepository;
                TopPicksSession topPicksSession = topPicksSession;
                C2668g.a(topPicksSession, "it");
                access$getTopPicksSessionRepository$p.updateCurrentSession(topPicksSession);
            }
        });
    }
}
