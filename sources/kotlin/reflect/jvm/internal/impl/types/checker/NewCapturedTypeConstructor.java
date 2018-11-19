package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.C15819j;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NewCapturedTypeConstructor implements TypeConstructor {
    @NotNull
    private final TypeProjection projection;
    private List<? extends UnwrappedType> supertypes;

    @Nullable
    public ClassifierDescriptor getDeclarationDescriptor() {
        return null;
    }

    public boolean isDenotable() {
        return false;
    }

    public NewCapturedTypeConstructor(@NotNull TypeProjection typeProjection, @Nullable List<? extends UnwrappedType> list) {
        C2668g.b(typeProjection, "projection");
        this.projection = typeProjection;
        this.supertypes = list;
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, List list, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            list = null;
        }
        this(typeProjection, list);
    }

    public final void initializeSupertypes(@NotNull List<? extends UnwrappedType> list) {
        C2668g.b(list, "supertypes");
        Object obj = this.supertypes == null ? 1 : null;
        if (C15819j.f49018a && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Already initialized! oldValue = ");
            stringBuilder.append(this.supertypes);
            stringBuilder.append(", newValue = ");
            stringBuilder.append(list);
            throw new AssertionError(stringBuilder.toString());
        }
        this.supertypes = list;
    }

    @NotNull
    public List<UnwrappedType> getSupertypes() {
        List<UnwrappedType> list = this.supertypes;
        return list != null ? list : C17554o.m64195a();
    }

    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return C17554o.m64195a();
    }

    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        KotlinType type = this.projection.getType();
        C2668g.a(type, "projection.type");
        return TypeUtilsKt.getBuiltIns(type);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CapturedType(");
        stringBuilder.append(this.projection);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
