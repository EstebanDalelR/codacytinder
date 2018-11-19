package java8.util.stream;

import java8.util.Optional;
import java8.util.OptionalDouble;
import java8.util.OptionalInt;
import java8.util.OptionalLong;
import java8.util.Spliterator;
import java8.util.concurrent.CountedCompleter;
import java8.util.function.Predicate;
import java8.util.function.Supplier;

final class FindOps {

    private static final class FindOp<T, O> implements TerminalOp<T, O> {
        /* renamed from: a */
        final int f54561a;
        /* renamed from: b */
        final O f54562b;
        /* renamed from: c */
        final Predicate<O> f54563c;
        /* renamed from: d */
        final Supplier<TerminalSink<T, O>> f54564d;
        /* renamed from: e */
        private final StreamShape f54565e;

        FindOp(boolean z, StreamShape streamShape, O o, Predicate<O> predicate, Supplier<TerminalSink<T, O>> supplier) {
            this.f54561a = (z ? false : StreamOpFlag.NOT_ORDERED) | StreamOpFlag.IS_SHORT_CIRCUIT;
            this.f54565e = streamShape;
            this.f54562b = o;
            this.f54563c = predicate;
            this.f54564d = supplier;
        }

        public int x_() {
            return this.f54561a;
        }

        /* renamed from: a */
        public <S> O mo12988a(PipelineHelper<T> pipelineHelper, Spliterator<S> spliterator) {
            pipelineHelper = ((TerminalSink) pipelineHelper.mo12965a((Sink) this.f54564d.get(), (Spliterator) spliterator)).get();
            return pipelineHelper != null ? pipelineHelper : this.f54562b;
        }

