package com.tinder.module;

import com.tinder.domain.profile.experiment.LoopsPhase1Experiment;
import com.tinder.domain.profile.experiment.MaxPhotoExperiment;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cv implements Factory<MaxPhotoExperiment> {
    /* renamed from: a */
    private final bs f42889a;
    /* renamed from: b */
    private final Provider<LoopsPhase1Experiment> f42890b;

    public /* synthetic */ Object get() {
        return m52315a();
    }

    public cv(bs bsVar, Provider<LoopsPhase1Experiment> provider) {
        this.f42889a = bsVar;
        this.f42890b = provider;
    }

    /* renamed from: a */
    public MaxPhotoExperiment m52315a() {
        return m52313a(this.f42889a, this.f42890b);
    }

    /* renamed from: a */
    public static MaxPhotoExperiment m52313a(bs bsVar, Provider<LoopsPhase1Experiment> provider) {
        return m52312a(bsVar, (LoopsPhase1Experiment) provider.get());
    }

    /* renamed from: b */
    public static cv m52314b(bs bsVar, Provider<LoopsPhase1Experiment> provider) {
        return new cv(bsVar, provider);
    }

    /* renamed from: a */
    public static MaxPhotoExperiment m52312a(bs bsVar, LoopsPhase1Experiment loopsPhase1Experiment) {
        return (MaxPhotoExperiment) C15521i.a(bsVar.m40812a(loopsPhase1Experiment), "Cannot return null from a non-@Nullable @Provides method");
    }
}
