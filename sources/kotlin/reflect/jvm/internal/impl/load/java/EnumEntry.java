package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import org.jetbrains.annotations.NotNull;

public final class EnumEntry extends JavaDefaultValue {
    @NotNull
    private final ClassDescriptor descriptor;

    public EnumEntry(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "descriptor");
        super();
        this.descriptor = classDescriptor;
    }
}
