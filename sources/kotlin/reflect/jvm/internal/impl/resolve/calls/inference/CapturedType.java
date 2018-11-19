package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.List;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class CapturedType extends SimpleType implements SubtypingRepresentatives {
    @NotNull
    private final Annotations annotations;
    @NotNull
    private final CapturedTypeConstructor constructor;
    private final boolean isMarkedNullable;
    @NotNull
    private final TypeProjection typeProjection;

    public /* synthetic */ CapturedType(TypeProjection typeProjection, CapturedTypeConstructor capturedTypeConstructor, boolean z, Annotations annotations, int i, C15823e c15823e) {
        if ((i & 2) != null) {
            capturedTypeConstructor = new CapturedTypeConstructor(typeProjection);
        }
        if ((i & 4) != null) {
            z = false;
        }
        if ((i & 8) != 0) {
            annotations = Annotations.Companion.getEMPTY();
        }
        this(typeProjection, capturedTypeConstructor, z, annotations);
    }

    @NotNull
    public CapturedTypeConstructor getConstructor() {
        return this.constructor;
    }

    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @NotNull
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public CapturedType(@NotNull TypeProjection typeProjection, @NotNull CapturedTypeConstructor capturedTypeConstructor, boolean z, @NotNull Annotations annotations) {
        C2668g.b(typeProjection, "typeProjection");
        C2668g.b(capturedTypeConstructor, "constructor");
        C2668g.b(annotations, "annotations");
        this.typeProjection = typeProjection;
        this.constructor = capturedTypeConstructor;
        this.isMarkedNullable = z;
        this.annotations = annotations;
    }

    @NotNull
    public List<TypeProjection> getArguments() {
        return C17554o.m64195a();
    }

    @NotNull
    public MemberScope getMemberScope() {
        MemberScope createErrorScope = ErrorUtils.createErrorScope("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        C2668g.a(createErrorScope, "ErrorUtils.createErrorSc…system resolution\", true)");
        return createErrorScope;
    }

    @NotNull
    public KotlinType getSubTypeRepresentative() {
        Variance variance = Variance.OUT_VARIANCE;
        SimpleType nullableAnyType = TypeUtilsKt.getBuiltIns(this).getNullableAnyType();
        C2668g.a(nullableAnyType, "builtIns.nullableAnyType");
        KotlinType representative = representative(variance, nullableAnyType);
        C2668g.a(representative, "representative(OUT_VARIA…builtIns.nullableAnyType)");
        return representative;
    }

    @NotNull
    public KotlinType getSuperTypeRepresentative() {
        Variance variance = Variance.IN_VARIANCE;
        SimpleType nothingType = TypeUtilsKt.getBuiltIns(this).getNothingType();
        C2668g.a(nothingType, "builtIns.nothingType");
        KotlinType representative = representative(variance, nothingType);
        C2668g.a(representative, "representative(IN_VARIANCE, builtIns.nothingType)");
        return representative;
    }

    private final KotlinType representative(Variance variance, KotlinType kotlinType) {
        return this.typeProjection.getProjectionKind() == variance ? this.typeProjection.getType() : kotlinType;
    }

    public boolean sameTypeConstructor(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "type");
        return getConstructor() == kotlinType.getConstructor() ? true : null;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Captured(");
        stringBuilder.append(this.typeProjection);
        stringBuilder.append(')');
        stringBuilder.append(isMarkedNullable() ? "?" : "");
        return stringBuilder.toString();
    }

    @NotNull
    public CapturedType makeNullableAsSpecified(boolean z) {
        if (z == isMarkedNullable()) {
            return this;
        }
        return new CapturedType(this.typeProjection, getConstructor(), z, getAnnotations());
    }

    @NotNull
    public CapturedType replaceAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "newAnnotations");
        return new CapturedType(this.typeProjection, getConstructor(), isMarkedNullable(), annotations);
    }
}
