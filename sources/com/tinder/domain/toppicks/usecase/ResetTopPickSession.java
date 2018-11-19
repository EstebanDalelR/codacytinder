package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.common.usecase.RequestUseCase;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngine.ResetReason;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.RecSource.TopPicks;
import com.tinder.domain.toppicks.model.TopPicksSession;
import com.tinder.domain.toppicks.repo.TopPicksSessionRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/toppicks/usecase/ResetTopPickSession;", "Lcom/tinder/domain/common/usecase/RequestUseCase;", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "topPicksSessionRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksSessionRepository;", "recsEngineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "(Lcom/tinder/domain/toppicks/repo/TopPicksSessionRepository;Lcom/tinder/domain/recs/RecsEngineRegistry;)V", "execute", "", "request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ResetTopPickSession implements RequestUseCase<ResetReason> {
    private final RecsEngineRegistry recsEngineRegistry;
    private final TopPicksSessionRepository topPicksSessionRepository;

    @Inject
    public ResetTopPickSession(@NotNull TopPicksSessionRepository topPicksSessionRepository, @NotNull RecsEngineRegistry recsEngineRegistry) {
        C2668g.b(topPicksSessionRepository, "topPicksSessionRepository");
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        this.topPicksSessionRepository = topPicksSessionRepository;
        this.recsEngineRegistry = recsEngineRegistry;
    }

    public void execute(@NotNull ResetReason resetReason) {
        C2668g.b(resetReason, "request");
        RecsEngine engine = this.recsEngineRegistry.getEngine(TopPicks.INSTANCE);
        if (engine != null) {
            engine.reset(resetReason);
        }
        this.topPicksSessionRepository.updateCurrentSession(new TopPicksSession(new DateTime(0), false, false, false, false, 30, null));
    }
}
