package com.tinder.api.retrofit;

import com.tinder.api.model.fastmatch.adapter.FastMatchPreviewResponseAdapter;
import retrofit2.Response;
import rx.functions.Func1;

final /* synthetic */ class TinderRetrofitApi$$Lambda$9 implements Func1 {
    private final FastMatchPreviewResponseAdapter arg$1;

    private TinderRetrofitApi$$Lambda$9(FastMatchPreviewResponseAdapter fastMatchPreviewResponseAdapter) {
        this.arg$1 = fastMatchPreviewResponseAdapter;
    }

    static Func1 get$Lambda(FastMatchPreviewResponseAdapter fastMatchPreviewResponseAdapter) {
        return new TinderRetrofitApi$$Lambda$9(fastMatchPreviewResponseAdapter);
    }

    public Object call(Object obj) {
        return this.arg$1.fromApi((Response) obj);
    }
}
