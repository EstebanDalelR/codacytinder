package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.C15813i;
import kotlin.collections.C15807n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import org.jetbrains.annotations.NotNull;

final class DescriptorRendererImpl$functionTypeParameterTypesRenderer$2 extends Lambda implements Function0<DescriptorRenderer> {
    final /* synthetic */ DescriptorRendererImpl this$0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeParameterTypesRenderer$2$1 */
    static final class C191321 extends Lambda implements Function1<DescriptorRendererOptions, C15813i> {
        public static final C191321 INSTANCE = new C191321();

        C191321() {
            super(1);
        }

        public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
            C2668g.b(descriptorRendererOptions, "$receiver");
            descriptorRendererOptions.setExcludedTypeAnnotationClasses(an.m66899a(descriptorRendererOptions.getExcludedTypeAnnotationClasses(), (Iterable) C15807n.m59826a(KotlinBuiltIns.FQ_NAMES.parameterName)));
        }
    }

    DescriptorRendererImpl$functionTypeParameterTypesRenderer$2(DescriptorRendererImpl descriptorRendererImpl) {
        this.this$0 = descriptorRendererImpl;
        super(0);
    }

    @NotNull
    public final DescriptorRenderer invoke() {
        return this.this$0.withOptions(C191321.INSTANCE);
    }
}
