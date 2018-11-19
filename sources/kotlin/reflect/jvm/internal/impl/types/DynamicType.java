package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class DynamicType extends FlexibleType {
    @NotNull
    private final Annotations annotations;

    public boolean isMarkedNullable() {
        return false;
    }

    @NotNull
    public DynamicType makeNullableAsSpecified(boolean z) {
        return this;
    }

    @NotNull
    public String render(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions) {
        C2668g.b(descriptorRenderer, "renderer");
        C2668g.b(descriptorRendererOptions, "options");
        return "dynamic";
    }

    public DynamicType(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull Annotations annotations) {
        C2668g.b(kotlinBuiltIns, "builtIns");
        C2668g.b(annotations, "annotations");
        SimpleType nothingType = kotlinBuiltIns.getNothingType();
        C2668g.a(nothingType, "builtIns.nothingType");
        kotlinBuiltIns = kotlinBuiltIns.getNullableAnyType();
        C2668g.a(kotlinBuiltIns, "builtIns.nullableAnyType");
        super(nothingType, kotlinBuiltIns);
        this.annotations = annotations;
    }

    @NotNull
    public Annotations getAnnotations() {
        return this.annotations;
    }

    @NotNull
    public SimpleType getDelegate() {
        return getUpperBound();
    }

    @NotNull
    public DynamicType replaceAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "newAnnotations");
        return new DynamicType(TypeUtilsKt.getBuiltIns(getDelegate()), annotations);
    }
}
