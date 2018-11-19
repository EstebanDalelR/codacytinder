package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationWithTarget;
import org.jetbrains.annotations.NotNull;

final class DeserializedAnnotationsWithPossibleTargets$iterator$1 extends Lambda implements Function1<AnnotationWithTarget, Boolean> {
    public static final DeserializedAnnotationsWithPossibleTargets$iterator$1 INSTANCE = new DeserializedAnnotationsWithPossibleTargets$iterator$1();

    DeserializedAnnotationsWithPossibleTargets$iterator$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((AnnotationWithTarget) obj));
    }

    public final boolean invoke(@NotNull AnnotationWithTarget annotationWithTarget) {
        C2668g.b(annotationWithTarget, "it");
        return annotationWithTarget.getTarget() == null ? true : null;
    }
}
