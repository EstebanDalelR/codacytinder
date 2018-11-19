package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.C15813i;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19287s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.NameAndTypeMemberComparator;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.sequences.C17625i;
import kotlin.sequences.C19155k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class DeserializedMemberScope extends MemberScopeImpl {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(DeserializedMemberScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(DeserializedMemberScope.class), "variableNamesLazy", "getVariableNamesLazy()Ljava/util/Set;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(DeserializedMemberScope.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;"))};
    @NotNull
    /* renamed from: c */
    private final DeserializationContext f59341c;
    @NotNull
    private final NotNullLazyValue classNames$delegate;
    private final NotNullLazyValue functionNamesLazy$delegate;
    private final Map<Name, byte[]> functionProtosBytes;
    private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> functions;
    private final MemoizedFunctionToNotNull<Name, Collection<PropertyDescriptor>> properties;
    private final Map<Name, byte[]> propertyProtosBytes;
    private final MemoizedFunctionToNullable<Name, TypeAliasDescriptor> typeAliasByName;
    private final Map<Name, byte[]> typeAliasBytes;
    private final NotNullLazyValue variableNamesLazy$delegate;

    private final Set<Name> getFunctionNamesLazy() {
        return (Set) StorageKt.getValue(this.functionNamesLazy$delegate, (Object) this, $$delegatedProperties[0]);
    }

    private final Set<Name> getVariableNamesLazy() {
        return (Set) StorageKt.getValue(this.variableNamesLazy$delegate, (Object) this, $$delegatedProperties[1]);
    }

    protected abstract void addEnumEntryDescriptors(@NotNull Collection<DeclarationDescriptor> collection, @NotNull Function1<? super Name, Boolean> function1);

    protected void computeNonDeclaredFunctions(@NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection) {
        C2668g.b(name, "name");
        C2668g.b(collection, "functions");
    }

    protected void computeNonDeclaredProperties(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
        C2668g.b(name, "name");
        C2668g.b(collection, "descriptors");
    }

    @NotNull
    protected abstract ClassId createClassId(@NotNull Name name);

    @NotNull
    public final Set<Name> getClassNames$deserialization() {
        return (Set) StorageKt.getValue(this.classNames$delegate, (Object) this, $$delegatedProperties[2]);
    }

    @NotNull
    protected abstract Set<Name> getNonDeclaredFunctionNames();

    @NotNull
    protected abstract Set<Name> getNonDeclaredVariableNames();

    @NotNull
    protected final DeserializationContext getC() {
        return this.f59341c;
    }

    protected DeserializedMemberScope(@NotNull DeserializationContext deserializationContext, @NotNull Collection<Function> collection, @NotNull Collection<Property> collection2, @NotNull Collection<TypeAlias> collection3, @NotNull Function0<? extends Collection<Name>> function0) {
        C2668g.b(deserializationContext, "c");
        C2668g.b(collection, "functionList");
        C2668g.b(collection2, "propertyList");
        C2668g.b(collection3, "typeAliasList");
        C2668g.b(function0, "classNames");
        this.f59341c = deserializationContext;
        Map map = (Map) new LinkedHashMap();
        for (Object next : collection) {
            Name name = NameResolverUtilKt.getName(this.f59341c.getNameResolver(), ((Function) ((MessageLite) next)).getName());
            ArrayList arrayList = map.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(name, arrayList);
            }
            arrayList.add(next);
        }
        this.functionProtosBytes = packToByteArray(map);
        map = (Map) new LinkedHashMap();
        for (Collection<Property> collection22 : collection22) {
            Name name2 = NameResolverUtilKt.getName(this.f59341c.getNameResolver(), ((Property) ((MessageLite) collection22)).getName());
            ArrayList arrayList2 = map.get(name2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(name2, arrayList2);
            }
            arrayList2.add(collection22);
        }
        this.propertyProtosBytes = packToByteArray(map);
        if (this.f59341c.getComponents().getConfiguration().getTypeAliasesAllowed() != null) {
            map = (Map) new LinkedHashMap();
            for (Collection<Property> collection222 : collection3) {
                collection3 = NameResolverUtilKt.getName(this.f59341c.getNameResolver(), ((TypeAlias) ((MessageLite) collection222)).getName());
                ArrayList arrayList3 = map.get(collection3);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    map.put(collection3, arrayList3);
                }
                arrayList3.add(collection222);
            }
            deserializationContext = packToByteArray(map);
        } else {
            deserializationContext = ah.m66884a();
        }
        this.typeAliasBytes = deserializationContext;
        this.functions = this.f59341c.getStorageManager().createMemoizedFunction((Function1) new DeserializedMemberScope$functions$1(this));
        this.properties = this.f59341c.getStorageManager().createMemoizedFunction((Function1) new DeserializedMemberScope$properties$1(this));
        this.typeAliasByName = this.f59341c.getStorageManager().createMemoizedFunctionWithNullableValues((Function1) new DeserializedMemberScope$typeAliasByName$1(this));
        this.functionNamesLazy$delegate = this.f59341c.getStorageManager().createLazyValue((Function0) new DeserializedMemberScope$functionNamesLazy$2(this));
        this.variableNamesLazy$delegate = this.f59341c.getStorageManager().createLazyValue((Function0) new DeserializedMemberScope$variableNamesLazy$2(this));
        this.classNames$delegate = this.f59341c.getStorageManager().createLazyValue((Function0) new DeserializedMemberScope$classNames$2(function0));
    }

    private final Set<Name> getTypeAliasNames() {
        return this.typeAliasBytes.keySet();
    }

    @NotNull
    public Set<Name> getFunctionNames() {
        return getFunctionNamesLazy();
    }

    @NotNull
    public Set<Name> getVariableNames() {
        return getVariableNamesLazy();
    }

    private final Collection<SimpleFunctionDescriptor> computeFunctions(Name name) {
        Collection collection;
        Collection arrayList;
        ArrayList arrayList2;
        Map map = this.functionProtosBytes;
        Parser parser = Function.PARSER;
        C2668g.a(parser, "ProtoBuf.Function.PARSER");
        byte[] bArr = (byte[]) map.get(name);
        if (bArr != null) {
            List f = C19155k.m68033f(C17625i.m64230a((Function0) new DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$1(new ByteArrayInputStream(bArr), this, parser)));
            if (f != null) {
                collection = f;
                arrayList = new ArrayList();
                for (Function function : r0) {
                    MemberDeserializer memberDeserializer = this.f59341c.getMemberDeserializer();
                    C2668g.a(function, "it");
                    arrayList.add(memberDeserializer.loadFunction(function));
                }
                arrayList2 = (ArrayList) arrayList;
                computeNonDeclaredFunctions(name, arrayList2);
                return CollectionsKt.compact(arrayList2);
            }
        }
        collection = C17554o.m64195a();
        arrayList = new ArrayList();
        for (Function function2 : r0) {
            MemberDeserializer memberDeserializer2 = this.f59341c.getMemberDeserializer();
            C2668g.a(function2, "it");
            arrayList.add(memberDeserializer2.loadFunction(function2));
        }
        arrayList2 = (ArrayList) arrayList;
        computeNonDeclaredFunctions(name, arrayList2);
        return CollectionsKt.compact(arrayList2);
    }

    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        if (getFunctionNames().contains(name) == null) {
            return C17554o.m64195a();
        }
        return (Collection) this.functions.invoke(name);
    }

    private final Collection<PropertyDescriptor> computeProperties(Name name) {
        Collection collection;
        Collection arrayList;
        ArrayList arrayList2;
        Map map = this.propertyProtosBytes;
        Parser parser = Property.PARSER;
        C2668g.a(parser, "ProtoBuf.Property.PARSER");
        byte[] bArr = (byte[]) map.get(name);
        if (bArr != null) {
            List f = C19155k.m68033f(C17625i.m64230a((Function0) new DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$3(new ByteArrayInputStream(bArr), this, parser)));
            if (f != null) {
                collection = f;
                arrayList = new ArrayList();
                for (Property property : r0) {
                    MemberDeserializer memberDeserializer = this.f59341c.getMemberDeserializer();
                    C2668g.a(property, "it");
                    arrayList.add(memberDeserializer.loadProperty(property));
                }
                arrayList2 = (ArrayList) arrayList;
                computeNonDeclaredProperties(name, arrayList2);
                return CollectionsKt.compact(arrayList2);
            }
        }
        collection = C17554o.m64195a();
        arrayList = new ArrayList();
        for (Property property2 : r0) {
            MemberDeserializer memberDeserializer2 = this.f59341c.getMemberDeserializer();
            C2668g.a(property2, "it");
            arrayList.add(memberDeserializer2.loadProperty(property2));
        }
        arrayList2 = (ArrayList) arrayList;
        computeNonDeclaredProperties(name, arrayList2);
        return CollectionsKt.compact(arrayList2);
    }

    private final TypeAliasDescriptor createTypeAlias(Name name) {
        byte[] bArr = (byte[]) this.typeAliasBytes.get(name);
        if (bArr == null) {
            return null;
        }
        name = TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr), this.f59341c.getComponents().getExtensionRegistryLite());
        if (name != null) {
            return this.f59341c.getMemberDeserializer().loadTypeAlias(name);
        }
        return null;
    }

    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        if (getVariableNames().contains(name) == null) {
            return C17554o.m64195a();
        }
        return (Collection) this.properties.invoke(name);
    }

    @NotNull
    protected final Collection<DeclarationDescriptor> computeDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        C2668g.b(function1, "nameFilter");
        C2668g.b(lookupLocation, "location");
        ArrayList arrayList = new ArrayList(0);
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getSINGLETON_CLASSIFIERS_MASK())) {
            addEnumEntryDescriptors(arrayList, function1);
        }
        Collection collection = arrayList;
        addFunctionsAndProperties(collection, descriptorKindFilter, function1, lookupLocation);
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK()) != null) {
            for (Name name : getClassNames$deserialization()) {
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    CollectionsKt.addIfNotNull(collection, deserializeClass(name));
                }
            }
        }
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getTYPE_ALIASES_MASK()) != null) {
            for (Name name2 : getTypeAliasNames()) {
                if (((Boolean) function1.invoke(name2)).booleanValue()) {
                    CollectionsKt.addIfNotNull(collection, this.typeAliasByName.invoke(name2));
                }
            }
        }
        return CollectionsKt.compact(arrayList);
    }

    private final void addFunctionsAndProperties(Collection<DeclarationDescriptor> collection, DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1, LookupLocation lookupLocation) {
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
            Collection<Name> variableNames = getVariableNames();
            ArrayList arrayList = new ArrayList();
            for (Name name : variableNames) {
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    arrayList.addAll(getContributedVariables(name, lookupLocation));
                }
            }
            List list = arrayList;
            NameAndTypeMemberComparator nameAndTypeMemberComparator = NameAndTypeMemberComparator.INSTANCE;
            C2668g.a(nameAndTypeMemberComparator, "MemberComparator.NameAnd…MemberComparator.INSTANCE");
            C19287s.m68601a(list, nameAndTypeMemberComparator);
            collection.addAll(arrayList);
        }
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) != null) {
            Collection<Name> functionNames = getFunctionNames();
            ArrayList arrayList2 = new ArrayList();
            for (Name name2 : functionNames) {
                if (((Boolean) function1.invoke(name2)).booleanValue()) {
                    arrayList2.addAll(getContributedFunctions(name2, lookupLocation));
                }
            }
            List list2 = arrayList2;
            function1 = NameAndTypeMemberComparator.INSTANCE;
            C2668g.a(function1, "MemberComparator.NameAnd…MemberComparator.INSTANCE");
            C19287s.m68601a(list2, (Comparator) function1);
            collection.addAll(arrayList2);
        }
    }

    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        if (hasClass(name) != null) {
            return deserializeClass(name);
        }
        return getTypeAliasNames().contains(name) != null ? (ClassifierDescriptor) this.typeAliasByName.invoke(name) : null;
    }

    private final ClassDescriptor deserializeClass(Name name) {
        return this.f59341c.getComponents().deserializeClass(createClassId(name));
    }

    protected boolean hasClass(@NotNull Name name) {
        C2668g.b(name, "name");
        return getClassNames$deserialization().contains(name);
    }

    private final Map<Name, byte[]> packToByteArray(@NotNull Map<Name, ? extends Collection<? extends AbstractMessageLite>> map) {
        Map<Name, byte[]> linkedHashMap = new LinkedHashMap(ah.m66883a(map.size()));
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<AbstractMessageLite> iterable = (Iterable) entry.getValue();
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (AbstractMessageLite writeDelimitedTo : iterable) {
                writeDelimitedTo.writeDelimitedTo(byteArrayOutputStream);
                arrayList.add(C15813i.f49016a);
            }
            List list = (List) arrayList;
            linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap;
    }
}
