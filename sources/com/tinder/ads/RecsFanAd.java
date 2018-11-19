package com.tinder.ads;

import com.facebook.ads.NativeAd;
import com.tinder.ads.Ad.AdType;
import com.tinder.ads.source.fan.FanAd;
import com.tinder.ads.source.fan.FanAdFactory;
import com.tinder.ads.source.fan.FanSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/tinder/ads/RecsFanAd;", "Lcom/tinder/ads/source/fan/FanAd;", "source", "Lcom/tinder/ads/source/fan/FanSource;", "nativeAd", "Lcom/facebook/ads/NativeAd;", "(Lcom/tinder/ads/source/fan/FanSource;Lcom/facebook/ads/NativeAd;)V", "adType", "Lcom/tinder/ads/Ad$AdType;", "Factory", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsFanAd extends FanAd {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/ads/RecsFanAd$Factory;", "Lcom/tinder/ads/source/fan/FanAdFactory;", "()V", "createAd", "Lcom/tinder/ads/source/fan/FanAd;", "source", "Lcom/tinder/ads/source/fan/FanSource;", "wrapped", "Lcom/facebook/ads/NativeAd;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Factory extends FanAdFactory {
        @NotNull
        public FanAd createAd(@NotNull FanSource fanSource, @NotNull NativeAd nativeAd) {
            C2668g.b(fanSource, "source");
            C2668g.b(nativeAd, "wrapped");
            return new RecsFanAd(fanSource, nativeAd);
        }
    }

    public RecsFanAd(@NotNull FanSource fanSource, @NotNull NativeAd nativeAd) {
        C2668g.b(fanSource, "source");
        C2668g.b(nativeAd, "nativeAd");
        super(fanSource, nativeAd);
    }

    @NotNull
    public AdType adType() {
        return TinderAdType.REC_FAN;
    }
}
