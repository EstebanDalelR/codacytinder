package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.AnnotatedElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationOwner;", "annotations", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "getAnnotations", "()Ljava/util/List;", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "isDeprecatedInJavaDoc", "", "()Z", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
public interface ReflectJavaAnnotationOwner extends JavaAnnotationOwner {

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    public static final class DefaultImpls {
        public static boolean isDeprecatedInJavaDoc(ReflectJavaAnnotationOwner reflectJavaAnnotationOwner) {
            return false;
        }

        @NotNull
        public static List<ReflectJavaAnnotation> getAnnotations(ReflectJavaAnnotationOwner reflectJavaAnnotationOwner) {
            reflectJavaAnnotationOwner = reflectJavaAnnotationOwner.getElement();
            if (reflectJavaAnnotationOwner != null) {
                reflectJavaAnnotationOwner = reflectJavaAnnotationOwner.getDeclaredAnnotations();
                if (reflectJavaAnnotationOwner != null) {
                    reflectJavaAnnotationOwner = ReflectJavaAnnotationOwnerKt.getAnnotations(reflectJavaAnnotationOwner);
                    if (reflectJavaAnnotationOwner != null) {
                        return reflectJavaAnnotationOwner;
                    }
                }
            }
            return C17554o.m64195a();
        }

        @Nullable
        public static ReflectJavaAnnotation findAnnotation(ReflectJavaAnnotationOwner reflectJavaAnnotationOwner, @NotNull FqName fqName) {
            C2668g.b(fqName, "fqName");
            reflectJavaAnnotationOwner = reflectJavaAnnotationOwner.getElement();
            if (reflectJavaAnnotationOwner != null) {
                reflectJavaAnnotationOwner = reflectJavaAnnotationOwner.getDeclaredAnnotations();
                if (reflectJavaAnnotationOwner != null) {
                    return ReflectJavaAnnotationOwnerKt.findAnnotation(reflectJavaAnnotationOwner, fqName);
                }
            }
            return null;
        }
    }

    @Nullable
    AnnotatedElement getElement();
}
