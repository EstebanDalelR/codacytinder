package com.tinder.ads.module;

import android.arch.lifecycle.LifecycleObserver;
import com.tinder.activities.MainActivity;
import com.tinder.addy.AdAggregator;
import com.tinder.addy.source.fan.FanAdLoader.C6190a;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.C6191a;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.PublisherAdRequestFactory;
import com.tinder.ads.DfpFieldsResolverImpl;
import com.tinder.ads.NativeAdCardLikeListener;
import com.tinder.ads.NativeDfpSourceBuilderFactory;
import com.tinder.ads.RecsAdSourceRegistrar;
import com.tinder.ads.source.dfp.BannerDfpSource;
import com.tinder.ads.source.fan.FanSource.Builder;
import com.tinder.common.p077b.C8524b;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.main.qualifier.MainActivityQualifier;
import com.tinder.module.Internal;
import com.tinder.recsads.C16458f;
import com.tinder.recsads.C16459h;
import com.tinder.recsads.C16470o;
import com.tinder.recsads.DfpFieldsResolver;
import com.tinder.recsads.NativeCardListener;
import com.tinder.recsads.RecsAdsRegistrar;
import com.tinder.recsads.lifecycle.observer.RecsAdCtaBouncebackLifecycleObserver;
import com.tinder.recsads.lifecycle.observer.RecsAdLifecycleObserver;
import com.tinder.recsads.model.RecsAdsConfig;
import com.tinder.recsads.p467b.C16451a;
import com.tinder.recsads.p467b.C16452c;
import com.tinder.recsads.p467b.C16453e;
import com.tinder.recsads.p467b.C16454g;
import com.tinder.recsads.p467b.C16455i;
import com.tinder.scope.ActivityScope;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoSet;
import java.util.Set;
import javax.inject.Provider;

@Internal
@Module
public abstract class RecsAdsModule {
    @Provides
    static DfpFieldsResolver provideDfpFieldsResolver(DfpFieldsResolverImpl dfpFieldsResolverImpl) {
        return dfpFieldsResolverImpl;
    }

    @IntoSet
    @MainActivityQualifier
    @Provides
    static LifecycleObserver provideRecsAdCtaBouncebackLifecycleObserver(RecsAdCtaBouncebackLifecycleObserver recsAdCtaBouncebackLifecycleObserver) {
        return recsAdCtaBouncebackLifecycleObserver;
    }

    @IntoSet
    @MainActivityQualifier
    @Provides
    static LifecycleObserver provideRecsAdLifecycleObserver(RecsAdLifecycleObserver recsAdLifecycleObserver) {
        return recsAdLifecycleObserver;
    }

    @Provides
    static Builder provideFanSourceBuilder(MainActivity mainActivity) {
        return new Builder(mainActivity);
    }

    @Provides
    static BannerDfpSource.Builder provideDfpSourceBuilder(MainActivity mainActivity) {
        return new BannerDfpSource.Builder(mainActivity);
    }

    @Provides
    static NativeDfpSourceBuilderFactory provideNativeDfpSourceBuilderFactory(MainActivity mainActivity) {
        return new NativeDfpSourceBuilderFactory(mainActivity);
    }

    @ActivityScope
    @Provides
    static RecsAdsRegistrar provideRecsAdRegistar(AbTestUtility abTestUtility, RecsAdSourceRegistrar recsAdSourceRegistrar, C16470o c16470o) {
        return abTestUtility.isAddyV2Enabled() != null ? c16470o : recsAdSourceRegistrar;
    }

    @Provides
    static C16470o provideRecsAdLoaderRegistrar(RecsAdsConfig recsAdsConfig, @AdsQualifiers$Recs AdAggregator adAggregator, C16451a c16451a, Provider<C6191a> provider, Provider<C6190a> provider2, C16455i c16455i, C16453e c16453e, C16452c c16452c, C16454g c16454g, PublisherAdRequestFactory publisherAdRequestFactory) {
        return new C16470o(recsAdsConfig, adAggregator, c16451a, provider, provider2, c16455i, c16453e, c16452c, c16454g, publisherAdRequestFactory);
    }

    @ElementsIntoSet
    @Provides
    static Set<NativeCardListener> provideNativeAdCardListeners(NativeAdCardLikeListener nativeAdCardLikeListener, C16458f c16458f, C16459h c16459h) {
        return C8524b.b(new NativeCardListener[]{nativeAdCardLikeListener, c16458f, c16459h});
    }
}
