package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

public final class IntersectionTypeKt {
    @NotNull
    public static final UnwrappedType intersectTypes(@NotNull List<? extends UnwrappedType> list) {
        C2668g.b(list, "types");
        switch (list.size()) {
            case 0:
                throw new IllegalStateException("Expected some types".toString());
            case 1:
                return (UnwrappedType) C19299w.m68836j((List) list);
            default:
                Iterable<UnwrappedType> iterable = list;
                Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                Object obj = null;
                Object obj2 = null;
                for (UnwrappedType unwrappedType : iterable) {
                    Object obj3;
                    if (obj == null) {
                        if (!KotlinTypeKt.isError(unwrappedType)) {
                            obj = null;
                            if (unwrappedType instanceof SimpleType) {
                                obj3 = (SimpleType) unwrappedType;
                            } else if (unwrappedType instanceof FlexibleType) {
                                throw new NoWhenBranchMatchedException();
                            } else if (DynamicTypesKt.isDynamic(unwrappedType)) {
                                return unwrappedType;
                            } else {
                                obj3 = ((FlexibleType) unwrappedType).getLowerBound();
                                obj2 = 1;
                            }
                            arrayList.add(obj3);
                        }
                    }
                    obj = 1;
                    if (unwrappedType instanceof SimpleType) {
                        obj3 = (SimpleType) unwrappedType;
                    } else if (unwrappedType instanceof FlexibleType) {
                        throw new NoWhenBranchMatchedException();
                    } else if (DynamicTypesKt.isDynamic(unwrappedType)) {
                        return unwrappedType;
                    } else {
                        obj3 = ((FlexibleType) unwrappedType).getLowerBound();
                        obj2 = 1;
                    }
                    arrayList.add(obj3);
                }
                List list2 = (List) arrayList;
                if (obj != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Intersection of error types: ");
                    stringBuilder.append(list);
                    list = ErrorUtils.createErrorType(stringBuilder.toString());
                    C2668g.a(list, "ErrorUtils.createErrorTy… of error types: $types\")");
                    return (UnwrappedType) list;
                } else if (obj2 == null) {
                    return TypeIntersector.INSTANCE.intersectTypes$descriptors(list2);
                } else {
                    Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                    for (UnwrappedType upperIfFlexible : iterable) {
                        arrayList2.add(FlexibleTypesKt.upperIfFlexible(upperIfFlexible));
                    }
                    return KotlinTypeFactory.flexibleType(TypeIntersector.INSTANCE.intersectTypes$descriptors(list2), TypeIntersector.INSTANCE.intersectTypes$descriptors((List) arrayList2));
                }
        }
    }
}
