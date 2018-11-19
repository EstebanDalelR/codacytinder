package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.C15813i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SHORT;
import org.jetbrains.annotations.NotNull;

final class DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1 extends Lambda implements Function1<DescriptorRendererOptions, C15813i> {
    public static final DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1 INSTANCE = new DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1();

    DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1() {
        super(1);
    }

    public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
        C2668g.b(descriptorRendererOptions, "$receiver");
        descriptorRendererOptions.setModifiers(am.m64176a());
        descriptorRendererOptions.setClassifierNamePolicy(SHORT.INSTANCE);
        descriptorRendererOptions.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
    }
}
