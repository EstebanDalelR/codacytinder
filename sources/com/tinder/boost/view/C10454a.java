package com.tinder.boost.view;

import com.tinder.boost.presenter.C8346a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.boost.view.a */
public final class C10454a implements MembersInjector<BoostButtonView> {
    /* renamed from: a */
    private final Provider<C8346a> f34051a;

    public /* synthetic */ void injectMembers(Object obj) {
        m42314a((BoostButtonView) obj);
    }

    /* renamed from: a */
    public void m42314a(BoostButtonView boostButtonView) {
        C10454a.m42313a(boostButtonView, (C8346a) this.f34051a.get());
    }

    /* renamed from: a */
    public static void m42313a(BoostButtonView boostButtonView, C8346a c8346a) {
        boostButtonView.f12229a = c8346a;
    }
}
