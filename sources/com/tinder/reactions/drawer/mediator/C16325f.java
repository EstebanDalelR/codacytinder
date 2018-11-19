package com.tinder.reactions.drawer.mediator;

import com.tinder.reactions.drawer.p391b.C14624a;
import com.tinder.reactions.drawer.provider.C14639g;
import com.tinder.reactions.drawer.provider.C16327e;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.drawer.mediator.f */
public final class C16325f implements MembersInjector<C16324e> {
    /* renamed from: a */
    private final Provider<C14639g> f50797a;
    /* renamed from: b */
    private final Provider<C16327e> f50798b;
    /* renamed from: c */
    private final Provider<C14624a> f50799c;

    public /* synthetic */ void injectMembers(Object obj) {
        m61592a((C16324e) obj);
    }

    /* renamed from: a */
    public void m61592a(C16324e c16324e) {
        C16325f.m61591a(c16324e, (C14639g) this.f50797a.get());
        C16325f.m61590a(c16324e, (C16327e) this.f50798b.get());
        C16325f.m61589a(c16324e, (C14624a) this.f50799c.get());
    }

    /* renamed from: a */
    public static void m61591a(C16324e c16324e, C14639g c14639g) {
        c16324e.f50775b = c14639g;
    }

    /* renamed from: a */
    public static void m61590a(C16324e c16324e, C16327e c16327e) {
        c16324e.f50776c = c16327e;
    }

    /* renamed from: a */
    public static void m61589a(C16324e c16324e, C14624a c14624a) {
        c16324e.f50777d = c14624a;
    }
}
