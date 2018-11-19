package com.tinder.main.adapter;

import com.tinder.activities.MainActivity;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.discovery.p231a.C11119a;
import com.tinder.discovery.view.DiscoveryTabView;
import com.tinder.discovery.view.singleviewswitcher.SingleViewSwitcher.ChildViewPreDetachListener;
import com.tinder.main.model.MainPage;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.main.adapter.f */
public final class C13387f implements Factory<C14049d> {
    /* renamed from: a */
    private final Provider<MainActivity> f42441a;
    /* renamed from: b */
    private final Provider<List<MainPage>> f42442b;
    /* renamed from: c */
    private final Provider<Map<MainPage, OnPageSelectedListener>> f42443c;
    /* renamed from: d */
    private final Provider<Set<ChildViewPreDetachListener>> f42444d;
    /* renamed from: e */
    private final Provider<DiscoveryTabView> f42445e;
    /* renamed from: f */
    private final Provider<C11119a> f42446f;

    public /* synthetic */ Object get() {
        return m51785a();
    }

    public C13387f(Provider<MainActivity> provider, Provider<List<MainPage>> provider2, Provider<Map<MainPage, OnPageSelectedListener>> provider3, Provider<Set<ChildViewPreDetachListener>> provider4, Provider<DiscoveryTabView> provider5, Provider<C11119a> provider6) {
        this.f42441a = provider;
        this.f42442b = provider2;
        this.f42443c = provider3;
        this.f42444d = provider4;
        this.f42445e = provider5;
        this.f42446f = provider6;
    }

    /* renamed from: a */
    public C14049d m51785a() {
        return C13387f.m51783a(this.f42441a, this.f42442b, this.f42443c, this.f42444d, this.f42445e, this.f42446f);
    }

    /* renamed from: a */
    public static C14049d m51783a(Provider<MainActivity> provider, Provider<List<MainPage>> provider2, Provider<Map<MainPage, OnPageSelectedListener>> provider3, Provider<Set<ChildViewPreDetachListener>> provider4, Provider<DiscoveryTabView> provider5, Provider<C11119a> provider6) {
        return new C14049d((MainActivity) provider.get(), (List) provider2.get(), (Map) provider3.get(), (Set) provider4.get(), C17281c.b(provider5), (C11119a) provider6.get());
    }

    /* renamed from: b */
    public static C13387f m51784b(Provider<MainActivity> provider, Provider<List<MainPage>> provider2, Provider<Map<MainPage, OnPageSelectedListener>> provider3, Provider<Set<ChildViewPreDetachListener>> provider4, Provider<DiscoveryTabView> provider5, Provider<C11119a> provider6) {
        return new C13387f(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
