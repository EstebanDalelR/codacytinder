package com.tinder.module;

import android.content.Context;
import com.tinder.deeplink.DeepLinkedSharedRecInterceptor;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.ManagerProfile;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bi implements Factory<ManagerDeepLinking> {
    /* renamed from: a */
    private final bg f42811a;
    /* renamed from: b */
    private final Provider<ManagerProfile> f42812b;
    /* renamed from: c */
    private final Provider<ManagerAnalytics> f42813c;
    /* renamed from: d */
    private final Provider<Context> f42814d;
    /* renamed from: e */
    private final Provider<DeepLinkedSharedRecInterceptor> f42815e;

    public /* synthetic */ Object get() {
        return m52170a();
    }

    public bi(bg bgVar, Provider<ManagerProfile> provider, Provider<ManagerAnalytics> provider2, Provider<Context> provider3, Provider<DeepLinkedSharedRecInterceptor> provider4) {
        this.f42811a = bgVar;
        this.f42812b = provider;
        this.f42813c = provider2;
        this.f42814d = provider3;
        this.f42815e = provider4;
    }

    /* renamed from: a */
    public ManagerDeepLinking m52170a() {
        return m52168a(this.f42811a, this.f42812b, this.f42813c, this.f42814d, this.f42815e);
    }

    /* renamed from: a */
    public static ManagerDeepLinking m52168a(bg bgVar, Provider<ManagerProfile> provider, Provider<ManagerAnalytics> provider2, Provider<Context> provider3, Provider<DeepLinkedSharedRecInterceptor> provider4) {
        return m52167a(bgVar, (ManagerProfile) provider.get(), (ManagerAnalytics) provider2.get(), (Context) provider3.get(), (DeepLinkedSharedRecInterceptor) provider4.get());
    }

    /* renamed from: b */
    public static bi m52169b(bg bgVar, Provider<ManagerProfile> provider, Provider<ManagerAnalytics> provider2, Provider<Context> provider3, Provider<DeepLinkedSharedRecInterceptor> provider4) {
        return new bi(bgVar, provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static ManagerDeepLinking m52167a(bg bgVar, ManagerProfile managerProfile, ManagerAnalytics managerAnalytics, Context context, DeepLinkedSharedRecInterceptor deepLinkedSharedRecInterceptor) {
        return (ManagerDeepLinking) C15521i.a(bgVar.m40791a(managerProfile, managerAnalytics, context, deepLinkedSharedRecInterceptor), "Cannot return null from a non-@Nullable @Provides method");
    }
}
