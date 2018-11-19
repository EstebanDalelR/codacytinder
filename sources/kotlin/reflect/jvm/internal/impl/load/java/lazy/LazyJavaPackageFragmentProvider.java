package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.List;
import kotlin.C17559f;
import kotlin.collections.C17554o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver.EMPTY;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import org.jetbrains.annotations.NotNull;

public final class LazyJavaPackageFragmentProvider implements PackageFragmentProvider {
    /* renamed from: c */
    private final LazyJavaResolverContext f54771c;
    private final CacheWithNotNullValues<FqName, LazyJavaPackageFragment> packageFragments = this.f54771c.getStorageManager().createCacheWithNotNullValues();

    public LazyJavaPackageFragmentProvider(@NotNull JavaResolverComponents javaResolverComponents) {
        C2668g.b(javaResolverComponents, "components");
        this.f54771c = new LazyJavaResolverContext(javaResolverComponents, EMPTY.INSTANCE, C17559f.m64205a(null));
    }

    private final LazyJavaPackageFragment getPackageFragment(FqName fqName) {
        JavaPackage findPackage = this.f54771c.getComponents().getFinder().findPackage(fqName);
        return findPackage != null ? (LazyJavaPackageFragment) this.packageFragments.computeIfAbsent(fqName, new LazyJavaPackageFragmentProvider$getPackageFragment$1(this, findPackage)) : null;
    }

    @NotNull
    public List<LazyJavaPackageFragment> getPackageFragments(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return C17554o.m64197b((Object) getPackageFragment(fqName));
    }

    @NotNull
    public List<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        C2668g.b(fqName, "fqName");
        C2668g.b(function1, "nameFilter");
        fqName = getPackageFragment(fqName);
        fqName = fqName != null ? fqName.getSubPackageFqNames$descriptors_jvm() : null;
        return fqName != null ? fqName : C17554o.m64195a();
    }
}
