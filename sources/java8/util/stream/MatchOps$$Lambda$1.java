package java8.util.stream;

import java8.util.function.Predicate;
import java8.util.function.Supplier;
import java8.util.stream.MatchOps.AnonymousClass1MatchSink;

final /* synthetic */ class MatchOps$$Lambda$1 implements Supplier {
    /* renamed from: a */
    private final MatchKind f54595a;
    /* renamed from: b */
    private final Predicate f54596b;

    private MatchOps$$Lambda$1(MatchKind matchKind, Predicate predicate) {
        this.f54595a = matchKind;
        this.f54596b = predicate;
    }

    /* renamed from: a */
    public static Supplier m64022a(MatchKind matchKind, Predicate predicate) {
        return new MatchOps$$Lambda$1(matchKind, predicate);
    }

    public Object get() {
        return new AnonymousClass1MatchSink(this.f54595a, this.f54596b);
    }
}
