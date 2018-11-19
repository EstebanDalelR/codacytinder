package com.tinder.ads;

import com.tinder.recsads.model.C14754b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "dfpAdFields", "Lcom/tinder/recsads/model/DfpAdFields;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class RecsAdSourceRegistrar$registerAdSources$1<T> implements Action1<C14754b> {
    final /* synthetic */ AdAggregator $adAggregator;
    final /* synthetic */ RecsAdSourceRegistrar this$0;

    RecsAdSourceRegistrar$registerAdSources$1(RecsAdSourceRegistrar recsAdSourceRegistrar, AdAggregator adAggregator) {
        this.this$0 = recsAdSourceRegistrar;
        this.$adAggregator = adAggregator;
    }

    public final void call(C14754b c14754b) {
        RecsAdSourceRegistrar recsAdSourceRegistrar = this.this$0;
        C2668g.a(c14754b, "dfpAdFields");
        for (AdSource addSource : recsAdSourceRegistrar.createDfpSources(c14754b)) {
            this.$adAggregator.addSource(addSource);
        }
    }
}
