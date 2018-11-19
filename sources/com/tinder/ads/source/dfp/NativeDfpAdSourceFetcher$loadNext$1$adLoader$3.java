package com.tinder.ads.source.dfp;

import com.google.android.gms.ads.C2338a;
import kotlin.Metadata;
import rx.SingleEmitter;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/ads/source/dfp/NativeDfpAdSourceFetcher$loadNext$1$adLoader$3", "Lcom/google/android/gms/ads/AdListener;", "(Lrx/SingleEmitter;)V", "onAdFailedToLoad", "", "errorCode", "", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class NativeDfpAdSourceFetcher$loadNext$1$adLoader$3 extends C2338a {
    final /* synthetic */ SingleEmitter $emitter;

    NativeDfpAdSourceFetcher$loadNext$1$adLoader$3(SingleEmitter singleEmitter) {
        this.$emitter = singleEmitter;
    }

    public void onAdFailedToLoad(int i) {
        this.$emitter.onError(new NativeDfpException(i));
    }
}
