package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class BuiltinOverridabilityCondition implements ExternalOverridabilityCondition {
    @NotNull
    public Result isOverridable(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor) {
        C2668g.b(callableDescriptor, "superDescriptor");
        C2668g.b(callableDescriptor2, "subDescriptor");
        return Result.UNKNOWN;
    }

    @NotNull
    public Contract getContract() {
        return Contract.CONFLICTS_ONLY;
    }
}
