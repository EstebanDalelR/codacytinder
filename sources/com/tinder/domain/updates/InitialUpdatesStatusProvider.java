package com.tinder.domain.updates;

import io.reactivex.C3957b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/updates/InitialUpdatesStatusProvider;", "", "observeInitialUpdatesStatus", "Lio/reactivex/Flowable;", "Lcom/tinder/domain/updates/InitialUpdatesStatusProvider$Status;", "Status", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface InitialUpdatesStatusProvider {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/updates/InitialUpdatesStatusProvider$Status;", "", "(Ljava/lang/String;I)V", "COMPLETED", "FAILED", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum Status {
    }

    @NotNull
    C3957b<Status> observeInitialUpdatesStatus();
}
