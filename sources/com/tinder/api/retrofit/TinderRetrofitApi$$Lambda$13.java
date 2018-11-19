package com.tinder.api.retrofit;

import com.tinder.api.response.v2.DataResponse;
import io.reactivex.functions.Function;

final /* synthetic */ class TinderRetrofitApi$$Lambda$13 implements Function {
    static final Function $instance = new TinderRetrofitApi$$Lambda$13();

    private TinderRetrofitApi$$Lambda$13() {
    }

    public Object apply(Object obj) {
        return ((DataResponse) obj).data();
    }
}