        /* renamed from: b */
        public <P_IN> O mo12989b(PipelineHelper<T> pipelineHelper, Spliterator<P_IN> spliterator) {
            return new FindTask(this, StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c()), pipelineHelper, spliterator).m59285k();
        }
    }

    private static abstract class FindSink<T, O> implements TerminalSink<T, O> {
        /* renamed from: a */
        boolean f59231a;
        /* renamed from: b */
        T f59232b;

        static final class OfDouble extends FindSink<Double, OptionalDouble> implements java8.util.stream.Sink.OfDouble {
            OfDouble() {
            }

            public /* synthetic */ Object get() {
                return m68269c();
            }

            public void accept(double d) {
                accept((Object) Double.valueOf(d));
            }

            /* renamed from: c */
            public OptionalDouble m68269c() {
                return this.a ? OptionalDouble.m59134a(((Double) this.b).doubleValue()) : null;
            }
        }

        static final class OfInt extends FindSink<Integer, OptionalInt> implements java8.util.stream.Sink.OfInt {
            OfInt() {
            }

            public /* synthetic */ Object get() {
                return m68270c();
            }

            public void accept(int i) {
                accept((Object) Integer.valueOf(i));
            }

            /* renamed from: c */
            public OptionalInt m68270c() {
                return this.a ? OptionalInt.m59137a(((Integer) this.b).intValue()) : null;
            }
        }

        static final class OfLong extends FindSink<Long, OptionalLong> implements java8.util.stream.Sink.OfLong {
            OfLong() {
            }

            public /* synthetic */ Object get() {
                return m68271c();
            }

            public void accept(long j) {
                accept((Object) Long.valueOf(j));
            }

            /* renamed from: c */
            public OptionalLong m68271c() {
                return this.a ? OptionalLong.m59140a(((Long) this.b).longValue()) : null;
            }
        }

        static final class OfRef<T> extends FindSink<T, Optional<T>> {
            OfRef() {
            }

            public /* synthetic */ Object get() {
                return m68272c();
            }

            /* renamed from: c */
            public Optional<T> m68272c() {
                return this.a ? Optional.m59120a(this.b) : null;
            }
        }

        /* renamed from: a */
        public void mo13608a(long j) {
        }

        public void z_() {
        }

        FindSink() {
        }

        public void accept(T t) {
            if (!this.f59231a) {
                this.f59231a = true;
                this.f59232b = t;
            }
        }

        /* renamed from: b */
        public boolean mo13612b() {
            return this.f59231a;
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

    private static final class FindTask<P_IN, P_OUT, O> extends AbstractShortCircuitTask<P_IN, P_OUT, O, FindTask<P_IN, P_OUT, O>> {
        /* renamed from: i */
        private final FindOp<P_OUT, O> f59688i;
        /* renamed from: j */
        private final boolean f59689j;

        /* renamed from: a */
        protected /* synthetic */ AbstractTask mo14018a(Spliterator spliterator) {
            return m68276b(spliterator);
        }

        FindTask(FindOp<P_OUT, O> findOp, boolean z, PipelineHelper<P_OUT> pipelineHelper, Spliterator<P_IN> spliterator) {
            super((PipelineHelper) pipelineHelper, (Spliterator) spliterator);
            this.f59689j = z;
            this.f59688i = findOp;
        }

        FindTask(FindTask<P_IN, P_OUT, O> findTask, Spliterator<P_IN> spliterator) {
            super((AbstractShortCircuitTask) findTask, (Spliterator) spliterator);
            this.f59689j = findTask.f59689j;
            this.f59688i = findTask.f59688i;
        }

        /* renamed from: b */
        protected FindTask<P_IN, P_OUT, O> m68276b(Spliterator<P_IN> spliterator) {
            return new FindTask(this, spliterator);
        }

        /* renamed from: o */
        protected O mo13726o() {
            return this.f59688i.f54562b;
        }

        /* renamed from: c */
        private void m68273c(O o) {
            if (m66667x()) {
                m67710a(o);
            } else {
                m67717s();
            }
        }

        /* renamed from: t */
        protected O mo14019t() {
            O o = ((TerminalSink) this.d.mo12965a((Sink) this.f59688i.f54564d.get(), this.e)).get();
            if (!this.f59689j) {
                if (o != null) {
                    m67710a(o);
                }
                return null;
            } else if (o == null) {
                return null;
            } else {
                m68273c(o);
                return o;
            }
        }

        /* renamed from: a */
        public void mo13597a(CountedCompleter<?> countedCompleter) {
            if (this.f59689j) {
                Object p;
                FindTask findTask = (FindTask) this.g;
                FindTask findTask2 = null;
                while (true) {
                    FindTask findTask3 = findTask2;
                    findTask2 = findTask;
                    if (findTask2 == findTask3) {
                        break;
                    }
                    p = findTask2.mo13614p();
                    if (p != null && this.f59688i.f54563c.test(p)) {
                        break;
                    }
                    findTask = (FindTask) this.h;
                }
                mo14009b(p);
                m68273c(p);
            }
            super.mo13597a((CountedCompleter) countedCompleter);
        }
    }

    private FindOps() {
    }

    /* renamed from: a */
    public static <T> TerminalOp<T, Optional<T>> m59562a(boolean z) {
        return new FindOp(z, StreamShape.REFERENCE, Optional.m59119a(), FindOps$$Lambda$1.m63983a(), FindOps$$Lambda$2.m63984a());
    }

    /* renamed from: b */
    public static TerminalOp<Integer, OptionalInt> m59563b(boolean z) {
        return new FindOp(z, StreamShape.INT_VALUE, OptionalInt.m59136a(), FindOps$$Lambda$3.m63985a(), FindOps$$Lambda$4.m63986a());
    }

    /* renamed from: c */
    public static TerminalOp<Long, OptionalLong> m59564c(boolean z) {
        return new FindOp(z, StreamShape.LONG_VALUE, OptionalLong.m59139a(), FindOps$$Lambda$5.m63987a(), FindOps$$Lambda$6.m63988a());
    }

    /* renamed from: d */
    public static TerminalOp<Double, OptionalDouble> m59565d(boolean z) {
        return new FindOp(z, StreamShape.DOUBLE_VALUE, OptionalDouble.m59133a(), FindOps$$Lambda$7.m63989a(), FindOps$$Lambda$8.m63990a());
    }
}
