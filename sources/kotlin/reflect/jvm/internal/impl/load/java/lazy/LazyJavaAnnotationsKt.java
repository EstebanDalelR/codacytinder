package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import org.jetbrains.annotations.NotNull;

public final class LazyJavaAnnotationsKt {
    @NotNull
    public static final Annotations resolveAnnotations(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaAnnotationOwner javaAnnotationOwner) {
        C2668g.b(lazyJavaResolverContext, "$receiver");
        C2668g.b(javaAnnotationOwner, "annotationsOwner");
        return new LazyJavaAnnotations(lazyJavaResolverContext, javaAnnotationOwner);
    }
}
