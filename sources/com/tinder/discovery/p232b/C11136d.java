package com.tinder.discovery.p232b;

import com.tinder.discovery.domain.DiscoverySegmentSequencer;
import com.tinder.discovery.model.DiscoverySegment;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/discovery/data/DiscoverySegmentSequencerImpl;", "Lcom/tinder/discovery/domain/DiscoverySegmentSequencer;", "()V", "sort", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "list", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.b.d */
public final class C11136d implements DiscoverySegmentSequencer {
    @NotNull
    public List<DiscoverySegment> sort(@NotNull List<? extends DiscoverySegment> list) {
        C2668g.b(list, "list");
        LinkedList linkedList = new LinkedList(list);
        linkedList.remove(DiscoverySegment.PLACES);
        linkedList.remove(DiscoverySegment.TOP_PICKS);
        if (list.contains(DiscoverySegment.TOP_PICKS) && list.contains(DiscoverySegment.PLACES)) {
            linkedList.addFirst(DiscoverySegment.PLACES);
            linkedList.addLast(DiscoverySegment.TOP_PICKS);
        } else if (list.contains(DiscoverySegment.PLACES)) {
            linkedList.addLast(DiscoverySegment.PLACES);
        } else if (list.contains(DiscoverySegment.TOP_PICKS) != null) {
            linkedList.addLast(DiscoverySegment.TOP_PICKS);
        }
        return linkedList;
    }
}
