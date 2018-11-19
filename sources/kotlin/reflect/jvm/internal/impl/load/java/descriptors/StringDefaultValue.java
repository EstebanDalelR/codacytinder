package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class StringDefaultValue extends AnnotationDefaultValue {
    @NotNull
    private final String value;

    public StringDefaultValue(@NotNull String str) {
        C2668g.b(str, "value");
        super();
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
