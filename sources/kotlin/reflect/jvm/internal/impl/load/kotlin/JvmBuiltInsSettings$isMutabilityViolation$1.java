package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;
import org.jetbrains.annotations.NotNull;

final class JvmBuiltInsSettings$isMutabilityViolation$1<N> implements Neighbors<N> {
    public static final JvmBuiltInsSettings$isMutabilityViolation$1 INSTANCE = new JvmBuiltInsSettings$isMutabilityViolation$1();

    JvmBuiltInsSettings$isMutabilityViolation$1() {
    }

    @NotNull
    public final Collection<? extends CallableMemberDescriptor> getNeighbors(CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.a(callableMemberDescriptor, "it");
        callableMemberDescriptor = callableMemberDescriptor.getOriginal();
        C2668g.a(callableMemberDescriptor, "it.original");
        return callableMemberDescriptor.getOverriddenDescriptors();
    }
}
