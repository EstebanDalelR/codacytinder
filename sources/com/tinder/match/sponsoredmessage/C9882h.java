package com.tinder.match.sponsoredmessage;

import android.arch.lifecycle.LifecycleObserver;
import com.tinder.addy.AdAggregator.Listener;
import com.tinder.addy.Addy;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.C6191a;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.PublisherAdRequestFactory;
import com.tinder.ads.AdAggregator;
import com.tinder.ads.AdAggregator.Builder;
import com.tinder.ads.DfpFieldsResolverImpl;
import com.tinder.ads.MessageAd.SponsoredMessageAdFactory;
import com.tinder.ads.NativeDfpSourceBuilderFactory;
import com.tinder.ads.SimpleSourceMediator;
import com.tinder.ads.SponsoredMessageTrackingUrlsAdAggregatorListener;
import com.tinder.ads.analytics.SponsoredMessageAnalyticsAdAggregatorListener;
import com.tinder.ads.module.AdsQualifiers$Match;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.domain.match.usecase.CreateMessageAdMatch;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.main.qualifier.MainActivityQualifier;
import com.tinder.match.p092d.C3942a;
import com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor.C12080a;
import com.tinder.match.sponsoredmessage.qualifier.SponsoredMessageQualifier;
import com.tinder.messageads.p296c.C13472c;
import com.tinder.module.Internal;
import com.tinder.recsads.rule.C18793c.C14761a;
import com.tinder.scope.ActivityScope;
import com.tinder.sponsoredmessage.AdRequestRule;
import com.tinder.sponsoredmessage.C15032a;
import com.tinder.sponsoredmessage.C15033d;
import com.tinder.sponsoredmessage.C15034e;
import com.tinder.sponsoredmessage.C16841b;
import com.tinder.sponsoredmessage.SponsoredMessageAdMonitor;
import com.tinder.sponsoredmessage.SponsoredMessageViewedCache;
import com.tinder.sponsoredmessage.lifecycle.observer.SponsoredMessageLifecycleObserver;
import com.tinder.sponsoredmessage.lifecycle.observer.V1SponsoredMessageLifecycleObserver;
import com.tinder.sponsoredmessage.p476b.p477a.C16839a;
import com.tinder.sponsoredmessage.p476b.p477a.C16840b;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoSet;
import io.paperdb.Book;
import io.paperdb.Paper;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\tJ\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eJ-\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\b\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007J?\u0010%\u001a\u00020&2\b\b\u0001\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0013\b\u0001\u0010,\u001a\r\u0012\t\u0012\u00070 ¢\u0006\u0002\b-0\u001f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J@\u0010.\u001a\u00020/2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010'\u001a\u00020\u001b2\u0006\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000204032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0004H\u0007J(\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020/H\u0007J8\u0010@\u001a\u00020A2\u0006\u0010:\u001a\u00020;2\u0006\u0010B\u001a\u00020&2\u0006\u0010C\u001a\u00020=2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0007J\b\u0010J\u001a\u00020+H\u0007¨\u0006K"}, d2 = {"Lcom/tinder/match/sponsoredmessage/SponsoredMessageModule;", "", "()V", "provideAdRequestRuleSet", "Lcom/tinder/sponsoredmessage/AdRequestRuleSet;", "cadenceRequestRule", "Lcom/tinder/match/sponsoredmessage/MessageAdCadenceRequestRule;", "intersticeRule", "Lcom/tinder/match/sponsoredmessage/MessageAdMinimumIntersticeRequestRule;", "provideAdRequestRuleSet$Tinder_release", "provideLegacyAdAggregator", "Lcom/tinder/ads/AdAggregator;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "provideLegacyAdAggregator$Tinder_release", "provideLegacySponsoredMessageAdRegistrar", "Lcom/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor$SponsoredMessageAdRegistrar;", "sponsoredMessageConfig", "Lcom/tinder/sponsoredmessage/SponsoredMessageConfig;", "adFactory", "Lcom/tinder/ads/MessageAd$SponsoredMessageAdFactory;", "dfpFieldsResolver", "Lcom/tinder/ads/DfpFieldsResolverImpl;", "dfpSourceBuilderFactory", "Lcom/tinder/ads/NativeDfpSourceBuilderFactory;", "provideLegacySponsoredMessageAdRegistrar$Tinder_release", "provideSponsoredMessageAdAggregator", "Lcom/tinder/addy/AdAggregator;", "addy", "Lcom/tinder/addy/Addy;", "provideSponsoredMessageAdAggregatorListeners", "", "Lcom/tinder/addy/AdAggregator$Listener;", "trackingUrlsAdAggregatorListener", "Lcom/tinder/ads/SponsoredMessageTrackingUrlsAdAggregatorListener;", "analyticsAdAggregatorListener", "Lcom/tinder/ads/analytics/SponsoredMessageAnalyticsAdAggregatorListener;", "provideSponsoredMessageAdMonitor", "Lcom/tinder/sponsoredmessage/SponsoredMessageAdMonitor;", "adAggregator", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "sponsoredMessageViewedCache", "Lcom/tinder/sponsoredmessage/SponsoredMessageViewedCache;", "adAggregatorListeners", "Lkotlin/jvm/JvmSuppressWildcards;", "provideSponsoredMessageAdsRegistrar", "Lcom/tinder/sponsoredmessage/SponsoredMessageAdsRegistrar;", "sponsoredMessageAdFactory", "Lcom/tinder/messageads/factory/SponsoredMessageAdFactory;", "nativeDfpLoaderBuilderProvider", "Ljavax/inject/Provider;", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$Builder;", "publisherAdRequestFactory", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$PublisherAdRequestFactory;", "requestRules", "provideSponsoredMessageLifecycleObserver", "Landroid/arch/lifecycle/LifecycleObserver;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "v1AdMonitor", "Lcom/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor;", "adMonitor", "registrar", "provideSponsoredMessageMainPageSelectedListener", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "sponsoredMessageAdMonitor", "v1SponsoredMessageAdMonitor", "legacyCreateMessageAdMatch", "Lcom/tinder/match/usecase/CreateMessageAdMatch;", "createMessageAdMatch", "Lcom/tinder/domain/match/usecase/CreateMessageAdMatch;", "messageAdMatchFactory", "Lcom/tinder/recsads/rule/AddyV2BrandedProfileCardMatchInsertionRule$MessageAdMatchFactory;", "provideSponsoredMessageViewedCache", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Internal
@Module
/* renamed from: com.tinder.match.sponsoredmessage.h */
public final class C9882h {
    @AdsQualifiers$Match
    @ActivityScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final AdAggregator m40660a(@NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        return new Builder().enabled(subscriptionProvider.get().isActiveSubscription() ^ 1).sourceMediator(new SimpleSourceMediator()).build();
    }

