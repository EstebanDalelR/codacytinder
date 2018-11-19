package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractScopeAdapter implements MemberScope {
    @NotNull
    protected abstract MemberScope getWorkerScope();

    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        return getWorkerScope().getContributedFunctions(name, lookupLocation);
    }

    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        return getWorkerScope().getContributedClassifier(name, lookupLocation);
    }

    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        return getWorkerScope().getContributedVariables(name, lookupLocation);
    }

    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        C2668g.b(function1, "nameFilter");
        return getWorkerScope().getContributedDescriptors(descriptorKindFilter, function1);
    }

    @NotNull
    public Set<Name> getFunctionNames() {
        return getWorkerScope().getFunctionNames();
    }

    @NotNull
    public Set<Name> getVariableNames() {
        return getWorkerScope().getVariableNames();
    }
}
