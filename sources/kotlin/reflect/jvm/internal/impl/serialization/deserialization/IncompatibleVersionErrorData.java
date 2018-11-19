package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;

public final class IncompatibleVersionErrorData<T extends BinaryVersion> {
    @NotNull
    private final T actualVersion;
    @NotNull
    private final ClassId classId;
    @NotNull
    private final T expectedVersion;
    @NotNull
    private final String filePath;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IncompatibleVersionErrorData) {
                IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
                if (C2668g.a(this.actualVersion, incompatibleVersionErrorData.actualVersion) && C2668g.a(this.expectedVersion, incompatibleVersionErrorData.expectedVersion) && C2668g.a(this.filePath, incompatibleVersionErrorData.filePath) && C2668g.a(this.classId, incompatibleVersionErrorData.classId)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        BinaryVersion binaryVersion = this.actualVersion;
        int i = 0;
        int hashCode = (binaryVersion != null ? binaryVersion.hashCode() : 0) * 31;
        BinaryVersion binaryVersion2 = this.expectedVersion;
        hashCode = (hashCode + (binaryVersion2 != null ? binaryVersion2.hashCode() : 0)) * 31;
        String str = this.filePath;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        ClassId classId = this.classId;
        if (classId != null) {
            i = classId.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IncompatibleVersionErrorData(actualVersion=");
        stringBuilder.append(this.actualVersion);
        stringBuilder.append(", expectedVersion=");
        stringBuilder.append(this.expectedVersion);
        stringBuilder.append(", filePath=");
        stringBuilder.append(this.filePath);
        stringBuilder.append(", classId=");
        stringBuilder.append(this.classId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public IncompatibleVersionErrorData(@NotNull T t, @NotNull T t2, @NotNull String str, @NotNull ClassId classId) {
        C2668g.b(t, "actualVersion");
        C2668g.b(t2, "expectedVersion");
        C2668g.b(str, "filePath");
        C2668g.b(classId, "classId");
        this.actualVersion = t;
        this.expectedVersion = t2;
        this.filePath = str;
        this.classId = classId;
    }
}
