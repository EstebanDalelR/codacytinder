package com.tinder.ads.tracking;

import com.tinder.ads.Ad.AdType;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/ads/tracking/TrackingUrlFactoryRegistry;", "", "()V", "factories", "Ljava/util/HashMap;", "Lcom/tinder/ads/Ad$AdType;", "Lcom/tinder/ads/tracking/TrackingUrlFactory;", "Lkotlin/collections/HashMap;", "get", "adType", "register", "", "factory", "tracking_release"}, k = 1, mv = {1, 1, 7})
public final class TrackingUrlFactoryRegistry {
    private final HashMap<AdType, TrackingUrlFactory> factories = new HashMap();

    public final void register(@NotNull AdType adType, @NotNull TrackingUrlFactory trackingUrlFactory) {
        C2668g.b(adType, "adType");
        C2668g.b(trackingUrlFactory, "factory");
        this.factories.put(adType, trackingUrlFactory);
    }

    @Nullable
    public final TrackingUrlFactory get(@NotNull AdType adType) {
        C2668g.b(adType, "adType");
        return (TrackingUrlFactory) this.factories.get(adType);
    }
}
