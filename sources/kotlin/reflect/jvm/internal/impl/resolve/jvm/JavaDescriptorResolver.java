package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaDescriptorResolver {
    private final JavaResolverCache javaResolverCache;
    @NotNull
    private final LazyJavaPackageFragmentProvider packageFragmentProvider;

    public JavaDescriptorResolver(@NotNull LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, @NotNull JavaResolverCache javaResolverCache) {
        C2668g.b(lazyJavaPackageFragmentProvider, "packageFragmentProvider");
        C2668g.b(javaResolverCache, "javaResolverCache");
        this.packageFragmentProvider = lazyJavaPackageFragmentProvider;
        this.javaResolverCache = javaResolverCache;
    }

    @NotNull
    public final LazyJavaPackageFragmentProvider getPackageFragmentProvider() {
        return this.packageFragmentProvider;
    }

    @Nullable
    public final ClassDescriptor resolveClass(@NotNull JavaClass javaClass) {
        C2668g.b(javaClass, "javaClass");
        FqName fqName = javaClass.getFqName();
        if (fqName != null && javaClass.getLightClassOriginKind() == LightClassOriginKind.SOURCE) {
            return this.javaResolverCache.getClassResolvedFromSource(fqName);
        }
        JavaClass outerClass = javaClass.getOuterClass();
        ClassDescriptor classDescriptor = null;
        if (outerClass != null) {
            ClassDescriptor resolveClass = resolveClass(outerClass);
            MemberScope unsubstitutedInnerClassesScope = resolveClass != null ? resolveClass.getUnsubstitutedInnerClassesScope() : null;
            javaClass = unsubstitutedInnerClassesScope != null ? unsubstitutedInnerClassesScope.getContributedClassifier(javaClass.getName(), NoLookupLocation.FROM_JAVA_LOADER) : null;
            if (!(javaClass instanceof ClassDescriptor)) {
                javaClass = null;
            }
            return (ClassDescriptor) javaClass;
        } else if (fqName == null) {
            return null;
        } else {
            LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = this.packageFragmentProvider;
            fqName = fqName.parent();
            C2668g.a(fqName, "fqName.parent()");
            LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment) C19299w.m68831g(lazyJavaPackageFragmentProvider.getPackageFragments(fqName));
            if (lazyJavaPackageFragment != null) {
                classDescriptor = lazyJavaPackageFragment.findClassifierByJavaClass$descriptors_jvm(javaClass);
            }
            return classDescriptor;
        }
    }
}
