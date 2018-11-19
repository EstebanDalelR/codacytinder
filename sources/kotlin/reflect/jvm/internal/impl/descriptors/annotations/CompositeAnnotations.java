package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19066k;
import kotlin.collections.C19291t;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.sequences.C19155k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CompositeAnnotations implements Annotations {
    private final List<Annotations> delegates;

    public CompositeAnnotations(@NotNull List<? extends Annotations> list) {
        C2668g.b(list, "delegates");
        this.delegates = list;
    }

    public CompositeAnnotations(@NotNull Annotations... annotationsArr) {
        C2668g.b(annotationsArr, "delegates");
        this(C19066k.m68007i(annotationsArr));
    }

    public boolean isEmpty() {
        Iterable<Annotations> iterable = this.delegates;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Annotations isEmpty : iterable) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public boolean hasAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        for (Annotations hasAnnotation : C19299w.m68846r(this.delegates)) {
            if (hasAnnotation.hasAnnotation(fqName)) {
                return true;
            }
        }
        return null;
    }

    @Nullable
    public AnnotationDescriptor findAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return (AnnotationDescriptor) C19155k.m68029d(C19155k.m68034f(C19299w.m68846r(this.delegates), new CompositeAnnotations$findAnnotation$1(fqName)));
    }

    @NotNull
    public List<AnnotationWithTarget> getUseSiteTargetedAnnotations() {
        Collection arrayList = new ArrayList();
        for (Annotations useSiteTargetedAnnotations : this.delegates) {
            C19291t.m68635a(arrayList, (Iterable) useSiteTargetedAnnotations.getUseSiteTargetedAnnotations());
        }
        return (List) arrayList;
    }

    @NotNull
    public List<AnnotationWithTarget> getAllAnnotations() {
        Collection arrayList = new ArrayList();
        for (Annotations allAnnotations : this.delegates) {
            C19291t.m68635a(arrayList, (Iterable) allAnnotations.getAllAnnotations());
        }
        return (List) arrayList;
    }

    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return C19155k.m68030d(C19299w.m68846r(this.delegates), CompositeAnnotations$iterator$1.INSTANCE).iterator();
    }
}
