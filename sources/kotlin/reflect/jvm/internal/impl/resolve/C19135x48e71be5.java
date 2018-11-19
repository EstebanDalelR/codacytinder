package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$retainMostSpecificInEachOverridableGroup$newResult$1 */
final class C19135x48e71be5 extends Lambda implements Function1<D, D> {
    public static final C19135x48e71be5 INSTANCE = new C19135x48e71be5();

    C19135x48e71be5() {
        super(1);
    }

    @NotNull
    public final D invoke(@NotNull D d) {
        C2668g.b(d, "$receiver");
        return d;
    }
}
