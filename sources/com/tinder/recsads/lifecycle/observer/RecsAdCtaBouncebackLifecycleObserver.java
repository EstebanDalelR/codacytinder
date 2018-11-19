package com.tinder.recsads.lifecycle.observer;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.tinder.recsads.analytics.C16433f;
import com.tinder.recsads.analytics.CtaBounceBackTimer;
import com.tinder.recsads.analytics.CtaBounceBackTimer.Listener;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/recsads/lifecycle/observer/RecsAdCtaBouncebackLifecycleObserver;", "Landroid/arch/lifecycle/LifecycleObserver;", "ctaBounceBackTimer", "Lcom/tinder/recsads/analytics/CtaBounceBackTimer;", "addAdDismissEvent", "Lcom/tinder/recsads/analytics/AddAdDismissEvent;", "(Lcom/tinder/recsads/analytics/CtaBounceBackTimer;Lcom/tinder/recsads/analytics/AddAdDismissEvent;)V", "onActivityDestroyed", "", "onActivityResume", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsAdCtaBouncebackLifecycleObserver implements LifecycleObserver {
    /* renamed from: a */
    private final CtaBounceBackTimer f12493a;
    /* renamed from: b */
    private final C16433f f12494b;

    @Inject
    public RecsAdCtaBouncebackLifecycleObserver(@NotNull CtaBounceBackTimer ctaBounceBackTimer, @NotNull C16433f c16433f) {
        C2668g.m10309b(ctaBounceBackTimer, "ctaBounceBackTimer");
        C2668g.m10309b(c16433f, "addAdDismissEvent");
        this.f12493a = ctaBounceBackTimer;
        this.f12494b = c16433f;
        this.f12493a.a((Listener) new RecsAdCtaBouncebackLifecycleObserver$1(this));
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onActivityResume() {
        this.f12493a.a();
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void onActivityDestroyed() {
        this.f12493a.b();
    }
}
