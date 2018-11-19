package com.tinder.recsads.view;

import com.google.android.gms.ads.C2412j.C2411a;
import com.tinder.recsads.C14760n.C14757c;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"com/tinder/recsads/view/NativeVideoAdRecCard$videoLifecycleCallbacks$1", "Lcom/google/android/gms/ads/VideoController$VideoLifecycleCallbacks;", "(Lcom/tinder/recsads/view/NativeVideoAdRecCard;)V", "onVideoEnd", "", "onVideoMute", "muted", "", "onVideoPause", "onVideoPlay", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public final class NativeVideoAdRecCard$c extends C2411a {
    /* renamed from: a */
    final /* synthetic */ NativeVideoAdRecCard f51134a;

    NativeVideoAdRecCard$c(NativeVideoAdRecCard nativeVideoAdRecCard) {
        this.f51134a = nativeVideoAdRecCard;
    }

    public void onVideoEnd() {
        super.onVideoEnd();
        NativeVideoAdRecCard.b(this.f51134a).setImageResource(C14757c.ic_replay);
        NativeVideoAdRecCard.a(this.f51134a, false);
        NativeVideoAdRecCard$Listener listener = this.f51134a.getListener();
        if (listener != null) {
            listener.onVideoEnd(NativeVideoAdRecCard.c(this.f51134a));
        }
    }

    public void onVideoMute(boolean z) {
        super.onVideoMute(z);
        NativeVideoAdRecCard.d(this.f51134a).setImageResource(z ? C14757c.ic_volume_muted : C14757c.ic_volume);
        z = this.f51134a.getListener();
        if (z) {
            z.onVideoMuted(NativeVideoAdRecCard.c(this.f51134a));
        }
    }

    public void onVideoPause() {
        super.onVideoPause();
        NativeVideoAdRecCard.b(this.f51134a).setImageResource(C14757c.ic_play);
    }

    public void onVideoPlay() {
        super.onVideoPlay();
        NativeVideoAdRecCard.b(this.f51134a).setImageResource(C14757c.ic_pause);
        NativeVideoAdRecCard$Listener listener = this.f51134a.getListener();
        if (listener != null) {
            listener.onVideoPlay(NativeVideoAdRecCard.c(this.f51134a));
        }
    }
}
