package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public final class AnnotationValue extends ConstantValue<AnnotationDescriptor> {
    public AnnotationValue(@NotNull AnnotationDescriptor annotationDescriptor) {
        C2668g.b(annotationDescriptor, "value");
        super(annotationDescriptor);
    }

    @NotNull
    public KotlinType getType(@NotNull ModuleDescriptor moduleDescriptor) {
        C2668g.b(moduleDescriptor, "module");
        return ((AnnotationDescriptor) getValue()).getType();
    }
}
