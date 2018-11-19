package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationWithTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.sequences.C19155k;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LazyJavaAnnotations implements Annotations {
    private final MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> annotationDescriptors = this.f57766c.getComponents().getStorageManager().createMemoizedFunctionWithNullableValues((Function1) new LazyJavaAnnotations$annotationDescriptors$1(this));
    private final JavaAnnotationOwner annotationOwner;
    /* renamed from: c */
    private final LazyJavaResolverContext f57766c;

    public LazyJavaAnnotations(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaAnnotationOwner javaAnnotationOwner) {
        C2668g.b(lazyJavaResolverContext, "c");
        C2668g.b(javaAnnotationOwner, "annotationOwner");
        this.f57766c = lazyJavaResolverContext;
        this.annotationOwner = javaAnnotationOwner;
    }

    public boolean hasAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return DefaultImpls.hasAnnotation(this, fqName);
    }

    @Nullable
    public AnnotationDescriptor findAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        JavaAnnotation findAnnotation = this.annotationOwner.findAnnotation(fqName);
        if (findAnnotation != null) {
            AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) this.annotationDescriptors.invoke(findAnnotation);
            if (annotationDescriptor != null) {
                return annotationDescriptor;
            }
        }
        return JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(fqName, this.annotationOwner, this.f57766c);
    }

    @NotNull
    public List<AnnotationWithTarget> getUseSiteTargetedAnnotations() {
        return C17554o.m64195a();
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
    public Iterator<AnnotationDescriptor> iterator() {
        Sequence e = C19155k.m68032e(C19299w.m68846r(this.annotationOwner.getAnnotations()), this.annotationDescriptors);
        JavaAnnotationMapper javaAnnotationMapper = JavaAnnotationMapper.INSTANCE;
        FqName fqName = KotlinBuiltIns.FQ_NAMES.deprecated;
        C2668g.a(fqName, "KotlinBuiltIns.FQ_NAMES.deprecated");
        return C19155k.m68031e(C19155k.m68023a(e, (Object) javaAnnotationMapper.findMappedJavaAnnotation(fqName, this.annotationOwner, this.f57766c))).iterator();
    }

    public boolean isEmpty() {
        return this.annotationOwner.getAnnotations().isEmpty() && !this.annotationOwner.isDeprecatedInJavaDoc();
    }
}
