package com.tinder.overflow.actionitem;

import com.tinder.overflow.p299a.C10017e;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.overflow.actionitem.n */
public final class C12238n implements MembersInjector<C12237m> {
    /* renamed from: a */
    private final Provider<C10017e> f39620a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48431a((C12237m) obj);
    }

    /* renamed from: a */
    public void m48431a(C12237m c12237m) {
        C12238n.m48430a(c12237m, (C10017e) this.f39620a.get());
    }

    /* renamed from: a */
    public static void m48430a(C12237m c12237m, C10017e c10017e) {
        c12237m.f39614a = c10017e;
    }
}
