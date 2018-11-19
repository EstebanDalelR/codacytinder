package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class SubtypePathNode {
    @Nullable
    private final SubtypePathNode previous;
    @NotNull
    private final KotlinType type;

    public SubtypePathNode(@NotNull KotlinType kotlinType, @Nullable SubtypePathNode subtypePathNode) {
        C2668g.b(kotlinType, "type");
        this.type = kotlinType;
        this.previous = subtypePathNode;
    }

    @Nullable
    public final SubtypePathNode getPrevious() {
        return this.previous;
    }

    @NotNull
    public final KotlinType getType() {
        return this.type;
    }
}
