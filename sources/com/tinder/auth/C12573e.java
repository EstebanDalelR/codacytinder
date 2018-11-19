package com.tinder.auth;

import com.tinder.api.EnvironmentProvider;
import com.tinder.auth.repository.AccountService;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o;
import retrofit2.Retrofit.Builder;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* renamed from: com.tinder.auth.e */
public final class C12573e implements Factory<AccountService> {
    /* renamed from: a */
    private final C8266a f40617a;
    /* renamed from: b */
    private final Provider<Builder> f40618b;
    /* renamed from: c */
    private final Provider<C17692o> f40619c;
    /* renamed from: d */
    private final Provider<RxJavaCallAdapterFactory> f40620d;
    /* renamed from: e */
    private final Provider<GsonConverterFactory> f40621e;
    /* renamed from: f */
    private final Provider<EnvironmentProvider> f40622f;

    public /* synthetic */ Object get() {
        return m49702a();
    }

    /* renamed from: a */
    public AccountService m49702a() {
        return C12573e.m49700a(this.f40617a, this.f40618b, this.f40619c, this.f40620d, this.f40621e, this.f40622f);
    }

    /* renamed from: a */
    public static AccountService m49700a(C8266a c8266a, Provider<Builder> provider, Provider<C17692o> provider2, Provider<RxJavaCallAdapterFactory> provider3, Provider<GsonConverterFactory> provider4, Provider<EnvironmentProvider> provider5) {
        return C12573e.m49701a(c8266a, (Builder) provider.get(), (C17692o) provider2.get(), (RxJavaCallAdapterFactory) provider3.get(), (GsonConverterFactory) provider4.get(), (EnvironmentProvider) provider5.get());
    }

    /* renamed from: a */
    public static AccountService m49701a(C8266a c8266a, Builder builder, C17692o c17692o, RxJavaCallAdapterFactory rxJavaCallAdapterFactory, GsonConverterFactory gsonConverterFactory, EnvironmentProvider environmentProvider) {
        return (AccountService) C15521i.a(c8266a.m35297a(builder, c17692o, rxJavaCallAdapterFactory, gsonConverterFactory, environmentProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
