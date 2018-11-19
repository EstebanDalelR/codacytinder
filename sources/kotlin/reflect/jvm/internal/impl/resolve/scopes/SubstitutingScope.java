package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SubstitutingScope implements MemberScope {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(SubstitutingScope.class), "_allDescriptors", "get_allDescriptors()Ljava/util/Collection;"))};
    private final Lazy _allDescriptors$delegate = C15810e.m59833a((Function0) new SubstitutingScope$_allDescriptors$2(this));
    private Map<DeclarationDescriptor, DeclarationDescriptor> substitutedDescriptors;
    private final TypeSubstitutor substitutor;
    private final MemberScope workerScope;

    private final Collection<DeclarationDescriptor> get_allDescriptors() {
        Lazy lazy = this._allDescriptors$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Collection) lazy.getValue();
    }

    public SubstitutingScope(@NotNull MemberScope memberScope, @NotNull TypeSubstitutor typeSubstitutor) {
        C2668g.b(memberScope, "workerScope");
        C2668g.b(typeSubstitutor, "givenSubstitutor");
        this.workerScope = memberScope;
        memberScope = typeSubstitutor.getSubstitution();
        C2668g.a(memberScope, "givenSubstitutor.substitution");
        this.substitutor = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(memberScope, null, 1, null).buildSubstitutor();
    }

    private final <D extends DeclarationDescriptor> D substitute(D d) {
        if (this.substitutor.isEmpty()) {
            return d;
        }
        if (this.substitutedDescriptors == null) {
            this.substitutedDescriptors = new HashMap();
        }
        Map map = this.substitutedDescriptors;
        if (map == null) {
            C2668g.a();
        }
        Object obj = map.get(d);
        if (obj == null) {
            StringBuilder stringBuilder;
            if (d instanceof Substitutable) {
                DeclarationDescriptorNonRoot substitute = ((Substitutable) d).substitute(this.substitutor);
                if (substitute != null) {
                    obj = substitute;
                    map.put(d, obj);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, ");
                    stringBuilder.append("but ");
                    stringBuilder.append(d);
                    stringBuilder.append(" substitution fails");
                    throw new AssertionError(stringBuilder.toString());
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown descriptor in scope: ");
            stringBuilder.append(d);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
        DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) obj;
        if (declarationDescriptor != null) {
            return declarationDescriptor;
        }
        throw new TypeCastException("null cannot be cast to non-null type D");
    }

    private final <D extends DeclarationDescriptor> Collection<D> substitute(Collection<? extends D> collection) {
        if (this.substitutor.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet newLinkedHashSetWithExpectedSize = CollectionsKt.newLinkedHashSetWithExpectedSize(collection.size());
        collection = collection.iterator();
        while (collection.hasNext()) {
            newLinkedHashSetWithExpectedSize.add(substitute((DeclarationDescriptor) collection.next()));
        }
        return newLinkedHashSetWithExpectedSize;
    }

    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        return substitute(this.workerScope.getContributedVariables(name, lookupLocation));
    }

    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        name = this.workerScope.getContributedClassifier(name, lookupLocation);
        return name != null ? (ClassifierDescriptor) substitute((DeclarationDescriptor) name) : null;
    }

    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        return substitute(this.workerScope.getContributedFunctions(name, lookupLocation));
    }

    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        C2668g.b(function1, "nameFilter");
        return get_allDescriptors();
    }

    @NotNull
    public Set<Name> getFunctionNames() {
        return this.workerScope.getFunctionNames();
    }

    @NotNull
    public Set<Name> getVariableNames() {
        return this.workerScope.getVariableNames();
    }
}
