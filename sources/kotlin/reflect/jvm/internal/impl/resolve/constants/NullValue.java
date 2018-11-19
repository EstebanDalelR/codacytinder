package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

public final class NullValue extends ConstantValue<Void> {
    public NullValue() {
        super(null);
    }

    @NotNull
    public SimpleType getType(@NotNull ModuleDescriptor moduleDescriptor) {
        C2668g.b(moduleDescriptor, "module");
        return moduleDescriptor.getBuiltIns().getNullableNothingType();
    }
}
