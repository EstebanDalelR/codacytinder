package com.tinder.p238f.p243e;

import com.tinder.common.logger.Logger;
import com.tinder.managers.ManagerProfile;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.f.e.d */
public final class C13173d implements Factory<C11602c> {
    /* renamed from: a */
    private final Provider<ManagerProfile> f41849a;
    /* renamed from: b */
    private final Provider<Logger> f41850b;

    public /* synthetic */ Object get() {
        return m51103a();
    }

    public C13173d(Provider<ManagerProfile> provider, Provider<Logger> provider2) {
        this.f41849a = provider;
        this.f41850b = provider2;
    }

    /* renamed from: a */
    public C11602c m51103a() {
        return C13173d.m51101a(this.f41849a, this.f41850b);
    }

    /* renamed from: a */
    public static C11602c m51101a(Provider<ManagerProfile> provider, Provider<Logger> provider2) {
        return new C11602c((ManagerProfile) provider.get(), (Logger) provider2.get());
    }

    /* renamed from: b */
    public static C13173d m51102b(Provider<ManagerProfile> provider, Provider<Logger> provider2) {
        return new C13173d(provider, provider2);
    }
}
