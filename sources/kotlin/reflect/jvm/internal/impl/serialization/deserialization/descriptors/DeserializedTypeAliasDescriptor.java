package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializedTypeAliasDescriptor extends AbstractTypeAliasDescriptor implements DeserializedMemberDescriptor {
    @NotNull
    private Collection<? extends TypeAliasConstructorDescriptor> constructors;
    @Nullable
    private final DeserializedContainerSource containerSource;
    private SimpleType defaultTypeImpl;
    @NotNull
    private SimpleType expandedType;
    @NotNull
    private final NameResolver nameResolver;
    @NotNull
    private final TypeAlias proto;
    @NotNull
    private final StorageManager storageManager;
    private List<? extends TypeParameterDescriptor> typeConstructorParameters;
    @NotNull
    private final TypeTable typeTable;
    @NotNull
    private SimpleType underlyingType;
    @NotNull
    private final VersionRequirementTable versionRequirementTable;

    @NotNull
    protected StorageManager getStorageManager() {
        return this.storageManager;
    }

    @NotNull
    public TypeAlias getProto() {
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

    public DeserializedTypeAliasDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull Visibility visibility, @NotNull TypeAlias typeAlias, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource) {
        StorageManager storageManager2 = storageManager;
        TypeAlias typeAlias2 = typeAlias;
        NameResolver nameResolver2 = nameResolver;
        TypeTable typeTable2 = typeTable;
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        C2668g.b(storageManager2, "storageManager");
        DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
        C2668g.b(declarationDescriptor2, "containingDeclaration");
        Annotations annotations2 = annotations;
        C2668g.b(annotations2, "annotations");
        Name name2 = name;
        C2668g.b(name2, "name");
        Visibility visibility2 = visibility;
        C2668g.b(visibility2, "visibility");
        C2668g.b(typeAlias2, "proto");
        C2668g.b(nameResolver2, "nameResolver");
        C2668g.b(typeTable2, "typeTable");
        C2668g.b(versionRequirementTable2, "versionRequirementTable");
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        C2668g.a(sourceElement, "SourceElement.NO_SOURCE");
        super(declarationDescriptor2, annotations2, name2, sourceElement, visibility2);
        this.storageManager = storageManager2;
        this.proto = typeAlias2;
        this.nameResolver = nameResolver2;
        this.typeTable = typeTable2;
        this.versionRequirementTable = versionRequirementTable2;
        this.containerSource = deserializedContainerSource;
    }

    private void setConstructors(Collection<? extends TypeAliasConstructorDescriptor> collection) {
        this.constructors = collection;
    }

    private void setUnderlyingType(SimpleType simpleType) {
        this.underlyingType = simpleType;
    }

    @NotNull
    public SimpleType getUnderlyingType() {
        SimpleType simpleType = this.underlyingType;
        if (simpleType == null) {
            C2668g.b("underlyingType");
        }
        return simpleType;
    }

    private void setExpandedType(SimpleType simpleType) {
        this.expandedType = simpleType;
    }

    @NotNull
    public SimpleType getExpandedType() {
        SimpleType simpleType = this.expandedType;
        if (simpleType == null) {
            C2668g.b("expandedType");
        }
        return simpleType;
    }

    public final void initialize(@NotNull List<? extends TypeParameterDescriptor> list, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        C2668g.b(list, "declaredTypeParameters");
        C2668g.b(simpleType, "underlyingType");
        C2668g.b(simpleType2, "expandedType");
        initialize(list);
        setUnderlyingType(simpleType);
        setExpandedType(simpleType2);
        this.typeConstructorParameters = TypeParameterUtilsKt.computeConstructorTypeParameters(this);
        this.defaultTypeImpl = computeDefaultType();
        setConstructors(getTypeAliasConstructors());
    }

    @Nullable
    public ClassDescriptor getClassDescriptor() {
        if (KotlinTypeKt.isError(getExpandedType())) {
            return null;
        }
        ClassifierDescriptor declarationDescriptor = getExpandedType().getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof ClassDescriptor)) {
            declarationDescriptor = null;
        }
        return (ClassDescriptor) declarationDescriptor;
    }

    @NotNull
    public SimpleType getDefaultType() {
        SimpleType simpleType = this.defaultTypeImpl;
        if (simpleType == null) {
            C2668g.b("defaultTypeImpl");
        }
        return simpleType;
    }

    @NotNull
    public TypeAliasDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
        C2668g.b(typeSubstitutor, "substitutor");
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        StorageManager storageManager = getStorageManager();
        DeclarationDescriptor containingDeclaration = getContainingDeclaration();
        C2668g.a(containingDeclaration, "containingDeclaration");
        Annotations annotations = getAnnotations();
        C2668g.a(annotations, "annotations");
        Name name = getName();
        C2668g.a(name, "name");
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(storageManager, containingDeclaration, annotations, name, getVisibility(), getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource());
        List declaredTypeParameters = getDeclaredTypeParameters();
        KotlinType safeSubstitute = typeSubstitutor.safeSubstitute(getUnderlyingType(), Variance.INVARIANT);
        C2668g.a(safeSubstitute, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        SimpleType asSimpleType = TypeSubstitutionKt.asSimpleType(safeSubstitute);
        typeSubstitutor = typeSubstitutor.safeSubstitute(getExpandedType(), Variance.INVARIANT);
        C2668g.a(typeSubstitutor, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        deserializedTypeAliasDescriptor.initialize(declaredTypeParameters, asSimpleType, TypeSubstitutionKt.asSimpleType(typeSubstitutor));
        return deserializedTypeAliasDescriptor;
    }

    @NotNull
    protected List<TypeParameterDescriptor> getTypeConstructorTypeParameters() {
        List<TypeParameterDescriptor> list = this.typeConstructorParameters;
        if (list == null) {
            C2668g.b("typeConstructorParameters");
        }
        return list;
    }
}
