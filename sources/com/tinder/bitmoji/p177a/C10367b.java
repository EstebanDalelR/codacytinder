package com.tinder.bitmoji.p177a;

import com.tinder.bitmoji.presenter.C8330c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.bitmoji.a.b */
public final class C10367b implements MembersInjector<C10366a> {
    /* renamed from: a */
    private final Provider<C8330c> f33843a;

    public /* synthetic */ void injectMembers(Object obj) {
        m42199a((C10366a) obj);
    }

    /* renamed from: a */
    public void m42199a(C10366a c10366a) {
        C10367b.m42198a(c10366a, (C8330c) this.f33843a.get());
    }

    /* renamed from: a */
    public static void m42198a(C10366a c10366a, C8330c c8330c) {
        c10366a.f33841a = c8330c;
    }
}
