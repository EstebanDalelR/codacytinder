package com.tinder.settings.presenter;

import com.tinder.settings.targets.SettingsTarget;
import rx.functions.Action1;

final /* synthetic */ class bd implements Action1 {
    /* renamed from: a */
    private final String f58433a;

    bd(String str) {
        this.f58433a = str;
    }

    public void call(Object obj) {
        ((SettingsTarget) obj).showFAQScreen(this.f58433a);
    }
}
