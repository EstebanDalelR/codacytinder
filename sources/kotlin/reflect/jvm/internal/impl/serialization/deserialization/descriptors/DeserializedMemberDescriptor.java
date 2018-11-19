package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface DeserializedMemberDescriptor extends MemberDescriptor {
    @Nullable
    DeserializedContainerSource getContainerSource();

    @NotNull
    NameResolver getNameResolver();

    @NotNull
    MessageLite getProto();

    @NotNull
    TypeTable getTypeTable();
}
