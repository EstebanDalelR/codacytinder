package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

public final class FloatValue extends ConstantValue<Float> {
    public FloatValue(float f) {
        super(Float.valueOf(f));
    }

    @NotNull
    public SimpleType getType(@NotNull ModuleDescriptor moduleDescriptor) {
        C2668g.b(moduleDescriptor, "module");
        return moduleDescriptor.getBuiltIns().getFloatType();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(((Number) getValue()).floatValue());
        stringBuilder.append(".toFloat()");
        return stringBuilder.toString();
    }
}
