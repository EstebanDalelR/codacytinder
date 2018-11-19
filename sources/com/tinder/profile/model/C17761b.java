package com.tinder.profile.model;

import android.content.res.Resources;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.utils.AgeCalculator;
import com.tinder.managers.bj;
import com.tinder.profile.model.Profile.C14418b;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.model.b */
public final class C17761b implements Factory<C14418b> {
    /* renamed from: a */
    private final Provider<Resources> f55417a;
    /* renamed from: b */
    private final Provider<bj> f55418b;
    /* renamed from: c */
    private final Provider<AgeCalculator> f55419c;
    /* renamed from: d */
    private final Provider<CurrentUserProvider> f55420d;

    public /* synthetic */ Object get() {
        return m64933a();
    }

    public C17761b(Provider<Resources> provider, Provider<bj> provider2, Provider<AgeCalculator> provider3, Provider<CurrentUserProvider> provider4) {
        this.f55417a = provider;
        this.f55418b = provider2;
        this.f55419c = provider3;
        this.f55420d = provider4;
    }

    /* renamed from: a */
    public C14418b m64933a() {
        return C17761b.m64931a(this.f55417a, this.f55418b, this.f55419c, this.f55420d);
    }

    /* renamed from: a */
    public static C14418b m64931a(Provider<Resources> provider, Provider<bj> provider2, Provider<AgeCalculator> provider3, Provider<CurrentUserProvider> provider4) {
        return new C14418b((Resources) provider.get(), (bj) provider2.get(), (AgeCalculator) provider3.get(), (CurrentUserProvider) provider4.get());
    }

    /* renamed from: b */
    public static C17761b m64932b(Provider<Resources> provider, Provider<bj> provider2, Provider<AgeCalculator> provider3, Provider<CurrentUserProvider> provider4) {
        return new C17761b(provider, provider2, provider3, provider4);
    }
}
