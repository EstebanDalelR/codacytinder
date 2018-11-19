package com.tinder.settings.feed.view;

import com.tinder.domain.settings.feed.model.FeedSharingOption;
import com.tinder.settings.feed.view.FeedSharingOptionItemView.OnFeedSharingOptionChangedListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/settings/feed/view/FeedSettingsView$3", "Lcom/tinder/settings/feed/view/FeedSharingOptionItemView$OnFeedSharingOptionChangedListener;", "(Lcom/tinder/settings/feed/view/FeedSettingsView;)V", "onSharingOptionChanged", "", "feedSharingOption", "Lcom/tinder/domain/settings/feed/model/FeedSharingOption;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedSettingsView$3 implements OnFeedSharingOptionChangedListener {
    /* renamed from: a */
    final /* synthetic */ FeedSettingsView f51510a;

    FeedSettingsView$3(FeedSettingsView feedSettingsView) {
        this.f51510a = feedSettingsView;
    }

    public void onSharingOptionChanged(@NotNull FeedSharingOption feedSharingOption) {
        C2668g.b(feedSharingOption, "feedSharingOption");
        this.f51510a.getController().m56295a(feedSharingOption);
    }
}
