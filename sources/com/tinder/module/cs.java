package com.tinder.module;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.SaveLikeStatus;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cs implements Factory<LikeStatusProvider> {
    /* renamed from: a */
    private final bs f42882a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f42883b;
    /* renamed from: c */
    private final Provider<LoadProfileOptionData> f42884c;
    /* renamed from: d */
    private final Provider<SaveLikeStatus> f42885d;

    public /* synthetic */ Object get() {
        return m52303a();
    }

    public cs(bs bsVar, Provider<AbTestUtility> provider, Provider<LoadProfileOptionData> provider2, Provider<SaveLikeStatus> provider3) {
        this.f42882a = bsVar;
        this.f42883b = provider;
        this.f42884c = provider2;
        this.f42885d = provider3;
    }

    /* renamed from: a */
    public LikeStatusProvider m52303a() {
        return m52301a(this.f42882a, this.f42883b, this.f42884c, this.f42885d);
    }

    /* renamed from: a */
    public static LikeStatusProvider m52301a(bs bsVar, Provider<AbTestUtility> provider, Provider<LoadProfileOptionData> provider2, Provider<SaveLikeStatus> provider3) {
        return m52300a(bsVar, (AbTestUtility) provider.get(), (LoadProfileOptionData) provider2.get(), (SaveLikeStatus) provider3.get());
    }

    /* renamed from: b */
    public static cs m52302b(bs bsVar, Provider<AbTestUtility> provider, Provider<LoadProfileOptionData> provider2, Provider<SaveLikeStatus> provider3) {
        return new cs(bsVar, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static LikeStatusProvider m52300a(bs bsVar, AbTestUtility abTestUtility, LoadProfileOptionData loadProfileOptionData, SaveLikeStatus saveLikeStatus) {
        return (LikeStatusProvider) C15521i.a(bsVar.m40822a(abTestUtility, loadProfileOptionData, saveLikeStatus), "Cannot return null from a non-@Nullable @Provides method");
    }
}
