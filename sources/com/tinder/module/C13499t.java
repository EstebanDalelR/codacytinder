package com.tinder.module;

import com.tinder.addy.source.nativedfp.NativeDfpLoader.PublisherAdRequestFactory;
import com.tinder.ads.DfpPublisherAdRequestFactory;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.module.t */
public final class C13499t implements Factory<PublisherAdRequestFactory> {
    /* renamed from: a */
    private final C9940d f43074a;
    /* renamed from: b */
    private final Provider<DfpPublisherAdRequestFactory> f43075b;

    public /* synthetic */ Object get() {
        return m52587a();
    }

    public C13499t(C9940d c9940d, Provider<DfpPublisherAdRequestFactory> provider) {
        this.f43074a = c9940d;
        this.f43075b = provider;
    }

    /* renamed from: a */
    public PublisherAdRequestFactory m52587a() {
        return C13499t.m52585a(this.f43074a, this.f43075b);
    }

    /* renamed from: a */
    public static PublisherAdRequestFactory m52585a(C9940d c9940d, Provider<DfpPublisherAdRequestFactory> provider) {
        return C13499t.m52584a(c9940d, (DfpPublisherAdRequestFactory) provider.get());
    }

    /* renamed from: b */
    public static C13499t m52586b(C9940d c9940d, Provider<DfpPublisherAdRequestFactory> provider) {
        return new C13499t(c9940d, provider);
    }

    /* renamed from: a */
    public static PublisherAdRequestFactory m52584a(C9940d c9940d, DfpPublisherAdRequestFactory dfpPublisherAdRequestFactory) {
        return (PublisherAdRequestFactory) C15521i.a(c9940d.m40856a(dfpPublisherAdRequestFactory), "Cannot return null from a non-@Nullable @Provides method");
    }
}
