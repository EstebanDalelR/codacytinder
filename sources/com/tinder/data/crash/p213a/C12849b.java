package com.tinder.data.crash.p213a;

import com.tinder.data.crash.p214b.C8638a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.crash.a.b */
public final class C12849b implements Factory<C10762a> {
    /* renamed from: a */
    private final Provider<C8638a> f41286a;

    public /* synthetic */ Object get() {
        return m50461a();
    }

    public C12849b(Provider<C8638a> provider) {
        this.f41286a = provider;
    }

    /* renamed from: a */
    public C10762a m50461a() {
        return C12849b.m50459a(this.f41286a);
    }

    /* renamed from: a */
    public static C10762a m50459a(Provider<C8638a> provider) {
        return new C10762a((C8638a) provider.get());
    }

    /* renamed from: b */
    public static C12849b m50460b(Provider<C8638a> provider) {
        return new C12849b(provider);
    }
}
