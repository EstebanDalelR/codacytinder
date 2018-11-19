package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;

public final class ConstUtilKt {
    public static final boolean canBeUsedForConstVal(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        return ((!KotlinBuiltIns.isPrimitiveType(kotlinType) || TypeUtils.isNullableType(kotlinType)) && KotlinBuiltIns.isString(kotlinType) == null) ? null : true;
    }
}
