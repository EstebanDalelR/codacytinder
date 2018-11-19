package java8.util.stream;

import java8.util.function.DoublePredicate;
import java8.util.function.Supplier;
import java8.util.stream.MatchOps.AnonymousClass4MatchSink;

final /* synthetic */ class MatchOps$$Lambda$4 implements Supplier {
    /* renamed from: a */
    private final MatchKind f54601a;
    /* renamed from: b */
    private final DoublePredicate f54602b;

    private MatchOps$$Lambda$4(MatchKind matchKind, DoublePredicate doublePredicate) {
        this.f54601a = matchKind;
        this.f54602b = doublePredicate;
    }

    /* renamed from: a */
    public static Supplier m64025a(MatchKind matchKind, DoublePredicate doublePredicate) {
        return new MatchOps$$Lambda$4(matchKind, doublePredicate);
    }

    public Object get() {
        return new AnonymousClass4MatchSink(this.f54601a, this.f54602b);
    }
}
