package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class CompositeAnnotations$findAnnotation$1 extends Lambda implements Function1<Annotations, AnnotationDescriptor> {
    final /* synthetic */ FqName $fqName;

    CompositeAnnotations$findAnnotation$1(FqName fqName) {
        this.$fqName = fqName;
        super(1);
    }

    @Nullable
    public final AnnotationDescriptor invoke(@NotNull Annotations annotations) {
        C2668g.b(annotations, "it");
        return annotations.findAnnotation(this.$fqName);
    }
}
