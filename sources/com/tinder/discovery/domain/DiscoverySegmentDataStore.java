package com.tinder.discovery.domain;

import com.tinder.discovery.model.DiscoverySegment;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003H&J\"\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000b0\nH&¨\u0006\f"}, d2 = {"Lcom/tinder/discovery/domain/DiscoverySegmentDataStore;", "", "load", "Lio/reactivex/Single;", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "", "update", "Lio/reactivex/Completable;", "updates", "", "Lkotlin/Pair;", "discovery_release"}, k = 1, mv = {1, 1, 10})
public interface DiscoverySegmentDataStore {
    @NotNull
    C3960g<Map<DiscoverySegment, Boolean>> load();

    @NotNull
    C3956a update(@NotNull List<? extends Pair<? extends DiscoverySegment, Boolean>> list);
}
