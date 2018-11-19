package com.tinder.settings.presenter;

import com.tinder.settings.targets.SettingsTarget;
import rx.functions.Action1;

final /* synthetic */ class aw implements Action1 {
    /* renamed from: a */
    static final Action1 f58427a = new aw();

    private aw() {
    }

    public void call(Object obj) {
        ((SettingsTarget) obj).onDiscoveryPrefsUpdated();
    }
}
