package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class InvalidModuleException extends IllegalStateException {
    public InvalidModuleException(@NotNull String str) {
        C2668g.b(str, "message");
        super(str);
    }
}
