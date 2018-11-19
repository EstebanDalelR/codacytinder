package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

public final class NewKotlinTypeCheckerKt {
    public static final boolean isClassType(@NotNull SimpleType simpleType) {
        C2668g.b(simpleType, "$receiver");
        return simpleType.getConstructor().getDeclarationDescriptor() instanceof ClassDescriptor;
    }

    public static final boolean isSingleClassifierType(@NotNull SimpleType simpleType) {
        C2668g.b(simpleType, "$receiver");
        return (KotlinTypeKt.isError((KotlinType) simpleType) || (simpleType.getConstructor().getDeclarationDescriptor() instanceof TypeAliasDescriptor) || (simpleType.getConstructor().getDeclarationDescriptor() == null && !(simpleType instanceof CapturedType) && !(simpleType instanceof NewCapturedType) && (simpleType instanceof DefinitelyNotNullType) == null)) ? null : true;
    }

    public static final boolean isIntersectionType(@NotNull SimpleType simpleType) {
        C2668g.b(simpleType, "$receiver");
        return simpleType.getConstructor() instanceof IntersectionTypeConstructor;
    }
}
