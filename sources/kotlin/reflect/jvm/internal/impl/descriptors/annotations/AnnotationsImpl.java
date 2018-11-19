package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AnnotationsImpl implements Annotations {
    public static final Companion Companion = new Companion();
    private final List<AnnotationDescriptor> annotations;
    private final List<AnnotationWithTarget> targetedAnnotations;

    public static final class Companion {
        private Companion() {
        }
    }

    @Nullable
    public AnnotationDescriptor findAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return DefaultImpls.findAnnotation(this, fqName);
    }

    public boolean hasAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return DefaultImpls.hasAnnotation(this, fqName);
    }

    public AnnotationsImpl(@NotNull List<? extends AnnotationDescriptor> list) {
        C2668g.b(list, "annotations");
        this.annotations = list;
        Iterable<AnnotationDescriptor> iterable = list;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (AnnotationDescriptor annotationWithTarget : iterable) {
            arrayList.add(new AnnotationWithTarget(annotationWithTarget, null));
        }
        this.targetedAnnotations = (List) arrayList;
    }

    public boolean isEmpty() {
        return this.targetedAnnotations.isEmpty();
    }

    @NotNull
    public List<AnnotationWithTarget> getUseSiteTargetedAnnotations() {
        Collection arrayList = new ArrayList();
        for (Object next : this.targetedAnnotations) {
            if ((((AnnotationWithTarget) next).getTarget() != null ? 1 : null) != null) {
                arrayList.add(next);
            }
        }
        Iterable<AnnotationWithTarget> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (AnnotationWithTarget annotationWithTarget : iterable) {
            AnnotationDescriptor annotation = annotationWithTarget.getAnnotation();
            AnnotationUseSiteTarget target = annotationWithTarget.getTarget();
            if (target == null) {
                C2668g.a();
            }
            arrayList2.add(new AnnotationWithTarget(annotation, target));
        }
        return (List) arrayList2;
    }

    @NotNull
    public List<AnnotationWithTarget> getAllAnnotations() {
        return this.targetedAnnotations;
    }

    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return this.annotations.iterator();
    }

    @NotNull
    public String toString() {
        return this.annotations.toString();
    }
}
