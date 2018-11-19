package com.tinder.discovery.domain;

import com.tinder.discovery.model.DiscoverySegment;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/discovery/domain/DiscoverySegmentSequencer;", "", "sort", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "list", "discovery_release"}, k = 1, mv = {1, 1, 10})
public interface DiscoverySegmentSequencer {
    @NotNull
    List<DiscoverySegment> sort(@NotNull List<? extends DiscoverySegment> list);
}
