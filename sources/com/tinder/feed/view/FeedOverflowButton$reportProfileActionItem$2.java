package com.tinder.feed.view;

import com.tinder.feed.view.model.C9541g;
import com.tinder.overflow.model.C10029b;
import com.tinder.overflow.model.FeedbackType;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "feedbackFinishedInfo", "Lcom/tinder/overflow/model/FeedbackFinishedInfo;", "invoke"}, k = 3, mv = {1, 1, 10})
final class FeedOverflowButton$reportProfileActionItem$2 extends Lambda implements Function1<C10029b, C15813i> {
    /* renamed from: a */
    final /* synthetic */ FeedOverflowButton f44170a;

    FeedOverflowButton$reportProfileActionItem$2(FeedOverflowButton feedOverflowButton) {
        this.f44170a = feedOverflowButton;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53542a((C10029b) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53542a(@NotNull C10029b c10029b) {
        C2668g.b(c10029b, "feedbackFinishedInfo");
        this.f44170a.f38220a.onFeedbackProvided(new C9541g(FeedbackType.REPORT, c10029b.m41081a(), c10029b.m41082b()));
    }
}
