package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class ModalityKt {
    public static final boolean isFinalClass(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "$receiver");
        return (classDescriptor.getModality() != Modality.FINAL || classDescriptor.getKind() == ClassKind.ENUM_CLASS) ? null : true;
    }
}
