package com.tinder.recsads;

import com.tinder.addy.AdAggregator;
import com.tinder.addy.AdLoader;
import com.tinder.addy.LoaderPriority;
import com.tinder.addy.source.fan.FanAdLoader;
import com.tinder.addy.source.fan.FanAdLoader.C6190a;
import com.tinder.addy.source.nativedfp.NativeDfpLoader;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.AdFactory;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.C6191a;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.PublisherAdRequestFactory;
import com.tinder.recsads.model.RecsAdsConfig;
import com.tinder.recsads.p467b.C16451a;
import com.tinder.recsads.p467b.C16452c;
import com.tinder.recsads.p467b.C16453e;
import com.tinder.recsads.p467b.C16454g;
import com.tinder.recsads.p467b.C16455i;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/recsads/RecsAdLoaderRegistrar;", "Lcom/tinder/recsads/RecsAdsRegistrar;", "adsConfig", "Lcom/tinder/recsads/model/RecsAdsConfig;", "adAggregator", "Lcom/tinder/addy/AdAggregator;", "brandedProfileCardAdFactory", "Lcom/tinder/recsads/factory/BrandedProfileCardAdFactory;", "nativeDfpLoaderBuilderProvider", "Ljavax/inject/Provider;", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$Builder;", "fanAdLoaderBuilderProvider", "Lcom/tinder/addy/source/fan/FanAdLoader$Builder;", "recsNativeVideoAdFactory", "Lcom/tinder/recsads/factory/RecsNativeVideoAdFactory;", "recsFanVideoAdFactory", "Lcom/tinder/recsads/factory/RecsFanVideoAdFactory;", "recsFanAdFactory", "Lcom/tinder/recsads/factory/RecsFanAdFactory;", "recsNativeDisplayAFactory", "Lcom/tinder/recsads/factory/RecsNativeDisplayAdFactory;", "publisherAdRequestFactory", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$PublisherAdRequestFactory;", "(Lcom/tinder/recsads/model/RecsAdsConfig;Lcom/tinder/addy/AdAggregator;Lcom/tinder/recsads/factory/BrandedProfileCardAdFactory;Ljavax/inject/Provider;Ljavax/inject/Provider;Lcom/tinder/recsads/factory/RecsNativeVideoAdFactory;Lcom/tinder/recsads/factory/RecsFanVideoAdFactory;Lcom/tinder/recsads/factory/RecsFanAdFactory;Lcom/tinder/recsads/factory/RecsNativeDisplayAdFactory;Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$PublisherAdRequestFactory;)V", "createDfpSources", "", "Lcom/tinder/addy/AdLoader;", "createFanStaticLoader", "Lcom/tinder/addy/source/fan/FanAdLoader;", "createFanVideoLoader", "createNativeDfpLoader", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader;", "templateId", "", "adFactory", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$AdFactory;", "register", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.o */
public class C16470o implements RecsAdsRegistrar {
    /* renamed from: a */
    private final RecsAdsConfig f51095a;
    /* renamed from: b */
    private final AdAggregator f51096b;
    /* renamed from: c */
    private final C16451a f51097c;
    /* renamed from: d */
    private final Provider<C6191a> f51098d;
    /* renamed from: e */
    private final Provider<C6190a> f51099e;
    /* renamed from: f */
    private final C16455i f51100f;
    /* renamed from: g */
    private final C16453e f51101g;
    /* renamed from: h */
    private final C16452c f51102h;
    /* renamed from: i */
    private final C16454g f51103i;
    /* renamed from: j */
    private final PublisherAdRequestFactory f51104j;

    public C16470o(@NotNull RecsAdsConfig recsAdsConfig, @NotNull AdAggregator adAggregator, @NotNull C16451a c16451a, @NotNull Provider<C6191a> provider, @NotNull Provider<C6190a> provider2, @NotNull C16455i c16455i, @NotNull C16453e c16453e, @NotNull C16452c c16452c, @NotNull C16454g c16454g, @NotNull PublisherAdRequestFactory publisherAdRequestFactory) {
        C2668g.b(recsAdsConfig, "adsConfig");
        C2668g.b(adAggregator, "adAggregator");
        C2668g.b(c16451a, "brandedProfileCardAdFactory");
        C2668g.b(provider, "nativeDfpLoaderBuilderProvider");
        C2668g.b(provider2, "fanAdLoaderBuilderProvider");
        C2668g.b(c16455i, "recsNativeVideoAdFactory");
        C2668g.b(c16453e, "recsFanVideoAdFactory");
        C2668g.b(c16452c, "recsFanAdFactory");
        C2668g.b(c16454g, "recsNativeDisplayAFactory");
        C2668g.b(publisherAdRequestFactory, "publisherAdRequestFactory");
        this.f51095a = recsAdsConfig;
        this.f51096b = adAggregator;
        this.f51097c = c16451a;
        this.f51098d = provider;
        this.f51099e = provider2;
        this.f51100f = c16455i;
        this.f51101g = c16453e;
        this.f51102h = c16452c;
        this.f51103i = c16454g;
        this.f51104j = publisherAdRequestFactory;
    }

