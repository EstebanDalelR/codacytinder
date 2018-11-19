package com.tinder.app.dagger.module.main;

import com.tinder.activities.MainActivity;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.discovery.p231a.C13142b;
import com.tinder.discovery.view.DiscoveryTabView;
import com.tinder.discovery.view.DiscoveryTabView.OnSegmentChangedListener;
import com.tinder.main.model.MainPage;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.h */
public final class C12507h implements Factory<DiscoveryTabView> {
    /* renamed from: a */
    private final C8251a f40321a;
    /* renamed from: b */
    private final Provider<MainActivity> f40322b;
    /* renamed from: c */
    private final Provider<C13142b> f40323c;
    /* renamed from: d */
    private final Provider<Set<OnSegmentChangedListener>> f40324d;
    /* renamed from: e */
    private final Provider<Map<MainPage, OnPageSelectedListener>> f40325e;

    public /* synthetic */ Object get() {
        return m49224a();
    }

    public C12507h(C8251a c8251a, Provider<MainActivity> provider, Provider<C13142b> provider2, Provider<Set<OnSegmentChangedListener>> provider3, Provider<Map<MainPage, OnPageSelectedListener>> provider4) {
        this.f40321a = c8251a;
        this.f40322b = provider;
        this.f40323c = provider2;
        this.f40324d = provider3;
        this.f40325e = provider4;
    }

    /* renamed from: a */
    public DiscoveryTabView m49224a() {
        return C12507h.m49222a(this.f40321a, this.f40322b, this.f40323c, this.f40324d, this.f40325e);
    }

    /* renamed from: a */
    public static DiscoveryTabView m49222a(C8251a c8251a, Provider<MainActivity> provider, Provider<C13142b> provider2, Provider<Set<OnSegmentChangedListener>> provider3, Provider<Map<MainPage, OnPageSelectedListener>> provider4) {
        return C12507h.m49221a(c8251a, (MainActivity) provider.get(), (C13142b) provider2.get(), (Set) provider3.get(), (Map) provider4.get());
    }

    /* renamed from: b */
    public static C12507h m49223b(C8251a c8251a, Provider<MainActivity> provider, Provider<C13142b> provider2, Provider<Set<OnSegmentChangedListener>> provider3, Provider<Map<MainPage, OnPageSelectedListener>> provider4) {
        return new C12507h(c8251a, provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static DiscoveryTabView m49221a(C8251a c8251a, MainActivity mainActivity, C13142b c13142b, Set<OnSegmentChangedListener> set, Map<MainPage, OnPageSelectedListener> map) {
        return (DiscoveryTabView) C15521i.a(c8251a.m35211a(mainActivity, c13142b, set, map), "Cannot return null from a non-@Nullable @Provides method");
    }
}
