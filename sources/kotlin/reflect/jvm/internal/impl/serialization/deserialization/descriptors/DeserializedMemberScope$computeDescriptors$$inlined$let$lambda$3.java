package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;

public final class DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$3 extends Lambda implements Function0<M> {
    final /* synthetic */ ByteArrayInputStream $inputStream;
    final /* synthetic */ Parser $parser$inlined;
    final /* synthetic */ DeserializedMemberScope this$0;

    public DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$3(ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope, Parser parser) {
        this.$inputStream = byteArrayInputStream;
        this.this$0 = deserializedMemberScope;
        this.$parser$inlined = parser;
        super(0);
    }

    public final M invoke() {
        return (MessageLite) this.$parser$inlined.parseDelimitedFrom(this.$inputStream, this.this$0.getC().getComponents().getExtensionRegistryLite());
    }
}
