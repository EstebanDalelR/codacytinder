package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class AnnotationsKt {
    @NotNull
    public static final Annotations composeAnnotations(@NotNull Annotations annotations, @NotNull Annotations annotations2) {
        C2668g.b(annotations, "first");
        C2668g.b(annotations2, "second");
        if (annotations.isEmpty()) {
            return annotations2;
        }
        if (annotations2.isEmpty()) {
            return annotations;
        }
        return new CompositeAnnotations(annotations, annotations2);
    }
}
