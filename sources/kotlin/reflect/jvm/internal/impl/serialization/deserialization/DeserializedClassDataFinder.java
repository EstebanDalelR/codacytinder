package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializedClassDataFinder implements ClassDataFinder {
    private final PackageFragmentProvider packageFragmentProvider;

    public DeserializedClassDataFinder(@NotNull PackageFragmentProvider packageFragmentProvider) {
        C2668g.b(packageFragmentProvider, "packageFragmentProvider");
        this.packageFragmentProvider = packageFragmentProvider;
    }

    @Nullable
    public ClassData findClassData(@NotNull ClassId classId) {
        C2668g.b(classId, "classId");
        PackageFragmentProvider packageFragmentProvider = this.packageFragmentProvider;
        FqName packageFqName = classId.getPackageFqName();
        C2668g.a(packageFqName, "classId.packageFqName");
        for (PackageFragmentDescriptor packageFragmentDescriptor : packageFragmentProvider.getPackageFragments(packageFqName)) {
            if (packageFragmentDescriptor instanceof DeserializedPackageFragment) {
                ClassData findClassData = ((DeserializedPackageFragment) packageFragmentDescriptor).getClassDataFinder().findClassData(classId);
                if (findClassData != null) {
                    return findClassData;
                }
            }
        }
        return null;
    }
}
