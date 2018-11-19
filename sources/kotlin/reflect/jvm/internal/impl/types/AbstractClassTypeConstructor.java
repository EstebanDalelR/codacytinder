package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractClassTypeConstructor extends AbstractTypeConstructor implements TypeConstructor {
    private int hashCode = null;

    @NotNull
    public abstract ClassDescriptor getDeclarationDescriptor();

    public AbstractClassTypeConstructor(@NotNull StorageManager storageManager) {
        super(storageManager);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        DeclarationDescriptor declarationDescriptor = getDeclarationDescriptor();
        if (hasMeaningfulFqName(declarationDescriptor)) {
            i = DescriptorUtils.getFqName(declarationDescriptor).hashCode();
        } else {
            i = System.identityHashCode(this);
        }
        this.hashCode = i;
        return i;
    }

    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return DescriptorUtilsKt.getBuiltIns(getDeclarationDescriptor());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeConstructor) || obj.hashCode() != hashCode()) {
            return false;
        }
        TypeConstructor typeConstructor = (TypeConstructor) obj;
        if (typeConstructor.getParameters().size() != getParameters().size()) {
            return false;
        }
        ClassifierDescriptor declarationDescriptor = getDeclarationDescriptor();
        obj = typeConstructor.getDeclarationDescriptor();
        if (hasMeaningfulFqName(declarationDescriptor)) {
            if (obj == null || hasMeaningfulFqName(obj)) {
                if (obj instanceof ClassDescriptor) {
                    return areFqNamesEqual((ClassDescriptor) declarationDescriptor, (ClassDescriptor) obj);
                }
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean areFqNamesEqual(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r4) {
        /*
        r0 = r3.getName();
        r1 = r4.getName();
        r0 = r0.equals(r1);
        r1 = 0;
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r3 = r3.getContainingDeclaration();
        r4 = r4.getContainingDeclaration();
    L_0x0018:
        r0 = 1;
        if (r3 == 0) goto L_0x0063;
    L_0x001b:
        if (r4 == 0) goto L_0x0063;
    L_0x001d:
        r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
        if (r2 == 0) goto L_0x0024;
    L_0x0021:
        r3 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
        return r3;
    L_0x0024:
        r2 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
        if (r2 == 0) goto L_0x0029;
    L_0x0028:
        return r1;
    L_0x0029:
        r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
        if (r2 == 0) goto L_0x0046;
    L_0x002d:
        r2 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
        if (r2 == 0) goto L_0x0044;
    L_0x0031:
        r3 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) r3;
        r3 = r3.getFqName();
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) r4;
        r4 = r4.getFqName();
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0045;
    L_0x0044:
        r0 = 0;
    L_0x0045:
        return r0;
    L_0x0046:
        r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
        if (r0 == 0) goto L_0x004b;
    L_0x004a:
        return r1;
    L_0x004b:
        r0 = r3.getName();
        r2 = r4.getName();
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x005a;
    L_0x0059:
        return r1;
    L_0x005a:
        r3 = r3.getContainingDeclaration();
        r4 = r4.getContainingDeclaration();
        goto L_0x0018;
    L_0x0063:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor.areFqNamesEqual(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor):boolean");
    }

    private static boolean hasMeaningfulFqName(@NotNull ClassifierDescriptor classifierDescriptor) {
        return (ErrorUtils.isError(classifierDescriptor) || DescriptorUtils.isLocal(classifierDescriptor) != null) ? null : true;
    }

    @NotNull
    protected Collection<KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z) {
        DeclarationDescriptor containingDeclaration = getDeclarationDescriptor().getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            return Collections.emptyList();
        }
        Collection<KotlinType> smartList = new SmartList();
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        smartList.add(classDescriptor.getDefaultType());
        classDescriptor = classDescriptor.getCompanionObjectDescriptor();
        if (z && classDescriptor != null) {
            smartList.add(classDescriptor.getDefaultType());
        }
        return smartList;
    }
}
