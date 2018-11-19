package com.tinder.module;

import com.facebook.network.connectionclass.C1798b;
import com.facebook.network.connectionclass.ConnectionClassManager;
import com.tinder.managers.bk;
import com.tinder.managers.bs;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class eq implements Factory<bs> {
    /* renamed from: a */
    private final ec f42994a;
    /* renamed from: b */
    private final Provider<bk> f42995b;
    /* renamed from: c */
    private final Provider<C1798b> f42996c;
    /* renamed from: d */
    private final Provider<ConnectionClassManager> f42997d;

    public /* synthetic */ Object get() {
        return m52491a();
    }

    public eq(ec ecVar, Provider<bk> provider, Provider<C1798b> provider2, Provider<ConnectionClassManager> provider3) {
        this.f42994a = ecVar;
        this.f42995b = provider;
        this.f42996c = provider2;
        this.f42997d = provider3;
    }

    /* renamed from: a */
    public bs m52491a() {
        return m52489a(this.f42994a, this.f42995b, this.f42996c, this.f42997d);
    }

    /* renamed from: a */
    public static bs m52489a(ec ecVar, Provider<bk> provider, Provider<C1798b> provider2, Provider<ConnectionClassManager> provider3) {
        return m52488a(ecVar, (bk) provider.get(), (C1798b) provider2.get(), (ConnectionClassManager) provider3.get());
    }

    /* renamed from: b */
    public static eq m52490b(ec ecVar, Provider<bk> provider, Provider<C1798b> provider2, Provider<ConnectionClassManager> provider3) {
        return new eq(ecVar, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static bs m52488a(ec ecVar, bk bkVar, C1798b c1798b, ConnectionClassManager connectionClassManager) {
        return (bs) C15521i.a(ecVar.m40885a(bkVar, c1798b, connectionClassManager), "Cannot return null from a non-@Nullable @Provides method");
    }
}
