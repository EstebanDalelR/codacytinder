package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;

final class RawTypeImpl$render$1 extends Lambda implements Function2<String, String, Boolean> {
    public static final RawTypeImpl$render$1 INSTANCE = new RawTypeImpl$render$1();

    RawTypeImpl$render$1() {
        super(2);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(invoke((String) obj, (String) obj2));
    }

    public final boolean invoke(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "first");
        C2668g.b(str2, "second");
        if (C2668g.a(str, C19298r.m68750a(str2, (CharSequence) "out ")) == null) {
            if (C2668g.a(str2, "*") == null) {
                return null;
            }
        }
        return true;
    }
}
