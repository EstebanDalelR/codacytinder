package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Collection;
import java.util.List;
import kotlin.C15819j;
import kotlin.collections.C15807n;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CapturedTypeConstructor implements TypeConstructor {
    @Nullable
    private NewCapturedTypeConstructor newTypeConstructor;
    @NotNull
    private final TypeProjection typeProjection;

    @Nullable
    public Void getDeclarationDescriptor() {
        return null;
    }

    public boolean isDenotable() {
        return false;
    }

    public CapturedTypeConstructor(@NotNull TypeProjection typeProjection) {
        C2668g.b(typeProjection, "typeProjection");
        this.typeProjection = typeProjection;
        typeProjection = this.typeProjection.getProjectionKind() != Variance.INVARIANT ? true : null;
        if (C15819j.f49018a && typeProjection == null) {
            typeProjection = new StringBuilder();
            typeProjection.append("Only nontrivial projections can be captured, not: ");
            typeProjection.append(this.typeProjection);
            throw new AssertionError(typeProjection.toString());
        }
    }

    @NotNull
    public final TypeProjection getTypeProjection() {
        return this.typeProjection;
    }

    @Nullable
    public final NewCapturedTypeConstructor getNewTypeConstructor() {
        return this.newTypeConstructor;
    }

    public final void setNewTypeConstructor(@Nullable NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.newTypeConstructor = newCapturedTypeConstructor;
    }

    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return C17554o.m64195a();
    }

    @NotNull
    public Collection<KotlinType> getSupertypes() {
        Object type;
        if (this.typeProjection.getProjectionKind() == Variance.OUT_VARIANCE) {
            type = this.typeProjection.getType();
            C2668g.a(type, "typeProjection.type");
        } else {
            SimpleType nullableAnyType = getBuiltIns().getNullableAnyType();
            C2668g.a(nullableAnyType, "builtIns.nullableAnyType");
            type = nullableAnyType;
        }
        return C15807n.m59826a(type);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CapturedTypeConstructor(");
        stringBuilder.append(this.typeProjection);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = this.typeProjection.getType().getConstructor().getBuiltIns();
        C2668g.a(builtIns, "typeProjection.type.constructor.builtIns");
        return builtIns;
    }
}
