package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Collection;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class UtilsKt {
    @Nullable
    public static final KotlinType findCorrespondingSupertype(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        C2668g.b(kotlinType, "subtype");
        C2668g.b(kotlinType2, "supertype");
        C2668g.b(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new SubtypePathNode(kotlinType, null));
        kotlinType = kotlinType2.getConstructor();
        while (arrayDeque.isEmpty() == null) {
            SubtypePathNode subtypePathNode = (SubtypePathNode) arrayDeque.poll();
            KotlinType type = subtypePathNode.getType();
            TypeConstructor constructor = type.getConstructor();
            KotlinType type2;
            if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor, kotlinType)) {
                boolean isMarkedNullable = type.isMarkedNullable();
                for (kotlinType2 = subtypePathNode.getPrevious(); kotlinType2 != null; kotlinType2 = kotlinType2.getPrevious()) {
                    Object obj;
                    type2 = kotlinType2.getType();
                    Iterable<TypeProjection> arguments = type2.getArguments();
                    if (!((arguments instanceof Collection) && ((Collection) arguments).isEmpty())) {
                        for (TypeProjection projectionKind : arguments) {
                            Object obj2;
                            if (projectionKind.getProjectionKind() != Variance.INVARIANT) {
                                obj2 = 1;
                                continue;
                            } else {
                                obj2 = null;
                                continue;
                            }
                            if (obj2 != null) {
                                obj = 1;
                                break;
                            }
                        }
                    }
                    obj = null;
                    if (obj != null) {
                        type = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(TypeConstructorSubstitution.Companion.create(type2), false, 1, null).buildSubstitutor().safeSubstitute(type, Variance.INVARIANT);
                        C2668g.a(type, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                        type = approximate(type);
                    } else {
                        type = TypeConstructorSubstitution.Companion.create(type2).buildSubstitutor().safeSubstitute(type, Variance.INVARIANT);
                        C2668g.a(type, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                    }
                    if (!isMarkedNullable) {
                        if (!type2.isMarkedNullable()) {
                            isMarkedNullable = false;
                        }
                    }
                    isMarkedNullable = true;
                }
                kotlinType2 = type.getConstructor();
                if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(kotlinType2, kotlinType)) {
                    return TypeUtils.makeNullableAsSpecified(type, isMarkedNullable);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Type constructors should be equals!\n");
                stringBuilder.append("substitutedSuperType: ");
                stringBuilder.append(debugInfo(kotlinType2));
                stringBuilder.append(", \n\n");
                stringBuilder.append("supertype: ");
                stringBuilder.append(debugInfo(kotlinType));
                stringBuilder.append(" \n");
                stringBuilder.append(typeCheckingProcedureCallbacks.assertEqualTypeConstructors(kotlinType2, kotlinType));
                throw new AssertionError(stringBuilder.toString());
            }
            for (KotlinType type22 : constructor.getSupertypes()) {
                C2668g.a(type22, "immediateSupertype");
                arrayDeque.add(new SubtypePathNode(type22, subtypePathNode));
            }
        }
        return null;
    }

    private static final KotlinType approximate(@NotNull KotlinType kotlinType) {
        return (KotlinType) CapturedTypeApproximationKt.approximateCapturedTypes(kotlinType).getUpper();
    }

    private static final String debugInfo(@NotNull TypeConstructor typeConstructor) {
        StringBuilder stringBuilder = new StringBuilder();
        UtilsKt$debugInfo$1$1 utilsKt$debugInfo$1$1 = new UtilsKt$debugInfo$1$1(stringBuilder);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("type: ");
        stringBuilder2.append(typeConstructor);
        utilsKt$debugInfo$1$1.invoke(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("hashCode: ");
        stringBuilder2.append(typeConstructor.hashCode());
        utilsKt$debugInfo$1$1.invoke(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("javaClass: ");
        stringBuilder2.append(typeConstructor.getClass().getCanonicalName());
        utilsKt$debugInfo$1$1.invoke(stringBuilder2.toString());
        for (typeConstructor = typeConstructor.getDeclarationDescriptor(); typeConstructor != null; typeConstructor = typeConstructor.getContainingDeclaration()) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("fqName: ");
            stringBuilder2.append(DescriptorRenderer.FQ_NAMES_IN_TYPES.render(typeConstructor));
            utilsKt$debugInfo$1$1.invoke(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("javaClass: ");
            stringBuilder2.append(typeConstructor.getClass().getCanonicalName());
            utilsKt$debugInfo$1$1.invoke(stringBuilder2.toString());
        }
        typeConstructor = stringBuilder.toString();
        C2668g.a(typeConstructor, "StringBuilder().apply(builderAction).toString()");
        return typeConstructor;
    }
}
