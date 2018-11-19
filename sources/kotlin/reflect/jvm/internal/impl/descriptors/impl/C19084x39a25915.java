package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15819j;
import kotlin.collections.C18457p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2 */
final class C19084x39a25915 extends Lambda implements Function0<CompositePackageFragmentProvider> {
    final /* synthetic */ ModuleDescriptorImpl this$0;

    C19084x39a25915(ModuleDescriptorImpl moduleDescriptorImpl) {
        this.this$0 = moduleDescriptorImpl;
        super(0);
    }

    @NotNull
    public final CompositePackageFragmentProvider invoke() {
        ModuleDependencies access$getDependencies$p = this.this$0.dependencies;
        StringBuilder stringBuilder;
        if (access$getDependencies$p != null) {
            List allDependencies = access$getDependencies$p.getAllDependencies();
            boolean contains = allDependencies.contains(this.this$0);
            if (!C15819j.f49018a || contains) {
                Iterable<ModuleDescriptorImpl> iterable = allDependencies;
                for (ModuleDescriptorImpl moduleDescriptorImpl : iterable) {
                    boolean access$isInitialized$p = moduleDescriptorImpl.isInitialized();
                    if (C15819j.f49018a && !access$isInitialized$p) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Dependency module ");
                        stringBuilder.append(moduleDescriptorImpl.getId());
                        stringBuilder.append(" was not initialized by the time contents of dependent module ");
                        stringBuilder.append(this.this$0.getId());
                        stringBuilder.append(" were queried");
                        throw new AssertionError(stringBuilder.toString());
                    }
                }
                Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                for (ModuleDescriptorImpl moduleDescriptorImpl2 : iterable) {
                    PackageFragmentProvider access$getPackageFragmentProviderForModuleContent$p = moduleDescriptorImpl2.packageFragmentProviderForModuleContent;
                    if (access$getPackageFragmentProviderForModuleContent$p == null) {
                        C2668g.a();
                    }
                    arrayList.add(access$getPackageFragmentProviderForModuleContent$p);
                }
                return new CompositePackageFragmentProvider((List) arrayList);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Module ");
            stringBuilder.append(this.this$0.getId());
            stringBuilder.append(" is not contained in his own dependencies, this is probably a misconfiguration");
            throw new AssertionError(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Dependencies of module ");
        stringBuilder.append(this.this$0.getId());
        stringBuilder.append(" were not set before querying module content");
        throw new AssertionError(stringBuilder.toString());
    }
}
