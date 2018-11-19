package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15813i;
import kotlin.TypeCastException;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NewCapturedTypeKt {
    @Nullable
    public static /* synthetic */ SimpleType captureFromArguments$default(SimpleType simpleType, CaptureStatus captureStatus, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = FunctionsKt.getDO_NOTHING_2();
        }
        return captureFromArguments(simpleType, captureStatus, function2);
    }

    @Nullable
    public static final SimpleType captureFromArguments(@NotNull SimpleType simpleType, @NotNull CaptureStatus captureStatus, @NotNull Function2<? super Integer, ? super NewCapturedType, C15813i> function2) {
        C2668g.b(simpleType, "type");
        C2668g.b(captureStatus, "status");
        C2668g.b(function2, "acceptNewCapturedType");
        if (simpleType.getArguments().size() != simpleType.getConstructor().getParameters().size()) {
            return null;
        }
        List arguments = simpleType.getArguments();
        Iterable<TypeProjection> iterable = arguments;
        Object obj = 1;
        Object obj2;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (TypeProjection projectionKind : iterable) {
                TypeProjection projectionKind2;
                if (projectionKind2.getProjectionKind() == Variance.INVARIANT) {
                    obj2 = 1;
                    continue;
                } else {
                    obj2 = null;
                    continue;
                }
                if (obj2 == null) {
                    obj = null;
                    break;
                }
            }
        }
        if (obj != null) {
            return null;
        }
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Object obj22 : iterable) {
            if (obj22.getProjectionKind() != Variance.INVARIANT) {
                UnwrappedType unwrap = (obj22.isStarProjection() || obj22.getProjectionKind() != Variance.IN_VARIANCE) ? null : obj22.getType().unwrap();
                obj22 = TypeUtilsKt.asTypeProjection(new NewCapturedType(captureStatus, unwrap, obj22));
            }
            arrayList.add(obj22);
        }
        List list = (List) arrayList;
        captureStatus = TypeConstructorSubstitution.Companion.create(simpleType.getConstructor(), list).buildSubstitutor();
        int size = arguments.size();
        for (int i = 0; i < size; i++) {
            TypeProjection typeProjection = (TypeProjection) arguments.get(i);
            projectionKind2 = (TypeProjection) list.get(i);
            if (typeProjection.getProjectionKind() != Variance.INVARIANT) {
                Object obj3 = simpleType.getConstructor().getParameters().get(i);
                C2668g.a(obj3, "type.constructor.parameters[index]");
                List upperBounds = ((TypeParameterDescriptor) obj3).getUpperBounds();
                C2668g.a(upperBounds, "type.constructor.parameters[index].upperBounds");
                Iterable<KotlinType> iterable2 = upperBounds;
                Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
                for (KotlinType safeSubstitute : iterable2) {
                    arrayList2.add(NewKotlinTypeChecker.INSTANCE.transformToNewType(captureStatus.safeSubstitute(safeSubstitute, Variance.INVARIANT).unwrap()));
                }
                List list2 = (List) arrayList2;
                if (!typeProjection.isStarProjection() && typeProjection.getProjectionKind() == Variance.OUT_VARIANCE) {
                    list2 = C19299w.m68800a((Collection) list2, (Object) NewKotlinTypeChecker.INSTANCE.transformToNewType(typeProjection.getType().unwrap()));
                }
                KotlinType type = projectionKind2.getType();
                if (type == null) {
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                }
                NewCapturedType newCapturedType = (NewCapturedType) type;
                newCapturedType.getConstructor().initializeSupertypes(list2);
                function2.invoke(Integer.valueOf(i), newCapturedType);
            }
        }
        return KotlinTypeFactory.simpleType(simpleType.getAnnotations(), simpleType.getConstructor(), list, simpleType.isMarkedNullable());
    }
}
