package com.tinder.ads.cache;

import com.tinder.ads.Ad;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0012\u001a\u00020\u00102\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u000e\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007H\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\nX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/tinder/ads/cache/ExpiringAdQueue;", "Lcom/tinder/ads/cache/AdQueue;", "expirationPolicy", "Lcom/tinder/ads/cache/ExpiringAdQueue$ExpirationPolicy;", "(Lcom/tinder/ads/cache/ExpiringAdQueue$ExpirationPolicy;)V", "adFetchTimeMap", "Ljava/util/HashMap;", "Lcom/tinder/ads/Ad;", "", "adPriorityBlockingQueue", "Ljava/util/concurrent/PriorityBlockingQueue;", "all", "", "getAll", "()Ljava/util/List;", "isEmpty", "", "()Z", "add", "ad", "clear", "", "evictExpiredPolled", "poll", "ExpirationPolicy", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class ExpiringAdQueue implements AdQueue {
    private final HashMap<Ad<?>, Long> adFetchTimeMap = new HashMap();
    private final PriorityBlockingQueue<Ad<?>> adPriorityBlockingQueue = new PriorityBlockingQueue(5, new AdComparator());
    private final ExpirationPolicy expirationPolicy;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/ads/cache/ExpiringAdQueue$ExpirationPolicy;", "", "expirationTime", "", "ad", "Lcom/tinder/ads/Ad;", "insertionTime", "aggregator_release"}, k = 1, mv = {1, 1, 7})
    public interface ExpirationPolicy {
        long expirationTime(@NotNull Ad<?> ad, long j);
    }

    public ExpiringAdQueue(@NotNull ExpirationPolicy expirationPolicy) {
        C2668g.b(expirationPolicy, "expirationPolicy");
        this.expirationPolicy = expirationPolicy;
    }

    public boolean add(@NotNull Ad<?> ad) {
        C2668g.b(ad, "ad");
        this.adFetchTimeMap.put(ad, Long.valueOf(new Date().getTime()));
        return this.adPriorityBlockingQueue.add(ad);
    }

    @Nullable
    public Ad<?> poll() {
        evictExpiredPolled();
        return (Ad) this.adPriorityBlockingQueue.poll();
    }

    @NotNull
    public List<Ad<?>> getAll() {
        evictExpiredPolled();
        return C19301m.l(this.adPriorityBlockingQueue);
    }

    public void clear() {
        this.adPriorityBlockingQueue.clear();
    }

    public boolean isEmpty() {
        evictExpiredPolled();
        return this.adPriorityBlockingQueue.isEmpty();
    }

    private final void evictExpiredPolled() {
        C19301m.a(this.adPriorityBlockingQueue, new ExpiringAdQueue$evictExpiredPolled$1(this));
    }
}
