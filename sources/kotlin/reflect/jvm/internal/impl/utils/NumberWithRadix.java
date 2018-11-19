package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class NumberWithRadix {
    @NotNull
    private final String number;
    private final int radix;

    @NotNull
    public final String component1() {
        return this.number;
    }

    public final int component2() {
        return this.radix;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NumberWithRadix) {
            NumberWithRadix numberWithRadix = (NumberWithRadix) obj;
            if (C2668g.a(this.number, numberWithRadix.number)) {
                if ((this.radix == numberWithRadix.radix ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.number;
        return ((str != null ? str.hashCode() : 0) * 31) + this.radix;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NumberWithRadix(number=");
        stringBuilder.append(this.number);
        stringBuilder.append(", radix=");
        stringBuilder.append(this.radix);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public NumberWithRadix(@NotNull String str, int i) {
        C2668g.b(str, "number");
        this.number = str;
        this.radix = i;
    }
}
