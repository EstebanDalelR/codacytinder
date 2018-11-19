package com.tinder.module;

import android.arch.lifecycle.LifecycleObserver;
import android.content.Context;
import android.content.SharedPreferences;
import com.tinder.addy.AdAggregator.Listener;
import com.tinder.addy.Addy;
import com.tinder.addy.Addy.C6179a;
import com.tinder.addy.persistence.PersistenceStrategy;
import com.tinder.addy.source.fan.FanAdLoader.C6190a;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.C6191a;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.PublisherAdRequestFactory;
import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.addy.tracker.C7306b;
import com.tinder.addy.tracker.TrackingUrlsDecorator;
import com.tinder.ads.AdAggregator;
import com.tinder.ads.AdAggregator$Listener;
import com.tinder.ads.AdAggregator.Builder;
import com.tinder.ads.AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener;
import com.tinder.ads.AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener;
import com.tinder.ads.BrandedProfileCardTrackingUrlsAdAggregatorListener;
import com.tinder.ads.DfpPublisherAdRequestFactory;
import com.tinder.ads.NativeVideoAndDisplayTrackingUrlAdAggregatorListener;
import com.tinder.ads.SimpleSourceMediator;
import com.tinder.ads.SourceMediator;
import com.tinder.ads.TrackingUrlNotifierClient;
import com.tinder.ads.UserAgentPreferencesCache;
import com.tinder.ads.V1BrandedProfileCardMatchInsertionRule;
import com.tinder.ads.V1BrandedProfileCardMatchInsertionRule.MessageAdMatchFactory;
import com.tinder.ads.V1RecsAdsMonitor;
import com.tinder.ads.analytics.AnalyticsAdAggregatorListener;
import com.tinder.ads.analytics.V1AnalyticsAdAggregatorListener;
import com.tinder.ads.lifecycle.observer.DfpUserAgentRetrieverLifecycleObserver;
import com.tinder.ads.module.AdsQualifiers$Recs;
import com.tinder.api.module.OkHttpQualifiers$GoogleDfpTracking;
import com.tinder.api.module.OkHttpQualifiers$Public;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.ads.C8618a;
import com.tinder.data.ads.TrackingUrlNotifier;
import com.tinder.data.match.aj;
import com.tinder.domain.match.usecase.CreateMessageAdMatch;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.main.qualifier.MainActivityQualifier;
import com.tinder.match.sponsoredmessage.C12088g;
import com.tinder.match.sponsoredmessage.ViewedSponsoredMessageCache;
import com.tinder.messageads.C12113a;
import com.tinder.messageads.UserAgentCache;
import com.tinder.messageads.p349f.C12126a;
import com.tinder.recs.V1AdRecsInjector;
import com.tinder.recsads.C16472p;
import com.tinder.recsads.RecsAdsMonitor;
import com.tinder.recsads.model.RecsAdsConfig;
import com.tinder.recsads.rule.AdRecsInjector;
import com.tinder.recsads.rule.BrandedProfileCardMatchInsertionRule;
import com.tinder.recsads.rule.C16473e;
import com.tinder.recsads.rule.C18793c;
import com.tinder.recsads.rule.C18793c.C14761a;
import com.tinder.sponsoredmessage.p478c.C16842a;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoSet;
import io.paperdb.Paper;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Singleton;
import okhttp3.C17692o;

@Published
@Module(includes = {C8618a.class})
/* renamed from: com.tinder.module.d */
public class C9940d {
    @Provides
    /* renamed from: a */
    PublisherAdRequestFactory m40856a(DfpPublisherAdRequestFactory dfpPublisherAdRequestFactory) {
        return dfpPublisherAdRequestFactory;
    }

    @Singleton
    @AdsQualifiers$Recs
    @Provides
    /* renamed from: a */
    AdAggregator m40858a(Builder builder, SourceMediator sourceMediator, SubscriptionProvider subscriptionProvider) {
        return builder.sourceMediator(sourceMediator).enabled(subscriptionProvider.get().isActiveSubscription() ^ 1).build();
    }

