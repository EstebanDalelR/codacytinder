package kotlin.reflect.jvm.internal.impl.types;

import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationWithTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.text.C19286n;
import org.jetbrains.annotations.NotNull;

public abstract class SimpleType extends UnwrappedType {
    @NotNull
    public abstract SimpleType makeNullableAsSpecified(boolean z);

    @NotNull
    public abstract SimpleType replaceAnnotations(@NotNull Annotations annotations);

    public SimpleType() {
        super();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (AnnotationWithTarget annotationWithTarget : getAnnotations().getAllAnnotations()) {
            AnnotationDescriptor component1 = annotationWithTarget.component1();
            AnnotationUseSiteTarget component2 = annotationWithTarget.component2();
            C19286n.m68568a(stringBuilder, "[", DescriptorRenderer.DEBUG_TEXT.renderAnnotation(component1, component2), "] ");
        }
        stringBuilder.append(getConstructor());
        if (!getArguments().isEmpty()) {
            C19299w.m68794a(getArguments(), stringBuilder, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (isMarkedNullable()) {
            stringBuilder.append("?");
        }
        String stringBuilder2 = stringBuilder.toString();
        C2668g.a(stringBuilder2, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder2;
    }
}
