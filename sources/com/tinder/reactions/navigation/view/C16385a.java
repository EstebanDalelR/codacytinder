package com.tinder.reactions.navigation.view;

import com.tinder.reactions.navigation.p397b.C16369a;
import com.tinder.reactions.navigation.p399d.C14688a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.navigation.view.a */
public final class C16385a implements MembersInjector<GestureNavigationLoadingView> {
    /* renamed from: a */
    private final Provider<C14688a> f50936a;
    /* renamed from: b */
    private final Provider<C16369a> f50937b;

    public /* synthetic */ void injectMembers(Object obj) {
        m61763a((GestureNavigationLoadingView) obj);
    }

    /* renamed from: a */
    public void m61763a(GestureNavigationLoadingView gestureNavigationLoadingView) {
        C16385a.m61762a(gestureNavigationLoadingView, (C14688a) this.f50936a.get());
        C16385a.m61761a(gestureNavigationLoadingView, (C16369a) this.f50937b.get());
    }

    /* renamed from: a */
    public static void m61762a(GestureNavigationLoadingView gestureNavigationLoadingView, C14688a c14688a) {
        gestureNavigationLoadingView.f46275a = c14688a;
    }

    /* renamed from: a */
    public static void m61761a(GestureNavigationLoadingView gestureNavigationLoadingView, C16369a c16369a) {
        gestureNavigationLoadingView.f46276b = c16369a;
    }
}
