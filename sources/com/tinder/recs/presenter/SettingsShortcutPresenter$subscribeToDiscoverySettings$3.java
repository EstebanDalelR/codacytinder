package com.tinder.recs.presenter;

import io.reactivex.functions.Action;
import kotlin.Metadata;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
final class SettingsShortcutPresenter$subscribeToDiscoverySettings$3 implements Action {
    final /* synthetic */ SettingsShortcutPresenter this$0;

    SettingsShortcutPresenter$subscribeToDiscoverySettings$3(SettingsShortcutPresenter settingsShortcutPresenter) {
        this.this$0 = settingsShortcutPresenter;
    }

    public final void run() {
        this.this$0.getTarget$Tinder_release().showSuccessfulUpdatedProfile();
        C0001a.b("Successfully subscribed to discovery settings from Shortcut", new Object[0]);
    }
}
