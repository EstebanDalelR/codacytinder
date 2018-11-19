package com.tinder.recs.engine;

import com.tinder.analytics.performance.C8157y;
import com.tinder.data.places.ObservableApiEventClient;
import com.tinder.data.places.PlacesRecsApiClient.C8736b;
import com.tinder.data.recs.C8776g;
import com.tinder.data.toppicks.C11016j;
import com.tinder.domain.recs.RecsAdditionalDataPrefetcher;
import com.tinder.domain.recs.RecsApiClient;
import com.tinder.domain.recs.RecsEngine.Config;
import com.tinder.domain.recs.RecsEngine.Config.LoaderType;
import com.tinder.domain.recs.RecsEngine.Configurator;
import com.tinder.domain.recs.RecsEngine.Configurator.Factory;
import com.tinder.domain.recs.RecsEngine.LoadingRetryPolicy;
import com.tinder.domain.recs.RecsEngine.ResetReason.Default.Unspecified;
import com.tinder.domain.recs.engine.SwipeProcessingRulesResolver;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecSource;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.domain.recs.model.RecSource.FastMatch;
import com.tinder.domain.recs.model.RecSource.Places;
import com.tinder.domain.recs.model.RecSource.TopPicks;
import com.tinder.fastmatch.p244b.C11621a;
import com.tinder.util.ConnectivityProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\f\u0010\u001e\u001a\u00020\u001f*\u00020 H\u0002J\f\u0010!\u001a\u00020\u0003*\u00020 H\u0002J\f\u0010\"\u001a\u00020\u0013*\u00020 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/tinder/recs/engine/DefaultRecsEngineConfiguratorFactory;", "Lcom/tinder/domain/recs/RecsEngine$Configurator$Factory;", "cardStackRecsApiClient", "Lcom/tinder/domain/recs/RecsApiClient;", "fastMatchRecsApiClientProvider", "Ljavax/inject/Provider;", "Lcom/tinder/fastmatch/data/FastMatchRecsApiClient;", "topPicksRecsApiClientProvider", "Lcom/tinder/data/toppicks/TopPicksApiClient;", "placesRecsApiClientFactory", "Lcom/tinder/data/places/PlacesRecsApiClient$Factory;", "recsAdditionalDataPrefetcher", "Lcom/tinder/domain/recs/RecsAdditionalDataPrefetcher;", "Lcom/tinder/domain/recs/model/Rec;", "connectivityProvider", "Lcom/tinder/util/ConnectivityProvider;", "recsAlreadySwipedProvider", "Lcom/tinder/data/recs/RecsAlreadySwipedProvider;", "coreSwipeProcessingRulesResolver", "Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver;", "fastMatchSwipeProcessingRulesResolver", "placesSwipeProcessingRulesResolver", "topPicksSwipeProcessingRulesResolver", "simplePerformanceEventDispatcher", "Lcom/tinder/analytics/performance/SimplePerformanceEventDispatcher;", "(Lcom/tinder/domain/recs/RecsApiClient;Ljavax/inject/Provider;Ljavax/inject/Provider;Lcom/tinder/data/places/PlacesRecsApiClient$Factory;Lcom/tinder/domain/recs/RecsAdditionalDataPrefetcher;Lcom/tinder/util/ConnectivityProvider;Lcom/tinder/data/recs/RecsAlreadySwipedProvider;Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver;Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver;Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver;Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver;Lcom/tinder/analytics/performance/SimplePerformanceEventDispatcher;)V", "create", "Lcom/tinder/domain/recs/RecsEngine$Configurator;", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "createConfig", "Lcom/tinder/domain/recs/RecsEngine$Config;", "Lcom/tinder/domain/recs/model/RecSource;", "createRecsApiClient", "createSwipeProcessingRulesResolver", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class DefaultRecsEngineConfiguratorFactory implements Factory {
    private final RecsApiClient cardStackRecsApiClient;
    private final ConnectivityProvider connectivityProvider;
    private final SwipeProcessingRulesResolver coreSwipeProcessingRulesResolver;
    private final Provider<C11621a> fastMatchRecsApiClientProvider;
    private final SwipeProcessingRulesResolver fastMatchSwipeProcessingRulesResolver;
    private final C8736b placesRecsApiClientFactory;
    private final SwipeProcessingRulesResolver placesSwipeProcessingRulesResolver;
    private final RecsAdditionalDataPrefetcher<Rec> recsAdditionalDataPrefetcher;
    private final C8776g recsAlreadySwipedProvider;
    private final C8157y simplePerformanceEventDispatcher;
    private final Provider<C11016j> topPicksRecsApiClientProvider;
    private final SwipeProcessingRulesResolver topPicksSwipeProcessingRulesResolver;

    public DefaultRecsEngineConfiguratorFactory(@NotNull RecsApiClient recsApiClient, @NotNull Provider<C11621a> provider, @NotNull Provider<C11016j> provider2, @NotNull C8736b c8736b, @NotNull RecsAdditionalDataPrefetcher<? super Rec> recsAdditionalDataPrefetcher, @NotNull ConnectivityProvider connectivityProvider, @NotNull C8776g c8776g, @NotNull SwipeProcessingRulesResolver swipeProcessingRulesResolver, @NotNull SwipeProcessingRulesResolver swipeProcessingRulesResolver2, @NotNull SwipeProcessingRulesResolver swipeProcessingRulesResolver3, @NotNull SwipeProcessingRulesResolver swipeProcessingRulesResolver4, @NotNull C8157y c8157y) {
        C2668g.b(recsApiClient, "cardStackRecsApiClient");
        C2668g.b(provider, "fastMatchRecsApiClientProvider");
        C2668g.b(provider2, "topPicksRecsApiClientProvider");
        C2668g.b(c8736b, "placesRecsApiClientFactory");
        C2668g.b(recsAdditionalDataPrefetcher, "recsAdditionalDataPrefetcher");
        C2668g.b(connectivityProvider, "connectivityProvider");
        C2668g.b(c8776g, "recsAlreadySwipedProvider");
        C2668g.b(swipeProcessingRulesResolver, "coreSwipeProcessingRulesResolver");
        C2668g.b(swipeProcessingRulesResolver2, "fastMatchSwipeProcessingRulesResolver");
        C2668g.b(swipeProcessingRulesResolver3, "placesSwipeProcessingRulesResolver");
        C2668g.b(swipeProcessingRulesResolver4, "topPicksSwipeProcessingRulesResolver");
        C2668g.b(c8157y, "simplePerformanceEventDispatcher");
        this.cardStackRecsApiClient = recsApiClient;
        this.fastMatchRecsApiClientProvider = provider;
        this.topPicksRecsApiClientProvider = provider2;
        this.placesRecsApiClientFactory = c8736b;
        this.recsAdditionalDataPrefetcher = recsAdditionalDataPrefetcher;
        this.connectivityProvider = connectivityProvider;
        this.recsAlreadySwipedProvider = c8776g;
        this.coreSwipeProcessingRulesResolver = swipeProcessingRulesResolver;
        this.fastMatchSwipeProcessingRulesResolver = swipeProcessingRulesResolver2;
        this.placesSwipeProcessingRulesResolver = swipeProcessingRulesResolver3;
        this.topPicksSwipeProcessingRulesResolver = swipeProcessingRulesResolver4;
        this.simplePerformanceEventDispatcher = c8157y;
    }

    @NotNull
    public Configurator create(@NotNull Rec$Source rec$Source) {
        C2668g.b(rec$Source, "recSource");
        RecSource recSource = (RecSource) rec$Source;
        Rec$Source rec$Source2 = recSource;
        Config createConfig = createConfig(recSource);
        RecsAdditionalDataPrefetcher recsAdditionalDataPrefetcher = this.recsAdditionalDataPrefetcher;
        return new Configurator(rec$Source2, createConfig, createRecsApiClient(recSource), this.recsAlreadySwipedProvider, this.connectivityProvider, recsAdditionalDataPrefetcher, createSwipeProcessingRulesResolver(recSource));
    }

    private final RecsApiClient createRecsApiClient(@NotNull RecSource recSource) {
        if (recSource instanceof Core) {
            return this.cardStackRecsApiClient;
        }
        if (recSource instanceof FastMatch) {
            C11621a c11621a = (C11621a) this.fastMatchRecsApiClientProvider.get();
            c11621a.reset(Unspecified.INSTANCE);
            C2668g.a(c11621a, "fastMatchRecsApiClientProvider");
            return c11621a;
        } else if (recSource instanceof Places) {
            recSource = this.placesRecsApiClientFactory.a((Places) recSource);
            this.simplePerformanceEventDispatcher.a((ObservableApiEventClient) recSource);
            return (RecsApiClient) recSource;
        } else if ((recSource instanceof TopPicks) != null) {
            recSource = this.topPicksRecsApiClientProvider.get();
            C2668g.a(recSource, "topPicksRecsApiClientProvider.get()");
            return (RecsApiClient) recSource;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final Config createConfig(@NotNull RecSource recSource) {
        if (recSource instanceof Core) {
            return new Config(false, LoaderType.CARD_STACK, 0, null, 12, null);
        }
        if (recSource instanceof FastMatch) {
            return new Config(true, LoaderType.CARD_GRID, 0, null, 12, null);
        }
        if (recSource instanceof Places) {
            return new Config(true, LoaderType.CARD_GRID, 0, null, 12, null);
        }
        if ((recSource instanceof TopPicks) != null) {
            return new Config(true, LoaderType.CARD_GRID, 0, new LoadingRetryPolicy(0, 0), 4, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final SwipeProcessingRulesResolver createSwipeProcessingRulesResolver(@NotNull RecSource recSource) {
        if (recSource instanceof Core) {
            return this.coreSwipeProcessingRulesResolver;
        }
        if (recSource instanceof FastMatch) {
            return this.fastMatchSwipeProcessingRulesResolver;
        }
        if (recSource instanceof Places) {
            return this.placesSwipeProcessingRulesResolver;
        }
        if ((recSource instanceof TopPicks) != null) {
            return this.topPicksSwipeProcessingRulesResolver;
        }
        throw new NoWhenBranchMatchedException();
    }
}
