package com.tinder.recsads;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/tinder/recsads/RecsAdsMonitor;", "", "clear", "", "register", "registrar", "Lcom/tinder/recsads/RecsAdsRegistrar;", "start", "stop", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public interface RecsAdsMonitor {
    void clear();

    void register(@NotNull RecsAdsRegistrar recsAdsRegistrar);

    void start();

    void stop();
}
