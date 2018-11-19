package kotlin.reflect.jvm.internal.impl.types.checker;

import com.facebook.ads.AdError;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C15819j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C15807n;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19291t;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SeveralSupertypesWithSameConstructorPolicy;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SupertypesPolicy;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SupertypesPolicy.LowerIfFlexible;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SupertypesPolicy.LowerIfFlexibleWithCustomSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SupertypesPolicy.None;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NewKotlinTypeChecker implements KotlinTypeChecker {
    public static final NewKotlinTypeChecker INSTANCE = new NewKotlinTypeChecker();

    private NewKotlinTypeChecker() {
    }

    public boolean isSubtypeOf(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        C2668g.b(kotlinType, "subtype");
        C2668g.b(kotlinType2, "supertype");
        return isSubtypeOf(new TypeCheckerContext(true, false, 2, null), kotlinType.unwrap(), kotlinType2.unwrap());
    }

    public boolean equalTypes(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        C2668g.b(kotlinType, "a");
        C2668g.b(kotlinType2, "b");
        return equalTypes(new TypeCheckerContext(false, false, 2, null), kotlinType.unwrap(), kotlinType2.unwrap());
    }

    public final boolean equalTypes(@NotNull TypeCheckerContext typeCheckerContext, @NotNull UnwrappedType unwrappedType, @NotNull UnwrappedType unwrappedType2) {
        C2668g.b(typeCheckerContext, "$receiver");
        C2668g.b(unwrappedType, "a");
        C2668g.b(unwrappedType2, "b");
        boolean z = true;
        if (unwrappedType == unwrappedType2) {
            return true;
        }
        KotlinType kotlinType = unwrappedType;
        if (isCommonDenotableType(kotlinType)) {
            KotlinType kotlinType2 = unwrappedType2;
            if (isCommonDenotableType(kotlinType2)) {
                if (!typeCheckerContext.areEqualTypeConstructors(unwrappedType.getConstructor(), unwrappedType2.getConstructor())) {
                    return false;
                }
                if (unwrappedType.getArguments().isEmpty()) {
                    if (hasFlexibleNullability(kotlinType) == null) {
                        if (hasFlexibleNullability(kotlinType2) == null) {
                            if (unwrappedType.isMarkedNullable() != unwrappedType2.isMarkedNullable()) {
                                z = false;
                            }
                            return z;
                        }
                    }
                    return true;
                }
            }
        }
        if (!isSubtypeOf(typeCheckerContext, unwrappedType, unwrappedType2) || isSubtypeOf(typeCheckerContext, unwrappedType2, unwrappedType) == null) {
            z = false;
        }
        return z;
    }

    private final boolean hasFlexibleNullability(@NotNull KotlinType kotlinType) {
        return FlexibleTypesKt.lowerIfFlexible(kotlinType).isMarkedNullable() != FlexibleTypesKt.upperIfFlexible(kotlinType).isMarkedNullable() ? true : null;
    }

    private final boolean isCommonDenotableType(KotlinType kotlinType) {
        return (!kotlinType.getConstructor().isDenotable() || DynamicTypesKt.isDynamic(kotlinType) || SpecialTypesKt.isDefinitelyNotNullType(kotlinType) || C2668g.a(FlexibleTypesKt.lowerIfFlexible(kotlinType).getConstructor(), FlexibleTypesKt.upperIfFlexible(kotlinType).getConstructor()) == null) ? null : true;
    }

    public final boolean isSubtypeOf(@NotNull TypeCheckerContext typeCheckerContext, @NotNull UnwrappedType unwrappedType, @NotNull UnwrappedType unwrappedType2) {
        C2668g.b(typeCheckerContext, "$receiver");
        C2668g.b(unwrappedType, "subType");
        C2668g.b(unwrappedType2, "superType");
        if (unwrappedType == unwrappedType2) {
            return true;
        }
        unwrappedType = transformToNewType(unwrappedType);
        unwrappedType2 = transformToNewType(unwrappedType2);
        KotlinType kotlinType = unwrappedType;
        KotlinType kotlinType2 = unwrappedType2;
        Boolean checkSubtypeForSpecialCases = checkSubtypeForSpecialCases(typeCheckerContext, FlexibleTypesKt.lowerIfFlexible(kotlinType), FlexibleTypesKt.upperIfFlexible(kotlinType2));
        if (checkSubtypeForSpecialCases != null) {
            boolean booleanValue = checkSubtypeForSpecialCases.booleanValue();
            typeCheckerContext.addSubtypeConstraint(unwrappedType, unwrappedType2);
            return booleanValue;
        }
        unwrappedType = typeCheckerContext.addSubtypeConstraint(unwrappedType, unwrappedType2);
        if (unwrappedType != null) {
            return unwrappedType.booleanValue();
        }
        return isSubtypeOfForSingleClassifierType(typeCheckerContext, FlexibleTypesKt.lowerIfFlexible(kotlinType), FlexibleTypesKt.upperIfFlexible(kotlinType2));
    }

    @NotNull
    public final SimpleType transformToNewType(@NotNull SimpleType simpleType) {
        C2668g.b(simpleType, "type");
        TypeConstructor constructor = simpleType.getConstructor();
        boolean z = false;
        if (constructor instanceof CapturedTypeConstructor) {
            CapturedTypeConstructor capturedTypeConstructor = (CapturedTypeConstructor) constructor;
            TypeProjection typeProjection = capturedTypeConstructor.getTypeProjection();
            if (typeProjection.getProjectionKind() == Variance.IN_VARIANCE) {
                z = true;
            }
            UnwrappedType unwrappedType = null;
            if (!z) {
                typeProjection = null;
            }
            if (typeProjection != null) {
                KotlinType type = typeProjection.getType();
                if (type != null) {
                    unwrappedType = type.unwrap();
                }
            }
            UnwrappedType unwrappedType2 = unwrappedType;
            if (capturedTypeConstructor.getNewTypeConstructor() == null) {
                typeProjection = capturedTypeConstructor.getTypeProjection();
                Iterable<KotlinType> supertypes = capturedTypeConstructor.getSupertypes();
                Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) supertypes, 10));
                for (KotlinType unwrap : supertypes) {
                    arrayList.add(unwrap.unwrap());
                }
                capturedTypeConstructor.setNewTypeConstructor(new NewCapturedTypeConstructor(typeProjection, (List) arrayList));
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            NewCapturedTypeConstructor newTypeConstructor = capturedTypeConstructor.getNewTypeConstructor();
            if (newTypeConstructor == null) {
                C2668g.a();
            }
            return new NewCapturedType(captureStatus, newTypeConstructor, unwrappedType2, simpleType.getAnnotations(), simpleType.isMarkedNullable());
        } else if (constructor instanceof IntegerValueTypeConstructor) {
            r0 = ((IntegerValueTypeConstructor) constructor).getSupertypes();
            r1 = new ArrayList(C18457p.m66906a((Iterable) r0, 10));
            for (KotlinType makeNullableAsSpecified : r0) {
                r1.add(TypeUtils.makeNullableAsSpecified(makeNullableAsSpecified, simpleType.isMarkedNullable()));
            }
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(simpleType.getAnnotations(), new IntersectionTypeConstructor((List) r1), C17554o.m64195a(), false, simpleType.getMemberScope());
        } else if (!(constructor instanceof IntersectionTypeConstructor) || !simpleType.isMarkedNullable()) {
            return simpleType;
        } else {
            Collection supertypes2 = ((IntersectionTypeConstructor) constructor).getSupertypes();
            C2668g.a(supertypes2, "constructor.supertypes");
            r0 = supertypes2;
            r1 = new ArrayList(C18457p.m66906a((Iterable) r0, 10));
            for (KotlinType makeNullableAsSpecified2 : r0) {
                C2668g.a(makeNullableAsSpecified2, "it");
                r1.add(TypeUtilsKt.makeNullable(makeNullableAsSpecified2));
            }
            IntersectionTypeConstructor intersectionTypeConstructor = new IntersectionTypeConstructor((List) r1);
            simpleType = simpleType.getAnnotations();
            TypeConstructor typeConstructor = intersectionTypeConstructor;
            List a = C17554o.m64195a();
            MemberScope createScopeForKotlinType = intersectionTypeConstructor.createScopeForKotlinType();
            C2668g.a(createScopeForKotlinType, "newConstructor.createScopeForKotlinType()");
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(simpleType, typeConstructor, a, false, createScopeForKotlinType);
        }
    }

    @NotNull
    public final UnwrappedType transformToNewType(@NotNull UnwrappedType unwrappedType) {
        UnwrappedType transformToNewType;
        C2668g.b(unwrappedType, "type");
        if (unwrappedType instanceof SimpleType) {
            transformToNewType = transformToNewType((SimpleType) unwrappedType);
        } else if (unwrappedType instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedType;
            SimpleType transformToNewType2 = transformToNewType(flexibleType.getLowerBound());
            SimpleType transformToNewType3 = transformToNewType(flexibleType.getUpperBound());
            if (transformToNewType2 == flexibleType.getLowerBound()) {
                if (transformToNewType3 == flexibleType.getUpperBound()) {
                    transformToNewType = unwrappedType;
                }
            }
            transformToNewType = KotlinTypeFactory.flexibleType(transformToNewType2, transformToNewType3);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return TypeWithEnhancementKt.inheritEnhancement(transformToNewType, unwrappedType);
    }

    private final Boolean checkSubtypeForSpecialCases(@NotNull TypeCheckerContext typeCheckerContext, SimpleType simpleType, SimpleType simpleType2) {
        boolean z = true;
        if (!KotlinTypeKt.isError(simpleType)) {
            if (!KotlinTypeKt.isError(simpleType2)) {
                if (simpleType2 instanceof NewCapturedType) {
                    NewCapturedType newCapturedType = (NewCapturedType) simpleType2;
                    if (newCapturedType.getLowerType() != null) {
                        switch (typeCheckerContext.getLowerCapturedTypePolicy(simpleType, newCapturedType)) {
                            case CHECK_ONLY_LOWER:
                                return Boolean.valueOf(isSubtypeOf(typeCheckerContext, simpleType, newCapturedType.getLowerType()));
                            case CHECK_SUBTYPE_AND_LOWER:
                                if (isSubtypeOf(typeCheckerContext, simpleType, newCapturedType.getLowerType())) {
                                    return Boolean.valueOf(true);
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
                TypeConstructor constructor = simpleType2.getConstructor();
                if (!(constructor instanceof IntersectionTypeConstructor)) {
                    constructor = null;
                }
                IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) constructor;
                if (intersectionTypeConstructor == null) {
                    return null;
                }
                int isMarkedNullable = simpleType2.isMarkedNullable() ^ 1;
                if (C15819j.f49018a && isMarkedNullable == 0) {
                    typeCheckerContext = new StringBuilder();
                    typeCheckerContext.append("Intersection type should not be marked nullable!: ");
                    typeCheckerContext.append(simpleType2);
                    throw ((Throwable) new AssertionError(typeCheckerContext.toString()));
                }
                simpleType2 = intersectionTypeConstructor.getSupertypes();
                C2668g.a(simpleType2, "it.supertypes");
                Iterable<KotlinType> iterable = (Iterable) simpleType2;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (KotlinType unwrap : iterable) {
                        if (!INSTANCE.isSubtypeOf(typeCheckerContext, simpleType, unwrap.unwrap())) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }
        if (typeCheckerContext.getErrorTypeEqualsToAnything() != null) {
            return Boolean.valueOf(true);
        }
        if (simpleType.isMarkedNullable() == null || simpleType2.isMarkedNullable() != null) {
            return Boolean.valueOf(StrictEqualityTypeChecker.INSTANCE.strictEqualTypes(simpleType.makeNullableAsSpecified(false), simpleType2.makeNullableAsSpecified(false)));
        }
        return Boolean.valueOf(false);
    }

    private final boolean isSubtypeOfForSingleClassifierType(@NotNull TypeCheckerContext typeCheckerContext, SimpleType simpleType, SimpleType simpleType2) {
        Object obj;
        StringBuilder stringBuilder;
        TypeConstructor constructor;
        List findCorrespondingSupertypes;
        Iterable<SimpleType> iterable;
        Object obj2;
        List parameters;
        Iterable<TypeParameterDescriptor> iterable2;
        Collection arrayList;
        int i;
        int i2;
        Iterable<SimpleType> iterable3;
        Collection arrayList2;
        TypeProjection typeProjection;
        KotlinType type;
        UnwrappedType unwrap;
        NewKotlinTypeChecker newKotlinTypeChecker = this;
        TypeCheckerContext typeCheckerContext2 = typeCheckerContext;
        SimpleType simpleType3 = simpleType;
        SimpleType simpleType4 = simpleType2;
        if (!(NewKotlinTypeCheckerKt.isSingleClassifierType(simpleType) || NewKotlinTypeCheckerKt.isIntersectionType(simpleType))) {
            if (!typeCheckerContext2.isAllowedTypeVariable(simpleType3)) {
                obj = null;
                if (C15819j.f49018a || r4 != null) {
                    if (!NewKotlinTypeCheckerKt.isSingleClassifierType(simpleType2)) {
                        if (typeCheckerContext2.isAllowedTypeVariable(simpleType4)) {
                            obj = null;
                            if (!C15819j.f49018a && r4 == null) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Not singleClassifierType superType: ");
                                stringBuilder.append(simpleType4);
                                throw new AssertionError(stringBuilder.toString());
                            } else if (NullabilityChecker.INSTANCE.isPossibleSubtype(typeCheckerContext2, simpleType3, simpleType4)) {
                                return false;
                            } else {
                                constructor = simpleType2.getConstructor();
                                if ((!C2668g.a(simpleType.getConstructor(), constructor) && constructor.getParameters().isEmpty()) || TypeUtilsKt.isAnyOrNullableAny(simpleType4)) {
                                    return true;
                                }
                                findCorrespondingSupertypes = findCorrespondingSupertypes(typeCheckerContext2, simpleType3, constructor);
                                switch (findCorrespondingSupertypes.size()) {
                                    case 0:
                                        return hasNothingSupertype(typeCheckerContext, simpleType);
                                    case 1:
                                        return isSubtypeForSameConstructor(typeCheckerContext2, ((SimpleType) C19299w.m68829f(findCorrespondingSupertypes)).getArguments(), simpleType4);
                                    default:
                                        switch (typeCheckerContext.getSameConstructorPolicy()) {
                                            case FORCE_NOT_SUBTYPE:
                                                return false;
                                            case TAKE_FIRST_FOR_SUBTYPING:
                                                return isSubtypeForSameConstructor(typeCheckerContext2, ((SimpleType) C19299w.m68829f(findCorrespondingSupertypes)).getArguments(), simpleType4);
                                            case CHECK_ANY_OF_THEM:
                                            case INTERSECT_ARGUMENTS_AND_CHECK_AGAIN:
                                                iterable = findCorrespondingSupertypes;
                                                if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                                                    for (SimpleType arguments : iterable) {
                                                        if (INSTANCE.isSubtypeForSameConstructor(typeCheckerContext2, arguments.getArguments(), simpleType4)) {
                                                            obj2 = 1;
                                                            if (obj2 != null) {
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                                obj2 = null;
                                                if (obj2 != null) {
                                                    return true;
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                        if (typeCheckerContext.getSameConstructorPolicy() == SeveralSupertypesWithSameConstructorPolicy.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN) {
                                            return false;
                                        }
                                        parameters = constructor.getParameters();
                                        C2668g.a(parameters, "superConstructor.parameters");
                                        iterable2 = parameters;
                                        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
                                        i = 0;
                                        for (TypeParameterDescriptor typeParameterDescriptor : iterable2) {
                                            i2 = i + 1;
                                            iterable3 = findCorrespondingSupertypes;
                                            arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable3, 10));
                                            for (SimpleType simpleType5 : iterable3) {
                                                typeProjection = (TypeProjection) C19299w.m68813c(simpleType5.getArguments(), i);
                                                if (typeProjection == null) {
                                                    if ((typeProjection.getProjectionKind() != Variance.INVARIANT ? 1 : null) == null) {
                                                        typeProjection = null;
                                                    }
                                                    if (typeProjection == null) {
                                                        type = typeProjection.getType();
                                                        if (type == null) {
                                                            unwrap = type.unwrap();
                                                            if (unwrap == null) {
                                                                arrayList2.add(unwrap);
                                                            }
                                                        }
                                                    }
                                                }
                                                stringBuilder = new StringBuilder();
                                                stringBuilder.append("Incorrect type: ");
                                                stringBuilder.append(simpleType5);
                                                stringBuilder.append(", subType: ");
                                                stringBuilder.append(simpleType3);
                                                stringBuilder.append(", superType: ");
                                                stringBuilder.append(simpleType4);
                                                throw new IllegalStateException(stringBuilder.toString().toString());
                                            }
                                            arrayList.add(TypeUtilsKt.asTypeProjection(IntersectionTypeKt.intersectTypes((List) arrayList2)));
                                            i = i2;
                                        }
                                        return isSubtypeForSameConstructor(typeCheckerContext2, (List) arrayList, simpleType4);
                                }
                            }
                        }
                    }
                    obj = 1;
                    if (!C15819j.f49018a) {
                    }
                    if (NullabilityChecker.INSTANCE.isPossibleSubtype(typeCheckerContext2, simpleType3, simpleType4)) {
                        return false;
                    }
                    constructor = simpleType2.getConstructor();
                    if (!C2668g.a(simpleType.getConstructor(), constructor)) {
                    }
                    findCorrespondingSupertypes = findCorrespondingSupertypes(typeCheckerContext2, simpleType3, constructor);
                    switch (findCorrespondingSupertypes.size()) {
                        case 0:
                            return hasNothingSupertype(typeCheckerContext, simpleType);
                        case 1:
                            return isSubtypeForSameConstructor(typeCheckerContext2, ((SimpleType) C19299w.m68829f(findCorrespondingSupertypes)).getArguments(), simpleType4);
                        default:
                            switch (typeCheckerContext.getSameConstructorPolicy()) {
                                case FORCE_NOT_SUBTYPE:
                                    return false;
                                case TAKE_FIRST_FOR_SUBTYPING:
                                    return isSubtypeForSameConstructor(typeCheckerContext2, ((SimpleType) C19299w.m68829f(findCorrespondingSupertypes)).getArguments(), simpleType4);
                                case CHECK_ANY_OF_THEM:
                                case INTERSECT_ARGUMENTS_AND_CHECK_AGAIN:
                                    iterable = findCorrespondingSupertypes;
                                    while (r8.hasNext()) {
                                        if (INSTANCE.isSubtypeForSameConstructor(typeCheckerContext2, arguments.getArguments(), simpleType4)) {
                                            obj2 = 1;
                                            if (obj2 != null) {
                                                return true;
                                            }
                                        }
                                    }
                                    obj2 = null;
                                    if (obj2 != null) {
                                        return true;
                                    }
                                    break;
                                default:
                                    break;
                            }
                            if (typeCheckerContext.getSameConstructorPolicy() == SeveralSupertypesWithSameConstructorPolicy.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN) {
                                return false;
                            }
                            parameters = constructor.getParameters();
                            C2668g.a(parameters, "superConstructor.parameters");
                            iterable2 = parameters;
                            arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
                            i = 0;
                            for (TypeParameterDescriptor typeParameterDescriptor2 : iterable2) {
                                i2 = i + 1;
                                iterable3 = findCorrespondingSupertypes;
                                arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable3, 10));
                                for (SimpleType simpleType52 : iterable3) {
                                    typeProjection = (TypeProjection) C19299w.m68813c(simpleType52.getArguments(), i);
                                    if (typeProjection == null) {
                                        if (typeProjection.getProjectionKind() != Variance.INVARIANT) {
                                        }
                                        if ((typeProjection.getProjectionKind() != Variance.INVARIANT ? 1 : null) == null) {
                                            typeProjection = null;
                                        }
                                        if (typeProjection == null) {
                                            type = typeProjection.getType();
                                            if (type == null) {
                                                unwrap = type.unwrap();
                                                if (unwrap == null) {
                                                    arrayList2.add(unwrap);
                                                }
                                            }
                                        }
                                    }
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Incorrect type: ");
                                    stringBuilder.append(simpleType52);
                                    stringBuilder.append(", subType: ");
                                    stringBuilder.append(simpleType3);
                                    stringBuilder.append(", superType: ");
                                    stringBuilder.append(simpleType4);
                                    throw new IllegalStateException(stringBuilder.toString().toString());
                                }
                                arrayList.add(TypeUtilsKt.asTypeProjection(IntersectionTypeKt.intersectTypes((List) arrayList2)));
                                i = i2;
                            }
                            return isSubtypeForSameConstructor(typeCheckerContext2, (List) arrayList, simpleType4);
                    }
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Not singleClassifierType and not intersection subType: ");
                stringBuilder.append(simpleType3);
                throw new AssertionError(stringBuilder.toString());
            }
        }
        obj = 1;
        if (C15819j.f49018a) {
        }
        if (NewKotlinTypeCheckerKt.isSingleClassifierType(simpleType2)) {
            if (typeCheckerContext2.isAllowedTypeVariable(simpleType4)) {
                obj = null;
                if (!C15819j.f49018a) {
                }
                if (NullabilityChecker.INSTANCE.isPossibleSubtype(typeCheckerContext2, simpleType3, simpleType4)) {
                    return false;
                }
                constructor = simpleType2.getConstructor();
                if (!C2668g.a(simpleType.getConstructor(), constructor)) {
                }
                findCorrespondingSupertypes = findCorrespondingSupertypes(typeCheckerContext2, simpleType3, constructor);
                switch (findCorrespondingSupertypes.size()) {
                    case 0:
                        return hasNothingSupertype(typeCheckerContext, simpleType);
                    case 1:
                        return isSubtypeForSameConstructor(typeCheckerContext2, ((SimpleType) C19299w.m68829f(findCorrespondingSupertypes)).getArguments(), simpleType4);
                    default:
                        switch (typeCheckerContext.getSameConstructorPolicy()) {
                            case FORCE_NOT_SUBTYPE:
                                return false;
                            case TAKE_FIRST_FOR_SUBTYPING:
                                return isSubtypeForSameConstructor(typeCheckerContext2, ((SimpleType) C19299w.m68829f(findCorrespondingSupertypes)).getArguments(), simpleType4);
                            case CHECK_ANY_OF_THEM:
                            case INTERSECT_ARGUMENTS_AND_CHECK_AGAIN:
                                iterable = findCorrespondingSupertypes;
                                while (r8.hasNext()) {
                                    if (INSTANCE.isSubtypeForSameConstructor(typeCheckerContext2, arguments.getArguments(), simpleType4)) {
                                        obj2 = 1;
                                        if (obj2 != null) {
                                            return true;
                                        }
                                    }
                                }
                                obj2 = null;
                                if (obj2 != null) {
                                    return true;
                                }
                                break;
                            default:
                                break;
                        }
                        if (typeCheckerContext.getSameConstructorPolicy() == SeveralSupertypesWithSameConstructorPolicy.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN) {
                            return false;
                        }
                        parameters = constructor.getParameters();
                        C2668g.a(parameters, "superConstructor.parameters");
                        iterable2 = parameters;
                        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
                        i = 0;
                        for (TypeParameterDescriptor typeParameterDescriptor22 : iterable2) {
                            i2 = i + 1;
                            iterable3 = findCorrespondingSupertypes;
                            arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable3, 10));
                            for (SimpleType simpleType522 : iterable3) {
                                typeProjection = (TypeProjection) C19299w.m68813c(simpleType522.getArguments(), i);
                                if (typeProjection == null) {
                                    if (typeProjection.getProjectionKind() != Variance.INVARIANT) {
                                    }
                                    if ((typeProjection.getProjectionKind() != Variance.INVARIANT ? 1 : null) == null) {
                                        typeProjection = null;
                                    }
                                    if (typeProjection == null) {
                                        type = typeProjection.getType();
                                        if (type == null) {
                                            unwrap = type.unwrap();
                                            if (unwrap == null) {
                                                arrayList2.add(unwrap);
                                            }
                                        }
                                    }
                                }
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Incorrect type: ");
                                stringBuilder.append(simpleType522);
                                stringBuilder.append(", subType: ");
                                stringBuilder.append(simpleType3);
                                stringBuilder.append(", superType: ");
                                stringBuilder.append(simpleType4);
                                throw new IllegalStateException(stringBuilder.toString().toString());
                            }
                            arrayList.add(TypeUtilsKt.asTypeProjection(IntersectionTypeKt.intersectTypes((List) arrayList2)));
                            i = i2;
                        }
                        return isSubtypeForSameConstructor(typeCheckerContext2, (List) arrayList, simpleType4);
                }
            }
        }
        obj = 1;
        if (!C15819j.f49018a) {
        }
        if (NullabilityChecker.INSTANCE.isPossibleSubtype(typeCheckerContext2, simpleType3, simpleType4)) {
            return false;
        }
        constructor = simpleType2.getConstructor();
        if (!C2668g.a(simpleType.getConstructor(), constructor)) {
        }
        findCorrespondingSupertypes = findCorrespondingSupertypes(typeCheckerContext2, simpleType3, constructor);
        switch (findCorrespondingSupertypes.size()) {
            case 0:
                return hasNothingSupertype(typeCheckerContext, simpleType);
            case 1:
                return isSubtypeForSameConstructor(typeCheckerContext2, ((SimpleType) C19299w.m68829f(findCorrespondingSupertypes)).getArguments(), simpleType4);
            default:
                switch (typeCheckerContext.getSameConstructorPolicy()) {
                    case FORCE_NOT_SUBTYPE:
                        return false;
                    case TAKE_FIRST_FOR_SUBTYPING:
                        return isSubtypeForSameConstructor(typeCheckerContext2, ((SimpleType) C19299w.m68829f(findCorrespondingSupertypes)).getArguments(), simpleType4);
                    case CHECK_ANY_OF_THEM:
                    case INTERSECT_ARGUMENTS_AND_CHECK_AGAIN:
                        iterable = findCorrespondingSupertypes;
                        while (r8.hasNext()) {
                            if (INSTANCE.isSubtypeForSameConstructor(typeCheckerContext2, arguments.getArguments(), simpleType4)) {
                                obj2 = 1;
                                if (obj2 != null) {
                                    return true;
                                }
                            }
                        }
                        obj2 = null;
                        if (obj2 != null) {
                            return true;
                        }
                        break;
                    default:
                        break;
                }
                if (typeCheckerContext.getSameConstructorPolicy() == SeveralSupertypesWithSameConstructorPolicy.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN) {
                    return false;
                }
                parameters = constructor.getParameters();
                C2668g.a(parameters, "superConstructor.parameters");
                iterable2 = parameters;
                arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
                i = 0;
                for (TypeParameterDescriptor typeParameterDescriptor222 : iterable2) {
                    i2 = i + 1;
                    iterable3 = findCorrespondingSupertypes;
                    arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable3, 10));
                    for (SimpleType simpleType5222 : iterable3) {
                        typeProjection = (TypeProjection) C19299w.m68813c(simpleType5222.getArguments(), i);
                        if (typeProjection == null) {
                            if (typeProjection.getProjectionKind() != Variance.INVARIANT) {
                            }
                            if ((typeProjection.getProjectionKind() != Variance.INVARIANT ? 1 : null) == null) {
                                typeProjection = null;
                            }
                            if (typeProjection == null) {
                                type = typeProjection.getType();
                                if (type == null) {
                                    unwrap = type.unwrap();
                                    if (unwrap == null) {
                                        arrayList2.add(unwrap);
                                    }
                                }
                            }
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Incorrect type: ");
                        stringBuilder.append(simpleType5222);
                        stringBuilder.append(", subType: ");
                        stringBuilder.append(simpleType3);
                        stringBuilder.append(", superType: ");
                        stringBuilder.append(simpleType4);
                        throw new IllegalStateException(stringBuilder.toString().toString());
                    }
                    arrayList.add(TypeUtilsKt.asTypeProjection(IntersectionTypeKt.intersectTypes((List) arrayList2)));
                    i = i2;
                }
                return isSubtypeForSameConstructor(typeCheckerContext2, (List) arrayList, simpleType4);
        }
    }

    private final List<SimpleType> collectAndFilter(@NotNull TypeCheckerContext typeCheckerContext, SimpleType simpleType, TypeConstructor typeConstructor) {
        return selectOnlyPureKotlinSupertypes(collectAllSupertypesWithGivenTypeConstructor(typeCheckerContext, simpleType, typeConstructor));
    }

    @NotNull
    public final List<SimpleType> findCorrespondingSupertypes(@NotNull TypeCheckerContext typeCheckerContext, @NotNull SimpleType simpleType, @NotNull TypeConstructor typeConstructor) {
        C2668g.b(typeCheckerContext, "$receiver");
        C2668g.b(simpleType, "baseType");
        C2668g.b(typeConstructor, "constructor");
        if (NewKotlinTypeCheckerKt.isClassType(simpleType)) {
            return collectAndFilter(typeCheckerContext, simpleType, typeConstructor);
        }
        if (!(typeConstructor.getDeclarationDescriptor() instanceof ClassDescriptor)) {
            return collectAllSupertypesWithGivenTypeConstructor(typeCheckerContext, simpleType, typeConstructor);
        }
        SmartList<SimpleType> smartList = new SmartList();
        typeCheckerContext.initialize();
        ArrayDeque access$getSupertypesDeque$p = typeCheckerContext.supertypesDeque;
        if (access$getSupertypesDeque$p == null) {
            C2668g.a();
        }
        Set access$getSupertypesSet$p = typeCheckerContext.supertypesSet;
        if (access$getSupertypesSet$p == null) {
            C2668g.a();
        }
        access$getSupertypesDeque$p.push(simpleType);
        while ((access$getSupertypesDeque$p.isEmpty() ^ 1) != 0) {
            if (access$getSupertypesSet$p.size() > AdError.NETWORK_ERROR_CODE) {
                typeCheckerContext = new StringBuilder();
                typeCheckerContext.append("Too many supertypes for type: ");
                typeCheckerContext.append(simpleType);
                typeCheckerContext.append(". Supertypes = ");
                typeCheckerContext.append(C19299w.m68797a(access$getSupertypesSet$p, null, null, null, 0, null, null, 63, null));
                throw ((Throwable) new IllegalStateException(typeCheckerContext.toString().toString()));
            }
            SimpleType simpleType2 = (SimpleType) access$getSupertypesDeque$p.pop();
            C2668g.a(simpleType2, "current");
            if (access$getSupertypesSet$p.add(simpleType2)) {
                SupertypesPolicy supertypesPolicy;
                if (NewKotlinTypeCheckerKt.isClassType(simpleType2)) {
                    smartList.add(simpleType2);
                    supertypesPolicy = None.INSTANCE;
                } else {
                    supertypesPolicy = LowerIfFlexible.INSTANCE;
                }
                if ((C2668g.a(supertypesPolicy, None.INSTANCE) ^ 1) == 0) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy != null) {
                    for (KotlinType kotlinType : simpleType2.getConstructor().getSupertypes()) {
                        C2668g.a(kotlinType, "supertype");
                        access$getSupertypesDeque$p.add(supertypesPolicy.transformType(kotlinType));
                    }
                }
            }
        }
        typeCheckerContext.clear();
        Collection collection = (Collection) new ArrayList();
        for (SimpleType simpleType3 : smartList) {
            NewKotlinTypeChecker newKotlinTypeChecker = INSTANCE;
            C2668g.a(simpleType3, "it");
            C19291t.m68635a(collection, (Iterable) newKotlinTypeChecker.collectAndFilter(typeCheckerContext, simpleType3, typeConstructor));
        }
        return (List) collection;
    }

    private final List<SimpleType> collectAllSupertypesWithGivenTypeConstructor(@NotNull TypeCheckerContext typeCheckerContext, SimpleType simpleType, TypeConstructor typeConstructor) {
        TypeCheckerContext typeCheckerContext2 = typeCheckerContext;
        SimpleType simpleType2 = simpleType;
        TypeConstructor typeConstructor2 = typeConstructor;
        ClassifierDescriptor declarationDescriptor = typeConstructor.getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof ClassDescriptor)) {
            declarationDescriptor = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        if (classDescriptor == null) {
            NewKotlinTypeChecker newKotlinTypeChecker = this;
        } else if (isCommonFinalClass(classDescriptor)) {
            List<SimpleType> a;
            if (typeCheckerContext2.areEqualTypeConstructors(simpleType.getConstructor(), typeConstructor2)) {
                Object captureFromArguments$default = NewCapturedTypeKt.captureFromArguments$default(simpleType2, CaptureStatus.FOR_SUBTYPING, null, 4, null);
                if (captureFromArguments$default == null) {
                    captureFromArguments$default = simpleType2;
                }
                a = C15807n.m59826a(captureFromArguments$default);
            } else {
                a = C17554o.m64195a();
            }
            return a;
        }
        List<SimpleType> smartList = new SmartList();
        typeCheckerContext.initialize();
        ArrayDeque access$getSupertypesDeque$p = typeCheckerContext.supertypesDeque;
        if (access$getSupertypesDeque$p == null) {
            C2668g.a();
        }
        Set access$getSupertypesSet$p = typeCheckerContext.supertypesSet;
        if (access$getSupertypesSet$p == null) {
            C2668g.a();
        }
        access$getSupertypesDeque$p.push(simpleType2);
        while ((access$getSupertypesDeque$p.isEmpty() ^ 1) != 0) {
            if (access$getSupertypesSet$p.size() > AdError.NETWORK_ERROR_CODE) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Too many supertypes for type: ");
                stringBuilder.append(simpleType2);
                stringBuilder.append(". Supertypes = ");
                stringBuilder.append(C19299w.m68797a(access$getSupertypesSet$p, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
            SimpleType simpleType3 = (SimpleType) access$getSupertypesDeque$p.pop();
            C2668g.a(simpleType3, "current");
            if (access$getSupertypesSet$p.add(simpleType3)) {
                SupertypesPolicy supertypesPolicy;
                SimpleType captureFromArguments$default2 = NewCapturedTypeKt.captureFromArguments$default(simpleType3, CaptureStatus.FOR_SUBTYPING, null, 4, null);
                if (captureFromArguments$default2 == null) {
                    captureFromArguments$default2 = simpleType3;
                }
                if (typeCheckerContext2.areEqualTypeConstructors(captureFromArguments$default2.getConstructor(), typeConstructor2)) {
                    smartList.add(captureFromArguments$default2);
                    supertypesPolicy = None.INSTANCE;
                } else if (captureFromArguments$default2.getArguments().isEmpty()) {
                    supertypesPolicy = LowerIfFlexible.INSTANCE;
                } else {
                    supertypesPolicy = new LowerIfFlexibleWithCustomSubstitutor(TypeConstructorSubstitution.Companion.create(captureFromArguments$default2).buildSubstitutor());
                }
                if ((C2668g.a(supertypesPolicy, None.INSTANCE) ^ 1) == 0) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy != null) {
                    for (KotlinType kotlinType : simpleType3.getConstructor().getSupertypes()) {
                        C2668g.a(kotlinType, "supertype");
                        access$getSupertypesDeque$p.add(supertypesPolicy.transformType(kotlinType));
                    }
                }
            }
        }
        typeCheckerContext.clear();
        return smartList;
    }

    private final boolean isCommonFinalClass(@NotNull ClassDescriptor classDescriptor) {
        return (!ModalityKt.isFinalClass(classDescriptor) || classDescriptor.getKind() == ClassKind.ENUM_ENTRY || classDescriptor.getKind() == ClassKind.ANNOTATION_CLASS) ? null : true;
    }

    private final List<SimpleType> selectOnlyPureKotlinSupertypes(List<? extends SimpleType> list) {
        if (list.size() < 2) {
            return list;
        }
        Collection arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Iterable<TypeProjection> arguments = ((SimpleType) next).getArguments();
            if (!(arguments instanceof Collection) || !((Collection) arguments).isEmpty()) {
                for (TypeProjection type : arguments) {
                    KotlinType type2 = type.getType();
                    C2668g.a(type2, "it.type");
                    if ((FlexibleTypesKt.isFlexible(type2) ^ 1) == 0) {
                        i = 0;
                        break;
                    }
                }
            }
            if (i != 0) {
                arrayList.add(next);
            }
        }
        List<? extends SimpleType> list2 = (List) arrayList;
        if ((list2.isEmpty() ^ 1) != 0) {
            list = list2;
        }
        return list;
    }

    @Nullable
    public final Variance effectiveVariance(@NotNull Variance variance, @NotNull Variance variance2) {
        C2668g.b(variance, "declared");
        C2668g.b(variance2, "useSite");
        if (variance == Variance.INVARIANT) {
            return variance2;
        }
        return (variance2 == Variance.INVARIANT || variance == variance2) ? variance : null;
    }

    private final boolean isSubtypeForSameConstructor(@NotNull TypeCheckerContext typeCheckerContext, List<? extends TypeProjection> list, SimpleType simpleType) {
        if (list == simpleType.getArguments()) {
            return true;
        }
        List parameters = simpleType.getConstructor().getParameters();
        C2668g.a(parameters, "parameters");
        int size = parameters.size();
        for (int i = 0; i < size; i++) {
            TypeProjection typeProjection = (TypeProjection) simpleType.getArguments().get(i);
            if (!typeProjection.isStarProjection()) {
                UnwrappedType unwrap = typeProjection.getType().unwrap();
                TypeProjection typeProjection2 = (TypeProjection) list.get(i);
                Object obj = typeProjection2.getProjectionKind() == Variance.INVARIANT ? 1 : null;
                if (C15819j.f49018a && obj == null) {
                    typeCheckerContext = new StringBuilder();
                    typeCheckerContext.append("Incorrect sub argument: ");
                    typeCheckerContext.append(typeProjection2);
                    throw ((Throwable) new AssertionError(typeCheckerContext.toString()));
                }
                UnwrappedType unwrap2 = typeProjection2.getType().unwrap();
                obj = parameters.get(i);
                C2668g.a(obj, "parameters[index]");
                Variance variance = ((TypeParameterDescriptor) obj).getVariance();
                C2668g.a(variance, "parameters[index].variance");
                Variance projectionKind = typeProjection.getProjectionKind();
                C2668g.a(projectionKind, "superProjection.projectionKind");
                projectionKind = effectiveVariance(variance, projectionKind);
                if (projectionKind == null) {
                    return typeCheckerContext.getErrorTypeEqualsToAnything();
                }
                if (typeCheckerContext.argumentsDepth > 100) {
                    typeCheckerContext = new StringBuilder();
                    typeCheckerContext.append("Arguments depth is too high. Some related argument: ");
                    typeCheckerContext.append(unwrap2);
                    throw ((Throwable) new IllegalStateException(typeCheckerContext.toString().toString()));
                }
                boolean equalTypes;
                typeCheckerContext.argumentsDepth = typeCheckerContext.argumentsDepth + 1;
                switch (projectionKind) {
                    case INVARIANT:
                        equalTypes = INSTANCE.equalTypes(typeCheckerContext, unwrap2, unwrap);
                        break;
                    case OUT_VARIANCE:
                        equalTypes = INSTANCE.isSubtypeOf(typeCheckerContext, unwrap2, unwrap);
                        break;
                    case IN_VARIANCE:
                        equalTypes = INSTANCE.isSubtypeOf(typeCheckerContext, unwrap, unwrap2);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                typeCheckerContext.argumentsDepth = typeCheckerContext.argumentsDepth - 1;
                if (!equalTypes) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean hasNothingSupertype(@NotNull TypeCheckerContext typeCheckerContext, SimpleType simpleType) {
        if (KotlinBuiltIns.isNothingOrNullableNothing(simpleType)) {
            return true;
        }
        typeCheckerContext.initialize();
        ArrayDeque access$getSupertypesDeque$p = typeCheckerContext.supertypesDeque;
        if (access$getSupertypesDeque$p == null) {
            C2668g.a();
        }
        Set access$getSupertypesSet$p = typeCheckerContext.supertypesSet;
        if (access$getSupertypesSet$p == null) {
            C2668g.a();
        }
        access$getSupertypesDeque$p.push(simpleType);
        while ((access$getSupertypesDeque$p.isEmpty() ^ 1) != 0) {
            if (access$getSupertypesSet$p.size() > AdError.NETWORK_ERROR_CODE) {
                typeCheckerContext = new StringBuilder();
                typeCheckerContext.append("Too many supertypes for type: ");
                typeCheckerContext.append(simpleType);
                typeCheckerContext.append(". Supertypes = ");
                typeCheckerContext.append(C19299w.m68797a(access$getSupertypesSet$p, null, null, null, 0, null, null, 63, null));
                throw ((Throwable) new IllegalStateException(typeCheckerContext.toString().toString()));
            }
            SimpleType simpleType2 = (SimpleType) access$getSupertypesDeque$p.pop();
            C2668g.a(simpleType2, "current");
            if (access$getSupertypesSet$p.add(simpleType2)) {
                SupertypesPolicy supertypesPolicy;
                if (NewKotlinTypeCheckerKt.isClassType(simpleType2)) {
                    supertypesPolicy = None.INSTANCE;
                } else {
                    supertypesPolicy = LowerIfFlexible.INSTANCE;
                }
                if ((C2668g.a(supertypesPolicy, None.INSTANCE) ^ 1) == 0) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy != null) {
                    for (KotlinType kotlinType : simpleType2.getConstructor().getSupertypes()) {
                        C2668g.a(kotlinType, "supertype");
                        SimpleType transformType = supertypesPolicy.transformType(kotlinType);
                        if (KotlinBuiltIns.isNothingOrNullableNothing(transformType)) {
                            typeCheckerContext.clear();
                            return true;
                        }
                        access$getSupertypesDeque$p.add(transformType);
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        typeCheckerContext.clear();
        return false;
    }
}
