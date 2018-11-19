package com.tinder.domain.recs.usecase;

import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.model.Rec$Source;
import io.reactivex.C3957b;
import io.reactivex.functions.Function;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0003*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/tinder/domain/recs/RecsEngine;", "kotlin.jvm.PlatformType", "it", "", "Lcom/tinder/domain/recs/model/Rec$Source;", "apply"}, k = 3, mv = {1, 1, 10})
final class ObserveRecsEngineLoadingStatuses$loadExistingEngine$1<T, R> implements Function<T, Publisher<? extends R>> {
    final /* synthetic */ Rec$Source $recSource;

    ObserveRecsEngineLoadingStatuses$loadExistingEngine$1(Rec$Source rec$Source) {
        this.$recSource = rec$Source;
    }

    public final C3957b<RecsEngine> apply(@NotNull Map<Rec$Source, RecsEngine> map) {
        C2668g.b(map, "it");
        RecsEngine recsEngine = (RecsEngine) map.get(this.$recSource);
        if (recsEngine != null) {
            return C3957b.a(recsEngine);
        }
        map = new StringBuilder();
        map.append("RecsEngine is not available for ");
        map.append(this.$recSource);
        map.append('.');
        throw new IllegalStateException(map.toString().toString());
    }
}
