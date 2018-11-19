package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class OperatorChecks$checks$1 extends Lambda implements Function1<FunctionDescriptor, String> {
    public static final OperatorChecks$checks$1 INSTANCE = new OperatorChecks$checks$1();

    OperatorChecks$checks$1() {
        super(1);
    }

    @Nullable
    public final String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "$receiver");
        functionDescriptor = functionDescriptor.getValueParameters();
        C2668g.a(functionDescriptor, "valueParameters");
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) C19299w.m68834i((List) functionDescriptor);
        Object obj = null;
        if (valueParameterDescriptor != null) {
            functionDescriptor = (DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) || valueParameterDescriptor.getVarargElementType() != null) ? null : true;
            if (functionDescriptor == 1) {
                obj = 1;
            }
        }
        functionDescriptor = OperatorChecks.INSTANCE;
        return obj == null ? "last parameter should not have a default value or be a vararg" : null;
    }
}
