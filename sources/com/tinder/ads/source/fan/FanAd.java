package com.tinder.ads.source.fan;

import com.facebook.ads.NativeAd;
import com.tinder.ads.Ad;
import com.tinder.ads.SourcePriority;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/ads/source/fan/FanAd;", "Lcom/tinder/ads/Ad;", "Lcom/tinder/ads/source/fan/FanSource;", "source", "nativeAd", "Lcom/facebook/ads/NativeAd;", "(Lcom/tinder/ads/source/fan/FanSource;Lcom/facebook/ads/NativeAd;)V", "getNativeAd", "()Lcom/facebook/ads/NativeAd;", "id", "", "priority", "Lcom/tinder/ads/SourcePriority;", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public abstract class FanAd implements Ad<FanSource> {
    @NotNull
    private final NativeAd nativeAd;
    private final FanSource source;

    public FanAd(@NotNull FanSource fanSource, @NotNull NativeAd nativeAd) {
        C2668g.b(fanSource, "source");
        C2668g.b(nativeAd, "nativeAd");
        this.source = fanSource;
        this.nativeAd = nativeAd;
    }

    @NotNull
    public final NativeAd getNativeAd() {
        return this.nativeAd;
    }

    @NotNull
    public FanSource source() {
        return this.source;
    }

    @NotNull
    public String id() {
        String id = this.nativeAd.getId();
        C2668g.a(id, "nativeAd.id");
        return id;
    }

    @NotNull
    public SourcePriority priority() {
        return SourcePriority.LOW;
    }
}
