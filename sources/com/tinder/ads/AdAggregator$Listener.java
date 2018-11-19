package com.tinder.ads;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/tinder/ads/AdAggregator$Listener;", "", "onAdAdded", "", "ad", "Lcom/tinder/ads/Ad;", "onAdFailed", "source", "Lcom/tinder/ads/AdSource;", "exception", "", "onAdRequestSent", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public interface AdAggregator$Listener {
    void onAdAdded(@NotNull Ad<?> ad);

    void onAdFailed(@NotNull AdSource adSource, @NotNull Throwable th);

    void onAdRequestSent(@NotNull AdSource adSource);
}
