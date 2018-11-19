package com.tinder.smsauth.data.api;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class SmsAuthApiModule_ProvideSmsAuthServiceFactory implements Factory<SmsAuthService> {
    private final SmsAuthApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public SmsAuthApiModule_ProvideSmsAuthServiceFactory(SmsAuthApiModule smsAuthApiModule, Provider<Retrofit> provider) {
        this.module = smsAuthApiModule;
        this.retrofitProvider = provider;
    }

    public SmsAuthService get() {
        return provideInstance(this.module, this.retrofitProvider);
    }

    public static SmsAuthService provideInstance(SmsAuthApiModule smsAuthApiModule, Provider<Retrofit> provider) {
        return proxyProvideSmsAuthService(smsAuthApiModule, (Retrofit) provider.get());
    }

    public static SmsAuthApiModule_ProvideSmsAuthServiceFactory create(SmsAuthApiModule smsAuthApiModule, Provider<Retrofit> provider) {
        return new SmsAuthApiModule_ProvideSmsAuthServiceFactory(smsAuthApiModule, provider);
    }

    public static SmsAuthService proxyProvideSmsAuthService(SmsAuthApiModule smsAuthApiModule, Retrofit retrofit) {
        return (SmsAuthService) C15521i.m58001a(smsAuthApiModule.provideSmsAuthService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
    }
}
