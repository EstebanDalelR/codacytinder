package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.C15813i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1 */
final class C19136x410e6287 extends Lambda implements Function1<H, C15813i> {
    final /* synthetic */ SmartSet $conflictedHandles;

    C19136x410e6287(SmartSet smartSet) {
        this.$conflictedHandles = smartSet;
        super(1);
    }

    public final void invoke(H h) {
        SmartSet smartSet = this.$conflictedHandles;
        C2668g.a(h, "it");
        smartSet.add(h);
    }
}
