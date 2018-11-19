package com.tinder.core.experiment;

import com.tinder.common.provider.C2643c;
import com.tinder.common.provider.C8550g;
import com.tinder.core.experiment.AuthExperiment.AuthExperimentTimelineProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.core.experiment.e */
public final class C12811e<VARIANT> implements Factory<AuthExperiment<VARIANT>> {
    /* renamed from: a */
    private final Provider<AuthExperimentTimelineProvider> f41213a;
    /* renamed from: b */
    private final Provider<AuthExperimentDetailsProvider<VARIANT>> f41214b;
    /* renamed from: c */
    private final Provider<C2643c> f41215c;
    /* renamed from: d */
    private final Provider<C8550g> f41216d;
    /* renamed from: e */
    private final Provider<C8593g<VARIANT>> f41217e;

    public /* synthetic */ Object get() {
        return m50324a();
    }

    public C12811e(Provider<AuthExperimentTimelineProvider> provider, Provider<AuthExperimentDetailsProvider<VARIANT>> provider2, Provider<C2643c> provider3, Provider<C8550g> provider4, Provider<C8593g<VARIANT>> provider5) {
        this.f41213a = provider;
        this.f41214b = provider2;
        this.f41215c = provider3;
        this.f41216d = provider4;
        this.f41217e = provider5;
    }

    /* renamed from: a */
    public AuthExperiment<VARIANT> m50324a() {
        return C12811e.m50322a(this.f41213a, this.f41214b, this.f41215c, this.f41216d, this.f41217e);
    }

    /* renamed from: a */
    public static <VARIANT> AuthExperiment<VARIANT> m50322a(Provider<AuthExperimentTimelineProvider> provider, Provider<AuthExperimentDetailsProvider<VARIANT>> provider2, Provider<C2643c> provider3, Provider<C8550g> provider4, Provider<C8593g<VARIANT>> provider5) {
        return new AuthExperiment((AuthExperimentTimelineProvider) provider.get(), (AuthExperimentDetailsProvider) provider2.get(), (C2643c) provider3.get(), (C8550g) provider4.get(), (C8593g) provider5.get());
    }

    /* renamed from: b */
    public static <VARIANT> C12811e<VARIANT> m50323b(Provider<AuthExperimentTimelineProvider> provider, Provider<AuthExperimentDetailsProvider<VARIANT>> provider2, Provider<C2643c> provider3, Provider<C8550g> provider4, Provider<C8593g<VARIANT>> provider5) {
        return new C12811e(provider, provider2, provider3, provider4, provider5);
    }
}
