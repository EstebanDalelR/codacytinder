package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C19291t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ChainedMemberScope implements MemberScope {
    public static final Companion Companion = new Companion();
    @NotNull
    private final String debugName;
    private final List<MemberScope> scopes;

    public static final class Companion {
        private Companion() {
        }
    }

    public ChainedMemberScope(@NotNull String str, @NotNull List<? extends MemberScope> list) {
        C2668g.b(str, "debugName");
        C2668g.b(list, "scopes");
        this.debugName = str;
        this.scopes = list;
    }

    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        ClassifierDescriptor classifierDescriptor = (ClassifierDescriptor) null;
        for (MemberScope contributedClassifier : this.scopes) {
            ClassifierDescriptor contributedClassifier2 = contributedClassifier.getContributedClassifier(name, lookupLocation);
            if (contributedClassifier2 != null) {
                if (!(contributedClassifier2 instanceof ClassifierDescriptorWithTypeParameters) || !((ClassifierDescriptorWithTypeParameters) contributedClassifier2).isExpect()) {
                    return contributedClassifier2;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = contributedClassifier2;
                }
            }
        }
        return classifierDescriptor;
    }

    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        List<MemberScope> list = this.scopes;
        if (list.isEmpty()) {
            return am.m64176a();
        }
        Collection collection = (Collection) null;
        for (MemberScope contributedVariables : list) {
            collection = ScopeUtilsKt.concat(collection, contributedVariables.getContributedVariables(name, lookupLocation));
        }
        return collection != null ? collection : am.m64176a();
    }

    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        List<MemberScope> list = this.scopes;
        if (list.isEmpty()) {
            return am.m64176a();
        }
        Collection collection = (Collection) null;
        for (MemberScope contributedFunctions : list) {
            collection = ScopeUtilsKt.concat(collection, contributedFunctions.getContributedFunctions(name, lookupLocation));
        }
        return collection != null ? collection : am.m64176a();
    }

    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        C2668g.b(function1, "nameFilter");
        List<MemberScope> list = this.scopes;
        if (list.isEmpty()) {
            return am.m64176a();
        }
        Collection collection = (Collection) null;
        for (MemberScope contributedDescriptors : list) {
            collection = ScopeUtilsKt.concat(collection, contributedDescriptors.getContributedDescriptors(descriptorKindFilter, function1));
        }
        return collection != null ? collection : am.m64176a();
    }

    @NotNull
    public Set<Name> getFunctionNames() {
        Collection linkedHashSet = new LinkedHashSet();
        for (MemberScope functionNames : this.scopes) {
            C19291t.m68635a(linkedHashSet, (Iterable) functionNames.getFunctionNames());
        }
        return (Set) linkedHashSet;
    }

    @NotNull
    public Set<Name> getVariableNames() {
        Collection linkedHashSet = new LinkedHashSet();
        for (MemberScope variableNames : this.scopes) {
            C19291t.m68635a(linkedHashSet, (Iterable) variableNames.getVariableNames());
        }
        return (Set) linkedHashSet;
    }

    @NotNull
    public String toString() {
        return this.debugName;
    }
}
