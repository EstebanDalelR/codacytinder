package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class TypeBasedStarProjectionImpl extends TypeProjectionBase {
    private final KotlinType _type;

    public boolean isStarProjection() {
        return true;
    }

    public TypeBasedStarProjectionImpl(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "_type");
        this._type = kotlinType;
    }

    @NotNull
    public Variance getProjectionKind() {
        return Variance.OUT_VARIANCE;
    }

    @NotNull
    public KotlinType getType() {
        return this._type;
    }
}
