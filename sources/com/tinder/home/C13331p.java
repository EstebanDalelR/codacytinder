package com.tinder.home;

import com.tinder.activities.MainActivity;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.discovery.view.DiscoveryTabView;
import com.tinder.main.adapter.C13385a;
import com.tinder.main.model.MainPage;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: com.tinder.home.p */
public final class C13331p implements Factory<C13329n> {
    /* renamed from: a */
    private final Provider<MainActivity> f42298a;
    /* renamed from: b */
    private final Provider<List<MainPage>> f42299b;
    /* renamed from: c */
    private final Provider<C9697c> f42300c;
    /* renamed from: d */
    private final Provider<C13385a> f42301d;
    /* renamed from: e */
    private final Provider<Map<MainPage, OnPageSelectedListener>> f42302e;
    /* renamed from: f */
    private final Provider<DiscoveryTabView> f42303f;
    /* renamed from: g */
    private final Provider<MainPage> f42304g;

    public /* synthetic */ Object get() {
        return m51583a();
    }

    public C13331p(Provider<MainActivity> provider, Provider<List<MainPage>> provider2, Provider<C9697c> provider3, Provider<C13385a> provider4, Provider<Map<MainPage, OnPageSelectedListener>> provider5, Provider<DiscoveryTabView> provider6, Provider<MainPage> provider7) {
        this.f42298a = provider;
        this.f42299b = provider2;
        this.f42300c = provider3;
        this.f42301d = provider4;
        this.f42302e = provider5;
        this.f42303f = provider6;
        this.f42304g = provider7;
    }

    /* renamed from: a */
    public C13329n m51583a() {
        return C13331p.m51581a(this.f42298a, this.f42299b, this.f42300c, this.f42301d, this.f42302e, this.f42303f, this.f42304g);
    }

    /* renamed from: a */
    public static C13329n m51581a(Provider<MainActivity> provider, Provider<List<MainPage>> provider2, Provider<C9697c> provider3, Provider<C13385a> provider4, Provider<Map<MainPage, OnPageSelectedListener>> provider5, Provider<DiscoveryTabView> provider6, Provider<MainPage> provider7) {
        return new C13329n((MainActivity) provider.get(), (List) provider2.get(), (C9697c) provider3.get(), (C13385a) provider4.get(), (Map) provider5.get(), C17281c.b(provider6), (MainPage) provider7.get());
    }

    /* renamed from: b */
    public static C13331p m51582b(Provider<MainActivity> provider, Provider<List<MainPage>> provider2, Provider<C9697c> provider3, Provider<C13385a> provider4, Provider<Map<MainPage, OnPageSelectedListener>> provider5, Provider<DiscoveryTabView> provider6, Provider<MainPage> provider7) {
        return new C13331p(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }
}
