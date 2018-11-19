package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DisjointKeysUnionTypeSubstitution extends TypeSubstitution {
    public static final Companion Companion = new Companion();
    private final TypeSubstitution first;
    private final TypeSubstitution second;

    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final TypeSubstitution create(@NotNull TypeSubstitution typeSubstitution, @NotNull TypeSubstitution typeSubstitution2) {
            C2668g.b(typeSubstitution, "first");
            C2668g.b(typeSubstitution2, "second");
            if (typeSubstitution.isEmpty()) {
                return typeSubstitution2;
            }
            if (typeSubstitution2.isEmpty()) {
                return typeSubstitution;
            }
            return new DisjointKeysUnionTypeSubstitution(typeSubstitution, typeSubstitution2);
        }
    }

    @JvmStatic
    @NotNull
    public static final TypeSubstitution create(@NotNull TypeSubstitution typeSubstitution, @NotNull TypeSubstitution typeSubstitution2) {
        return Companion.create(typeSubstitution, typeSubstitution2);
    }

    public boolean isEmpty() {
        return false;
    }

    private DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        this.first = typeSubstitution;
        this.second = typeSubstitution2;
    }

    @Nullable
    public TypeProjection get(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "key");
        TypeProjection typeProjection = this.first.get(kotlinType);
        return typeProjection != null ? typeProjection : this.second.get(kotlinType);
    }

    @NotNull
    public KotlinType prepareTopLevelType(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        C2668g.b(kotlinType, "topLevelType");
        C2668g.b(variance, "position");
        return this.second.prepareTopLevelType(this.first.prepareTopLevelType(kotlinType, variance), variance);
    }

    public boolean approximateCapturedTypes() {
        if (!this.first.approximateCapturedTypes()) {
            if (!this.second.approximateCapturedTypes()) {
                return false;
            }
        }
        return true;
    }

    public boolean approximateContravariantCapturedTypes() {
        if (!this.first.approximateContravariantCapturedTypes()) {
            if (!this.second.approximateContravariantCapturedTypes()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public Annotations filterAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "annotations");
        return this.second.filterAnnotations(this.first.filterAnnotations(annotations));
    }
}
