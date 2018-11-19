package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;
import org.jetbrains.annotations.NotNull;

final class DescriptorUtilsKt$declaresOrInheritsDefaultValue$1<N> implements Neighbors<N> {
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$1 INSTANCE = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$1();

    DescriptorUtilsKt$declaresOrInheritsDefaultValue$1() {
    }

    @NotNull
    public final List<ValueParameterDescriptor> getNeighbors(ValueParameterDescriptor valueParameterDescriptor) {
        C2668g.a(valueParameterDescriptor, "current");
        Iterable<ValueParameterDescriptor> overriddenDescriptors = valueParameterDescriptor.getOverriddenDescriptors();
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) overriddenDescriptors, 10));
        for (ValueParameterDescriptor original : overriddenDescriptors) {
            arrayList.add(original.getOriginal());
        }
        return (List) arrayList;
    }
}
