package com.tinder.domain.toppicks.repo;

import com.tinder.domain.toppicks.model.TopPicksSession;
import io.reactivex.C3957b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/tinder/domain/toppicks/repo/TopPicksSessionRepository;", "", "getCurrentSession", "Lcom/tinder/domain/toppicks/model/TopPicksSession;", "observeTopPicksSession", "Lio/reactivex/Flowable;", "updateCurrentSession", "", "topPicksSession", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface TopPicksSessionRepository {
    @NotNull
    TopPicksSession getCurrentSession();

    @NotNull
    C3957b<TopPicksSession> observeTopPicksSession();

    void updateCurrentSession(@NotNull TopPicksSession topPicksSession);
}
