package com.tinder.ads;

import com.tinder.recsads.model.C16469h;
import com.tinder.recsads.p467b.C16451a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/ads/AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener$AddyV2BrandedProfileCardAdMapper;", "", "brandedProfileCardAdFactory", "Lcom/tinder/recsads/factory/BrandedProfileCardAdFactory;", "(Lcom/tinder/recsads/factory/BrandedProfileCardAdFactory;)V", "map", "Lcom/tinder/recsads/model/V2BrandedProfileCardAd;", "v1BpcAd", "Lcom/tinder/ads/V1BrandedProfileCardAd;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.ads.AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener$AddyV2BrandedProfileCardAdMapper */
public final class C6193x7293fe {
    private final C16451a brandedProfileCardAdFactory;

    @Inject
    public C6193x7293fe(@NotNull C16451a c16451a) {
        C2668g.b(c16451a, "brandedProfileCardAdFactory");
        this.brandedProfileCardAdFactory = c16451a;
    }

    @NotNull
    public final C16469h map(@NotNull V1BrandedProfileCardAd v1BrandedProfileCardAd) {
        C2668g.b(v1BrandedProfileCardAd, "v1BpcAd");
        return this.brandedProfileCardAdFactory.a(v1BrandedProfileCardAd.getNativeCustomTemplateAd());
    }
}
