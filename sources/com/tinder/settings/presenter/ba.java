package com.tinder.settings.presenter;

import com.tinder.settings.targets.SettingsTarget;
import rx.functions.Action1;

final /* synthetic */ class ba implements Action1 {
    /* renamed from: a */
    static final Action1 f58430a = new ba();

    private ba() {
    }

    public void call(Object obj) {
        ((SettingsTarget) obj).launchActivityExitSurvey();
    }
}
