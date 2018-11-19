package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.C17625i;
import kotlin.sequences.C19155k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FindClassInModuleKt {
    @Nullable
    public static final ClassDescriptor findClassAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        C2668g.b(moduleDescriptor, "$receiver");
        C2668g.b(classId, "classId");
        FqName packageFqName = classId.getPackageFqName();
        C2668g.a(packageFqName, "classId.packageFqName");
        moduleDescriptor = moduleDescriptor.getPackage(packageFqName);
        classId = classId.getRelativeClassName().pathSegments();
        moduleDescriptor = moduleDescriptor.getMemberScope();
        C2668g.a(classId, "segments");
        Object f = C19299w.m68829f((List) classId);
        C2668g.a(f, "segments.first()");
        moduleDescriptor = moduleDescriptor.getContributedClassifier((Name) f, NoLookupLocation.FROM_DESERIALIZATION);
        if (!(moduleDescriptor instanceof ClassDescriptor)) {
            moduleDescriptor = null;
        }
        moduleDescriptor = (ClassDescriptor) moduleDescriptor;
        if (moduleDescriptor == null) {
            return null;
        }
        for (Name name : classId.subList(1, classId.size())) {
            moduleDescriptor = moduleDescriptor.getUnsubstitutedInnerClassesScope();
            C2668g.a(name, "name");
            moduleDescriptor = moduleDescriptor.getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
            if (!(moduleDescriptor instanceof ClassDescriptor)) {
                moduleDescriptor = null;
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) moduleDescriptor;
            if (classDescriptor == null) {
                return null;
            }
        }
        return moduleDescriptor;
    }

    @NotNull
    public static final ClassDescriptor findNonGenericClassAcrossDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId, @NotNull NotFoundClasses notFoundClasses) {
        C2668g.b(moduleDescriptor, "$receiver");
        C2668g.b(classId, "classId");
        C2668g.b(notFoundClasses, "notFoundClasses");
        moduleDescriptor = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        if (moduleDescriptor != null) {
            return moduleDescriptor;
        }
        return notFoundClasses.getClass(classId, C19155k.m68033f(C19155k.m68032e(C17625i.m64229a((Object) classId, (Function1) C19284x24bfe126.INSTANCE), C19080x24bfe127.INSTANCE)));
    }

    @Nullable
    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        C2668g.b(moduleDescriptor, "$receiver");
        C2668g.b(classId, "classId");
        FqName packageFqName = classId.getPackageFqName();
        C2668g.a(packageFqName, "classId.packageFqName");
        moduleDescriptor = moduleDescriptor.getPackage(packageFqName);
        classId = classId.getRelativeClassName().pathSegments();
        int size = classId.size() - 1;
        moduleDescriptor = moduleDescriptor.getMemberScope();
        C2668g.a(classId, "segments");
        Object f = C19299w.m68829f((List) classId);
        C2668g.a(f, "segments.first()");
        moduleDescriptor = moduleDescriptor.getContributedClassifier((Name) f, NoLookupLocation.FROM_DESERIALIZATION);
        if (size == 0) {
            if ((moduleDescriptor instanceof TypeAliasDescriptor) == null) {
                moduleDescriptor = null;
            }
            return (TypeAliasDescriptor) moduleDescriptor;
        }
        if (!(moduleDescriptor instanceof ClassDescriptor)) {
            moduleDescriptor = null;
        }
        moduleDescriptor = (ClassDescriptor) moduleDescriptor;
        if (moduleDescriptor == null) {
            return null;
        }
        for (Name name : classId.subList(1, size)) {
            moduleDescriptor = moduleDescriptor.getUnsubstitutedInnerClassesScope();
            C2668g.a(name, "name");
            moduleDescriptor = moduleDescriptor.getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
            if (!(moduleDescriptor instanceof ClassDescriptor)) {
                moduleDescriptor = null;
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) moduleDescriptor;
            if (classDescriptor == null) {
                return null;
            }
        }
        Name name2 = (Name) classId.get(size);
        moduleDescriptor = moduleDescriptor.getUnsubstitutedMemberScope();
        C2668g.a(name2, "lastName");
        moduleDescriptor = moduleDescriptor.getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
        if ((moduleDescriptor instanceof TypeAliasDescriptor) == null) {
            moduleDescriptor = null;
        }
        return (TypeAliasDescriptor) moduleDescriptor;
    }
}
