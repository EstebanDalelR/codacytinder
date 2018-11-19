package com.tinder.addy.cache;

import com.tinder.addy.Ad;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/tinder/addy/cache/ExpiringAdQueue;", "Lcom/tinder/addy/cache/AdQueue;", "expirationPolicy", "Lcom/tinder/addy/cache/ExpiringAdQueue$ExpirationPolicy;", "(Lcom/tinder/addy/cache/ExpiringAdQueue$ExpirationPolicy;)V", "adFetchTimeMap", "Ljava/util/HashMap;", "Lcom/tinder/addy/Ad;", "", "adPriorityBlockingQueue", "Ljava/util/LinkedList;", "all", "", "getAll", "()Ljava/util/List;", "isEmpty", "", "()Z", "add", "ad", "clear", "", "evictExpiredPolled", "poll", "ExpirationPolicy", "addy_release"}, k = 1, mv = {1, 1, 10})
public final class ExpiringAdQueue implements AdQueue {
    /* renamed from: a */
    private final LinkedList<Ad> f26396a = new LinkedList();
    /* renamed from: b */
    private final HashMap<Ad, Long> f26397b = new HashMap();
    /* renamed from: c */
    private final ExpirationPolicy f26398c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/addy/cache/ExpiringAdQueue$ExpirationPolicy;", "", "expirationTime", "", "ad", "Lcom/tinder/addy/Ad;", "insertionTime", "addy_release"}, k = 1, mv = {1, 1, 10})
    public interface ExpirationPolicy {
        long expirationTime(@NotNull Ad ad, long j);
    }

    public ExpiringAdQueue(@NotNull ExpirationPolicy expirationPolicy) {
        C2668g.b(expirationPolicy, "expirationPolicy");
        this.f26398c = expirationPolicy;
    }

    public boolean add(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        this.f26397b.put(ad, Long.valueOf(new Date().getTime()));
        return this.f26396a.add(ad);
    }

    @Nullable
    public Ad poll() {
        m31193a();
        return (Ad) this.f26396a.poll();
    }

    @NotNull
    public List<Ad> getAll() {
        m31193a();
        return C19301m.l(this.f26396a);
    }

    public void clear() {
        this.f26396a.clear();
    }

    public boolean isEmpty() {
        m31193a();
        return this.f26396a.isEmpty();
    }

    /* renamed from: a */
    private final void m31193a() {
        C19301m.a(this.f26396a, new ExpiringAdQueue$evictExpiredPolled$1(this));
    }
}
