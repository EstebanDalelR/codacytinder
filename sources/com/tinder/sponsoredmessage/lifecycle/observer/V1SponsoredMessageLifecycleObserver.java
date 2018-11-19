package com.tinder.sponsoredmessage.lifecycle.observer;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/sponsoredmessage/lifecycle/observer/V1SponsoredMessageLifecycleObserver;", "Landroid/arch/lifecycle/LifecycleObserver;", "v1AdMonitor", "Lcom/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor;", "(Lcom/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor;)V", "onActivityPause", "", "onActivityResume", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class V1SponsoredMessageLifecycleObserver implements LifecycleObserver {
    /* renamed from: a */
    private final V1SponsoredMessageAdMonitor f12518a;

    public V1SponsoredMessageLifecycleObserver(@NotNull V1SponsoredMessageAdMonitor v1SponsoredMessageAdMonitor) {
        C2668g.m10309b(v1SponsoredMessageAdMonitor, "v1AdMonitor");
        this.f12518a = v1SponsoredMessageAdMonitor;
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onActivityResume() {
        this.f12518a.a();
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onActivityPause() {
        this.f12518a.b();
    }
}
