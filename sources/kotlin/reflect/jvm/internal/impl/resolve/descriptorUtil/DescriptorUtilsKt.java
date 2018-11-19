package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import com.tinder.api.ManagerWebServices;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.C15819j;
import kotlin.TypeCastException;
import kotlin.collections.C15807n;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler;
import kotlin.sequences.C17625i;
import kotlin.sequences.C19155k;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DescriptorUtilsKt {
    private static final Name RETENTION_PARAMETER_NAME = Name.identifier("value");

    @NotNull
    public static final FqNameUnsafe getFqNameUnsafe(@NotNull DeclarationDescriptor declarationDescriptor) {
        C2668g.b(declarationDescriptor, "$receiver");
        declarationDescriptor = DescriptorUtils.getFqName(declarationDescriptor);
        C2668g.a(declarationDescriptor, "DescriptorUtils.getFqName(this)");
        return declarationDescriptor;
    }

    @NotNull
    public static final FqName getFqNameSafe(@NotNull DeclarationDescriptor declarationDescriptor) {
        C2668g.b(declarationDescriptor, "$receiver");
        declarationDescriptor = DescriptorUtils.getFqNameSafe(declarationDescriptor);
        C2668g.a(declarationDescriptor, "DescriptorUtils.getFqNameSafe(this)");
        return declarationDescriptor;
    }

    @NotNull
    public static final ModuleDescriptor getModule(@NotNull DeclarationDescriptor declarationDescriptor) {
        C2668g.b(declarationDescriptor, "$receiver");
        declarationDescriptor = DescriptorUtils.getContainingModule(declarationDescriptor);
        C2668g.a(declarationDescriptor, "DescriptorUtils.getContainingModule(this)");
        return declarationDescriptor;
    }

    @Nullable
    public static final ClassDescriptor resolveTopLevelClass(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName fqName, @NotNull LookupLocation lookupLocation) {
        C2668g.b(moduleDescriptor, "$receiver");
        C2668g.b(fqName, "topLevelClassFqName");
        C2668g.b(lookupLocation, "location");
        int isRoot = fqName.isRoot() ^ 1;
        if (C15819j.f49018a && isRoot == 0) {
            throw ((Throwable) new AssertionError("Assertion failed"));
        }
        FqName parent = fqName.parent();
        C2668g.a(parent, "topLevelClassFqName.parent()");
        moduleDescriptor = moduleDescriptor.getPackage(parent).getMemberScope();
        fqName = fqName.shortName();
        C2668g.a(fqName, "topLevelClassFqName.shortName()");
        moduleDescriptor = moduleDescriptor.getContributedClassifier(fqName, lookupLocation);
        if ((moduleDescriptor instanceof ClassDescriptor) == null) {
            moduleDescriptor = null;
        }
        return (ClassDescriptor) moduleDescriptor;
    }

    @Nullable
    public static final ClassId getClassId(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        C2668g.b(classifierDescriptorWithTypeParameters, "$receiver");
        DeclarationDescriptor containingDeclaration = classifierDescriptorWithTypeParameters.getContainingDeclaration();
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            return new ClassId(((PackageFragmentDescriptor) containingDeclaration).getFqName(), classifierDescriptorWithTypeParameters.getName());
        }
        if (!(containingDeclaration instanceof ClassifierDescriptorWithTypeParameters)) {
            return null;
        }
        C2668g.a(containingDeclaration, ManagerWebServices.PARAM_GROUP_OWNER);
        ClassId classId = getClassId((ClassifierDescriptorWithTypeParameters) containingDeclaration);
        if (classId != null) {
            return classId.createNestedClassId(classifierDescriptorWithTypeParameters.getName());
        }
        return null;
    }

    @Nullable
    public static final ClassDescriptor getSuperClassNotAny(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "$receiver");
        for (KotlinType kotlinType : classDescriptor.getDefaultType().getConstructor().getSupertypes()) {
            if (!KotlinBuiltIns.isAnyOrNullableAny(kotlinType)) {
                ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
                if (DescriptorUtils.isClassOrEnumClass(declarationDescriptor)) {
                    if (declarationDescriptor != null) {
                        return (ClassDescriptor) declarationDescriptor;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                }
            }
        }
        return null;
    }

    @NotNull
    public static final KotlinBuiltIns getBuiltIns(@NotNull DeclarationDescriptor declarationDescriptor) {
        C2668g.b(declarationDescriptor, "$receiver");
        return getModule(declarationDescriptor).getBuiltIns();
    }

    public static final boolean declaresOrInheritsDefaultValue(@NotNull ValueParameterDescriptor valueParameterDescriptor) {
        C2668g.b(valueParameterDescriptor, "$receiver");
        valueParameterDescriptor = DFS.ifAny(C15807n.m59826a(valueParameterDescriptor), DescriptorUtilsKt$declaresOrInheritsDefaultValue$1.INSTANCE, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.INSTANCE);
        C2668g.a(valueParameterDescriptor, "DFS.ifAny(\n        listO…eclaresDefaultValue\n    )");
        return valueParameterDescriptor.booleanValue();
    }

    @NotNull
    public static final Sequence<DeclarationDescriptor> getParentsWithSelf(@NotNull DeclarationDescriptor declarationDescriptor) {
        C2668g.b(declarationDescriptor, "$receiver");
        return C17625i.m64229a((Object) declarationDescriptor, (Function1) DescriptorUtilsKt$parentsWithSelf$1.INSTANCE);
    }

    @NotNull
    public static final Sequence<DeclarationDescriptor> getParents(@NotNull DeclarationDescriptor declarationDescriptor) {
        C2668g.b(declarationDescriptor, "$receiver");
        return C19155k.m68021a((Sequence) getParentsWithSelf(declarationDescriptor), 1);
    }

    @NotNull
    public static final CallableMemberDescriptor getPropertyIfAccessor(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.b(callableMemberDescriptor, "$receiver");
        if (!(callableMemberDescriptor instanceof PropertyAccessorDescriptor)) {
            return callableMemberDescriptor;
        }
        callableMemberDescriptor = ((PropertyAccessorDescriptor) callableMemberDescriptor).getCorrespondingProperty();
        C2668g.a(callableMemberDescriptor, "correspondingProperty");
        return callableMemberDescriptor;
    }

    @Nullable
    public static final FqName fqNameOrNull(@NotNull CallableDescriptor callableDescriptor) {
        C2668g.b(callableDescriptor, "$receiver");
        callableDescriptor = getFqNameUnsafe(callableDescriptor);
        if (!callableDescriptor.isSafe()) {
            callableDescriptor = null;
        }
        return callableDescriptor != null ? callableDescriptor.toSafe() : null;
    }

    @Nullable
    public static /* synthetic */ CallableMemberDescriptor firstOverridden$default(CallableMemberDescriptor callableMemberDescriptor, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return firstOverridden(callableMemberDescriptor, z, function1);
    }

    @Nullable
    public static final CallableMemberDescriptor firstOverridden(@NotNull CallableMemberDescriptor callableMemberDescriptor, boolean z, @NotNull Function1<? super CallableMemberDescriptor, Boolean> function1) {
        C2668g.b(callableMemberDescriptor, "$receiver");
        C2668g.b(function1, "predicate");
        ObjectRef objectRef = new ObjectRef();
        objectRef.f49022a = (CallableMemberDescriptor) null;
        return (CallableMemberDescriptor) DFS.dfs(C15807n.m59826a(callableMemberDescriptor), new DescriptorUtilsKt$firstOverridden$1(z), (NodeHandler) new DescriptorUtilsKt$firstOverridden$2(objectRef, function1));
    }

    @NotNull
    public static final Collection<ClassDescriptor> computeSealedSubclasses(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "sealedClass");
        if (classDescriptor.getModality() != Modality.SEALED) {
            return C17554o.m64195a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DescriptorUtilsKt$computeSealedSubclasses$1 descriptorUtilsKt$computeSealedSubclasses$1 = new DescriptorUtilsKt$computeSealedSubclasses$1(classDescriptor, linkedHashSet);
        DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            descriptorUtilsKt$computeSealedSubclasses$1.invoke(((PackageFragmentDescriptor) containingDeclaration).getMemberScope(), false);
        }
        MemberScope unsubstitutedInnerClassesScope = classDescriptor.getUnsubstitutedInnerClassesScope();
        C2668g.a(unsubstitutedInnerClassesScope, "sealedClass.unsubstitutedInnerClassesScope");
        descriptorUtilsKt$computeSealedSubclasses$1.invoke(unsubstitutedInnerClassesScope, true);
        return linkedHashSet;
    }

    @Nullable
    public static final ClassDescriptor getAnnotationClass(@NotNull AnnotationDescriptor annotationDescriptor) {
        C2668g.b(annotationDescriptor, "$receiver");
        annotationDescriptor = annotationDescriptor.getType().getConstructor().getDeclarationDescriptor();
        if (!(annotationDescriptor instanceof ClassDescriptor)) {
            annotationDescriptor = null;
        }
        return (ClassDescriptor) annotationDescriptor;
    }

    @Nullable
    public static final ConstantValue<?> firstArgument(@NotNull AnnotationDescriptor annotationDescriptor) {
        C2668g.b(annotationDescriptor, "$receiver");
        return (ConstantValue) C19299w.m68812c((Iterable) annotationDescriptor.getAllValueArguments().values());
    }
}
