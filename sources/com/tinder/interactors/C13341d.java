package com.tinder.interactors;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.interactors.d */
public final class C13341d implements Factory<C2647c> {
    /* renamed from: a */
    private final Provider<TelephonyManager> f42320a;
    /* renamed from: b */
    private final Provider<ConnectivityManager> f42321b;

    public /* synthetic */ Object get() {
        return m51615a();
    }

    public C13341d(Provider<TelephonyManager> provider, Provider<ConnectivityManager> provider2) {
        this.f42320a = provider;
        this.f42321b = provider2;
    }

    /* renamed from: a */
    public C2647c m51615a() {
        return C13341d.m51613a(this.f42320a, this.f42321b);
    }

    /* renamed from: a */
    public static C2647c m51613a(Provider<TelephonyManager> provider, Provider<ConnectivityManager> provider2) {
        return new C2647c((TelephonyManager) provider.get(), (ConnectivityManager) provider2.get());
    }

    /* renamed from: b */
    public static C13341d m51614b(Provider<TelephonyManager> provider, Provider<ConnectivityManager> provider2) {
        return new C13341d(provider, provider2);
    }
}
