package com.tinder.api.timeout;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/api/timeout/PlacesTimeoutInterceptor;", "Lcom/tinder/api/timeout/TimeoutInterceptor;", "()V", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesTimeoutInterceptor extends TimeoutInterceptor {
    @Inject
    public PlacesTimeoutInterceptor() {
        super("/v2/places");
    }
}
