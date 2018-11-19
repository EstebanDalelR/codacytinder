package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;

public final class CapitalizeDecapitalizeKt {
    @NotNull
    public static final String decapitalizeSmart(@NotNull String str, boolean z) {
        C2668g.b(str, "$receiver");
        CapitalizeDecapitalizeKt$decapitalizeSmart$1 capitalizeDecapitalizeKt$decapitalizeSmart$1 = new CapitalizeDecapitalizeKt$decapitalizeSmart$1(str, z);
        CharSequence charSequence = str;
        if ((charSequence.length() == 0 ? 1 : null) == null) {
            if (capitalizeDecapitalizeKt$decapitalizeSmart$1.invoke(0)) {
                if (str.length() != 1) {
                    if (capitalizeDecapitalizeKt$decapitalizeSmart$1.invoke(1)) {
                        CapitalizeDecapitalizeKt$decapitalizeSmart$2 capitalizeDecapitalizeKt$decapitalizeSmart$2 = new CapitalizeDecapitalizeKt$decapitalizeSmart$2(z);
                        for (Object next : C19298r.m68790c(charSequence)) {
                            if ((capitalizeDecapitalizeKt$decapitalizeSmart$1.invoke(((Number) next).intValue()) ^ 1) != 0) {
                                break;
                            }
                        }
                        Object next2 = null;
                        Integer num = (Integer) next2;
                        if (num == null) {
                            return capitalizeDecapitalizeKt$decapitalizeSmart$2.invoke(str);
                        }
                        z = num.intValue() - true;
                        StringBuilder stringBuilder = new StringBuilder();
                        String substring = str.substring(0, z);
                        C2668g.a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        stringBuilder.append(capitalizeDecapitalizeKt$decapitalizeSmart$2.invoke(substring));
                        str = str.substring(z);
                        C2668g.a(str, "(this as java.lang.String).substring(startIndex)");
                        stringBuilder.append(str);
                        return stringBuilder.toString();
                    }
                }
                return z ? decapitalizeAsciiOnly(str) : C19296q.m68682e(str);
            }
        }
        return str;
    }

    @NotNull
    public static final String capitalizeAsciiOnly(@NotNull String str) {
        C2668g.b(str, "$receiver");
        if ((((CharSequence) str).length() == 0 ? 1 : null) != null) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt) {
            if ('z' >= charAt) {
                charAt = Character.toUpperCase(charAt);
                str = str.substring(1);
                C2668g.a(str, "(this as java.lang.String).substring(startIndex)");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(String.valueOf(charAt));
                stringBuilder.append(str);
                str = stringBuilder.toString();
            }
        }
        return str;
    }

    @NotNull
    public static final String decapitalizeAsciiOnly(@NotNull String str) {
        C2668g.b(str, "$receiver");
        if ((((CharSequence) str).length() == 0 ? 1 : null) != null) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt) {
            if ('Z' >= charAt) {
                charAt = Character.toLowerCase(charAt);
                str = str.substring(1);
                C2668g.a(str, "(this as java.lang.String).substring(startIndex)");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(String.valueOf(charAt));
                stringBuilder.append(str);
                str = stringBuilder.toString();
            }
        }
        return str;
    }

    @NotNull
    public static final String toLowerCaseAsciiOnly(@NotNull String str) {
        C2668g.b(str, "$receiver");
        StringBuilder stringBuilder = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt) {
                if ('Z' >= charAt) {
                    charAt = Character.toLowerCase(charAt);
                }
            }
            stringBuilder.append(charAt);
        }
        str = stringBuilder.toString();
        C2668g.a(str, "builder.toString()");
        return str;
    }
}
