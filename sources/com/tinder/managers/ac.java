package com.tinder.managers;

import android.content.Context;
import dagger.internal.Factory;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

public final class ac implements Factory<ManagerFusedLocation> {
    /* renamed from: a */
    private final Provider<Context> f42469a;
    /* renamed from: b */
    private final Provider<bk> f42470b;
    /* renamed from: c */
    private final Provider<C2664c> f42471c;
    /* renamed from: d */
    private final Provider<bt> f42472d;

    public /* synthetic */ Object get() {
        return m51805a();
    }

    public ac(Provider<Context> provider, Provider<bk> provider2, Provider<C2664c> provider3, Provider<bt> provider4) {
        this.f42469a = provider;
        this.f42470b = provider2;
        this.f42471c = provider3;
        this.f42472d = provider4;
    }

    /* renamed from: a */
    public ManagerFusedLocation m51805a() {
        return m51803a(this.f42469a, this.f42470b, this.f42471c, this.f42472d);
    }

    /* renamed from: a */
    public static ManagerFusedLocation m51803a(Provider<Context> provider, Provider<bk> provider2, Provider<C2664c> provider3, Provider<bt> provider4) {
        return new ManagerFusedLocation((Context) provider.get(), (bk) provider2.get(), (C2664c) provider3.get(), (bt) provider4.get());
    }

    /* renamed from: b */
    public static ac m51804b(Provider<Context> provider, Provider<bk> provider2, Provider<C2664c> provider3, Provider<bt> provider4) {
        return new ac(provider, provider2, provider3, provider4);
    }
}
