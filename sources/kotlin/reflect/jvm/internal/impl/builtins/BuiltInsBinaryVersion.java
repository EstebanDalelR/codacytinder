package kotlin.reflect.jvm.internal.impl.builtins;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.collections.ab;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.BinaryVersion;
import org.jetbrains.annotations.NotNull;

public final class BuiltInsBinaryVersion extends BinaryVersion {
    public static final Companion Companion = new Companion();
    @NotNull
    @JvmField
    public static final BuiltInsBinaryVersion INSTANCE = new BuiltInsBinaryVersion(1, 0, 2);
    @NotNull
    @JvmField
    public static final BuiltInsBinaryVersion INVALID_VERSION = new BuiltInsBinaryVersion(new int[0]);

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final BuiltInsBinaryVersion readFrom(@NotNull InputStream inputStream) {
            C2668g.b(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            Iterable iterable = (Iterable) new C18461c(1, dataInputStream.readInt());
            Collection arrayList = new ArrayList(C18457p.m66906a(iterable, 10));
            inputStream = iterable.iterator();
            while (inputStream.hasNext()) {
                ((ab) inputStream).mo13805b();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            inputStream = C19299w.m68818c((Collection) (List) arrayList);
            return new BuiltInsBinaryVersion(Arrays.copyOf(inputStream, inputStream.length));
        }
    }

    public BuiltInsBinaryVersion(@NotNull int... iArr) {
        C2668g.b(iArr, "numbers");
        super(Arrays.copyOf(iArr, iArr.length));
    }

    public boolean isCompatible() {
        return isCompatibleTo(INSTANCE);
    }
}
