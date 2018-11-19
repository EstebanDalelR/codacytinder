package com.tinder.ads;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/ads/PriorityComparator;", "Ljava/util/Comparator;", "Lcom/tinder/ads/SourcePriority;", "()V", "compare", "", "o1", "o2", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class PriorityComparator implements Comparator<SourcePriority> {
    public int compare(@NotNull SourcePriority sourcePriority, @NotNull SourcePriority sourcePriority2) {
        C2668g.b(sourcePriority, "o1");
        C2668g.b(sourcePriority2, "o2");
        return C2668g.a(sourcePriority.getPriority$aggregator_release(), sourcePriority2.getPriority$aggregator_release());
    }
}
