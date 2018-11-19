package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C15819j;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.sequences.C19155k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeParameterUtilsKt {
    @NotNull
    public static final List<TypeParameterDescriptor> computeConstructorTypeParameters(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        C2668g.b(classifierDescriptorWithTypeParameters, "$receiver");
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        if (classifierDescriptorWithTypeParameters.isInner() || (classifierDescriptorWithTypeParameters.getContainingDeclaration() instanceof CallableDescriptor)) {
            Object obj;
            List list;
            DeclarationDescriptor declarationDescriptor = classifierDescriptorWithTypeParameters;
            List f = C19155k.m68033f(C19155k.m68030d(C19155k.m68028c(DescriptorUtilsKt.getParents(declarationDescriptor), C19081x246a49e2.INSTANCE), C19082x246a49e3.INSTANCE));
            Iterator it = DescriptorUtilsKt.getParents(declarationDescriptor).iterator();
            do {
                list = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
            } while (!(obj instanceof ClassDescriptor));
            ClassDescriptor classDescriptor = (ClassDescriptor) obj;
            if (classDescriptor != null) {
                TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
                if (typeConstructor != null) {
                    list = typeConstructor.getParameters();
                }
            }
            if (list == null) {
                list = C17554o.m64195a();
            }
            if (f.isEmpty() && list.isEmpty()) {
                classifierDescriptorWithTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
                C2668g.a(classifierDescriptorWithTypeParameters, "declaredTypeParameters");
                return classifierDescriptorWithTypeParameters;
            }
            Iterable<TypeParameterDescriptor> b = C19299w.m68809b((Collection) f, (Iterable) list);
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) b, 10));
            for (TypeParameterDescriptor typeParameterDescriptor : b) {
                C2668g.a(typeParameterDescriptor, "it");
                arrayList.add(capturedCopyForInnerDeclaration(typeParameterDescriptor, declarationDescriptor, declaredTypeParameters.size()));
            }
            f = (List) arrayList;
            C2668g.a(declaredTypeParameters, "declaredParameters");
            return C19299w.m68809b((Collection) declaredTypeParameters, (Iterable) f);
        }
        C2668g.a(declaredTypeParameters, "declaredParameters");
        return declaredTypeParameters;
    }

    private static final CapturedTypeParameterDescriptor capturedCopyForInnerDeclaration(@NotNull TypeParameterDescriptor typeParameterDescriptor, DeclarationDescriptor declarationDescriptor, int i) {
        return new CapturedTypeParameterDescriptor(typeParameterDescriptor, declarationDescriptor, i);
    }

    @Nullable
    public static final PossiblyInnerType buildPossiblyInnerType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof ClassifierDescriptorWithTypeParameters)) {
            declarationDescriptor = null;
        }
        return buildPossiblyInnerType(kotlinType, (ClassifierDescriptorWithTypeParameters) declarationDescriptor, 0);
    }

    private static final PossiblyInnerType buildPossiblyInnerType(@NotNull KotlinType kotlinType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i) {
        PossiblyInnerType possiblyInnerType = null;
        if (classifierDescriptorWithTypeParameters != null) {
            DeclarationDescriptor declarationDescriptor = classifierDescriptorWithTypeParameters;
            if (!ErrorUtils.isError(declarationDescriptor)) {
                int size = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters().size() + i;
                if (classifierDescriptorWithTypeParameters.isInner()) {
                    i = kotlinType.getArguments().subList(i, size);
                    DeclarationDescriptor containingDeclaration = classifierDescriptorWithTypeParameters.getContainingDeclaration();
                    if (containingDeclaration instanceof ClassifierDescriptorWithTypeParameters) {
                        possiblyInnerType = containingDeclaration;
                    }
                    return new PossiblyInnerType(classifierDescriptorWithTypeParameters, i, buildPossiblyInnerType(kotlinType, (ClassifierDescriptorWithTypeParameters) possiblyInnerType, size));
                }
                Object obj;
                if (size != kotlinType.getArguments().size()) {
                    if (!DescriptorUtils.isLocal(declarationDescriptor)) {
                        obj = null;
                        if (C15819j.f49018a || r1 != null) {
                            return new PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.getArguments().subList(i, kotlinType.getArguments().size()), null);
                        }
                        classifierDescriptorWithTypeParameters = new StringBuilder();
                        classifierDescriptorWithTypeParameters.append("");
                        classifierDescriptorWithTypeParameters.append(kotlinType.getArguments().size() - size);
                        classifierDescriptorWithTypeParameters.append(" trailing arguments were found in ");
                        classifierDescriptorWithTypeParameters.append(kotlinType);
                        classifierDescriptorWithTypeParameters.append(" type");
                        throw ((Throwable) new AssertionError(classifierDescriptorWithTypeParameters.toString()));
                    }
                }
                obj = 1;
                if (C15819j.f49018a) {
                }
                return new PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.getArguments().subList(i, kotlinType.getArguments().size()), null);
            }
        }
        return null;
    }
}
