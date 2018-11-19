package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class NotNullTypeParameter extends DelegatingSimpleType implements CustomTypeVariable {
    @NotNull
    private final SimpleType delegate;

    public boolean isMarkedNullable() {
        return false;
    }

    public boolean isTypeVariable() {
        return true;
    }

    public NotNullTypeParameter(@NotNull SimpleType simpleType) {
        C2668g.b(simpleType, "delegate");
        this.delegate = simpleType;
    }

    @NotNull
    protected SimpleType getDelegate() {
        return this.delegate;
    }

    @NotNull
    public KotlinType substitutionResult(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "replacement");
        kotlinType = kotlinType.unwrap();
        KotlinType kotlinType2 = kotlinType;
        if (!TypeUtils.isNullableType(kotlinType2) && !TypeUtilsKt.isTypeParameter(kotlinType2)) {
            return kotlinType2;
        }
        if (kotlinType instanceof SimpleType) {
            kotlinType = prepareReplacement((SimpleType) kotlinType);
        } else if (kotlinType instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) kotlinType;
            kotlinType = TypeWithEnhancementKt.wrapEnhancement(KotlinTypeFactory.flexibleType(prepareReplacement(flexibleType.getLowerBound()), prepareReplacement(flexibleType.getUpperBound())), TypeWithEnhancementKt.getEnhancement(kotlinType2));
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Incorrect type: ");
            stringBuilder.append(kotlinType);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
        return kotlinType;
    }

    private final SimpleType prepareReplacement(@NotNull SimpleType simpleType) {
        SimpleType makeNullableAsSpecified = simpleType.makeNullableAsSpecified(false);
        if (TypeUtilsKt.isTypeParameter(simpleType) == null) {
            return makeNullableAsSpecified;
        }
        return new NotNullTypeParameter(makeNullableAsSpecified);
    }

    @NotNull
    public NotNullTypeParameter replaceAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "newAnnotations");
        return new NotNullTypeParameter(getDelegate().replaceAnnotations(annotations));
    }

    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z) {
        return z ? getDelegate().makeNullableAsSpecified(true) : this;
    }
}
