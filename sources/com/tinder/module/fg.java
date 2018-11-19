package com.tinder.module;

import android.app.Application;
import com.tinder.api.NetworkSamplerInterceptor;
import com.tinder.managers.bk;
import com.tinder.managers.bs;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class fg implements Factory<NetworkSamplerInterceptor> {
    /* renamed from: a */
    private final fe f43020a;
    /* renamed from: b */
    private final Provider<Application> f43021b;
    /* renamed from: c */
    private final Provider<bs> f43022c;
    /* renamed from: d */
    private final Provider<bk> f43023d;

    public /* synthetic */ Object get() {
        return m52521a();
    }

    public fg(fe feVar, Provider<Application> provider, Provider<bs> provider2, Provider<bk> provider3) {
        this.f43020a = feVar;
        this.f43021b = provider;
        this.f43022c = provider2;
        this.f43023d = provider3;
    }

    /* renamed from: a */
    public NetworkSamplerInterceptor m52521a() {
        return m52519a(this.f43020a, this.f43021b, this.f43022c, this.f43023d);
    }

    /* renamed from: a */
    public static NetworkSamplerInterceptor m52519a(fe feVar, Provider<Application> provider, Provider<bs> provider2, Provider<bk> provider3) {
        return m52518a(feVar, (Application) provider.get(), (bs) provider2.get(), (bk) provider3.get());
    }

    /* renamed from: b */
    public static fg m52520b(fe feVar, Provider<Application> provider, Provider<bs> provider2, Provider<bk> provider3) {
        return new fg(feVar, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static NetworkSamplerInterceptor m52518a(fe feVar, Application application, bs bsVar, bk bkVar) {
        return (NetworkSamplerInterceptor) C15521i.a(feVar.m40898a(application, bsVar, bkVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
