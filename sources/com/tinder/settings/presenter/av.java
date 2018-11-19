package com.tinder.settings.presenter;

import com.tinder.settings.targets.SettingsTarget;
import rx.functions.Action1;

final /* synthetic */ class av implements Action1 {
    /* renamed from: a */
    static final Action1 f58426a = new av();

    private av() {
    }

    public void call(Object obj) {
        ((SettingsTarget) obj).onDiscoveryPrefUpdateFailed();
    }
}
