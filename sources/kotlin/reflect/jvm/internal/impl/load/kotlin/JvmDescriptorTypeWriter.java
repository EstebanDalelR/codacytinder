package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JvmDescriptorTypeWriter<T> {
    @Nullable
    private T jvmCurrentType;
    private int jvmCurrentTypeArrayLevel;
    private final JvmTypeFactory<T> jvmTypeFactory;

    public void writeArrayEnd() {
    }

    public void writeArrayType() {
        if (this.jvmCurrentType == null) {
            this.jvmCurrentTypeArrayLevel++;
            int i = this.jvmCurrentTypeArrayLevel;
        }
    }

    public void writeClass(@NotNull T t) {
        C2668g.b(t, "objectType");
        writeJvmTypeAsIs(t);
    }

    protected final void writeJvmTypeAsIs(@NotNull T t) {
        C2668g.b(t, "type");
        if (this.jvmCurrentType == null) {
            JvmTypeFactory jvmTypeFactory = this.jvmTypeFactory;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C19296q.m68668a("[", this.jvmCurrentTypeArrayLevel));
            stringBuilder.append(this.jvmTypeFactory.toString(t));
            this.jvmCurrentType = jvmTypeFactory.createFromString(stringBuilder.toString());
        }
    }

    public void writeTypeVariable(@NotNull Name name, @NotNull T t) {
        C2668g.b(name, "name");
        C2668g.b(t, "type");
        writeJvmTypeAsIs(t);
    }
}
