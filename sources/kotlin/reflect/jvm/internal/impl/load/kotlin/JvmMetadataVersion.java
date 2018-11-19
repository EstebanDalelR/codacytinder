package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Arrays;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.BinaryVersion;
import org.jetbrains.annotations.NotNull;

public final class JvmMetadataVersion extends BinaryVersion {
    public static final Companion Companion = new Companion();
    @NotNull
    @JvmField
    public static final JvmMetadataVersion INSTANCE = new JvmMetadataVersion(1, 1, 10);
    @NotNull
    @JvmField
    public static final JvmMetadataVersion INVALID_VERSION = new JvmMetadataVersion(new int[0]);

    public static final class Companion {
        private Companion() {
        }
    }

    public JvmMetadataVersion(@NotNull int... iArr) {
        C2668g.b(iArr, "numbers");
        super(Arrays.copyOf(iArr, iArr.length));
    }

    public boolean isCompatible() {
        return getMajor() == 1 && getMinor() == 1;
    }
}
