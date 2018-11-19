package com.tinder.api.retrofit;

import com.tinder.api.response.v2.DataResponse;
import io.reactivex.functions.Function;

final /* synthetic */ class TinderRetrofitApi$$Lambda$14 implements Function {
    static final Function $instance = new TinderRetrofitApi$$Lambda$14();

    private TinderRetrofitApi$$Lambda$14() {
    }

    public Object apply(Object obj) {
        return ((DataResponse) obj).data();
    }
}
