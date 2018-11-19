package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C18464j;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lkotlin/text/CharCategory;", "invoke"}, k = 3, mv = {1, 1, 10})
final class CharCategory$Companion$categoryMap$2 extends Lambda implements Function0<Map<Integer, ? extends CharCategory>> {
    /* renamed from: a */
    public static final CharCategory$Companion$categoryMap$2 f59349a = new CharCategory$Companion$categoryMap$2();

    CharCategory$Companion$categoryMap$2() {
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m68040a();
    }

    @NotNull
    /* renamed from: a */
    public final Map<Integer, CharCategory> m68040a() {
        CharCategory[] values = CharCategory.values();
        Map<Integer, CharCategory> linkedHashMap = new LinkedHashMap(C18464j.m66926c(ah.m66883a(values.length), 16));
        for (CharCategory charCategory : values) {
            linkedHashMap.put(Integer.valueOf(charCategory.getValue()), charCategory);
        }
        return linkedHashMap;
    }
}
