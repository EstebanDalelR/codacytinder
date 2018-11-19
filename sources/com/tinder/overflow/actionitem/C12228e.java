package com.tinder.overflow.actionitem;

import com.tinder.chat.activity.C8406b;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.overflow.actionitem.e */
public final class C12228e implements MembersInjector<C12227d> {
    /* renamed from: a */
    private final Provider<C8406b> f39587a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48391a((C12227d) obj);
    }

    /* renamed from: a */
    public void m48391a(C12227d c12227d) {
        C12228e.m48390a(c12227d, (C8406b) this.f39587a.get());
    }

    /* renamed from: a */
    public static void m48390a(C12227d c12227d, C8406b c8406b) {
        c12227d.f39585a = c8406b;
    }
}
