package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2 */
final class C19082x246a49e3 extends Lambda implements Function1<DeclarationDescriptor, Sequence<? extends TypeParameterDescriptor>> {
    public static final C19082x246a49e3 INSTANCE = new C19082x246a49e3();

    C19082x246a49e3() {
        super(1);
    }

    @NotNull
    public final Sequence<TypeParameterDescriptor> invoke(@NotNull DeclarationDescriptor declarationDescriptor) {
        C2668g.b(declarationDescriptor, "it");
        declarationDescriptor = ((CallableDescriptor) declarationDescriptor).getTypeParameters();
        C2668g.a(declarationDescriptor, "(it as CallableDescriptor).typeParameters");
        return C19299w.m68846r((Iterable) declarationDescriptor);
    }
}
