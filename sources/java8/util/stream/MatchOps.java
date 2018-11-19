package java8.util.stream;

import java8.util.Objects;
import java8.util.Spliterator;
import java8.util.function.DoublePredicate;
import java8.util.function.IntPredicate;
import java8.util.function.LongPredicate;
import java8.util.function.Predicate;
import java8.util.function.Supplier;
import java8.util.stream.Sink.OfDouble;
import java8.util.stream.Sink.OfInt;
import java8.util.stream.Sink.OfLong;

final class MatchOps {

    enum MatchKind {
        ANY(true, true),
        ALL(false, false),
        NONE(true, false);
        
        private final boolean shortCircuitResult;
        private final boolean stopOnPredicateMatches;

        private MatchKind(boolean z, boolean z2) {
            this.stopOnPredicateMatches = z;
            this.shortCircuitResult = z2;
        }
    }

    private static final class MatchOp<T> implements TerminalOp<T, Boolean> {
        /* renamed from: a */
        final MatchKind f54603a;
        /* renamed from: b */
        final Supplier<BooleanTerminalSink<T>> f54604b;
        /* renamed from: c */
        private final StreamShape f54605c;

        /* renamed from: a */
        public /* synthetic */ Object mo12988a(PipelineHelper pipelineHelper, Spliterator spliterator) {
            return m64028c(pipelineHelper, spliterator);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo12989b(PipelineHelper pipelineHelper, Spliterator spliterator) {
            return m64029d(pipelineHelper, spliterator);
        }

        MatchOp(StreamShape streamShape, MatchKind matchKind, Supplier<BooleanTerminalSink<T>> supplier) {
            this.f54605c = streamShape;
            this.f54603a = matchKind;
            this.f54604b = supplier;
        }

        public int x_() {
            return StreamOpFlag.IS_SHORT_CIRCUIT | StreamOpFlag.NOT_ORDERED;
        }

        /* renamed from: c */
        public <S> Boolean m64028c(PipelineHelper<T> pipelineHelper, Spliterator<S> spliterator) {
            return Boolean.valueOf(((BooleanTerminalSink) pipelineHelper.mo12965a((Sink) this.f54604b.get(), (Spliterator) spliterator)).m66760c());
        }

        /* renamed from: d */
        public <S> Boolean m64029d(PipelineHelper<T> pipelineHelper, Spliterator<S> spliterator) {
            return (Boolean) new MatchTask(this, pipelineHelper, spliterator).m59285k();
        }
    }

    private static abstract class BooleanTerminalSink<T> implements Sink<T> {
        /* renamed from: c */
        boolean f57676c;
        /* renamed from: d */
        boolean f57677d;

        /* renamed from: a */
        public void mo13608a(long j) {
        }

        public void z_() {
        }

        BooleanTerminalSink(MatchKind matchKind) {
            this.f57677d = matchKind.shortCircuitResult ^ 1;
        }

        /* renamed from: c */
        public boolean m66760c() {
            return this.f57677d;
        }

        /* renamed from: b */
        public boolean mo13612b() {
            return this.f57676c;
        }

        public void accept(int i) {
            SinkDefaults.m59677a((Sink) this, i);
        }

        public void accept(long j) {
            SinkDefaults.m59678a((Sink) this, j);
        }

        public void accept(double d) {
            SinkDefaults.m59676a((Sink) this, d);
        }
    }

    /* renamed from: java8.util.stream.MatchOps$1MatchSink */
    class AnonymousClass1MatchSink extends BooleanTerminalSink<T> {
        /* renamed from: a */
        final /* synthetic */ MatchKind f59234a;
        /* renamed from: b */
        final /* synthetic */ Predicate f59235b;

        AnonymousClass1MatchSink(MatchKind matchKind, Predicate predicate) {
            this.f59234a = matchKind;
            this.f59235b = predicate;
            super(matchKind);
        }

        public void accept(T t) {
            if (!this.c && this.f59235b.test(t) == this.f59234a.stopOnPredicateMatches) {
                this.c = true;
                this.d = this.f59234a.shortCircuitResult;
            }
        }
    }

    /* renamed from: java8.util.stream.MatchOps$2MatchSink */
    class AnonymousClass2MatchSink extends BooleanTerminalSink<Integer> implements OfInt {
        /* renamed from: a */
        final /* synthetic */ MatchKind f59236a;
        /* renamed from: b */
        final /* synthetic */ IntPredicate f59237b;

        AnonymousClass2MatchSink(MatchKind matchKind, IntPredicate intPredicate) {
            this.f59236a = matchKind;
            this.f59237b = intPredicate;
            super(matchKind);
        }

        public void accept(int i) {
            if (!this.c && this.f59237b.test(i) == this.f59236a.stopOnPredicateMatches) {
                this.c = true;
                this.d = this.f59236a.shortCircuitResult;
            }
        }

        public void accept(Integer num) {
            OfInt.m59674a(this, num);
        }
    }

