package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.Found;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.NotFound;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class LazyJavaPackageScope$classes$1 extends Lambda implements Function1<FindClassRequest, ClassDescriptor> {
    final /* synthetic */ LazyJavaResolverContext $c;
    final /* synthetic */ LazyJavaPackageScope this$0;

    LazyJavaPackageScope$classes$1(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.this$0 = lazyJavaPackageScope;
        this.$c = lazyJavaResolverContext;
        super(1);
    }

    @Nullable
    public final ClassDescriptor invoke(@NotNull FindClassRequest findClassRequest) {
        KotlinJvmBinaryClass findKotlinClass;
        C2668g.b(findClassRequest, "request");
        ClassId classId = new ClassId(this.this$0.getOwnerDescriptor().getFqName(), findClassRequest.getName());
        if (findClassRequest.getJavaClass() != null) {
            findKotlinClass = this.$c.getComponents().getKotlinClassFinder().findKotlinClass(findClassRequest.getJavaClass());
        } else {
            findKotlinClass = this.$c.getComponents().getKotlinClassFinder().findKotlinClass(classId);
        }
        ClassDescriptor classDescriptor = null;
        ClassId classId2 = findKotlinClass != null ? findKotlinClass.getClassId() : null;
        if (classId2 != null && (classId2.isNestedClass() || classId2.isLocal())) {
            return null;
        }
        KotlinClassLookupResult access$resolveKotlinBinaryClass = this.this$0.resolveKotlinBinaryClass(findKotlinClass);
        if (access$resolveKotlinBinaryClass instanceof Found) {
            classDescriptor = ((Found) access$resolveKotlinBinaryClass).getDescriptor();
        } else if (!(access$resolveKotlinBinaryClass instanceof SyntheticClass)) {
            if (access$resolveKotlinBinaryClass instanceof NotFound) {
                findClassRequest = findClassRequest.getJavaClass();
                if (findClassRequest == null) {
                    findClassRequest = this.$c.getComponents().getFinder().findClass(classId);
                }
                JavaClass javaClass = findClassRequest;
                if ((javaClass != null ? javaClass.getLightClassOriginKind() : null) == LightClassOriginKind.BINARY) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Couldn't find kotlin binary class for light class created by kotlin binary file\n");
                    stringBuilder.append("JavaClass: ");
                    stringBuilder.append(javaClass);
                    stringBuilder.append('\n');
                    stringBuilder.append("ClassId: ");
                    stringBuilder.append(classId);
                    stringBuilder.append('\n');
                    stringBuilder.append("findKotlinClass(JavaClass) = ");
                    stringBuilder.append(this.$c.getComponents().getKotlinClassFinder().findKotlinClass(javaClass));
                    stringBuilder.append('\n');
                    stringBuilder.append("findKotlinClass(ClassId) = ");
                    stringBuilder.append(this.$c.getComponents().getKotlinClassFinder().findKotlinClass(classId));
                    stringBuilder.append('\n');
                    throw ((Throwable) new IllegalStateException(stringBuilder.toString()));
                }
                findClassRequest = javaClass != null ? javaClass.getFqName() : null;
                if (!(findClassRequest == null || findClassRequest.isRoot())) {
                    if ((C2668g.a(findClassRequest.parent(), this.this$0.getOwnerDescriptor().getFqName()) ^ 1) == null) {
                        FindClassRequest lazyJavaClassDescriptor = new LazyJavaClassDescriptor(this.$c, this.this$0.getOwnerDescriptor(), javaClass, null, 8, null);
                        this.$c.getComponents().getJavaClassesTracker().reportClass((JavaClassDescriptor) lazyJavaClassDescriptor);
                        classDescriptor = (ClassDescriptor) findClassRequest;
                    }
                }
                findClassRequest = null;
                classDescriptor = (ClassDescriptor) findClassRequest;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return classDescriptor;
    }
}
