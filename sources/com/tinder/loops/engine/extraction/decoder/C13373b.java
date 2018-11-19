package com.tinder.loops.engine.extraction.decoder;

import com.tinder.loops.engine.extraction.extractor.DecoderMediaExtractor;
import com.tinder.loops.engine.extraction.p279a.C9790a;
import com.tinder.loops.engine.extraction.p282d.C9800a;
import com.tinder.loops.engine.extraction.p283e.C9803a;
import com.tinder.loops.engine.extraction.retriever.VideoMetaExtractor;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.engine.extraction.decoder.b */
public final class C13373b implements Factory<C11944a> {
    /* renamed from: a */
    private final Provider<C9803a> f42387a;
    /* renamed from: b */
    private final Provider<DecoderMediaExtractor> f42388b;
    /* renamed from: c */
    private final Provider<VideoMetaExtractor> f42389c;
    /* renamed from: d */
    private final Provider<C9790a> f42390d;
    /* renamed from: e */
    private final Provider<C9800a> f42391e;

    public /* synthetic */ Object get() {
        return m51723a();
    }

    public C13373b(Provider<C9803a> provider, Provider<DecoderMediaExtractor> provider2, Provider<VideoMetaExtractor> provider3, Provider<C9790a> provider4, Provider<C9800a> provider5) {
        this.f42387a = provider;
        this.f42388b = provider2;
        this.f42389c = provider3;
        this.f42390d = provider4;
        this.f42391e = provider5;
    }

    /* renamed from: a */
    public C11944a m51723a() {
        return C13373b.m51721a(this.f42387a, this.f42388b, this.f42389c, this.f42390d, this.f42391e);
    }

    /* renamed from: a */
    public static C11944a m51721a(Provider<C9803a> provider, Provider<DecoderMediaExtractor> provider2, Provider<VideoMetaExtractor> provider3, Provider<C9790a> provider4, Provider<C9800a> provider5) {
        return new C11944a((C9803a) provider.get(), (DecoderMediaExtractor) provider2.get(), (VideoMetaExtractor) provider3.get(), (C9790a) provider4.get(), (C9800a) provider5.get());
    }

    /* renamed from: b */
    public static C13373b m51722b(Provider<C9803a> provider, Provider<DecoderMediaExtractor> provider2, Provider<VideoMetaExtractor> provider3, Provider<C9790a> provider4, Provider<C9800a> provider5) {
        return new C13373b(provider, provider2, provider3, provider4, provider5);
    }
}
