package com.tinder.api.retrofit;

import io.reactivex.functions.Function;
import retrofit2.Response;

final /* synthetic */ class TinderRetrofitApi$$Lambda$15 implements Function {
    private final TinderRetrofitApi arg$1;

    TinderRetrofitApi$$Lambda$15(TinderRetrofitApi tinderRetrofitApi) {
        this.arg$1 = tinderRetrofitApi;
    }

    public Object apply(Object obj) {
        return this.arg$1.lambda$authInstagram$9$TinderRetrofitApi((Response) obj);
    }
}
