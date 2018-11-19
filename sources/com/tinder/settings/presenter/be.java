package com.tinder.settings.presenter;

import com.tinder.settings.targets.SettingsTarget;
import rx.functions.Action1;

final /* synthetic */ class be implements Action1 {
    /* renamed from: a */
    static final Action1 f58434a = new be();

    private be() {
    }

    public void call(Object obj) {
        ((SettingsTarget) obj).showNetworkFailureMessage();
    }
}
