package com.tinder.ads.source.dfp;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.tinder.ads.source.dfp.NativeDfpSource.NativeDfpAdFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.SingleEmitter;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "nativeCustomTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "kotlin.jvm.PlatformType", "onCustomTemplateAdLoaded"}, k = 3, mv = {1, 1, 7})
final class NativeDfpAdSourceFetcher$loadNext$1$adLoader$1 implements OnCustomTemplateAdLoadedListener {
    final /* synthetic */ SingleEmitter $emitter;
    final /* synthetic */ NativeDfpAdSourceFetcher$loadNext$1 this$0;

    NativeDfpAdSourceFetcher$loadNext$1$adLoader$1(NativeDfpAdSourceFetcher$loadNext$1 nativeDfpAdSourceFetcher$loadNext$1, SingleEmitter singleEmitter) {
        this.this$0 = nativeDfpAdSourceFetcher$loadNext$1;
        this.$emitter = singleEmitter;
    }

    public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
        NativeDfpAdFactory access$getAdFactory$p = this.this$0.this$0.adFactory;
        NativeDfpSource access$getNativeDfpSource$p = this.this$0.this$0.nativeDfpSource;
        C2668g.a(nativeCustomTemplateAd, "nativeCustomTemplateAd");
        this.$emitter.onSuccess((NativeDfpAd) access$getAdFactory$p.createAd(access$getNativeDfpSource$p, nativeCustomTemplateAd));
    }
}
