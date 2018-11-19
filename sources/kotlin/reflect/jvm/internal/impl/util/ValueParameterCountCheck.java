package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.util.Check.DefaultImpls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ValueParameterCountCheck implements Check {
    @NotNull
    private final String description;

    public static final class AtLeast extends ValueParameterCountCheck {
        /* renamed from: n */
        private final int f57768n;

        public AtLeast(int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("must have at least ");
            stringBuilder.append(i);
            stringBuilder.append(" value parameter");
            stringBuilder.append(i > 1 ? "s" : "");
            super(stringBuilder.toString());
            this.f57768n = i;
        }

        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            C2668g.b(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() >= this.f57768n ? true : null;
        }
    }

    public static final class Equals extends ValueParameterCountCheck {
        /* renamed from: n */
        private final int f57769n;

        public Equals(int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("must have exactly ");
            stringBuilder.append(i);
            stringBuilder.append(" value parameters");
            super(stringBuilder.toString());
            this.f57769n = i;
        }

        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            C2668g.b(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == this.f57769n ? true : null;
        }
    }

    public static final class NoValueParameters extends ValueParameterCountCheck {
        public static final NoValueParameters INSTANCE = new NoValueParameters();

        private NoValueParameters() {
            super("must have no value parameters");
        }

        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            C2668g.b(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().isEmpty();
        }
    }

    public static final class SingleValueParameter extends ValueParameterCountCheck {
        public static final SingleValueParameter INSTANCE = new SingleValueParameter();

        private SingleValueParameter() {
            super("must have a single value parameter");
        }

        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            C2668g.b(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == 1;
        }
    }

    private ValueParameterCountCheck(String str) {
        this.description = str;
    }

    @NotNull
    public String getDescription() {
        return this.description;
    }

    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "functionDescriptor");
        return DefaultImpls.invoke(this, functionDescriptor);
    }
}
