package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.Nullable;

final class ContextKt$copyWithNewDefaultTypeQualifiers$1 extends Lambda implements Function0<JavaTypeQualifiersByElementType> {
    final /* synthetic */ Annotations $additionalAnnotations;
    final /* synthetic */ LazyJavaResolverContext receiver$0;

    ContextKt$copyWithNewDefaultTypeQualifiers$1(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
        this.receiver$0 = lazyJavaResolverContext;
        this.$additionalAnnotations = annotations;
        super(0);
    }

    @Nullable
    public final JavaTypeQualifiersByElementType invoke() {
        return ContextKt.computeNewDefaultTypeQualifiers(this.receiver$0, this.$additionalAnnotations);
    }
}
