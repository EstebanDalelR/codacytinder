package com.tinder.api;

import android.content.Context;
import com.tinder.managers.bk;
import com.tinder.managers.bs;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class NetworkSamplerInterceptor_Factory implements Factory<NetworkSamplerInterceptor> {
    private final Provider<Context> contextProvider;
    private final Provider<bk> managerSharedPreferencesProvider;
    private final Provider<bs> networkQualitySamplerProvider;

    public NetworkSamplerInterceptor_Factory(Provider<Context> provider, Provider<bs> provider2, Provider<bk> provider3) {
        this.contextProvider = provider;
        this.networkQualitySamplerProvider = provider2;
        this.managerSharedPreferencesProvider = provider3;
    }

    public NetworkSamplerInterceptor get() {
        return provideInstance(this.contextProvider, this.networkQualitySamplerProvider, this.managerSharedPreferencesProvider);
    }

    public static NetworkSamplerInterceptor provideInstance(Provider<Context> provider, Provider<bs> provider2, Provider<bk> provider3) {
        return new NetworkSamplerInterceptor((Context) provider.get(), (bs) provider2.get(), (bk) provider3.get());
    }

    public static NetworkSamplerInterceptor_Factory create(Provider<Context> provider, Provider<bs> provider2, Provider<bk> provider3) {
        return new NetworkSamplerInterceptor_Factory(provider, provider2, provider3);
    }

    public static NetworkSamplerInterceptor newNetworkSamplerInterceptor(Context context, bs bsVar, bk bkVar) {
        return new NetworkSamplerInterceptor(context, bsVar, bkVar);
    }
}
