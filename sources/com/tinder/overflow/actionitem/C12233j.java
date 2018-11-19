package com.tinder.overflow.actionitem;

import com.tinder.overflow.p299a.C10013a;
import com.tinder.profile.p363b.C16093z;
import com.tinder.profile.p363b.aj;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.overflow.actionitem.j */
public final class C12233j implements MembersInjector<C12231g> {
    /* renamed from: a */
    private final Provider<C10013a> f39600a;
    /* renamed from: b */
    private final Provider<C16093z> f39601b;
    /* renamed from: c */
    private final Provider<aj> f39602c;

    public /* synthetic */ void injectMembers(Object obj) {
        m48408a((C12231g) obj);
    }

    /* renamed from: a */
    public void m48408a(C12231g c12231g) {
        C12233j.m48405a(c12231g, (C10013a) this.f39600a.get());
        C12233j.m48407a(c12231g, (C16093z) this.f39601b.get());
        C12233j.m48406a(c12231g, (aj) this.f39602c.get());
    }

    /* renamed from: a */
    public static void m48405a(C12231g c12231g, C10013a c10013a) {
        c12231g.f39591a = c10013a;
    }

    /* renamed from: a */
    public static void m48407a(C12231g c12231g, C16093z c16093z) {
        c12231g.f39592b = c16093z;
    }

    /* renamed from: a */
    public static void m48406a(C12231g c12231g, aj ajVar) {
        c12231g.f39593c = ajVar;
    }
}
