package kotlin.reflect.jvm.internal;

import java.util.Arrays;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010&\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "entry", "", "", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: kotlin.reflect.jvm.internal.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1 */
final class C19070xd18867f3 extends Lambda implements Function1<Entry<? extends String, ? extends Object>, String> {
    public static final C19070xd18867f3 INSTANCE = new C19070xd18867f3();

    C19070xd18867f3() {
        super(1);
    }

    @NotNull
    public final String invoke(@NotNull Entry<String, ? extends Object> entry) {
        C2668g.b(entry, "entry");
        String str = (String) entry.getKey();
        entry = entry.getValue();
        if (entry instanceof boolean[]) {
            entry = Arrays.toString((boolean[]) entry);
        } else if (entry instanceof char[]) {
            entry = Arrays.toString((char[]) entry);
        } else if (entry instanceof byte[]) {
            entry = Arrays.toString((byte[]) entry);
        } else if (entry instanceof short[]) {
            entry = Arrays.toString((short[]) entry);
        } else if (entry instanceof int[]) {
            entry = Arrays.toString((int[]) entry);
        } else if (entry instanceof float[]) {
            entry = Arrays.toString((float[]) entry);
        } else if (entry instanceof long[]) {
            entry = Arrays.toString((long[]) entry);
        } else if (entry instanceof double[]) {
            entry = Arrays.toString((double[]) entry);
        } else if (entry instanceof Object[]) {
            entry = Arrays.toString((Object[]) entry);
        } else {
            entry = entry.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(str);
        stringBuilder.append('=');
        stringBuilder.append(entry);
        return stringBuilder.toString();
    }
}
