package com.tinder.domain.updates;

import com.tinder.domain.updates.model.PollInterval;
import io.reactivex.C3957b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/tinder/domain/updates/PollIntervalRepository;", "", "observePollInterval", "Lio/reactivex/Flowable;", "Lcom/tinder/domain/updates/model/PollInterval;", "updatePollInterval", "", "pollInterval", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface PollIntervalRepository {
    @NotNull
    C3957b<PollInterval> observePollInterval();

    void updatePollInterval(@NotNull PollInterval pollInterval);
}
