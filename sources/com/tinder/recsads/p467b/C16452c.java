package com.tinder.recsads.p467b;

import com.facebook.ads.NativeAd;
import com.tinder.addy.Ad;
import com.tinder.addy.source.fan.FanAdLoader.AdFactory;
import com.tinder.recsads.model.C16466d;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/recsads/factory/RecsFanAdFactory;", "Lcom/tinder/addy/source/fan/FanAdLoader$AdFactory;", "()V", "create", "Lcom/tinder/addy/Ad;", "nativeAd", "Lcom/facebook/ads/NativeAd;", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.b.c */
public final class C16452c implements AdFactory {
    @NotNull
    public Ad create(@NotNull NativeAd nativeAd) {
        C2668g.b(nativeAd, "nativeAd");
        return new C16466d(nativeAd);
    }
}