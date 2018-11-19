package com.tinder.api.retrofit;

import com.tinder.api.response.v2.DataResponse;
import rx.functions.Func1;

final /* synthetic */ class TinderRetrofitApi$$Lambda$11 implements Func1 {
    static final Func1 $instance = new TinderRetrofitApi$$Lambda$11();

    private TinderRetrofitApi$$Lambda$11() {
    }

    public Object call(Object obj) {
        return ((DataResponse) obj).data();
    }
}
