package com.tinder.overflow.actionitem;

import com.tinder.overflow.p299a.C10015c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.overflow.actionitem.l */
public final class C12235l implements MembersInjector<C12234k> {
    /* renamed from: a */
    private final Provider<C10015c> f39612a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48421a((C12234k) obj);
    }

    /* renamed from: a */
    public void m48421a(C12234k c12234k) {
        C12235l.m48420a(c12234k, (C10015c) this.f39612a.get());
    }

    /* renamed from: a */
    public static void m48420a(C12234k c12234k, C10015c c10015c) {
        c12234k.f39604b = c10015c;
    }
}
