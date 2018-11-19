package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Annotations extends Iterable<AnnotationDescriptor>, KMappedMarker {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static final Annotations EMPTY = new Annotations$Companion$EMPTY$1();

        private Companion() {
        }

        @NotNull
        public final Annotations getEMPTY() {
            return EMPTY;
        }

        @Nullable
        public final AnnotationDescriptor findUseSiteTargetedAnnotation(@NotNull Annotations annotations, @NotNull AnnotationUseSiteTarget annotationUseSiteTarget, @NotNull FqName fqName) {
            C2668g.b(annotations, "annotations");
            C2668g.b(annotationUseSiteTarget, "target");
            C2668g.b(fqName, "fqName");
            for (AnnotationUseSiteTarget annotationUseSiteTarget2 : getUseSiteTargetedAnnotations(annotations, annotationUseSiteTarget2)) {
                if (C2668g.a(((AnnotationDescriptor) annotationUseSiteTarget2).getFqName(), fqName)) {
                    break;
                }
            }
            annotationUseSiteTarget2 = null;
            return (AnnotationDescriptor) annotationUseSiteTarget2;
        }

        private final List<AnnotationDescriptor> getUseSiteTargetedAnnotations(Annotations annotations, AnnotationUseSiteTarget annotationUseSiteTarget) {
            Collection arrayList = new ArrayList();
            for (AnnotationWithTarget annotationWithTarget : annotations.getUseSiteTargetedAnnotations()) {
                Object component1 = annotationWithTarget.component1();
                if ((annotationUseSiteTarget == annotationWithTarget.component2() ? 1 : null) == null) {
                    component1 = null;
                }
                if (component1 != null) {
                    arrayList.add(component1);
                }
            }
            return (List) arrayList;
        }
    }

    public static final class DefaultImpls {
        @Nullable
        public static AnnotationDescriptor findAnnotation(Annotations annotations, @NotNull FqName fqName) {
            C2668g.b(fqName, "fqName");
            for (Object next : annotations) {
                if (C2668g.a(((AnnotationDescriptor) next).getFqName(), fqName)) {
                    break;
                }
            }
            Object next2 = null;
            return (AnnotationDescriptor) next2;
        }

        public static boolean hasAnnotation(Annotations annotations, @NotNull FqName fqName) {
            C2668g.b(fqName, "fqName");
            return annotations.findAnnotation(fqName) != null ? true : null;
        }
    }

    @Nullable
    AnnotationDescriptor findAnnotation(@NotNull FqName fqName);

    @NotNull
    List<AnnotationWithTarget> getAllAnnotations();

    @NotNull
    List<AnnotationWithTarget> getUseSiteTargetedAnnotations();

    boolean hasAnnotation(@NotNull FqName fqName);

    boolean isEmpty();
}
