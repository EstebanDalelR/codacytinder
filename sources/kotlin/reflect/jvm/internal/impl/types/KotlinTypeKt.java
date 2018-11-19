package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class KotlinTypeKt {
    public static final boolean isError(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.unwrap();
        if (!(kotlinType instanceof ErrorType)) {
            if (!(kotlinType instanceof FlexibleType) || (((FlexibleType) kotlinType).getDelegate() instanceof ErrorType) == null) {
                return null;
            }
        }
        return true;
    }
}
