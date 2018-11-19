package com.tinder.domain.recs.engine.dispatcher.common.policy;

import com.tinder.domain.recs.model.Swipe;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "swipe1", "Lcom/tinder/domain/recs/model/Swipe;", "kotlin.jvm.PlatformType", "swipe2", "compare"}, k = 3, mv = {1, 1, 9})
final class SortByPriority$sortedPendingSwipes$1<T> implements Comparator<Swipe> {
    final /* synthetic */ SortByPriority this$0;

    SortByPriority$sortedPendingSwipes$1(SortByPriority sortByPriority) {
        this.this$0 = sortByPriority;
    }

    public final int compare(Swipe swipe, Swipe swipe2) {
        SortByPriority sortByPriority = this.this$0;
        C2668g.a(swipe, "swipe1");
        C2668g.a(swipe2, "swipe2");
        return sortByPriority.compareSwipes(swipe, swipe2);
    }
}
