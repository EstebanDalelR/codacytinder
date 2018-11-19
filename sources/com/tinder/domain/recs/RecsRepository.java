package com.tinder.domain.recs;

import com.tinder.data.recs.C8786k;
import com.tinder.domain.recs.RecsEngine.ResetReason;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.domain.recs.model.RecsUpdate.Rewind.Reason;
import com.tinder.domain.recs.model.Swipe;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Completable;
import rx.Observable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\bH&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H&J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0016\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001fH&J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H&J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010!\u001a\u00020$H&J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020$H&J>\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\f\u001a\u00020\u000b2\u001e\u0010'\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130(2\u0006\u0010!\u001a\u00020$H&J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020$H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006*"}, d2 = {"Lcom/tinder/domain/recs/RecsRepository;", "", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "getRecSource", "()Lcom/tinder/domain/recs/model/Rec$Source;", "cacheRecs", "Lrx/Single;", "Lcom/tinder/data/recs/RecsFetchResults;", "recsFetchResults", "cancelRewind", "Lcom/tinder/domain/recs/model/Swipe;", "swipe", "clearCache", "Lrx/Completable;", "insertRec", "rec", "Lcom/tinder/domain/recs/model/Rec;", "position", "", "loadAndCacheRecsFromNetwork", "loadRecs", "loadRecsFromNetwork", "observeRecsUpdates", "Lrx/Observable;", "Lcom/tinder/domain/recs/model/RecsUpdate;", "sinceRecsUpdate", "processSwipe", "removeRec", "removeRecs", "recs", "", "resetNetworkState", "reason", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "rewindLastSwipe", "Lcom/tinder/domain/recs/model/RecsUpdate$Rewind$Reason;", "rewindSwipeToPositionZero", "rewindSwipeToSelectedPosition", "positionSelector", "Lkotlin/Function2;", "rewindSwipeToSwipedPosition", "engine_release"}, k = 1, mv = {1, 1, 9})
public interface RecsRepository {

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 9})
    public static final class DefaultImpls {
        @NotNull
        public static /* synthetic */ Observable observeRecsUpdates$default(RecsRepository recsRepository, RecsUpdate recsUpdate, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeRecsUpdates");
            }
            if ((i & 1) != 0) {
                recsUpdate = null;
            }
            return recsRepository.observeRecsUpdates(recsUpdate);
        }
    }

    @NotNull
    Single<C8786k> cacheRecs(@NotNull C8786k c8786k);

    @NotNull
    Single<Swipe> cancelRewind(@NotNull Swipe swipe);

    @NotNull
    Completable clearCache();

    @NotNull
    Rec$Source getRecSource();

    @NotNull
    Completable insertRec(@NotNull Rec rec, int i);

    @NotNull
    Single<C8786k> loadAndCacheRecsFromNetwork();

    @NotNull
    Single<C8786k> loadRecs();

    @NotNull
    Single<C8786k> loadRecsFromNetwork();

    @NotNull
    Observable<RecsUpdate> observeRecsUpdates(@Nullable RecsUpdate recsUpdate);

    @NotNull
    Single<Swipe> processSwipe(@NotNull Swipe swipe);

    @NotNull
    Completable removeRec(@NotNull Rec rec);

    @NotNull
    Completable removeRecs(@NotNull List<? extends Rec> list);

    @NotNull
    Completable resetNetworkState(@NotNull ResetReason resetReason);

    @NotNull
    Single<Swipe> rewindLastSwipe(@NotNull Reason reason);

    @NotNull
    Single<Swipe> rewindSwipeToPositionZero(@NotNull Swipe swipe, @NotNull Reason reason);

    @NotNull
    Single<Swipe> rewindSwipeToSelectedPosition(@NotNull Swipe swipe, @NotNull Function2<? super List<? extends Rec>, ? super Integer, Integer> function2, @NotNull Reason reason);

    @NotNull
    Single<Swipe> rewindSwipeToSwipedPosition(@NotNull Swipe swipe, @NotNull Reason reason);
}
