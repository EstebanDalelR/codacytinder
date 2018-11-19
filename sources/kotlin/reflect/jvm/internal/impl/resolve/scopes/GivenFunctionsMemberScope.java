package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.C17554o;
import kotlin.collections.C19291t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;

public abstract class GivenFunctionsMemberScope extends MemberScopeImpl {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    private final NotNullLazyValue allDescriptors$delegate;
    @NotNull
    private final ClassDescriptor containingClass;

    private final List<DeclarationDescriptor> getAllDescriptors() {
        return (List) StorageKt.getValue(this.allDescriptors$delegate, (Object) this, $$delegatedProperties[0]);
    }

    @NotNull
    protected abstract List<FunctionDescriptor> computeDeclaredFunctions();

    @NotNull
    protected final ClassDescriptor getContainingClass() {
        return this.containingClass;
    }

    public GivenFunctionsMemberScope(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor) {
        C2668g.b(storageManager, "storageManager");
        C2668g.b(classDescriptor, "containingClass");
        this.containingClass = classDescriptor;
        this.allDescriptors$delegate = storageManager.createLazyValue((Function0) new GivenFunctionsMemberScope$allDescriptors$2(this));
    }

    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        C2668g.b(function1, "nameFilter");
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.CALLABLES.getKindMask()) == null) {
            return C17554o.m64195a();
        }
        return getAllDescriptors();
    }

    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        Collection arrayList = new ArrayList();
        for (Object next : getAllDescriptors()) {
            if (next instanceof SimpleFunctionDescriptor) {
                arrayList.add(next);
            }
        }
        Collection collection = (Collection) new ArrayList();
        for (Object next2 : (List) arrayList) {
            if (C2668g.a(((SimpleFunctionDescriptor) next2).getName(), name)) {
                collection.add(next2);
            }
        }
        return (List) collection;
    }

    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        Collection arrayList = new ArrayList();
        for (Object next : getAllDescriptors()) {
            if (next instanceof PropertyDescriptor) {
                arrayList.add(next);
            }
        }
        Collection collection = (Collection) new ArrayList();
        for (Object next2 : (List) arrayList) {
            if (C2668g.a(((PropertyDescriptor) next2).getName(), name)) {
                collection.add(next2);
            }
        }
        return (List) collection;
    }

    private final List<DeclarationDescriptor> createFakeOverrides(List<? extends FunctionDescriptor> list) {
        ArrayList arrayList = new ArrayList(3);
        TypeConstructor typeConstructor = this.containingClass.getTypeConstructor();
        C2668g.a(typeConstructor, "containingClass.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        C2668g.a(supertypes, "containingClass.typeConstructor.supertypes");
        Collection arrayList2 = new ArrayList();
        for (KotlinType memberScope : supertypes) {
            C19291t.m68635a(arrayList2, (Iterable) DefaultImpls.getContributedDescriptors$default(memberScope.getMemberScope(), null, null, 3, null));
        }
        Collection arrayList3 = new ArrayList();
        for (Object next : (List) arrayList2) {
            if (next instanceof CallableMemberDescriptor) {
                arrayList3.add(next);
            }
        }
        Map linkedHashMap = new LinkedHashMap();
        for (Object next2 : (List) arrayList3) {
            Name name = ((CallableMemberDescriptor) next2).getName();
            ArrayList arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            arrayList4.add(next2);
        }
        for (Entry entry : linkedHashMap.entrySet()) {
            Name name2 = (Name) entry.getKey();
            Map linkedHashMap2 = new LinkedHashMap();
            for (Object next3 : (List) entry.getValue()) {
                Boolean valueOf = Boolean.valueOf(((CallableMemberDescriptor) next3) instanceof FunctionDescriptor);
                ArrayList arrayList5 = linkedHashMap2.get(valueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(valueOf, arrayList5);
                }
                arrayList5.add(next3);
            }
            for (Entry entry2 : linkedHashMap2.entrySet()) {
                List list2;
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                Collection collection = (List) entry2.getValue();
                if (booleanValue) {
                    Collection arrayList6 = new ArrayList();
                    for (Object next4 : list) {
                        if (C2668g.a(((FunctionDescriptor) next4).getName(), name2)) {
                            arrayList6.add(next4);
                        }
                    }
                    list2 = (List) arrayList6;
                } else {
                    list2 = C17554o.m64195a();
                }
                OverridingUtil.generateOverridesInFunctionGroup(name2, collection, list2, this.containingClass, new GivenFunctionsMemberScope$createFakeOverrides$4(this, arrayList));
            }
        }
        return CollectionsKt.compact(arrayList);
    }
}
