package com.tinder.recs.view.nativevideos;

import com.google.android.gms.ads.C2412j.C2411a;
import com.tinder.R;
import com.tinder.ads.RecsNativeAd;
import com.tinder.ads.RecsNativeVideoAd;
import com.tinder.recs.controller.RecsNativeDfpAdController;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"com/tinder/recs/view/nativevideos/NativeAdView$videoLifecycleCallbacks$1", "Lcom/google/android/gms/ads/VideoController$VideoLifecycleCallbacks;", "(Lcom/tinder/recs/view/nativevideos/NativeAdView;)V", "onVideoEnd", "", "onVideoMute", "muted", "", "onVideoPause", "onVideoPlay", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class NativeAdView$videoLifecycleCallbacks$1 extends C2411a {
    final /* synthetic */ NativeAdView this$0;

    NativeAdView$videoLifecycleCallbacks$1(NativeAdView nativeAdView) {
        this.this$0 = nativeAdView;
    }

    public void onVideoEnd() {
        super.onVideoEnd();
        this.this$0.getPlayPauseButton$Tinder_release().setImageResource(R.drawable.ic_replay);
        this.this$0.isPlaying = false;
        RecsNativeDfpAdController controller$Tinder_release = this.this$0.getController$Tinder_release();
        RecsNativeAd access$getAd$p = NativeAdView.access$getAd$p(this.this$0);
        if (!(access$getAd$p instanceof RecsNativeVideoAd)) {
            access$getAd$p = null;
        }
        controller$Tinder_release.onVideoEnd((RecsNativeVideoAd) access$getAd$p);
    }

    public void onVideoMute(boolean z) {
        super.onVideoMute(z);
        this.this$0.getMuteButton$Tinder_release().setImageResource(z ? true : true);
        z = this.this$0.getController$Tinder_release();
        RecsNativeAd access$getAd$p = NativeAdView.access$getAd$p(this.this$0);
        if (!(access$getAd$p instanceof RecsNativeVideoAd)) {
            access$getAd$p = null;
        }
        z.onVideoMuted((RecsNativeVideoAd) access$getAd$p);
    }

    public void onVideoPause() {
        super.onVideoPause();
        this.this$0.getPlayPauseButton$Tinder_release().setImageResource(R.drawable.ic_play);
    }

    public void onVideoPlay() {
        super.onVideoPlay();
        this.this$0.getPlayPauseButton$Tinder_release().setImageResource(R.drawable.ic_pause);
        RecsNativeDfpAdController controller$Tinder_release = this.this$0.getController$Tinder_release();
        RecsNativeAd access$getAd$p = NativeAdView.access$getAd$p(this.this$0);
        if (!(access$getAd$p instanceof RecsNativeVideoAd)) {
            access$getAd$p = null;
        }
        controller$Tinder_release.onVideoPlay((RecsNativeVideoAd) access$getAd$p);
    }
}
