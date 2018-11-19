package com.tinder.loops.data;

import com.tinder.loops.engine.extraction.VideoFrameExtractor;
import com.tinder.loops.engine.extraction.retriever.VideoMetaExtractor;
import com.tinder.rx.RxSchedulerProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.data.d */
public final class C13354d implements Factory<C11930c> {
    /* renamed from: a */
    private final Provider<VideoFrameExtractor> f42357a;
    /* renamed from: b */
    private final Provider<VideoMetaExtractor> f42358b;
    /* renamed from: c */
    private final Provider<RxSchedulerProvider> f42359c;

    public /* synthetic */ Object get() {
        return m51663a();
    }

    public C13354d(Provider<VideoFrameExtractor> provider, Provider<VideoMetaExtractor> provider2, Provider<RxSchedulerProvider> provider3) {
        this.f42357a = provider;
        this.f42358b = provider2;
        this.f42359c = provider3;
    }

    /* renamed from: a */
    public C11930c m51663a() {
        return C13354d.m51661a(this.f42357a, this.f42358b, this.f42359c);
    }

    /* renamed from: a */
    public static C11930c m51661a(Provider<VideoFrameExtractor> provider, Provider<VideoMetaExtractor> provider2, Provider<RxSchedulerProvider> provider3) {
        return new C11930c((VideoFrameExtractor) provider.get(), (VideoMetaExtractor) provider2.get(), (RxSchedulerProvider) provider3.get());
    }

    /* renamed from: b */
    public static C13354d m51662b(Provider<VideoFrameExtractor> provider, Provider<VideoMetaExtractor> provider2, Provider<RxSchedulerProvider> provider3) {
        return new C13354d(provider, provider2, provider3);
    }
}
