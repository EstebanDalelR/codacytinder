package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C17637f.C19157b;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/text/MatchGroup;", "it", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class MatcherMatchResult$groups$1$iterator$1 extends Lambda implements Function1<Integer, C15876e> {
    /* renamed from: a */
    final /* synthetic */ C19157b f59351a;

    MatcherMatchResult$groups$1$iterator$1(C19157b c19157b) {
        this.f59351a = c19157b;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m68042a(((Number) obj).intValue());
    }

    @Nullable
    /* renamed from: a */
    public final C15876e m68042a(int i) {
        return this.f59351a.get(i);
    }
}
