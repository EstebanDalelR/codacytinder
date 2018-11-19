package kotlin.reflect.jvm.internal.impl.name;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FqNamesUtilKt {
    public static final boolean isSubpackageOf(@NotNull FqName fqName, @NotNull FqName fqName2) {
        C2668g.b(fqName, "$receiver");
        C2668g.b(fqName2, "packageName");
        if (C2668g.a(fqName, fqName2)) {
            return true;
        }
        if (fqName2.isRoot()) {
            return true;
        }
        String asString = fqName.asString();
        C2668g.a(asString, "this.asString()");
        String asString2 = fqName2.asString();
        C2668g.a(asString2, "packageName.asString()");
        return isSubpackageOf(asString, asString2);
    }

    private static final boolean isSubpackageOf(String str, String str2) {
        return C19296q.m68678b(str, str2, false, 2, null) && str.charAt(str2.length()) == 46;
    }

    @NotNull
    public static final FqName tail(@NotNull FqName fqName, @NotNull FqName fqName2) {
        C2668g.b(fqName, "$receiver");
        C2668g.b(fqName2, "prefix");
        if (!isSubpackageOf(fqName, fqName2)) {
            return fqName;
        }
        if (fqName2.isRoot()) {
            return fqName;
        }
        if (C2668g.a(fqName, fqName2)) {
            fqName = FqName.ROOT;
            C2668g.a(fqName, "FqName.ROOT");
            return fqName;
        }
        fqName = fqName.asString();
        C2668g.a(fqName, "asString()");
        fqName2 = fqName2.asString().length() + 1;
        if (fqName == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = fqName.substring(fqName2);
        C2668g.a(substring, "(this as java.lang.String).substring(startIndex)");
        return new FqName(substring);
    }

    public static final boolean isValidJavaFqName(@Nullable String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        State state = State.BEGINNING;
        int length = str.length();
        State state2 = state;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            switch (state2) {
                case BEGINNING:
                case AFTER_DOT:
                    if (Character.isJavaIdentifierPart(charAt)) {
                        state2 = State.MIDDLE;
                        break;
                    }
                    return false;
                case MIDDLE:
                    if (charAt != '.') {
                        if (Character.isJavaIdentifierPart(charAt)) {
                            break;
                        }
                        return false;
                    }
                    state2 = State.AFTER_DOT;
                    break;
                default:
                    break;
            }
        }
        if (state2 != State.AFTER_DOT) {
            z = true;
        }
        return z;
    }
}
