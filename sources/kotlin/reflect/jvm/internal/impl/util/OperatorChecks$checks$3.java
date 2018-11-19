package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class OperatorChecks$checks$3 extends Lambda implements Function1<FunctionDescriptor, String> {
    public static final OperatorChecks$checks$3 INSTANCE = new OperatorChecks$checks$3();

    OperatorChecks$checks$3() {
        super(1);
    }

    @Nullable
    public final String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "$receiver");
        ReceiverParameterDescriptor dispatchReceiverParameter = functionDescriptor.getDispatchReceiverParameter();
        if (dispatchReceiverParameter == null) {
            dispatchReceiverParameter = functionDescriptor.getExtensionReceiverParameter();
        }
        OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
        Object obj = null;
        if (dispatchReceiverParameter != null) {
            functionDescriptor = functionDescriptor.getReturnType();
            if (functionDescriptor != null) {
                KotlinType type = dispatchReceiverParameter.getType();
                C2668g.a(type, "receiver.type");
                functionDescriptor = TypeUtilsKt.isSubtypeOf(functionDescriptor, type);
            } else {
                functionDescriptor = null;
            }
            if (functionDescriptor != null) {
                obj = 1;
            }
        }
        return obj == null ? "receiver must be a supertype of the return type" : null;
    }
}
