package com.tinder.settings.loops.view;

import com.tinder.settings.loops.p407a.C14885d;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.loops.view.a */
public final class C16649a implements MembersInjector<AutoPlayVideoSettingsView> {
    /* renamed from: a */
    private final Provider<C14885d> f51549a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62113a((AutoPlayVideoSettingsView) obj);
    }

    /* renamed from: a */
    public void m62113a(AutoPlayVideoSettingsView autoPlayVideoSettingsView) {
        C16649a.m62112a(autoPlayVideoSettingsView, (C14885d) this.f51549a.get());
    }

    /* renamed from: a */
    public static void m62112a(AutoPlayVideoSettingsView autoPlayVideoSettingsView, C14885d c14885d) {
        autoPlayVideoSettingsView.f51548a = c14885d;
    }
}
