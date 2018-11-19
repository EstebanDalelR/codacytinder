package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.Check.DefaultImpls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class NoDefaultAndVarargsCheck implements Check {
    public static final NoDefaultAndVarargsCheck INSTANCE = new NoDefaultAndVarargsCheck();
    @NotNull
    private static final String description = "should not have varargs or parameters with default values";

    private NoDefaultAndVarargsCheck() {
    }

    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "functionDescriptor");
        return DefaultImpls.invoke(this, functionDescriptor);
    }

    @NotNull
    public String getDescription() {
        return description;
    }

    public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "functionDescriptor");
        functionDescriptor = functionDescriptor.getValueParameters();
        C2668g.a(functionDescriptor, "functionDescriptor.valueParameters");
        Iterable<ValueParameterDescriptor> iterable = (Iterable) functionDescriptor;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : iterable) {
            Object obj;
            C2668g.a(valueParameterDescriptor, "it");
            if (DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) || valueParameterDescriptor.getVarargElementType() != null) {
                obj = null;
                continue;
            } else {
                obj = 1;
                continue;
            }
            if (obj == null) {
                return false;
            }
        }
        return true;
    }
}
