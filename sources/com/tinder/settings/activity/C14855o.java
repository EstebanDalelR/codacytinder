package com.tinder.settings.activity;

import com.tinder.passport.model.PassportLocation;

/* renamed from: com.tinder.settings.activity.o */
final /* synthetic */ class C14855o implements Runnable {
    /* renamed from: a */
    private final SettingsActivity f46488a;
    /* renamed from: b */
    private final PassportLocation f46489b;

    C14855o(SettingsActivity settingsActivity, PassportLocation passportLocation) {
        this.f46488a = settingsActivity;
        this.f46489b = passportLocation;
    }

    public void run() {
        this.f46488a.m68714a(this.f46489b);
    }
}
