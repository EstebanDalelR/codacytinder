package com.tinder.settings.module;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.settings.analytics.TrackExitSurveyEvent;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.module.b */
public final class C18073b implements Factory<TrackExitSurveyEvent> {
    /* renamed from: a */
    private final C2656a f56118a;
    /* renamed from: b */
    private final Provider<C2630h> f56119b;

    public /* synthetic */ Object get() {
        return m65584a();
    }

    public C18073b(C2656a c2656a, Provider<C2630h> provider) {
        this.f56118a = c2656a;
        this.f56119b = provider;
    }

    /* renamed from: a */
    public TrackExitSurveyEvent m65584a() {
        return C18073b.m65582a(this.f56118a, this.f56119b);
    }

    /* renamed from: a */
    public static TrackExitSurveyEvent m65582a(C2656a c2656a, Provider<C2630h> provider) {
        return C18073b.m65581a(c2656a, (C2630h) provider.get());
    }

    /* renamed from: b */
    public static C18073b m65583b(C2656a c2656a, Provider<C2630h> provider) {
        return new C18073b(c2656a, provider);
    }

    /* renamed from: a */
    public static TrackExitSurveyEvent m65581a(C2656a c2656a, C2630h c2630h) {
        return (TrackExitSurveyEvent) C15521i.m58001a(c2656a.a(c2630h), "Cannot return null from a non-@Nullable @Provides method");
    }
}
