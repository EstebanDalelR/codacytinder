package com.tinder.auth;

import com.tinder.analytics.C7333h;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.InstallIdHeaderInterceptor;
import com.tinder.api.retrofit.TinderHeaderInterceptor;
import com.tinder.smsauth.sdk.C14987c;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.f */
public final class C12574f implements Factory<C14987c> {
    /* renamed from: a */
    private final C8266a f40623a;
    /* renamed from: b */
    private final Provider<EnvironmentProvider> f40624b;
    /* renamed from: c */
    private final Provider<TinderHeaderInterceptor> f40625c;
    /* renamed from: d */
    private final Provider<InstallIdHeaderInterceptor> f40626d;
    /* renamed from: e */
    private final Provider<C7333h> f40627e;

    public /* synthetic */ Object get() {
        return m49705a();
    }

    /* renamed from: a */
    public C14987c m49705a() {
        return C12574f.m49704a(this.f40623a, this.f40624b, this.f40625c, this.f40626d, this.f40627e);
    }

    /* renamed from: a */
    public static C14987c m49704a(C8266a c8266a, Provider<EnvironmentProvider> provider, Provider<TinderHeaderInterceptor> provider2, Provider<InstallIdHeaderInterceptor> provider3, Provider<C7333h> provider4) {
        return C12574f.m49703a(c8266a, (EnvironmentProvider) provider.get(), (TinderHeaderInterceptor) provider2.get(), (InstallIdHeaderInterceptor) provider3.get(), (C7333h) provider4.get());
    }

    /* renamed from: a */
    public static C14987c m49703a(C8266a c8266a, EnvironmentProvider environmentProvider, TinderHeaderInterceptor tinderHeaderInterceptor, InstallIdHeaderInterceptor installIdHeaderInterceptor, C7333h c7333h) {
        return (C14987c) C15521i.a(c8266a.m35303a(environmentProvider, tinderHeaderInterceptor, installIdHeaderInterceptor, c7333h), "Cannot return null from a non-@Nullable @Provides method");
    }
}
