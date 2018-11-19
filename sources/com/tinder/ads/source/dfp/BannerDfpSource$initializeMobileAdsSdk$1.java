package com.tinder.ads.source.dfp;

import com.google.android.gms.ads.C2365i;
import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 7})
final class BannerDfpSource$initializeMobileAdsSdk$1 implements Action0 {
    final /* synthetic */ BannerDfpSource this$0;

    BannerDfpSource$initializeMobileAdsSdk$1(BannerDfpSource bannerDfpSource) {
        this.this$0 = bannerDfpSource;
    }

    public final void call() {
        C2365i.a(this.this$0.getContext());
    }
}
