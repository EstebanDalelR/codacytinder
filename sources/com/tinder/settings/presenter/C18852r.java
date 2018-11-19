package com.tinder.settings.presenter;

import com.tinder.settings.targets.SettingsTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.settings.presenter.r */
final /* synthetic */ class C18852r implements Action1 {
    /* renamed from: a */
    private final SettingsTarget f58439a;

    private C18852r(SettingsTarget settingsTarget) {
        this.f58439a = settingsTarget;
    }

    /* renamed from: a */
    static Action1 m67301a(SettingsTarget settingsTarget) {
        return new C18852r(settingsTarget);
    }

    public void call(Object obj) {
        this.f58439a.showPlacesOptions((Boolean) obj);
    }
}
