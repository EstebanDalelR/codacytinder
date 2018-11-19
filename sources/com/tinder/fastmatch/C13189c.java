package com.tinder.fastmatch;

import com.tinder.api.TinderApi;
import com.tinder.data.fastmatch.p324a.C10767b;
import com.tinder.domain.fastmatch.newCount.NewCountFetcher;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.fastmatch.c */
public final class C13189c implements Factory<NewCountFetcher> {
    /* renamed from: a */
    private final C9370a f41881a;
    /* renamed from: b */
    private final Provider<TinderApi> f41882b;
    /* renamed from: c */
    private final Provider<C10767b> f41883c;
    /* renamed from: d */
    private final Provider<FastMatchConfigProvider> f41884d;

    public /* synthetic */ Object get() {
        return m51145a();
    }

    public C13189c(C9370a c9370a, Provider<TinderApi> provider, Provider<C10767b> provider2, Provider<FastMatchConfigProvider> provider3) {
        this.f41881a = c9370a;
        this.f41882b = provider;
        this.f41883c = provider2;
        this.f41884d = provider3;
    }

    /* renamed from: a */
    public NewCountFetcher m51145a() {
        return C13189c.m51143a(this.f41881a, this.f41882b, this.f41883c, this.f41884d);
    }

    /* renamed from: a */
    public static NewCountFetcher m51143a(C9370a c9370a, Provider<TinderApi> provider, Provider<C10767b> provider2, Provider<FastMatchConfigProvider> provider3) {
        return C13189c.m51142a(c9370a, (TinderApi) provider.get(), (C10767b) provider2.get(), (FastMatchConfigProvider) provider3.get());
    }

    /* renamed from: b */
    public static C13189c m51144b(C9370a c9370a, Provider<TinderApi> provider, Provider<C10767b> provider2, Provider<FastMatchConfigProvider> provider3) {
        return new C13189c(c9370a, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static NewCountFetcher m51142a(C9370a c9370a, TinderApi tinderApi, C10767b c10767b, FastMatchConfigProvider fastMatchConfigProvider) {
        return (NewCountFetcher) C15521i.a(c9370a.m39224a(tinderApi, c10767b, fastMatchConfigProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
