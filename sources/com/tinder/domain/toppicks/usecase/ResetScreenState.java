package com.tinder.domain.toppicks.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.common.reactivex.usecase.SimpleDisposableUseCase;
import com.tinder.domain.recs.RecsEngine.ResetReason;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.RecSource.TopPicks;
import com.tinder.domain.toppicks.TopPicksScreenState;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/domain/toppicks/usecase/ResetScreenState;", "Lcom/tinder/domain/common/reactivex/usecase/SimpleDisposableUseCase;", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "recsEngineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "resetTopPickSession", "Lcom/tinder/domain/toppicks/usecase/ResetTopPickSession;", "observeTopPicksScreenState", "Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksScreenState;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/domain/recs/RecsEngineRegistry;Lcom/tinder/domain/toppicks/usecase/ResetTopPickSession;Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksScreenState;Lcom/tinder/common/logger/Logger;)V", "execute", "Lio/reactivex/disposables/Disposable;", "request", "handleResetForState", "", "state", "Lcom/tinder/domain/toppicks/TopPicksScreenState;", "reason", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ResetScreenState implements SimpleDisposableUseCase<ResetReason> {
    private final Logger logger;
    private final ObserveTopPicksScreenState observeTopPicksScreenState;
    private final RecsEngineRegistry recsEngineRegistry;
    private final ResetTopPickSession resetTopPickSession;

    @Inject
    public ResetScreenState(@NotNull RecsEngineRegistry recsEngineRegistry, @NotNull ResetTopPickSession resetTopPickSession, @NotNull ObserveTopPicksScreenState observeTopPicksScreenState, @NotNull Logger logger) {
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        C2668g.b(resetTopPickSession, "resetTopPickSession");
        C2668g.b(observeTopPicksScreenState, "observeTopPicksScreenState");
        C2668g.b(logger, "logger");
        this.recsEngineRegistry = recsEngineRegistry;
        this.resetTopPickSession = resetTopPickSession;
        this.observeTopPicksScreenState = observeTopPicksScreenState;
        this.logger = logger;
    }

    @NotNull
    public Disposable execute(@NotNull ResetReason resetReason) {
        C2668g.b(resetReason, "request");
        resetReason = this.observeTopPicksScreenState.execute().e().a(new ResetScreenState$execute$1(this, resetReason), (Consumer) new ResetScreenState$execute$2(this));
        C2668g.a(resetReason, "observeTopPicksScreenSta…getting screen state\") })");
        return resetReason;
    }

    private final void handleResetForState(TopPicksScreenState topPicksScreenState, ResetReason resetReason) {
        switch (topPicksScreenState) {
            case NOT_LOADED_GOLD:
            case GOLD:
                topPicksScreenState = this.recsEngineRegistry.getEngine(TopPicks.INSTANCE);
                if (topPicksScreenState != null) {
                    topPicksScreenState.reset(resetReason);
                    return;
                }
                return;
            case NOT_LOADED_NON_GOLD:
            case NON_GOLD:
            case GOLD_EXHAUSTED:
            case TOP_PICKS_NOT_AVAILABLE:
                this.resetTopPickSession.execute(resetReason);
                return;
            default:
                return;
        }
    }
}
