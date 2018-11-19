package com.tinder.data.meta.p226a;

import com.tinder.data.adapter.C10738l;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.meta.a.l */
public final class C12970l implements Factory<C10848k> {
    /* renamed from: a */
    private final Provider<C10738l> f41534a;

    public /* synthetic */ Object get() {
        return m50718a();
    }

    public C12970l(Provider<C10738l> provider) {
        this.f41534a = provider;
    }

    /* renamed from: a */
    public C10848k m50718a() {
        return C12970l.m50716a(this.f41534a);
    }

    /* renamed from: a */
    public static C10848k m50716a(Provider<C10738l> provider) {
        return new C10848k((C10738l) provider.get());
    }

    /* renamed from: b */
    public static C12970l m50717b(Provider<C10738l> provider) {
        return new C12970l(provider);
    }
}
