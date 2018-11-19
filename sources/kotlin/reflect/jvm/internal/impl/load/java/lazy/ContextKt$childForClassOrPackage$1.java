package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import org.jetbrains.annotations.Nullable;

final class ContextKt$childForClassOrPackage$1 extends Lambda implements Function0<JavaTypeQualifiersByElementType> {
    final /* synthetic */ ClassOrPackageFragmentDescriptor $containingDeclaration;
    final /* synthetic */ LazyJavaResolverContext receiver$0;

    ContextKt$childForClassOrPackage$1(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
        this.receiver$0 = lazyJavaResolverContext;
        this.$containingDeclaration = classOrPackageFragmentDescriptor;
        super(0);
    }

    @Nullable
    public final JavaTypeQualifiersByElementType invoke() {
        return ContextKt.computeNewDefaultTypeQualifiers(this.receiver$0, this.$containingDeclaration.getAnnotations());
    }
}
