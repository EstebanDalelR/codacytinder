package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import org.jetbrains.annotations.NotNull;

final class DeserializedClassDescriptor$annotations$1 extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {
    final /* synthetic */ DeserializedClassDescriptor this$0;

    DeserializedClassDescriptor$annotations$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.this$0 = deserializedClassDescriptor;
        super(0);
    }

    @NotNull
    public final List<AnnotationDescriptor> invoke() {
        return C19299w.m68840l(this.this$0.getC().getComponents().getAnnotationAndConstantLoader().loadClassAnnotations(this.this$0.getThisAsProtoContainer$deserialization()));
    }
}
