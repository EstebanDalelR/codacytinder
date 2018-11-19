package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FieldOverridabilityCondition implements ExternalOverridabilityCondition {
    @NotNull
    public Result isOverridable(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor) {
        C2668g.b(callableDescriptor, "superDescriptor");
        C2668g.b(callableDescriptor2, "subDescriptor");
        if ((callableDescriptor2 instanceof PropertyDescriptor) != null) {
            if ((callableDescriptor instanceof PropertyDescriptor) != null) {
                PropertyDescriptor propertyDescriptor = (PropertyDescriptor) callableDescriptor2;
                PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) callableDescriptor;
                if ((C2668g.a(propertyDescriptor.getName(), propertyDescriptor2.getName()) ^ 1) != null) {
                    return Result.UNKNOWN;
                }
                if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor) != null && JavaDescriptorUtilKt.isJavaField(propertyDescriptor2) != null) {
                    return Result.OVERRIDABLE;
                }
                if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor) == null) {
                    if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor2) == null) {
                        return Result.UNKNOWN;
                    }
                }
                return Result.INCOMPATIBLE;
            }
        }
        return Result.UNKNOWN;
    }

    @NotNull
    public Contract getContract() {
        return Contract.BOTH;
    }
}
