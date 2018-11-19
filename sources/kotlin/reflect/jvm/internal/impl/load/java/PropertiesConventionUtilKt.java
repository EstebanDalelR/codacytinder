package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.C15819j;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.C19296q;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PropertiesConventionUtilKt {
    @Nullable
    public static final Name propertyNameByGetMethodName(@NotNull Name name) {
        C2668g.b(name, "methodName");
        Name propertyNameFromAccessorMethodName$default = propertyNameFromAccessorMethodName$default(name, "get", false, null, 12, null);
        if (propertyNameFromAccessorMethodName$default != null) {
            return propertyNameFromAccessorMethodName$default;
        }
        return propertyNameFromAccessorMethodName$default(name, "is", false, null, 8, null);
    }

    @Nullable
    public static final Name propertyNameBySetMethodName(@NotNull Name name, boolean z) {
        C2668g.b(name, "methodName");
        return propertyNameFromAccessorMethodName$default(name, "set", false, z ? "is" : false, 4, null);
    }

    @NotNull
    public static final List<Name> propertyNamesBySetMethodName(@NotNull Name name) {
        C2668g.b(name, "methodName");
        return C19299w.m68833h((Iterable) C17554o.m64199b((Object[]) new Name[]{propertyNameBySetMethodName(name, false), propertyNameBySetMethodName(name, true)}));
    }

    static /* synthetic */ Name propertyNameFromAccessorMethodName$default(Name name, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != null) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return propertyNameFromAccessorMethodName(name, str, z, str2);
    }

    private static final Name propertyNameFromAccessorMethodName(Name name, String str, boolean z, String str2) {
        if (name.isSpecial()) {
            return null;
        }
        String identifier = name.getIdentifier();
        C2668g.a(identifier, "identifier");
        if (!C19296q.m68678b(identifier, str, false, 2, null) || identifier.length() == str.length()) {
            return null;
        }
        char charAt = identifier.charAt(str.length());
        if ('a' <= charAt) {
            if ('z' >= charAt) {
                return null;
            }
        }
        if (str2 != null) {
            if (C15819j.f49018a == null || z) {
                name = new StringBuilder();
                name.append(str2);
                name.append(C19298r.m68750a(identifier, (CharSequence) str));
                return Name.identifier(name.toString());
            }
            throw ((Throwable) new AssertionError("Assertion failed"));
        } else if (!z) {
            return name;
        } else {
            name = CapitalizeDecapitalizeKt.decapitalizeSmart(C19298r.m68750a(identifier, (CharSequence) str), true);
            if (Name.isValidIdentifier(name) == null) {
                return null;
            }
            return Name.identifier(name);
        }
    }

    @NotNull
    public static final List<Name> getPropertyNamesCandidatesByAccessorName(@NotNull Name name) {
        C2668g.b(name, "name");
        String asString = name.asString();
        if (JvmAbi.isGetterName(asString)) {
            return C17554o.m64197b((Object) propertyNameByGetMethodName(name));
        }
        if (JvmAbi.isSetterName(asString)) {
            return propertyNamesBySetMethodName(name);
        }
        return BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name);
    }
}