    /* renamed from: java8.util.stream.MatchOps$3MatchSink */
    class AnonymousClass3MatchSink extends BooleanTerminalSink<Long> implements OfLong {
        /* renamed from: a */
        final /* synthetic */ MatchKind f59238a;
        /* renamed from: b */
        final /* synthetic */ LongPredicate f59239b;

        AnonymousClass3MatchSink(MatchKind matchKind, LongPredicate longPredicate) {
            this.f59238a = matchKind;
            this.f59239b = longPredicate;
            super(matchKind);
        }

        public void accept(long j) {
            if (!this.c && this.f59239b.test(j) == this.f59238a.stopOnPredicateMatches) {
                this.c = 1;
                this.d = this.f59238a.shortCircuitResult;
            }
        }

        public void accept(Long l) {
            OfLong.m59675a(this, l);
        }
    }

    /* renamed from: java8.util.stream.MatchOps$4MatchSink */
    class AnonymousClass4MatchSink extends BooleanTerminalSink<Double> implements OfDouble {
        /* renamed from: a */
        final /* synthetic */ MatchKind f59240a;
        /* renamed from: b */
        final /* synthetic */ DoublePredicate f59241b;

        AnonymousClass4MatchSink(MatchKind matchKind, DoublePredicate doublePredicate) {
            this.f59240a = matchKind;
            this.f59241b = doublePredicate;
            super(matchKind);
        }

        public void accept(double d) {
            if (!this.c && this.f59241b.test(d) == this.f59240a.stopOnPredicateMatches) {
                this.c = Double.MIN_VALUE;
                this.d = this.f59240a.shortCircuitResult;
            }
        }

        public void accept(Double d) {
            OfDouble.m59673a(this, d);
        }
    }

    private static final class MatchTask<P_IN, P_OUT> extends AbstractShortCircuitTask<P_IN, P_OUT, Boolean, MatchTask<P_IN, P_OUT>> {
        /* renamed from: i */
        private final MatchOp<P_OUT> f59764i;

        /* renamed from: a */
        protected /* synthetic */ AbstractTask mo14018a(Spliterator spliterator) {
            return m68315b(spliterator);
        }

        /* renamed from: o */
        protected /* synthetic */ Object mo13726o() {
            return m68319z();
        }

        /* renamed from: t */
        protected /* synthetic */ Object mo14019t() {
            return m68318y();
        }

        MatchTask(MatchOp<P_OUT> matchOp, PipelineHelper<P_OUT> pipelineHelper, Spliterator<P_IN> spliterator) {
            super((PipelineHelper) pipelineHelper, (Spliterator) spliterator);
            this.f59764i = matchOp;
        }

        MatchTask(MatchTask<P_IN, P_OUT> matchTask, Spliterator<P_IN> spliterator) {
            super((AbstractShortCircuitTask) matchTask, (Spliterator) spliterator);
            this.f59764i = matchTask.f59764i;
        }

        /* renamed from: b */
        protected MatchTask<P_IN, P_OUT> m68315b(Spliterator<P_IN> spliterator) {
            return new MatchTask(this, spliterator);
        }

        /* renamed from: y */
        protected Boolean m68318y() {
            boolean c = ((BooleanTerminalSink) this.d.mo12965a((Sink) this.f59764i.f54604b.get(), this.e)).m66760c();
            if (c == this.f59764i.f54603a.shortCircuitResult) {
                m67710a(Boolean.valueOf(c));
            }
            return null;
        }

        /* renamed from: z */
        protected Boolean m68319z() {
            return Boolean.valueOf(this.f59764i.f54603a.shortCircuitResult ^ 1);
        }
    }

    private MatchOps() {
    }

    /* renamed from: a */
    public static <T> TerminalOp<T, Boolean> m59577a(Predicate<? super T> predicate, MatchKind matchKind) {
        Objects.m59115b(predicate);
        Objects.m59115b(matchKind);
        return new MatchOp(StreamShape.REFERENCE, matchKind, MatchOps$$Lambda$1.m64022a(matchKind, predicate));
    }

    /* renamed from: a */
    public static TerminalOp<Integer, Boolean> m59575a(IntPredicate intPredicate, MatchKind matchKind) {
        Objects.m59115b(intPredicate);
        Objects.m59115b(matchKind);
        return new MatchOp(StreamShape.INT_VALUE, matchKind, MatchOps$$Lambda$2.m64023a(matchKind, intPredicate));
    }

    /* renamed from: a */
    public static TerminalOp<Long, Boolean> m59576a(LongPredicate longPredicate, MatchKind matchKind) {
        Objects.m59115b(longPredicate);
        Objects.m59115b(matchKind);
        return new MatchOp(StreamShape.LONG_VALUE, matchKind, MatchOps$$Lambda$3.m64024a(matchKind, longPredicate));
    }

    /* renamed from: a */
    public static TerminalOp<Double, Boolean> m59574a(DoublePredicate doublePredicate, MatchKind matchKind) {
        Objects.m59115b(doublePredicate);
        Objects.m59115b(matchKind);
        return new MatchOp(StreamShape.DOUBLE_VALUE, matchKind, MatchOps$$Lambda$4.m64025a(matchKind, doublePredicate));
    }
}
