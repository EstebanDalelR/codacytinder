package com.tinder.module;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.ads.V1BrandedProfileCardMatchInsertionRule.MessageAdMatchFactory;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.match.aj;
import com.tinder.domain.match.usecase.CreateMessageAdMatch;
import com.tinder.recsads.rule.BrandedProfileCardMatchInsertionRule;
import com.tinder.recsads.rule.C18793c.C14761a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.module.k */
public final class C13490k implements Factory<BrandedProfileCardMatchInsertionRule> {
    /* renamed from: a */
    private final C9940d f43048a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f43049b;
    /* renamed from: c */
    private final Provider<CreateMessageAdMatch> f43050c;
    /* renamed from: d */
    private final Provider<C14761a> f43051d;
    /* renamed from: e */
    private final Provider<MessageAdMatchFactory> f43052e;
    /* renamed from: f */
    private final Provider<aj> f43053f;
    /* renamed from: g */
    private final Provider<AdUrlTracker> f43054g;

    public /* synthetic */ Object get() {
        return m52552a();
    }

    public C13490k(C9940d c9940d, Provider<AbTestUtility> provider, Provider<CreateMessageAdMatch> provider2, Provider<C14761a> provider3, Provider<MessageAdMatchFactory> provider4, Provider<aj> provider5, Provider<AdUrlTracker> provider6) {
        this.f43048a = c9940d;
        this.f43049b = provider;
        this.f43050c = provider2;
        this.f43051d = provider3;
        this.f43052e = provider4;
        this.f43053f = provider5;
        this.f43054g = provider6;
    }

    /* renamed from: a */
    public BrandedProfileCardMatchInsertionRule m52552a() {
        return C13490k.m52550a(this.f43048a, this.f43049b, this.f43050c, this.f43051d, this.f43052e, this.f43053f, this.f43054g);
    }

    /* renamed from: a */
    public static BrandedProfileCardMatchInsertionRule m52550a(C9940d c9940d, Provider<AbTestUtility> provider, Provider<CreateMessageAdMatch> provider2, Provider<C14761a> provider3, Provider<MessageAdMatchFactory> provider4, Provider<aj> provider5, Provider<AdUrlTracker> provider6) {
        return C13490k.m52549a(c9940d, (AbTestUtility) provider.get(), (CreateMessageAdMatch) provider2.get(), (C14761a) provider3.get(), (MessageAdMatchFactory) provider4.get(), (aj) provider5.get(), (AdUrlTracker) provider6.get());
    }

    /* renamed from: b */
    public static C13490k m52551b(C9940d c9940d, Provider<AbTestUtility> provider, Provider<CreateMessageAdMatch> provider2, Provider<C14761a> provider3, Provider<MessageAdMatchFactory> provider4, Provider<aj> provider5, Provider<AdUrlTracker> provider6) {
        return new C13490k(c9940d, provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: a */
    public static BrandedProfileCardMatchInsertionRule m52549a(C9940d c9940d, AbTestUtility abTestUtility, CreateMessageAdMatch createMessageAdMatch, C14761a c14761a, MessageAdMatchFactory messageAdMatchFactory, aj ajVar, AdUrlTracker adUrlTracker) {
        return (BrandedProfileCardMatchInsertionRule) C15521i.a(c9940d.m40865a(abTestUtility, createMessageAdMatch, c14761a, messageAdMatchFactory, ajVar, adUrlTracker), "Cannot return null from a non-@Nullable @Provides method");
    }
}
