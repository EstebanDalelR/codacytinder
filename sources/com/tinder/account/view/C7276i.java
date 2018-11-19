package com.tinder.account.view;

import com.tinder.account.p072a.ad;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.account.view.i */
public final class C7276i implements MembersInjector<UpdatePasswordView> {
    /* renamed from: a */
    private final Provider<ad> f26189a;

    public /* synthetic */ void injectMembers(Object obj) {
        m31102a((UpdatePasswordView) obj);
    }

    /* renamed from: a */
    public void m31102a(UpdatePasswordView updatePasswordView) {
        C7276i.m31101a(updatePasswordView, (ad) this.f26189a.get());
    }

    /* renamed from: a */
    public static void m31101a(UpdatePasswordView updatePasswordView, ad adVar) {
        updatePasswordView.f26182a = adVar;
    }
}
