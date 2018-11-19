package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C19291t;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.VersionRequirementTable.Companion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DeserializedPackageMemberScope extends DeserializedMemberScope {
    private final PackageFragmentDescriptor packageDescriptor;
    private final FqName packageFqName = this.packageDescriptor.getFqName();

    protected void addEnumEntryDescriptors(@NotNull Collection<DeclarationDescriptor> collection, @NotNull Function1<? super Name, Boolean> function1) {
        C2668g.b(collection, "result");
        C2668g.b(function1, "nameFilter");
    }

    public DeserializedPackageMemberScope(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull Package packageR, @NotNull NameResolver nameResolver, @Nullable DeserializedContainerSource deserializedContainerSource, @NotNull DeserializationComponents deserializationComponents, @NotNull Function0<? extends Collection<Name>> function0) {
        PackageFragmentDescriptor packageFragmentDescriptor2 = packageFragmentDescriptor;
        C2668g.b(packageFragmentDescriptor2, "packageDescriptor");
        Package packageR2 = packageR;
        C2668g.b(packageR2, "proto");
        NameResolver nameResolver2 = nameResolver;
        C2668g.b(nameResolver2, "nameResolver");
        DeserializationComponents deserializationComponents2 = deserializationComponents;
        C2668g.b(deserializationComponents2, "components");
        Function0<? extends Collection<Name>> function02 = function0;
        C2668g.b(function02, "classNames");
        TypeTable typeTable = packageR2.getTypeTable();
        C2668g.a(typeTable, "proto.typeTable");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable2 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable);
        Companion companion = VersionRequirementTable.Companion;
        VersionRequirementTable versionRequirementTable = packageR2.getVersionRequirementTable();
        C2668g.a(versionRequirementTable, "proto.versionRequirementTable");
        DeserializationContext createContext = deserializationComponents2.createContext(packageFragmentDescriptor2, nameResolver2, typeTable2, companion.create(versionRequirementTable), deserializedContainerSource);
        List functionList = packageR2.getFunctionList();
        C2668g.a(functionList, "proto.functionList");
        Collection collection = functionList;
        functionList = packageR2.getPropertyList();
        C2668g.a(functionList, "proto.propertyList");
        Collection collection2 = functionList;
        functionList = packageR2.getTypeAliasList();
        C2668g.a(functionList, "proto.typeAliasList");
        super(createContext, collection, collection2, functionList, function02);
        this.packageDescriptor = packageFragmentDescriptor2;
    }

    @NotNull
    public List<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        C2668g.b(function1, "nameFilter");
        descriptorKindFilter = computeDescriptors(descriptorKindFilter, function1, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Collection arrayList = new ArrayList();
        function1 = getC().getComponents().getFictitiousClassDescriptorFactories().iterator();
        while (function1.hasNext()) {
            C19291t.m68635a(arrayList, (Iterable) ((ClassDescriptorFactory) function1.next()).getAllContributedClassesIfPossible(this.packageFqName));
        }
        return C19299w.m68809b((Collection) descriptorKindFilter, (Iterable) (List) arrayList);
    }

    protected boolean hasClass(@NotNull Name name) {
        C2668g.b(name, "name");
        if (super.hasClass(name)) {
            return true;
        }
        Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories = getC().getComponents().getFictitiousClassDescriptorFactories();
        if (!((fictitiousClassDescriptorFactories instanceof Collection) && ((Collection) fictitiousClassDescriptorFactories).isEmpty())) {
            for (ClassDescriptorFactory shouldCreateClass : fictitiousClassDescriptorFactories) {
                if (shouldCreateClass.shouldCreateClass(this.packageFqName, name)) {
                    name = true;
                    break;
                }
            }
        }
        name = null;
        if (name != null) {
            return true;
        }
        return false;
    }

    @NotNull
    protected ClassId createClassId(@NotNull Name name) {
        C2668g.b(name, "name");
        return new ClassId(this.packageFqName, name);
    }

    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        recordLookup(name, lookupLocation);
        return super.getContributedClassifier(name, lookupLocation);
    }

    public void recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, this.packageDescriptor, name);
    }

    @NotNull
    protected Set<Name> getNonDeclaredFunctionNames() {
        return am.m64176a();
    }

    @NotNull
    protected Set<Name> getNonDeclaredVariableNames() {
        return am.m64176a();
    }
}
