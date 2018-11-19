package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;

public final class BinaryModuleData {
    @NotNull
    private final List<ClassId> annotations;

    public BinaryModuleData(@NotNull List<ClassId> list) {
        C2668g.b(list, "annotations");
        this.annotations = list;
    }
}
