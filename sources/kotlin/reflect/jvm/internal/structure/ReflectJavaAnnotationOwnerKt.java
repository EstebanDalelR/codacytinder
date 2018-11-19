package kotlin.reflect.jvm.internal.structure;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.C15820a;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"findAnnotation", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "", "", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "([Ljava/lang/annotation/Annotation;Lorg/jetbrains/kotlin/name/FqName;)Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "getAnnotations", "", "([Ljava/lang/annotation/Annotation;)Ljava/util/List;", "descriptors.runtime"}, k = 2, mv = {1, 1, 10})
public final class ReflectJavaAnnotationOwnerKt {
    @NotNull
    public static final List<ReflectJavaAnnotation> getAnnotations(@NotNull Annotation[] annotationArr) {
        C2668g.b(annotationArr, "$receiver");
        Collection arrayList = new ArrayList(annotationArr.length);
        for (Annotation reflectJavaAnnotation : annotationArr) {
            arrayList.add(new ReflectJavaAnnotation(reflectJavaAnnotation));
        }
        return (List) arrayList;
    }

    @Nullable
    public static final ReflectJavaAnnotation findAnnotation(@NotNull Annotation[] annotationArr, @NotNull FqName fqName) {
        C2668g.b(annotationArr, "$receiver");
        C2668g.b(fqName, "fqName");
        for (Annotation annotation : annotationArr) {
            if (C2668g.a(ReflectClassUtilKt.getClassId(C15820a.m59849a(C15820a.m59851a(annotation))).asSingleFqName(), fqName)) {
                break;
            }
        }
        Annotation annotation2 = null;
        return annotation2 != null ? new ReflectJavaAnnotation(annotation2) : null;
    }
}
