package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

final class FallbackBuiltIns$Companion$initializer$1 extends Lambda implements Function0<FallbackBuiltIns> {
    public static final FallbackBuiltIns$Companion$initializer$1 INSTANCE = new FallbackBuiltIns$Companion$initializer$1();

    FallbackBuiltIns$Companion$initializer$1() {
        super(0);
    }

    @NotNull
    public final FallbackBuiltIns invoke() {
        return new FallbackBuiltIns();
    }
}
