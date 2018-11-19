package com.tinder.profile.view;

import com.tinder.profiletab.presenter.C14474d;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.view.j */
public final class C16158j implements MembersInjector<ControllaView> {
    /* renamed from: a */
    private final Provider<C14474d> f50331a;

    public /* synthetic */ void injectMembers(Object obj) {
        m61072a((ControllaView) obj);
    }

    /* renamed from: a */
    public void m61072a(ControllaView controllaView) {
        C16158j.m61071a(controllaView, (C14474d) this.f50331a.get());
    }

    /* renamed from: a */
    public static void m61071a(ControllaView controllaView, C14474d c14474d) {
        controllaView.f50211a = c14474d;
    }
}
