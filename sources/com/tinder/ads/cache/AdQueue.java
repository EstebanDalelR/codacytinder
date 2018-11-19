package com.tinder.ads.cache;

import com.tinder.ads.Ad;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\n\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\b\u0010\f\u001a\u00020\rH&J\u000e\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004H&R\u001c\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/tinder/ads/cache/AdQueue;", "", "all", "", "Lcom/tinder/ads/Ad;", "getAll", "()Ljava/util/List;", "isEmpty", "", "()Z", "add", "ad", "clear", "", "poll", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public interface AdQueue {
    boolean add(@NotNull Ad<?> ad);

    void clear();

    @NotNull
    List<Ad<?>> getAll();

    boolean isEmpty();

    @Nullable
    Ad<?> poll();
}
