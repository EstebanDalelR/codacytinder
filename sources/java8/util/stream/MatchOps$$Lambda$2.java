package java8.util.stream;

import java8.util.function.IntPredicate;
import java8.util.function.Supplier;
import java8.util.stream.MatchOps.AnonymousClass2MatchSink;

final /* synthetic */ class MatchOps$$Lambda$2 implements Supplier {
    /* renamed from: a */
    private final MatchKind f54597a;
    /* renamed from: b */
    private final IntPredicate f54598b;

    private MatchOps$$Lambda$2(MatchKind matchKind, IntPredicate intPredicate) {
        this.f54597a = matchKind;
        this.f54598b = intPredicate;
    }

    /* renamed from: a */
    public static Supplier m64023a(MatchKind matchKind, IntPredicate intPredicate) {
        return new MatchOps$$Lambda$2(matchKind, intPredicate);
    }

    public Object get() {
        return new AnonymousClass2MatchSink(this.f54597a, this.f54598b);
    }
}
