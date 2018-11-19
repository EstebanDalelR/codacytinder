package com.tinder.match.presenter;

import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.match.usecase.GetNewMatches;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.match.provider.MatchesSearchQueryProvider;
import com.tinder.match.viewmodel.C9891i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class af implements Factory<C13431s> {
    /* renamed from: a */
    private final Provider<GetNewMatches> f42584a;
    /* renamed from: b */
    private final Provider<MatchesSearchQueryProvider> f42585b;
    /* renamed from: c */
    private final Provider<C9891i> f42586c;
    /* renamed from: d */
    private final Provider<FastMatchConfigProvider> f42587d;
    /* renamed from: e */
    private final Provider<FastMatchStatusProvider> f42588e;
    /* renamed from: f */
    private final Provider<SubscriptionProvider> f42589f;

    public /* synthetic */ Object get() {
        return m51903a();
    }

    public af(Provider<GetNewMatches> provider, Provider<MatchesSearchQueryProvider> provider2, Provider<C9891i> provider3, Provider<FastMatchConfigProvider> provider4, Provider<FastMatchStatusProvider> provider5, Provider<SubscriptionProvider> provider6) {
        this.f42584a = provider;
        this.f42585b = provider2;
        this.f42586c = provider3;
        this.f42587d = provider4;
        this.f42588e = provider5;
        this.f42589f = provider6;
    }

    /* renamed from: a */
    public C13431s m51903a() {
        return m51901a(this.f42584a, this.f42585b, this.f42586c, this.f42587d, this.f42588e, this.f42589f);
    }

    /* renamed from: a */
    public static C13431s m51901a(Provider<GetNewMatches> provider, Provider<MatchesSearchQueryProvider> provider2, Provider<C9891i> provider3, Provider<FastMatchConfigProvider> provider4, Provider<FastMatchStatusProvider> provider5, Provider<SubscriptionProvider> provider6) {
        return new C13431s((GetNewMatches) provider.get(), (MatchesSearchQueryProvider) provider2.get(), (C9891i) provider3.get(), (FastMatchConfigProvider) provider4.get(), (FastMatchStatusProvider) provider5.get(), (SubscriptionProvider) provider6.get());
    }

    /* renamed from: b */
    public static af m51902b(Provider<GetNewMatches> provider, Provider<MatchesSearchQueryProvider> provider2, Provider<C9891i> provider3, Provider<FastMatchConfigProvider> provider4, Provider<FastMatchStatusProvider> provider5, Provider<SubscriptionProvider> provider6) {
        return new af(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
