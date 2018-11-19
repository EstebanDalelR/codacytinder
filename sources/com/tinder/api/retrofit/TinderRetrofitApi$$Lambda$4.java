package com.tinder.api.retrofit;

import com.tinder.api.response.v2.EmptyResponse;
import io.reactivex.functions.Function;
import retrofit2.Response;

final /* synthetic */ class TinderRetrofitApi$$Lambda$4 implements Function {
    static final Function $instance = new TinderRetrofitApi$$Lambda$4();

    private TinderRetrofitApi$$Lambda$4() {
    }

    public Object apply(Object obj) {
        return EmptyResponse.from(((Response) obj).code());
    }
}
