package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

public class JvmClassName {
    private FqName fqName;
    private final String internalName;

    @NotNull
    public static JvmClassName byInternalName(@NotNull String str) {
        return new JvmClassName(str);
    }

    @NotNull
    public static JvmClassName byClassId(@NotNull ClassId classId) {
        FqName packageFqName = classId.getPackageFqName();
        classId = classId.getRelativeClassName().asString().replace('.', '$');
        if (packageFqName.isRoot()) {
            return new JvmClassName(classId);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(packageFqName.asString().replace('.', '/'));
        stringBuilder.append("/");
        stringBuilder.append(classId);
        return new JvmClassName(stringBuilder.toString());
    }

    @NotNull
    public static JvmClassName byFqNameWithoutInnerClasses(@NotNull FqName fqName) {
        JvmClassName jvmClassName = new JvmClassName(fqName.asString().replace('.', '/'));
        jvmClassName.fqName = fqName;
        return jvmClassName;
    }

    private JvmClassName(@NotNull String str) {
        this.internalName = str;
    }

    @NotNull
    public FqName getFqNameForTopLevelClassMaybeWithDollars() {
        return new FqName(this.internalName.replace('/', '.'));
    }

    @NotNull
    public FqName getPackageFqName() {
        int lastIndexOf = this.internalName.lastIndexOf("/");
        if (lastIndexOf == -1) {
            return FqName.ROOT;
        }
        return new FqName(this.internalName.substring(0, lastIndexOf).replace('/', '.'));
    }

    @NotNull
    public String getInternalName() {
        return this.internalName;
    }

    public String toString() {
        return this.internalName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return this.internalName.equals(((JvmClassName) obj).internalName);
            }
        }
        return null;
    }

    public int hashCode() {
        return this.internalName.hashCode();
    }
}
