package com.tinder.settings.p404b;

import com.tinder.managers.C2652a;
import com.tinder.managers.bj;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.b.c */
public final class C18059c implements Factory<C14865b> {
    /* renamed from: a */
    private final Provider<bj> f56089a;
    /* renamed from: b */
    private final Provider<C2652a> f56090b;

    public /* synthetic */ Object get() {
        return m65550a();
    }

    /* renamed from: a */
    public C14865b m65550a() {
        return C18059c.m65549a(this.f56089a, this.f56090b);
    }

    /* renamed from: a */
    public static C14865b m65549a(Provider<bj> provider, Provider<C2652a> provider2) {
        return new C14865b((bj) provider.get(), (C2652a) provider2.get());
    }

    /* renamed from: a */
    public static C14865b m65548a(bj bjVar, C2652a c2652a) {
        return new C14865b(bjVar, c2652a);
    }
}
