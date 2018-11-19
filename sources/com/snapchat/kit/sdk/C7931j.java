package com.snapchat.kit.sdk;

import com.google.gson.Gson;
import com.snapchat.kit.sdk.core.controller.C7136a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.C5940e;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.security.C7158g;
import com.squareup.okhttp.C6068p;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.j */
public final class C7931j implements Factory<OAuth2Manager> {
    /* renamed from: a */
    private final C5951d f28518a;
    /* renamed from: b */
    private final Provider<C7158g> f28519b;
    /* renamed from: c */
    private final Provider<C7136a> f28520c;
    /* renamed from: d */
    private final Provider<C6068p> f28521d;
    /* renamed from: e */
    private final Provider<Gson> f28522e;
    /* renamed from: f */
    private final Provider<MetricQueue<ServerEvent>> f28523f;
    /* renamed from: g */
    private final Provider<C5940e> f28524g;
    /* renamed from: h */
    private final Provider<MetricQueue<OpMetric>> f28525h;

    public /* synthetic */ Object get() {
        return m33780a();
    }

    public C7931j(C5951d c5951d, Provider<C7158g> provider, Provider<C7136a> provider2, Provider<C6068p> provider3, Provider<Gson> provider4, Provider<MetricQueue<ServerEvent>> provider5, Provider<C5940e> provider6, Provider<MetricQueue<OpMetric>> provider7) {
        this.f28518a = c5951d;
        this.f28519b = provider;
        this.f28520c = provider2;
        this.f28521d = provider3;
        this.f28522e = provider4;
        this.f28523f = provider5;
        this.f28524g = provider6;
        this.f28525h = provider7;
    }

    /* renamed from: a */
    public OAuth2Manager m33780a() {
        return (OAuth2Manager) C15521i.a(this.f28518a.m25557a((C7158g) this.f28519b.get(), (C7136a) this.f28520c.get(), (C6068p) this.f28521d.get(), (Gson) this.f28522e.get(), C17281c.b(this.f28523f), (C5940e) this.f28524g.get(), C17281c.b(this.f28525h)), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<OAuth2Manager> m33779a(C5951d c5951d, Provider<C7158g> provider, Provider<C7136a> provider2, Provider<C6068p> provider3, Provider<Gson> provider4, Provider<MetricQueue<ServerEvent>> provider5, Provider<C5940e> provider6, Provider<MetricQueue<OpMetric>> provider7) {
        return new C7931j(c5951d, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }
}
