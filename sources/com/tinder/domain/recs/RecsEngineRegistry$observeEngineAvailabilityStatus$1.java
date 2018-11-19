package com.tinder.domain.recs;

import com.tinder.domain.recs.RecsEngineRegistry.EngineAvailabilityStatus;
import com.tinder.domain.recs.RecsEngineRegistry.EngineAvailabilityStatus.Available;
import com.tinder.domain.recs.RecsEngineRegistry.EngineAvailabilityStatus.NotAvailable;
import com.tinder.domain.recs.model.Rec$Source;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/RecsEngineRegistry$EngineAvailabilityStatus;", "it", "", "Lcom/tinder/domain/recs/model/Rec$Source;", "Lcom/tinder/domain/recs/RecsEngine;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
final class RecsEngineRegistry$observeEngineAvailabilityStatus$1<T, R> implements Func1<T, R> {
    final /* synthetic */ Rec$Source $recSource;

    RecsEngineRegistry$observeEngineAvailabilityStatus$1(Rec$Source rec$Source) {
        this.$recSource = rec$Source;
    }

    @NotNull
    public final EngineAvailabilityStatus call(Map<Rec$Source, RecsEngine> map) {
        RecsEngine recsEngine = (RecsEngine) map.get(this.$recSource);
        if (recsEngine == null) {
            return (EngineAvailabilityStatus) NotAvailable.INSTANCE;
        }
        return new Available(recsEngine);
    }
}
