package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C19291t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JvmPackageScope implements MemberScope {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()Ljava/util/List;"))};
    /* renamed from: c */
    private final LazyJavaResolverContext f57767c;
    @NotNull
    private final LazyJavaPackageScope javaScope;
    private final NotNullLazyValue kotlinScopes$delegate = this.f57767c.getStorageManager().createLazyValue((Function0) new JvmPackageScope$kotlinScopes$2(this));
    private final LazyJavaPackageFragment packageFragment;

    private final List<MemberScope> getKotlinScopes() {
        return (List) StorageKt.getValue(this.kotlinScopes$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public JvmPackageScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaPackage javaPackage, @NotNull LazyJavaPackageFragment lazyJavaPackageFragment) {
        C2668g.b(lazyJavaResolverContext, "c");
        C2668g.b(javaPackage, "jPackage");
        C2668g.b(lazyJavaPackageFragment, "packageFragment");
        this.f57767c = lazyJavaResolverContext;
        this.packageFragment = lazyJavaPackageFragment;
        this.javaScope = new LazyJavaPackageScope(this.f57767c, javaPackage, this.packageFragment);
    }

    @NotNull
    public final LazyJavaPackageScope getJavaScope$descriptors_jvm() {
        return this.javaScope;
    }

    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        recordLookup(name, lookupLocation);
        ClassDescriptor contributedClassifier = this.javaScope.getContributedClassifier(name, lookupLocation);
        if (contributedClassifier != null) {
            return contributedClassifier;
        }
        ClassifierDescriptor classifierDescriptor = (ClassifierDescriptor) null;
        for (MemberScope contributedClassifier2 : getKotlinScopes()) {
            ClassifierDescriptor contributedClassifier3 = contributedClassifier2.getContributedClassifier(name, lookupLocation);
            if (contributedClassifier3 != null) {
                if (!(contributedClassifier3 instanceof ClassifierDescriptorWithTypeParameters) || !((ClassifierDescriptorWithTypeParameters) contributedClassifier3).isExpect()) {
                    classifierDescriptor = contributedClassifier3;
                    break;
                } else if (classifierDescriptor == null) {
                    classifierDescriptor = contributedClassifier3;
                }
            }
        }
        return classifierDescriptor;
    }

    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        recordLookup(name, lookupLocation);
        LazyJavaPackageScope lazyJavaPackageScope = this.javaScope;
        List<MemberScope> kotlinScopes = getKotlinScopes();
        Collection<PropertyDescriptor> contributedVariables = lazyJavaPackageScope.getContributedVariables(name, lookupLocation);
        for (MemberScope contributedVariables2 : kotlinScopes) {
            contributedVariables = ScopeUtilsKt.concat(contributedVariables, contributedVariables2.getContributedVariables(name, lookupLocation));
        }
        return contributedVariables != null ? contributedVariables : am.m64176a();
    }

    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        recordLookup(name, lookupLocation);
        LazyJavaPackageScope lazyJavaPackageScope = this.javaScope;
        List<MemberScope> kotlinScopes = getKotlinScopes();
        Collection<SimpleFunctionDescriptor> contributedFunctions = lazyJavaPackageScope.getContributedFunctions(name, lookupLocation);
        for (MemberScope contributedFunctions2 : kotlinScopes) {
            contributedFunctions = ScopeUtilsKt.concat(contributedFunctions, contributedFunctions2.getContributedFunctions(name, lookupLocation));
        }
        return contributedFunctions != null ? contributedFunctions : am.m64176a();
    }

    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        C2668g.b(function1, "nameFilter");
        LazyJavaPackageScope lazyJavaPackageScope = this.javaScope;
        List<MemberScope> kotlinScopes = getKotlinScopes();
        Collection<DeclarationDescriptor> contributedDescriptors = lazyJavaPackageScope.getContributedDescriptors(descriptorKindFilter, function1);
        for (MemberScope contributedDescriptors2 : kotlinScopes) {
            contributedDescriptors = ScopeUtilsKt.concat(contributedDescriptors, contributedDescriptors2.getContributedDescriptors(descriptorKindFilter, function1));
        }
        return contributedDescriptors != null ? contributedDescriptors : am.m64176a();
    }

    @NotNull
    public Set<Name> getFunctionNames() {
        Collection linkedHashSet = new LinkedHashSet();
        for (MemberScope functionNames : getKotlinScopes()) {
            C19291t.m68635a(linkedHashSet, (Iterable) functionNames.getFunctionNames());
        }
        Set<Name> set = (Set) linkedHashSet;
        set.addAll(this.javaScope.getFunctionNames());
        return set;
    }

    @NotNull
    public Set<Name> getVariableNames() {
        Collection linkedHashSet = new LinkedHashSet();
        for (MemberScope variableNames : getKotlinScopes()) {
            C19291t.m68635a(linkedHashSet, (Iterable) variableNames.getVariableNames());
        }
        Set<Name> set = (Set) linkedHashSet;
        set.addAll(this.javaScope.getVariableNames());
        return set;
    }

    public void recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        UtilsKt.record(this.f57767c.getComponents().getLookupTracker(), lookupLocation, (PackageFragmentDescriptor) this.packageFragment, name);
    }
}
