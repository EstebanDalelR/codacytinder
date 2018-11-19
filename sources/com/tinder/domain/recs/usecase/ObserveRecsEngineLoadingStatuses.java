package com.tinder.domain.recs.usecase;

import com.tinder.domain.common.reactivex.usecase.FlowableUseCase;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3957b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\f\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/domain/recs/usecase/ObserveRecsEngineLoadingStatuses;", "Lcom/tinder/domain/common/reactivex/usecase/FlowableUseCase;", "Lcom/tinder/domain/recs/model/Rec$Source;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "recsEngineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "(Lcom/tinder/domain/recs/RecsEngineRegistry;)V", "execute", "Lio/reactivex/Flowable;", "request", "loadExistingEngine", "Lcom/tinder/domain/recs/RecsEngine;", "recSource", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ObserveRecsEngineLoadingStatuses implements FlowableUseCase<Rec$Source, RecsLoadingStatus> {
    private final RecsEngineRegistry recsEngineRegistry;

    @Inject
    public ObserveRecsEngineLoadingStatuses(@NotNull RecsEngineRegistry recsEngineRegistry) {
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        this.recsEngineRegistry = recsEngineRegistry;
    }

    @NotNull
    public C3957b<RecsLoadingStatus> execute(@NotNull Rec$Source rec$Source) {
        C2668g.b(rec$Source, "request");
        rec$Source = loadExistingEngine(rec$Source).b(ObserveRecsEngineLoadingStatuses$execute$1.INSTANCE);
        C2668g.a(rec$Source, "loadExistingEngine(reque…pdates().toV2Flowable() }");
        return rec$Source;
    }

    private final C3957b<RecsEngine> loadExistingEngine(Rec$Source rec$Source) {
        rec$Source = RxJavaInteropExtKt.toV2Flowable(this.recsEngineRegistry.observeEngines()).f().b(new ObserveRecsEngineLoadingStatuses$loadExistingEngine$1(rec$Source));
        C2668g.a(rec$Source, "recsEngineRegistry.obser…recsEngine)\n            }");
        return rec$Source;
    }
}
