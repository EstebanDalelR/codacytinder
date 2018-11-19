package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.C15819j;
import kotlin.Pair;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {
    public static final Companion Companion = new Companion();

    public static final class Companion {
        private Companion() {
        }

        public final boolean doesJavaOverrideHaveIncompatibleValueParameterKinds(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2) {
            C2668g.b(callableDescriptor, "superDescriptor");
            C2668g.b(callableDescriptor2, "subDescriptor");
            if (callableDescriptor2 instanceof JavaMethodDescriptor) {
                if (callableDescriptor instanceof FunctionDescriptor) {
                    JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) callableDescriptor2;
                    FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor;
                    Object obj = javaMethodDescriptor.getValueParameters().size() == functionDescriptor.getValueParameters().size() ? 1 : null;
                    if (C15819j.f49018a && obj == null) {
                        throw ((Throwable) new AssertionError("External overridability condition with CONFLICTS_ONLY should not be run with different value parameters size"));
                    }
                    SimpleFunctionDescriptor original = javaMethodDescriptor.getOriginal();
                    C2668g.a(original, "subDescriptor.original");
                    List valueParameters = original.getValueParameters();
                    C2668g.a(valueParameters, "subDescriptor.original.valueParameters");
                    Iterable iterable = valueParameters;
                    FunctionDescriptor original2 = functionDescriptor.getOriginal();
                    C2668g.a(original2, "superDescriptor.original");
                    List valueParameters2 = original2.getValueParameters();
                    C2668g.a(valueParameters2, "superDescriptor.original.valueParameters");
                    for (Pair pair : C19299w.m68815c(iterable, (Iterable) valueParameters2)) {
                        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.m59805c();
                        ValueParameterDescriptor valueParameterDescriptor2 = (ValueParameterDescriptor) pair.m59806d();
                        Companion companion = this;
                        FunctionDescriptor functionDescriptor2 = (FunctionDescriptor) callableDescriptor2;
                        C2668g.a(valueParameterDescriptor, "subParameter");
                        boolean z = mapValueParameterType(functionDescriptor2, valueParameterDescriptor) instanceof Primitive;
                        C2668g.a(valueParameterDescriptor2, "superParameter");
                        if (z != (mapValueParameterType(functionDescriptor, valueParameterDescriptor2) instanceof Primitive)) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        }

        private final JvmType mapValueParameterType(FunctionDescriptor functionDescriptor, ValueParameterDescriptor valueParameterDescriptor) {
            if (!MethodSignatureMappingKt.forceSingleValueParameterBoxing(functionDescriptor)) {
                if (isPrimitiveCompareTo(functionDescriptor) == null) {
                    functionDescriptor = valueParameterDescriptor.getType();
                    C2668g.a(functionDescriptor, "valueParameterDescriptor.type");
                    return MethodSignatureMappingKt.mapToJvmType(functionDescriptor);
                }
            }
            functionDescriptor = valueParameterDescriptor.getType();
            C2668g.a(functionDescriptor, "valueParameterDescriptor.type");
            return MethodSignatureMappingKt.mapToJvmType(TypeUtilsKt.makeNullable(functionDescriptor));
        }

        private final boolean isPrimitiveCompareTo(FunctionDescriptor functionDescriptor) {
            boolean z = true;
            if (functionDescriptor.getValueParameters().size() != 1) {
                return false;
            }
            DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
            if (!(containingDeclaration instanceof ClassDescriptor)) {
                containingDeclaration = null;
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
            if (classDescriptor == null) {
                return false;
            }
            functionDescriptor = functionDescriptor.getValueParameters();
            C2668g.a(functionDescriptor, "f.valueParameters");
            functionDescriptor = C19299w.m68836j((List) functionDescriptor);
            C2668g.a(functionDescriptor, "f.valueParameters.single()");
            functionDescriptor = ((ValueParameterDescriptor) functionDescriptor).getType().getConstructor().getDeclarationDescriptor();
            if (!(functionDescriptor instanceof ClassDescriptor)) {
                functionDescriptor = null;
            }
            ClassDescriptor classDescriptor2 = (ClassDescriptor) functionDescriptor;
            if (classDescriptor2 == null) {
                return false;
            }
            if (!KotlinBuiltIns.isPrimitiveClass(classDescriptor) || C2668g.a(DescriptorUtilsKt.getFqNameSafe(classDescriptor), DescriptorUtilsKt.getFqNameSafe(classDescriptor2)) == null) {
                z = false;
            }
            return z;
        }
    }

    @NotNull
    public Result isOverridable(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor) {
        C2668g.b(callableDescriptor, "superDescriptor");
        C2668g.b(callableDescriptor2, "subDescriptor");
        if (isIncompatibleInAccordanceWithBuiltInOverridabilityRules(callableDescriptor, callableDescriptor2, classDescriptor) != null) {
            return Result.INCOMPATIBLE;
        }
        if (Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(callableDescriptor, callableDescriptor2) != null) {
            return Result.INCOMPATIBLE;
        }
        return Result.UNKNOWN;
    }

    private final boolean isIncompatibleInAccordanceWithBuiltInOverridabilityRules(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof FunctionDescriptor)) {
            if (!KotlinBuiltIns.isBuiltIn(callableDescriptor2)) {
                Object obj;
                BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
                FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor2;
                Name name = functionDescriptor.getName();
                C2668g.a(name, "subDescriptor.name");
                if (!builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
                    BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName = BuiltinMethodsWithDifferentJvmName.INSTANCE;
                    name = functionDescriptor.getName();
                    C2668g.a(name, "subDescriptor.name");
                    if (!builtinMethodsWithDifferentJvmName.getSameAsRenamedInJvmBuiltin(name)) {
                        return false;
                    }
                }
                CallableMemberDescriptor overriddenSpecialBuiltin = SpecialBuiltinMembers.getOverriddenSpecialBuiltin((CallableMemberDescriptor) callableDescriptor);
                boolean isHiddenToOvercomeSignatureClash = functionDescriptor.isHiddenToOvercomeSignatureClash();
                boolean z = callableDescriptor instanceof FunctionDescriptor;
                FunctionDescriptor functionDescriptor2 = (FunctionDescriptor) (!z ? null : callableDescriptor);
                if (functionDescriptor2 != null) {
                    if (isHiddenToOvercomeSignatureClash == functionDescriptor2.isHiddenToOvercomeSignatureClash()) {
                        obj = null;
                        if (obj == null && (overriddenSpecialBuiltin == null || !functionDescriptor.isHiddenToOvercomeSignatureClash())) {
                            return true;
                        }
                        if (classDescriptor instanceof JavaClassDescriptor) {
                            if (functionDescriptor.getInitialSignatureDescriptor() != null) {
                                if (overriddenSpecialBuiltin != null) {
                                    if (SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(classDescriptor, overriddenSpecialBuiltin) != null) {
                                        if (!((overriddenSpecialBuiltin instanceof FunctionDescriptor) == null || !z || BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((FunctionDescriptor) overriddenSpecialBuiltin) == null)) {
                                            callableDescriptor2 = MethodSignatureMappingKt.computeJvmDescriptor(functionDescriptor, false);
                                            callableDescriptor = ((FunctionDescriptor) callableDescriptor).getOriginal();
                                            C2668g.a(callableDescriptor, "superDescriptor.original");
                                            if (C2668g.a(callableDescriptor2, MethodSignatureMappingKt.computeJvmDescriptor(callableDescriptor, false)) == null) {
                                                return false;
                                            }
                                        }
                                        return true;
                                    }
                                }
                                return false;
                            }
                        }
                        return false;
                    }
                }
                obj = 1;
                if (obj == null) {
                }
                if (classDescriptor instanceof JavaClassDescriptor) {
                    if (functionDescriptor.getInitialSignatureDescriptor() != null) {
                        if (overriddenSpecialBuiltin != null) {
                            if (SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(classDescriptor, overriddenSpecialBuiltin) != null) {
                                callableDescriptor2 = MethodSignatureMappingKt.computeJvmDescriptor(functionDescriptor, false);
                                callableDescriptor = ((FunctionDescriptor) callableDescriptor).getOriginal();
                                C2668g.a(callableDescriptor, "superDescriptor.original");
                                if (C2668g.a(callableDescriptor2, MethodSignatureMappingKt.computeJvmDescriptor(callableDescriptor, false)) == null) {
                                    return true;
                                }
                                return false;
                            }
                        }
                        return false;
                    }
                }
                return false;
            }
        }
        return false;
    }

    @NotNull
    public Contract getContract() {
        return Contract.CONFLICTS_ONLY;
    }
}
