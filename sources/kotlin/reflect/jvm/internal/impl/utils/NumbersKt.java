package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;

public final class NumbersKt {
    @NotNull
    public static final NumberWithRadix extractRadix(@NotNull String str) {
        C2668g.b(str, "value");
        if (!C19296q.m68678b(str, "0x", false, 2, null)) {
            if (!C19296q.m68678b(str, "0X", false, 2, null)) {
                if (!C19296q.m68678b(str, "0b", false, 2, null)) {
                    if (!C19296q.m68678b(str, "0B", false, 2, null)) {
                        return new NumberWithRadix(str, 10);
                    }
                }
                str = str.substring(2);
                C2668g.a(str, "(this as java.lang.String).substring(startIndex)");
                return new NumberWithRadix(str, 2);
            }
        }
        str = str.substring(2);
        C2668g.a(str, "(this as java.lang.String).substring(startIndex)");
        return new NumberWithRadix(str, 16);
    }
}
