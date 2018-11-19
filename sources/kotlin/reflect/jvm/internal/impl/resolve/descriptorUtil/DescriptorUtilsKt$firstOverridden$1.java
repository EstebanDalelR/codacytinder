package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.collections.C17554o;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;
import org.jetbrains.annotations.NotNull;

final class DescriptorUtilsKt$firstOverridden$1<N> implements Neighbors<N> {
    final /* synthetic */ boolean $useOriginal;

    DescriptorUtilsKt$firstOverridden$1(boolean z) {
        this.$useOriginal = z;
    }

    @NotNull
    public final Iterable<CallableMemberDescriptor> getNeighbors(CallableMemberDescriptor callableMemberDescriptor) {
        if (this.$useOriginal) {
            callableMemberDescriptor = callableMemberDescriptor != null ? callableMemberDescriptor.getOriginal() : null;
        }
        if (callableMemberDescriptor != null) {
            callableMemberDescriptor = callableMemberDescriptor.getOverriddenDescriptors();
            if (callableMemberDescriptor != null) {
                return (Iterable) callableMemberDescriptor;
            }
        }
        callableMemberDescriptor = C17554o.m64195a();
        return (Iterable) callableMemberDescriptor;
    }
}
