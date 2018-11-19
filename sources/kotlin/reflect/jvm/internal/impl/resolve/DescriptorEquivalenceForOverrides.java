package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DescriptorEquivalenceForOverrides {
    public static final DescriptorEquivalenceForOverrides INSTANCE = new DescriptorEquivalenceForOverrides();

    private DescriptorEquivalenceForOverrides() {
    }

    public final boolean areEquivalent(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2) {
        if ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) {
            return areClassesEquivalent((ClassDescriptor) declarationDescriptor, (ClassDescriptor) declarationDescriptor2);
        }
        if ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return areTypeParametersEquivalent$default(this, (TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, null, 4, null);
        }
        if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            return areCallableDescriptorsEquivalent$default(this, (CallableDescriptor) declarationDescriptor, (CallableDescriptor) declarationDescriptor2, false, 4, null);
        }
        if ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) {
            return C2668g.a(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), ((PackageFragmentDescriptor) declarationDescriptor2).getFqName());
        }
        return C2668g.a(declarationDescriptor, declarationDescriptor2);
    }

    private final boolean areClassesEquivalent(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        return C2668g.a(classDescriptor.getTypeConstructor(), classDescriptor2.getTypeConstructor());
    }

    static /* synthetic */ boolean areTypeParametersEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1.INSTANCE;
        }
        return descriptorEquivalenceForOverrides.areTypeParametersEquivalent(typeParameterDescriptor, typeParameterDescriptor2, function2);
    }

    private final boolean areTypeParametersEquivalent(TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> function2) {
        boolean z = true;
        if (C2668g.a(typeParameterDescriptor, typeParameterDescriptor2)) {
            return true;
        }
        if (C2668g.a(typeParameterDescriptor.getContainingDeclaration(), typeParameterDescriptor2.getContainingDeclaration()) || ownersEquivalent(typeParameterDescriptor, typeParameterDescriptor2, function2) == null) {
            return false;
        }
        if (typeParameterDescriptor.getIndex() != typeParameterDescriptor2.getIndex()) {
            z = false;
        }
        return z;
    }

    public static /* synthetic */ boolean areCallableDescriptorsEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return descriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent(callableDescriptor, callableDescriptor2, z);
    }

    public final boolean areCallableDescriptorsEquivalent(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, boolean z) {
        C2668g.b(callableDescriptor, "a");
        C2668g.b(callableDescriptor2, "b");
        boolean z2 = true;
        if (C2668g.a(callableDescriptor, callableDescriptor2)) {
            return true;
        }
        if ((C2668g.a(callableDescriptor.getName(), callableDescriptor2.getName()) ^ 1) != 0 || C2668g.a(callableDescriptor.getContainingDeclaration(), callableDescriptor2.getContainingDeclaration())) {
            return false;
        }
        DeclarationDescriptor declarationDescriptor = callableDescriptor;
        if (!DescriptorUtils.isLocal(declarationDescriptor)) {
            DeclarationDescriptor declarationDescriptor2 = callableDescriptor2;
            if (!DescriptorUtils.isLocal(declarationDescriptor2)) {
                if (!ownersEquivalent(declarationDescriptor, declarationDescriptor2, C19133xc15c0bd8.INSTANCE)) {
                    return false;
                }
                OverridingUtil createWithEqualityAxioms = OverridingUtil.createWithEqualityAxioms(new C17610x10bda471(callableDescriptor, callableDescriptor2));
                OverrideCompatibilityInfo isOverridableBy = createWithEqualityAxioms.isOverridableBy(callableDescriptor, callableDescriptor2, null, z ^ 1);
                C2668g.a(isOverridableBy, "overridingUtil.isOverrid… null, !ignoreReturnType)");
                if (isOverridableBy.getResult() == Result.OVERRIDABLE) {
                    callableDescriptor = createWithEqualityAxioms.isOverridableBy(callableDescriptor2, callableDescriptor, null, z ^ true);
                    C2668g.a(callableDescriptor, "overridingUtil.isOverrid… null, !ignoreReturnType)");
                    if (callableDescriptor.getResult() == Result.OVERRIDABLE) {
                        return z2;
                    }
                }
                z2 = false;
                return z2;
            }
        }
        return false;
    }

    private final boolean ownersEquivalent(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> function2) {
        declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        declarationDescriptor2 = declarationDescriptor2.getContainingDeclaration();
        if (!(declarationDescriptor instanceof CallableMemberDescriptor)) {
            if (!(declarationDescriptor2 instanceof CallableMemberDescriptor)) {
                return areEquivalent(declarationDescriptor, declarationDescriptor2);
            }
        }
        return ((Boolean) function2.invoke(declarationDescriptor, declarationDescriptor2)).booleanValue();
    }
}
