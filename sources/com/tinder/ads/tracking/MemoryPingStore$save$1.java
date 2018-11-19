package com.tinder.ads.tracking;

import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 7})
final class MemoryPingStore$save$1 implements Action0 {
    final /* synthetic */ long $time;
    final /* synthetic */ String $url;
    final /* synthetic */ MemoryPingStore this$0;

    MemoryPingStore$save$1(MemoryPingStore memoryPingStore, String str, long j) {
        this.this$0 = memoryPingStore;
        this.$url = str;
        this.$time = j;
    }

    public final void call() {
        Ping ping = new Ping(this.$url, Long.valueOf(this.$time));
        this.this$0.pingTimes.put(this.$url, Long.valueOf(this.$time));
        this.this$0.pings.add(ping);
    }
}
