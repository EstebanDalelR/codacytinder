package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializedSimpleFunctionDescriptor extends SimpleFunctionDescriptorImpl implements DeserializedCallableMemberDescriptor {
    @Nullable
    private final DeserializedContainerSource containerSource;
    @NotNull
    private final NameResolver nameResolver;
    @NotNull
    private final Function proto;
    @NotNull
    private final TypeTable typeTable;
    @NotNull
    private final VersionRequirementTable versionRequirementTable;

    @NotNull
    public Function getProto() {
        return this.proto;
    }

    @NotNull
    public NameResolver getNameResolver() {
        return this.nameResolver;
    }

    @NotNull
    public TypeTable getTypeTable() {
        return this.typeTable;
    }

    @NotNull
    public VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable;
    }

    @Nullable
    public DeserializedContainerSource getContainerSource() {
        return this.containerSource;
    }

    public /* synthetic */ DeserializedSimpleFunctionDescriptor(DeclarationDescriptor declarationDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor, Annotations annotations, Name name, Kind kind, Function function, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource, SourceElement sourceElement, int i, C15823e c15823e) {
        this(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, function, nameResolver, typeTable, versionRequirementTable, deserializedContainerSource, (i & 1024) != 0 ? (SourceElement) null : sourceElement);
    }

    public DeserializedSimpleFunctionDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable SimpleFunctionDescriptor simpleFunctionDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull Kind kind, @NotNull Function function, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource, @Nullable SourceElement sourceElement) {
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImpl = this;
        Function function2 = function;
        NameResolver nameResolver2 = nameResolver;
        TypeTable typeTable2 = typeTable;
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
        C2668g.b(declarationDescriptor2, "containingDeclaration");
        Annotations annotations2 = annotations;
        C2668g.b(annotations2, "annotations");
        Name name2 = name;
        C2668g.b(name2, "name");
        Kind kind2 = kind;
        C2668g.b(kind2, "kind");
        C2668g.b(function2, "proto");
        C2668g.b(nameResolver2, "nameResolver");
        C2668g.b(typeTable2, "typeTable");
        C2668g.b(versionRequirementTable2, "versionRequirementTable");
        super(declarationDescriptor2, simpleFunctionDescriptor, annotations2, name2, kind2, sourceElement != null ? sourceElement : SourceElement.NO_SOURCE);
        simpleFunctionDescriptorImpl.proto = function2;
        simpleFunctionDescriptorImpl.nameResolver = nameResolver2;
        simpleFunctionDescriptorImpl.typeTable = typeTable2;
        simpleFunctionDescriptorImpl.versionRequirementTable = versionRequirementTable2;
        simpleFunctionDescriptorImpl.containerSource = deserializedContainerSource;
    }

    @NotNull
    protected FunctionDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        Name name2;
        DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
        C2668g.b(declarationDescriptor2, "newOwner");
        Kind kind2 = kind;
        C2668g.b(kind2, "kind");
        Annotations annotations2 = annotations;
        C2668g.b(annotations2, "annotations");
        SourceElement sourceElement2 = sourceElement;
        C2668g.b(sourceElement2, "source");
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name != null) {
            name2 = name;
        } else {
            Name name3 = getName();
            C2668g.a(name3, "name");
            name2 = name3;
        }
        return new DeserializedSimpleFunctionDescriptor(declarationDescriptor2, simpleFunctionDescriptor, annotations2, name2, kind2, getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource(), sourceElement2);
    }
}
