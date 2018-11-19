package com.tinder.application;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.core.experiment.AuthExperiment;
import com.tinder.core.experiment.C8592c;
import com.tinder.core.experiment.CanIGetYoEmailExperimentProvider.Variant;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.application.d */
public final class C12556d implements Factory<AbTestUtility> {
    /* renamed from: a */
    private final Provider<C8592c> f40584a;
    /* renamed from: b */
    private final Provider<AuthExperiment<Variant>> f40585b;

    public /* synthetic */ Object get() {
        return m49630a();
    }

    public C12556d(Provider<C8592c> provider, Provider<AuthExperiment<Variant>> provider2) {
        this.f40584a = provider;
        this.f40585b = provider2;
    }

    /* renamed from: a */
    public AbTestUtility m49630a() {
        return C12556d.m49628a(this.f40584a, this.f40585b);
    }

    /* renamed from: a */
    public static AbTestUtility m49628a(Provider<C8592c> provider, Provider<AuthExperiment<Variant>> provider2) {
        return C12556d.m49627a((C8592c) provider.get(), (AuthExperiment) provider2.get());
    }

    /* renamed from: b */
    public static C12556d m49629b(Provider<C8592c> provider, Provider<AuthExperiment<Variant>> provider2) {
        return new C12556d(provider, provider2);
    }

    /* renamed from: a */
    public static AbTestUtility m49627a(C8592c c8592c, AuthExperiment<Variant> authExperiment) {
        return (AbTestUtility) C15521i.a(C8256b.m35241a(c8592c, authExperiment), "Cannot return null from a non-@Nullable @Provides method");
    }
}
