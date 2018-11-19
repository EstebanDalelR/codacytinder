package kotlin.reflect.jvm.internal.impl.renderer;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import kotlin.C15813i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class DescriptorRenderer {
    @NotNull
    @JvmField
    public static final DescriptorRenderer COMPACT = Companion.withOptions(DescriptorRenderer$Companion$COMPACT$1.INSTANCE);
    @NotNull
    @JvmField
    public static final DescriptorRenderer COMPACT_WITHOUT_SUPERTYPES = Companion.withOptions(DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1.INSTANCE);
    @NotNull
    @JvmField
    public static final DescriptorRenderer COMPACT_WITH_MODIFIERS = Companion.withOptions(DescriptorRenderer$Companion$COMPACT_WITH_MODIFIERS$1.INSTANCE);
    @NotNull
    @JvmField
    public static final DescriptorRenderer COMPACT_WITH_SHORT_TYPES = Companion.withOptions(DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1.INSTANCE);
    public static final Companion Companion = new Companion();
    @NotNull
    @JvmField
    public static final DescriptorRenderer DEBUG_TEXT = Companion.withOptions(DescriptorRenderer$Companion$DEBUG_TEXT$1.INSTANCE);
    @NotNull
    @JvmField
    public static final DescriptorRenderer FQ_NAMES_IN_TYPES = Companion.withOptions(DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1.INSTANCE);
    @NotNull
    @JvmField
    public static final DescriptorRenderer HTML = Companion.withOptions(DescriptorRenderer$Companion$HTML$1.INSTANCE);
    @NotNull
    @JvmField
    public static final DescriptorRenderer ONLY_NAMES_WITH_SHORT_TYPES = Companion.withOptions(DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1.INSTANCE);
    @NotNull
    @JvmField
    public static final DescriptorRenderer SHORT_NAMES_IN_TYPES = Companion.withOptions(DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1.INSTANCE);

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final DescriptorRenderer withOptions(@NotNull Function1<? super DescriptorRendererOptions, C15813i> function1) {
            C2668g.b(function1, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            function1.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.lock();
            return (DescriptorRenderer) new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }

        @NotNull
        public final String getClassifierKindPrefix(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
            C2668g.b(classifierDescriptorWithTypeParameters, "classifier");
            if (classifierDescriptorWithTypeParameters instanceof TypeAliasDescriptor) {
                return "typealias";
            }
            if (classifierDescriptorWithTypeParameters instanceof ClassDescriptor) {
                ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorWithTypeParameters;
                if (classDescriptor.isCompanionObject()) {
                    return "companion object";
                }
                switch (classDescriptor.getKind()) {
                    case CLASS:
                        return "class";
                    case INTERFACE:
                        return "interface";
                    case ENUM_CLASS:
                        return "enum class";
                    case OBJECT:
                        return "object";
                    case ANNOTATION_CLASS:
                        return "annotation class";
                    case ENUM_ENTRY:
                        return "enum entry";
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected classifier: ");
            stringBuilder.append(classifierDescriptorWithTypeParameters);
            throw new AssertionError(stringBuilder.toString());
        }
    }

    public interface ValueParametersHandler {

        public static final class DEFAULT implements ValueParametersHandler {
            public static final DEFAULT INSTANCE = new DEFAULT();

            public void appendBeforeValueParameter(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i, int i2, @NotNull StringBuilder stringBuilder) {
                C2668g.b(valueParameterDescriptor, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                C2668g.b(stringBuilder, "builder");
            }

            private DEFAULT() {
            }

            public void appendBeforeValueParameters(int i, @NotNull StringBuilder stringBuilder) {
                C2668g.b(stringBuilder, "builder");
                stringBuilder.append("(");
            }

            public void appendAfterValueParameters(int i, @NotNull StringBuilder stringBuilder) {
                C2668g.b(stringBuilder, "builder");
                stringBuilder.append(")");
            }

            public void appendAfterValueParameter(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i, int i2, @NotNull StringBuilder stringBuilder) {
                C2668g.b(valueParameterDescriptor, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                C2668g.b(stringBuilder, "builder");
                if (i != i2 - 1) {
                    stringBuilder.append(", ");
                }
            }
        }

        void appendAfterValueParameter(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i, int i2, @NotNull StringBuilder stringBuilder);

        void appendAfterValueParameters(int i, @NotNull StringBuilder stringBuilder);

        void appendBeforeValueParameter(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i, int i2, @NotNull StringBuilder stringBuilder);

        void appendBeforeValueParameters(int i, @NotNull StringBuilder stringBuilder);
    }

    @NotNull
    public abstract String render(@NotNull DeclarationDescriptor declarationDescriptor);

    @NotNull
    public abstract String renderAnnotation(@NotNull AnnotationDescriptor annotationDescriptor, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget);

    @NotNull
    public abstract String renderFlexibleType(@NotNull String str, @NotNull String str2, @NotNull KotlinBuiltIns kotlinBuiltIns);

    @NotNull
    public abstract String renderFqName(@NotNull FqNameUnsafe fqNameUnsafe);

    @NotNull
    public abstract String renderName(@NotNull Name name);

    @NotNull
    public abstract String renderType(@NotNull KotlinType kotlinType);

    @NotNull
    public abstract String renderTypeProjection(@NotNull TypeProjection typeProjection);

    @NotNull
    public final DescriptorRenderer withOptions(@NotNull Function1<? super DescriptorRendererOptions, C15813i> function1) {
        C2668g.b(function1, "changeOptions");
        if (this == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        }
        DescriptorRendererOptionsImpl copy = ((DescriptorRendererImpl) this).getOptions().copy();
        function1.invoke(copy);
        copy.lock();
        return (DescriptorRenderer) new DescriptorRendererImpl(copy);
    }

    @NotNull
    public static /* synthetic */ String renderAnnotation$default(DescriptorRenderer descriptorRenderer, AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        return descriptorRenderer.renderAnnotation(annotationDescriptor, annotationUseSiteTarget);
    }
}
