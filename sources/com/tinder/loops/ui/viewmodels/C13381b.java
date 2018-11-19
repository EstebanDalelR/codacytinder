package com.tinder.loops.ui.viewmodels;

import com.tinder.loops.data.CroppingRectangleRepository;
import com.tinder.loops.domain.repository.ExtractedFrameRepository;
import com.tinder.loops.engine.creation.LoopsCreator;
import com.tinder.rx.RxSchedulerProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.ui.viewmodels.b */
public final class C13381b implements Factory<VideoCreationViewModel> {
    /* renamed from: a */
    private final Provider<LoopsCreator> f42426a;
    /* renamed from: b */
    private final Provider<ExtractedFrameRepository> f42427b;
    /* renamed from: c */
    private final Provider<RxSchedulerProvider> f42428c;
    /* renamed from: d */
    private final Provider<CroppingRectangleRepository> f42429d;

    public /* synthetic */ Object get() {
        return m51769a();
    }

    public C13381b(Provider<LoopsCreator> provider, Provider<ExtractedFrameRepository> provider2, Provider<RxSchedulerProvider> provider3, Provider<CroppingRectangleRepository> provider4) {
        this.f42426a = provider;
        this.f42427b = provider2;
        this.f42428c = provider3;
        this.f42429d = provider4;
    }

    /* renamed from: a */
    public VideoCreationViewModel m51769a() {
        return C13381b.m51767a(this.f42426a, this.f42427b, this.f42428c, this.f42429d);
    }

    /* renamed from: a */
    public static VideoCreationViewModel m51767a(Provider<LoopsCreator> provider, Provider<ExtractedFrameRepository> provider2, Provider<RxSchedulerProvider> provider3, Provider<CroppingRectangleRepository> provider4) {
        return new VideoCreationViewModel((LoopsCreator) provider.get(), (ExtractedFrameRepository) provider2.get(), (RxSchedulerProvider) provider3.get(), (CroppingRectangleRepository) provider4.get());
    }

    /* renamed from: b */
    public static C13381b m51768b(Provider<LoopsCreator> provider, Provider<ExtractedFrameRepository> provider2, Provider<RxSchedulerProvider> provider3, Provider<CroppingRectangleRepository> provider4) {
        return new C13381b(provider, provider2, provider3, provider4);
    }
}
