package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.toppicks.model.TopPicksSession;
import com.tinder.domain.toppicks.usecase.UpdateTopPicksSessionFromRecsUpdate.Request;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/domain/toppicks/model/TopPicksSession;", "it", "apply"}, k = 3, mv = {1, 1, 10})
final class UpdateTopPicksSessionFromRecsUpdate$execute$1<T, R> implements Function<T, R> {
    final /* synthetic */ Request $request;

    UpdateTopPicksSessionFromRecsUpdate$execute$1(Request request) {
        this.$request = request;
    }

    @NotNull
    public final TopPicksSession apply(@NotNull TopPicksSession topPicksSession) {
        C2668g.b(topPicksSession, "it");
        return TopPicksSession.copy$default(topPicksSession, null, this.$request.getHasTopPicks(), false, false, false, 29, null);
    }
}
