package com.tinder.analytics.p154c;

import com.tinder.analytics.CrmEventTracker;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.analytics.c.b */
public final class C8001b implements Factory<C6213a> {
    /* renamed from: a */
    private final Provider<CrmEventTracker> f28621a;

    public /* synthetic */ Object get() {
        return m33897a();
    }

    public C8001b(Provider<CrmEventTracker> provider) {
        this.f28621a = provider;
    }

    /* renamed from: a */
    public C6213a m33897a() {
        return C8001b.m33895a(this.f28621a);
    }

    /* renamed from: a */
    public static C6213a m33895a(Provider<CrmEventTracker> provider) {
        return new C6213a((CrmEventTracker) provider.get());
    }

    /* renamed from: b */
    public static C8001b m33896b(Provider<CrmEventTracker> provider) {
        return new C8001b(provider);
    }
}
