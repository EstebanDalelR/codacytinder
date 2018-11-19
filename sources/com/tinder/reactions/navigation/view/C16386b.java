package com.tinder.reactions.navigation.view;

import com.tinder.reactions.navigation.p398c.C14687e;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.navigation.view.b */
public final class C16386b implements MembersInjector<GrandGestureNavigationView> {
    /* renamed from: a */
    private final Provider<C14687e> f50938a;

    public /* synthetic */ void injectMembers(Object obj) {
        m61765a((GrandGestureNavigationView) obj);
    }

    /* renamed from: a */
    public void m61765a(GrandGestureNavigationView grandGestureNavigationView) {
        C16386b.m61764a(grandGestureNavigationView, (C14687e) this.f50938a.get());
    }

    /* renamed from: a */
    public static void m61764a(GrandGestureNavigationView grandGestureNavigationView, C14687e c14687e) {
        grandGestureNavigationView.f46278a = c14687e;
    }
}
