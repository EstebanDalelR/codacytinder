package com.tinder.api.networkperf.module;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.moshi.ResponseErrorAdapter;
import com.tinder.api.networkperf.inspector.FastMatchV2NetworkPerfInspector;
import com.tinder.api.networkperf.inspector.NetworkPerfInspector;
import com.tinder.api.networkperf.inspector.ProfileV2NetworkPerfInspector;
import com.tinder.api.networkperf.inspector.PurchaseNetworkPerfInspector;
import com.tinder.api.networkperf.inspector.TopPicksV2NetworkPerfInspector;
import com.tinder.api.networkperf.inspector.UserProfileNetworkPerfInspector;
import com.tinder.api.networkperf.interceptor.NetworkPerfInterceptor;
import com.tinder.common.logger.Logger;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J3\u0010\u0007\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001dH\u0007¨\u0006\u001e"}, d2 = {"Lcom/tinder/api/networkperf/module/NetworkPerfModule;", "", "()V", "provideFastMatchV2NetworkPerfInspector", "Lcom/tinder/api/networkperf/inspector/NetworkPerfInspector;", "fastMatchV2NetworkPerfInspector", "Lcom/tinder/api/networkperf/inspector/FastMatchV2NetworkPerfInspector;", "provideNetworkPerfInterceptor", "Lokhttp3/Interceptor;", "inspectors", "", "Lkotlin/jvm/JvmSuppressWildcards;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "responseErrorAdapter", "Lcom/tinder/api/moshi/ResponseErrorAdapter;", "logger", "Lcom/tinder/common/logger/Logger;", "provideProfileV2NetworkPerfInspector", "profileV2NetworkPerfInspector", "Lcom/tinder/api/networkperf/inspector/ProfileV2NetworkPerfInspector;", "providePurchaseNetworkPerfInspector", "purchaseNetworkPerfInspector", "Lcom/tinder/api/networkperf/inspector/PurchaseNetworkPerfInspector;", "provideTopPicksV2NetworkPerfInspector", "topPicksV2NetworkPerfInspector", "Lcom/tinder/api/networkperf/inspector/TopPicksV2NetworkPerfInspector;", "provideUserProfileNetworkPerfInspector", "userProfileNetworkPerfInspector", "Lcom/tinder/api/networkperf/inspector/UserProfileNetworkPerfInspector;", "api_release"}, k = 1, mv = {1, 1, 10})
@Module
public final class NetworkPerfModule {
    @IntoSet
    @NotNull
    @Provides
    public final Interceptor provideNetworkPerfInterceptor(@NotNull Set<NetworkPerfInspector> set, @NotNull C2630h c2630h, @NotNull ResponseErrorAdapter responseErrorAdapter, @NotNull Logger logger) {
        C2668g.b(set, "inspectors");
        C2668g.b(c2630h, "fireworks");
        C2668g.b(responseErrorAdapter, "responseErrorAdapter");
        C2668g.b(logger, "logger");
        return new NetworkPerfInterceptor(set, c2630h, responseErrorAdapter, logger);
    }

    @NotNull
    @IntoSet
    @Provides
    public final NetworkPerfInspector provideFastMatchV2NetworkPerfInspector(@NotNull FastMatchV2NetworkPerfInspector fastMatchV2NetworkPerfInspector) {
        C2668g.b(fastMatchV2NetworkPerfInspector, "fastMatchV2NetworkPerfInspector");
        return fastMatchV2NetworkPerfInspector;
    }

    @NotNull
    @IntoSet
    @Provides
    public final NetworkPerfInspector provideUserProfileNetworkPerfInspector(@NotNull UserProfileNetworkPerfInspector userProfileNetworkPerfInspector) {
        C2668g.b(userProfileNetworkPerfInspector, "userProfileNetworkPerfInspector");
        return userProfileNetworkPerfInspector;
    }

    @NotNull
    @IntoSet
    @Provides
    public final NetworkPerfInspector provideProfileV2NetworkPerfInspector(@NotNull ProfileV2NetworkPerfInspector profileV2NetworkPerfInspector) {
        C2668g.b(profileV2NetworkPerfInspector, "profileV2NetworkPerfInspector");
        return profileV2NetworkPerfInspector;
    }

    @NotNull
    @IntoSet
    @Provides
    public final NetworkPerfInspector providePurchaseNetworkPerfInspector(@NotNull PurchaseNetworkPerfInspector purchaseNetworkPerfInspector) {
        C2668g.b(purchaseNetworkPerfInspector, "purchaseNetworkPerfInspector");
        return purchaseNetworkPerfInspector;
    }

    @NotNull
    @IntoSet
    @Provides
    public final NetworkPerfInspector provideTopPicksV2NetworkPerfInspector(@NotNull TopPicksV2NetworkPerfInspector topPicksV2NetworkPerfInspector) {
        C2668g.b(topPicksV2NetworkPerfInspector, "topPicksV2NetworkPerfInspector");
        return topPicksV2NetworkPerfInspector;
    }
}
