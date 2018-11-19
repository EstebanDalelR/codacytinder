package com.tinder.app.dagger.module.p163e;

import com.tinder.data.adapter.ah;
import com.tinder.data.adapter.ap;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.e.h */
public final class C12491h implements Factory<ap> {
    /* renamed from: a */
    private final Provider<ah> f40274a;

    public /* synthetic */ Object get() {
        return m49137a();
    }

    public C12491h(Provider<ah> provider) {
        this.f40274a = provider;
    }

    /* renamed from: a */
    public ap m49137a() {
        return C12491h.m49135a(this.f40274a);
    }

    /* renamed from: a */
    public static ap m49135a(Provider<ah> provider) {
        return C12491h.m49134a((ah) provider.get());
    }

    /* renamed from: b */
    public static C12491h m49136b(Provider<ah> provider) {
        return new C12491h(provider);
    }

    /* renamed from: a */
    public static ap m49134a(ah ahVar) {
        return (ap) C15521i.a(C8248a.m35183a(ahVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
