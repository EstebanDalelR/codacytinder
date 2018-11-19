package kotlin.reflect.jvm.internal.impl.name;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.C19066k;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

public final class FqNameUnsafe {
    private static final Name ROOT_NAME = Name.special("<root>");
    private static final Pattern SPLIT_BY_DOTS = Pattern.compile("\\.");
    private static final Function1<String, Name> STRING_TO_NAME = new C185191();
    @NotNull
    private final String fqName;
    private transient FqNameUnsafe parent;
    private transient FqName safe;
    private transient Name shortName;

    /* renamed from: kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe$1 */
    static class C185191 implements Function1<String, Name> {
        C185191() {
        }

        public Name invoke(String str) {
            return Name.guessByFirstCharacter(str);
        }
    }

    FqNameUnsafe(@NotNull String str, @NotNull FqName fqName) {
        this.fqName = str;
        this.safe = fqName;
    }

    public FqNameUnsafe(@NotNull String str) {
        this.fqName = str;
    }

    private FqNameUnsafe(@NotNull String str, FqNameUnsafe fqNameUnsafe, Name name) {
        this.fqName = str;
        this.parent = fqNameUnsafe;
        this.shortName = name;
    }

    private void compute() {
        int lastIndexOf = this.fqName.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.shortName = Name.guessByFirstCharacter(this.fqName.substring(lastIndexOf + 1));
            this.parent = new FqNameUnsafe(this.fqName.substring(0, lastIndexOf));
            return;
        }
        this.shortName = Name.guessByFirstCharacter(this.fqName);
        this.parent = FqName.ROOT.toUnsafe();
    }

    @NotNull
    public String asString() {
        return this.fqName;
    }

    public boolean isSafe() {
        if (this.safe == null) {
            if (asString().indexOf(60) >= 0) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public FqName toSafe() {
        if (this.safe != null) {
            return this.safe;
        }
        this.safe = new FqName(this);
        return this.safe;
    }

    public boolean isRoot() {
        return this.fqName.isEmpty();
    }

    @NotNull
    public FqNameUnsafe parent() {
        if (this.parent != null) {
            return this.parent;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        compute();
        return this.parent;
    }

    @NotNull
    public FqNameUnsafe child(@NotNull Name name) {
        String asString;
        if (isRoot()) {
            asString = name.asString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.fqName);
            stringBuilder.append(".");
            stringBuilder.append(name.asString());
            asString = stringBuilder.toString();
        }
        return new FqNameUnsafe(asString, this, name);
    }

    @NotNull
    public Name shortName() {
        if (this.shortName != null) {
            return this.shortName;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        compute();
        return this.shortName;
    }

    @NotNull
    public Name shortNameOrSpecial() {
        if (isRoot()) {
            return ROOT_NAME;
        }
        return shortName();
    }

    @NotNull
    public List<Name> pathSegments() {
        return isRoot() ? Collections.emptyList() : C19066k.m67974a((Object[]) SPLIT_BY_DOTS.split(this.fqName), STRING_TO_NAME);
    }

    public boolean startsWith(@NotNull Name name) {
        int indexOf = this.fqName.indexOf(46);
        if (isRoot()) {
            return false;
        }
        String str = this.fqName;
        name = name.asString();
        if (indexOf == -1) {
            indexOf = this.fqName.length();
        }
        return str.regionMatches(0, name, 0, indexOf) != null;
    }

    @NotNull
    public static FqNameUnsafe topLevel(@NotNull Name name) {
        return new FqNameUnsafe(name.asString(), FqName.ROOT.toUnsafe(), name);
    }

    @NotNull
    public String toString() {
        return isRoot() ? ROOT_NAME.asString() : this.fqName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FqNameUnsafe)) {
            return false;
        }
        return this.fqName.equals(((FqNameUnsafe) obj).fqName) != null;
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }
}
