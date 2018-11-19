package kotlin.reflect.jvm.internal.impl.types;

import java.util.Map;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeConstructorSubstitution$Companion$createByConstructorsMap$1 extends TypeConstructorSubstitution {
    final /* synthetic */ boolean $approximateCapturedTypes;
    final /* synthetic */ Map $map;

    TypeConstructorSubstitution$Companion$createByConstructorsMap$1(Map map, boolean z) {
        this.$map = map;
        this.$approximateCapturedTypes = z;
    }

    @Nullable
    public TypeProjection get(@NotNull TypeConstructor typeConstructor) {
        C2668g.b(typeConstructor, "key");
        return (TypeProjection) this.$map.get(typeConstructor);
    }

    public boolean isEmpty() {
        return this.$map.isEmpty();
    }

    public boolean approximateCapturedTypes() {
        return this.$approximateCapturedTypes;
    }
}
