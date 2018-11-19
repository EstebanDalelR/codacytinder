package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.C15823e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaTypeQualifiers {
    public static final Companion Companion = new Companion();
    @NotNull
    private static final JavaTypeQualifiers NONE = new JavaTypeQualifiers(null, null, false, false, 8, null);
    private final boolean isNotNullTypeParameter;
    private final boolean isNullabilityQualifierForWarning;
    @Nullable
    private final MutabilityQualifier mutability;
    @Nullable
    private final NullabilityQualifier nullability;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final JavaTypeQualifiers getNONE() {
            return JavaTypeQualifiers.NONE;
        }
    }

    public JavaTypeQualifiers(@Nullable NullabilityQualifier nullabilityQualifier, @Nullable MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        this.nullability = nullabilityQualifier;
        this.mutability = mutabilityQualifier;
        this.isNotNullTypeParameter = z;
        this.isNullabilityQualifierForWarning = z2;
    }

    @Nullable
    public final NullabilityQualifier getNullability() {
        return this.nullability;
    }

    @Nullable
    public final MutabilityQualifier getMutability() {
        return this.mutability;
    }

    public final boolean isNotNullTypeParameter$descriptors_jvm() {
        return this.isNotNullTypeParameter;
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i, C15823e c15823e) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        this(nullabilityQualifier, mutabilityQualifier, z, z2);
    }

    public final boolean isNullabilityQualifierForWarning$descriptors_jvm() {
        return this.isNullabilityQualifierForWarning;
    }
}
