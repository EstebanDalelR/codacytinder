package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C18461c;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/ranges/IntRange;", "invoke"}, k = 3, mv = {1, 1, 10})
final class StringsKt__StringsKt$splitToSequence$1 extends Lambda implements Function1<C18461c, String> {
    /* renamed from: a */
    final /* synthetic */ CharSequence f59356a;

    StringsKt__StringsKt$splitToSequence$1(CharSequence charSequence) {
        this.f59356a = charSequence;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m68045a((C18461c) obj);
    }

    @NotNull
    /* renamed from: a */
    public final String m68045a(@NotNull C18461c c18461c) {
        C2668g.b(c18461c, "it");
        return C19298r.m68747a(this.f59356a, c18461c);
    }
}
