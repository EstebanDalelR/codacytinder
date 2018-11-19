package com.tinder.api.module;

import android.app.Application;
import com.tinder.api.retrofit.TinderAuthHeaderInterceptor;
import com.tinder.api.retrofit.TinderHeaderInterceptor;
import com.tinder.module.Internal;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import okhttp3.C15963q.C15962a;
import okhttp3.C17692o.C15961a;
import okhttp3.C2670b;
import okhttp3.Interceptor;

@Internal
@Module
public class OkHttpModule {
    @OkHttpQualifiers$HeaderInterceptor
    @IntoSet
    @Provides
    Interceptor provideTinderAuthTokenHeaderInterceptor(TinderAuthHeaderInterceptor tinderAuthHeaderInterceptor) {
        return tinderAuthHeaderInterceptor;
    }

    @OkHttpQualifiers$HeaderInterceptor
    @IntoSet
    @Provides
    Interceptor provideTinderHeaderInterceptor(TinderHeaderInterceptor tinderHeaderInterceptor) {
        return tinderHeaderInterceptor;
    }

    @Provides
    C15961a provideOkHttpClientBuilder() {
        return new C15961a();
    }

    @Provides
    C2670b provideHttpCache(Application application) {
        return new C2670b(application.getCacheDir(), 78643200);
    }

    @Provides
    C15962a provideRequestBuilder() {
        return new C15962a();
    }
}
