package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class JvmType {

    public static final class Array extends JvmType {
        @NotNull
        private final JvmType elementType;

        public Array(@NotNull JvmType jvmType) {
            C2668g.b(jvmType, "elementType");
            super();
            this.elementType = jvmType;
        }

        @NotNull
        public final JvmType getElementType() {
            return this.elementType;
        }
    }

    public static final class Object extends JvmType {
        @NotNull
        private final String internalName;

        public Object(@NotNull String str) {
            C2668g.b(str, "internalName");
            super();
            this.internalName = str;
        }

        @NotNull
        public final String getInternalName() {
            return this.internalName;
        }
    }

    public static final class Primitive extends JvmType {
        @Nullable
        private final JvmPrimitiveType jvmPrimitiveType;

        public Primitive(@Nullable JvmPrimitiveType jvmPrimitiveType) {
            super();
            this.jvmPrimitiveType = jvmPrimitiveType;
        }

        @Nullable
        public final JvmPrimitiveType getJvmPrimitiveType() {
            return this.jvmPrimitiveType;
        }
    }

    private JvmType() {
    }

    @NotNull
    public String toString() {
        return JvmTypeFactoryImpl.INSTANCE.toString(this);
    }
}
