package kotlin.reflect.jvm.internal.impl.name;

import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ClassId {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean local;
    private final FqName packageFqName;
    private final FqName relativeClassName;

    @NotNull
    public static ClassId topLevel(@NotNull FqName fqName) {
        return new ClassId(fqName.parent(), fqName.shortName());
    }

    public ClassId(@NotNull FqName fqName, @NotNull FqName fqName2, boolean z) {
        this.packageFqName = fqName;
        this.relativeClassName = fqName2;
        this.local = z;
    }

    public ClassId(@NotNull FqName fqName, @NotNull Name name) {
        this(fqName, FqName.topLevel(name), false);
    }

    @NotNull
    public FqName getPackageFqName() {
        return this.packageFqName;
    }

    @NotNull
    public FqName getRelativeClassName() {
        return this.relativeClassName;
    }

    @NotNull
    public Name getShortClassName() {
        return this.relativeClassName.shortName();
    }

    public boolean isLocal() {
        return this.local;
    }

    @NotNull
    public ClassId createNestedClassId(@NotNull Name name) {
        return new ClassId(getPackageFqName(), this.relativeClassName.child(name), this.local);
    }

    @Nullable
    public ClassId getOuterClassId() {
        FqName parent = this.relativeClassName.parent();
        return parent.isRoot() ? null : new ClassId(getPackageFqName(), parent, this.local);
    }

    public boolean isNestedClass() {
        return this.relativeClassName.parent().isRoot() ^ 1;
    }

    @NotNull
    public FqName asSingleFqName() {
        if (this.packageFqName.isRoot()) {
            return this.relativeClassName;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.packageFqName.asString());
        stringBuilder.append(".");
        stringBuilder.append(this.relativeClassName.asString());
        return new FqName(stringBuilder.toString());
    }

    @NotNull
    public static ClassId fromString(@NotNull String str, boolean z) {
        return new ClassId(new FqName(C19298r.m68787c(str, '/', "").replace('/', '.')), new FqName(C19298r.m68792d(str, '/', str)), z);
    }

    @NotNull
    public String asString() {
        if (this.packageFqName.isRoot()) {
            return this.relativeClassName.asString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.packageFqName.asString().replace('.', '/'));
        stringBuilder.append("/");
        stringBuilder.append(this.relativeClassName.asString());
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                ClassId classId = (ClassId) obj;
                if (!this.packageFqName.equals(classId.packageFqName) || !this.relativeClassName.equals(classId.relativeClassName) || this.local != classId.local) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.packageFqName.hashCode() * 31) + this.relativeClassName.hashCode()) * 31) + Boolean.valueOf(this.local).hashCode();
    }

    public String toString() {
        if (!this.packageFqName.isRoot()) {
            return asString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/");
        stringBuilder.append(asString());
        return stringBuilder.toString();
    }
}
