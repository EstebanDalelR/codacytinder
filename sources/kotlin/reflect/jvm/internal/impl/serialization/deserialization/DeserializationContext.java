package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializationContext {
    @NotNull
    private final DeserializationComponents components;
    @Nullable
    private final DeserializedContainerSource containerSource;
    @NotNull
    private final DeclarationDescriptor containingDeclaration;
    @NotNull
    private final MemberDeserializer memberDeserializer = new MemberDeserializer(this);
    @NotNull
    private final NameResolver nameResolver;
    @NotNull
    private final TypeDeserializer typeDeserializer;
    @NotNull
    private final TypeTable typeTable;
    @NotNull
    private final VersionRequirementTable versionRequirementTable;

    public DeserializationContext(@NotNull DeserializationComponents deserializationComponents, @NotNull NameResolver nameResolver, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource, @Nullable TypeDeserializer typeDeserializer, @NotNull List<TypeParameter> list) {
        C2668g.b(deserializationComponents, "components");
        C2668g.b(nameResolver, "nameResolver");
        C2668g.b(declarationDescriptor, "containingDeclaration");
        C2668g.b(typeTable, "typeTable");
        C2668g.b(versionRequirementTable, "versionRequirementTable");
        C2668g.b(list, "typeParameters");
        this.components = deserializationComponents;
        this.nameResolver = nameResolver;
        this.containingDeclaration = declarationDescriptor;
        this.typeTable = typeTable;
        this.versionRequirementTable = versionRequirementTable;
        this.containerSource = deserializedContainerSource;
        nameResolver = new StringBuilder();
        nameResolver.append("Deserializer for ");
        nameResolver.append(this.containingDeclaration.getName());
        this.typeDeserializer = new TypeDeserializer(this, typeDeserializer, list, nameResolver.toString());
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        return this.components;
    }

    @NotNull
    public final NameResolver getNameResolver() {
        return this.nameResolver;
    }

    @NotNull
    public final DeclarationDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    @NotNull
    public final TypeTable getTypeTable() {
        return this.typeTable;
    }

    @NotNull
    public final VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable;
    }

    @Nullable
    public final DeserializedContainerSource getContainerSource() {
        return this.containerSource;
    }

    @NotNull
    public final TypeDeserializer getTypeDeserializer() {
        return this.typeDeserializer;
    }

    @NotNull
    public final MemberDeserializer getMemberDeserializer() {
        return this.memberDeserializer;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.components.getStorageManager();
    }

    @NotNull
    public static /* synthetic */ DeserializationContext childContext$default(DeserializationContext deserializationContext, DeclarationDescriptor declarationDescriptor, List list, NameResolver nameResolver, TypeTable typeTable, int i, Object obj) {
        if ((i & 4) != null) {
            nameResolver = deserializationContext.nameResolver;
        }
        if ((i & 8) != 0) {
            typeTable = deserializationContext.typeTable;
        }
        return deserializationContext.childContext(declarationDescriptor, list, nameResolver, typeTable);
    }

    @NotNull
    public final DeserializationContext childContext(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull List<TypeParameter> list, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
        C2668g.b(declarationDescriptor, "descriptor");
        C2668g.b(list, "typeParameterProtos");
        C2668g.b(nameResolver, "nameResolver");
        C2668g.b(typeTable, "typeTable");
        return new DeserializationContext(this.components, nameResolver, declarationDescriptor, typeTable, this.versionRequirementTable, this.containerSource, this.typeDeserializer, list);
    }
}
