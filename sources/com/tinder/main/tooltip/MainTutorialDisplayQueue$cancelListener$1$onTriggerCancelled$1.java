package com.tinder.main.tooltip;

import com.tinder.main.tooltip.C9835c.C9834a;
import com.tinder.main.trigger.Trigger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue$DisplayRequest;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class MainTutorialDisplayQueue$cancelListener$1$onTriggerCancelled$1 extends Lambda implements Function1<C9834a, Boolean> {
    /* renamed from: a */
    final /* synthetic */ Trigger f44555a;

    MainTutorialDisplayQueue$cancelListener$1$onTriggerCancelled$1(Trigger trigger) {
        this.f44555a = trigger;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m53787a((C9834a) obj));
    }

    /* renamed from: a */
    public final boolean m53787a(C9834a c9834a) {
        return C2668g.a(c9834a.m40446b(), this.f44555a);
    }
}
