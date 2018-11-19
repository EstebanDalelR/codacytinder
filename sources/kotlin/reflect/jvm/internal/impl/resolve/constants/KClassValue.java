package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;

public final class KClassValue extends ConstantValue<KotlinType> {
    private final KotlinType type;

    public KClassValue(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "type");
        super(kotlinType);
        this.type = kotlinType;
    }

    @NotNull
    public KotlinType getType(@NotNull ModuleDescriptor moduleDescriptor) {
        C2668g.b(moduleDescriptor, "module");
        return this.type;
    }

    @NotNull
    public KotlinType getValue() {
        KotlinType type = ((TypeProjection) C19299w.m68836j(this.type.getArguments())).getType();
        C2668g.a(type, "type.arguments.single().type");
        return type;
    }
}
