package com.tinder.module;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.model.ProfileV2Experiment;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class dk implements Factory<ProfileV2Experiment> {
    /* renamed from: a */
    private final bs f42921a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f42922b;

    public /* synthetic */ Object get() {
        return m52373a();
    }

    public dk(bs bsVar, Provider<AbTestUtility> provider) {
        this.f42921a = bsVar;
        this.f42922b = provider;
    }

    /* renamed from: a */
    public ProfileV2Experiment m52373a() {
        return m52371a(this.f42921a, this.f42922b);
    }

    /* renamed from: a */
    public static ProfileV2Experiment m52371a(bs bsVar, Provider<AbTestUtility> provider) {
        return m52370a(bsVar, (AbTestUtility) provider.get());
    }

    /* renamed from: b */
    public static dk m52372b(bs bsVar, Provider<AbTestUtility> provider) {
        return new dk(bsVar, provider);
    }

    /* renamed from: a */
    public static ProfileV2Experiment m52370a(bs bsVar, AbTestUtility abTestUtility) {
        return (ProfileV2Experiment) C15521i.a(bsVar.m40813a(abTestUtility), "Cannot return null from a non-@Nullable @Provides method");
    }
}
