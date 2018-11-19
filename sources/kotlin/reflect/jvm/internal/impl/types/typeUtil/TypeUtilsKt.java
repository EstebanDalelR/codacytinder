package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeUtilsKt {
    @NotNull
    public static final KotlinBuiltIns getBuiltIns(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.getConstructor().getBuiltIns();
        C2668g.a(kotlinType, "constructor.builtIns");
        return kotlinType;
    }

    @NotNull
    public static final KotlinType makeNullable(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        return TypeUtils.makeNullable(kotlinType);
    }

    @NotNull
    public static final KotlinType makeNotNullable(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        return TypeUtils.makeNotNullable(kotlinType);
    }

    public static final boolean isAnyOrNullableAny(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        return KotlinBuiltIns.isAnyOrNullableAny(kotlinType);
    }

    public static final boolean isTypeParameter(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        return TypeUtils.isTypeParameter(kotlinType);
    }

    public static final boolean isSubtypeOf(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        C2668g.b(kotlinType, "$receiver");
        C2668g.b(kotlinType2, "superType");
        return KotlinTypeChecker.DEFAULT.isSubtypeOf(kotlinType, kotlinType2);
    }

    @NotNull
    public static final KotlinType replaceAnnotations(@NotNull KotlinType kotlinType, @NotNull Annotations annotations) {
        C2668g.b(kotlinType, "$receiver");
        C2668g.b(annotations, "newAnnotations");
        if (kotlinType.getAnnotations().isEmpty() && annotations.isEmpty()) {
            return kotlinType;
        }
        return kotlinType.unwrap().replaceAnnotations(annotations);
    }

    @NotNull
    public static final TypeProjection createProjection(@NotNull KotlinType kotlinType, @NotNull Variance variance, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        C2668g.b(kotlinType, "type");
        C2668g.b(variance, "projectionKind");
        if ((typeParameterDescriptor != null ? typeParameterDescriptor.getVariance() : null) == variance) {
            variance = Variance.INVARIANT;
        }
        return new TypeProjectionImpl(variance, kotlinType);
    }

    @NotNull
    public static final TypeProjection asTypeProjection(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        return new TypeProjectionImpl(kotlinType);
    }

    public static final boolean canHaveUndefinedNullability(@NotNull UnwrappedType unwrappedType) {
        C2668g.b(unwrappedType, "$receiver");
        if (!((unwrappedType.getConstructor() instanceof NewTypeVariableConstructor) || (unwrappedType.getConstructor().getDeclarationDescriptor() instanceof TypeParameterDescriptor))) {
            if ((unwrappedType instanceof NewCapturedType) == null) {
                return null;
            }
        }
        return true;
    }

    @NotNull
    public static final KotlinType replaceArgumentsWithStarProjections(@NotNull KotlinType kotlinType) {
        UnwrappedType flexibleType;
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.unwrap();
        SimpleType upperBound;
        if (kotlinType instanceof FlexibleType) {
            List parameters;
            Iterable<TypeParameterDescriptor> iterable;
            Collection arrayList;
            FlexibleType flexibleType2 = (FlexibleType) kotlinType;
            SimpleType lowerBound = flexibleType2.getLowerBound();
            if (!lowerBound.getConstructor().getParameters().isEmpty()) {
                if (lowerBound.getConstructor().getDeclarationDescriptor() != null) {
                    parameters = lowerBound.getConstructor().getParameters();
                    C2668g.a(parameters, "constructor.parameters");
                    iterable = parameters;
                    arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                    for (TypeParameterDescriptor starProjectionImpl : iterable) {
                        arrayList.add(new StarProjectionImpl(starProjectionImpl));
                    }
                    lowerBound = TypeSubstitutionKt.replace$default(lowerBound, (List) arrayList, null, 2, null);
                }
            }
            upperBound = flexibleType2.getUpperBound();
            if (!upperBound.getConstructor().getParameters().isEmpty()) {
                if (upperBound.getConstructor().getDeclarationDescriptor() != null) {
                    parameters = upperBound.getConstructor().getParameters();
                    C2668g.a(parameters, "constructor.parameters");
                    iterable = parameters;
                    arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                    for (TypeParameterDescriptor starProjectionImpl2 : iterable) {
                        arrayList.add(new StarProjectionImpl(starProjectionImpl2));
                    }
                    upperBound = TypeSubstitutionKt.replace$default(upperBound, (List) arrayList, null, 2, null);
                }
            }
            flexibleType = KotlinTypeFactory.flexibleType(lowerBound, upperBound);
        } else if (kotlinType instanceof SimpleType) {
            upperBound = (SimpleType) kotlinType;
            if (!upperBound.getConstructor().getParameters().isEmpty()) {
                if (upperBound.getConstructor().getDeclarationDescriptor() != null) {
                    List parameters2 = upperBound.getConstructor().getParameters();
                    C2668g.a(parameters2, "constructor.parameters");
                    Iterable<TypeParameterDescriptor> iterable2 = parameters2;
                    Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
                    for (TypeParameterDescriptor starProjectionImpl3 : iterable2) {
                        arrayList2.add(new StarProjectionImpl(starProjectionImpl3));
                    }
                    upperBound = TypeSubstitutionKt.replace$default(upperBound, (List) arrayList2, null, 2, null);
                }
            }
            flexibleType = upperBound;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return TypeWithEnhancementKt.inheritEnhancement(flexibleType, kotlinType);
    }
}
