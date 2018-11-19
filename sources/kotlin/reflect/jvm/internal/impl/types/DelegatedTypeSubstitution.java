package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DelegatedTypeSubstitution extends TypeSubstitution {
    @NotNull
    private final TypeSubstitution substitution;

    public DelegatedTypeSubstitution(@NotNull TypeSubstitution typeSubstitution) {
        C2668g.b(typeSubstitution, "substitution");
        this.substitution = typeSubstitution;
    }

    @Nullable
    public TypeProjection get(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "key");
        return this.substitution.get(kotlinType);
    }

    @NotNull
    public KotlinType prepareTopLevelType(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        C2668g.b(kotlinType, "topLevelType");
        C2668g.b(variance, "position");
        return this.substitution.prepareTopLevelType(kotlinType, variance);
    }

    public boolean isEmpty() {
        return this.substitution.isEmpty();
    }

    public boolean approximateCapturedTypes() {
        return this.substitution.approximateCapturedTypes();
    }

    public boolean approximateContravariantCapturedTypes() {
        return this.substitution.approximateContravariantCapturedTypes();
    }

    @NotNull
    public Annotations filterAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "annotations");
        return this.substitution.filterAnnotations(annotations);
    }
}
