package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19158m;
import org.jetbrains.annotations.NotNull;

final class UtilsKt$debugInfo$1$1 extends Lambda implements Function1<String, StringBuilder> {
    final /* synthetic */ StringBuilder receiver$0;

    UtilsKt$debugInfo$1$1(StringBuilder stringBuilder) {
        this.receiver$0 = stringBuilder;
        super(1);
    }

    @NotNull
    public final StringBuilder invoke(@NotNull String str) {
        C2668g.b(str, "$receiver");
        StringBuilder stringBuilder = this.receiver$0;
        stringBuilder.append(str);
        C2668g.a(stringBuilder, "append(value)");
        return C19158m.m68054a(stringBuilder);
    }
}
