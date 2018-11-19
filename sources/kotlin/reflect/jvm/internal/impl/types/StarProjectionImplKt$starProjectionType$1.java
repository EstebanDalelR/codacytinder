package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class StarProjectionImplKt$starProjectionType$1 extends TypeConstructorSubstitution {
    final /* synthetic */ List $typeParameters;

    StarProjectionImplKt$starProjectionType$1(List list) {
        this.$typeParameters = list;
    }

    @Nullable
    public TypeProjection get(@NotNull TypeConstructor typeConstructor) {
        C2668g.b(typeConstructor, "key");
        if (!this.$typeParameters.contains(typeConstructor)) {
            return null;
        }
        typeConstructor = typeConstructor.getDeclarationDescriptor();
        if (typeConstructor != null) {
            return TypeUtils.makeStarProjection((TypeParameterDescriptor) typeConstructor);
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
    }
}
