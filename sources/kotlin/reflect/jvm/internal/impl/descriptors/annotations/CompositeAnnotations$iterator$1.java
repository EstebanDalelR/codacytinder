package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

final class CompositeAnnotations$iterator$1 extends Lambda implements Function1<Annotations, Sequence<? extends AnnotationDescriptor>> {
    public static final CompositeAnnotations$iterator$1 INSTANCE = new CompositeAnnotations$iterator$1();

    CompositeAnnotations$iterator$1() {
        super(1);
    }

    @NotNull
    public final Sequence<AnnotationDescriptor> invoke(@NotNull Annotations annotations) {
        C2668g.b(annotations, "it");
        return C19299w.m68846r(annotations);
    }
}
