package kotlin.reflect.jvm.internal.impl.name;

import org.jetbrains.annotations.NotNull;

public final class Name implements Comparable<Name> {
    @NotNull
    private final String name;
    private final boolean special;

    private Name(@NotNull String str, boolean z) {
        this.name = str;
        this.special = z;
    }

    @NotNull
    public String asString() {
        return this.name;
    }

    @NotNull
    public String getIdentifier() {
        if (!this.special) {
            return asString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("not identifier: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean isSpecial() {
        return this.special;
    }

    public int compareTo(Name name) {
        return this.name.compareTo(name.name);
    }

    @NotNull
    public static Name identifier(@NotNull String str) {
        return new Name(str, false);
    }

    public static boolean isValidIdentifier(@NotNull String str) {
        return (str.isEmpty() || str.startsWith("<") || str.contains(".") || str.contains("/") != null) ? null : true;
    }

    @NotNull
    public static Name special(@NotNull String str) {
        if (str.startsWith("<")) {
            return new Name(str, true);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("special name must start with '<': ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @NotNull
    public static Name guessByFirstCharacter(@NotNull String str) {
        if (str.startsWith("<")) {
            return special(str);
        }
        return identifier(str);
    }

    public String toString() {
        return this.name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return this.special == name.special && this.name.equals(name.name) != null;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.special;
    }
}
