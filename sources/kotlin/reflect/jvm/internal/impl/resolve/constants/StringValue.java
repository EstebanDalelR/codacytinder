package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

public final class StringValue extends ConstantValue<String> {
    public StringValue(@NotNull String str) {
        C2668g.b(str, "value");
        super(str);
    }

    @NotNull
    public SimpleType getType(@NotNull ModuleDescriptor moduleDescriptor) {
        C2668g.b(moduleDescriptor, "module");
        return moduleDescriptor.getBuiltIns().getStringType();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\"');
        stringBuilder.append((String) getValue());
        stringBuilder.append('\"');
        return stringBuilder.toString();
    }
}
