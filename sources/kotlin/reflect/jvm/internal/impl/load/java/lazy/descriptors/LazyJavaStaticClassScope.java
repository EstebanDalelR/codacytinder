package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.collections.C15807n;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19291t;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {
    private final JavaClass jClass;
    @NotNull
    private final LazyJavaClassDescriptor ownerDescriptor;

    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        return null;
    }

    @NotNull
    protected LazyJavaClassDescriptor getOwnerDescriptor() {
        return this.ownerDescriptor;
    }

    public LazyJavaStaticClassScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaClass javaClass, @NotNull LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        C2668g.b(lazyJavaResolverContext, "c");
        C2668g.b(javaClass, "jClass");
        C2668g.b(lazyJavaClassDescriptor, "ownerDescriptor");
        super(lazyJavaResolverContext);
        this.jClass = javaClass;
        this.ownerDescriptor = lazyJavaClassDescriptor;
    }

    @NotNull
    protected ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.jClass, LazyJavaStaticClassScope$computeMemberIndex$1.INSTANCE);
    }

    @NotNull
    protected Set<Name> computeFunctionNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        descriptorKindFilter = C19299w.m68845q(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).getMethodNames());
        function1 = UtilKt.getParentJavaStaticClassScope(getOwnerDescriptor());
        function1 = function1 != null ? function1.getFunctionNames() : null;
        if (function1 == null) {
            function1 = am.m64176a();
        }
        descriptorKindFilter.addAll((Collection) function1);
        if (this.jClass.isEnum() != null) {
            descriptorKindFilter.addAll(C17554o.m64199b((Object[]) new Name[]{DescriptorUtils.ENUM_VALUE_OF, DescriptorUtils.ENUM_VALUES}));
        }
        return descriptorKindFilter;
    }

    @NotNull
    protected Set<Name> computePropertyNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        descriptorKindFilter = C19299w.m68845q(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).getFieldNames());
        flatMapJavaStaticSupertypesScopes(getOwnerDescriptor(), descriptorKindFilter, LazyJavaStaticClassScope$computePropertyNames$1$1.INSTANCE);
        return descriptorKindFilter;
    }

    @NotNull
    protected Set<Name> computeClassNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        return am.m64176a();
    }

    protected void computeNonDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        C2668g.b(collection, "result");
        C2668g.b(name, "name");
        Collection resolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, getStaticFunctionsFromJavaSuperClasses(name, getOwnerDescriptor()), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter());
        C2668g.a(resolveOverridesForStaticMembers, "resolveOverridesForStati…components.errorReporter)");
        collection.addAll(resolveOverridesForStaticMembers);
        if (!this.jClass.isEnum()) {
            return;
        }
        if (C2668g.a(name, DescriptorUtils.ENUM_VALUE_OF)) {
            name = DescriptorFactory.createEnumValueOfMethod(getOwnerDescriptor());
            C2668g.a(name, "createEnumValueOfMethod(ownerDescriptor)");
            collection.add(name);
        } else if (C2668g.a(name, DescriptorUtils.ENUM_VALUES) != null) {
            name = DescriptorFactory.createEnumValuesMethod(getOwnerDescriptor());
            C2668g.a(name, "createEnumValuesMethod(ownerDescriptor)");
            collection.add(name);
        }
    }

    protected void computeNonDeclaredProperties(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
        C2668g.b(name, "name");
        C2668g.b(collection, "result");
        Set flatMapJavaStaticSupertypesScopes = flatMapJavaStaticSupertypesScopes(getOwnerDescriptor(), new LinkedHashSet(), new C19091xd2f8c9a5(name));
        if ((collection.isEmpty() ^ 1) != 0) {
            name = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, flatMapJavaStaticSupertypesScopes, collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter());
            C2668g.a(name, "resolveOverridesForStati…rorReporter\n            )");
            collection.addAll(name);
            return;
        }
        Map linkedHashMap = new LinkedHashMap();
        for (Object next : flatMapJavaStaticSupertypesScopes) {
            PropertyDescriptor realOriginal = getRealOriginal((PropertyDescriptor) next);
            ArrayList arrayList = linkedHashMap.get(realOriginal);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(realOriginal, arrayList);
            }
            arrayList.add(next);
        }
        Collection arrayList2 = new ArrayList();
        for (Entry value : linkedHashMap.entrySet()) {
            C19291t.m68635a(arrayList2, (Iterable) DescriptorResolverUtils.resolveOverridesForStaticMembers(name, (Collection) value.getValue(), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter()));
        }
        collection.addAll((List) arrayList2);
    }

    private final Set<SimpleFunctionDescriptor> getStaticFunctionsFromJavaSuperClasses(Name name, ClassDescriptor classDescriptor) {
        classDescriptor = UtilKt.getParentJavaStaticClassScope(classDescriptor);
        if (classDescriptor != null) {
            return C19299w.m68842n(classDescriptor.getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return am.m64176a();
    }

    private final <R> Set<R> flatMapJavaStaticSupertypesScopes(ClassDescriptor classDescriptor, Set<R> set, Function1<? super MemberScope, ? extends Collection<? extends R>> function1) {
        DFS.dfs(C15807n.m59826a(classDescriptor), LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1.INSTANCE, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(classDescriptor, set, function1));
        return set;
    }

    private final PropertyDescriptor getRealOriginal(@NotNull PropertyDescriptor propertyDescriptor) {
        Kind kind = propertyDescriptor.getKind();
        C2668g.a(kind, "this.kind");
        if (kind.isReal()) {
            return propertyDescriptor;
        }
        propertyDescriptor = propertyDescriptor.getOverriddenDescriptors();
        C2668g.a(propertyDescriptor, "this.overriddenDescriptors");
        Iterable<PropertyDescriptor> iterable = (Iterable) propertyDescriptor;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (PropertyDescriptor propertyDescriptor2 : iterable) {
            C2668g.a(propertyDescriptor2, "it");
            arrayList.add(getRealOriginal(propertyDescriptor2));
        }
        return (PropertyDescriptor) C19299w.m68836j((List) C19299w.m68844p((List) arrayList));
    }
}
