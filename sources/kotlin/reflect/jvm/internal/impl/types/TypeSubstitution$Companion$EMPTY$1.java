package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeSubstitution$Companion$EMPTY$1 extends TypeSubstitution {
    @Nullable
    public Void get(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "key");
        return null;
    }

    public boolean isEmpty() {
        return true;
    }

    @NotNull
    public String toString() {
        return "Empty TypeSubstitution";
    }

    TypeSubstitution$Companion$EMPTY$1() {
    }
}
