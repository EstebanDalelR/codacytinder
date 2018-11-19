package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

final class AnnotatedSimpleType extends DelegatingSimpleTypeImpl {
    @NotNull
    private final Annotations annotations;

    @NotNull
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public AnnotatedSimpleType(@NotNull SimpleType simpleType, @NotNull Annotations annotations) {
        C2668g.b(simpleType, "delegate");
        C2668g.b(annotations, "annotations");
        super(simpleType);
        this.annotations = annotations;
    }
}
