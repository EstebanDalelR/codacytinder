package com.tinder.recsads.lifecycle.observer;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.tinder.recsads.RecsAdsMonitor;
import com.tinder.recsads.RecsAdsRegistrar;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/recsads/lifecycle/observer/RecsAdLifecycleObserver;", "Landroid/arch/lifecycle/LifecycleObserver;", "recsAdMonitor", "Lcom/tinder/recsads/RecsAdsMonitor;", "recsAdsRegistrar", "Lcom/tinder/recsads/RecsAdsRegistrar;", "(Lcom/tinder/recsads/RecsAdsMonitor;Lcom/tinder/recsads/RecsAdsRegistrar;)V", "onActivityCreated", "", "onActivityDestroyed", "onActivityStart", "onActivityStop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsAdLifecycleObserver implements LifecycleObserver {
    /* renamed from: a */
    private final RecsAdsMonitor f12495a;
    /* renamed from: b */
    private final RecsAdsRegistrar f12496b;

    @Inject
    public RecsAdLifecycleObserver(@NotNull RecsAdsMonitor recsAdsMonitor, @NotNull RecsAdsRegistrar recsAdsRegistrar) {
        C2668g.m10309b(recsAdsMonitor, "recsAdMonitor");
        C2668g.m10309b(recsAdsRegistrar, "recsAdsRegistrar");
        this.f12495a = recsAdsMonitor;
        this.f12496b = recsAdsRegistrar;
    }

    @OnLifecycleEvent(Event.ON_CREATE)
    public final void onActivityCreated() {
        this.f12495a.register(this.f12496b);
    }

    @OnLifecycleEvent(Event.ON_START)
    public final void onActivityStart() {
        this.f12495a.start();
    }

    @OnLifecycleEvent(Event.ON_STOP)
    public final void onActivityStop() {
        this.f12495a.stop();
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void onActivityDestroyed() {
        this.f12495a.clear();
    }
}
