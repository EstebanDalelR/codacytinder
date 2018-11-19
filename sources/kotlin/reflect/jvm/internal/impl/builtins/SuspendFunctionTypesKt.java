package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15819j;
import kotlin.collections.C15807n;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SuspendFunctionTypesKt {
    @NotNull
    private static final MutableClassDescriptor FAKE_CONTINUATION_CLASS_DESCRIPTOR;

    @NotNull
    public static final MutableClassDescriptor getFAKE_CONTINUATION_CLASS_DESCRIPTOR() {
        return FAKE_CONTINUATION_CLASS_DESCRIPTOR;
    }

    static {
        ModuleDescriptor errorModule = ErrorUtils.getErrorModule();
        C2668g.a(errorModule, "ErrorUtils.getErrorModule()");
        FqName fqName = DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME;
        C2668g.a(fqName, "DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME");
        MutableClassDescriptor mutableClassDescriptor = new MutableClassDescriptor(new EmptyPackageFragmentDescriptor(errorModule, fqName), ClassKind.INTERFACE, false, false, DescriptorUtils.CONTINUATION_INTERFACE_FQ_NAME.shortName(), SourceElement.NO_SOURCE);
        mutableClassDescriptor.setModality(Modality.ABSTRACT);
        mutableClassDescriptor.setVisibility(Visibilities.PUBLIC);
        mutableClassDescriptor.setTypeParameterDescriptors(C15807n.m59826a(TypeParameterDescriptorImpl.createWithDefaultBound(mutableClassDescriptor, Annotations.Companion.getEMPTY(), false, Variance.IN_VARIANCE, Name.identifier("T"), 0)));
        mutableClassDescriptor.createTypeConstructor();
        FAKE_CONTINUATION_CLASS_DESCRIPTOR = mutableClassDescriptor;
    }

    @NotNull
    public static final SimpleType transformSuspendFunctionToRuntimeFunctionType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "suspendFunType");
        boolean isSuspendFunctionType = FunctionTypesKt.isSuspendFunctionType(kotlinType);
        if (!C15819j.f49018a || isSuspendFunctionType) {
            KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(kotlinType);
            Annotations annotations = kotlinType.getAnnotations();
            KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
            Iterable<TypeProjection> valueParameterTypesFromFunctionType = FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType);
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) valueParameterTypesFromFunctionType, 10));
            for (TypeProjection type : valueParameterTypesFromFunctionType) {
                arrayList.add(type.getType());
            }
            arrayList = (List) arrayList;
            Annotations empty = Annotations.Companion.getEMPTY();
            TypeConstructor typeConstructor = FAKE_CONTINUATION_CLASS_DESCRIPTOR.getTypeConstructor();
            C2668g.a(typeConstructor, "FAKE_CONTINUATION_CLASS_DESCRIPTOR.typeConstructor");
            List a = C19299w.m68800a(arrayList, (Object) KotlinTypeFactory.simpleType(empty, typeConstructor, C15807n.m59826a(TypeUtilsKt.asTypeProjection(FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType))), false));
            SimpleType nullableAnyType = TypeUtilsKt.getBuiltIns(kotlinType).getNullableAnyType();
            C2668g.a(nullableAnyType, "suspendFunType.builtIns.nullableAnyType");
            return FunctionTypesKt.createFunctionType$default(builtIns, annotations, receiverTypeFromFunctionType, a, null, nullableAnyType, false, 64, null).makeNullableAsSpecified(kotlinType.isMarkedNullable());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This type should be suspend function type: ");
        stringBuilder.append(kotlinType);
        throw new AssertionError(stringBuilder.toString());
    }

    @Nullable
    public static final SimpleType transformRuntimeFunctionTypeToSuspendFunction(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "funType");
        boolean isFunctionType = FunctionTypesKt.isFunctionType(kotlinType);
        if (!C15819j.f49018a || isFunctionType) {
            TypeProjection typeProjection = (TypeProjection) C19299w.m68834i(FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType));
            if (typeProjection != null) {
                KotlinType type = typeProjection.getType();
                if (type != null) {
                    ClassifierDescriptor declarationDescriptor = type.getConstructor().getDeclarationDescriptor();
                    if ((C2668g.a(declarationDescriptor != null ? DescriptorUtilsKt.getFqNameSafe(declarationDescriptor) : null, DescriptorUtils.CONTINUATION_INTERFACE_FQ_NAME) ^ 1) == 0) {
                        if (type.getArguments().size() == 1) {
                            KotlinType type2 = ((TypeProjection) C19299w.m68836j(type.getArguments())).getType();
                            KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(kotlinType);
                            Annotations annotations = kotlinType.getAnnotations();
                            KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
                            Iterable<TypeProjection> d = C19299w.m68824d(FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType), 1);
                            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) d, 10));
                            for (TypeProjection type3 : d) {
                                arrayList.add(type3.getType());
                            }
                            List list = (List) arrayList;
                            C2668g.a(type2, "suspendReturnType");
                            return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, list, null, type2, true).makeNullableAsSpecified(kotlinType.isMarkedNullable());
                        }
                    }
                    return null;
                }
            }
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This type should be function type: ");
        stringBuilder.append(kotlinType);
        throw new AssertionError(stringBuilder.toString());
    }
}
