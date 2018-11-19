package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;

public final class OverridingUtilsKt {
    @NotNull
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(@NotNull Collection<? extends H> collection, @NotNull Function1<? super H, ? extends CallableDescriptor> function1) {
        C2668g.b(collection, "$receiver");
        C2668g.b(function1, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        collection = SmartSet.Companion.create();
        while (true) {
            Collection collection2 = linkedList;
            if ((collection2.isEmpty() ^ 1) == 0) {
                return collection;
            }
            Object f = C19299w.m68829f((List) linkedList);
            SmartSet create = SmartSet.Companion.create();
            collection2 = OverridingUtil.extractMembersOverridableInBothWays(f, collection2, function1, new C19136x410e6287(create));
            if (collection2.size() == 1 && create.isEmpty()) {
                C2668g.a(collection2, "overridableGroup");
                Object f2 = C19299w.m68828f((Iterable) collection2);
                C2668g.a(f2, "overridableGroup.single()");
                collection.add(f2);
            } else {
                f = OverridingUtil.selectMostSpecificMember(collection2, function1);
                C2668g.a(f, "mostSpecific");
                CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(f);
                C2668g.a(collection2, "overridableGroup");
                for (Object next : collection2) {
                    C2668g.a(next, "it");
                    if (!OverridingUtil.isMoreSpecific(callableDescriptor, (CallableDescriptor) function1.invoke(next))) {
                        create.add(next);
                    }
                }
                Collection collection3 = create;
                if ((collection3.isEmpty() ^ 1) != 0) {
                    collection.addAll(collection3);
                }
                collection.add(f);
            }
        }
    }

    public static final <D extends CallableDescriptor> void retainMostSpecificInEachOverridableGroup(@NotNull Collection<D> collection) {
        C2668g.b(collection, "$receiver");
        Collection selectMostSpecificInEachOverridableGroup = selectMostSpecificInEachOverridableGroup(collection, C19135x48e71be5.INSTANCE);
        if (collection.size() != selectMostSpecificInEachOverridableGroup.size()) {
            collection.retainAll(selectMostSpecificInEachOverridableGroup);
        }
    }
}
