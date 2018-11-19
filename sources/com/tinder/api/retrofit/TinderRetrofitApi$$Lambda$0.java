package com.tinder.api.retrofit;

import retrofit2.Response;
import rx.functions.Func1;

final /* synthetic */ class TinderRetrofitApi$$Lambda$0 implements Func1 {
    private final TinderRetrofitApi arg$1;

    TinderRetrofitApi$$Lambda$0(TinderRetrofitApi tinderRetrofitApi) {
        this.arg$1 = tinderRetrofitApi;
    }

    public Object call(Object obj) {
        return this.arg$1.lambda$validatePurchase$0$TinderRetrofitApi((Response) obj);
    }
}
