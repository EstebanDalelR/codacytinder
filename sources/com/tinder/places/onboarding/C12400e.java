package com.tinder.places.onboarding;

import com.tinder.places.onboarding.presenter.C10265a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.onboarding.e */
public final class C12400e implements MembersInjector<C12399d> {
    /* renamed from: a */
    private final Provider<C10265a> f40042a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48826a((C12399d) obj);
    }

    /* renamed from: a */
    public void m48826a(C12399d c12399d) {
        C12400e.m48825a(c12399d, (C10265a) this.f40042a.get());
    }

    /* renamed from: a */
    public static void m48825a(C12399d c12399d, C10265a c10265a) {
        c12399d.f40038a = c10265a;
    }
}
