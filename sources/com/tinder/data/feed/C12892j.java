package com.tinder.data.feed;

import android.content.SharedPreferences;
import com.tinder.common.logger.Logger;
import com.tinder.domain.feed.FeedCarouselItemSelectedRepository;
import com.tinder.domain.feed.FeedRangeRepository;
import com.tinder.domain.match.provider.UnMatchProvider;
import com.tinder.domain.tracker.ListItemViewDurationRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.feed.j */
public final class C12892j implements Factory<C10778h> {
    /* renamed from: a */
    private final Provider<FeedApiClient> f41347a;
    /* renamed from: b */
    private final Provider<FeedCarouselItemSelectedRepository> f41348b;
    /* renamed from: c */
    private final Provider<ListItemViewDurationRepository> f41349c;
    /* renamed from: d */
    private final Provider<FeedRangeRepository> f41350d;
    /* renamed from: e */
    private final Provider<SharedPreferences> f41351e;
    /* renamed from: f */
    private final Provider<UnMatchProvider> f41352f;
    /* renamed from: g */
    private final Provider<C8660k> f41353g;
    /* renamed from: h */
    private final Provider<Logger> f41354h;

    public /* synthetic */ Object get() {
        return m50541a();
    }

    public C12892j(Provider<FeedApiClient> provider, Provider<FeedCarouselItemSelectedRepository> provider2, Provider<ListItemViewDurationRepository> provider3, Provider<FeedRangeRepository> provider4, Provider<SharedPreferences> provider5, Provider<UnMatchProvider> provider6, Provider<C8660k> provider7, Provider<Logger> provider8) {
        this.f41347a = provider;
        this.f41348b = provider2;
        this.f41349c = provider3;
        this.f41350d = provider4;
        this.f41351e = provider5;
        this.f41352f = provider6;
        this.f41353g = provider7;
        this.f41354h = provider8;
    }

    /* renamed from: a */
    public C10778h m50541a() {
        return C12892j.m50539a(this.f41347a, this.f41348b, this.f41349c, this.f41350d, this.f41351e, this.f41352f, this.f41353g, this.f41354h);
    }

    /* renamed from: a */
    public static C10778h m50539a(Provider<FeedApiClient> provider, Provider<FeedCarouselItemSelectedRepository> provider2, Provider<ListItemViewDurationRepository> provider3, Provider<FeedRangeRepository> provider4, Provider<SharedPreferences> provider5, Provider<UnMatchProvider> provider6, Provider<C8660k> provider7, Provider<Logger> provider8) {
        return new C10778h((FeedApiClient) provider.get(), (FeedCarouselItemSelectedRepository) provider2.get(), (ListItemViewDurationRepository) provider3.get(), (FeedRangeRepository) provider4.get(), (SharedPreferences) provider5.get(), (UnMatchProvider) provider6.get(), (C8660k) provider7.get(), (Logger) provider8.get());
    }

    /* renamed from: b */
    public static C12892j m50540b(Provider<FeedApiClient> provider, Provider<FeedCarouselItemSelectedRepository> provider2, Provider<ListItemViewDurationRepository> provider3, Provider<FeedRangeRepository> provider4, Provider<SharedPreferences> provider5, Provider<UnMatchProvider> provider6, Provider<C8660k> provider7, Provider<Logger> provider8) {
        return new C12892j(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }
}
