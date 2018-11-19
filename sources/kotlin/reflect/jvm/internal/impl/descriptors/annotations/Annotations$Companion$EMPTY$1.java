package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Annotations$Companion$EMPTY$1 implements Annotations {
    @Nullable
    public Void findAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return null;
    }

    public boolean isEmpty() {
        return true;
    }

    @NotNull
    public String toString() {
        return "EMPTY";
    }

    Annotations$Companion$EMPTY$1() {
    }

    public boolean hasAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return DefaultImpls.hasAnnotation(this, fqName);
    }

    @NotNull
    public List<AnnotationWithTarget> getUseSiteTargetedAnnotations() {
        return C17554o.m64195a();
    }

    @NotNull
    public List<AnnotationWithTarget> getAllAnnotations() {
        return C17554o.m64195a();
    }

    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return C17554o.m64195a().iterator();
    }
}
