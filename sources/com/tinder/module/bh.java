package com.tinder.module;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.deeplink.DeepLinkedSharedRecInterceptor;
import com.tinder.deeplink.p229b.C8819a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bh implements Factory<DeepLinkedSharedRecInterceptor> {
    /* renamed from: a */
    private final bg f42808a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f42809b;
    /* renamed from: c */
    private final Provider<C8819a> f42810c;

    public /* synthetic */ Object get() {
        return m52166a();
    }

    public bh(bg bgVar, Provider<AbTestUtility> provider, Provider<C8819a> provider2) {
        this.f42808a = bgVar;
        this.f42809b = provider;
        this.f42810c = provider2;
    }

    /* renamed from: a */
    public DeepLinkedSharedRecInterceptor m52166a() {
        return m52164a(this.f42808a, this.f42809b, this.f42810c);
    }

    /* renamed from: a */
    public static DeepLinkedSharedRecInterceptor m52164a(bg bgVar, Provider<AbTestUtility> provider, Provider<C8819a> provider2) {
        return m52163a(bgVar, (AbTestUtility) provider.get(), (C8819a) provider2.get());
    }

    /* renamed from: b */
    public static bh m52165b(bg bgVar, Provider<AbTestUtility> provider, Provider<C8819a> provider2) {
        return new bh(bgVar, provider, provider2);
    }

    /* renamed from: a */
    public static DeepLinkedSharedRecInterceptor m52163a(bg bgVar, AbTestUtility abTestUtility, C8819a c8819a) {
        return (DeepLinkedSharedRecInterceptor) C15521i.a(bgVar.m40790a(abTestUtility, c8819a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
