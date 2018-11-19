package com.tinder.ads.cache;

import com.tinder.ads.Ad;
import com.tinder.ads.PriorityComparator;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/ads/cache/AdComparator;", "Ljava/util/Comparator;", "Lcom/tinder/ads/Ad;", "()V", "priorityComparator", "Lcom/tinder/ads/PriorityComparator;", "compare", "", "o1", "o2", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class AdComparator implements Comparator<Ad<?>> {
    private final PriorityComparator priorityComparator = new PriorityComparator();

    public int compare(@NotNull Ad<?> ad, @NotNull Ad<?> ad2) {
        C2668g.b(ad, "o1");
        C2668g.b(ad2, "o2");
        return this.priorityComparator.compare(ad.priority(), ad2.priority());
    }
}
