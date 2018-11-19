package com.tinder.recs.view.nativevideos;

import android.view.View;
import android.view.ViewStub;
import android.view.ViewStub.OnInflateListener;
import com.tinder.ads.RecsNativeAd;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/ViewStub;", "kotlin.jvm.PlatformType", "inflated", "Landroid/view/View;", "onInflate"}, k = 3, mv = {1, 1, 10})
final class NativeAdView$bindAd$1 implements OnInflateListener {
    final /* synthetic */ RecsNativeAd $ad;
    final /* synthetic */ NativeAdView this$0;

    NativeAdView$bindAd$1(NativeAdView nativeAdView, RecsNativeAd recsNativeAd) {
        this.this$0 = nativeAdView;
        this.$ad = recsNativeAd;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        viewStub = this.this$0;
        C2668g.a(view, "inflated");
        viewStub.onContentInflated(view, this.$ad);
    }
}
