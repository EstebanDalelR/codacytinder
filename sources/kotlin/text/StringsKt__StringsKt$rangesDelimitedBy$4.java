package kotlin.text;

import java.util.Collection;
import java.util.List;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "startIndex", "invoke"}, k = 3, mv = {1, 1, 10})
final class StringsKt__StringsKt$rangesDelimitedBy$4 extends Lambda implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
    /* renamed from: a */
    final /* synthetic */ List f59354a;
    /* renamed from: b */
    final /* synthetic */ boolean f59355b;

    StringsKt__StringsKt$rangesDelimitedBy$4(List list, boolean z) {
        this.f59354a = list;
        this.f59355b = z;
        super(2);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m68044a((CharSequence) obj, ((Number) obj2).intValue());
    }

    @Nullable
    /* renamed from: a */
    public final Pair<Integer, Integer> m68044a(@NotNull CharSequence charSequence, int i) {
        C2668g.b(charSequence, "$receiver");
        charSequence = C19298r.m68782b(charSequence, (Collection) this.f59354a, i, this.f59355b, false);
        return charSequence != null ? C15811g.m59834a(charSequence.m59803a(), Integer.valueOf(((String) charSequence.m59804b()).length())) : null;
    }
}