    @SponsoredMessageQualifier
    @ActivityScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final com.tinder.addy.AdAggregator m40659a(@NotNull Addy addy) {
        C2668g.b(addy, "addy");
        return addy.a().a();
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C12080a m40662a(@NotNull C15034e c15034e, @NotNull SponsoredMessageAdFactory sponsoredMessageAdFactory, @NotNull DfpFieldsResolverImpl dfpFieldsResolverImpl, @NotNull NativeDfpSourceBuilderFactory nativeDfpSourceBuilderFactory) {
        C2668g.b(c15034e, "sponsoredMessageConfig");
        C2668g.b(sponsoredMessageAdFactory, "adFactory");
        C2668g.b(dfpFieldsResolverImpl, "dfpFieldsResolver");
        C2668g.b(nativeDfpSourceBuilderFactory, "dfpSourceBuilderFactory");
        return new C12080a(c15034e, sponsoredMessageAdFactory, dfpFieldsResolverImpl, nativeDfpSourceBuilderFactory);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C15033d m40666a(@NotNull C15034e c15034e, @NotNull @SponsoredMessageQualifier com.tinder.addy.AdAggregator adAggregator, @NotNull C13472c c13472c, @NotNull Provider<C6191a> provider, @NotNull PublisherAdRequestFactory publisherAdRequestFactory, @NotNull C15032a c15032a) {
        C2668g.b(c15034e, "sponsoredMessageConfig");
        C2668g.b(adAggregator, "adAggregator");
        C2668g.b(c13472c, "sponsoredMessageAdFactory");
        C2668g.b(provider, "nativeDfpLoaderBuilderProvider");
        C2668g.b(publisherAdRequestFactory, "publisherAdRequestFactory");
        C2668g.b(c15032a, "requestRules");
        return new C15033d(c15034e, adAggregator, c13472c, provider, publisherAdRequestFactory, c15032a);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C15032a m40665a(@NotNull C12084b c12084b, @NotNull C12087e c12087e) {
        C2668g.b(c12084b, "cadenceRequestRule");
        C2668g.b(c12087e, "intersticeRule");
        return new C15032a(ak.a(new AdRequestRule[]{c12084b, c12087e}));
    }

    @IntoSet
    @MainActivityQualifier
    @NotNull
    @Provides
    /* renamed from: a */
    public final LifecycleObserver m40658a(@NotNull AbTestUtility abTestUtility, @NotNull V1SponsoredMessageAdMonitor v1SponsoredMessageAdMonitor, @NotNull SponsoredMessageAdMonitor sponsoredMessageAdMonitor, @NotNull C15033d c15033d) {
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(v1SponsoredMessageAdMonitor, "v1AdMonitor");
        C2668g.b(sponsoredMessageAdMonitor, "adMonitor");
        C2668g.b(c15033d, "registrar");
        if (abTestUtility.isAddyV2Enabled() != null) {
            return (LifecycleObserver) new SponsoredMessageLifecycleObserver(sponsoredMessageAdMonitor, c15033d);
        }
        return (LifecycleObserver) new V1SponsoredMessageLifecycleObserver(v1SponsoredMessageAdMonitor);
    }

    @NotNull
    @IntoSet
    @Provides
    /* renamed from: a */
    public final OnPageSelectedListener m40661a(@NotNull AbTestUtility abTestUtility, @NotNull SponsoredMessageAdMonitor sponsoredMessageAdMonitor, @NotNull V1SponsoredMessageAdMonitor v1SponsoredMessageAdMonitor, @NotNull C3942a c3942a, @NotNull CreateMessageAdMatch createMessageAdMatch, @NotNull C14761a c14761a) {
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(sponsoredMessageAdMonitor, "sponsoredMessageAdMonitor");
        C2668g.b(v1SponsoredMessageAdMonitor, "v1SponsoredMessageAdMonitor");
        C2668g.b(c3942a, "legacyCreateMessageAdMatch");
        C2668g.b(createMessageAdMatch, "createMessageAdMatch");
        C2668g.b(c14761a, "messageAdMatchFactory");
        if (abTestUtility.isAddyV2Enabled() != null) {
            return (OnPageSelectedListener) new C16839a(sponsoredMessageAdMonitor, c14761a, createMessageAdMatch);
        }
        return (OnPageSelectedListener) new C16840b(v1SponsoredMessageAdMonitor, c3942a);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final SponsoredMessageViewedCache m40664a() {
        Book book = Paper.book("sponsored_messages_ad_book");
        C2668g.a(book, "Paper.book(\"sponsored_messages_ad_book\")");
        return new C16841b(book);
    }

    @SponsoredMessageQualifier
    @ElementsIntoSet
    @NotNull
    @Provides
    /* renamed from: a */
    public final Set<Listener> m40667a(@NotNull SponsoredMessageTrackingUrlsAdAggregatorListener sponsoredMessageTrackingUrlsAdAggregatorListener, @NotNull SponsoredMessageAnalyticsAdAggregatorListener sponsoredMessageAnalyticsAdAggregatorListener) {
        C2668g.b(sponsoredMessageTrackingUrlsAdAggregatorListener, "trackingUrlsAdAggregatorListener");
        C2668g.b(sponsoredMessageAnalyticsAdAggregatorListener, "analyticsAdAggregatorListener");
        return ak.a(new Listener[]{sponsoredMessageTrackingUrlsAdAggregatorListener, sponsoredMessageAnalyticsAdAggregatorListener});
    }

    @ActivityScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final SponsoredMessageAdMonitor m40663a(@NotNull @SponsoredMessageQualifier com.tinder.addy.AdAggregator adAggregator, @NotNull LoadProfileOptionData loadProfileOptionData, @NotNull SponsoredMessageViewedCache sponsoredMessageViewedCache, @NotNull @SponsoredMessageQualifier Set<Listener> set, @NotNull C15034e c15034e) {
        C2668g.b(adAggregator, "adAggregator");
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        C2668g.b(sponsoredMessageViewedCache, "sponsoredMessageViewedCache");
        C2668g.b(set, "adAggregatorListeners");
        C2668g.b(c15034e, "sponsoredMessageConfig");
        return new SponsoredMessageAdMonitor(adAggregator, loadProfileOptionData, sponsoredMessageViewedCache, set, c15034e);
    }
}
