package kotlin.reflect.jvm.internal.impl.types;

import kotlin.C15819j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class FlexibleTypeImpl extends FlexibleType implements CustomTypeVariable {
    public static final Companion Companion = new Companion();
    @JvmField
    public static boolean RUN_SLOW_ASSERTIONS;
    private boolean assertionsDone;

    public static final class Companion {
        private Companion() {
        }
    }

    public FlexibleTypeImpl(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        C2668g.b(simpleType, "lowerBound");
        C2668g.b(simpleType2, "upperBound");
        super(simpleType, simpleType2);
    }

    private final void runAssertions() {
        if (RUN_SLOW_ASSERTIONS) {
            if (!this.assertionsDone) {
                this.assertionsDone = true;
                int isFlexible = FlexibleTypesKt.isFlexible(getLowerBound()) ^ 1;
                StringBuilder stringBuilder;
                if (C15819j.f49018a && isFlexible == 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Lower bound of a flexible type can not be flexible: ");
                    stringBuilder.append(getLowerBound());
                    throw new AssertionError(stringBuilder.toString());
                }
                isFlexible = FlexibleTypesKt.isFlexible(getUpperBound()) ^ 1;
                if (C15819j.f49018a && isFlexible == 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Upper bound of a flexible type can not be flexible: ");
                    stringBuilder.append(getUpperBound());
                    throw new AssertionError(stringBuilder.toString());
                }
                int a = 1 ^ C2668g.a(getLowerBound(), getUpperBound());
                if (C15819j.f49018a && a == 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Lower and upper bounds are equal: ");
                    stringBuilder.append(getLowerBound());
                    stringBuilder.append(" == ");
                    stringBuilder.append(getUpperBound());
                    throw new AssertionError(stringBuilder.toString());
                }
                boolean isSubtypeOf = KotlinTypeChecker.DEFAULT.isSubtypeOf(getLowerBound(), getUpperBound());
                if (C15819j.f49018a && !isSubtypeOf) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Lower bound ");
                    stringBuilder.append(getLowerBound());
                    stringBuilder.append(" of a flexible type must be a subtype of the upper bound ");
                    stringBuilder.append(getUpperBound());
                    throw new AssertionError(stringBuilder.toString());
                }
            }
        }
    }

    @NotNull
    public SimpleType getDelegate() {
        runAssertions();
        return getLowerBound();
    }

    public boolean isTypeVariable() {
        return (getLowerBound().getConstructor().getDeclarationDescriptor() instanceof TypeParameterDescriptor) && C2668g.a(getLowerBound().getConstructor(), getUpperBound().getConstructor());
    }

    @NotNull
    public KotlinType substitutionResult(@NotNull KotlinType kotlinType) {
        UnwrappedType unwrappedType;
        C2668g.b(kotlinType, "replacement");
        kotlinType = kotlinType.unwrap();
        if (kotlinType instanceof FlexibleType) {
            unwrappedType = kotlinType;
        } else if (kotlinType instanceof SimpleType) {
            SimpleType simpleType = (SimpleType) kotlinType;
            unwrappedType = KotlinTypeFactory.flexibleType(simpleType, simpleType.makeNullableAsSpecified(true));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return TypeWithEnhancementKt.inheritEnhancement(unwrappedType, kotlinType);
    }

    @NotNull
    public UnwrappedType replaceAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "newAnnotations");
        return KotlinTypeFactory.flexibleType(getLowerBound().replaceAnnotations(annotations), getUpperBound().replaceAnnotations(annotations));
    }

    @NotNull
    public String render(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions) {
        C2668g.b(descriptorRenderer, "renderer");
        C2668g.b(descriptorRendererOptions, "options");
        if (descriptorRendererOptions.getDebugMode() == null) {
            return descriptorRenderer.renderFlexibleType(descriptorRenderer.renderType(getLowerBound()), descriptorRenderer.renderType(getUpperBound()), TypeUtilsKt.getBuiltIns(this));
        }
        descriptorRendererOptions = new StringBuilder();
        descriptorRendererOptions.append('(');
        descriptorRendererOptions.append(descriptorRenderer.renderType(getLowerBound()));
        descriptorRendererOptions.append("..");
        descriptorRendererOptions.append(descriptorRenderer.renderType(getUpperBound()));
        descriptorRendererOptions.append(')');
        return descriptorRendererOptions.toString();
    }

    @NotNull
    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return KotlinTypeFactory.flexibleType(getLowerBound().makeNullableAsSpecified(z), getUpperBound().makeNullableAsSpecified(z));
    }
}