    @Singleton
    @AdsQualifiers$Recs
    @Provides
    /* renamed from: a */
    com.tinder.addy.AdAggregator m40854a(Addy addy) {
        return addy.a().a();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    RecsAdsMonitor m40863a(AbTestUtility abTestUtility, @AdsQualifiers$Recs com.tinder.addy.AdAggregator adAggregator, LoadProfileOptionData loadProfileOptionData, @AdsQualifiers$Recs AdAggregator adAggregator2, SubscriptionProvider subscriptionProvider, Set<AdAggregator$Listener> set, @AdsQualifiers$Recs Set<Listener> set2, RecsAdsConfig recsAdsConfig) {
        if (abTestUtility.isAddyV2Enabled() != null) {
            return new C16472p(adAggregator, loadProfileOptionData, set2, recsAdsConfig);
        }
        return new V1RecsAdsMonitor(adAggregator2, subscriptionProvider, set);
    }

    @ElementsIntoSet
    @Provides
    /* renamed from: a */
    Set<AdAggregator$Listener> m40867a(V1AnalyticsAdAggregatorListener v1AnalyticsAdAggregatorListener, AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener addyV2BrandedProfileCardTrackingUrlAdAggregatorListener, AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener addyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener) {
        return new HashSet(Arrays.asList(new AdAggregator$Listener[]{v1AnalyticsAdAggregatorListener, addyV2BrandedProfileCardTrackingUrlAdAggregatorListener, addyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener}));
    }

    @ElementsIntoSet
    @AdsQualifiers$Recs
    @Provides
    /* renamed from: a */
    Set<Listener> m40866a(AnalyticsAdAggregatorListener analyticsAdAggregatorListener, BrandedProfileCardTrackingUrlsAdAggregatorListener brandedProfileCardTrackingUrlsAdAggregatorListener, NativeVideoAndDisplayTrackingUrlAdAggregatorListener nativeVideoAndDisplayTrackingUrlAdAggregatorListener) {
        return new HashSet(Arrays.asList(new Listener[]{analyticsAdAggregatorListener, brandedProfileCardTrackingUrlsAdAggregatorListener, nativeVideoAndDisplayTrackingUrlAdAggregatorListener}));
    }

    @Provides
    /* renamed from: a */
    SourceMediator m40859a() {
        return new SimpleSourceMediator();
    }

    @Provides
    /* renamed from: b */
    Builder m40872b() {
        return new Builder();
    }

    @Provides
    /* renamed from: c */
    ViewedSponsoredMessageCache m40873c() {
        return new C12088g(Paper.book("sponsored_messages_book"));
    }

    @Singleton
    @Provides
    /* renamed from: a */
    TrackingUrlNotifier m40860a(@OkHttpQualifiers$GoogleDfpTracking C17692o c17692o) {
        return new TrackingUrlNotifierClient(c17692o);
    }

    @Singleton
    @OkHttpQualifiers$GoogleDfpTracking
    @Provides
    /* renamed from: a */
    C17692o m40869a(@OkHttpQualifiers$Public C17692o c17692o, C12113a c12113a) {
        return c17692o.z().a(c12113a).b();
    }

    @Provides
    /* renamed from: a */
    C12113a m40862a(UserAgentCache userAgentCache) {
        return new C12113a("9.4.1", userAgentCache);
    }

    @Provides
    /* renamed from: a */
    UserAgentCache m40861a(@Default SharedPreferences sharedPreferences) {
        return new UserAgentPreferencesCache(sharedPreferences);
    }

    @Provides
    /* renamed from: a */
    AdRecsInjector m40864a(AbTestUtility abTestUtility, @AdsQualifiers$Recs com.tinder.addy.AdAggregator adAggregator, @AdsQualifiers$Recs AdAggregator adAggregator2, RecsEngineRegistry recsEngineRegistry, RecsAdsConfig recsAdsConfig) {
        if (abTestUtility.isAddyV2Enabled() != null) {
            return new C16473e(adAggregator, recsEngineRegistry.getEngine(Core.INSTANCE), recsAdsConfig);
        }
        return new V1AdRecsInjector(adAggregator2, recsEngineRegistry.getEngine(Core.INSTANCE), recsAdsConfig);
    }

    @Provides
    /* renamed from: a */
    BrandedProfileCardMatchInsertionRule m40865a(AbTestUtility abTestUtility, CreateMessageAdMatch createMessageAdMatch, C14761a c14761a, MessageAdMatchFactory messageAdMatchFactory, aj ajVar, AdUrlTracker adUrlTracker) {
        if (abTestUtility.isAddyV2Enabled() != null) {
            return new C18793c(createMessageAdMatch, c14761a, ajVar, adUrlTracker);
        }
        return new V1BrandedProfileCardMatchInsertionRule(createMessageAdMatch, messageAdMatchFactory, ajVar, adUrlTracker);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    Addy m40855a(@ForApplication Context context, @OkHttpQualifiers$GoogleDfpTracking C17692o c17692o, Set<TrackingUrlsDecorator> set, Set<AdUrlTracker.Listener> set2) {
        context = new C6179a(context).a(PersistenceStrategy.DISK).a(c17692o);
        for (TrackingUrlsDecorator a : set) {
            context.a(a);
        }
        context = context.a();
        c17692o = context.b();
        for (AdUrlTracker.Listener a2 : set2) {
            c17692o.a(a2);
        }
        return context;
    }

    @Provides
    /* renamed from: b */
    AdUrlTracker m40871b(Addy addy) {
        return addy.b();
    }

    @ElementsIntoSet
    @Provides
    /* renamed from: a */
    Set<TrackingUrlsDecorator> m40868a(C12126a c12126a, C16842a c16842a) {
        C7306b c7306b = new C7306b();
        return new HashSet(Arrays.asList(new TrackingUrlsDecorator[]{c12126a, c7306b, c16842a}));
    }

    @ElementsIntoSet
    @Provides
    /* renamed from: d */
    Set<AdUrlTracker.Listener> m40874d() {
        return Collections.emptySet();
    }

    @Provides
    /* renamed from: a */
    C6191a m40857a(@ForApplication Context context) {
        return new C6191a(context);
    }

    @Provides
    /* renamed from: b */
    C6190a m40870b(@ForApplication Context context) {
        return new C6190a(context);
    }

    @IntoSet
    @MainActivityQualifier
    @Provides
    /* renamed from: a */
    LifecycleObserver m40853a(@ForApplication Context context, UserAgentCache userAgentCache) {
        return new DfpUserAgentRetrieverLifecycleObserver(context, userAgentCache);
    }
}
