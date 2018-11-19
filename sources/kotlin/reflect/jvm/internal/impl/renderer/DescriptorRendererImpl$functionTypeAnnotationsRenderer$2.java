package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.C15813i;
import kotlin.TypeCastException;
import kotlin.collections.C15807n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import org.jetbrains.annotations.NotNull;

final class DescriptorRendererImpl$functionTypeAnnotationsRenderer$2 extends Lambda implements Function0<DescriptorRendererImpl> {
    final /* synthetic */ DescriptorRendererImpl this$0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2$1 */
    static final class C191311 extends Lambda implements Function1<DescriptorRendererOptions, C15813i> {
        public static final C191311 INSTANCE = new C191311();

        C191311() {
            super(1);
        }

        public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
            C2668g.b(descriptorRendererOptions, "$receiver");
            descriptorRendererOptions.setExcludedTypeAnnotationClasses(an.m66899a(descriptorRendererOptions.getExcludedTypeAnnotationClasses(), (Iterable) C15807n.m59826a(KotlinBuiltIns.FQ_NAMES.extensionFunctionType)));
            descriptorRendererOptions.setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy.ALWAYS_PARENTHESIZED);
        }
    }

    DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(DescriptorRendererImpl descriptorRendererImpl) {
        this.this$0 = descriptorRendererImpl;
        super(0);
    }

    @NotNull
    public final DescriptorRendererImpl invoke() {
        DescriptorRenderer withOptions = this.this$0.withOptions(C191311.INSTANCE);
        if (withOptions != null) {
            return (DescriptorRendererImpl) withOptions;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
    }
}
