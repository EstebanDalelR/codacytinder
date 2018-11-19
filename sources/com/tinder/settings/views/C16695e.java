package com.tinder.settings.views;

import com.tinder.settings.presenter.bf;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.views.e */
public final class C16695e implements MembersInjector<SettingsPurchaseView> {
    /* renamed from: a */
    private final Provider<bf> f51666a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62187a((SettingsPurchaseView) obj);
    }

    /* renamed from: a */
    public void m62187a(SettingsPurchaseView settingsPurchaseView) {
        C16695e.m62186a(settingsPurchaseView, (bf) this.f51666a.get());
    }

    /* renamed from: a */
    public static void m62186a(SettingsPurchaseView settingsPurchaseView, bf bfVar) {
        settingsPurchaseView.f51634b = bfVar;
    }
}
