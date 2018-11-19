package kotlin.reflect.jvm.internal.impl.types.checker;

import com.facebook.ads.AdError;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.C15819j;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SupertypesPolicy;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SupertypesPolicy.LowerIfFlexible;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SupertypesPolicy.None;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SupertypesPolicy.UpperIfFlexible;
import org.jetbrains.annotations.NotNull;

public final class NullabilityChecker {
    public static final NullabilityChecker INSTANCE = new NullabilityChecker();

    private NullabilityChecker() {
    }

    public final boolean isPossibleSubtype(@NotNull TypeCheckerContext typeCheckerContext, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        C2668g.b(typeCheckerContext, "context");
        C2668g.b(simpleType, "subType");
        C2668g.b(simpleType2, "superType");
        return runIsPossibleSubtype(typeCheckerContext, simpleType, simpleType2);
    }

    public final boolean isSubtypeOfAny(@NotNull UnwrappedType unwrappedType) {
        C2668g.b(unwrappedType, "type");
        return hasNotNullSupertype(new TypeCheckerContext(false, false, 2, null), FlexibleTypesKt.lowerIfFlexible(unwrappedType), LowerIfFlexible.INSTANCE);
    }

    private final boolean runIsPossibleSubtype(@NotNull TypeCheckerContext typeCheckerContext, SimpleType simpleType, SimpleType simpleType2) {
        Object obj;
        if (!(NewKotlinTypeCheckerKt.isIntersectionType(simpleType) || NewKotlinTypeCheckerKt.isSingleClassifierType(simpleType))) {
            if (!typeCheckerContext.isAllowedTypeVariable(simpleType)) {
                obj = null;
                if (C15819j.f49018a || r0 != null) {
                    if (!NewKotlinTypeCheckerKt.isSingleClassifierType(simpleType2)) {
                        if (typeCheckerContext.isAllowedTypeVariable(simpleType2)) {
                            obj = null;
                            if (!C15819j.f49018a && r0 == null) {
                                typeCheckerContext = new StringBuilder();
                                typeCheckerContext.append("Not singleClassifierType superType: ");
                                typeCheckerContext.append(simpleType2);
                                throw ((Throwable) new AssertionError(typeCheckerContext.toString()));
                            } else if (simpleType2.isMarkedNullable() || SpecialTypesKt.isDefinitelyNotNullType(simpleType) || hasNotNullSupertype(typeCheckerContext, simpleType, LowerIfFlexible.INSTANCE)) {
                                return true;
                            } else {
                                if (!SpecialTypesKt.isDefinitelyNotNullType(simpleType2) || hasNotNullSupertype(typeCheckerContext, simpleType2, UpperIfFlexible.INSTANCE) || NewKotlinTypeCheckerKt.isClassType(simpleType)) {
                                    return false;
                                }
                                return hasPathByNotMarkedNullableNodes(typeCheckerContext, simpleType, simpleType2.getConstructor());
                            }
                        }
                    }
                    obj = 1;
                    if (!C15819j.f49018a) {
                    }
                    if (simpleType2.isMarkedNullable()) {
                        return true;
                    }
                    if (!SpecialTypesKt.isDefinitelyNotNullType(simpleType2)) {
                        return false;
                    }
                    return hasPathByNotMarkedNullableNodes(typeCheckerContext, simpleType, simpleType2.getConstructor());
                }
                typeCheckerContext = new StringBuilder();
                typeCheckerContext.append("Not singleClassifierType superType: ");
                typeCheckerContext.append(simpleType2);
                throw ((Throwable) new AssertionError(typeCheckerContext.toString()));
            }
        }
        obj = 1;
        if (C15819j.f49018a) {
        }
        if (NewKotlinTypeCheckerKt.isSingleClassifierType(simpleType2)) {
            if (typeCheckerContext.isAllowedTypeVariable(simpleType2)) {
                obj = null;
                if (!C15819j.f49018a) {
                }
                if (simpleType2.isMarkedNullable()) {
                    return true;
                }
                if (!SpecialTypesKt.isDefinitelyNotNullType(simpleType2)) {
                    return hasPathByNotMarkedNullableNodes(typeCheckerContext, simpleType, simpleType2.getConstructor());
                }
                return false;
            }
        }
        obj = 1;
        if (!C15819j.f49018a) {
        }
        if (simpleType2.isMarkedNullable()) {
            return true;
        }
        if (!SpecialTypesKt.isDefinitelyNotNullType(simpleType2)) {
            return false;
        }
        return hasPathByNotMarkedNullableNodes(typeCheckerContext, simpleType, simpleType2.getConstructor());
    }

    private final boolean hasNotNullSupertype(@NotNull TypeCheckerContext typeCheckerContext, SimpleType simpleType, SupertypesPolicy supertypesPolicy) {
        SimpleType simpleType2 = simpleType;
        Object obj = ((!NewKotlinTypeCheckerKt.isClassType(simpleType) || simpleType.isMarkedNullable()) && !SpecialTypesKt.isDefinitelyNotNullType(simpleType2)) ? null : 1;
        if (obj != null) {
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
                SupertypesPolicy supertypesPolicy2 = simpleType3.isMarkedNullable() ? None.INSTANCE : supertypesPolicy;
                if ((C2668g.a(supertypesPolicy2, None.INSTANCE) ^ 1) == 0) {
                    supertypesPolicy2 = null;
                }
                if (supertypesPolicy2 != null) {
                    for (KotlinType kotlinType : simpleType3.getConstructor().getSupertypes()) {
                        C2668g.a(kotlinType, "supertype");
                        SimpleType transformType = supertypesPolicy2.transformType(kotlinType);
                        Object obj2 = ((!NewKotlinTypeCheckerKt.isClassType(transformType) || transformType.isMarkedNullable()) && !SpecialTypesKt.isDefinitelyNotNullType(transformType)) ? null : 1;
                        if (obj2 != null) {
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

    private final boolean hasPathByNotMarkedNullableNodes(@NotNull TypeCheckerContext typeCheckerContext, SimpleType simpleType, TypeConstructor typeConstructor) {
        SimpleType simpleType2 = simpleType;
        TypeConstructor typeConstructor2 = typeConstructor;
        Object obj = (simpleType.isMarkedNullable() || !C2668g.a(simpleType.getConstructor(), typeConstructor2)) ? null : 1;
        if (obj != null) {
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
                SupertypesPolicy supertypesPolicy = simpleType3.isMarkedNullable() ? None.INSTANCE : LowerIfFlexible.INSTANCE;
                if ((C2668g.a(supertypesPolicy, None.INSTANCE) ^ 1) == 0) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy != null) {
                    for (KotlinType kotlinType : simpleType3.getConstructor().getSupertypes()) {
                        C2668g.a(kotlinType, "supertype");
                        SimpleType transformType = supertypesPolicy.transformType(kotlinType);
                        Object obj2 = (transformType.isMarkedNullable() || !C2668g.a(transformType.getConstructor(), typeConstructor2)) ? null : 1;
                        if (obj2 != null) {
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
