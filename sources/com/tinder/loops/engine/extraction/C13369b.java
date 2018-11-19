package com.tinder.loops.engine.extraction;

import com.tinder.loops.engine.extraction.decoder.VideoDecoder;
import com.tinder.loops.engine.extraction.decoder.filter.DecodedFrameFilter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.engine.extraction.b */
public final class C13369b implements Factory<C11939a> {
    /* renamed from: a */
    private final Provider<VideoDecoder> f42381a;
    /* renamed from: b */
    private final Provider<DecodedFrameFilter> f42382b;

    public /* synthetic */ Object get() {
        return m51711a();
    }

    public C13369b(Provider<VideoDecoder> provider, Provider<DecodedFrameFilter> provider2) {
        this.f42381a = provider;
        this.f42382b = provider2;
    }

    /* renamed from: a */
    public C11939a m51711a() {
        return C13369b.m51709a(this.f42381a, this.f42382b);
    }

    /* renamed from: a */
    public static C11939a m51709a(Provider<VideoDecoder> provider, Provider<DecodedFrameFilter> provider2) {
        return new C11939a((VideoDecoder) provider.get(), (DecodedFrameFilter) provider2.get());
    }

    /* renamed from: b */
    public static C13369b m51710b(Provider<VideoDecoder> provider, Provider<DecodedFrameFilter> provider2) {
        return new C13369b(provider, provider2);
    }
}
