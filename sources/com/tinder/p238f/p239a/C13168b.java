package com.tinder.p238f.p239a;

import com.tinder.analytics.C2634g;
import com.tinder.auth.interactor.C8279j;
import com.tinder.bitmoji.C10376d;
import com.tinder.bitmoji.C10377f;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.managers.bk;
import com.tinder.tinderplus.p428a.C15193i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.f.a.b */
public final class C13168b implements Factory<C9363a> {
    /* renamed from: a */
    private final Provider<C15193i> f41826a;
    /* renamed from: b */
    private final Provider<bk> f41827b;
    /* renamed from: c */
    private final Provider<C2634g> f41828c;
    /* renamed from: d */
    private final Provider<FastMatchConfigProvider> f41829d;
    /* renamed from: e */
    private final Provider<FastMatchStatusProvider> f41830e;
    /* renamed from: f */
    private final Provider<TopPicksConfig> f41831f;
    /* renamed from: g */
    private final Provider<C8279j> f41832g;
    /* renamed from: h */
    private final Provider<C10376d> f41833h;
    /* renamed from: i */
    private final Provider<C10377f> f41834i;

    public /* synthetic */ Object get() {
        return m51091a();
    }

    public C13168b(Provider<C15193i> provider, Provider<bk> provider2, Provider<C2634g> provider3, Provider<FastMatchConfigProvider> provider4, Provider<FastMatchStatusProvider> provider5, Provider<TopPicksConfig> provider6, Provider<C8279j> provider7, Provider<C10376d> provider8, Provider<C10377f> provider9) {
        this.f41826a = provider;
        this.f41827b = provider2;
        this.f41828c = provider3;
        this.f41829d = provider4;
        this.f41830e = provider5;
        this.f41831f = provider6;
        this.f41832g = provider7;
        this.f41833h = provider8;
        this.f41834i = provider9;
    }

    /* renamed from: a */
    public C9363a m51091a() {
        return C13168b.m51089a(this.f41826a, this.f41827b, this.f41828c, this.f41829d, this.f41830e, this.f41831f, this.f41832g, this.f41833h, this.f41834i);
    }

    /* renamed from: a */
    public static C9363a m51089a(Provider<C15193i> provider, Provider<bk> provider2, Provider<C2634g> provider3, Provider<FastMatchConfigProvider> provider4, Provider<FastMatchStatusProvider> provider5, Provider<TopPicksConfig> provider6, Provider<C8279j> provider7, Provider<C10376d> provider8, Provider<C10377f> provider9) {
        return new C9363a((C15193i) provider.get(), (bk) provider2.get(), (C2634g) provider3.get(), (FastMatchConfigProvider) provider4.get(), (FastMatchStatusProvider) provider5.get(), (TopPicksConfig) provider6.get(), (C8279j) provider7.get(), (C10376d) provider8.get(), (C10377f) provider9.get());
    }

    /* renamed from: b */
    public static C13168b m51090b(Provider<C15193i> provider, Provider<bk> provider2, Provider<C2634g> provider3, Provider<FastMatchConfigProvider> provider4, Provider<FastMatchStatusProvider> provider5, Provider<TopPicksConfig> provider6, Provider<C8279j> provider7, Provider<C10376d> provider8, Provider<C10377f> provider9) {
        return new C13168b(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }
}
