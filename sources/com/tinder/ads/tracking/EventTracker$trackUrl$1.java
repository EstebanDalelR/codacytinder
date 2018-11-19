package com.tinder.ads.tracking;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 7})
final class EventTracker$trackUrl$1<T, R> implements Func1<String, Completable> {
    final /* synthetic */ EventTracker this$0;

    EventTracker$trackUrl$1(EventTracker eventTracker) {
        this.this$0 = eventTracker;
    }

    @NotNull
    public final Completable call(String str) {
        PingStore access$getPingStore$p = this.this$0.pingStore;
        C2668g.a(str, "it");
        return access$getPingStore$p.save(str, System.currentTimeMillis());
    }
}
