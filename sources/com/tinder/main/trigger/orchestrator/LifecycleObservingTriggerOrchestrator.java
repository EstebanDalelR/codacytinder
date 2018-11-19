package com.tinder.main.trigger.orchestrator;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.tinder.main.model.MainPage;
import com.tinder.main.p287c.C13390c;
import com.tinder.main.trigger.MainTriggerMediator;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/main/trigger/orchestrator/LifecycleObservingTriggerOrchestrator;", "Landroid/arch/lifecycle/LifecycleObserver;", "mainView", "Ldagger/Lazy;", "Lcom/tinder/main/view/MainView;", "mediator", "Lcom/tinder/main/trigger/MainTriggerMediator;", "(Ldagger/Lazy;Lcom/tinder/main/trigger/MainTriggerMediator;)V", "onActivityPause", "", "onActivityResume", "main_release"}, k = 1, mv = {1, 1, 10})
public final class LifecycleObservingTriggerOrchestrator implements LifecycleObserver {
    /* renamed from: a */
    private final Lazy<C13390c> f12338a;
    /* renamed from: b */
    private final MainTriggerMediator f12339b;

    public LifecycleObservingTriggerOrchestrator(@NotNull Lazy<C13390c> lazy, @NotNull MainTriggerMediator mainTriggerMediator) {
        C2668g.m10309b(lazy, "mainView");
        C2668g.m10309b(mainTriggerMediator, "mediator");
        this.f12338a = lazy;
        this.f12339b = mainTriggerMediator;
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onActivityResume() {
        if (((C13390c) this.f12338a.get()).getDisplayedPage() == MainPage.DISCOVERY) {
            this.f12339b.a();
        }
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onActivityPause() {
        if (((C13390c) this.f12338a.get()).getDisplayedPage() == MainPage.DISCOVERY) {
            this.f12339b.b();
        }
    }
}
