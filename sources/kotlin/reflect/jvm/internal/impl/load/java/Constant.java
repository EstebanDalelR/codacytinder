package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class Constant extends JavaDefaultValue {
    @NotNull
    private final Object value;

    public Constant(@NotNull Object obj) {
        C2668g.b(obj, "value");
        super();
        this.value = obj;
    }
}
