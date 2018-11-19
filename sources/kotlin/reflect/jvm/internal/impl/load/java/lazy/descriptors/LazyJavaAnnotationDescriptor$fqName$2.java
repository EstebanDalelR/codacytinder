package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.Nullable;

final class LazyJavaAnnotationDescriptor$fqName$2 extends Lambda implements Function0<FqName> {
    final /* synthetic */ LazyJavaAnnotationDescriptor this$0;

    LazyJavaAnnotationDescriptor$fqName$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        this.this$0 = lazyJavaAnnotationDescriptor;
        super(0);
    }

    @Nullable
    public final FqName invoke() {
        ClassId classId = this.this$0.javaAnnotation.getClassId();
        return classId != null ? classId.asSingleFqName() : null;
    }
}
