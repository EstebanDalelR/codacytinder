package com.tinder.domain.toppicks.repo;

import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.toppicks.model.TopPickTeaser;
import com.tinder.domain.toppicks.model.TopPicksResponse;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.C3960g;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH&J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0011H&J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u0011H&J\b\u0010\u0014\u001a\u00020\u0006H&J\u0016\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¨\u0006\u0017"}, d2 = {"Lcom/tinder/domain/toppicks/repo/TopPicksRepository;", "", "bypassTopPicksEnd", "", "cacheTopPicksCount", "count", "", "clearAllTeaserRecs", "Lio/reactivex/Completable;", "clearExpiredTeaserRecs", "observeTeaserRecs", "Lio/reactivex/Flowable;", "", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "observeTopPicksResponse", "Lcom/tinder/domain/toppicks/model/TopPicksResponse;", "retrieveFreshTeasers", "Lio/reactivex/Single;", "retrieveTopPicks", "Lcom/tinder/domain/recs/model/Rec;", "retrieveTopPicksCountFromCache", "saveLocalTeasers", "teasers", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface TopPicksRepository {
    void bypassTopPicksEnd();

    void cacheTopPicksCount(int i);

    @NotNull
    C3956a clearAllTeaserRecs();

    @NotNull
    C3956a clearExpiredTeaserRecs();

    @NotNull
    C3957b<List<TopPickTeaser>> observeTeaserRecs();

    @NotNull
    C3957b<TopPicksResponse> observeTopPicksResponse();

    @NotNull
    C3960g<List<TopPickTeaser>> retrieveFreshTeasers();

    @NotNull
    C3960g<List<Rec>> retrieveTopPicks();

    int retrieveTopPicksCountFromCache();

    @NotNull
    C3956a saveLocalTeasers(@NotNull List<TopPickTeaser> list);
}
