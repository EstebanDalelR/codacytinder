package com.tinder.main.trigger.orchestrator;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.view.View;
import com.tinder.main.p287c.C13390c;
import com.tinder.main.trigger.MainTriggerMediator;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/tinder/main/trigger/orchestrator/HierarchyChangeTriggerOrchestrator;", "Landroid/arch/lifecycle/LifecycleObserver;", "mainView", "Ldagger/Lazy;", "Lcom/tinder/main/view/MainView;", "mediator", "Lcom/tinder/main/trigger/MainTriggerMediator;", "(Ldagger/Lazy;Lcom/tinder/main/trigger/MainTriggerMediator;)V", "containerFirstChildView", "Landroid/view/View;", "onHierarchyChangeListener", "com/tinder/main/trigger/orchestrator/HierarchyChangeTriggerOrchestrator$onHierarchyChangeListener$1", "Lcom/tinder/main/trigger/orchestrator/HierarchyChangeTriggerOrchestrator$onHierarchyChangeListener$1;", "onActivityPause", "", "onActivityResume", "main_release"}, k = 1, mv = {1, 1, 10})
public final class HierarchyChangeTriggerOrchestrator implements LifecycleObserver {
    /* renamed from: a */
    private View f12334a;
    /* renamed from: b */
    private final HierarchyChangeTriggerOrchestrator$a f12335b = new HierarchyChangeTriggerOrchestrator$a(this);
    /* renamed from: c */
    private final Lazy<C13390c> f12336c;
    /* renamed from: d */
    private final MainTriggerMediator f12337d;

    public HierarchyChangeTriggerOrchestrator(@NotNull Lazy<C13390c> lazy, @NotNull MainTriggerMediator mainTriggerMediator) {
        C2668g.m10309b(lazy, "mainView");
        C2668g.m10309b(mainTriggerMediator, "mediator");
        this.f12336c = lazy;
        this.f12337d = mainTriggerMediator;
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onActivityResume() {
        ((C13390c) this.f12336c.get()).setOnHierarchyChangeListener(this.f12335b);
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onActivityPause() {
        ((C13390c) this.f12336c.get()).setOnHierarchyChangeListener(null);
    }
}
