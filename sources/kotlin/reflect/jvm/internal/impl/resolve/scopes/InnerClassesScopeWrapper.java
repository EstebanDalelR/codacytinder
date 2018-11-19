package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C17554o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class InnerClassesScopeWrapper extends MemberScopeImpl {
    @NotNull
    private final MemberScope workerScope;

    public InnerClassesScopeWrapper(@NotNull MemberScope memberScope) {
        C2668g.b(memberScope, "workerScope");
        this.workerScope = memberScope;
    }

    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        name = this.workerScope.getContributedClassifier(name, lookupLocation);
        if (name == null) {
            return null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) (!(name instanceof ClassDescriptor) ? null : name);
        if (classDescriptor != null) {
            return classDescriptor;
        }
        if (!(name instanceof TypeAliasDescriptor)) {
            name = null;
        }
        return (TypeAliasDescriptor) name;
    }

    @NotNull
    public List<ClassifierDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        C2668g.b(function1, "nameFilter");
        descriptorKindFilter = descriptorKindFilter.restrictedToKindsOrNull(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK());
        if (descriptorKindFilter == null) {
            return C17554o.m64195a();
        }
        Iterable contributedDescriptors = this.workerScope.getContributedDescriptors(descriptorKindFilter, function1);
        Collection collection = (Collection) new ArrayList();
        for (Object next : contributedDescriptors) {
            if (next instanceof ClassifierDescriptorWithTypeParameters) {
                collection.add(next);
            }
        }
        return (List) collection;
    }

    @NotNull
    public Set<Name> getFunctionNames() {
        return this.workerScope.getFunctionNames();
    }

    @NotNull
    public Set<Name> getVariableNames() {
        return this.workerScope.getVariableNames();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Classes from ");
        stringBuilder.append(this.workerScope);
        return stringBuilder.toString();
    }
}
