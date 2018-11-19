package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C15807n;
import kotlin.collections.C18457p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {
    @NotNull
    private final DeserializedAnnotations annotations = new DeserializedAnnotations(this.f60038c.getStorageManager(), (Function0) new DeserializedTypeParameterDescriptor$annotations$1(this));
    /* renamed from: c */
    private final DeserializationContext f60038c;
    private final TypeParameter proto;

    public DeserializedTypeParameterDescriptor(@NotNull DeserializationContext deserializationContext, @NotNull TypeParameter typeParameter, int i) {
        C2668g.b(deserializationContext, "c");
        C2668g.b(typeParameter, "proto");
        StorageManager storageManager = deserializationContext.getStorageManager();
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        Name name = NameResolverUtilKt.getName(deserializationContext.getNameResolver(), typeParameter.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        Variance variance = typeParameter.getVariance();
        C2668g.a(variance, "proto.variance");
        super(storageManager, containingDeclaration, name, protoEnumFlags.variance(variance), typeParameter.getReified(), i, SourceElement.NO_SOURCE, EMPTY.INSTANCE);
        this.f60038c = deserializationContext;
        this.proto = typeParameter;
    }

    @NotNull
    public DeserializedAnnotations getAnnotations() {
        return this.annotations;
    }

    @NotNull
    protected List<KotlinType> resolveUpperBounds() {
        List upperBounds = ProtoTypeTableUtilKt.upperBounds(this.proto, this.f60038c.getTypeTable());
        if (upperBounds.isEmpty()) {
            return C15807n.m59826a(DescriptorUtilsKt.getBuiltIns(this).getDefaultBound());
        }
        Iterable<Type> iterable = upperBounds;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Type type : iterable) {
            arrayList.add(this.f60038c.getTypeDeserializer().type(type, Annotations.Companion.getEMPTY()));
        }
        return (List) arrayList;
    }

    @NotNull
    protected Void reportSupertypeLoopError(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "type");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("There should be no cycles for deserialized type parameters, but found for: ");
        stringBuilder.append(this);
        throw ((Throwable) new IllegalStateException(stringBuilder.toString()));
    }
}
