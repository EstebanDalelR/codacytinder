package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FilteredAnnotations implements Annotations {
    private final Annotations delegate;
    private final Function1<FqName, Boolean> fqNameFilter;

    public FilteredAnnotations(@NotNull Annotations annotations, @NotNull Function1<? super FqName, Boolean> function1) {
        C2668g.b(annotations, "delegate");
        C2668g.b(function1, "fqNameFilter");
        this.delegate = annotations;
        this.fqNameFilter = function1;
    }

    public boolean hasAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return ((Boolean) this.fqNameFilter.invoke(fqName)).booleanValue() ? this.delegate.hasAnnotation(fqName) : null;
    }

    @Nullable
    public AnnotationDescriptor findAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return ((Boolean) this.fqNameFilter.invoke(fqName)).booleanValue() ? this.delegate.findAnnotation(fqName) : null;
    }

    @NotNull
    public List<AnnotationWithTarget> getUseSiteTargetedAnnotations() {
        Collection arrayList = new ArrayList();
        for (Object next : this.delegate.getUseSiteTargetedAnnotations()) {
            if (shouldBeReturned(((AnnotationWithTarget) next).getAnnotation())) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    @NotNull
    public List<AnnotationWithTarget> getAllAnnotations() {
        Collection arrayList = new ArrayList();
        for (Object next : this.delegate.getAllAnnotations()) {
            if (shouldBeReturned(((AnnotationWithTarget) next).getAnnotation())) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        Collection arrayList = new ArrayList();
        for (Object next : this.delegate) {
            if (shouldBeReturned((AnnotationDescriptor) next)) {
                arrayList.add(next);
            }
        }
        return ((List) arrayList).iterator();
    }

    public boolean isEmpty() {
        Iterable<AnnotationDescriptor> iterable = this.delegate;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (AnnotationDescriptor shouldBeReturned : iterable) {
            if (shouldBeReturned(shouldBeReturned)) {
                return true;
            }
        }
        return false;
    }

    private final boolean shouldBeReturned(AnnotationDescriptor annotationDescriptor) {
        annotationDescriptor = annotationDescriptor.getFqName();
        return (annotationDescriptor == null || ((Boolean) this.fqNameFilter.invoke(annotationDescriptor)).booleanValue() == null) ? null : true;
    }
}
