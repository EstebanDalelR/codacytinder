package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DescriptorUtilKt {
    @Nullable
    public static final ClassDescriptor resolveClassByFqName(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName fqName, @NotNull LookupLocation lookupLocation) {
        C2668g.b(moduleDescriptor, "$receiver");
        C2668g.b(fqName, "fqName");
        C2668g.b(lookupLocation, "lookupLocation");
        if (fqName.isRoot()) {
            return null;
        }
        FqName parent = fqName.parent();
        C2668g.a(parent, "fqName.parent()");
        MemberScope memberScope = moduleDescriptor.getPackage(parent).getMemberScope();
        Name shortName = fqName.shortName();
        C2668g.a(shortName, "fqName.shortName()");
        ClassifierDescriptor contributedClassifier = memberScope.getContributedClassifier(shortName, lookupLocation);
        if (!(contributedClassifier instanceof ClassDescriptor)) {
            contributedClassifier = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) contributedClassifier;
        if (classDescriptor != null) {
            return classDescriptor;
        }
        parent = fqName.parent();
        C2668g.a(parent, "fqName.parent()");
        moduleDescriptor = resolveClassByFqName(moduleDescriptor, parent, lookupLocation);
        if (moduleDescriptor != null) {
            moduleDescriptor = moduleDescriptor.getUnsubstitutedInnerClassesScope();
            if (moduleDescriptor != null) {
                fqName = fqName.shortName();
                C2668g.a(fqName, "fqName.shortName()");
                moduleDescriptor = moduleDescriptor.getContributedClassifier(fqName, lookupLocation);
                if ((moduleDescriptor instanceof ClassDescriptor) == null) {
                    moduleDescriptor = null;
                }
                return (ClassDescriptor) moduleDescriptor;
            }
        }
        moduleDescriptor = null;
        if ((moduleDescriptor instanceof ClassDescriptor) == null) {
            moduleDescriptor = null;
        }
        return (ClassDescriptor) moduleDescriptor;
    }
}
