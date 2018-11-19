package com.tinder.api.retrofit;

import com.tinder.api.response.v2.DataResponse;
import io.reactivex.functions.Function;

final /* synthetic */ class TinderRetrofitApi$$Lambda$12 implements Function {
    static final Function $instance = new TinderRetrofitApi$$Lambda$12();

    private TinderRetrofitApi$$Lambda$12() {
    }

    public Object apply(Object obj) {
        return ((DataResponse) obj).data();
    }
}
