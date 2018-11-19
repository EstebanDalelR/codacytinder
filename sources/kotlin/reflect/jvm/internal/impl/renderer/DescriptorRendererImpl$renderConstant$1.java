package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;

final class DescriptorRendererImpl$renderConstant$1 extends Lambda implements Function1<ConstantValue<?>, String> {
    final /* synthetic */ DescriptorRendererImpl this$0;

    DescriptorRendererImpl$renderConstant$1(DescriptorRendererImpl descriptorRendererImpl) {
        this.this$0 = descriptorRendererImpl;
        super(1);
    }

    @NotNull
    public final String invoke(@NotNull ConstantValue<?> constantValue) {
        C2668g.b(constantValue, "it");
        return this.this$0.renderConstant(constantValue);
    }
}
