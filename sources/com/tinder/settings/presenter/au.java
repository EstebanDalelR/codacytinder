package com.tinder.settings.presenter;

import com.tinder.settings.targets.SettingsTarget;
import rx.functions.Action1;

final /* synthetic */ class au implements Action1 {
    /* renamed from: a */
    static final Action1 f58425a = new au();

    private au() {
    }

    public void call(Object obj) {
        ((SettingsTarget) obj).hideProgressDialog();
    }
}
