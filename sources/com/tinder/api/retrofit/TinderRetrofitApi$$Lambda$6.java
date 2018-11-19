package com.tinder.api.retrofit;

import com.tinder.api.response.EmptyResponse;
import retrofit2.Response;
import rx.functions.Func1;

final /* synthetic */ class TinderRetrofitApi$$Lambda$6 implements Func1 {
    static final Func1 $instance = new TinderRetrofitApi$$Lambda$6();

    private TinderRetrofitApi$$Lambda$6() {
    }

    public Object call(Object obj) {
        return EmptyResponse.builder().code(Integer.valueOf(((Response) obj).code())).message(((Response) obj).message()).build();
    }
}
