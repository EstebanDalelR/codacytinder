package com.tinder.video.injection.p448a;

import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.video.injection.a.e */
public final class C18294e implements Factory<TrackSelection.Factory> {
    /* renamed from: a */
    private final C15414a f56639a;
    /* renamed from: b */
    private final Provider<BandwidthMeter> f56640b;

    public /* synthetic */ Object get() {
        return m66252a();
    }

    public C18294e(C15414a c15414a, Provider<BandwidthMeter> provider) {
        this.f56639a = c15414a;
        this.f56640b = provider;
    }

    /* renamed from: a */
    public TrackSelection.Factory m66252a() {
        return C18294e.m66250a(this.f56639a, this.f56640b);
    }

    /* renamed from: a */
    public static TrackSelection.Factory m66250a(C15414a c15414a, Provider<BandwidthMeter> provider) {
        return C18294e.m66249a(c15414a, (BandwidthMeter) provider.get());
    }

    /* renamed from: b */
    public static C18294e m66251b(C15414a c15414a, Provider<BandwidthMeter> provider) {
        return new C18294e(c15414a, provider);
    }

    /* renamed from: a */
    public static TrackSelection.Factory m66249a(C15414a c15414a, BandwidthMeter bandwidthMeter) {
        return (TrackSelection.Factory) C15521i.m58001a(c15414a.m57794a(bandwidthMeter), "Cannot return null from a non-@Nullable @Provides method");
    }
}
