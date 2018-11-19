package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaTypeResolverKt {
    private static final FqName JAVA_LANG_CLASS_FQ_NAME = new FqName("java.lang.Class");

    @NotNull
    public static final TypeProjection makeStarProjection(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull JavaTypeAttributes javaTypeAttributes) {
        C2668g.b(typeParameterDescriptor, "typeParameter");
        C2668g.b(javaTypeAttributes, "attr");
        if (javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) {
            return (TypeProjection) new TypeProjectionImpl(StarProjectionImplKt.starProjectionType(typeParameterDescriptor));
        }
        return (TypeProjection) new StarProjectionImpl(typeParameterDescriptor);
    }

    @NotNull
    public static /* synthetic */ JavaTypeAttributes toAttributes$default(TypeUsage typeUsage, boolean z, TypeParameterDescriptor typeParameterDescriptor, int i, Object obj) {
        if ((i & 1) != null) {
            z = false;
        }
        if ((i & 2) != 0) {
            typeParameterDescriptor = null;
        }
        return toAttributes(typeUsage, z, typeParameterDescriptor);
    }

    @NotNull
    public static final JavaTypeAttributes toAttributes(@NotNull TypeUsage typeUsage, boolean z, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        C2668g.b(typeUsage, "$receiver");
        return new JavaTypeAttributes(typeUsage, null, z, typeParameterDescriptor, 2, null);
    }

    @NotNull
    public static /* synthetic */ KotlinType getErasedUpperBound$default(TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, Function0 function0, int i, Object obj) {
        if ((i & 1) != null) {
            typeParameterDescriptor2 = null;
        }
        if ((i & 2) != 0) {
            function0 = new JavaTypeResolverKt$getErasedUpperBound$1(typeParameterDescriptor);
        }
        return getErasedUpperBound(typeParameterDescriptor, typeParameterDescriptor2, function0);
    }

    @NotNull
    public static final KotlinType getErasedUpperBound(@NotNull TypeParameterDescriptor typeParameterDescriptor, @Nullable TypeParameterDescriptor typeParameterDescriptor2, @NotNull Function0<? extends KotlinType> function0) {
        C2668g.b(typeParameterDescriptor, "$receiver");
        C2668g.b(function0, "defaultValue");
        if (typeParameterDescriptor == typeParameterDescriptor2) {
            return (KotlinType) function0.invoke();
        }
        List upperBounds = typeParameterDescriptor.getUpperBounds();
        C2668g.a(upperBounds, "upperBounds");
        KotlinType kotlinType = (KotlinType) C19299w.m68829f(upperBounds);
        if (kotlinType.getConstructor().getDeclarationDescriptor() instanceof ClassDescriptor) {
            C2668g.a(kotlinType, "firstUpperBound");
            return TypeUtilsKt.replaceArgumentsWithStarProjections(kotlinType);
        }
        if (typeParameterDescriptor2 != null) {
            typeParameterDescriptor = typeParameterDescriptor2;
        }
        typeParameterDescriptor2 = kotlinType.getConstructor().getDeclarationDescriptor();
        if (typeParameterDescriptor2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
        typeParameterDescriptor2 = typeParameterDescriptor2;
        while ((C2668g.a(typeParameterDescriptor2, typeParameterDescriptor) ^ 1) != 0) {
            typeParameterDescriptor2 = typeParameterDescriptor2.getUpperBounds();
            C2668g.a(typeParameterDescriptor2, "current.upperBounds");
            KotlinType kotlinType2 = (KotlinType) C19299w.m68829f((List) typeParameterDescriptor2);
            if (kotlinType2.getConstructor().getDeclarationDescriptor() instanceof ClassDescriptor) {
                C2668g.a(kotlinType2, "nextUpperBound");
                return TypeUtilsKt.replaceArgumentsWithStarProjections(kotlinType2);
            }
            typeParameterDescriptor2 = kotlinType2.getConstructor().getDeclarationDescriptor();
            if (typeParameterDescriptor2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            }
            typeParameterDescriptor2 = typeParameterDescriptor2;
        }
        return (KotlinType) function0.invoke();
    }
}
