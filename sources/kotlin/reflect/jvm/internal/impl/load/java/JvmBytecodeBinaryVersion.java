package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.BinaryVersion;
import org.jetbrains.annotations.NotNull;

public final class JvmBytecodeBinaryVersion extends BinaryVersion {
    public static final Companion Companion = new Companion();
    @NotNull
    @JvmField
    public static final JvmBytecodeBinaryVersion INSTANCE = new JvmBytecodeBinaryVersion(1, 0, 2);
    @NotNull
    @JvmField
    public static final JvmBytecodeBinaryVersion INVALID_VERSION = new JvmBytecodeBinaryVersion(new int[0]);

    public static final class Companion {
        private Companion() {
        }
    }

    public JvmBytecodeBinaryVersion(@NotNull int... iArr) {
        C2668g.b(iArr, "numbers");
        super(Arrays.copyOf(iArr, iArr.length));
    }
}
