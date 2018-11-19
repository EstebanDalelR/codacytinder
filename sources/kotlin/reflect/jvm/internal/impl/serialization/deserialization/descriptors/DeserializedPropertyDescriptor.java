package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializedPropertyDescriptor extends PropertyDescriptorImpl implements DeserializedCallableMemberDescriptor {
    @Nullable
    private final DeserializedContainerSource containerSource;
    @NotNull
    private final NameResolver nameResolver;
    @NotNull
    private final Property proto;
    @NotNull
    private final TypeTable typeTable;
    @NotNull
    private final VersionRequirementTable versionRequirementTable;

    /* renamed from: isExternal */
    public /* synthetic */ boolean m71771isExternal() {
        return isExternal().booleanValue();
    }

    @NotNull
    public Property getProto() {
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

    public DeserializedPropertyDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull Visibility visibility, boolean z, @NotNull Name name, @NotNull Kind kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull Property property, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource) {
        Property property2 = property;
        NameResolver nameResolver2 = nameResolver;
        TypeTable typeTable2 = typeTable;
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
        C2668g.b(declarationDescriptor2, "containingDeclaration");
        Annotations annotations2 = annotations;
        C2668g.b(annotations2, "annotations");
        Modality modality2 = modality;
        C2668g.b(modality2, "modality");
        Visibility visibility2 = visibility;
        C2668g.b(visibility2, "visibility");
        Name name2 = name;
        C2668g.b(name2, "name");
        Kind kind2 = kind;
        C2668g.b(kind2, "kind");
        C2668g.b(property2, "proto");
        C2668g.b(nameResolver2, "nameResolver");
        C2668g.b(typeTable2, "typeTable");
        C2668g.b(versionRequirementTable2, "versionRequirementTable");
        super(declarationDescriptor2, propertyDescriptor, annotations2, modality2, visibility2, z, name2, kind2, SourceElement.NO_SOURCE, z2, z3, z6, false, z4, z5);
        this.proto = property;
        this.nameResolver = nameResolver;
        this.typeTable = typeTable;
        this.versionRequirementTable = versionRequirementTable;
        this.containerSource = deserializedContainerSource;
    }

    @NotNull
    protected PropertyDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull Visibility visibility, @Nullable PropertyDescriptor propertyDescriptor, @NotNull Kind kind, @NotNull Name name) {
        DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
        C2668g.b(declarationDescriptor2, "newOwner");
        Modality modality2 = modality;
        C2668g.b(modality2, "newModality");
        Visibility visibility2 = visibility;
        C2668g.b(visibility2, "newVisibility");
        Kind kind2 = kind;
        C2668g.b(kind2, "kind");
        Name name2 = name;
        C2668g.b(name2, "newName");
        Annotations annotations = getAnnotations();
        boolean isVar = isVar();
        boolean isLateInit = isLateInit();
        boolean isConst = isConst();
        Boolean isExternal = isExternal();
        C2668g.a(isExternal, "isExternal");
        return new DeserializedPropertyDescriptor(declarationDescriptor2, propertyDescriptor, annotations, modality2, visibility2, isVar, name2, kind2, isLateInit, isConst, isExternal.booleanValue(), isDelegated(), isExpect(), getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource());
    }

    @NotNull
    public Boolean isExternal() {
        return Flags.IS_EXTERNAL_PROPERTY.get(getProto().getFlags());
    }
}
