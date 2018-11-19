package com.tinder.domain.recs.usecase;

import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3957b;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "it", "Lcom/tinder/domain/recs/RecsEngine;", "apply"}, k = 3, mv = {1, 1, 10})
final class ObserveRecsEngineLoadingStatuses$execute$1<T, R> implements Function<T, Publisher<? extends R>> {
    public static final ObserveRecsEngineLoadingStatuses$execute$1 INSTANCE = new ObserveRecsEngineLoadingStatuses$execute$1();

    ObserveRecsEngineLoadingStatuses$execute$1() {
    }

    @NotNull
    public final C3957b<RecsLoadingStatus> apply(@NotNull RecsEngine recsEngine) {
        C2668g.b(recsEngine, "it");
        return RxJavaInteropExtKt.toV2Flowable(recsEngine.observeLoadingStatusUpdates());
    }
}
