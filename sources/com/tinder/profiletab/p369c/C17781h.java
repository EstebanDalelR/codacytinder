package com.tinder.profiletab.p369c;

import com.tinder.domain.profile.experiment.MaxPhotoExperiment;
import com.tinder.domain.profile.usecase.ObserveProfilePhotos;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profiletab.c.h */
public final class C17781h implements Factory<C16178g> {
    /* renamed from: a */
    private final Provider<ObserveProfilePhotos> f55481a;
    /* renamed from: b */
    private final Provider<MaxPhotoExperiment> f55482b;

    public /* synthetic */ Object get() {
        return m64981a();
    }

    public C17781h(Provider<ObserveProfilePhotos> provider, Provider<MaxPhotoExperiment> provider2) {
        this.f55481a = provider;
        this.f55482b = provider2;
    }

    /* renamed from: a */
    public C16178g m64981a() {
        return C17781h.m64979a(this.f55481a, this.f55482b);
    }

    /* renamed from: a */
    public static C16178g m64979a(Provider<ObserveProfilePhotos> provider, Provider<MaxPhotoExperiment> provider2) {
        return new C16178g((ObserveProfilePhotos) provider.get(), (MaxPhotoExperiment) provider2.get());
    }

    /* renamed from: b */
    public static C17781h m64980b(Provider<ObserveProfilePhotos> provider, Provider<MaxPhotoExperiment> provider2) {
        return new C17781h(provider, provider2);
    }
}
