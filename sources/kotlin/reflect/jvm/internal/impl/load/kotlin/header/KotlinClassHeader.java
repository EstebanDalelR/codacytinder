package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C17554o;
import kotlin.collections.C18456j;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18464j;
import kotlin.reflect.jvm.internal.impl.load.java.JvmBytecodeBinaryVersion;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmMetadataVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class KotlinClassHeader {
    @NotNull
    private final JvmBytecodeBinaryVersion bytecodeVersion;
    @Nullable
    private final String[] data;
    private final int extraInt;
    @Nullable
    private final String extraString;
    @Nullable
    private final String[] incompatibleData;
    @NotNull
    private final Kind kind;
    @NotNull
    private final JvmMetadataVersion metadataVersion;
    @Nullable
    private final String packageName;
    @Nullable
    private final String[] strings;

    public enum Kind {
        ;
        
        public static final Companion Companion = null;
        private static final Map<Integer, Kind> entryById = null;
        private final int id;

        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            @NotNull
            public final Kind getById(int i) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i));
                return kind != null ? kind : Kind.UNKNOWN;
            }
        }

        @JvmStatic
        @NotNull
        public static final Kind getById(int i) {
            return Companion.getById(i);
        }

        protected Kind(int i) {
            this.id = i;
        }

        static {
            Companion = new Companion();
            Kind[] values = values();
            Map linkedHashMap = new LinkedHashMap(C18464j.m66926c(ah.m66883a(values.length), 16));
            int length = values.length;
            int i;
            while (i < length) {
                Kind kind = values[i];
                linkedHashMap.put(Integer.valueOf(kind.id), kind);
                i++;
            }
            entryById = linkedHashMap;
        }
    }

    public KotlinClassHeader(@NotNull Kind kind, @NotNull JvmMetadataVersion jvmMetadataVersion, @NotNull JvmBytecodeBinaryVersion jvmBytecodeBinaryVersion, @Nullable String[] strArr, @Nullable String[] strArr2, @Nullable String[] strArr3, @Nullable String str, int i, @Nullable String str2) {
        C2668g.b(kind, "kind");
        C2668g.b(jvmMetadataVersion, "metadataVersion");
        C2668g.b(jvmBytecodeBinaryVersion, "bytecodeVersion");
        this.kind = kind;
        this.metadataVersion = jvmMetadataVersion;
        this.bytecodeVersion = jvmBytecodeBinaryVersion;
        this.data = strArr;
        this.incompatibleData = strArr2;
        this.strings = strArr3;
        this.extraString = str;
        this.extraInt = i;
        this.packageName = str2;
    }

    @NotNull
    public final Kind getKind() {
        return this.kind;
    }

    @NotNull
    public final JvmMetadataVersion getMetadataVersion() {
        return this.metadataVersion;
    }

    @Nullable
    public final String[] getData() {
        return this.data;
    }

    @Nullable
    public final String[] getIncompatibleData() {
        return this.incompatibleData;
    }

    @Nullable
    public final String[] getStrings() {
        return this.strings;
    }

    @Nullable
    public final String getMultifileClassName() {
        return (this.kind == Kind.MULTIFILE_CLASS_PART ? 1 : null) != null ? this.extraString : null;
    }

    @NotNull
    public final List<String> getMultifilePartNames() {
        Object[] objArr = this.data;
        List<String> list = null;
        if ((this.kind == Kind.MULTIFILE_CLASS ? 1 : null) == null) {
            objArr = null;
        }
        if (objArr != null) {
            list = C18456j.m66903a(objArr);
        }
        return list != null ? list : C17554o.m64195a();
    }

    public final boolean isPreRelease() {
        return (this.extraInt & 2) != 0;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.kind);
        stringBuilder.append(" version=");
        stringBuilder.append(this.metadataVersion);
        return stringBuilder.toString();
    }
}
