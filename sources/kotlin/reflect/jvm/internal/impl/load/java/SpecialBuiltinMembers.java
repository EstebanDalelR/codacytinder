package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.TypeCastException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(name = "SpecialBuiltinMembers")
public final class SpecialBuiltinMembers {
    private static final FqName child(@NotNull FqName fqName, String str) {
        fqName = fqName.child(Name.identifier(str));
        C2668g.a(fqName, "child(Name.identifier(name))");
        return fqName;
    }

    private static final FqName childSafe(@NotNull FqNameUnsafe fqNameUnsafe, String str) {
        fqNameUnsafe = fqNameUnsafe.child(Name.identifier(str)).toSafe();
        C2668g.a(fqNameUnsafe, "child(Name.identifier(name)).toSafe()");
        return fqNameUnsafe;
    }

    private static final NameAndSignature method(@NotNull String str, String str2, String str3, String str4) {
        Name identifier = Name.identifier(str2);
        C2668g.a(identifier, "Name.identifier(name)");
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(str2);
        stringBuilder.append('(');
        stringBuilder.append(str3);
        stringBuilder.append(')');
        stringBuilder.append(str4);
        return new NameAndSignature(identifier, signatureBuildingComponents.signature(str, stringBuilder.toString()));
    }

    @Nullable
    public static final <T extends CallableMemberDescriptor> T getOverriddenBuiltinWithDifferentJvmName(@NotNull T t) {
        C2668g.b(t, "$receiver");
        T t2 = null;
        if (!BuiltinMethodsWithDifferentJvmName.INSTANCE.getORIGINAL_SHORT_NAMES().contains(t.getName()) && !BuiltinSpecialProperties.INSTANCE.getSPECIAL_SHORT_NAMES$descriptors_jvm().contains(DescriptorUtilsKt.getPropertyIfAccessor(t).getName())) {
            return null;
        }
        if (!(t instanceof PropertyDescriptor)) {
            if (!(t instanceof PropertyAccessorDescriptor)) {
                if (t instanceof SimpleFunctionDescriptor) {
                    t2 = DescriptorUtilsKt.firstOverridden$default(t, false, SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2.INSTANCE, 1, null);
                }
                return t2;
            }
        }
        t2 = DescriptorUtilsKt.firstOverridden$default(t, false, SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1.INSTANCE, 1, null);
        return t2;
    }

    public static final boolean doesOverrideBuiltinWithDifferentJvmName(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.b(callableMemberDescriptor, "$receiver");
        return getOverriddenBuiltinWithDifferentJvmName(callableMemberDescriptor) != null ? true : null;
    }

    @Nullable
    public static final <T extends CallableMemberDescriptor> T getOverriddenSpecialBuiltin(@NotNull T t) {
        C2668g.b(t, "$receiver");
        T overriddenBuiltinWithDifferentJvmName = getOverriddenBuiltinWithDifferentJvmName(t);
        if (overriddenBuiltinWithDifferentJvmName != null) {
            return overriddenBuiltinWithDifferentJvmName;
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name = t.getName();
        C2668g.a(name, "name");
        if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return DescriptorUtilsKt.firstOverridden$default(t, false, SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2.INSTANCE, 1, null);
        }
        return null;
    }

    @Nullable
    public static final String getJvmMethodNameIfSpecial(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.b(callableMemberDescriptor, "callableMemberDescriptor");
        callableMemberDescriptor = getOverriddenBuiltinThatAffectsJvmName(callableMemberDescriptor);
        String str = null;
        if (callableMemberDescriptor != null) {
            callableMemberDescriptor = DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor);
            if (callableMemberDescriptor != null) {
                if (callableMemberDescriptor instanceof PropertyDescriptor) {
                    str = BuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(callableMemberDescriptor);
                } else if (callableMemberDescriptor instanceof SimpleFunctionDescriptor) {
                    callableMemberDescriptor = BuiltinMethodsWithDifferentJvmName.INSTANCE.getJvmName((SimpleFunctionDescriptor) callableMemberDescriptor);
                    if (callableMemberDescriptor != null) {
                        str = callableMemberDescriptor.asString();
                    }
                }
                return str;
            }
        }
        return null;
    }

    private static final CallableMemberDescriptor getOverriddenBuiltinThatAffectsJvmName(CallableMemberDescriptor callableMemberDescriptor) {
        return KotlinBuiltIns.isBuiltIn((DeclarationDescriptor) callableMemberDescriptor) ? getOverriddenBuiltinWithDifferentJvmName(callableMemberDescriptor) : null;
    }

    public static final boolean hasRealKotlinSuperClassWithOverrideOf(@NotNull ClassDescriptor classDescriptor, @NotNull CallableDescriptor callableDescriptor) {
        C2668g.b(classDescriptor, "$receiver");
        C2668g.b(callableDescriptor, "specialCallableDescriptor");
        callableDescriptor = callableDescriptor.getContainingDeclaration();
        if (callableDescriptor == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
        callableDescriptor = ((ClassDescriptor) callableDescriptor).getDefaultType();
        classDescriptor = DescriptorUtils.getSuperClassDescriptor(classDescriptor);
        while (true) {
            boolean z = false;
            if (classDescriptor == null) {
                return false;
            }
            if (!(classDescriptor instanceof JavaClassDescriptor)) {
                if (TypeCheckingProcedure.findCorrespondingSupertype(classDescriptor.getDefaultType(), (KotlinType) callableDescriptor) != null) {
                    z = true;
                }
                if (z) {
                    return KotlinBuiltIns.isBuiltIn(classDescriptor) ^ 1;
                }
            }
            classDescriptor = DescriptorUtils.getSuperClassDescriptor(classDescriptor);
        }
    }

    public static final boolean isFromJava(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.b(callableMemberDescriptor, "$receiver");
        return DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor).getContainingDeclaration() instanceof JavaClassDescriptor;
    }

    public static final boolean isFromJavaOrBuiltins(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.b(callableMemberDescriptor, "$receiver");
        if (!isFromJava(callableMemberDescriptor)) {
            if (KotlinBuiltIns.isBuiltIn(callableMemberDescriptor) == null) {
                return null;
            }
        }
        return true;
    }
}
