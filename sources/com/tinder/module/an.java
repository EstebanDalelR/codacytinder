package com.tinder.module;

import com.tinder.analytics.ThirdPartyLocationUpdatesListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class an implements Factory<ThirdPartyLocationUpdatesListener> {
    /* renamed from: a */
    private final aa f42773a;

    public /* synthetic */ Object get() {
        return m52102a();
    }

    public an(aa aaVar) {
        this.f42773a = aaVar;
    }

    /* renamed from: a */
    public ThirdPartyLocationUpdatesListener m52102a() {
        return m52099a(this.f42773a);
    }

    /* renamed from: a */
    public static ThirdPartyLocationUpdatesListener m52099a(aa aaVar) {
        return m52101c(aaVar);
    }

    /* renamed from: b */
    public static an m52100b(aa aaVar) {
        return new an(aaVar);
    }

    /* renamed from: c */
    public static ThirdPartyLocationUpdatesListener m52101c(aa aaVar) {
        return (ThirdPartyLocationUpdatesListener) C15521i.a(aaVar.m40780f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
