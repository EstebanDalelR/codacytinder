package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2 extends DelegatedTypeSubstitution {
    final /* synthetic */ boolean $needApproximation;
    final /* synthetic */ TypeSubstitution receiver$0;

    CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2(TypeSubstitution typeSubstitution, boolean z, TypeSubstitution typeSubstitution2) {
        this.receiver$0 = typeSubstitution;
        this.$needApproximation = z;
        super(typeSubstitution2);
    }

    public boolean approximateContravariantCapturedTypes() {
        return this.$needApproximation;
    }

    @Nullable
    public TypeProjection get(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "key");
        TypeProjection typeProjection = super.get(kotlinType);
        if (typeProjection == null) {
            return null;
        }
        kotlinType = kotlinType.getConstructor().getDeclarationDescriptor();
        if (!(kotlinType instanceof TypeParameterDescriptor)) {
            kotlinType = null;
        }
        return CapturedTypeConstructorKt.createCapturedIfNeeded(typeProjection, (TypeParameterDescriptor) kotlinType);
    }
}
