package com.tinder.intro;

import com.facebook.CallbackManager;
import com.tinder.managers.LegacyBreadCrumbTracker;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.intro.a */
public final class C11873a implements MembersInjector<IntroFragment> {
    /* renamed from: a */
    private final Provider<LegacyBreadCrumbTracker> f38712a;
    /* renamed from: b */
    private final Provider<C13345b> f38713b;
    /* renamed from: c */
    private final Provider<CallbackManager> f38714c;

    public /* synthetic */ void injectMembers(Object obj) {
        m47844a((IntroFragment) obj);
    }

    /* renamed from: a */
    public void m47844a(IntroFragment introFragment) {
        C11873a.m47843a(introFragment, (LegacyBreadCrumbTracker) this.f38712a.get());
        C11873a.m47842a(introFragment, (C13345b) this.f38713b.get());
        C11873a.m47841a(introFragment, (CallbackManager) this.f38714c.get());
    }

    /* renamed from: a */
    public static void m47843a(IntroFragment introFragment, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        introFragment.f42329a = legacyBreadCrumbTracker;
    }

    /* renamed from: a */
    public static void m47842a(IntroFragment introFragment, C13345b c13345b) {
        introFragment.f42330b = c13345b;
    }

    /* renamed from: a */
    public static void m47841a(IntroFragment introFragment, CallbackManager callbackManager) {
        introFragment.f42331c = callbackManager;
    }
}
