package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

final class SimpleResult extends Result {
    @NotNull
    private final SimpleType type;

    public SimpleResult(@NotNull SimpleType simpleType, int i, boolean z) {
        C2668g.b(simpleType, "type");
        super(simpleType, i, z);
        this.type = simpleType;
    }

    @NotNull
    public SimpleType getType() {
        return this.type;
    }
}
