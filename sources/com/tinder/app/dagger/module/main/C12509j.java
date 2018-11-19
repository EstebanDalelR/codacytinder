package com.tinder.app.dagger.module.main;

import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.view.singleviewswitcher.SingleViewSwitcher.C8908a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Map;

/* renamed from: com.tinder.app.dagger.module.main.j */
public final class C12509j implements Factory<Map<DiscoverySegment, C8908a>> {
    /* renamed from: a */
    private final C8251a f40329a;

    public /* synthetic */ Object get() {
        return m49232a();
    }

    public C12509j(C8251a c8251a) {
        this.f40329a = c8251a;
    }

    /* renamed from: a */
    public Map<DiscoverySegment, C8908a> m49232a() {
        return C12509j.m49229a(this.f40329a);
    }

    /* renamed from: a */
    public static Map<DiscoverySegment, C8908a> m49229a(C8251a c8251a) {
        return C12509j.m49231c(c8251a);
    }

    /* renamed from: b */
    public static C12509j m49230b(C8251a c8251a) {
        return new C12509j(c8251a);
    }

    /* renamed from: c */
    public static Map<DiscoverySegment, C8908a> m49231c(C8251a c8251a) {
        return (Map) C15521i.a(c8251a.m35213b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
