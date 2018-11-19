package com.tinder.main.trigger.orchestrator;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/tinder/main/trigger/orchestrator/HierarchyChangeTriggerOrchestrator$onHierarchyChangeListener$1", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "(Lcom/tinder/main/trigger/orchestrator/HierarchyChangeTriggerOrchestrator;)V", "onChildViewAdded", "", "parent", "Landroid/view/View;", "child", "onChildViewRemoved", "main_release"}, k = 1, mv = {1, 1, 10})
public final class HierarchyChangeTriggerOrchestrator$a implements OnHierarchyChangeListener {
    /* renamed from: a */
    final /* synthetic */ HierarchyChangeTriggerOrchestrator f32554a;

    HierarchyChangeTriggerOrchestrator$a(HierarchyChangeTriggerOrchestrator hierarchyChangeTriggerOrchestrator) {
        this.f32554a = hierarchyChangeTriggerOrchestrator;
    }

    public void onChildViewRemoved(@NotNull View view, @NotNull View view2) {
        C2668g.b(view, "parent");
        C2668g.b(view2, "child");
        if (C2668g.a(view2, HierarchyChangeTriggerOrchestrator.a(this.f32554a)) != null) {
            HierarchyChangeTriggerOrchestrator.b(this.f32554a).m48058a();
            HierarchyChangeTriggerOrchestrator.a(this.f32554a, null);
        }
    }

    public void onChildViewAdded(@NotNull View view, @NotNull View view2) {
        C2668g.b(view, "parent");
        C2668g.b(view2, "child");
        if (HierarchyChangeTriggerOrchestrator.a(this.f32554a) == null) {
            HierarchyChangeTriggerOrchestrator.a(this.f32554a, view2);
        }
        HierarchyChangeTriggerOrchestrator.b(this.f32554a).m48059b();
    }
}
