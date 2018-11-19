package com.tinder.discovery.domain;

import com.tinder.discovery.model.DiscoverySegment;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\"\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t0\u0004H&¨\u0006\u000b"}, d2 = {"Lcom/tinder/discovery/domain/DiscoverySegmentRepository;", "", "observeDiscoverySegments", "Lio/reactivex/Flowable;", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "updateDiscoverySegments", "Lio/reactivex/Completable;", "updates", "Lkotlin/Pair;", "", "discovery_release"}, k = 1, mv = {1, 1, 10})
public interface DiscoverySegmentRepository {
    @NotNull
    C3957b<List<DiscoverySegment>> observeDiscoverySegments();

    @NotNull
    C3956a updateDiscoverySegments(@NotNull List<? extends Pair<? extends DiscoverySegment, Boolean>> list);
}
