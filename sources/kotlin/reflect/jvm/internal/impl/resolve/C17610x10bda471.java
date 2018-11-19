package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1 */
final class C17610x10bda471 implements TypeConstructorEquality {
    final /* synthetic */ CallableDescriptor $a;
    final /* synthetic */ CallableDescriptor $b;

    C17610x10bda471(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.$a = callableDescriptor;
        this.$b = callableDescriptor2;
    }

    public /* synthetic */ boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        return invoke(typeConstructor, typeConstructor2);
    }

    public final boolean invoke(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2) {
        C2668g.b(typeConstructor, "c1");
        C2668g.b(typeConstructor2, "c2");
        if (C2668g.a(typeConstructor, typeConstructor2)) {
            return true;
        }
        typeConstructor = typeConstructor.getDeclarationDescriptor();
        typeConstructor2 = typeConstructor2.getDeclarationDescriptor();
        if (typeConstructor instanceof TypeParameterDescriptor) {
            if (typeConstructor2 instanceof TypeParameterDescriptor) {
                return DescriptorEquivalenceForOverrides.INSTANCE.areTypeParametersEquivalent((TypeParameterDescriptor) typeConstructor, (TypeParameterDescriptor) typeConstructor2, new Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return Boolean.valueOf(invoke((DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
                    }

                    public final boolean invoke(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2) {
                        return (C2668g.a(declarationDescriptor, this.$a) == null || C2668g.a(declarationDescriptor2, this.$b) == null) ? null : true;
                    }
                });
            }
        }
        return null;
    }
}
