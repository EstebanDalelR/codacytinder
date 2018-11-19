package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class DynamicTypesKt {
    public static final boolean isDynamic(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        return kotlinType.unwrap() instanceof DynamicType;
    }
}
