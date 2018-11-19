package com.tinder.feed.view.p251b;

import com.tinder.feed.analytics.InteractType;
import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.FeedOverflowListener;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.C9541g;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b¨\u0006\t"}, d2 = {"Lcom/tinder/feed/view/factory/FeedOverflowListenerFactory;", "", "()V", "create", "Lcom/tinder/feed/view/FeedOverflowListener;", "presenter", "Lcom/tinder/feed/presenter/FeedItemPresenter;", "viewModel", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.b.b */
public final class C9486b {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"com/tinder/feed/view/factory/FeedOverflowListenerFactory$create$1", "Lcom/tinder/feed/view/FeedOverflowListener;", "(Lcom/tinder/feed/presenter/FeedItemPresenter;Lcom/tinder/feed/view/model/ActivityFeedViewModel;)V", "onFeedbackProvided", "", "feedbackInfo", "Lcom/tinder/feed/view/model/FeedbackInfo;", "onItemSelected", "interactType", "Lcom/tinder/feed/analytics/InteractType;", "onOverflowButtonClicked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.b.b$a */
    public static final class C11725a implements FeedOverflowListener {
        /* renamed from: a */
        final /* synthetic */ C9467d f38243a;
        /* renamed from: b */
        final /* synthetic */ ActivityFeedViewModel f38244b;

        C11725a(C9467d c9467d, ActivityFeedViewModel activityFeedViewModel) {
            this.f38243a = c9467d;
            this.f38244b = activityFeedViewModel;
        }

        public void onOverflowButtonClicked() {
            this.f38243a.m39582a(this.f38244b);
        }

        public void onItemSelected(@NotNull InteractType interactType) {
            C2668g.b(interactType, "interactType");
            this.f38243a.m39583a(this.f38244b, interactType);
        }

        public void onFeedbackProvided(@NotNull C9541g c9541g) {
            C2668g.b(c9541g, "feedbackInfo");
            this.f38243a.m39584a(this.f38244b, c9541g);
        }
    }

    @NotNull
    /* renamed from: a */
    public final FeedOverflowListener m39665a(@NotNull C9467d c9467d, @NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(c9467d, "presenter");
        C2668g.b(activityFeedViewModel, "viewModel");
        return new C11725a(c9467d, activityFeedViewModel);
    }
}
