package com.tinder.match.views;

import com.tinder.match.presenter.C9870k;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.match.views.i */
public final class C12109i implements MembersInjector<C12108h> {
    /* renamed from: a */
    private final Provider<C9870k> f39285a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48246a((C12108h) obj);
    }

    /* renamed from: a */
    public void m48246a(C12108h c12108h) {
        C12109i.m48245a(c12108h, (C9870k) this.f39285a.get());
    }

    /* renamed from: a */
    public static void m48245a(C12108h c12108h, C9870k c9870k) {
        c12108h.f39280b = c9870k;
    }
}
