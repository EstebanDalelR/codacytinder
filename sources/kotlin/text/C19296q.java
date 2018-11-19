package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ab;
import kotlin.jvm.internal.C2668g;
import kotlin.sequences.C19155k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0011\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0011\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\b\u001a\u0011\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\b\u001a\u0011\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\b\u001a\u0019\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\b\u001a!\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\b\u001a)\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\b\u001a\u0011\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\b\u001a!\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\b\u001a!\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\b\u001a\n\u0010\u0016\u001a\u00020\u0002*\u00020\u0002\u001a\u0015\u0010\u0017\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0010H\b\u001a\u0015\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0010H\b\u001a\u001d\u0010\u001a\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\b\u001a\u001c\u0010\u001d\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020 \u001a\u0015\u0010!\u001a\u00020 *\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\b\u001a\u0015\u0010!\u001a\u00020 *\u00020\u00022\u0006\u0010\"\u001a\u00020#H\b\u001a\n\u0010$\u001a\u00020\u0002*\u00020\u0002\u001a\u001c\u0010%\u001a\u00020 *\u00020\u00022\u0006\u0010&\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020 \u001a \u0010'\u001a\u00020 *\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001f\u001a\u00020 \u001a2\u0010(\u001a\u00020\u0002*\u00020\u00022\u0006\u0010)\u001a\u00020*2\u0016\u0010+\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010-0,\"\u0004\u0018\u00010-H\b¢\u0006\u0002\u0010.\u001a*\u0010(\u001a\u00020\u0002*\u00020\u00022\u0016\u0010+\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010-0,\"\u0004\u0018\u00010-H\b¢\u0006\u0002\u0010/\u001a:\u0010(\u001a\u00020\u0002*\u00020\u00032\u0006\u0010)\u001a\u00020*2\u0006\u0010(\u001a\u00020\u00022\u0016\u0010+\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010-0,\"\u0004\u0018\u00010-H\b¢\u0006\u0002\u00100\u001a2\u0010(\u001a\u00020\u0002*\u00020\u00032\u0006\u0010(\u001a\u00020\u00022\u0016\u0010+\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010-0,\"\u0004\u0018\u00010-H\b¢\u0006\u0002\u00101\u001a\r\u00102\u001a\u00020\u0002*\u00020\u0002H\b\u001a\n\u00103\u001a\u00020 *\u00020#\u001a\u001d\u00104\u001a\u00020\u0010*\u00020\u00022\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0010H\b\u001a\u001d\u00104\u001a\u00020\u0010*\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u0010H\b\u001a\u001d\u00109\u001a\u00020\u0010*\u00020\u00022\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0010H\b\u001a\u001d\u00109\u001a\u00020\u0010*\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u0010H\b\u001a\u001d\u0010:\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\u0010H\b\u001a4\u0010<\u001a\u00020 *\u00020#2\u0006\u0010=\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010>\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020 \u001a4\u0010<\u001a\u00020 *\u00020\u00022\u0006\u0010=\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020 \u001a\u0012\u0010?\u001a\u00020\u0002*\u00020#2\u0006\u0010@\u001a\u00020\u0010\u001a$\u0010A\u001a\u00020\u0002*\u00020\u00022\u0006\u0010B\u001a\u0002062\u0006\u0010C\u001a\u0002062\b\b\u0002\u0010\u001f\u001a\u00020 \u001a$\u0010A\u001a\u00020\u0002*\u00020\u00022\u0006\u0010D\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020 \u001a$\u0010F\u001a\u00020\u0002*\u00020\u00022\u0006\u0010B\u001a\u0002062\u0006\u0010C\u001a\u0002062\b\b\u0002\u0010\u001f\u001a\u00020 \u001a$\u0010F\u001a\u00020\u0002*\u00020\u00022\u0006\u0010D\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020 \u001a\"\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00020H*\u00020#2\u0006\u0010I\u001a\u00020J2\b\b\u0002\u0010K\u001a\u00020\u0010\u001a\u001c\u0010L\u001a\u00020 *\u00020\u00022\u0006\u0010M\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020 \u001a$\u0010L\u001a\u00020 *\u00020\u00022\u0006\u0010M\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020 \u001a\u0015\u0010O\u001a\u00020\u0002*\u00020\u00022\u0006\u0010N\u001a\u00020\u0010H\b\u001a\u001d\u0010O\u001a\u00020\u0002*\u00020\u00022\u0006\u0010N\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\b\u001a\u0017\u0010P\u001a\u00020\f*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000eH\b\u001a\r\u0010Q\u001a\u00020\u0013*\u00020\u0002H\b\u001a3\u0010Q\u001a\u00020\u0013*\u00020\u00022\u0006\u0010R\u001a\u00020\u00132\b\b\u0002\u0010S\u001a\u00020\u00102\b\b\u0002\u0010N\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u0010H\b\u001a\r\u0010T\u001a\u00020\u0002*\u00020\u0002H\b\u001a\u0015\u0010T\u001a\u00020\u0002*\u00020\u00022\u0006\u0010)\u001a\u00020*H\b\u001a\u0017\u0010U\u001a\u00020J*\u00020\u00022\b\b\u0002\u0010V\u001a\u00020\u0010H\b\u001a\r\u0010W\u001a\u00020\u0002*\u00020\u0002H\b\u001a\u0015\u0010W\u001a\u00020\u0002*\u00020\u00022\u0006\u0010)\u001a\u00020*H\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006X"}, d2 = {"CASE_INSENSITIVE_ORDER", "Ljava/util/Comparator;", "", "Lkotlin/String$Companion;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "String", "stringBuffer", "Ljava/lang/StringBuffer;", "stringBuilder", "Ljava/lang/StringBuilder;", "bytes", "", "charset", "Ljava/nio/charset/Charset;", "offset", "", "length", "chars", "", "codePoints", "", "capitalize", "codePointAt", "index", "codePointBefore", "codePointCount", "beginIndex", "endIndex", "compareTo", "other", "ignoreCase", "", "contentEquals", "charSequence", "", "decapitalize", "endsWith", "suffix", "equals", "format", "locale", "Ljava/util/Locale;", "args", "", "", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "intern", "isBlank", "nativeIndexOf", "ch", "", "fromIndex", "str", "nativeLastIndexOf", "offsetByCodePoints", "codePointOffset", "regionMatches", "thisOffset", "otherOffset", "repeat", "n", "replace", "oldChar", "newChar", "oldValue", "newValue", "replaceFirst", "split", "", "regex", "Ljava/util/regex/Pattern;", "limit", "startsWith", "prefix", "startIndex", "substring", "toByteArray", "toCharArray", "destination", "destinationOffset", "toLowerCase", "toPattern", "flags", "toUpperCase", "kotlin-stdlib"}, k = 5, mv = {1, 1, 10}, xi = 1, xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.q */
class C19296q extends C19292p {
    /* renamed from: a */
    public static final boolean m68675a(@Nullable String str, @Nullable String str2, boolean z) {
        if (str == null) {
            return str2 == null ? true : null;
        }
        if (z) {
            str = str.equalsIgnoreCase(str2);
        } else {
            str = str.equals(str2);
        }
        return str;
    }

    @NotNull
    /* renamed from: a */
    public static final String m68669a(@NotNull String str, char c, char c2, boolean z) {
        String str2 = str;
        C2668g.b(str2, "$receiver");
        if (z) {
            return C19155k.m68019a(C19298r.m68760a((CharSequence) str2, new char[]{c}, z, 0, 4, null), String.valueOf(c2), null, null, 0, null, null, 62, null);
        }
        str2 = str.replace(c, c2);
        C2668g.a(str2, "(this as java.lang.Strin…replace(oldChar, newChar)");
        return str2;
    }

    @NotNull
    /* renamed from: a */
    public static final String m68671a(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        C2668g.b(str4, "$receiver");
        C2668g.b(str5, "oldValue");
        C2668g.b(str6, "newValue");
        return C19155k.m68019a(C19298r.m68764a((CharSequence) str4, new String[]{str5}, z, 0, 4, null), str6, null, null, 0, null, null, 62, null);
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ boolean m68676a(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C19296q.m68675a(str, str2, z);
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ boolean m68678b(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C19296q.m68677b(str, str2, z);
    }

    /* renamed from: b */
    public static final boolean m68677b(@NotNull String str, @NotNull String str2, boolean z) {
        C2668g.b(str, "$receiver");
        C2668g.b(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return C19296q.m68674a(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ boolean m68680c(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C19296q.m68679c(str, str2, z);
    }

    /* renamed from: c */
    public static final boolean m68679c(@NotNull String str, @NotNull String str2, boolean z) {
        C2668g.b(str, "$receiver");
        C2668g.b(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return C19296q.m68674a(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: a */
    public static final boolean m68673a(@NotNull CharSequence charSequence) {
        C2668g.b(charSequence, "$receiver");
        if (charSequence.length() != 0) {
            Iterable c = C19298r.m68790c(charSequence);
            if (!((c instanceof Collection) && ((Collection) c).isEmpty())) {
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    if (!C15875b.m59926a(charSequence.charAt(((ab) it).mo13805b()))) {
                        charSequence = null;
                        break;
                    }
                }
            }
            charSequence = true;
            if (charSequence == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m68674a(@NotNull String str, int i, @NotNull String str2, int i2, int i3, boolean z) {
        C2668g.b(str, "$receiver");
        C2668g.b(str2, "other");
        if (z) {
            return str.regionMatches(z, i, str2, i2, i3);
        }
        return str.regionMatches(i, str2, i2, i3);
    }

    @NotNull
    /* renamed from: d */
    public static final String m68681d(@NotNull String str) {
        C2668g.b(str, "$receiver");
        if ((((CharSequence) str).length() > 0 ? 1 : null) == null || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String substring = str.substring(0, 1);
        C2668g.a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        substring = substring.toUpperCase();
        C2668g.a(substring, "(this as java.lang.String).toUpperCase()");
        stringBuilder.append(substring);
        str = str.substring(1);
        C2668g.a(str, "(this as java.lang.String).substring(startIndex)");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    @NotNull
    /* renamed from: e */
    public static final String m68682e(@NotNull String str) {
        C2668g.b(str, "$receiver");
        if ((((CharSequence) str).length() > 0 ? 1 : null) == null || !Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String substring = str.substring(0, 1);
        C2668g.a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        substring = substring.toLowerCase();
        C2668g.a(substring, "(this as java.lang.String).toLowerCase()");
        stringBuilder.append(substring);
        str = str.substring(1);
        C2668g.a(str, "(this as java.lang.String).substring(startIndex)");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    @NotNull
    /* renamed from: a */
    public static final String m68668a(@NotNull CharSequence charSequence, int i) {
        C2668g.b(charSequence, "$receiver");
        int i2 = 0;
        int i3 = 1;
        if ((i >= 0 ? 1 : null) == null) {
            charSequence = new StringBuilder();
            charSequence.append("Count 'n' must be non-negative, but was ");
            charSequence.append(i);
            charSequence.append(46);
            throw ((Throwable) new IllegalArgumentException(charSequence.toString().toString()));
        }
        switch (i) {
            case 0:
                return "";
            case 1:
                return charSequence.toString();
            default:
                switch (charSequence.length()) {
                    case 0:
                        return "";
                    case 1:
                        charSequence = charSequence.charAt(0);
                        i = new char[i];
                        i3 = i.length;
                        while (i2 < i3) {
                            i[i2] = charSequence;
                            i2++;
                        }
                        return new String(i);
                    default:
                        StringBuilder stringBuilder = new StringBuilder(charSequence.length() * i);
                        if (1 <= i) {
                            while (true) {
                                stringBuilder.append(charSequence);
                                if (i3 != i) {
                                    i3++;
                                }
                            }
                        }
                        charSequence = stringBuilder.toString();
                        C2668g.a(charSequence, "sb.toString()");
                        return charSequence;
                }
        }
    }
}
