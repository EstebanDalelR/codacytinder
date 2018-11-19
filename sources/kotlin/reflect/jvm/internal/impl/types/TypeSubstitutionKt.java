package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

public final class TypeSubstitutionKt {
    @NotNull
    @JvmOverloads
    public static /* synthetic */ KotlinType replace$default(KotlinType kotlinType, List list, Annotations annotations, int i, Object obj) {
        if ((i & 1) != null) {
            list = kotlinType.getArguments();
        }
        if ((i & 2) != 0) {
            annotations = kotlinType.getAnnotations();
        }
        return replace(kotlinType, list, annotations);
    }

    @NotNull
    @JvmOverloads
    public static final KotlinType replace(@NotNull KotlinType kotlinType, @NotNull List<? extends TypeProjection> list, @NotNull Annotations annotations) {
        C2668g.b(kotlinType, "$receiver");
        C2668g.b(list, "newArguments");
        C2668g.b(annotations, "newAnnotations");
        if ((list.isEmpty() || list == kotlinType.getArguments()) && annotations == kotlinType.getAnnotations()) {
            return kotlinType;
        }
        kotlinType = kotlinType.unwrap();
        if (kotlinType instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) kotlinType;
            kotlinType = KotlinTypeFactory.flexibleType(replace(flexibleType.getLowerBound(), (List) list, annotations), replace(flexibleType.getUpperBound(), (List) list, annotations));
        } else if (kotlinType instanceof SimpleType) {
            kotlinType = replace((SimpleType) kotlinType, (List) list, annotations);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return kotlinType;
    }

    @NotNull
    @JvmOverloads
    public static /* synthetic */ SimpleType replace$default(SimpleType simpleType, List list, Annotations annotations, int i, Object obj) {
        if ((i & 1) != null) {
            list = simpleType.getArguments();
        }
        if ((i & 2) != 0) {
            annotations = simpleType.getAnnotations();
        }
        return replace(simpleType, list, annotations);
    }

    @NotNull
    @JvmOverloads
    public static final SimpleType replace(@NotNull SimpleType simpleType, @NotNull List<? extends TypeProjection> list, @NotNull Annotations annotations) {
        C2668g.b(simpleType, "$receiver");
        C2668g.b(list, "newArguments");
        C2668g.b(annotations, "newAnnotations");
        if (list.isEmpty() && annotations == simpleType.getAnnotations()) {
            return simpleType;
        }
        if (list.isEmpty()) {
            return simpleType.replaceAnnotations(annotations);
        }
        return KotlinTypeFactory.simpleType(annotations, simpleType.getConstructor(), list, simpleType.isMarkedNullable());
    }

    @NotNull
    public static final SimpleType asSimpleType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof SimpleType)) {
            unwrap = null;
        }
        SimpleType simpleType = (SimpleType) unwrap;
        if (simpleType != null) {
            return simpleType;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This is should be simple type: ");
        stringBuilder.append(kotlinType);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }
}
