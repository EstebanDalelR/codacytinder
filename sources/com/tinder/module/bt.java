package com.tinder.module;

import com.tinder.domain.places.provider.PlacesOnboardingProgressProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class bt implements Factory<PlacesOnboardingProgressProvider> {
    /* renamed from: a */
    private final bs f42829a;

    public /* synthetic */ Object get() {
        return m52200a();
    }

    public bt(bs bsVar) {
        this.f42829a = bsVar;
    }

    /* renamed from: a */
    public PlacesOnboardingProgressProvider m52200a() {
        return m52197a(this.f42829a);
    }

    /* renamed from: a */
    public static PlacesOnboardingProgressProvider m52197a(bs bsVar) {
        return m52199c(bsVar);
    }

    /* renamed from: b */
    public static bt m52198b(bs bsVar) {
        return new bt(bsVar);
    }

    /* renamed from: c */
    public static PlacesOnboardingProgressProvider m52199c(bs bsVar) {
        return (PlacesOnboardingProgressProvider) C15521i.a(bsVar.m40851n(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
