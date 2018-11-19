package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.tinder.domain.config.model.ProfileEditingConfig;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

public final class TypeMappingMode {
    @NotNull
    @JvmField
    public static final TypeMappingMode CLASS_DECLARATION = new TypeMappingMode(false, true, false, false, false, GENERIC_ARGUMENT, false, null, null, 476, null);
    public static final Companion Companion = new Companion();
    @NotNull
    @JvmField
    public static final TypeMappingMode DEFAULT = new TypeMappingMode(false, false, false, false, false, GENERIC_ARGUMENT, false, null, null, 476, null);
    @NotNull
    @JvmField
    public static final TypeMappingMode GENERIC_ARGUMENT = new TypeMappingMode(false, false, false, false, false, null, false, null, null, 511, null);
    @NotNull
    @JvmField
    public static final TypeMappingMode RETURN_TYPE_BOXED = new TypeMappingMode(false, true, false, false, false, null, false, null, null, 509, null);
    @NotNull
    @JvmField
    public static final TypeMappingMode SUPER_TYPE = new TypeMappingMode(false, false, false, true, false, GENERIC_ARGUMENT, false, null, null, 471, null);
    @NotNull
    @JvmField
    public static final TypeMappingMode SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS = new TypeMappingMode(false, false, false, true, false, GENERIC_ARGUMENT, false, null, null, 407, null);
    @NotNull
    @JvmField
    public static final TypeMappingMode VALUE_FOR_ANNOTATION = new TypeMappingMode(false, false, true, false, false, new TypeMappingMode(false, false, true, false, false, GENERIC_ARGUMENT, false, null, null, 475, null), false, null, null, 474, null);
    private final TypeMappingMode genericArgumentMode;
    private final TypeMappingMode genericContravariantArgumentMode;
    private final TypeMappingMode genericInvariantArgumentMode;
    private final boolean isForAnnotationParameter;
    private final boolean kotlinCollectionsToJavaCollections;
    private final boolean needInlineClassWrapping;
    private final boolean needPrimitiveBoxing;
    private final boolean skipDeclarationSiteWildcards;
    private final boolean skipDeclarationSiteWildcardsIfPossible;

    public static final class Companion {
        private Companion() {
        }
    }

    private TypeMappingMode(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TypeMappingMode typeMappingMode, boolean z6, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3) {
        this.needPrimitiveBoxing = z;
        this.needInlineClassWrapping = z2;
        this.isForAnnotationParameter = z3;
        this.skipDeclarationSiteWildcards = z4;
        this.skipDeclarationSiteWildcardsIfPossible = z5;
        this.genericArgumentMode = typeMappingMode;
        this.kotlinCollectionsToJavaCollections = z6;
        this.genericContravariantArgumentMode = typeMappingMode2;
        this.genericInvariantArgumentMode = typeMappingMode3;
    }

    public final boolean getNeedPrimitiveBoxing() {
        return this.needPrimitiveBoxing;
    }

    public final boolean getNeedInlineClassWrapping() {
        return this.needInlineClassWrapping;
    }

    public final boolean isForAnnotationParameter() {
        return this.isForAnnotationParameter;
    }

    /* synthetic */ TypeMappingMode(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TypeMappingMode typeMappingMode, boolean z6, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, int i, C15823e c15823e) {
        int i2 = i;
        boolean z7 = (i2 & 1) != 0 ? true : z;
        boolean z8 = (i2 & 2) != 0 ? true : z2;
        boolean z9 = (i2 & 4) != 0 ? false : z3;
        boolean z10 = (i2 & 8) != 0 ? false : z4;
        boolean z11 = (i2 & 16) != 0 ? false : z5;
        TypeMappingMode typeMappingMode4 = (i2 & 32) != 0 ? (TypeMappingMode) null : typeMappingMode;
        this(z7, z8, z9, z10, z11, typeMappingMode4, (i2 & 64) != 0 ? true : z6, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? typeMappingMode4 : typeMappingMode2, (i2 & 256) != 0 ? typeMappingMode4 : typeMappingMode3);
    }

    public final boolean getKotlinCollectionsToJavaCollections() {
        return this.kotlinCollectionsToJavaCollections;
    }

    @NotNull
    public final TypeMappingMode toGenericArgumentMode(@NotNull Variance variance) {
        C2668g.b(variance, "effectiveVariance");
        switch (variance) {
            case IN_VARIANCE:
                variance = this.genericContravariantArgumentMode;
                if (variance != null) {
                    return variance;
                }
                break;
            case INVARIANT:
                variance = this.genericInvariantArgumentMode;
                if (variance != null) {
                    return variance;
                }
                break;
            default:
                variance = this.genericArgumentMode;
                if (variance != null) {
                    return variance;
                }
                break;
        }
        return this;
    }

    @NotNull
    public final TypeMappingMode wrapInlineClassesMode() {
        return new TypeMappingMode(this.needPrimitiveBoxing, true, this.isForAnnotationParameter, this.skipDeclarationSiteWildcards, this.skipDeclarationSiteWildcardsIfPossible, this.genericArgumentMode, this.kotlinCollectionsToJavaCollections, this.genericContravariantArgumentMode, this.genericInvariantArgumentMode);
    }
}
