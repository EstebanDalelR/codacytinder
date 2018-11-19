package kotlin.reflect.jvm.internal.impl.name;

import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class FqName {
    public static final FqName ROOT = new FqName("");
    @NotNull
    private final FqNameUnsafe fqName;
    private transient FqName parent;

    public FqName(@NotNull String str) {
        this.fqName = new FqNameUnsafe(str, this);
    }

    public FqName(@NotNull FqNameUnsafe fqNameUnsafe) {
        this.fqName = fqNameUnsafe;
    }

    private FqName(@NotNull FqNameUnsafe fqNameUnsafe, FqName fqName) {
        this.fqName = fqNameUnsafe;
        this.parent = fqName;
    }

    @NotNull
    public String asString() {
        return this.fqName.asString();
    }

    @NotNull
    public FqNameUnsafe toUnsafe() {
        return this.fqName;
    }

    public boolean isRoot() {
        return this.fqName.isRoot();
    }

    @NotNull
    public FqName parent() {
        if (this.parent != null) {
            return this.parent;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        this.parent = new FqName(this.fqName.parent());
        return this.parent;
    }

    @NotNull
    public FqName child(@NotNull Name name) {
        return new FqName(this.fqName.child(name), this);
    }

    @NotNull
    public Name shortName() {
        return this.fqName.shortName();
    }

    @NotNull
    public Name shortNameOrSpecial() {
        return this.fqName.shortNameOrSpecial();
    }

    @NotNull
    public List<Name> pathSegments() {
        return this.fqName.pathSegments();
    }

    public boolean startsWith(@NotNull Name name) {
        return this.fqName.startsWith(name);
    }

    @NotNull
    public static FqName topLevel(@NotNull Name name) {
        return new FqName(FqNameUnsafe.topLevel(name));
    }

    public String toString() {
        return this.fqName.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FqName)) {
            return false;
        }
        return this.fqName.equals(((FqName) obj).fqName) != null;
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }
}