    public void register() {
        Object obj;
        if (this.f51095a.isFanEnabled()) {
            this.f51096b.a(m61889a());
        }
        if (this.f51095a.isFanVideoEnabled()) {
            this.f51096b.a(m61891b());
        }
        if (!(this.f51095a.isNativeVideoDfpEnabled() || this.f51095a.isNativeDisplayDfpEnabled() || this.f51095a.isBrandedProfileCardEnabled())) {
            if (!this.f51095a.shouldShowHouseAds()) {
                obj = null;
                if (obj != null) {
                    for (AdLoader a : m61892c()) {
                        this.f51096b.a(a);
                    }
                }
            }
        }
        obj = 1;
        if (obj != null) {
            while (r0.hasNext()) {
                this.f51096b.a(a);
            }
        }
    }

    /* renamed from: a */
    private final FanAdLoader m61889a() {
        C6190a c6190a = (C6190a) this.f51099e.get();
        String fanPlacementId = this.f51095a.fanPlacementId();
        C2668g.a(fanPlacementId, "adsConfig.fanPlacementId()");
        return c6190a.a(fanPlacementId).a(1).a(this.f51102h).a(LoaderPriority.LOW).a();
    }

    /* renamed from: b */
    private final FanAdLoader m61891b() {
        C6190a c6190a = (C6190a) this.f51099e.get();
        String fanVideoPlacementId = this.f51095a.fanVideoPlacementId();
        C2668g.a(fanVideoPlacementId, "adsConfig.fanVideoPlacementId()");
        return c6190a.a(fanVideoPlacementId).a(1).a(this.f51101g).a(LoaderPriority.LOW).a();
    }

    /* renamed from: c */
    private final List<AdLoader> m61892c() {
        List arrayList = new ArrayList();
        if (this.f51095a.isNativeVideoDfpEnabled()) {
            String nativeVideoDfpTemplateId = this.f51095a.nativeVideoDfpTemplateId();
            C2668g.a(nativeVideoDfpTemplateId, "adsConfig.nativeVideoDfpTemplateId()");
            arrayList.add(m61890a(nativeVideoDfpTemplateId, this.f51100f));
        }
        if (this.f51095a.isNativeDisplayDfpEnabled() && this.f51095a.isSwipeToOpenEnabled()) {
            nativeVideoDfpTemplateId = this.f51095a.nativeDisplayDfpTeplateId();
            C2668g.a(nativeVideoDfpTemplateId, "adsConfig.nativeDisplayDfpTeplateId()");
            arrayList.add(m61890a(nativeVideoDfpTemplateId, this.f51103i));
        }
        if (this.f51095a.isBrandedProfileCardEnabled()) {
            nativeVideoDfpTemplateId = this.f51095a.brandedProfileCardTemplateId();
            C2668g.a(nativeVideoDfpTemplateId, "adsConfig.brandedProfileCardTemplateId()");
            arrayList.add(m61890a(nativeVideoDfpTemplateId, this.f51097c));
        }
        if (this.f51095a.shouldShowHouseAds()) {
            nativeVideoDfpTemplateId = this.f51095a.houseNativeVideoDfpTemplateId();
            C2668g.a(nativeVideoDfpTemplateId, "adsConfig.houseNativeVideoDfpTemplateId()");
            arrayList.add(m61890a(nativeVideoDfpTemplateId, this.f51100f));
            if (this.f51095a.isSwipeToOpenEnabled()) {
                nativeVideoDfpTemplateId = this.f51095a.houseNativeDisplayDfpTemplateId();
                C2668g.a(nativeVideoDfpTemplateId, "adsConfig.houseNativeDisplayDfpTemplateId()");
                arrayList.add(m61890a(nativeVideoDfpTemplateId, this.f51103i));
            }
        }
        return C19299w.m68840l(arrayList);
    }

    /* renamed from: a */
    private final NativeDfpLoader m61890a(String str, AdFactory adFactory) {
        C6191a c6191a = (C6191a) this.f51098d.get();
        String googleDfpAdsUnitId = this.f51095a.googleDfpAdsUnitId();
        C2668g.a(googleDfpAdsUnitId, "adsConfig.googleDfpAdsUnitId()");
        return c6191a.a(googleDfpAdsUnitId).b(str).a(adFactory).a(LoaderPriority.HIGH).a(this.f51104j).a();
    }
}
