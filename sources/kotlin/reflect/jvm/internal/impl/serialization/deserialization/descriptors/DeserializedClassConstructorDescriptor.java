package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializedClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements DeserializedCallableMemberDescriptor {
    @Nullable
    private final DeserializedContainerSource containerSource;
    @NotNull
    private final NameResolver nameResolver;
    @NotNull
    private final Constructor proto;
    @NotNull
    private final TypeTable typeTable;
    @NotNull
    private final VersionRequirementTable versionRequirementTable;

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    public boolean isTailrec() {
        return false;
    }

    @NotNull
    public Constructor getProto() {
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

    public /* synthetic */ DeserializedClassConstructorDescriptor(ClassDescriptor classDescriptor, ConstructorDescriptor constructorDescriptor, Annotations annotations, boolean z, Kind kind, Constructor constructor, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource, SourceElement sourceElement, int i, C15823e c15823e) {
        this(classDescriptor, constructorDescriptor, annotations, z, kind, constructor, nameResolver, typeTable, versionRequirementTable, deserializedContainerSource, (i & 1024) != 0 ? (SourceElement) null : sourceElement);
    }

    public DeserializedClassConstructorDescriptor(@NotNull ClassDescriptor classDescriptor, @Nullable ConstructorDescriptor constructorDescriptor, @NotNull Annotations annotations, boolean z, @NotNull Kind kind, @NotNull Constructor constructor, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource, @Nullable SourceElement sourceElement) {
        ClassConstructorDescriptorImpl classConstructorDescriptorImpl = this;
        Constructor constructor2 = constructor;
        NameResolver nameResolver2 = nameResolver;
        TypeTable typeTable2 = typeTable;
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        ClassDescriptor classDescriptor2 = classDescriptor;
        C2668g.b(classDescriptor2, "containingDeclaration");
        Annotations annotations2 = annotations;
        C2668g.b(annotations2, "annotations");
        Kind kind2 = kind;
        C2668g.b(kind2, "kind");
        C2668g.b(constructor2, "proto");
        C2668g.b(nameResolver2, "nameResolver");
        C2668g.b(typeTable2, "typeTable");
        C2668g.b(versionRequirementTable2, "versionRequirementTable");
        super(classDescriptor2, constructorDescriptor, annotations2, z, kind2, sourceElement != null ? sourceElement : SourceElement.NO_SOURCE);
        classConstructorDescriptorImpl.proto = constructor2;
        classConstructorDescriptorImpl.nameResolver = nameResolver2;
        classConstructorDescriptorImpl.typeTable = typeTable2;
        classConstructorDescriptorImpl.versionRequirementTable = versionRequirementTable2;
        classConstructorDescriptorImpl.containerSource = deserializedContainerSource;
    }

    @NotNull
    protected DeserializedClassConstructorDescriptor createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
        C2668g.b(declarationDescriptor2, "newOwner");
        Kind kind2 = kind;
        C2668g.b(kind2, "kind");
        Annotations annotations2 = annotations;
        C2668g.b(annotations2, "annotations");
        SourceElement sourceElement2 = sourceElement;
        C2668g.b(sourceElement2, "source");
        return new DeserializedClassConstructorDescriptor((ClassDescriptor) declarationDescriptor2, (ConstructorDescriptor) functionDescriptor, annotations2, this.isPrimary, kind2, getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource(), sourceElement2);
    }
}
