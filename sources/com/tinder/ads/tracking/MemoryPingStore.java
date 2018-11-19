package com.tinder.ads.tracking;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0006H\u0016R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/ads/tracking/MemoryPingStore;", "Lcom/tinder/ads/tracking/PingStore;", "()V", "pingTimes", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "pings", "Ljava/util/Stack;", "Lcom/tinder/ads/tracking/Ping;", "load", "url", "loadAll", "", "save", "Lrx/Completable;", "time", "tracking_release"}, k = 1, mv = {1, 1, 7})
public final class MemoryPingStore implements PingStore {
    private final HashMap<String, Long> pingTimes = new HashMap();
    private final Stack<Ping> pings = new Stack();

    @NotNull
    public Completable save(@NotNull String str, long j) {
        C2668g.b(str, "url");
        str = Completable.a(new MemoryPingStore$save$1(this, str, j));
        C2668g.a(str, "Completable.fromAction {…    pings.add(ping)\n    }");
        return str;
    }

    @NotNull
    public Ping load(@NotNull String str) {
        C2668g.b(str, "url");
        return new Ping(str, (Long) this.pingTimes.get(str));
    }

    @NotNull
    public List<Ping> loadAll() {
        return C19301m.l(this.pings);
    }
}
