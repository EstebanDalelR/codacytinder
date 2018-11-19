package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.Companion;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.Check.DefaultImpls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class IsKPropertyCheck implements Check {
    public static final IsKPropertyCheck INSTANCE = new IsKPropertyCheck();
    @NotNull
    private static final String description = "second parameter must be of type KProperty<*> or its supertype";

    private IsKPropertyCheck() {
    }

    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "functionDescriptor");
        return DefaultImpls.invoke(this, functionDescriptor);
    }

    @NotNull
    public String getDescription() {
        return description;
    }

    public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "functionDescriptor");
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) functionDescriptor.getValueParameters().get(1);
        Companion companion = ReflectionTypes.Companion;
        C2668g.a(valueParameterDescriptor, "secondParameter");
        KotlinType createKPropertyStarType = companion.createKPropertyStarType(DescriptorUtilsKt.getModule(valueParameterDescriptor));
        if (createKPropertyStarType == null) {
            return null;
        }
        functionDescriptor = valueParameterDescriptor.getType();
        C2668g.a(functionDescriptor, "secondParameter.type");
        functionDescriptor = TypeUtilsKt.makeNotNullable(functionDescriptor);
        C2668g.a(functionDescriptor, "secondParameter.type.makeNotNullable()");
        return TypeUtilsKt.isSubtypeOf(createKPropertyStarType, functionDescriptor);
    }
}
