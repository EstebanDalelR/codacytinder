package com.tinder.api.module;

import android.app.Application;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import com.squareup.moshi.C5987p;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.TinderApi;
import com.tinder.api.TinderUserApi;
import com.tinder.api.keepalive.KeepAliveScarletApi;
import com.tinder.api.keepalive.KeepAliveScarletApi.Factory;
import com.tinder.api.keepalive.KeepAliveScarletApi.StubFactory;
import com.tinder.api.retrofit.InterceptorDecorator;
import com.tinder.api.retrofit.TinderAuthenticator;
import com.tinder.api.retrofit.TinderRetrofitApi.Builder;
import com.tinder.base.module.ImageNetworkModule;
import com.tinder.base.module.ImageNetworkModule$ImageNetwork;
import com.tinder.core.experiment.C8597m;
import com.tinder.domain.injection.qualifiers.LoggedIn;
import com.tinder.module.Published;
import com.tinder.scarlet.Lifecycle;
import dagger.Module;
import dagger.Provides;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import okhttp3.C17692o;
import okhttp3.C17692o.C15961a;
import okhttp3.C2670b;
import okhttp3.Interceptor;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

@Published
@Module(includes = {TinderApiModule.class, OkHttpModule.class, RetrofitModule.class, ThirdPartyClientModule.class, ImageNetworkModule.class})
public class NetworkModule {
    @Singleton
    @Provides
    KeepAliveScarletApi provideKeepAliveService(@OkHttpQualifiers$Public C17692o c17692o, TinderAuthenticator tinderAuthenticator, @OkHttpQualifiers$HeaderInterceptor Set<Interceptor> set, @LoggedIn Lifecycle lifecycle, C8597m c8597m, Application application, EnvironmentProvider environmentProvider) {
        if (c8597m.m36697a() == null) {
            return new StubFactory().createStub();
        }
        return new Factory(environmentProvider.getUrlBase(), c17692o, tinderAuthenticator, set, application, lifecycle).create();
    }

    @Singleton
    @Provides
    TinderApi provideTinderApiClient(Builder builder, @OkHttpQualifiers$Public C17692o c17692o, TinderAuthenticator tinderAuthenticator, @OkHttpQualifiers$HeaderInterceptor Set<Interceptor> set, RxJavaCallAdapterFactory rxJavaCallAdapterFactory, RxJava2CallAdapterFactory rxJava2CallAdapterFactory, C5987p c5987p, EnvironmentProvider environmentProvider) {
        return builder.rootUrl(environmentProvider.getUrlBase()).imageUploadUrl(environmentProvider.getUrlBaseImage()).okHttpClient(c17692o).headerInterceptors(set).authenticator(tinderAuthenticator).rxJavaCallAdapterFactory(rxJavaCallAdapterFactory).rxJava2CallAdapterFactory(rxJava2CallAdapterFactory).moshi(c5987p).build();
    }

    @Singleton
    @Provides
    TinderUserApi provideTinderUserApi(TinderApi tinderApi) {
        return (TinderUserApi) tinderApi;
    }

    @Singleton
    @OkHttpQualifiers$Public
    @Provides
    C17692o providePublicApiClient(C15961a c15961a, C2670b c2670b, InterceptorDecorator interceptorDecorator) {
        return interceptorDecorator.applyInterceptors(c15961a).a(10, TimeUnit.SECONDS).c(10, TimeUnit.SECONDS).b(30, TimeUnit.SECONDS).a(c2670b).b();
    }

    @Provides
    OkHttpUrlLoader.Factory provideOkHttpUrlLoaderFactory(@OkHttpQualifiers$Public C17692o c17692o, @ImageNetworkModule$ImageNetwork Set<Interceptor> set) {
        c17692o = c17692o.z();
        for (Interceptor a : set) {
            c17692o.a(a);
        }
        return new OkHttpUrlLoader.Factory(c17692o.b());
    }
}
