package com.tinder.loops.ui.viewmodels;

import com.tinder.loops.domain.repository.VideoFrameRepository;
import com.tinder.rx.RxSchedulerProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.ui.viewmodels.f */
public final class C13384f implements Factory<VideoFrameViewModel> {
    /* renamed from: a */
    private final Provider<VideoFrameRepository> f42434a;
    /* renamed from: b */
    private final Provider<RxSchedulerProvider> f42435b;

    public /* synthetic */ Object get() {
        return m51778a();
    }

    public C13384f(Provider<VideoFrameRepository> provider, Provider<RxSchedulerProvider> provider2) {
        this.f42434a = provider;
        this.f42435b = provider2;
    }

    /* renamed from: a */
    public VideoFrameViewModel m51778a() {
        return C13384f.m51776a(this.f42434a, this.f42435b);
    }

    /* renamed from: a */
    public static VideoFrameViewModel m51776a(Provider<VideoFrameRepository> provider, Provider<RxSchedulerProvider> provider2) {
        return new VideoFrameViewModel((VideoFrameRepository) provider.get(), (RxSchedulerProvider) provider2.get());
    }

    /* renamed from: b */
    public static C13384f m51777b(Provider<VideoFrameRepository> provider, Provider<RxSchedulerProvider> provider2) {
        return new C13384f(provider, provider2);
    }
}
