package com.tinder.api.retrofit;

import com.tinder.api.response.v2.EmptyResponse;
import io.reactivex.functions.Function;
import retrofit2.Response;

final /* synthetic */ class TinderRetrofitApi$$Lambda$3 implements Function {
    static final Function $instance = new TinderRetrofitApi$$Lambda$3();

    private TinderRetrofitApi$$Lambda$3() {
    }

    public Object apply(Object obj) {
        return EmptyResponse.from(((Response) obj).code());
    }
}
