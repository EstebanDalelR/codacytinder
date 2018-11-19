package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2 */
final class C19080x24bfe127 extends Lambda implements Function1<ClassId, Integer> {
    public static final C19080x24bfe127 INSTANCE = new C19080x24bfe127();

    C19080x24bfe127() {
        super(1);
    }

    public final int invoke(@NotNull ClassId classId) {
        C2668g.b(classId, "it");
        return 0;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(invoke((ClassId) obj));
    }
}
