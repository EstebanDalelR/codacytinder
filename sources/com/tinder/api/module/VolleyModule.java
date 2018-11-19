package com.tinder.api.module;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.C3003a;
import com.android.volley.toolbox.C3005g;
import com.android.volley.toolbox.HttpStack;
import com.tinder.analytics.fireworks.api.C6224b;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.OkHttpStack;
import com.tinder.module.Published;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import okhttp3.C17692o;

@Published
@Deprecated
@Module
public class VolleyModule {
    @Singleton
    @Provides
    HttpStack provideOkHttpStack(@OkHttpQualifiers$ReauthAuthenticator C17692o c17692o, EnvironmentProvider environmentProvider, C6224b c6224b) {
        return new OkHttpStack(c17692o, environmentProvider, c6224b);
    }

    @Singleton
    @Provides
    RequestQueue provideRequestQueue(HttpStack httpStack) {
        httpStack = new RequestQueue(new C3005g(), new C3003a(httpStack));
        httpStack.a();
        return httpStack;
    }
}
