package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

public abstract class NonReportingOverrideStrategy extends OverridingStrategy {
    protected abstract void conflict(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2);

    public void overrideConflict(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
        C2668g.b(callableMemberDescriptor, "fromSuper");
        C2668g.b(callableMemberDescriptor2, "fromCurrent");
        conflict(callableMemberDescriptor, callableMemberDescriptor2);
    }

    public void inheritanceConflict(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
        C2668g.b(callableMemberDescriptor, "first");
        C2668g.b(callableMemberDescriptor2, "second");
        conflict(callableMemberDescriptor, callableMemberDescriptor2);
    }
}
