package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

public abstract class DelegatingSimpleTypeImpl extends DelegatingSimpleType {
    @NotNull
    private final SimpleType delegate;

    public DelegatingSimpleTypeImpl(@NotNull SimpleType simpleType) {
        C2668g.b(simpleType, "delegate");
        this.delegate = simpleType;
    }

    @NotNull
    protected SimpleType getDelegate() {
        return this.delegate;
    }

    @NotNull
    public DelegatingSimpleTypeImpl replaceAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "newAnnotations");
        return annotations != getAnnotations() ? new AnnotatedSimpleType(this, annotations) : this;
    }

    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z) {
        if (z == isMarkedNullable()) {
            return this;
        }
        return getDelegate().makeNullableAsSpecified(z).replaceAnnotations(getAnnotations());
    }
}
