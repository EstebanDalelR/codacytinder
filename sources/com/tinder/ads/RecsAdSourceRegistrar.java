package com.tinder.ads;

import com.tinder.ads.RecsNativeVideoAd.ValidationRule;
import com.tinder.ads.V1BrandedProfileCardAd.Factory;
import com.tinder.ads.module.AdsQualifiers$Recs;
import com.tinder.ads.source.dfp.BannerDfpSource.Builder;
import com.tinder.ads.source.dfp.DfpCustomTargetingValues;
import com.tinder.ads.source.dfp.NativeDfpSource;
import com.tinder.ads.source.dfp.NativeDfpSource.NativeDfpAdFactory;
import com.tinder.ads.source.fan.FanSource;
import com.tinder.ads.validation.AdValidator.Rule;
import com.tinder.recsads.RecsAdsRegistrar;
import com.tinder.recsads.model.C14754b;
import com.tinder.recsads.model.RecsAdsConfig;
import com.tinder.utils.RxUtils;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Subscription;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BY\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J,\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0002J\b\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020*2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/tinder/ads/RecsAdSourceRegistrar;", "Lcom/tinder/ads/AdRegistrar;", "Lcom/tinder/recsads/RecsAdsRegistrar;", "adAggregator", "Lcom/tinder/ads/AdAggregator;", "adsConfig", "Lcom/tinder/recsads/model/RecsAdsConfig;", "dfpFieldsResolver", "Lcom/tinder/ads/DfpFieldsResolverImpl;", "dfpSourceBuilder", "Lcom/tinder/ads/source/dfp/BannerDfpSource$Builder;", "nativeDfpSourceBuilderFactory", "Lcom/tinder/ads/NativeDfpSourceBuilderFactory;", "fanAdFactory", "Lcom/tinder/ads/RecsFanAd$Factory;", "nativeVideoAdFactory", "Lcom/tinder/ads/RecsNativeVideoAd$Factory;", "nativeDisplayAdFactory", "Lcom/tinder/ads/RecsNativeDisplayAd$Factory;", "brandedProfileCardFactory", "Lcom/tinder/ads/V1BrandedProfileCardAd$Factory;", "fanSourceBuilder", "Lcom/tinder/ads/source/fan/FanSource$Builder;", "(Lcom/tinder/ads/AdAggregator;Lcom/tinder/recsads/model/RecsAdsConfig;Lcom/tinder/ads/DfpFieldsResolverImpl;Lcom/tinder/ads/source/dfp/BannerDfpSource$Builder;Lcom/tinder/ads/NativeDfpSourceBuilderFactory;Lcom/tinder/ads/RecsFanAd$Factory;Lcom/tinder/ads/RecsNativeVideoAd$Factory;Lcom/tinder/ads/RecsNativeDisplayAd$Factory;Lcom/tinder/ads/V1BrandedProfileCardAd$Factory;Lcom/tinder/ads/source/fan/FanSource$Builder;)V", "dfpFieldsResolverSubscription", "Lrx/Subscription;", "createDfpSources", "", "Lcom/tinder/ads/AdSource;", "dfpAdFields", "Lcom/tinder/recsads/model/DfpAdFields;", "createFanSource", "Lcom/tinder/ads/source/fan/FanSource;", "createNativeDfpSource", "Lcom/tinder/ads/source/dfp/NativeDfpSource;", "templateId", "", "adFactory", "Lcom/tinder/ads/source/dfp/NativeDfpSource$NativeDfpAdFactory;", "validationRule", "Lcom/tinder/ads/validation/AdValidator$Rule;", "register", "", "registerAdSources", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsAdSourceRegistrar extends AdRegistrar implements RecsAdsRegistrar {
    private final AdAggregator adAggregator;
    private final RecsAdsConfig adsConfig;
    private final Factory brandedProfileCardFactory;
    private final DfpFieldsResolverImpl dfpFieldsResolver;
    private Subscription dfpFieldsResolverSubscription;
    private final Builder dfpSourceBuilder;
    private final RecsFanAd.Factory fanAdFactory;
    private final FanSource.Builder fanSourceBuilder;
    private final NativeDfpSourceBuilderFactory nativeDfpSourceBuilderFactory;
    private final RecsNativeDisplayAd.Factory nativeDisplayAdFactory;
    private final RecsNativeVideoAd.Factory nativeVideoAdFactory;

    @Inject
    public RecsAdSourceRegistrar(@NotNull @AdsQualifiers$Recs AdAggregator adAggregator, @NotNull RecsAdsConfig recsAdsConfig, @NotNull DfpFieldsResolverImpl dfpFieldsResolverImpl, @NotNull Builder builder, @NotNull NativeDfpSourceBuilderFactory nativeDfpSourceBuilderFactory, @NotNull RecsFanAd.Factory factory, @NotNull RecsNativeVideoAd.Factory factory2, @NotNull RecsNativeDisplayAd.Factory factory3, @NotNull Factory factory4, @NotNull FanSource.Builder builder2) {
        C2668g.b(adAggregator, "adAggregator");
        C2668g.b(recsAdsConfig, "adsConfig");
        C2668g.b(dfpFieldsResolverImpl, "dfpFieldsResolver");
        C2668g.b(builder, "dfpSourceBuilder");
        C2668g.b(nativeDfpSourceBuilderFactory, "nativeDfpSourceBuilderFactory");
        C2668g.b(factory, "fanAdFactory");
        C2668g.b(factory2, "nativeVideoAdFactory");
        C2668g.b(factory3, "nativeDisplayAdFactory");
        C2668g.b(factory4, "brandedProfileCardFactory");
        C2668g.b(builder2, "fanSourceBuilder");
        this.adAggregator = adAggregator;
        this.adsConfig = recsAdsConfig;
        this.dfpFieldsResolver = dfpFieldsResolverImpl;
        this.dfpSourceBuilder = builder;
        this.nativeDfpSourceBuilderFactory = nativeDfpSourceBuilderFactory;
        this.fanAdFactory = factory;
        this.nativeVideoAdFactory = factory2;
        this.nativeDisplayAdFactory = factory3;
        this.brandedProfileCardFactory = factory4;
        this.fanSourceBuilder = builder2;
    }

    public void register() {
        registerAdSources(this.adAggregator);
    }

    public void registerAdSources(@NotNull AdAggregator adAggregator) {
        Object obj;
        C2668g.b(adAggregator, "adAggregator");
        if (this.adsConfig.isFanEnabled()) {
            adAggregator.addSource(createFanSource());
        }
        if (!(this.adsConfig.isNativeVideoDfpEnabled() || this.adsConfig.isNativeDisplayDfpEnabled() || this.adsConfig.isBrandedProfileCardEnabled())) {
            if (!this.adsConfig.shouldShowHouseAds()) {
                obj = null;
                if (obj != null && !RxUtils.a(this.dfpFieldsResolverSubscription)) {
                    this.dfpFieldsResolverSubscription = this.dfpFieldsResolver.resolveDfpFields().b(Schedulers.io()).a(new RecsAdSourceRegistrar$registerAdSources$1(this, adAggregator), (Action1) RecsAdSourceRegistrar$registerAdSources$2.INSTANCE);
                    return;
                }
            }
        }
        obj = 1;
        if (obj != null) {
        }
    }

    private final FanSource createFanSource() {
        FanSource.Builder builder = this.fanSourceBuilder;
        String fanPlacementId = this.adsConfig.fanPlacementId();
        C2668g.a(fanPlacementId, "adsConfig.fanPlacementId()");
        return builder.placementId(fanPlacementId).adFactory(this.fanAdFactory).build();
    }

    private final List<AdSource> createDfpSources(C14754b c14754b) {
        List<AdSource> arrayList = new ArrayList();
        if (this.adsConfig.isNativeVideoDfpEnabled()) {
            String nativeVideoDfpTemplateId = this.adsConfig.nativeVideoDfpTemplateId();
            C2668g.a(nativeVideoDfpTemplateId, "adsConfig.nativeVideoDfpTemplateId()");
            arrayList.add(createNativeDfpSource(c14754b, nativeVideoDfpTemplateId, this.nativeVideoAdFactory, new ValidationRule()));
        }
        if (this.adsConfig.isNativeDisplayDfpEnabled() && this.adsConfig.isSwipeToOpenEnabled()) {
            nativeVideoDfpTemplateId = this.adsConfig.nativeDisplayDfpTeplateId();
            C2668g.a(nativeVideoDfpTemplateId, "adsConfig.nativeDisplayDfpTeplateId()");
            arrayList.add(createNativeDfpSource(c14754b, nativeVideoDfpTemplateId, this.nativeDisplayAdFactory, new RecsNativeDisplayAd.ValidationRule()));
        }
        if (this.adsConfig.shouldShowHouseAds()) {
            nativeVideoDfpTemplateId = this.adsConfig.houseNativeVideoDfpTemplateId();
            C2668g.a(nativeVideoDfpTemplateId, "adsConfig.houseNativeVideoDfpTemplateId()");
            arrayList.add(createNativeDfpSource(c14754b, nativeVideoDfpTemplateId, this.nativeVideoAdFactory, new ValidationRule()));
            if (this.adsConfig.isSwipeToOpenEnabled()) {
                nativeVideoDfpTemplateId = this.adsConfig.houseNativeDisplayDfpTemplateId();
                C2668g.a(nativeVideoDfpTemplateId, "adsConfig.houseNativeDisplayDfpTemplateId()");
                arrayList.add(createNativeDfpSource(c14754b, nativeVideoDfpTemplateId, this.nativeDisplayAdFactory, new RecsNativeDisplayAd.ValidationRule()));
            }
        }
        if (this.adsConfig.isBrandedProfileCardEnabled()) {
            String brandedProfileCardTemplateId = this.adsConfig.brandedProfileCardTemplateId();
            C2668g.a(brandedProfileCardTemplateId, "adsConfig.brandedProfileCardTemplateId()");
            arrayList.add(createNativeDfpSource$default(this, c14754b, brandedProfileCardTemplateId, this.brandedProfileCardFactory, null, 8, null));
        }
        return arrayList;
    }

    static /* synthetic */ NativeDfpSource createNativeDfpSource$default(RecsAdSourceRegistrar recsAdSourceRegistrar, C14754b c14754b, String str, NativeDfpAdFactory nativeDfpAdFactory, Rule rule, int i, Object obj) {
        if ((i & 8) != 0) {
            rule = null;
        }
        return recsAdSourceRegistrar.createNativeDfpSource(c14754b, str, nativeDfpAdFactory, rule);
    }

    private final NativeDfpSource createNativeDfpSource(C14754b c14754b, String str, NativeDfpAdFactory nativeDfpAdFactory, Rule rule) {
        NativeDfpSource.Builder newBuilder = this.nativeDfpSourceBuilderFactory.newBuilder();
        String googleDfpAdsUnitId = this.adsConfig.googleDfpAdsUnitId();
        C2668g.a(googleDfpAdsUnitId, "adsConfig.googleDfpAdsUnitId()");
        c14754b = newBuilder.adsUnitId(googleDfpAdsUnitId).templateId(str).adFactory(nativeDfpAdFactory).location(c14754b.a()).customTargetingValues(new DfpCustomTargetingValues(c14754b.b(), c14754b.c()));
        if (rule != null) {
            c14754b.addValidationRule(rule);
        }
        return c14754b.build();
    }
}
