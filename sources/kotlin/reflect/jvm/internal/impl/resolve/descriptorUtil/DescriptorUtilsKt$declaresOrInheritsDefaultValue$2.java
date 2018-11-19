package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import org.jetbrains.annotations.NotNull;

final class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReference implements Function1<ValueParameterDescriptor, Boolean> {
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 INSTANCE = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1);
    }

    public final String getName() {
        return "declaresDefaultValue";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(ValueParameterDescriptor.class);
    }

    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((ValueParameterDescriptor) obj));
    }

    public final boolean invoke(@NotNull ValueParameterDescriptor valueParameterDescriptor) {
        C2668g.b(valueParameterDescriptor, "p1");
        return valueParameterDescriptor.declaresDefaultValue();
    }
}
