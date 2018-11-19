package com.tinder.loops.ui.viewmodels;

import com.tinder.loops.domain.repository.ExtractedFrameRepository;
import com.tinder.loops.engine.extraction.VideoFrameExtractor;
import com.tinder.rx.RxSchedulerProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.ui.viewmodels.e */
public final class C13383e implements Factory<VideoExtractorViewModel> {
    /* renamed from: a */
    private final Provider<VideoFrameExtractor> f42431a;
    /* renamed from: b */
    private final Provider<ExtractedFrameRepository> f42432b;
    /* renamed from: c */
    private final Provider<RxSchedulerProvider> f42433c;

    public /* synthetic */ Object get() {
        return m51775a();
    }

    public C13383e(Provider<VideoFrameExtractor> provider, Provider<ExtractedFrameRepository> provider2, Provider<RxSchedulerProvider> provider3) {
        this.f42431a = provider;
        this.f42432b = provider2;
        this.f42433c = provider3;
    }

    /* renamed from: a */
    public VideoExtractorViewModel m51775a() {
        return C13383e.m51773a(this.f42431a, this.f42432b, this.f42433c);
    }

    /* renamed from: a */
    public static VideoExtractorViewModel m51773a(Provider<VideoFrameExtractor> provider, Provider<ExtractedFrameRepository> provider2, Provider<RxSchedulerProvider> provider3) {
        return new VideoExtractorViewModel((VideoFrameExtractor) provider.get(), (ExtractedFrameRepository) provider2.get(), (RxSchedulerProvider) provider3.get());
    }

    /* renamed from: b */
    public static C13383e m51774b(Provider<VideoFrameExtractor> provider, Provider<ExtractedFrameRepository> provider2, Provider<RxSchedulerProvider> provider3) {
        return new C13383e(provider, provider2, provider3);
    }
}
