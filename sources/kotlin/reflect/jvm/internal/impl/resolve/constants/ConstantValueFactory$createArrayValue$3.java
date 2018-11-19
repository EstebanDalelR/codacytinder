package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

final class ConstantValueFactory$createArrayValue$3 extends Lambda implements Function1<ModuleDescriptor, SimpleType> {
    final /* synthetic */ PrimitiveType $componentType;

    ConstantValueFactory$createArrayValue$3(PrimitiveType primitiveType) {
        this.$componentType = primitiveType;
        super(1);
    }

    @NotNull
    public final SimpleType invoke(@NotNull ModuleDescriptor moduleDescriptor) {
        C2668g.b(moduleDescriptor, "module");
        moduleDescriptor = moduleDescriptor.getBuiltIns().getPrimitiveArrayKotlinType(this.$componentType);
        C2668g.a(moduleDescriptor, "module.builtIns.getPrimi…KotlinType(componentType)");
        return moduleDescriptor;
    }
}
