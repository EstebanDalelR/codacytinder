package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.analytics.w */
public final class C12706w implements Factory<C10540v> {
    /* renamed from: a */
    private final Provider<C2630h> f40992a;
    /* renamed from: b */
    private final Provider<C10522a> f40993b;

    public /* synthetic */ Object get() {
        return m50017a();
    }

    public C12706w(Provider<C2630h> provider, Provider<C10522a> provider2) {
        this.f40992a = provider;
        this.f40993b = provider2;
    }

    /* renamed from: a */
    public C10540v m50017a() {
        return C12706w.m50015a(this.f40992a, this.f40993b);
    }

    /* renamed from: a */
    public static C10540v m50015a(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C10540v((C2630h) provider.get(), (C10522a) provider2.get());
    }

    /* renamed from: b */
    public static C12706w m50016b(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C12706w(provider, provider2);
    }
}
