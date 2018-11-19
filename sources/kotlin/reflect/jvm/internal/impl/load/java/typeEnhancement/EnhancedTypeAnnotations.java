package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationWithTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class EnhancedTypeAnnotations implements Annotations {
    private final FqName fqNameToMatch;

    public boolean isEmpty() {
        return false;
    }

    public EnhancedTypeAnnotations(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqNameToMatch");
        this.fqNameToMatch = fqName;
    }

    public boolean hasAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return DefaultImpls.hasAnnotation(this, fqName);
    }

    @Nullable
    public EnhancedTypeAnnotationDescriptor findAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return C2668g.a(fqName, this.fqNameToMatch) != null ? EnhancedTypeAnnotationDescriptor.INSTANCE : null;
    }

    @NotNull
    public List<AnnotationWithTarget> getAllAnnotations() {
        Iterable<AnnotationDescriptor> iterable = this;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (AnnotationDescriptor annotationWithTarget : iterable) {
            arrayList.add(new AnnotationWithTarget(annotationWithTarget, null));
        }
        return (List) arrayList;
    }

    @NotNull
    public List<AnnotationWithTarget> getUseSiteTargetedAnnotations() {
        return C17554o.m64195a();
    }

    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return C17554o.m64195a().iterator();
    }
}
