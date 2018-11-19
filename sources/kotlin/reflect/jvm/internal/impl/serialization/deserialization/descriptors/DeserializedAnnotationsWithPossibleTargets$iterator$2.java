package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationWithTarget;
import org.jetbrains.annotations.NotNull;

final class DeserializedAnnotationsWithPossibleTargets$iterator$2 extends Lambda implements Function1<AnnotationWithTarget, AnnotationDescriptor> {
    public static final DeserializedAnnotationsWithPossibleTargets$iterator$2 INSTANCE = new DeserializedAnnotationsWithPossibleTargets$iterator$2();

    DeserializedAnnotationsWithPossibleTargets$iterator$2() {
        super(1);
    }

    @NotNull
    public final AnnotationDescriptor invoke(@NotNull AnnotationWithTarget annotationWithTarget) {
        C2668g.b(annotationWithTarget, "it");
        return annotationWithTarget.getAnnotation();
    }
}
