package com.tinder.domain.recs.engine.cardstack;

import com.tinder.data.recs.C8786k;
import com.tinder.util.RxUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "recsFetchResults", "Lcom/tinder/data/recs/RecsFetchResults;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
final class CardStackRecsLoader$subscribeForRecsLoading$2<T> implements Action1<C8786k> {
    final /* synthetic */ CardStackRecsLoader this$0;

    CardStackRecsLoader$subscribeForRecsLoading$2(CardStackRecsLoader cardStackRecsLoader) {
        this.this$0 = cardStackRecsLoader;
    }

    public final void call(C8786k c8786k) {
        RxUtils.f47590a.b(this.this$0.loadRecsSubscription);
        CardStackRecsLoader cardStackRecsLoader = this.this$0;
        C2668g.a(c8786k, "recsFetchResults");
        cardStackRecsLoader.updateLoadingStatus(c8786k);
    }
}
