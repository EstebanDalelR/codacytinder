package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.Nullable;

final class MemberDeserializer$loadProperty$2 extends Lambda implements Function0<ConstantValue<?>> {
    final /* synthetic */ DeserializedPropertyDescriptor $property;
    final /* synthetic */ Property $proto;
    final /* synthetic */ MemberDeserializer this$0;

    MemberDeserializer$loadProperty$2(MemberDeserializer memberDeserializer, Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.this$0 = memberDeserializer;
        this.$proto = property;
        this.$property = deserializedPropertyDescriptor;
        super(0);
    }

    @Nullable
    public final ConstantValue<?> invoke() {
        ProtoContainer access$asProtoContainer = this.this$0.asProtoContainer(this.this$0.f49042c.getContainingDeclaration());
        if (access$asProtoContainer == null) {
            C2668g.a();
        }
        AnnotationAndConstantLoader annotationAndConstantLoader = this.this$0.f49042c.getComponents().getAnnotationAndConstantLoader();
        Property property = this.$proto;
        KotlinType returnType = this.$property.getReturnType();
        C2668g.a(returnType, "property.returnType");
        return (ConstantValue) annotationAndConstantLoader.loadPropertyConstant(access$asProtoContainer, property, returnType);
    }
}
