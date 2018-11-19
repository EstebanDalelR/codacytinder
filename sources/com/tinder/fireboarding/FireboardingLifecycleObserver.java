package com.tinder.fireboarding;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.tinder.fireboarding.domain.FireboardingGame;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/fireboarding/FireboardingLifecycleObserver;", "Landroid/arch/lifecycle/LifecycleObserver;", "fireboardingGame", "Lcom/tinder/fireboarding/domain/FireboardingGame;", "(Lcom/tinder/fireboarding/domain/FireboardingGame;)V", "onActivityStart", "", "onActivityStop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FireboardingLifecycleObserver implements LifecycleObserver {
    /* renamed from: a */
    private final FireboardingGame f12299a;

    public FireboardingLifecycleObserver(@NotNull FireboardingGame fireboardingGame) {
        C2668g.m10309b(fireboardingGame, "fireboardingGame");
        this.f12299a = fireboardingGame;
    }

    @OnLifecycleEvent(Event.ON_START)
    public final void onActivityStart() {
        this.f12299a.a();
    }

    @OnLifecycleEvent(Event.ON_STOP)
    public final void onActivityStop() {
        this.f12299a.c();
    }
}
