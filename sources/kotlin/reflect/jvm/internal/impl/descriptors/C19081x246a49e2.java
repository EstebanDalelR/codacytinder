package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1 */
final class C19081x246a49e2 extends Lambda implements Function1<DeclarationDescriptor, Boolean> {
    public static final C19081x246a49e2 INSTANCE = new C19081x246a49e2();

    C19081x246a49e2() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((DeclarationDescriptor) obj));
    }

    public final boolean invoke(@NotNull DeclarationDescriptor declarationDescriptor) {
        C2668g.b(declarationDescriptor, "it");
        return declarationDescriptor instanceof CallableDescriptor;
    }
}
