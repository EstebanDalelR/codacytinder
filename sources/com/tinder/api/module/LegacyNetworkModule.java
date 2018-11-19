package com.tinder.api.module;

import com.tinder.api.APIHeaderInterceptor;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.TinderApiClient;
import com.tinder.api.TinderAuthenticator;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.interactor.C8279j;
import com.tinder.auth.repository.AuthService;
import com.tinder.common.repository.C10698c;
import com.tinder.model.auth.network.AuthRequestFactory;
import com.tinder.module.Default;
import com.tinder.module.Published;
import dagger.Module;
import dagger.Provides;
import de.greenrobot.event.C2664c;
import javax.inject.Singleton;
import okhttp3.Authenticator;
import okhttp3.C17692o;
import retrofit2.Retrofit.Builder;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Published
@Module(includes = {VolleyModule.class, RetrofitModule.class, NetworkModule.class})
public class LegacyNetworkModule {
    @Singleton
    @OkHttpQualifiers$AuthHeaders
    @Provides
    C17692o provideAuthHeadersOkHttpClient(@OkHttpQualifiers$Public C17692o c17692o, APIHeaderInterceptor aPIHeaderInterceptor) {
        return c17692o.z().a(true).a(aPIHeaderInterceptor).a(Authenticator.f49061a).b();
    }

    @Singleton
    @OkHttpQualifiers$ReauthAuthenticator
    @Provides
    C17692o provideReauthAuthenticatorOkHttpClient(@OkHttpQualifiers$AuthHeaders C17692o c17692o, TinderAuthenticator tinderAuthenticator) {
        return c17692o.z().a(tinderAuthenticator).b();
    }

    @Singleton
    @Provides
    TinderApiClient provideTinderApiClient(@OkHttpQualifiers$ReauthAuthenticator C17692o c17692o, Builder builder, RxJavaCallAdapterFactory rxJavaCallAdapterFactory, GsonConverterFactory gsonConverterFactory, EnvironmentProvider environmentProvider) {
        return (TinderApiClient) builder.baseUrl(environmentProvider.getUrlBase()).addCallAdapterFactory(rxJavaCallAdapterFactory).addConverterFactory(gsonConverterFactory).client(c17692o).build().create(TinderApiClient.class);
    }

    @Singleton
    @Provides
    AuthService provideAuthService(@OkHttpQualifiers$AuthHeaders C17692o c17692o, Builder builder, RxJavaCallAdapterFactory rxJavaCallAdapterFactory, GsonConverterFactory gsonConverterFactory, EnvironmentProvider environmentProvider) {
        return (AuthService) builder.baseUrl(environmentProvider.getUrlBase()).client(c17692o).addCallAdapterFactory(rxJavaCallAdapterFactory).addConverterFactory(gsonConverterFactory).build().create(AuthService.class);
    }

    @Singleton
    @Provides
    TinderAuthenticator provideAuthenticator(@Default C2664c c2664c, C8279j c8279j, C10698c c10698c, C10333h c10333h, AuthRequestFactory authRequestFactory) {
        return new TinderAuthenticator(c2664c, c8279j, c10698c, c10333h, authRequestFactory);
    }

    @Singleton
    @Provides
    APIHeaderInterceptor provideHeaderInterceptor() {
        return new APIHeaderInterceptor();
    }
}
