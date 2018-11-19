package java8.util.stream;

import java8.util.function.LongPredicate;
import java8.util.function.Supplier;
import java8.util.stream.MatchOps.AnonymousClass3MatchSink;

final /* synthetic */ class MatchOps$$Lambda$3 implements Supplier {
    /* renamed from: a */
    private final MatchKind f54599a;
    /* renamed from: b */
    private final LongPredicate f54600b;

    private MatchOps$$Lambda$3(MatchKind matchKind, LongPredicate longPredicate) {
        this.f54599a = matchKind;
        this.f54600b = longPredicate;
    }

    /* renamed from: a */
    public static Supplier m64024a(MatchKind matchKind, LongPredicate longPredicate) {
        return new MatchOps$$Lambda$3(matchKind, longPredicate);
    }

    public Object get() {
        return new AnonymousClass3MatchSink(this.f54599a, this.f54600b);
    }
}
