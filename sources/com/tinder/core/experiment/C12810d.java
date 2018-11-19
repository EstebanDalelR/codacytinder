package com.tinder.core.experiment;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.core.experiment.d */
public final class C12810d implements Factory<C8592c> {
    /* renamed from: a */
    private final Provider<C2644k> f41212a;

    public /* synthetic */ Object get() {
        return m50321a();
    }

    public C12810d(Provider<C2644k> provider) {
        this.f41212a = provider;
    }

    /* renamed from: a */
    public C8592c m50321a() {
        return C12810d.m50319a(this.f41212a);
    }

    /* renamed from: a */
    public static C8592c m50319a(Provider<C2644k> provider) {
        return new C8592c((C2644k) provider.get());
    }

    /* renamed from: b */
    public static C12810d m50320b(Provider<C2644k> provider) {
        return new C12810d(provider);
    }
}
