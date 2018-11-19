package com.tinder.api.retrofit;

import com.tinder.api.response.SuperlikeStatusInfoResponse;
import rx.functions.Func1;

final /* synthetic */ class TinderRetrofitApi$$Lambda$1 implements Func1 {
    static final Func1 $instance = new TinderRetrofitApi$$Lambda$1();

    private TinderRetrofitApi$$Lambda$1() {
    }

    public Object call(Object obj) {
        return ((SuperlikeStatusInfoResponse) obj).superLikeInfo();
    }
}
