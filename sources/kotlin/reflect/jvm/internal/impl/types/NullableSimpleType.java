package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

final class NullableSimpleType extends DelegatingSimpleTypeImpl {
    public boolean isMarkedNullable() {
        return true;
    }

    public NullableSimpleType(@NotNull SimpleType simpleType) {
        C2668g.b(simpleType, "delegate");
        super(simpleType);
    }
}
