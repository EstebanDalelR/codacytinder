package com.tinder.video.injection.p448a;

import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.video.injection.a.f */
public final class C18295f implements Factory<TrackSelector> {
    /* renamed from: a */
    private final C15414a f56641a;
    /* renamed from: b */
    private final Provider<TrackSelection.Factory> f56642b;

    public /* synthetic */ Object get() {
        return m66256a();
    }

    public C18295f(C15414a c15414a, Provider<TrackSelection.Factory> provider) {
        this.f56641a = c15414a;
        this.f56642b = provider;
    }

    /* renamed from: a */
    public TrackSelector m66256a() {
        return C18295f.m66254a(this.f56641a, this.f56642b);
    }

    /* renamed from: a */
    public static TrackSelector m66254a(C15414a c15414a, Provider<TrackSelection.Factory> provider) {
        return C18295f.m66253a(c15414a, (TrackSelection.Factory) provider.get());
    }

    /* renamed from: b */
    public static C18295f m66255b(C15414a c15414a, Provider<TrackSelection.Factory> provider) {
        return new C18295f(c15414a, provider);
    }

    /* renamed from: a */
    public static TrackSelector m66253a(C15414a c15414a, TrackSelection.Factory factory) {
        return (TrackSelector) C15521i.m58001a(c15414a.m57795a(factory), "Cannot return null from a non-@Nullable @Provides method");
    }
}
