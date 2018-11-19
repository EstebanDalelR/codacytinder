package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class TypeSubstitution {
    public static final Companion Companion = new Companion();
    @NotNull
    @JvmField
    public static final TypeSubstitution EMPTY = new TypeSubstitution$Companion$EMPTY$1();

    public static final class Companion {
        private Companion() {
        }
    }

    public boolean approximateCapturedTypes() {
        return false;
    }

    public boolean approximateContravariantCapturedTypes() {
        return false;
    }

    @NotNull
    public Annotations filterAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "annotations");
        return annotations;
    }

    @Nullable
    public abstract TypeProjection get(@NotNull KotlinType kotlinType);

    public boolean isEmpty() {
        return false;
    }

    @NotNull
    public KotlinType prepareTopLevelType(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        C2668g.b(kotlinType, "topLevelType");
        C2668g.b(variance, "position");
        return kotlinType;
    }

    @NotNull
    public final TypeSubstitutor buildSubstitutor() {
        TypeSubstitutor create = TypeSubstitutor.create(this);
        C2668g.a(create, "TypeSubstitutor.create(this)");
        return create;
    }
}
