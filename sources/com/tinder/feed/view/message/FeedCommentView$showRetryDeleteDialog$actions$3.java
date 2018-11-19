package com.tinder.feed.view.message;

import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.FeedCommentViewModel;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class FeedCommentView$showRetryDeleteDialog$actions$3 extends Lambda implements Function1<Integer, C15813i> {
    /* renamed from: a */
    final /* synthetic */ FeedCommentView f44399a;
    /* renamed from: b */
    final /* synthetic */ FeedCommentViewModel f44400b;
    /* renamed from: c */
    final /* synthetic */ ActivityFeedViewModel f44401c;

    FeedCommentView$showRetryDeleteDialog$actions$3(FeedCommentView feedCommentView, FeedCommentViewModel feedCommentViewModel, ActivityFeedViewModel activityFeedViewModel) {
        this.f44399a = feedCommentView;
        this.f44400b = feedCommentViewModel;
        this.f44401c = activityFeedViewModel;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53665a(((Number) obj).intValue());
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53665a(int i) {
        this.f44399a.getFeedCommentActionHandler$Tinder_release().m39661a(this.f44400b.m39789a(), this.f44401c.mo11139a(), (Number) Integer.valueOf(i), this.f44400b.m39794f(), this.f44400b.m39790b());
    }
}
