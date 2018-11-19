package com.tinder.module;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.experiment.NewPhotoGridExperiment;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cz implements Factory<NewPhotoGridExperiment> {
    /* renamed from: a */
    private final bs f42900a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f42901b;

    public /* synthetic */ Object get() {
        return m52329a();
    }

    /* renamed from: a */
    public NewPhotoGridExperiment m52329a() {
        return m52328a(this.f42900a, this.f42901b);
    }

    /* renamed from: a */
    public static NewPhotoGridExperiment m52328a(bs bsVar, Provider<AbTestUtility> provider) {
        return m52327a(bsVar, (AbTestUtility) provider.get());
    }

    /* renamed from: a */
    public static NewPhotoGridExperiment m52327a(bs bsVar, AbTestUtility abTestUtility) {
        return (NewPhotoGridExperiment) C15521i.a(bsVar.m40832c(abTestUtility), "Cannot return null from a non-@Nullable @Provides method");
    }
}
