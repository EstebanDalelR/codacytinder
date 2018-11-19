package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.util.CheckResult.IllegalFunctionName;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractModifierChecks {
    @NotNull
    public abstract List<Checks> getChecks$descriptors();

    @NotNull
    public final CheckResult check(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "functionDescriptor");
        for (Checks checks : getChecks$descriptors()) {
            if (checks.isApplicable(functionDescriptor)) {
                return checks.checkAll(functionDescriptor);
            }
        }
        return (CheckResult) IllegalFunctionName.INSTANCE;
    }
}
