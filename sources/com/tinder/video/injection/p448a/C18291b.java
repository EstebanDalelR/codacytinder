package com.tinder.video.injection.p448a;

import com.google.android.exoplayer2.upstream.BandwidthMeter;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.video.injection.a.b */
public final class C18291b implements Factory<BandwidthMeter> {
    /* renamed from: a */
    private final C15414a f56635a;

    public /* synthetic */ Object get() {
        return m66240a();
    }

    public C18291b(C15414a c15414a) {
        this.f56635a = c15414a;
    }

    /* renamed from: a */
    public BandwidthMeter m66240a() {
        return C18291b.m66237a(this.f56635a);
    }

    /* renamed from: a */
    public static BandwidthMeter m66237a(C15414a c15414a) {
        return C18291b.m66239c(c15414a);
    }

    /* renamed from: b */
    public static C18291b m66238b(C15414a c15414a) {
        return new C18291b(c15414a);
    }

    /* renamed from: c */
    public static BandwidthMeter m66239c(C15414a c15414a) {
        return (BandwidthMeter) C15521i.m58001a(c15414a.m57796a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
