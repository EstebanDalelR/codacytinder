package com.tinder.settings.loops.p407a;

import com.tinder.domain.loops.usecase.UpdateAutoPlayLoopsSettingsOption;
import com.tinder.domain.settings.loops.repository.AutoPlayVideoSettingsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.loops.a.b */
public final class C18072b implements Factory<C14883a> {
    /* renamed from: a */
    private final Provider<AutoPlayVideoSettingsRepository> f56116a;
    /* renamed from: b */
    private final Provider<UpdateAutoPlayLoopsSettingsOption> f56117b;

    public /* synthetic */ Object get() {
        return m65580a();
    }

    public C18072b(Provider<AutoPlayVideoSettingsRepository> provider, Provider<UpdateAutoPlayLoopsSettingsOption> provider2) {
        this.f56116a = provider;
        this.f56117b = provider2;
    }

    /* renamed from: a */
    public C14883a m65580a() {
        return C18072b.m65578a(this.f56116a, this.f56117b);
    }

    /* renamed from: a */
    public static C14883a m65578a(Provider<AutoPlayVideoSettingsRepository> provider, Provider<UpdateAutoPlayLoopsSettingsOption> provider2) {
        return new C14883a((AutoPlayVideoSettingsRepository) provider.get(), (UpdateAutoPlayLoopsSettingsOption) provider2.get());
    }

    /* renamed from: b */
    public static C18072b m65579b(Provider<AutoPlayVideoSettingsRepository> provider, Provider<UpdateAutoPlayLoopsSettingsOption> provider2) {
        return new C18072b(provider, provider2);
    }
}
