package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.util.Check.DefaultImpls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class MemberKindCheck implements Check {
    @NotNull
    private final String description;

    public static final class Member extends MemberKindCheck {
        public static final Member INSTANCE = new Member();

        private Member() {
            super("must be a member function");
        }

        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            C2668g.b(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getDispatchReceiverParameter() != null ? true : null;
        }
    }

    public static final class MemberOrExtension extends MemberKindCheck {
        public static final MemberOrExtension INSTANCE = new MemberOrExtension();

        private MemberOrExtension() {
            super("must be a member or an extension function");
        }

        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            C2668g.b(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.getDispatchReceiverParameter() == null) {
                if (functionDescriptor.getExtensionReceiverParameter() == null) {
                    return null;
                }
            }
            return true;
        }
    }

    private MemberKindCheck(String str) {
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
