package kotlin.reflect.jvm.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: kotlin.reflect.jvm.internal.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2 */
final class C19071x4fc4299 extends Lambda implements Function0<String> {
    final /* synthetic */ Class $annotationClass;
    final /* synthetic */ Map $values;

    C19071x4fc4299(Class cls, Map map) {
        this.$annotationClass = cls;
        this.$values = map;
        super(0);
    }

    @NotNull
    public final String invoke() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('@');
        stringBuilder.append(this.$annotationClass.getCanonicalName());
        C19299w.m68794a(this.$values.entrySet(), stringBuilder, ", ", "(", ")", 0, null, C19070xd18867f3.INSTANCE, 48, null);
        String stringBuilder2 = stringBuilder.toString();
        C2668g.a(stringBuilder2, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder2;
    }
}
