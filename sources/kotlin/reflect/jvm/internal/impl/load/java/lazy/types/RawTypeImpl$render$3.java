package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;

final class RawTypeImpl$render$3 extends Lambda implements Function2<String, String, String> {
    public static final RawTypeImpl$render$3 INSTANCE = new RawTypeImpl$render$3();

    RawTypeImpl$render$3() {
        super(2);
    }

    @NotNull
    public final String invoke(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "$receiver");
        C2668g.b(str2, "newArgs");
        if (!C19298r.m68784b((CharSequence) str, '<', false, 2, null)) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(C19298r.m68749a(str, '<', null, 2, null));
        stringBuilder.append('<');
        stringBuilder.append(str2);
        stringBuilder.append('>');
        stringBuilder.append(C19298r.m68788c(str, '>', null, 2, null));
        return stringBuilder.toString();
    }
}
