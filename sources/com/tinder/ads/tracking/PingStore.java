package com.tinder.ads.tracking;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/tinder/ads/tracking/PingStore;", "", "load", "Lcom/tinder/ads/tracking/Ping;", "url", "", "loadAll", "", "save", "Lrx/Completable;", "time", "", "tracking_release"}, k = 1, mv = {1, 1, 7})
public interface PingStore {
    @NotNull
    Ping load(@NotNull String str);

    @NotNull
    List<Ping> loadAll();

    @NotNull
    Completable save(@NotNull String str, long j);
}
