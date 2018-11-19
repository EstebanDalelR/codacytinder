package com.tinder.ads;

import com.tinder.domain.match.model.MessageAdMatch;
import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
final class V1BrandedProfileCardMatchInsertionRule$perform$1 implements Action0 {
    final /* synthetic */ MessageAdMatch $messageAdMatch;
    final /* synthetic */ V1BrandedProfileCardMatchInsertionRule this$0;

    V1BrandedProfileCardMatchInsertionRule$perform$1(V1BrandedProfileCardMatchInsertionRule v1BrandedProfileCardMatchInsertionRule, MessageAdMatch messageAdMatch) {
        this.this$0 = v1BrandedProfileCardMatchInsertionRule;
        this.$messageAdMatch = messageAdMatch;
    }

    public final void call() {
        this.this$0.newMatchNotifier.notifyNewMatch(this.$messageAdMatch);
    }
}
