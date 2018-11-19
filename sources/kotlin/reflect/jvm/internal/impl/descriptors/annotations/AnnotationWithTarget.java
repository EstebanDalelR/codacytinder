package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AnnotationWithTarget {
    @NotNull
    private final AnnotationDescriptor annotation;
    @Nullable
    private final AnnotationUseSiteTarget target;

    @NotNull
    public final AnnotationDescriptor component1() {
        return this.annotation;
    }

    @Nullable
    public final AnnotationUseSiteTarget component2() {
        return this.target;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnnotationWithTarget) {
                AnnotationWithTarget annotationWithTarget = (AnnotationWithTarget) obj;
                if (C2668g.a(this.annotation, annotationWithTarget.annotation) && C2668g.a(this.target, annotationWithTarget.target)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        AnnotationDescriptor annotationDescriptor = this.annotation;
        int i = 0;
        int hashCode = (annotationDescriptor != null ? annotationDescriptor.hashCode() : 0) * 31;
        AnnotationUseSiteTarget annotationUseSiteTarget = this.target;
        if (annotationUseSiteTarget != null) {
            i = annotationUseSiteTarget.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AnnotationWithTarget(annotation=");
        stringBuilder.append(this.annotation);
        stringBuilder.append(", target=");
        stringBuilder.append(this.target);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public AnnotationWithTarget(@NotNull AnnotationDescriptor annotationDescriptor, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget) {
        C2668g.b(annotationDescriptor, "annotation");
        this.annotation = annotationDescriptor;
        this.target = annotationUseSiteTarget;
    }

    @NotNull
    public final AnnotationDescriptor getAnnotation() {
        return this.annotation;
    }

    @Nullable
    public final AnnotationUseSiteTarget getTarget() {
        return this.target;
    }
}
