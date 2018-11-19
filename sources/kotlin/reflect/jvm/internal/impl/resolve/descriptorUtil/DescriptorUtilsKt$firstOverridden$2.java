package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DescriptorUtilsKt$firstOverridden$2 extends AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor> {
    final /* synthetic */ Function1 $predicate;
    final /* synthetic */ ObjectRef $result;

    DescriptorUtilsKt$firstOverridden$2(ObjectRef objectRef, Function1 function1) {
        this.$result = objectRef;
        this.$predicate = function1;
    }

    public boolean beforeChildren(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.b(callableMemberDescriptor, "current");
        return ((CallableMemberDescriptor) this.$result.f49022a) == null ? true : null;
    }

    public void afterChildren(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.b(callableMemberDescriptor, "current");
        if (((CallableMemberDescriptor) this.$result.f49022a) == null && ((Boolean) this.$predicate.invoke(callableMemberDescriptor)).booleanValue()) {
            this.$result.f49022a = callableMemberDescriptor;
        }
    }

    @Nullable
    public CallableMemberDescriptor result() {
        return (CallableMemberDescriptor) this.$result.f49022a;
    }
}
