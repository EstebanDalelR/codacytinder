package com.tinder.ads;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/ads/AdRegistrar;", "", "()V", "registerAdSources", "", "adAggregator", "Lcom/tinder/ads/AdAggregator;", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public abstract class AdRegistrar {
    public abstract void registerAdSources(@NotNull AdAggregator adAggregator);
}
