package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationWithTarget;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public final class NonEmptyDeserializedAnnotationsWithPossibleTargets extends DeserializedAnnotationsWithPossibleTargets {
    public boolean isEmpty() {
        return false;
    }

    public NonEmptyDeserializedAnnotationsWithPossibleTargets(@NotNull StorageManager storageManager, @NotNull Function0<? extends List<AnnotationWithTarget>> function0) {
        C2668g.b(storageManager, "storageManager");
        C2668g.b(function0, "compute");
        super(storageManager, function0);
    }
}
