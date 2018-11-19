package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Map;
import kotlin.C15813i;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

final class ClassMapperLite$map$1$1 extends Lambda implements Function2<String, String, C15813i> {
    final /* synthetic */ Map receiver$0;

    ClassMapperLite$map$1$1(Map map) {
        this.receiver$0 = map;
        super(2);
    }

    public final void invoke(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "kotlinSimpleName");
        C2668g.b(str2, "javaInternalName");
        Map map = this.receiver$0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("kotlin/");
        stringBuilder.append(str);
        str = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append('L');
        stringBuilder.append(str2);
        stringBuilder.append(';');
        map.put(str, stringBuilder.toString());
    }
}
