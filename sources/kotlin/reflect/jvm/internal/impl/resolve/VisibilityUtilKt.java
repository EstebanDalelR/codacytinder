package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.C15819j;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import org.jetbrains.annotations.NotNull;

public final class VisibilityUtilKt {
    @NotNull
    public static final CallableMemberDescriptor findMemberWithMaxVisibility(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        C2668g.b(collection, "descriptors");
        int isEmpty = collection.isEmpty() ^ 1;
        if (C15819j.f49018a && isEmpty == 0) {
            throw new AssertionError("Assertion failed");
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) null;
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            if (callableMemberDescriptor != null) {
                Integer compare = Visibilities.compare(callableMemberDescriptor.getVisibility(), callableMemberDescriptor2.getVisibility());
                if (compare != null) {
                    if (C2668g.a(compare.intValue(), 0) >= 0) {
                    }
                }
            }
            callableMemberDescriptor = callableMemberDescriptor2;
        }
        if (callableMemberDescriptor == null) {
            C2668g.a();
        }
        return callableMemberDescriptor;
    }
}
