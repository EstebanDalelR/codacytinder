package com.tinder.messageads.p295b;

import com.tinder.messageads.p294a.C9898a;
import com.tinder.messageads.p298e.C9910c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.messageads.b.b */
public final class C12121b implements MembersInjector<C13471a> {
    /* renamed from: a */
    private final Provider<C9910c> f39342a;
    /* renamed from: b */
    private final Provider<C9898a> f39343b;

    public /* synthetic */ void injectMembers(Object obj) {
        m48262a((C13471a) obj);
    }

    /* renamed from: a */
    public void m48262a(C13471a c13471a) {
        C12121b.m48261a(c13471a, (C9910c) this.f39342a.get());
        C12121b.m48260a(c13471a, (C9898a) this.f39343b.get());
    }

    /* renamed from: a */
    public static void m48261a(C13471a c13471a, C9910c c9910c) {
        c13471a.f42731a = c9910c;
    }

    /* renamed from: a */
    public static void m48260a(C13471a c13471a, C9898a c9898a) {
        c13471a.f42732b = c9898a;
    }
}
