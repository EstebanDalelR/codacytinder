package com.tinder.module;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.experiment.LoopsPhase1Experiment;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ct implements Factory<LoopsPhase1Experiment> {
    /* renamed from: a */
    private final bs f42886a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f42887b;

    public /* synthetic */ Object get() {
        return m52307a();
    }

    public ct(bs bsVar, Provider<AbTestUtility> provider) {
        this.f42886a = bsVar;
        this.f42887b = provider;
    }

    /* renamed from: a */
    public LoopsPhase1Experiment m52307a() {
        return m52305a(this.f42886a, this.f42887b);
    }

    /* renamed from: a */
    public static LoopsPhase1Experiment m52305a(bs bsVar, Provider<AbTestUtility> provider) {
        return m52304a(bsVar, (AbTestUtility) provider.get());
    }

    /* renamed from: b */
    public static ct m52306b(bs bsVar, Provider<AbTestUtility> provider) {
        return new ct(bsVar, provider);
    }

    /* renamed from: a */
    public static LoopsPhase1Experiment m52304a(bs bsVar, AbTestUtility abTestUtility) {
        return (LoopsPhase1Experiment) C15521i.a(bsVar.m40827b(abTestUtility), "Cannot return null from a non-@Nullable @Provides method");
    }
}
