package com.tinder.recs.api;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.C2671a;
import rx.Completable;
import rx.p500e.C19573b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/recs/api/TimeoutTimer;", "", "scheduler", "Lrx/Scheduler;", "(Lrx/Scheduler;)V", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "getCompositeSubscription", "()Lrx/subscriptions/CompositeSubscription;", "isInTimeout", "", "reset", "", "startTimeoutIfNeeded", "duration", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TimeoutTimer {
    @NotNull
    private final C19573b compositeSubscription = new C19573b();
    private final C2671a scheduler;

    public TimeoutTimer(@NotNull C2671a c2671a) {
        C2668g.b(c2671a, "scheduler");
        this.scheduler = c2671a;
    }

    @NotNull
    public final C19573b getCompositeSubscription() {
        return this.compositeSubscription;
    }

    public final synchronized boolean isInTimeout() {
        return this.compositeSubscription.b();
    }

    public final synchronized void startTimeoutIfNeeded(long j) {
        if (!isInTimeout()) {
            this.compositeSubscription.a(Completable.a(j, TimeUnit.MILLISECONDS, this.scheduler).a(new TimeoutTimer$startTimeoutIfNeeded$subscription$1(this), TimeoutTimer$startTimeoutIfNeeded$subscription$2.INSTANCE));
        }
    }

    public final synchronized void reset() {
        this.compositeSubscription.a();
    }
}
