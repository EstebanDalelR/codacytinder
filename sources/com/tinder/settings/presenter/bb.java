package com.tinder.settings.presenter;

import com.tinder.settings.targets.SettingsTarget;
import rx.functions.Action1;

final /* synthetic */ class bb implements Action1 {
    /* renamed from: a */
    static final Action1 f58431a = new bb();

    private bb() {
    }

    public void call(Object obj) {
        ((SettingsTarget) obj).hideGroupsViews();
    }
}
