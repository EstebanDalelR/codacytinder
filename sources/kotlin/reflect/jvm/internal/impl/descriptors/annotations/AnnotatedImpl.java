package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import org.jetbrains.annotations.NotNull;

public abstract class AnnotatedImpl implements Annotated {
    private final Annotations annotations;

    public AnnotatedImpl(@NotNull Annotations annotations) {
        this.annotations = annotations;
    }

    @NotNull
    public Annotations getAnnotations() {
        return this.annotations;
    }
}
