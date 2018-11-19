package com.tinder.ads.source.dfp;

import com.google.android.gms.ads.formats.NativeAdOptions;
import kotlin.Metadata;
import rx.SingleEmitter;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lrx/SingleEmitter;", "Lcom/tinder/ads/source/dfp/NativeDfpAd;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 7})
final class NativeDfpAdSourceFetcher$loadNext$1<T> implements Action1<SingleEmitter<T>> {
    final /* synthetic */ NativeAdOptions $options;
    final /* synthetic */ NativeDfpAdSourceFetcher this$0;

    NativeDfpAdSourceFetcher$loadNext$1(NativeDfpAdSourceFetcher nativeDfpAdSourceFetcher, NativeAdOptions nativeAdOptions) {
        this.this$0 = nativeDfpAdSourceFetcher;
        this.$options = nativeAdOptions;
    }

    public final void call(SingleEmitter<NativeDfpAd> singleEmitter) {
        this.this$0.adLoaderBuilder.a(this.this$0.templateId, new NativeDfpAdSourceFetcher$loadNext$1$adLoader$1(this, singleEmitter), NativeDfpAdSourceFetcher$loadNext$1$adLoader$2.INSTANCE).a(new NativeDfpAdSourceFetcher$loadNext$1$adLoader$3(singleEmitter)).a(this.$options).a().a(this.this$0.publisherAdRequest);
    }
}
