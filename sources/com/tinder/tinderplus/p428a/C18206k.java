package com.tinder.tinderplus.p428a;

import com.tinder.data.purchase.p091a.C10985c;
import com.tinder.data.purchase.p091a.C3927e;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.tinderplus.provider.C15220b;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.tinderplus.a.k */
public final class C18206k implements Factory<C15193i> {
    /* renamed from: a */
    private final Provider<C15220b> f56443a;
    /* renamed from: b */
    private final Provider<LikeStatusProvider> f56444b;
    /* renamed from: c */
    private final Provider<SubscriptionProvider> f56445c;
    /* renamed from: d */
    private final Provider<C10985c> f56446d;
    /* renamed from: e */
    private final Provider<C3927e> f56447e;

    public /* synthetic */ Object get() {
        return m66006a();
    }

    public C18206k(Provider<C15220b> provider, Provider<LikeStatusProvider> provider2, Provider<SubscriptionProvider> provider3, Provider<C10985c> provider4, Provider<C3927e> provider5) {
        this.f56443a = provider;
        this.f56444b = provider2;
        this.f56445c = provider3;
        this.f56446d = provider4;
        this.f56447e = provider5;
    }

    /* renamed from: a */
    public C15193i m66006a() {
        return C18206k.m66004a(this.f56443a, this.f56444b, this.f56445c, this.f56446d, this.f56447e);
    }

    /* renamed from: a */
    public static C15193i m66004a(Provider<C15220b> provider, Provider<LikeStatusProvider> provider2, Provider<SubscriptionProvider> provider3, Provider<C10985c> provider4, Provider<C3927e> provider5) {
        return new C15193i((C15220b) provider.get(), (LikeStatusProvider) provider2.get(), (SubscriptionProvider) provider3.get(), (C10985c) provider4.get(), (C3927e) provider5.get());
    }

    /* renamed from: b */
    public static C18206k m66005b(Provider<C15220b> provider, Provider<LikeStatusProvider> provider2, Provider<SubscriptionProvider> provider3, Provider<C10985c> provider4, Provider<C3927e> provider5) {
        return new C18206k(provider, provider2, provider3, provider4, provider5);
    }
}
