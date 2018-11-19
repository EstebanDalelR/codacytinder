package com.tinder.fastmatch;

import com.tinder.domain.fastmatch.RefreshNotifier;
import com.tinder.domain.fastmatch.newCount.NewCountFetcher;
import com.tinder.domain.fastmatch.repository.FastMatchRecsResponseRepository;
import com.tinder.domain.fastmatch.repository.NewCountRepository;
import com.tinder.fastmatch.newcount.C9381b;
import com.tinder.fastmatch.newcount.C9383e;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.fastmatch.e */
public final class C13191e implements Factory<C9383e> {
    /* renamed from: a */
    private final C9370a f41886a;
    /* renamed from: b */
    private final Provider<RefreshNotifier> f41887b;
    /* renamed from: c */
    private final Provider<FastMatchRecsResponseRepository> f41888c;
    /* renamed from: d */
    private final Provider<NewCountFetcher> f41889d;
    /* renamed from: e */
    private final Provider<C9381b> f41890e;
    /* renamed from: f */
    private final Provider<NewCountRepository> f41891f;

    public /* synthetic */ Object get() {
        return m51153a();
    }

    public C13191e(C9370a c9370a, Provider<RefreshNotifier> provider, Provider<FastMatchRecsResponseRepository> provider2, Provider<NewCountFetcher> provider3, Provider<C9381b> provider4, Provider<NewCountRepository> provider5) {
        this.f41886a = c9370a;
        this.f41887b = provider;
        this.f41888c = provider2;
        this.f41889d = provider3;
        this.f41890e = provider4;
        this.f41891f = provider5;
    }

    /* renamed from: a */
    public C9383e m51153a() {
        return C13191e.m51151a(this.f41886a, this.f41887b, this.f41888c, this.f41889d, this.f41890e, this.f41891f);
    }

    /* renamed from: a */
    public static C9383e m51151a(C9370a c9370a, Provider<RefreshNotifier> provider, Provider<FastMatchRecsResponseRepository> provider2, Provider<NewCountFetcher> provider3, Provider<C9381b> provider4, Provider<NewCountRepository> provider5) {
        return C13191e.m51150a(c9370a, (RefreshNotifier) provider.get(), (FastMatchRecsResponseRepository) provider2.get(), (NewCountFetcher) provider3.get(), (C9381b) provider4.get(), (NewCountRepository) provider5.get());
    }

    /* renamed from: b */
    public static C13191e m51152b(C9370a c9370a, Provider<RefreshNotifier> provider, Provider<FastMatchRecsResponseRepository> provider2, Provider<NewCountFetcher> provider3, Provider<C9381b> provider4, Provider<NewCountRepository> provider5) {
        return new C13191e(c9370a, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: a */
    public static C9383e m51150a(C9370a c9370a, RefreshNotifier refreshNotifier, FastMatchRecsResponseRepository fastMatchRecsResponseRepository, NewCountFetcher newCountFetcher, C9381b c9381b, NewCountRepository newCountRepository) {
        return (C9383e) C15521i.a(c9370a.m39226a(refreshNotifier, fastMatchRecsResponseRepository, newCountFetcher, c9381b, newCountRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
