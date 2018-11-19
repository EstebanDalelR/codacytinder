package com.tinder.feed.view.message;

import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.FeedCommentViewModel;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class FeedCommentView$showRetryDeleteDialog$actions$2 extends Lambda implements Function1<Integer, C15813i> {
    /* renamed from: a */
    final /* synthetic */ FeedCommentView f44396a;
    /* renamed from: b */
    final /* synthetic */ ActivityFeedViewModel f44397b;
    /* renamed from: c */
    final /* synthetic */ FeedCommentViewModel f44398c;

    FeedCommentView$showRetryDeleteDialog$actions$2(FeedCommentView feedCommentView, ActivityFeedViewModel activityFeedViewModel, FeedCommentViewModel feedCommentViewModel) {
        this.f44396a = feedCommentView;
        this.f44397b = activityFeedViewModel;
        this.f44398c = feedCommentViewModel;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53664a(((Number) obj).intValue());
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53664a(int i) {
        this.f44396a.getFeedCommentActionHandler$Tinder_release().m39659a(this.f44397b, this.f44398c.m39790b(), (Number) Integer.valueOf(i));
    }
}
