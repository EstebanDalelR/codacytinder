package com.tinder.module;

import com.tinder.api.NetworkSamplerInterceptor;
import com.tinder.api.module.NetworkModule;
import com.tinder.api.networkperf.interceptor.NetworkPerfInterceptor;
import com.tinder.api.networkperf.module.NetworkPerfModule;
import com.tinder.api.retrofit.InterceptorDecorator;
import com.tinder.api.timeout.PlacesTimeoutInterceptor;
import dagger.Module;
import dagger.Provides;

@Published
@Module(includes = {NetworkModule.class, fe.class, NetworkPerfModule.class})
public class fb {
    @Provides
    /* renamed from: a */
    InterceptorDecorator m40897a(NetworkSamplerInterceptor networkSamplerInterceptor, NetworkPerfInterceptor networkPerfInterceptor, PlacesTimeoutInterceptor placesTimeoutInterceptor) {
        return new fc(networkSamplerInterceptor, networkPerfInterceptor, placesTimeoutInterceptor);
    }
}
