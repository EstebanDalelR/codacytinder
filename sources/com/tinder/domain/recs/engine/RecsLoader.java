package com.tinder.domain.recs.engine;

import com.tinder.domain.recs.RecsEngine.ResetReason;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/tinder/domain/recs/engine/RecsLoader;", "", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "getRecSource", "()Lcom/tinder/domain/recs/model/Rec$Source;", "observeLoadingStatusUpdates", "Lrx/Observable;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "pause", "", "reset", "reason", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "resume", "safeReset", "engine_release"}, k = 1, mv = {1, 1, 9})
public interface RecsLoader {
    @NotNull
    Rec$Source getRecSource();

    @NotNull
    Observable<RecsLoadingStatus> observeLoadingStatusUpdates();

    void pause();

    void reset(@NotNull ResetReason resetReason);

    void resume();

    void safeReset(@NotNull ResetReason resetReason);
}
