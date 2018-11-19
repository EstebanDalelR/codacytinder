package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Check {

    public static final class DefaultImpls {
        @Nullable
        public static String invoke(Check check, @NotNull FunctionDescriptor functionDescriptor) {
            C2668g.b(functionDescriptor, "functionDescriptor");
            return check.check(functionDescriptor) == null ? check.getDescription() : null;
        }
    }

    boolean check(@NotNull FunctionDescriptor functionDescriptor);

    @NotNull
    String getDescription();

    @Nullable
    String invoke(@NotNull FunctionDescriptor functionDescriptor);
}
