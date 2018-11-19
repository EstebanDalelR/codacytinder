package kotlin.reflect.jvm.internal.impl.types;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

public final class SimpleTypeWithEnhancement extends DelegatingSimpleType implements TypeWithEnhancement {
    @NotNull
    private final SimpleType delegate;
    @NotNull
    private final KotlinType enhancement;

    @NotNull
    protected SimpleType getDelegate() {
        return this.delegate;
    }

    @NotNull
    public KotlinType getEnhancement() {
        return this.enhancement;
    }

    public SimpleTypeWithEnhancement(@NotNull SimpleType simpleType, @NotNull KotlinType kotlinType) {
        C2668g.b(simpleType, "delegate");
        C2668g.b(kotlinType, "enhancement");
        this.delegate = simpleType;
        this.enhancement = kotlinType;
    }

    @NotNull
    public UnwrappedType getOrigin() {
        return getDelegate();
    }

    @NotNull
    public SimpleType replaceAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "newAnnotations");
        annotations = TypeWithEnhancementKt.wrapEnhancement(getOrigin().replaceAnnotations(annotations), getEnhancement());
        if (annotations != null) {
            return (SimpleType) annotations;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }

    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z) {
        z = TypeWithEnhancementKt.wrapEnhancement(getOrigin().makeNullableAsSpecified(z), getEnhancement().unwrap().makeNullableAsSpecified(z));
        if (z) {
            return (SimpleType) z;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }
}
