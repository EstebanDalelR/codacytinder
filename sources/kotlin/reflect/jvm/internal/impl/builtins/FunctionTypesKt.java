package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15811g;
import kotlin.C15819j;
import kotlin.collections.C19299w;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.Companion;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FunctionTypesKt {
    public static final boolean isFunctionType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.getConstructor().getDeclarationDescriptor();
        return (kotlinType != null ? getFunctionalClassKind((DeclarationDescriptor) kotlinType) : null) == Kind.Function ? true : null;
    }

    public static final boolean isSuspendFunctionType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.getConstructor().getDeclarationDescriptor();
        return (kotlinType != null ? getFunctionalClassKind((DeclarationDescriptor) kotlinType) : null) == Kind.SuspendFunction ? true : null;
    }

    public static final boolean isBuiltinFunctionalType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.getConstructor().getDeclarationDescriptor();
        kotlinType = kotlinType != null ? getFunctionalClassKind((DeclarationDescriptor) kotlinType) : null;
        if (kotlinType != Kind.Function) {
            if (kotlinType != Kind.SuspendFunction) {
                return null;
            }
        }
        return true;
    }

    public static final boolean isBuiltinExtensionFunctionalType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        return (!isBuiltinFunctionalType(kotlinType) || isTypeAnnotatedWithExtensionFunctionType(kotlinType) == null) ? null : true;
    }

    private static final boolean isTypeAnnotatedWithExtensionFunctionType(@NotNull KotlinType kotlinType) {
        kotlinType = kotlinType.getAnnotations();
        FqName fqName = KotlinBuiltIns.FQ_NAMES.extensionFunctionType;
        C2668g.a(fqName, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
        return kotlinType.findAnnotation(fqName) != null ? true : null;
    }

    @Nullable
    public static final Kind getFunctionalClassKind(@NotNull DeclarationDescriptor declarationDescriptor) {
        C2668g.b(declarationDescriptor, "$receiver");
        if ((declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor)) {
            return getFunctionalClassKind(DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor));
        }
        return null;
    }

    private static final Kind getFunctionalClassKind(@NotNull FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe.isSafe()) {
            if (!fqNameUnsafe.isRoot()) {
                Companion companion = BuiltInFictitiousFunctionClassFactory.Companion;
                String asString = fqNameUnsafe.shortName().asString();
                C2668g.a(asString, "shortName().asString()");
                fqNameUnsafe = fqNameUnsafe.toSafe().parent();
                C2668g.a(fqNameUnsafe, "toSafe().parent()");
                return companion.getFunctionalClassKind(asString, fqNameUnsafe);
            }
        }
        return null;
    }

    @Nullable
    public static final KotlinType getReceiverTypeFromFunctionType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        boolean isBuiltinFunctionalType = isBuiltinFunctionalType(kotlinType);
        if (!C15819j.f49018a || isBuiltinFunctionalType) {
            return isTypeAnnotatedWithExtensionFunctionType(kotlinType) ? ((TypeProjection) C19299w.m68829f((List) kotlinType.getArguments())).getType() : null;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Not a function type: ");
            stringBuilder.append(kotlinType);
            throw new AssertionError(stringBuilder.toString());
        }
    }

    @NotNull
    public static final KotlinType getReturnTypeFromFunctionType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        boolean isBuiltinFunctionalType = isBuiltinFunctionalType(kotlinType);
        if (!C15819j.f49018a || isBuiltinFunctionalType) {
            kotlinType = ((TypeProjection) C19299w.m68832h((List) kotlinType.getArguments())).getType();
            C2668g.a(kotlinType, "arguments.last().type");
            return kotlinType;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a function type: ");
        stringBuilder.append(kotlinType);
        throw new AssertionError(stringBuilder.toString());
    }

    @NotNull
    public static final List<TypeProjection> getValueParameterTypesFromFunctionType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        boolean isBuiltinFunctionalType = isBuiltinFunctionalType(kotlinType);
        if (!C15819j.f49018a || isBuiltinFunctionalType) {
            List arguments = kotlinType.getArguments();
            boolean isBuiltinExtensionFunctionalType = isBuiltinExtensionFunctionalType(kotlinType);
            int i = 1;
            boolean size = arguments.size() - 1;
            if (isBuiltinExtensionFunctionalType > size) {
                i = 0;
            }
            if (!C15819j.f49018a || r3 != 0) {
                return arguments.subList(isBuiltinExtensionFunctionalType, size);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Not an exact function type: ");
            stringBuilder.append(kotlinType);
            throw new AssertionError(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Not a function type: ");
        stringBuilder.append(kotlinType);
        throw new AssertionError(stringBuilder.toString());
    }

    @Nullable
    public static final Name extractParameterNameFromFunctionTypeArgument(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.getAnnotations();
        FqName fqName = KotlinBuiltIns.FQ_NAMES.parameterName;
        C2668g.a(fqName, "KotlinBuiltIns.FQ_NAMES.parameterName");
        kotlinType = kotlinType.findAnnotation(fqName);
        if (kotlinType == null) {
            return null;
        }
        kotlinType = C19299w.m68830g((Iterable) kotlinType.getAllValueArguments().values());
        if (!(kotlinType instanceof StringValue)) {
            kotlinType = null;
        }
        StringValue stringValue = (StringValue) kotlinType;
        if (stringValue != null) {
            kotlinType = (String) stringValue.getValue();
            if (kotlinType != null) {
                if (!Name.isValidIdentifier(kotlinType)) {
                    kotlinType = null;
                }
                if (kotlinType != null) {
                    return Name.identifier(kotlinType);
                }
            }
        }
        return null;
    }

    @NotNull
    public static final List<TypeProjection> getFunctionTypeArgumentProjections(@Nullable KotlinType kotlinType, @NotNull List<? extends KotlinType> list, @Nullable List<Name> list2, @NotNull KotlinType kotlinType2, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        C2668g.b(list, "parameterTypes");
        C2668g.b(kotlinType2, "returnType");
        C2668g.b(kotlinBuiltIns, "builtIns");
        int i = 0;
        ArrayList arrayList = new ArrayList((list.size() + (kotlinType != null ? 1 : 0)) + 1);
        Collection collection = arrayList;
        CollectionsKt.addIfNotNull(collection, kotlinType != null ? TypeUtilsKt.asTypeProjection(kotlinType) : null);
        kotlinType = list.iterator();
        while (kotlinType.hasNext() != null) {
            Name name;
            int i2 = i + 1;
            list = (KotlinType) kotlinType.next();
            if (list2 != null) {
                name = (Name) list2.get(i);
                if (!(name == null || name.isSpecial())) {
                    if (name != null) {
                        FqName fqName = KotlinBuiltIns.FQ_NAMES.parameterName;
                        C2668g.a(fqName, "KotlinBuiltIns.FQ_NAMES.parameterName");
                        Name identifier = Name.identifier("name");
                        String asString = name.asString();
                        C2668g.a(asString, "name.asString()");
                        list = TypeUtilsKt.replaceAnnotations(list, new AnnotationsImpl(C19299w.m68821d((Iterable) list.getAnnotations(), (Object) new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, ag.m64174a(C15811g.m59834a(identifier, new StringValue(asString)))))));
                    }
                    collection.add(TypeUtilsKt.asTypeProjection(list));
                    i = i2;
                }
            }
            name = null;
            if (name != null) {
                FqName fqName2 = KotlinBuiltIns.FQ_NAMES.parameterName;
                C2668g.a(fqName2, "KotlinBuiltIns.FQ_NAMES.parameterName");
                Name identifier2 = Name.identifier("name");
                String asString2 = name.asString();
                C2668g.a(asString2, "name.asString()");
                list = TypeUtilsKt.replaceAnnotations(list, new AnnotationsImpl(C19299w.m68821d((Iterable) list.getAnnotations(), (Object) new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName2, ag.m64174a(C15811g.m59834a(identifier2, new StringValue(asString2)))))));
            }
            collection.add(TypeUtilsKt.asTypeProjection(list));
            i = i2;
        }
        arrayList.add(TypeUtilsKt.asTypeProjection(kotlinType2));
        return arrayList;
    }

    @NotNull
    @JvmOverloads
    public static /* synthetic */ SimpleType createFunctionType$default(KotlinBuiltIns kotlinBuiltIns, Annotations annotations, KotlinType kotlinType, List list, List list2, KotlinType kotlinType2, boolean z, int i, Object obj) {
        return createFunctionType(kotlinBuiltIns, annotations, kotlinType, list, list2, kotlinType2, (i & 64) != 0 ? false : z);
    }

    @NotNull
    @JvmOverloads
    public static final SimpleType createFunctionType(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull Annotations annotations, @Nullable KotlinType kotlinType, @NotNull List<? extends KotlinType> list, @Nullable List<Name> list2, @NotNull KotlinType kotlinType2, boolean z) {
        C2668g.b(kotlinBuiltIns, "builtIns");
        C2668g.b(annotations, "annotations");
        C2668g.b(list, "parameterTypes");
        C2668g.b(kotlinType2, "returnType");
        list2 = getFunctionTypeArgumentProjections(kotlinType, list, list2, kotlinType2, kotlinBuiltIns);
        list = list.size();
        if (kotlinType != null) {
            list++;
        }
        list = z ? kotlinBuiltIns.getSuspendFunction(list) : kotlinBuiltIns.getFunction(list);
        if (kotlinType != null) {
            kotlinType = KotlinBuiltIns.FQ_NAMES.extensionFunctionType;
            C2668g.a(kotlinType, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
            if (annotations.findAnnotation(kotlinType) == null) {
                Iterable iterable = annotations;
                z = KotlinBuiltIns.FQ_NAMES.extensionFunctionType;
                C2668g.a(z, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
                annotations = (Annotations) new AnnotationsImpl(C19299w.m68821d(iterable, (Object) new BuiltInAnnotationDescriptor(kotlinBuiltIns, z, ah.m66884a())));
            }
        }
        C2668g.a(list, "classDescriptor");
        return KotlinTypeFactory.simpleNotNullType(annotations, list, list2);
    }
}
