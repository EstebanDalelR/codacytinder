package com.tinder.domain.feed.usecase;

import com.tinder.common.logger.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class PollForNewFeedItems$execute$1<T> implements Action1<Throwable> {
    final /* synthetic */ PollForNewFeedItems this$0;

    PollForNewFeedItems$execute$1(PollForNewFeedItems pollForNewFeedItems) {
        this.this$0 = pollForNewFeedItems;
    }

    public final void call(Throwable th) {
        if (th instanceof IllegalStateException) {
            this.this$0.logger.warn(th, "Could not poll feed. Has the feed been loaded?");
            return;
        }
        Logger access$getLogger$p = this.this$0.logger;
        C2668g.a(th, "error");
        access$getLogger$p.error(th, "Error polling feed");
    }
}
