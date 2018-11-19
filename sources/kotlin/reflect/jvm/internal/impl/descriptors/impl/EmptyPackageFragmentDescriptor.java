package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import org.jetbrains.annotations.NotNull;

public final class EmptyPackageFragmentDescriptor extends PackageFragmentDescriptorImpl {
    public EmptyPackageFragmentDescriptor(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName fqName) {
        C2668g.b(moduleDescriptor, "module");
        C2668g.b(fqName, "fqName");
        super(moduleDescriptor, fqName);
    }

    @NotNull
    public Empty getMemberScope() {
        return Empty.INSTANCE;
    }
}
