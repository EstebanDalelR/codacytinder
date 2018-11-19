package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

final class DescriptorRendererImpl$renderSuperTypes$1 extends Lambda implements Function1<KotlinType, String> {
    final /* synthetic */ DescriptorRendererImpl this$0;

    DescriptorRendererImpl$renderSuperTypes$1(DescriptorRendererImpl descriptorRendererImpl) {
        this.this$0 = descriptorRendererImpl;
        super(1);
    }

    @NotNull
    public final String invoke(KotlinType kotlinType) {
        DescriptorRendererImpl descriptorRendererImpl = this.this$0;
        C2668g.a(kotlinType, "it");
        return descriptorRendererImpl.renderType(kotlinType);
    }
}
