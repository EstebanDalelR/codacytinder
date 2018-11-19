package com.tinder.auth.accountkit;

import com.tinder.auth.interactor.C10333h;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.accountkit.h */
public final class C10328h implements MembersInjector<LoginAccountKitUiManager> {
    /* renamed from: a */
    private final Provider<C10333h> f33734a;

    public /* synthetic */ void injectMembers(Object obj) {
        m42108a((LoginAccountKitUiManager) obj);
    }

    /* renamed from: a */
    public void m42108a(LoginAccountKitUiManager loginAccountKitUiManager) {
        C10328h.m42107a(loginAccountKitUiManager, (C10333h) this.f33734a.get());
    }

    /* renamed from: a */
    public static void m42107a(LoginAccountKitUiManager loginAccountKitUiManager, C10333h c10333h) {
        loginAccountKitUiManager.authAnalyticsInteractor = c10333h;
    }
}
