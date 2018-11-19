package kotlin.reflect.jvm.internal.impl.types;

import kotlin.C15813i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure.EnrichedProjectionKind;
import org.jetbrains.annotations.NotNull;

public final class VarianceCheckerKt {
    public static final <D extends TypeHolder<? extends D>> boolean checkTypePosition(@NotNull D d, @NotNull Variance variance, @NotNull Function3<? super TypeParameterDescriptor, ? super D, ? super Variance, C15813i> function3, @NotNull Function1<? super TypeParameterDescriptor, ? extends Variance> function1) {
        C2668g.b(d, "$receiver");
        C2668g.b(variance, "position");
        C2668g.b(function3, "reportError");
        C2668g.b(function1, "customVariance");
        Pair flexibleBounds = d.getFlexibleBounds();
        if (flexibleBounds != null) {
            return checkTypePosition((TypeHolder) flexibleBounds.m59803a(), variance, function3, function1) & checkTypePosition((TypeHolder) flexibleBounds.m59804b(), variance, function3, function1);
        }
        ClassifierDescriptor declarationDescriptor = d.getType().getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof TypeParameterDescriptor) {
            function1 = (Variance) function1.invoke(declarationDescriptor);
            if (function1 == null) {
                function1 = ((TypeParameterDescriptor) declarationDescriptor).getVariance();
                C2668g.a(function1, "classifierDescriptor.variance");
            }
            if (!function1.allowsPosition(variance)) {
                Annotations annotations = d.getType().getAnnotations();
                FqName fqName = KotlinBuiltIns.FQ_NAMES.unsafeVariance;
                C2668g.a(fqName, "kotlin.reflect.jvm.internal.impl.bui…s.FQ_NAMES.unsafeVariance");
                if (!annotations.hasAnnotation(fqName)) {
                    function3.invoke(declarationDescriptor, d, variance);
                }
            }
            return function1.allowsPosition(variance);
        }
        boolean z = true;
        for (TypeHolderArgument typeHolderArgument : d.getArguments()) {
            Variance variance2 = null;
            if ((typeHolderArgument != null ? typeHolderArgument.getTypeParameter() : null) != null) {
                if (!typeHolderArgument.getProjection().isStarProjection()) {
                    TypeParameterDescriptor typeParameter = typeHolderArgument.getTypeParameter();
                    if (typeParameter == null) {
                        C2668g.a();
                    }
                    EnrichedProjectionKind effectiveProjectionKind = TypeCheckingProcedure.getEffectiveProjectionKind(typeParameter, typeHolderArgument.getProjection());
                    if (effectiveProjectionKind == null) {
                        C2668g.a();
                    }
                    switch (effectiveProjectionKind) {
                        case OUT:
                            variance2 = variance;
                            break;
                        case IN:
                            variance2 = variance.opposite();
                            break;
                        case INV:
                            variance2 = Variance.INVARIANT;
                            break;
                        case STAR:
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    if (variance2 != null) {
                        z &= checkTypePosition(typeHolderArgument.getHolder(), variance2, function3, function1);
                    }
                }
            }
        }
        return z;
    }
}
