package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import org.jetbrains.annotations.NotNull;

public final class FlexibleTypeWithEnhancement extends FlexibleType implements TypeWithEnhancement {
    @NotNull
    private final KotlinType enhancement;
    @NotNull
    private final FlexibleType origin;

    @NotNull
    public FlexibleType getOrigin() {
        return this.origin;
    }

    @NotNull
    public KotlinType getEnhancement() {
        return this.enhancement;
    }

    public FlexibleTypeWithEnhancement(@NotNull FlexibleType flexibleType, @NotNull KotlinType kotlinType) {
        C2668g.b(flexibleType, "origin");
        C2668g.b(kotlinType, "enhancement");
        super(flexibleType.getLowerBound(), flexibleType.getUpperBound());
        this.origin = flexibleType;
        this.enhancement = kotlinType;
    }

    @NotNull
    public UnwrappedType replaceAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "newAnnotations");
        return TypeWithEnhancementKt.wrapEnhancement(getOrigin().replaceAnnotations(annotations), getEnhancement());
    }

    @NotNull
    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return TypeWithEnhancementKt.wrapEnhancement(getOrigin().makeNullableAsSpecified(z), getEnhancement().unwrap().makeNullableAsSpecified(z));
    }

    @NotNull
    public String render(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions) {
        C2668g.b(descriptorRenderer, "renderer");
        C2668g.b(descriptorRendererOptions, "options");
        return getOrigin().render(descriptorRenderer, descriptorRendererOptions);
    }

    @NotNull
    public SimpleType getDelegate() {
        return getOrigin().getDelegate();
    }
}
