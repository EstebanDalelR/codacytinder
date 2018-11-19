package com.tinder.settings.feed.view;

import com.tinder.settings.views.SwitchRowView$CheckStatusListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/tinder/settings/feed/view/FeedSettingsView$2", "Lcom/tinder/settings/views/SwitchRowView$CheckStatusListener;", "(Lcom/tinder/settings/feed/view/FeedSettingsView;)V", "onChecked", "", "onUnChecked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedSettingsView$2 implements SwitchRowView$CheckStatusListener {
    /* renamed from: a */
    final /* synthetic */ FeedSettingsView f51509a;

    FeedSettingsView$2(FeedSettingsView feedSettingsView) {
        this.f51509a = feedSettingsView;
    }

    public void onChecked() {
        this.f51509a.getController().m56294a();
    }

    public void onUnChecked() {
        this.f51509a.getController().m56296b();
    }
}
