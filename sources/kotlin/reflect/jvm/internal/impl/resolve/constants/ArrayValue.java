package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.C15819j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public final class ArrayValue extends ConstantValue<List<? extends ConstantValue<?>>> {
    private final Function1<ModuleDescriptor, KotlinType> computeType;

    public ArrayValue(@NotNull List<? extends ConstantValue<?>> list, @NotNull Function1<? super ModuleDescriptor, ? extends KotlinType> function1) {
        C2668g.b(list, "value");
        C2668g.b(function1, "computeType");
        super(list);
        this.computeType = function1;
    }

    @NotNull
    public KotlinType getType(@NotNull ModuleDescriptor moduleDescriptor) {
        Object obj;
        C2668g.b(moduleDescriptor, "module");
        KotlinType kotlinType = (KotlinType) this.computeType.invoke(moduleDescriptor);
        if (!KotlinBuiltIns.isArray(kotlinType)) {
            if (!KotlinBuiltIns.isPrimitiveArray(kotlinType)) {
                obj = null;
                if (C15819j.f49018a || r0 != null) {
                    return kotlinType;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Type should be an array, but was ");
                stringBuilder.append(kotlinType);
                stringBuilder.append(": ");
                stringBuilder.append((List) getValue());
                throw new AssertionError(stringBuilder.toString());
            }
        }
        obj = 1;
        if (C15819j.f49018a) {
        }
        return kotlinType;
    }
}
