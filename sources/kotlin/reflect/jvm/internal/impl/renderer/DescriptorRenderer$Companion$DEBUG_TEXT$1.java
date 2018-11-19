package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.C15813i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.FULLY_QUALIFIED;
import org.jetbrains.annotations.NotNull;

final class DescriptorRenderer$Companion$DEBUG_TEXT$1 extends Lambda implements Function1<DescriptorRendererOptions, C15813i> {
    public static final DescriptorRenderer$Companion$DEBUG_TEXT$1 INSTANCE = new DescriptorRenderer$Companion$DEBUG_TEXT$1();

    DescriptorRenderer$Companion$DEBUG_TEXT$1() {
        super(1);
    }

    public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
        C2668g.b(descriptorRendererOptions, "$receiver");
        descriptorRendererOptions.setDebugMode(true);
        descriptorRendererOptions.setClassifierNamePolicy(FULLY_QUALIFIED.INSTANCE);
        descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL);
    }
}
