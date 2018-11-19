package com.tinder.app.dagger.module.main;

import com.tinder.activities.MainActivity;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p231a.C11119a;
import com.tinder.discovery.view.singleviewswitcher.SingleViewSwitcher.C8908a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.k */
public final class C12510k implements Factory<C11119a> {
    /* renamed from: a */
    private final C8251a f40330a;
    /* renamed from: b */
    private final Provider<MainActivity> f40331b;
    /* renamed from: c */
    private final Provider<Map<DiscoverySegment, C8908a>> f40332c;

    public /* synthetic */ Object get() {
        return m49236a();
    }

    public C12510k(C8251a c8251a, Provider<MainActivity> provider, Provider<Map<DiscoverySegment, C8908a>> provider2) {
        this.f40330a = c8251a;
        this.f40331b = provider;
        this.f40332c = provider2;
    }

    /* renamed from: a */
    public C11119a m49236a() {
        return C12510k.m49234a(this.f40330a, this.f40331b, this.f40332c);
    }

    /* renamed from: a */
    public static C11119a m49234a(C8251a c8251a, Provider<MainActivity> provider, Provider<Map<DiscoverySegment, C8908a>> provider2) {
        return C12510k.m49233a(c8251a, (MainActivity) provider.get(), (Map) provider2.get());
    }

    /* renamed from: b */
    public static C12510k m49235b(C8251a c8251a, Provider<MainActivity> provider, Provider<Map<DiscoverySegment, C8908a>> provider2) {
        return new C12510k(c8251a, provider, provider2);
    }

    /* renamed from: a */
    public static C11119a m49233a(C8251a c8251a, MainActivity mainActivity, Map<DiscoverySegment, C8908a> map) {
        return (C11119a) C15521i.a(c8251a.m35201a(mainActivity, (Map) map), "Cannot return null from a non-@Nullable @Provides method");
    }
}
