package com.tinder.interactors;

import com.google.android.gms.gcm.C2544a;
import com.google.android.gms.gcm.PeriodicTask;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.interactors.j */
public final class C13342j implements Factory<C9718i> {
    /* renamed from: a */
    private final Provider<PeriodicTask> f42322a;
    /* renamed from: b */
    private final Provider<C2544a> f42323b;

    public /* synthetic */ Object get() {
        return m51618a();
    }

    public C13342j(Provider<PeriodicTask> provider, Provider<C2544a> provider2) {
        this.f42322a = provider;
        this.f42323b = provider2;
    }

    /* renamed from: a */
    public C9718i m51618a() {
        return C13342j.m51616a(this.f42322a, this.f42323b);
    }

    /* renamed from: a */
    public static C9718i m51616a(Provider<PeriodicTask> provider, Provider<C2544a> provider2) {
        return new C9718i((PeriodicTask) provider.get(), (C2544a) provider2.get());
    }

    /* renamed from: b */
    public static C13342j m51617b(Provider<PeriodicTask> provider, Provider<C2544a> provider2) {
        return new C13342j(provider, provider2);
    }
}
