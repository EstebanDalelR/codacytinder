package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

public final class RenderingUtilsKt {
    @NotNull
    public static final String render(@NotNull Name name) {
        C2668g.b(name, "$receiver");
        if (shouldBeEscaped(name)) {
            StringBuilder stringBuilder = new StringBuilder();
            name = name.asString();
            C2668g.a(name, "asString()");
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(String.valueOf('`'));
            stringBuilder2.append(name);
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder.append('`');
            return stringBuilder.toString();
        }
        name = name.asString();
        C2668g.a(name, "asString()");
        return name;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean shouldBeEscaped(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.Name r5) {
        /*
        r0 = r5.isSpecial();
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r5 = r5.asString();
        r0 = kotlin.reflect.jvm.internal.impl.renderer.KeywordStringsGenerated.KEYWORDS;
        r0 = r0.contains(r5);
        r2 = 1;
        if (r0 != 0) goto L_0x003e;
    L_0x0015:
        r0 = "string";
        kotlin.jvm.internal.C2668g.a(r5, r0);
        r5 = (java.lang.CharSequence) r5;
        r0 = 0;
    L_0x001d:
        r3 = r5.length();
        if (r0 >= r3) goto L_0x003b;
    L_0x0023:
        r3 = r5.charAt(r0);
        r4 = java.lang.Character.isLetterOrDigit(r3);
        if (r4 != 0) goto L_0x0033;
    L_0x002d:
        r4 = 95;
        if (r3 == r4) goto L_0x0033;
    L_0x0031:
        r3 = 1;
        goto L_0x0034;
    L_0x0033:
        r3 = 0;
    L_0x0034:
        if (r3 == 0) goto L_0x0038;
    L_0x0036:
        r5 = 1;
        goto L_0x003c;
    L_0x0038:
        r0 = r0 + 1;
        goto L_0x001d;
    L_0x003b:
        r5 = 0;
    L_0x003c:
        if (r5 == 0) goto L_0x003f;
    L_0x003e:
        r1 = 1;
    L_0x003f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.shouldBeEscaped(kotlin.reflect.jvm.internal.impl.name.Name):boolean");
    }

    @NotNull
    public static final String render(@NotNull FqNameUnsafe fqNameUnsafe) {
        C2668g.b(fqNameUnsafe, "$receiver");
        fqNameUnsafe = fqNameUnsafe.pathSegments();
        C2668g.a(fqNameUnsafe, "pathSegments()");
        return renderFqName(fqNameUnsafe);
    }

    @NotNull
    public static final String renderFqName(@NotNull List<Name> list) {
        C2668g.b(list, "pathSegments");
        StringBuilder stringBuilder = new StringBuilder();
        for (Name name : list) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(".");
            }
            stringBuilder.append(render(name));
        }
        list = stringBuilder.toString();
        C2668g.a(list, "StringBuilder().apply(builderAction).toString()");
        return list;
    }
}
