package com.tinder.api.retrofit;

import retrofit2.Response;
import rx.functions.Func1;

final /* synthetic */ class TinderRetrofitApi$$Lambda$2 implements Func1 {
    static final Func1 $instance = new TinderRetrofitApi$$Lambda$2();

    private TinderRetrofitApi$$Lambda$2() {
    }

    public Object call(Object obj) {
        return TinderRetrofitApi.lambda$getProfilePhotos$1$TinderRetrofitApi((Response) obj);
    }
}
