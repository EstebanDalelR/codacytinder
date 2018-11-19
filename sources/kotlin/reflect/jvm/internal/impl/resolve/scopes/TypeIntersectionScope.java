package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public final class TypeIntersectionScope extends AbstractScopeAdapter {
    public static final Companion Companion = new Companion();
    @NotNull
    private final ChainedMemberScope workerScope;

    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final MemberScope create(@NotNull String str, @NotNull Collection<? extends KotlinType> collection) {
            C2668g.b(str, "message");
            C2668g.b(collection, "types");
            Iterable<KotlinType> iterable = collection;
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (KotlinType memberScope : iterable) {
                arrayList.add(memberScope.getMemberScope());
            }
            ChainedMemberScope chainedMemberScope = new ChainedMemberScope(str, (List) arrayList);
            if (collection.size() <= 1) {
                return chainedMemberScope;
            }
            return (MemberScope) new TypeIntersectionScope(chainedMemberScope);
        }
    }

    @JvmStatic
    @NotNull
    public static final MemberScope create(@NotNull String str, @NotNull Collection<? extends KotlinType> collection) {
        return Companion.create(str, collection);
    }

    private TypeIntersectionScope(ChainedMemberScope chainedMemberScope) {
        this.workerScope = chainedMemberScope;
    }

    @NotNull
    protected ChainedMemberScope getWorkerScope() {
        return this.workerScope;
    }

    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        return OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedFunctions(name, lookupLocation), (Function1) TypeIntersectionScope$getContributedFunctions$1.INSTANCE);
    }

    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        return OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedVariables(name, lookupLocation), (Function1) TypeIntersectionScope$getContributedVariables$1.INSTANCE);
    }

    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        C2668g.b(function1, "nameFilter");
        Iterable contributedDescriptors = super.getContributedDescriptors(descriptorKindFilter, function1);
        function1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        for (Object next : contributedDescriptors) {
            if (((DeclarationDescriptor) next) instanceof CallableDescriptor) {
                function1.add(next);
            } else {
                arrayList.add(next);
            }
        }
        descriptorKindFilter = new Pair(function1, arrayList);
        List list = (List) descriptorKindFilter.m59805c();
        List list2 = (List) descriptorKindFilter.m59806d();
        if (list != null) {
            return C19299w.m68809b((Collection) OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list, TypeIntersectionScope$getContributedDescriptors$2.INSTANCE), (Iterable) list2);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
    }
}
