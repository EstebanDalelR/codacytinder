package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

final class ConstantValueFactory$createArrayValue$1 extends Lambda implements Function1<ModuleDescriptor, KotlinType> {
    final /* synthetic */ KotlinType $type;

    ConstantValueFactory$createArrayValue$1(KotlinType kotlinType) {
        this.$type = kotlinType;
        super(1);
    }

    @NotNull
    public final KotlinType invoke(@NotNull ModuleDescriptor moduleDescriptor) {
        C2668g.b(moduleDescriptor, "it");
        return this.$type;
    }
}
