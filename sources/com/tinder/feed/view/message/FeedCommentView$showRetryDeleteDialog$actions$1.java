package com.tinder.feed.view.message;

import android.content.Context;
import com.tinder.feed.view.action.C9482a;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.FeedCommentViewModel;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class FeedCommentView$showRetryDeleteDialog$actions$1 extends Lambda implements Function1<Integer, C15813i> {
    /* renamed from: a */
    final /* synthetic */ FeedCommentView f44393a;
    /* renamed from: b */
    final /* synthetic */ FeedCommentViewModel f44394b;
    /* renamed from: c */
    final /* synthetic */ ActivityFeedViewModel f44395c;

    FeedCommentView$showRetryDeleteDialog$actions$1(FeedCommentView feedCommentView, FeedCommentViewModel feedCommentViewModel, ActivityFeedViewModel activityFeedViewModel) {
        this.f44393a = feedCommentView;
        this.f44394b = feedCommentViewModel;
        this.f44395c = activityFeedViewModel;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53663a(((Number) obj).intValue());
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53663a(int i) {
        C9482a feedCommentActionHandler$Tinder_release = this.f44393a.getFeedCommentActionHandler$Tinder_release();
        Context context = this.f44393a.getContext();
        C2668g.a(context, "context");
        feedCommentActionHandler$Tinder_release.m39658a(context, this.f44395c.mo11139a(), (Number) Integer.valueOf(i), this.f44394b.m39794f(), this.f44394b.m39790b());
    }
}
