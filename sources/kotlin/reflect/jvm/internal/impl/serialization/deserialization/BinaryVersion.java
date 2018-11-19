package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C17554o;
import kotlin.collections.C18456j;
import kotlin.collections.C19066k;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class BinaryVersion {
    public static final Companion Companion = new Companion();
    private static final int UNKNOWN = -1;
    private final int major;
    private final int minor;
    @NotNull
    private final int[] numbers;
    private final int patch;
    @NotNull
    private final List<Integer> rest;

    public static final class Companion {
        private Companion() {
        }
    }

    public BinaryVersion(@NotNull int... iArr) {
        C2668g.b(iArr, "numbers");
        this.numbers = iArr;
        iArr = C19066k.m67983b(this.numbers, 0);
        this.major = iArr != null ? iArr.intValue() : UNKNOWN;
        iArr = C19066k.m67983b(this.numbers, 1);
        this.minor = iArr != null ? iArr.intValue() : UNKNOWN;
        iArr = C19066k.m67983b(this.numbers, 2);
        this.patch = iArr != null ? iArr.intValue() : UNKNOWN;
        this.rest = this.numbers.length > 3 ? C19299w.m68840l(C18456j.m66902a(this.numbers).subList(3, this.numbers.length)) : C17554o.m64195a();
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    @NotNull
    public final int[] toArray() {
        return this.numbers;
    }

    protected final boolean isCompatibleTo(@NotNull BinaryVersion binaryVersion) {
        C2668g.b(binaryVersion, "ourVersion");
        if (this.major == 0) {
            if (!(binaryVersion.major == 0 && this.minor == binaryVersion.minor)) {
                return false;
            }
        } else if (this.major != binaryVersion.major || this.minor > binaryVersion.minor) {
            return false;
        }
        return true;
    }

    @NotNull
    public String toString() {
        int[] toArray = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i : toArray) {
            if ((i != UNKNOWN ? 1 : null) == null) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        List list = arrayList;
        return list.isEmpty() ? "unknown" : C19299w.m68797a(list, ".", null, null, 0, null, null, 62, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != null && C2668g.a(getClass(), obj.getClass())) {
            BinaryVersion binaryVersion = (BinaryVersion) obj;
            if (this.major == binaryVersion.major && this.minor == binaryVersion.minor && this.patch == binaryVersion.patch && C2668g.a(this.rest, binaryVersion.rest) != null) {
                return true;
            }
        }
        return null;
    }

    public int hashCode() {
        int i = this.major;
        i += (i * 31) + this.minor;
        i += (i * 31) + this.patch;
        return i + ((i * 31) + this.rest.hashCode());
    }
}
