package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

final class RawTypeImpl$render$newArgs$1 extends Lambda implements Function1<String, String> {
    public static final RawTypeImpl$render$newArgs$1 INSTANCE = new RawTypeImpl$render$newArgs$1();

    RawTypeImpl$render$newArgs$1() {
        super(1);
    }

    @NotNull
    public final String invoke(@NotNull String str) {
        C2668g.b(str, "it");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(raw) ");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
