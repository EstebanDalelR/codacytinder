package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.sequences.C19155k;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Result.values().length];

        static {
            $EnumSwitchMapping$0[Result.OVERRIDABLE.ordinal()] = 1;
        }
    }

    @NotNull
    public ExternalOverridabilityCondition.Result isOverridable(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor) {
        C2668g.b(callableDescriptor, "superDescriptor");
        C2668g.b(callableDescriptor2, "subDescriptor");
        if ((callableDescriptor2 instanceof JavaMethodDescriptor) != null) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) callableDescriptor2;
            List typeParameters = javaMethodDescriptor.getTypeParameters();
            C2668g.a(typeParameters, "subDescriptor.typeParameters");
            if ((typeParameters.isEmpty() ^ 1) == 0) {
                OverrideCompatibilityInfo basicOverridabilityProblem = OverridingUtil.getBasicOverridabilityProblem(callableDescriptor, callableDescriptor2);
                Object obj = null;
                if ((basicOverridabilityProblem != null ? basicOverridabilityProblem.getResult() : null) != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                typeParameters = javaMethodDescriptor.getValueParameters();
                C2668g.a(typeParameters, "subDescriptor.valueParameters");
                Sequence e = C19155k.m68032e(C19299w.m68846r(typeParameters), ErasedOverridabilityCondition$isOverridable$signatureTypes$1.INSTANCE);
                KotlinType returnType = javaMethodDescriptor.getReturnType();
                if (returnType == null) {
                    C2668g.a();
                }
                e = C19155k.m68023a(e, (Object) returnType);
                classDescriptor = javaMethodDescriptor.getExtensionReceiverParameter();
                if (classDescriptor != null) {
                    obj = classDescriptor.getType();
                }
                for (KotlinType kotlinType : C19155k.m68022a(e, (Iterable) C17554o.m64197b(r2))) {
                    Object obj2;
                    if ((kotlinType.getArguments().isEmpty() ^ 1) == 0 || (kotlinType.unwrap() instanceof RawTypeImpl)) {
                        obj2 = null;
                        continue;
                    } else {
                        obj2 = 1;
                        continue;
                    }
                    if (obj2 != null) {
                        classDescriptor = true;
                        break;
                    }
                }
                classDescriptor = null;
                if (classDescriptor != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                callableDescriptor = (CallableDescriptor) callableDescriptor.substitute(RawSubstitution.INSTANCE.buildSubstitutor());
                if (callableDescriptor == null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if ((callableDescriptor instanceof SimpleFunctionDescriptor) != null) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) callableDescriptor;
                    typeParameters = simpleFunctionDescriptor.getTypeParameters();
                    C2668g.a(typeParameters, "erasedSuper.typeParameters");
                    if ((typeParameters.isEmpty() ^ 1) != 0) {
                        callableDescriptor = simpleFunctionDescriptor.newCopyBuilder().setTypeParameters(C17554o.m64195a()).build();
                        if (callableDescriptor == null) {
                            C2668g.a();
                        }
                        callableDescriptor = callableDescriptor;
                    }
                }
                callableDescriptor = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(callableDescriptor, callableDescriptor2, false);
                C2668g.a(callableDescriptor, "OverridingUtil.DEFAULT.i…er, subDescriptor, false)");
                if (WhenMappings.$EnumSwitchMapping$0[callableDescriptor.getResult().ordinal()] != 1) {
                    callableDescriptor = ExternalOverridabilityCondition.Result.UNKNOWN;
                } else {
                    callableDescriptor = ExternalOverridabilityCondition.Result.OVERRIDABLE;
                }
                return callableDescriptor;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    @NotNull
    public Contract getContract() {
        return Contract.SUCCESS_ONLY;
    }
}
