package com.tinder.api.retrofit;

import com.tinder.api.response.v2.UserResponse;
import rx.functions.Func1;

final /* synthetic */ class TinderRetrofitApi$$Lambda$10 implements Func1 {
    static final Func1 $instance = new TinderRetrofitApi$$Lambda$10();

    private TinderRetrofitApi$$Lambda$10() {
    }

    public Object call(Object obj) {
        return ((UserResponse) obj).getData().getUser().deactivated();
    }
}
