package com.tinder.sponsoredmessage.lifecycle.observer;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.tinder.sponsoredmessage.C15033d;
import com.tinder.sponsoredmessage.SponsoredMessageAdMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/sponsoredmessage/lifecycle/observer/SponsoredMessageLifecycleObserver;", "Landroid/arch/lifecycle/LifecycleObserver;", "sponsoredMessageAdMonitor", "Lcom/tinder/sponsoredmessage/SponsoredMessageAdMonitor;", "sponsoredMessageAdRegistrar", "Lcom/tinder/sponsoredmessage/SponsoredMessageAdsRegistrar;", "(Lcom/tinder/sponsoredmessage/SponsoredMessageAdMonitor;Lcom/tinder/sponsoredmessage/SponsoredMessageAdsRegistrar;)V", "onActivityCreated", "", "onActivityPause", "onActivityResume", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SponsoredMessageLifecycleObserver implements LifecycleObserver {
    /* renamed from: a */
    private final SponsoredMessageAdMonitor f12516a;
    /* renamed from: b */
    private final C15033d f12517b;

    public SponsoredMessageLifecycleObserver(@NotNull SponsoredMessageAdMonitor sponsoredMessageAdMonitor, @NotNull C15033d c15033d) {
        C2668g.m10309b(sponsoredMessageAdMonitor, "sponsoredMessageAdMonitor");
        C2668g.m10309b(c15033d, "sponsoredMessageAdRegistrar");
        this.f12516a = sponsoredMessageAdMonitor;
        this.f12517b = c15033d;
    }

    @OnLifecycleEvent(Event.ON_CREATE)
    public final void onActivityCreated() {
        this.f12516a.a(this.f12517b);
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onActivityResume() {
        this.f12516a.a();
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onActivityPause() {
        this.f12516a.b();
    }
}
