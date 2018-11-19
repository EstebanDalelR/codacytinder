package com.tinder.api.module;

import com.squareup.moshi.C5987p;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.ReauthStrategy;
import com.tinder.api.TinderReauthStrategy;
import com.tinder.api.model.superlikeable.SuperLikeableGameResponse.Empty;
import com.tinder.api.retrofit.AuthTokenProvider;
import com.tinder.api.retrofit.RetrofitErrorBodyAwareTransformer;
import com.tinder.api.retrofit.TinderAuthHeaderInterceptor;
import com.tinder.api.retrofit.TinderAuthenticator;
import com.tinder.api.retrofit.TinderHeaderInterceptor;
import com.tinder.api.retrofit.TinderRetrofitApi.Builder;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.interactor.C8279j;
import com.tinder.common.repository.C10698c;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerApp;
import com.tinder.model.auth.network.AuthRequestFactory;
import com.tinder.module.Internal;
import com.tinder.utils.ab;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import java.util.Map;
import javax.inject.Singleton;
import retrofit2.Retrofit;

@Internal
@Module
public class TinderApiModule {
    @Singleton
    @Provides
    AuthTokenProvider provideAuthTokenProvider(C10698c c10698c) {
        return c10698c;
    }

    @Provides
    Builder provideTinderRetrofitApiBuilder(Retrofit.Builder builder, Map<Class<?>, RetrofitErrorBodyAwareTransformer<?>> map) {
        return new Builder(builder, map);
    }

    @Provides
    ReauthStrategy provideReauthStrategy(C8279j c8279j, C10698c c10698c, C10333h c10333h, AuthRequestFactory authRequestFactory, C2652a c2652a) {
        return new TinderReauthStrategy(c8279j, c10698c, c10333h, authRequestFactory, c2652a);
    }

    @Provides
    TinderAuthenticator provideTinderAuthenticator(ReauthStrategy reauthStrategy, AuthTokenProvider authTokenProvider) {
        return new TinderAuthenticator(reauthStrategy, authTokenProvider);
    }

    @Provides
    TinderHeaderInterceptor provideTinderHeaderInterceptor(TinderHeaderInterceptor.Builder builder) {
        return builder.acceptLanguage(ab.a()).appVersion(ManagerApp.APP_BUILD_NUMBER).userAgent(ManagerWebServices.USER_AGENT_STRING).osVersion(ManagerWebServices.PARAM_OS_VERSION_VALUE).build();
    }

    public static TinderAuthHeaderInterceptor createTinderHeaderInterceptor(AuthTokenProvider authTokenProvider) {
        return new TinderAuthHeaderInterceptor(authTokenProvider);
    }

    @Provides
    TinderHeaderInterceptor.Builder provideTinderHeaderInterceptorBuilder() {
        return new TinderHeaderInterceptor.Builder();
    }

    @IntoMap
    @ClassKey(Empty.class)
    @Provides
    RetrofitErrorBodyAwareTransformer<?> provideSuperLikeableErrorBodyAwareTransformer(C5987p c5987p) {
        return new RetrofitErrorBodyAwareTransformer(c5987p, Empty.class);
    }
}
