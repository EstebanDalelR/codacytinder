package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.C15813i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

final class DescriptorRenderer$Companion$HTML$1 extends Lambda implements Function1<DescriptorRendererOptions, C15813i> {
    public static final DescriptorRenderer$Companion$HTML$1 INSTANCE = new DescriptorRenderer$Companion$HTML$1();

    DescriptorRenderer$Companion$HTML$1() {
        super(1);
    }

    public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
        C2668g.b(descriptorRendererOptions, "$receiver");
        descriptorRendererOptions.setTextFormat(RenderingFormat.HTML);
        descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL);
    }
}
