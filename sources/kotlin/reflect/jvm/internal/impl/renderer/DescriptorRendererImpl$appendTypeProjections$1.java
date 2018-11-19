package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

final class DescriptorRendererImpl$appendTypeProjections$1 extends Lambda implements Function1<TypeProjection, CharSequence> {
    final /* synthetic */ DescriptorRendererImpl this$0;

    DescriptorRendererImpl$appendTypeProjections$1(DescriptorRendererImpl descriptorRendererImpl) {
        this.this$0 = descriptorRendererImpl;
        super(1);
    }

    @NotNull
    public final CharSequence invoke(@NotNull TypeProjection typeProjection) {
        C2668g.b(typeProjection, "it");
        if (typeProjection.isStarProjection()) {
            return "*";
        }
        DescriptorRendererImpl descriptorRendererImpl = this.this$0;
        KotlinType type = typeProjection.getType();
        C2668g.a(type, "it.type");
        String renderType = descriptorRendererImpl.renderType(type);
        if (typeProjection.getProjectionKind() != Variance.INVARIANT) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(typeProjection.getProjectionKind());
            stringBuilder.append(' ');
            stringBuilder.append(renderType);
            renderType = stringBuilder.toString();
        }
        return renderType;
    }
}
