package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationWithTarget;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.jetbrains.annotations.NotNull;

final class MemberDeserializer$getAnnotations$1 extends Lambda implements Function0<List<? extends AnnotationWithTarget>> {
    final /* synthetic */ AnnotatedCallableKind $kind;
    final /* synthetic */ MessageLite $proto;
    final /* synthetic */ MemberDeserializer this$0;

    MemberDeserializer$getAnnotations$1(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        this.this$0 = memberDeserializer;
        this.$proto = messageLite;
        this.$kind = annotatedCallableKind;
        super(0);
    }

    @NotNull
    public final List<AnnotationWithTarget> invoke() {
        ProtoContainer access$asProtoContainer = this.this$0.asProtoContainer(this.this$0.f49042c.getContainingDeclaration());
        List<AnnotationWithTarget> l = access$asProtoContainer != null ? C19299w.m68840l(this.this$0.f49042c.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(access$asProtoContainer, this.$proto, this.$kind)) : null;
        return l != null ? l : C17554o.m64195a();
    }
}
