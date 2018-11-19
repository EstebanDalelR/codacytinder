package com.tinder.auth.view;

import com.tinder.auth.p100a.C4304a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.view.a */
public final class C10357a implements MembersInjector<LoginButtonGroupView> {
    /* renamed from: a */
    private final Provider<C4304a> f33799a;

    public /* synthetic */ void injectMembers(Object obj) {
        m42168a((LoginButtonGroupView) obj);
    }

    /* renamed from: a */
    public void m42168a(LoginButtonGroupView loginButtonGroupView) {
        C10357a.m42167a(loginButtonGroupView, (C4304a) this.f33799a.get());
    }

    /* renamed from: a */
    public static void m42167a(LoginButtonGroupView loginButtonGroupView, C4304a c4304a) {
        loginButtonGroupView.f33786a = c4304a;
    }
}
